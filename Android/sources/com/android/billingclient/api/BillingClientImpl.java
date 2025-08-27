package com.android.billingclient.api;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import androidx.work.WorkRequest;
import com.android.billingclient.api.QueryProductDetailsParams;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONException;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

class BillingClientImpl extends BillingClient {
    private boolean zzA;
    private ExecutorService zzB;
    /* access modifiers changed from: private */
    public volatile int zza;
    private final String zzb;
    private final Handler zzc;
    /* access modifiers changed from: private */
    public volatile zzk zzd;
    /* access modifiers changed from: private */
    public Context zze;
    /* access modifiers changed from: private */
    public zzby zzf;
    /* access modifiers changed from: private */
    public volatile e7h zzg;
    private volatile zzay zzh;
    /* access modifiers changed from: private */
    public boolean zzi;
    /* access modifiers changed from: private */
    public boolean zzj;
    /* access modifiers changed from: private */
    public int zzk;
    /* access modifiers changed from: private */
    public boolean zzl;
    /* access modifiers changed from: private */
    public boolean zzm;
    /* access modifiers changed from: private */
    public boolean zzn;
    /* access modifiers changed from: private */
    public boolean zzo;
    /* access modifiers changed from: private */
    public boolean zzp;
    /* access modifiers changed from: private */
    public boolean zzq;
    /* access modifiers changed from: private */
    public boolean zzr;
    /* access modifiers changed from: private */
    public boolean zzs;
    /* access modifiers changed from: private */
    public boolean zzt;
    /* access modifiers changed from: private */
    public boolean zzu;
    /* access modifiers changed from: private */
    public boolean zzv;
    /* access modifiers changed from: private */
    public boolean zzw;
    /* access modifiers changed from: private */
    public boolean zzx;
    /* access modifiers changed from: private */
    public boolean zzy;
    private zzcn zzz;

    private BillingClientImpl(Activity activity, zzcn zzcn, String str) {
        this(activity.getApplicationContext(), zzcn, new zzbq(), str, (String) null, (UserChoiceBillingListener) null, (zzby) null, (ExecutorService) null);
    }

    private void initialize(Context context, PurchasesUpdatedListener purchasesUpdatedListener, zzcn zzcn, AlternativeBillingListener alternativeBillingListener, String str, zzby zzby) {
        this.zze = context.getApplicationContext();
        g4h p = h4h.p();
        p.h();
        h4h.n((h4h) p.b, str);
        String packageName = this.zze.getPackageName();
        p.h();
        h4h.o((h4h) p.b, packageName);
        if (zzby != null) {
            this.zzf = zzby;
        } else {
            this.zzf = new zzcd(this.zze, (h4h) p.a());
        }
        if (purchasesUpdatedListener == null) {
            int i = oyg.a;
        }
        this.zzd = new zzk(this.zze, purchasesUpdatedListener, (zzcg) null, alternativeBillingListener, (UserChoiceBillingListener) null, this.zzf);
        this.zzz = zzcn;
        this.zzA = alternativeBillingListener != null;
        this.zze.getPackageName();
    }

    private int launchBillingFlowCpp(Activity activity, BillingFlowParams billingFlowParams) {
        return launchBillingFlow(activity, billingFlowParams).getResponseCode();
    }

    private void startConnection(long j) {
        zzbq zzbq = new zzbq(j);
        if (isReady()) {
            oyg.e("BillingClient", "Service connection is valid. No need to re-initialize.");
            this.zzf.zzb(zzbx.zzd(6));
            zzbq.onBillingSetupFinished(zzca.zzl);
            return;
        }
        int i = 1;
        if (this.zza == 1) {
            int i2 = oyg.a;
            zzby zzby = this.zzf;
            BillingResult billingResult = zzca.zzd;
            zzby.zza(zzbx.zzb(37, 6, billingResult));
            zzbq.onBillingSetupFinished(billingResult);
        } else if (this.zza == 3) {
            int i3 = oyg.a;
            zzby zzby2 = this.zzf;
            BillingResult billingResult2 = zzca.zzm;
            zzby2.zza(zzbx.zzb(38, 6, billingResult2));
            zzbq.onBillingSetupFinished(billingResult2);
        } else {
            this.zza = 1;
            oyg.e("BillingClient", "Starting in-app billing setup.");
            this.zzh = new zzay(this, zzbq, (zzax) null);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.zze.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                i = 41;
            } else {
                ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                if (serviceInfo != null) {
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    if (!"com.android.vending".equals(str) || str2 == null) {
                        i = 40;
                    } else {
                        ComponentName componentName = new ComponentName(str, str2);
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(componentName);
                        intent2.putExtra("playBillingLibraryVersion", this.zzb);
                        if (this.zze.bindService(intent2, this.zzh, 1)) {
                            oyg.e("BillingClient", "Service was bonded successfully.");
                            return;
                        }
                        i = 39;
                    }
                }
            }
            this.zza = 0;
            oyg.e("BillingClient", "Billing service unavailable on device.");
            zzby zzby3 = this.zzf;
            BillingResult billingResult3 = zzca.zzc;
            zzby3.zza(zzbx.zzb(i, 6, billingResult3));
            zzbq.onBillingSetupFinished(billingResult3);
        }
    }

    public static zzcx zzaf(BillingClientImpl billingClientImpl, String str, int i) {
        Bundle bundle;
        BillingClientImpl billingClientImpl2 = billingClientImpl;
        String str2 = str;
        oyg.e("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z = billingClientImpl2.zzn;
        String str3 = billingClientImpl2.zzb;
        Bundle bundle2 = new Bundle();
        bundle2.putString("playBillingLibraryVersion", str3);
        if (z) {
            bundle2.putBoolean("enablePendingPurchases", true);
        }
        List list = null;
        String str4 = null;
        while (true) {
            int i2 = 9;
            try {
                int i3 = 0;
                if (billingClientImpl2.zzn) {
                    e7h e7h = billingClientImpl2.zzg;
                    int i4 = true != billingClientImpl2.zzv ? 9 : 19;
                    String packageName = billingClientImpl2.zze.getPackageName();
                    r6h r6h = (r6h) e7h;
                    Parcel I0 = r6h.I0();
                    I0.writeInt(i4);
                    I0.writeString(packageName);
                    I0.writeString(str2);
                    I0.writeString(str4);
                    int i5 = v7h.a;
                    I0.writeInt(1);
                    bundle2.writeToParcel(I0, 0);
                    Parcel J0 = r6h.J0(I0, 11);
                    bundle = (Bundle) v7h.a(J0, Bundle.CREATOR);
                    J0.recycle();
                } else {
                    e7h e7h2 = billingClientImpl2.zzg;
                    String packageName2 = billingClientImpl2.zze.getPackageName();
                    r6h r6h2 = (r6h) e7h2;
                    Parcel I02 = r6h2.I0();
                    I02.writeInt(3);
                    I02.writeString(packageName2);
                    I02.writeString(str2);
                    I02.writeString(str4);
                    Parcel J02 = r6h2.J0(I02, 4);
                    bundle = (Bundle) v7h.a(J02, Bundle.CREATOR);
                    J02.recycle();
                }
                zzcy zza2 = zzcz.zza(bundle, "BillingClient", "getPurchase()");
                BillingResult zza3 = zza2.zza();
                if (zza3 != zzca.zzl) {
                    billingClientImpl2.zzf.zza(zzbx.zzb(zza2.zzb(), 9, zza3));
                    return new zzcx(zza3, list);
                }
                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z2 = false;
                while (i3 < stringArrayList2.size()) {
                    String str5 = stringArrayList2.get(i3);
                    String str6 = stringArrayList3.get(i3);
                    oyg.e("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i3))));
                    try {
                        Purchase purchase = new Purchase(str5, str6);
                        if (TextUtils.isEmpty(purchase.getPurchaseToken())) {
                            z2 = true;
                        }
                        arrayList.add(purchase);
                        i3++;
                        i2 = 9;
                    } catch (JSONException unused) {
                        int i6 = oyg.a;
                        zzby zzby = billingClientImpl2.zzf;
                        BillingResult billingResult = zzca.zzj;
                        zzby.zza(zzbx.zzb(51, 9, billingResult));
                        return new zzcx(billingResult, (List) null);
                    }
                }
                int i7 = i2;
                if (z2) {
                    billingClientImpl2.zzf.zza(zzbx.zzb(26, i7, zzca.zzj));
                }
                str4 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                oyg.e("BillingClient", "Continuation token: ".concat(String.valueOf(str4)));
                if (TextUtils.isEmpty(str4)) {
                    return new zzcx(zzca.zzl, arrayList);
                }
                list = null;
            } catch (Exception unused2) {
                zzby zzby2 = billingClientImpl2.zzf;
                BillingResult billingResult2 = zzca.zzm;
                zzby2.zza(zzbx.zzb(52, 9, billingResult2));
                int i8 = oyg.a;
                return new zzcx(billingResult2, (List) null);
            }
        }
    }

    /* access modifiers changed from: private */
    public final Handler zzag() {
        return Looper.myLooper() == null ? this.zzc : new Handler(Looper.myLooper());
    }

    private final BillingResult zzah(BillingResult billingResult) {
        if (Thread.interrupted()) {
            return billingResult;
        }
        this.zzc.post(new zzm(this, billingResult));
        return billingResult;
    }

    /* access modifiers changed from: private */
    public final BillingResult zzai() {
        return (this.zza == 0 || this.zza == 3) ? zzca.zzm : zzca.zzj;
    }

    @SuppressLint({"PrivateApi"})
    private static String zzaj() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get((Object) null);
        } catch (Exception unused) {
            return "6.2.1";
        }
    }

    /* access modifiers changed from: private */
    public final Future zzak(Callable callable, long j, Runnable runnable, Handler handler) {
        if (this.zzB == null) {
            this.zzB = Executors.newFixedThreadPool(oyg.a, new zzap(this));
        }
        try {
            Future submit = this.zzB.submit(callable);
            handler.postDelayed(new zzu(submit, runnable), (long) (((double) j) * 0.95d));
            return submit;
        } catch (Exception unused) {
            int i = oyg.a;
            return null;
        }
    }

    private final void zzal(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        if (!isReady()) {
            zzby zzby = this.zzf;
            BillingResult billingResult = zzca.zzm;
            zzby.zza(zzbx.zzb(2, 11, billingResult));
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(billingResult, (List<PurchaseHistoryRecord>) null);
            return;
        }
        if (zzak(new zzar(this, str, purchaseHistoryResponseListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzai(this, purchaseHistoryResponseListener), zzag()) == null) {
            BillingResult zzai = zzai();
            this.zzf.zza(zzbx.zzb(25, 11, zzai));
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(zzai, (List<PurchaseHistoryRecord>) null);
        }
    }

    private final void zzam(String str, PurchasesResponseListener purchasesResponseListener) {
        if (!isReady()) {
            zzby zzby = this.zzf;
            BillingResult billingResult = zzca.zzm;
            zzby.zza(zzbx.zzb(2, 9, billingResult));
            nxg nxg = rxg.b;
            purchasesResponseListener.onQueryPurchasesResponse(billingResult, ayg.v);
        } else if (TextUtils.isEmpty(str)) {
            int i = oyg.a;
            zzby zzby2 = this.zzf;
            BillingResult billingResult2 = zzca.zzg;
            zzby2.zza(zzbx.zzb(50, 9, billingResult2));
            nxg nxg2 = rxg.b;
            purchasesResponseListener.onQueryPurchasesResponse(billingResult2, ayg.v);
        } else {
            if (zzak(new zzaq(this, str, purchasesResponseListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzaa(this, purchasesResponseListener), zzag()) == null) {
                BillingResult zzai = zzai();
                this.zzf.zza(zzbx.zzb(25, 9, zzai));
                nxg nxg3 = rxg.b;
                purchasesResponseListener.onQueryPurchasesResponse(zzai, ayg.v);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: w3h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: t3h} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzan(com.android.billingclient.api.BillingResult r7, int r8, int r9) {
        /*
            r6 = this;
            int r0 = r7.getResponseCode()
            r1 = 0
            r2 = 5
            if (r0 == 0) goto L_0x0080
            com.android.billingclient.api.zzby r6 = r6.zzf
            int r0 = com.android.billingclient.api.zzbx.zza
            s3h r0 = defpackage.t3h.r()     // Catch:{ Exception -> 0x007a }
            x3h r3 = defpackage.y3h.r()     // Catch:{ Exception -> 0x007a }
            int r4 = r7.getResponseCode()     // Catch:{ Exception -> 0x007a }
            r3.h()     // Catch:{ Exception -> 0x007a }
            p0h r5 = r3.b     // Catch:{ Exception -> 0x007a }
            y3h r5 = (defpackage.y3h) r5     // Catch:{ Exception -> 0x007a }
            defpackage.y3h.n(r5, r4)     // Catch:{ Exception -> 0x007a }
            java.lang.String r7 = r7.getDebugMessage()     // Catch:{ Exception -> 0x007a }
            r3.h()     // Catch:{ Exception -> 0x007a }
            p0h r4 = r3.b     // Catch:{ Exception -> 0x007a }
            y3h r4 = (defpackage.y3h) r4     // Catch:{ Exception -> 0x007a }
            defpackage.y3h.o(r4, r7)     // Catch:{ Exception -> 0x007a }
            r3.h()     // Catch:{ Exception -> 0x007a }
            p0h r7 = r3.b     // Catch:{ Exception -> 0x007a }
            y3h r7 = (defpackage.y3h) r7     // Catch:{ Exception -> 0x007a }
            defpackage.y3h.q(r7, r8)     // Catch:{ Exception -> 0x007a }
            r0.h()     // Catch:{ Exception -> 0x007a }
            p0h r7 = r0.b     // Catch:{ Exception -> 0x007a }
            t3h r7 = (defpackage.t3h) r7     // Catch:{ Exception -> 0x007a }
            p0h r8 = r3.a()     // Catch:{ Exception -> 0x007a }
            y3h r8 = (defpackage.y3h) r8     // Catch:{ Exception -> 0x007a }
            defpackage.t3h.o(r7, r8)     // Catch:{ Exception -> 0x007a }
            r0.h()     // Catch:{ Exception -> 0x007a }
            p0h r7 = r0.b     // Catch:{ Exception -> 0x007a }
            t3h r7 = (defpackage.t3h) r7     // Catch:{ Exception -> 0x007a }
            defpackage.t3h.q(r7, r2)     // Catch:{ Exception -> 0x007a }
            k4h r7 = defpackage.l4h.o()     // Catch:{ Exception -> 0x007a }
            r7.h()     // Catch:{ Exception -> 0x007a }
            p0h r8 = r7.b     // Catch:{ Exception -> 0x007a }
            l4h r8 = (defpackage.l4h) r8     // Catch:{ Exception -> 0x007a }
            defpackage.l4h.n(r8, r9)     // Catch:{ Exception -> 0x007a }
            p0h r7 = r7.a()     // Catch:{ Exception -> 0x007a }
            l4h r7 = (defpackage.l4h) r7     // Catch:{ Exception -> 0x007a }
            r0.h()     // Catch:{ Exception -> 0x007a }
            p0h r8 = r0.b     // Catch:{ Exception -> 0x007a }
            t3h r8 = (defpackage.t3h) r8     // Catch:{ Exception -> 0x007a }
            defpackage.t3h.p(r8, r7)     // Catch:{ Exception -> 0x007a }
            p0h r7 = r0.a()     // Catch:{ Exception -> 0x007a }
            t3h r7 = (defpackage.t3h) r7     // Catch:{ Exception -> 0x007a }
            r1 = r7
            goto L_0x007c
        L_0x007a:
            int r7 = defpackage.oyg.a
        L_0x007c:
            r6.zza(r1)
            return
        L_0x0080:
            com.android.billingclient.api.zzby r6 = r6.zzf
            int r7 = com.android.billingclient.api.zzbx.zza
            v3h r7 = defpackage.w3h.p()     // Catch:{ Exception -> 0x00b8 }
            r7.h()     // Catch:{ Exception -> 0x00b8 }
            p0h r8 = r7.b     // Catch:{ Exception -> 0x00b8 }
            w3h r8 = (defpackage.w3h) r8     // Catch:{ Exception -> 0x00b8 }
            defpackage.w3h.o(r8, r2)     // Catch:{ Exception -> 0x00b8 }
            k4h r8 = defpackage.l4h.o()     // Catch:{ Exception -> 0x00b8 }
            r8.h()     // Catch:{ Exception -> 0x00b8 }
            p0h r0 = r8.b     // Catch:{ Exception -> 0x00b8 }
            l4h r0 = (defpackage.l4h) r0     // Catch:{ Exception -> 0x00b8 }
            defpackage.l4h.n(r0, r9)     // Catch:{ Exception -> 0x00b8 }
            p0h r8 = r8.a()     // Catch:{ Exception -> 0x00b8 }
            l4h r8 = (defpackage.l4h) r8     // Catch:{ Exception -> 0x00b8 }
            r7.h()     // Catch:{ Exception -> 0x00b8 }
            p0h r9 = r7.b     // Catch:{ Exception -> 0x00b8 }
            w3h r9 = (defpackage.w3h) r9     // Catch:{ Exception -> 0x00b8 }
            defpackage.w3h.n(r9, r8)     // Catch:{ Exception -> 0x00b8 }
            p0h r7 = r7.a()     // Catch:{ Exception -> 0x00b8 }
            w3h r7 = (defpackage.w3h) r7     // Catch:{ Exception -> 0x00b8 }
            r1 = r7
            goto L_0x00ba
        L_0x00b8:
            int r7 = defpackage.oyg.a
        L_0x00ba:
            r6.zzb(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.BillingClientImpl.zzan(com.android.billingclient.api.BillingResult, int, int):void");
    }

    public static zzbp zzg(BillingClientImpl billingClientImpl, String str) {
        BillingClientImpl billingClientImpl2 = billingClientImpl;
        oyg.e("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z = billingClientImpl2.zzn;
        String str2 = billingClientImpl2.zzb;
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str2);
        if (z) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        List list = null;
        String str3 = null;
        while (billingClientImpl2.zzl) {
            int i = 11;
            try {
                e7h e7h = billingClientImpl2.zzg;
                String packageName = billingClientImpl2.zze.getPackageName();
                r6h r6h = (r6h) e7h;
                Parcel I0 = r6h.I0();
                I0.writeInt(6);
                I0.writeString(packageName);
                I0.writeString(str);
                I0.writeString(str3);
                int i2 = v7h.a;
                I0.writeInt(1);
                int i3 = 0;
                bundle.writeToParcel(I0, 0);
                Parcel J0 = r6h.J0(I0, 9);
                Bundle bundle2 = (Bundle) v7h.a(J0, Bundle.CREATOR);
                J0.recycle();
                zzcy zza2 = zzcz.zza(bundle2, "BillingClient", "getPurchaseHistory()");
                BillingResult zza3 = zza2.zza();
                if (zza3 != zzca.zzl) {
                    billingClientImpl2.zzf.zza(zzbx.zzb(zza2.zzb(), 11, zza3));
                    return new zzbp(zza3, list);
                }
                ArrayList<String> stringArrayList = bundle2.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundle2.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z2 = false;
                while (i3 < stringArrayList2.size()) {
                    String str4 = stringArrayList2.get(i3);
                    String str5 = stringArrayList3.get(i3);
                    oyg.e("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i3))));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str4, str5);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.getPurchaseToken())) {
                            z2 = true;
                        }
                        arrayList.add(purchaseHistoryRecord);
                        i3++;
                        i = 11;
                    } catch (JSONException unused) {
                        int i4 = oyg.a;
                        zzby zzby = billingClientImpl2.zzf;
                        BillingResult billingResult = zzca.zzj;
                        zzby.zza(zzbx.zzb(51, 11, billingResult));
                        return new zzbp(billingResult, (List) null);
                    }
                }
                int i5 = i;
                if (z2) {
                    billingClientImpl2.zzf.zza(zzbx.zzb(26, i5, zzca.zzj));
                }
                str3 = bundle2.getString("INAPP_CONTINUATION_TOKEN");
                oyg.e("BillingClient", "Continuation token: ".concat(String.valueOf(str3)));
                if (TextUtils.isEmpty(str3)) {
                    return new zzbp(zzca.zzl, arrayList);
                }
                list = null;
            } catch (RemoteException unused2) {
                int i6 = oyg.a;
                zzby zzby2 = billingClientImpl2.zzf;
                BillingResult billingResult2 = zzca.zzm;
                zzby2.zza(zzbx.zzb(59, 11, billingResult2));
                return new zzbp(billingResult2, (List) null);
            }
        }
        int i7 = oyg.a;
        return new zzbp(zzca.zzq, list);
    }

    public final void acknowledgePurchase(AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        if (!isReady()) {
            zzby zzby = this.zzf;
            BillingResult billingResult = zzca.zzm;
            zzby.zza(zzbx.zzb(2, 3, billingResult));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
        } else if (TextUtils.isEmpty(acknowledgePurchaseParams.getPurchaseToken())) {
            int i = oyg.a;
            zzby zzby2 = this.zzf;
            BillingResult billingResult2 = zzca.zzi;
            zzby2.zza(zzbx.zzb(26, 3, billingResult2));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult2);
        } else if (!this.zzn) {
            zzby zzby3 = this.zzf;
            BillingResult billingResult3 = zzca.zzb;
            zzby3.zza(zzbx.zzb(27, 3, billingResult3));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult3);
        } else {
            if (zzak(new zzq(this, acknowledgePurchaseParams, acknowledgePurchaseResponseListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzr(this, acknowledgePurchaseResponseListener), zzag()) == null) {
                BillingResult zzai = zzai();
                this.zzf.zza(zzbx.zzb(25, 3, zzai));
                acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzai);
            }
        }
    }

    public final void consumeAsync(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) {
        if (!isReady()) {
            zzby zzby = this.zzf;
            BillingResult billingResult = zzca.zzm;
            zzby.zza(zzbx.zzb(2, 4, billingResult));
            consumeResponseListener.onConsumeResponse(billingResult, consumeParams.getPurchaseToken());
            return;
        }
        if (zzak(new zzad(this, consumeParams, consumeResponseListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzae(this, consumeResponseListener, consumeParams), zzag()) == null) {
            BillingResult zzai = zzai();
            this.zzf.zza(zzbx.zzb(25, 4, zzai));
            consumeResponseListener.onConsumeResponse(zzai, consumeParams.getPurchaseToken());
        }
    }

    @zze
    public void createAlternativeBillingOnlyReportingDetailsAsync(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        if (!isReady()) {
            zzby zzby = this.zzf;
            BillingResult billingResult = zzca.zzm;
            zzby.zza(zzbx.zzb(2, 15, billingResult));
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, (AlternativeBillingOnlyReportingDetails) null);
        } else if (!this.zzx) {
            int i = oyg.a;
            zzby zzby2 = this.zzf;
            BillingResult billingResult2 = zzca.zzE;
            zzby2.zza(zzbx.zzb(66, 15, billingResult2));
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult2, (AlternativeBillingOnlyReportingDetails) null);
        } else {
            if (zzak(new zzv(this, alternativeBillingOnlyReportingDetailsListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzw(this, alternativeBillingOnlyReportingDetailsListener), zzag()) == null) {
                BillingResult zzai = zzai();
                this.zzf.zza(zzbx.zzb(25, 15, zzai));
                alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(zzai, (AlternativeBillingOnlyReportingDetails) null);
            }
        }
    }

    @zzf
    public void createExternalOfferReportingDetailsAsync(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        if (!isReady()) {
            zzby zzby = this.zzf;
            BillingResult billingResult = zzca.zzm;
            zzby.zza(zzbx.zzb(2, 24, billingResult));
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult, (ExternalOfferReportingDetails) null);
        } else if (!this.zzy) {
            int i = oyg.a;
            zzby zzby2 = this.zzf;
            BillingResult billingResult2 = zzca.zzy;
            zzby2.zza(zzbx.zzb(103, 24, billingResult2));
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult2, (ExternalOfferReportingDetails) null);
        } else {
            if (zzak(new zzx(this, externalOfferReportingDetailsListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzag(this, externalOfferReportingDetailsListener), zzag()) == null) {
                BillingResult zzai = zzai();
                this.zzf.zza(zzbx.zzb(25, 24, zzai));
                externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(zzai, (ExternalOfferReportingDetails) null);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1 = defpackage.oyg.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        r4.zza = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0046 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void endConnection() {
        /*
            r4 = this;
            com.android.billingclient.api.zzby r0 = r4.zzf
            r1 = 12
            w3h r1 = com.android.billingclient.api.zzbx.zzd(r1)
            r0.zzb(r1)
            r0 = 3
            com.android.billingclient.api.zzk r1 = r4.zzd     // Catch:{ Exception -> 0x0046 }
            if (r1 == 0) goto L_0x0018
            com.android.billingclient.api.zzk r1 = r4.zzd     // Catch:{ Exception -> 0x0046 }
            r1.zzf()     // Catch:{ Exception -> 0x0046 }
            goto L_0x0018
        L_0x0016:
            r1 = move-exception
            goto L_0x004b
        L_0x0018:
            com.android.billingclient.api.zzay r1 = r4.zzh     // Catch:{ Exception -> 0x0046 }
            if (r1 == 0) goto L_0x0021
            com.android.billingclient.api.zzay r1 = r4.zzh     // Catch:{ Exception -> 0x0046 }
            r1.zzc()     // Catch:{ Exception -> 0x0046 }
        L_0x0021:
            com.android.billingclient.api.zzay r1 = r4.zzh     // Catch:{ Exception -> 0x0046 }
            r2 = 0
            if (r1 == 0) goto L_0x003a
            e7h r1 = r4.zzg     // Catch:{ Exception -> 0x0046 }
            if (r1 == 0) goto L_0x003a
            java.lang.String r1 = "BillingClient"
            java.lang.String r3 = "Unbinding from service."
            defpackage.oyg.e(r1, r3)     // Catch:{ Exception -> 0x0046 }
            android.content.Context r1 = r4.zze     // Catch:{ Exception -> 0x0046 }
            com.android.billingclient.api.zzay r3 = r4.zzh     // Catch:{ Exception -> 0x0046 }
            r1.unbindService(r3)     // Catch:{ Exception -> 0x0046 }
            r4.zzh = r2     // Catch:{ Exception -> 0x0046 }
        L_0x003a:
            r4.zzg = r2     // Catch:{ Exception -> 0x0046 }
            java.util.concurrent.ExecutorService r1 = r4.zzB     // Catch:{ Exception -> 0x0046 }
            if (r1 == 0) goto L_0x0048
            r1.shutdownNow()     // Catch:{ Exception -> 0x0046 }
            r4.zzB = r2     // Catch:{ Exception -> 0x0046 }
            goto L_0x0048
        L_0x0046:
            int r1 = defpackage.oyg.a     // Catch:{ all -> 0x0016 }
        L_0x0048:
            r4.zza = r0
            return
        L_0x004b:
            r4.zza = r0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.BillingClientImpl.endConnection():void");
    }

    @zzg
    public void getBillingConfigAsync(GetBillingConfigParams getBillingConfigParams, BillingConfigResponseListener billingConfigResponseListener) {
        if (!isReady()) {
            int i = oyg.a;
            zzby zzby = this.zzf;
            BillingResult billingResult = zzca.zzm;
            zzby.zza(zzbx.zzb(2, 13, billingResult));
            billingConfigResponseListener.onBillingConfigResponse(billingResult, (BillingConfig) null);
        } else if (!this.zzu) {
            int i2 = oyg.a;
            zzby zzby2 = this.zzf;
            BillingResult billingResult2 = zzca.zzA;
            zzby2.zza(zzbx.zzb(32, 13, billingResult2));
            billingConfigResponseListener.onBillingConfigResponse(billingResult2, (BillingConfig) null);
        } else {
            String str = this.zzb;
            Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", str);
            if (zzak(new zzs(this, bundle, billingConfigResponseListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzt(this, billingConfigResponseListener), zzag()) == null) {
                BillingResult zzai = zzai();
                this.zzf.zza(zzbx.zzb(25, 13, zzai));
                billingConfigResponseListener.onBillingConfigResponse(zzai, (BillingConfig) null);
            }
        }
    }

    public final int getConnectionState() {
        return this.zza;
    }

    @zze
    public void isAlternativeBillingOnlyAvailableAsync(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        if (!isReady()) {
            zzby zzby = this.zzf;
            BillingResult billingResult = zzca.zzm;
            zzby.zza(zzbx.zzb(2, 14, billingResult));
            alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
        } else if (!this.zzx) {
            int i = oyg.a;
            zzby zzby2 = this.zzf;
            BillingResult billingResult2 = zzca.zzE;
            zzby2.zza(zzbx.zzb(66, 14, billingResult2));
            alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult2);
        } else {
            if (zzak(new zzab(this, alternativeBillingOnlyAvailabilityListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzac(this, alternativeBillingOnlyAvailabilityListener), zzag()) == null) {
                BillingResult zzai = zzai();
                this.zzf.zza(zzbx.zzb(25, 14, zzai));
                alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(zzai);
            }
        }
    }

    @zzf
    public void isExternalOfferAvailableAsync(ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        if (!isReady()) {
            zzby zzby = this.zzf;
            BillingResult billingResult = zzca.zzm;
            zzby.zza(zzbx.zzb(2, 23, billingResult));
            externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult);
        } else if (!this.zzy) {
            int i = oyg.a;
            zzby zzby2 = this.zzf;
            BillingResult billingResult2 = zzca.zzy;
            zzby2.zza(zzbx.zzb(103, 23, billingResult2));
            externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult2);
        } else {
            if (zzak(new zzam(this, externalOfferAvailabilityListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzan(this, externalOfferAvailabilityListener), zzag()) == null) {
                BillingResult zzai = zzai();
                this.zzf.zza(zzbx.zzb(25, 23, zzai));
                externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(zzai);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.android.billingclient.api.BillingResult isFeatureSupported(java.lang.String r15) {
        /*
            r14 = this;
            boolean r0 = r14.isReady()
            r1 = 2
            r2 = 5
            if (r0 != 0) goto L_0x0024
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzca.zzm
            int r0 = r15.getResponseCode()
            if (r0 == 0) goto L_0x001a
            com.android.billingclient.api.zzby r14 = r14.zzf
            t3h r0 = com.android.billingclient.api.zzbx.zzb(r1, r2, r15)
            r14.zza(r0)
            goto L_0x0023
        L_0x001a:
            com.android.billingclient.api.zzby r14 = r14.zzf
            w3h r0 = com.android.billingclient.api.zzbx.zzd(r2)
            r14.zzb(r0)
        L_0x0023:
            return r15
        L_0x0024:
            int r0 = com.android.billingclient.api.zzca.zzG
            int r0 = r15.hashCode()
            r3 = 1
            r4 = 4
            r5 = 3
            r6 = 6
            r7 = 7
            r8 = 8
            r9 = 11
            r10 = 12
            r11 = 13
            r12 = 9
            r13 = 10
            switch(r0) {
                case -422092961: goto L_0x00c7;
                case 96321: goto L_0x00bd;
                case 97314: goto L_0x00b3;
                case 98307: goto L_0x00a9;
                case 99300: goto L_0x009f;
                case 100293: goto L_0x0095;
                case 101286: goto L_0x008b;
                case 102279: goto L_0x0081;
                case 103272: goto L_0x0077;
                case 104265: goto L_0x006c;
                case 105258: goto L_0x0061;
                case 106251: goto L_0x0056;
                case 207616302: goto L_0x004b;
                case 1987365622: goto L_0x0040;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x00d1
        L_0x0040:
            java.lang.String r0 = "subscriptions"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00d1
            r0 = 0
            goto L_0x00d2
        L_0x004b:
            java.lang.String r0 = "priceChangeConfirmation"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00d1
            r0 = r1
            goto L_0x00d2
        L_0x0056:
            java.lang.String r0 = "kkk"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00d1
            r0 = r11
            goto L_0x00d2
        L_0x0061:
            java.lang.String r0 = "jjj"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00d1
            r0 = r10
            goto L_0x00d2
        L_0x006c:
            java.lang.String r0 = "iii"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00d1
            r0 = r9
            goto L_0x00d2
        L_0x0077:
            java.lang.String r0 = "hhh"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00d1
            r0 = r13
            goto L_0x00d2
        L_0x0081:
            java.lang.String r0 = "ggg"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00d1
            r0 = r12
            goto L_0x00d2
        L_0x008b:
            java.lang.String r0 = "fff"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00d1
            r0 = r8
            goto L_0x00d2
        L_0x0095:
            java.lang.String r0 = "eee"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00d1
            r0 = r7
            goto L_0x00d2
        L_0x009f:
            java.lang.String r0 = "ddd"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00d1
            r0 = r2
            goto L_0x00d2
        L_0x00a9:
            java.lang.String r0 = "ccc"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00d1
            r0 = r6
            goto L_0x00d2
        L_0x00b3:
            java.lang.String r0 = "bbb"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00d1
            r0 = r5
            goto L_0x00d2
        L_0x00bd:
            java.lang.String r0 = "aaa"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00d1
            r0 = r4
            goto L_0x00d2
        L_0x00c7:
            java.lang.String r0 = "subscriptionsUpdate"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00d1
            r0 = r3
            goto L_0x00d2
        L_0x00d1:
            r0 = -1
        L_0x00d2:
            switch(r0) {
                case 0: goto L_0x01a9;
                case 1: goto L_0x019c;
                case 2: goto L_0x018d;
                case 3: goto L_0x017e;
                case 4: goto L_0x016f;
                case 5: goto L_0x0160;
                case 6: goto L_0x0151;
                case 7: goto L_0x0142;
                case 8: goto L_0x0133;
                case 9: goto L_0x0124;
                case 10: goto L_0x0115;
                case 11: goto L_0x0106;
                case 12: goto L_0x00f5;
                case 13: goto L_0x00e4;
                default: goto L_0x00d5;
            }
        L_0x00d5:
            java.lang.String r0 = "Unsupported feature: "
            r0.concat(r15)
            int r15 = defpackage.oyg.a
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzca.zzz
            r0 = 34
            r14.zzan(r15, r0, r3)
            return r15
        L_0x00e4:
            boolean r15 = r14.zzy
            if (r15 == 0) goto L_0x00eb
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzca.zzl
            goto L_0x00ed
        L_0x00eb:
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzca.zzy
        L_0x00ed:
            r0 = 103(0x67, float:1.44E-43)
            r1 = 18
            r14.zzan(r15, r0, r1)
            return r15
        L_0x00f5:
            boolean r15 = r14.zzx
            if (r15 == 0) goto L_0x00fc
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzca.zzl
            goto L_0x00fe
        L_0x00fc:
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzca.zzE
        L_0x00fe:
            r0 = 66
            r1 = 14
            r14.zzan(r15, r0, r1)
            return r15
        L_0x0106:
            boolean r15 = r14.zzw
            if (r15 == 0) goto L_0x010d
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzca.zzl
            goto L_0x010f
        L_0x010d:
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzca.zzD
        L_0x010f:
            r0 = 60
            r14.zzan(r15, r0, r11)
            return r15
        L_0x0115:
            boolean r15 = r14.zzu
            if (r15 == 0) goto L_0x011c
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzca.zzl
            goto L_0x011e
        L_0x011c:
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzca.zzB
        L_0x011e:
            r0 = 33
            r14.zzan(r15, r0, r10)
            return r15
        L_0x0124:
            boolean r15 = r14.zzu
            if (r15 == 0) goto L_0x012b
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzca.zzl
            goto L_0x012d
        L_0x012b:
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzca.zzA
        L_0x012d:
            r0 = 32
            r14.zzan(r15, r0, r9)
            return r15
        L_0x0133:
            boolean r15 = r14.zzt
            if (r15 == 0) goto L_0x013a
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzca.zzl
            goto L_0x013c
        L_0x013a:
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzca.zzv
        L_0x013c:
            r0 = 20
            r14.zzan(r15, r0, r13)
            return r15
        L_0x0142:
            boolean r15 = r14.zzs
            if (r15 == 0) goto L_0x0149
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzca.zzl
            goto L_0x014b
        L_0x0149:
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzca.zzt
        L_0x014b:
            r0 = 61
            r14.zzan(r15, r0, r12)
            return r15
        L_0x0151:
            boolean r15 = r14.zzs
            if (r15 == 0) goto L_0x0158
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzca.zzl
            goto L_0x015a
        L_0x0158:
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzca.zzt
        L_0x015a:
            r0 = 19
            r14.zzan(r15, r0, r8)
            return r15
        L_0x0160:
            boolean r15 = r14.zzq
            if (r15 == 0) goto L_0x0167
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzca.zzl
            goto L_0x0169
        L_0x0167:
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzca.zzu
        L_0x0169:
            r0 = 21
            r14.zzan(r15, r0, r7)
            return r15
        L_0x016f:
            boolean r15 = r14.zzr
            if (r15 == 0) goto L_0x0176
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzca.zzl
            goto L_0x0178
        L_0x0176:
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzca.zzs
        L_0x0178:
            r0 = 31
            r14.zzan(r15, r0, r6)
            return r15
        L_0x017e:
            boolean r15 = r14.zzp
            if (r15 == 0) goto L_0x0185
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzca.zzl
            goto L_0x0187
        L_0x0185:
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzca.zzw
        L_0x0187:
            r0 = 30
            r14.zzan(r15, r0, r2)
            return r15
        L_0x018d:
            boolean r15 = r14.zzm
            if (r15 == 0) goto L_0x0194
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzca.zzl
            goto L_0x0196
        L_0x0194:
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzca.zzr
        L_0x0196:
            r0 = 35
            r14.zzan(r15, r0, r4)
            return r15
        L_0x019c:
            boolean r15 = r14.zzj
            if (r15 == 0) goto L_0x01a3
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzca.zzl
            goto L_0x01a5
        L_0x01a3:
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzca.zzp
        L_0x01a5:
            r14.zzan(r15, r13, r5)
            return r15
        L_0x01a9:
            boolean r15 = r14.zzi
            if (r15 == 0) goto L_0x01b0
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzca.zzl
            goto L_0x01b2
        L_0x01b0:
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzca.zzo
        L_0x01b2:
            r14.zzan(r15, r12, r1)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.BillingClientImpl.isFeatureSupported(java.lang.String):com.android.billingclient.api.BillingResult");
    }

    public final boolean isReady() {
        return (this.zza != 2 || this.zzg == null || this.zzh == null) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:209:0x04bd, code lost:
        r3 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04d9, code lost:
        r0 = defpackage.oyg.a;
        r0 = r7.zzf;
        r1 = com.android.billingclient.api.zzca.zzm;
        r0.zza(com.android.billingclient.api.zzbx.zzb(5, 2, r1));
        r7.zzah(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x04eb, code lost:
        return r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:188:0x047d, B:204:0x04b2] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03e7  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x03f2  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03f5  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x042e  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0432  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x047d A[SYNTHETIC, Splitter:B:188:0x047d] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0491 A[Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:? A[ExcHandler: Exception (unused java.lang.Exception), SYNTHETIC, Splitter:B:188:0x047d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.android.billingclient.api.BillingResult launchBillingFlow(android.app.Activity r32, com.android.billingclient.api.BillingFlowParams r33) {
        /*
            r31 = this;
            r7 = r31
            r8 = r32
            r0 = 1
            java.lang.String r9 = "BUY_INTENT"
            java.lang.String r10 = "BillingClient"
            java.lang.String r1 = "proxyPackageVersion"
            com.android.billingclient.api.zzk r2 = r7.zzd
            r11 = 2
            if (r2 == 0) goto L_0x04fe
            com.android.billingclient.api.zzk r2 = r7.zzd
            com.android.billingclient.api.PurchasesUpdatedListener r2 = r2.zzd()
            if (r2 == 0) goto L_0x04fe
            boolean r2 = r31.isReady()
            if (r2 != 0) goto L_0x002d
            com.android.billingclient.api.zzby r0 = r7.zzf
            com.android.billingclient.api.BillingResult r1 = com.android.billingclient.api.zzca.zzm
            t3h r2 = com.android.billingclient.api.zzbx.zzb(r11, r11, r1)
            r0.zza(r2)
            r7.zzah(r1)
            return r1
        L_0x002d:
            java.util.ArrayList r2 = r33.zzg()
            java.util.List r3 = r33.zzh()
            java.util.Iterator r4 = r2.iterator()
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r4 = r4.next()
            goto L_0x0045
        L_0x0044:
            r4 = 0
        L_0x0045:
            com.android.billingclient.api.SkuDetails r4 = (com.android.billingclient.api.SkuDetails) r4
            r5 = r3
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
            boolean r12 = r5.hasNext()
            if (r12 == 0) goto L_0x0059
            java.lang.Object r5 = r5.next()
            goto L_0x005a
        L_0x0059:
            r5 = 0
        L_0x005a:
            com.android.billingclient.api.BillingFlowParams$ProductDetailsParams r5 = (com.android.billingclient.api.BillingFlowParams.ProductDetailsParams) r5
            if (r4 == 0) goto L_0x0067
            java.lang.String r12 = r4.getSku()
            java.lang.String r13 = r4.getType()
            goto L_0x0077
        L_0x0067:
            com.android.billingclient.api.ProductDetails r12 = r5.zza()
            java.lang.String r12 = r12.getProductId()
            com.android.billingclient.api.ProductDetails r13 = r5.zza()
            java.lang.String r13 = r13.getProductType()
        L_0x0077:
            java.lang.String r14 = "subs"
            boolean r14 = r13.equals(r14)
            r15 = 9
            if (r14 == 0) goto L_0x0097
            boolean r14 = r7.zzi
            if (r14 == 0) goto L_0x0086
            goto L_0x0097
        L_0x0086:
            int r0 = defpackage.oyg.a
            com.android.billingclient.api.zzby r0 = r7.zzf
            com.android.billingclient.api.BillingResult r1 = com.android.billingclient.api.zzca.zzo
            t3h r2 = com.android.billingclient.api.zzbx.zzb(r15, r11, r1)
            r0.zza(r2)
            r7.zzah(r1)
            return r1
        L_0x0097:
            boolean r14 = r33.zzq()
            if (r14 == 0) goto L_0x00b5
            boolean r14 = r7.zzl
            if (r14 == 0) goto L_0x00a2
            goto L_0x00b5
        L_0x00a2:
            int r0 = defpackage.oyg.a
            com.android.billingclient.api.zzby r0 = r7.zzf
            com.android.billingclient.api.BillingResult r1 = com.android.billingclient.api.zzca.zzh
            r2 = 18
            t3h r2 = com.android.billingclient.api.zzbx.zzb(r2, r11, r1)
            r0.zza(r2)
            r7.zzah(r1)
            return r1
        L_0x00b5:
            int r14 = r2.size()
            if (r14 <= r0) goto L_0x00d3
            boolean r14 = r7.zzs
            if (r14 == 0) goto L_0x00c0
            goto L_0x00d3
        L_0x00c0:
            int r0 = defpackage.oyg.a
            com.android.billingclient.api.zzby r0 = r7.zzf
            com.android.billingclient.api.BillingResult r1 = com.android.billingclient.api.zzca.zzt
            r2 = 19
            t3h r2 = com.android.billingclient.api.zzbx.zzb(r2, r11, r1)
            r0.zza(r2)
            r7.zzah(r1)
            return r1
        L_0x00d3:
            boolean r14 = r3.isEmpty()
            if (r14 != 0) goto L_0x00f1
            boolean r14 = r7.zzt
            if (r14 == 0) goto L_0x00de
            goto L_0x00f1
        L_0x00de:
            int r0 = defpackage.oyg.a
            com.android.billingclient.api.zzby r0 = r7.zzf
            com.android.billingclient.api.BillingResult r1 = com.android.billingclient.api.zzca.zzv
            r2 = 20
            t3h r2 = com.android.billingclient.api.zzbx.zzb(r2, r11, r1)
            r0.zza(r2)
            r7.zzah(r1)
            return r1
        L_0x00f1:
            boolean r14 = r7.zzl
            if (r14 == 0) goto L_0x0461
            boolean r14 = r7.zzn
            boolean r15 = r7.zzA
            java.lang.String r11 = r7.zzb
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r0 = "playBillingLibraryVersion"
            r6.putString(r0, r11)
            int r0 = r33.zzb()
            java.lang.String r11 = "prorationMode"
            if (r0 == 0) goto L_0x0115
            int r0 = r33.zzb()
            r6.putInt(r11, r0)
            goto L_0x0122
        L_0x0115:
            int r0 = r33.zza()
            if (r0 == 0) goto L_0x0122
            int r0 = r33.zza()
            r6.putInt(r11, r0)
        L_0x0122:
            java.lang.String r0 = r33.zzc()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0135
            java.lang.String r0 = r33.zzc()
            java.lang.String r11 = "accountId"
            r6.putString(r11, r0)
        L_0x0135:
            java.lang.String r0 = r33.zzd()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0148
            java.lang.String r0 = r33.zzd()
            java.lang.String r11 = "obfuscatedProfileId"
            r6.putString(r11, r0)
        L_0x0148:
            boolean r0 = r33.zzp()
            if (r0 == 0) goto L_0x0154
            java.lang.String r0 = "isOfferPersonalizedByDeveloper"
            r11 = 1
            r6.putBoolean(r0, r11)
        L_0x0154:
            r0 = 0
            boolean r11 = android.text.TextUtils.isEmpty(r0)
            if (r11 != 0) goto L_0x016d
            java.util.ArrayList r11 = new java.util.ArrayList
            java.lang.String[] r17 = new java.lang.String[]{r0}
            java.util.List r0 = java.util.Arrays.asList(r17)
            r11.<init>(r0)
            java.lang.String r0 = "skusToReplace"
            r6.putStringArrayList(r0, r11)
        L_0x016d:
            java.lang.String r0 = r33.zze()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0180
            java.lang.String r0 = r33.zze()
            java.lang.String r11 = "oldSkuPurchaseToken"
            r6.putString(r11, r0)
        L_0x0180:
            r0 = 0
            boolean r11 = android.text.TextUtils.isEmpty(r0)
            if (r11 != 0) goto L_0x018c
            java.lang.String r11 = "oldSkuPurchaseId"
            r6.putString(r11, r0)
        L_0x018c:
            java.lang.String r11 = r33.zzf()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x01a0
            java.lang.String r11 = r33.zzf()
            java.lang.String r0 = "originalExternalTransactionId"
            r6.putString(r0, r11)
            r0 = 0
        L_0x01a0:
            boolean r11 = android.text.TextUtils.isEmpty(r0)
            if (r11 != 0) goto L_0x01ab
            java.lang.String r11 = "paymentsPurchaseParams"
            r6.putString(r11, r0)
        L_0x01ab:
            if (r14 == 0) goto L_0x01b4
            java.lang.String r0 = "enablePendingPurchases"
            r11 = 1
            r6.putBoolean(r0, r11)
            goto L_0x01b5
        L_0x01b4:
            r11 = 1
        L_0x01b5:
            if (r15 == 0) goto L_0x01bc
            java.lang.String r0 = "enableAlternativeBilling"
            r6.putBoolean(r0, r11)
        L_0x01bc:
            boolean r0 = r2.isEmpty()
            java.lang.String r11 = "additionalSkuTypes"
            java.lang.String r14 = "additionalSkus"
            java.lang.String r15 = "SKU_SERIALIZED_DOCID_LIST"
            r17 = r9
            java.lang.String r9 = "skuDetailsTokens"
            java.lang.String r8 = "SKU_OFFER_ID_TOKEN_LIST"
            r18 = r10
            if (r0 != 0) goto L_0x02da
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r19 = r13
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r20 = r12
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r21 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r22 = r2.iterator()
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
        L_0x01fb:
            boolean r27 = r22.hasNext()
            if (r27 == 0) goto L_0x0268
            java.lang.Object r27 = r22.next()
            com.android.billingclient.api.SkuDetails r27 = (com.android.billingclient.api.SkuDetails) r27
            java.lang.String r28 = r27.zzf()
            boolean r28 = r28.isEmpty()
            if (r28 != 0) goto L_0x021b
            r28 = r5
            java.lang.String r5 = r27.zzf()
            r0.add(r5)
            goto L_0x021d
        L_0x021b:
            r28 = r5
        L_0x021d:
            java.lang.String r5 = r27.zzc()
            r29 = r4
            java.lang.String r4 = r27.zzb()
            int r30 = r27.zza()
            java.lang.String r7 = r27.zze()
            r10.add(r5)
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            r16 = 1
            r5 = r5 ^ 1
            r23 = r23 | r5
            r13.add(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            r4 = r4 ^ 1
            r24 = r24 | r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r30)
            r12.add(r4)
            if (r30 == 0) goto L_0x0253
            r4 = r16
            goto L_0x0254
        L_0x0253:
            r4 = 0
        L_0x0254:
            r25 = r25 | r4
            boolean r4 = android.text.TextUtils.isEmpty(r7)
            r4 = r4 ^ 1
            r26 = r26 | r4
            r1.add(r7)
            r7 = r31
            r5 = r28
            r4 = r29
            goto L_0x01fb
        L_0x0268:
            r29 = r4
            r28 = r5
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L_0x0275
            r6.putStringArrayList(r9, r0)
        L_0x0275:
            if (r23 == 0) goto L_0x027a
            r6.putStringArrayList(r8, r10)
        L_0x027a:
            if (r24 == 0) goto L_0x0281
            java.lang.String r0 = "SKU_OFFER_ID_LIST"
            r6.putStringArrayList(r0, r13)
        L_0x0281:
            if (r25 == 0) goto L_0x0288
            java.lang.String r0 = "SKU_OFFER_TYPE_LIST"
            r6.putIntegerArrayList(r0, r12)
        L_0x0288:
            if (r26 == 0) goto L_0x028d
            r6.putStringArrayList(r15, r1)
        L_0x028d:
            int r0 = r2.size()
            r1 = 1
            if (r0 <= r1) goto L_0x02d7
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            int r1 = r1 + -1
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r4 = r2.size()
            int r4 = r4 + -1
            r1.<init>(r4)
            r4 = 1
        L_0x02ab:
            int r5 = r2.size()
            if (r4 >= r5) goto L_0x02ce
            java.lang.Object r5 = r2.get(r4)
            com.android.billingclient.api.SkuDetails r5 = (com.android.billingclient.api.SkuDetails) r5
            java.lang.String r5 = r5.getSku()
            r0.add(r5)
            java.lang.Object r5 = r2.get(r4)
            com.android.billingclient.api.SkuDetails r5 = (com.android.billingclient.api.SkuDetails) r5
            java.lang.String r5 = r5.getType()
            r1.add(r5)
            r5 = 1
            int r4 = r4 + r5
            goto L_0x02ab
        L_0x02ce:
            r6.putStringArrayList(r14, r0)
            r6.putStringArrayList(r11, r1)
            r10 = 1
            goto L_0x038c
        L_0x02d7:
            r10 = r1
            goto L_0x038c
        L_0x02da:
            r21 = r1
            r29 = r4
            r28 = r5
            r20 = r12
            r19 = r13
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            int r1 = r1 + -1
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r3.size()
            int r2 = r2 + -1
            r1.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r7 = 0
        L_0x030a:
            int r10 = r3.size()
            if (r7 >= r10) goto L_0x036a
            java.lang.Object r10 = r3.get(r7)
            com.android.billingclient.api.BillingFlowParams$ProductDetailsParams r10 = (com.android.billingclient.api.BillingFlowParams.ProductDetailsParams) r10
            com.android.billingclient.api.ProductDetails r12 = r10.zza()
            java.lang.String r13 = r12.zzb()
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto L_0x032b
            java.lang.String r13 = r12.zzb()
            r2.add(r13)
        L_0x032b:
            java.lang.String r10 = r10.zzb()
            r4.add(r10)
            java.lang.String r10 = r12.zzc()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x0343
            java.lang.String r10 = r12.zzc()
            r5.add(r10)
        L_0x0343:
            if (r7 <= 0) goto L_0x0367
            java.lang.Object r10 = r3.get(r7)
            com.android.billingclient.api.BillingFlowParams$ProductDetailsParams r10 = (com.android.billingclient.api.BillingFlowParams.ProductDetailsParams) r10
            com.android.billingclient.api.ProductDetails r10 = r10.zza()
            java.lang.String r10 = r10.getProductId()
            r0.add(r10)
            java.lang.Object r10 = r3.get(r7)
            com.android.billingclient.api.BillingFlowParams$ProductDetailsParams r10 = (com.android.billingclient.api.BillingFlowParams.ProductDetailsParams) r10
            com.android.billingclient.api.ProductDetails r10 = r10.zza()
            java.lang.String r10 = r10.getProductType()
            r1.add(r10)
        L_0x0367:
            r10 = 1
            int r7 = r7 + r10
            goto L_0x030a
        L_0x036a:
            r10 = 1
            r6.putStringArrayList(r8, r4)
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L_0x0377
            r6.putStringArrayList(r9, r2)
        L_0x0377:
            boolean r2 = r5.isEmpty()
            if (r2 != 0) goto L_0x0380
            r6.putStringArrayList(r15, r5)
        L_0x0380:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x038c
            r6.putStringArrayList(r14, r0)
            r6.putStringArrayList(r11, r1)
        L_0x038c:
            boolean r0 = r6.containsKey(r8)
            r7 = r31
            if (r0 == 0) goto L_0x03ab
            boolean r0 = r7.zzq
            if (r0 == 0) goto L_0x0399
            goto L_0x03ab
        L_0x0399:
            com.android.billingclient.api.zzby r0 = r7.zzf
            com.android.billingclient.api.BillingResult r1 = com.android.billingclient.api.zzca.zzu
            r2 = 21
            r3 = 2
            t3h r2 = com.android.billingclient.api.zzbx.zzb(r2, r3, r1)
            r0.zza(r2)
            r7.zzah(r1)
            return r1
        L_0x03ab:
            java.lang.String r0 = "skuPackageName"
            if (r29 == 0) goto L_0x03c3
            java.lang.String r1 = r29.zzd()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x03c3
            java.lang.String r1 = r29.zzd()
            r6.putString(r0, r1)
        L_0x03c0:
            r0 = r10
        L_0x03c1:
            r1 = 0
            goto L_0x03e1
        L_0x03c3:
            if (r28 == 0) goto L_0x03df
            com.android.billingclient.api.ProductDetails r1 = r28.zza()
            java.lang.String r1 = r1.zza()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x03df
            com.android.billingclient.api.ProductDetails r1 = r28.zza()
            java.lang.String r1 = r1.zza()
            r6.putString(r0, r1)
            goto L_0x03c0
        L_0x03df:
            r0 = 0
            goto L_0x03c1
        L_0x03e1:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x03ec
            java.lang.String r2 = "accountName"
            r6.putString(r2, r1)
        L_0x03ec:
            android.content.Intent r1 = r32.getIntent()
            if (r1 != 0) goto L_0x03f5
            int r1 = defpackage.oyg.a
            goto L_0x0424
        L_0x03f5:
            java.lang.String r2 = "PROXY_PACKAGE"
            java.lang.String r4 = r1.getStringExtra(r2)
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0424
            java.lang.String r1 = r1.getStringExtra(r2)
            java.lang.String r2 = "proxyPackage"
            r6.putString(r2, r1)
            android.content.Context r2 = r7.zze     // Catch:{ NameNotFoundException -> 0x041d }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x041d }
            r4 = 0
            android.content.pm.PackageInfo r1 = r2.getPackageInfo(r1, r4)     // Catch:{ NameNotFoundException -> 0x041d }
            java.lang.String r1 = r1.versionName     // Catch:{ NameNotFoundException -> 0x041d }
            r2 = r21
            r6.putString(r2, r1)     // Catch:{ NameNotFoundException -> 0x041f }
            goto L_0x0424
        L_0x041d:
            r2 = r21
        L_0x041f:
            java.lang.String r1 = "package not found"
            r6.putString(r2, r1)
        L_0x0424:
            boolean r1 = r7.zzt
            if (r1 == 0) goto L_0x0432
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L_0x0432
            r0 = 17
        L_0x0430:
            r2 = r0
            goto L_0x0444
        L_0x0432:
            boolean r1 = r7.zzr
            if (r1 == 0) goto L_0x043b
            if (r0 == 0) goto L_0x043b
            r0 = 15
            goto L_0x0430
        L_0x043b:
            boolean r0 = r7.zzn
            if (r0 == 0) goto L_0x0442
            r2 = 9
            goto L_0x0444
        L_0x0442:
            r0 = 6
            goto L_0x0430
        L_0x0444:
            com.android.billingclient.api.zzao r8 = new com.android.billingclient.api.zzao
            r0 = r8
            r1 = r31
            r3 = r20
            r4 = r19
            r5 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6)
            android.os.Handler r5 = r7.zzc
            r2 = 5000(0x1388, double:2.4703E-320)
            r4 = 0
            r0 = r31
            r1 = r8
            java.util.concurrent.Future r0 = r0.zzak(r1, r2, r4, r5)
            r1 = 78
            goto L_0x047b
        L_0x0461:
            r17 = r9
            r18 = r10
            r20 = r12
            r19 = r13
            com.android.billingclient.api.zzn r1 = new com.android.billingclient.api.zzn
            r1.<init>(r7, r12, r13)
            android.os.Handler r5 = r7.zzc
            r2 = 5000(0x1388, double:2.4703E-320)
            r4 = 0
            r0 = r31
            java.util.concurrent.Future r0 = r0.zzak(r1, r2, r4, r5)
            r1 = 80
        L_0x047b:
            if (r0 != 0) goto L_0x0491
            com.android.billingclient.api.zzby r0 = r7.zzf     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }
            com.android.billingclient.api.BillingResult r1 = com.android.billingclient.api.zzca.zzm     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }
            r2 = 25
            r3 = 2
            t3h r2 = com.android.billingclient.api.zzbx.zzb(r2, r3, r1)     // Catch:{ CancellationException | TimeoutException -> 0x04ec, Exception -> 0x04d9 }
            r0.zza(r2)     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }
            r7.zzah(r1)     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }
            return r1
        L_0x048f:
            r3 = 2
            goto L_0x04ec
        L_0x0491:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }
            r3 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r0 = r0.get(r3, r2)     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }
            r2 = r18
            int r3 = defpackage.oyg.a(r2, r0)     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }
            java.lang.String r2 = defpackage.oyg.d(r2, r0)     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }
            if (r3 == 0) goto L_0x04bf
            com.android.billingclient.api.BillingResult r2 = com.android.billingclient.api.zzca.zza(r3, r2)     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }
            com.android.billingclient.api.zzby r3 = r7.zzf     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }
            if (r0 == 0) goto L_0x04b1
            r1 = 23
        L_0x04b1:
            r0 = 2
            t3h r1 = com.android.billingclient.api.zzbx.zzb(r1, r0, r2)     // Catch:{ CancellationException | TimeoutException -> 0x04bd, Exception -> 0x04d9 }
            r3.zza(r1)     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }
            r7.zzah(r2)     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }
            return r2
        L_0x04bd:
            r3 = r0
            goto L_0x04ec
        L_0x04bf:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }
            java.lang.Class<com.android.billingclient.api.ProxyBillingActivity> r2 = com.android.billingclient.api.ProxyBillingActivity.class
            r3 = r32
            r1.<init>(r3, r2)     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }
            r2 = r17
            android.os.Parcelable r0 = r0.getParcelable(r2)     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }
            r1.putExtra(r2, r0)     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }
            r3.startActivity(r1)     // Catch:{ CancellationException | TimeoutException -> 0x048f, Exception -> 0x04d9 }
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzca.zzl
            return r0
        L_0x04d9:
            int r0 = defpackage.oyg.a
            com.android.billingclient.api.zzby r0 = r7.zzf
            com.android.billingclient.api.BillingResult r1 = com.android.billingclient.api.zzca.zzm
            r2 = 5
            r3 = 2
            t3h r2 = com.android.billingclient.api.zzbx.zzb(r2, r3, r1)
            r0.zza(r2)
            r7.zzah(r1)
            return r1
        L_0x04ec:
            int r0 = defpackage.oyg.a
            com.android.billingclient.api.zzby r0 = r7.zzf
            com.android.billingclient.api.BillingResult r1 = com.android.billingclient.api.zzca.zzn
            r2 = 4
            t3h r2 = com.android.billingclient.api.zzbx.zzb(r2, r3, r1)
            r0.zza(r2)
            r7.zzah(r1)
            return r1
        L_0x04fe:
            r3 = r11
            com.android.billingclient.api.zzby r0 = r7.zzf
            com.android.billingclient.api.BillingResult r1 = com.android.billingclient.api.zzca.zzF
            r2 = 12
            t3h r2 = com.android.billingclient.api.zzbx.zzb(r2, r3, r1)
            r0.zza(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.BillingClientImpl.launchBillingFlow(android.app.Activity, com.android.billingclient.api.BillingFlowParams):com.android.billingclient.api.BillingResult");
    }

    public final void queryProductDetailsAsync(QueryProductDetailsParams queryProductDetailsParams, ProductDetailsResponseListener productDetailsResponseListener) {
        if (!isReady()) {
            zzby zzby = this.zzf;
            BillingResult billingResult = zzca.zzm;
            zzby.zza(zzbx.zzb(2, 7, billingResult));
            productDetailsResponseListener.onProductDetailsResponse(billingResult, new ArrayList());
        } else if (!this.zzt) {
            int i = oyg.a;
            zzby zzby2 = this.zzf;
            BillingResult billingResult2 = zzca.zzv;
            zzby2.zza(zzbx.zzb(20, 7, billingResult2));
            productDetailsResponseListener.onProductDetailsResponse(billingResult2, new ArrayList());
        } else {
            if (zzak(new zzaj(this, queryProductDetailsParams, productDetailsResponseListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzak(this, productDetailsResponseListener), zzag()) == null) {
                BillingResult zzai = zzai();
                this.zzf.zza(zzbx.zzb(25, 7, zzai));
                productDetailsResponseListener.onProductDetailsResponse(zzai, new ArrayList());
            }
        }
    }

    public final void queryPurchaseHistoryAsync(QueryPurchaseHistoryParams queryPurchaseHistoryParams, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        zzal(queryPurchaseHistoryParams.zza(), purchaseHistoryResponseListener);
    }

    public final void queryPurchasesAsync(QueryPurchasesParams queryPurchasesParams, PurchasesResponseListener purchasesResponseListener) {
        zzam(queryPurchasesParams.zza(), purchasesResponseListener);
    }

    public final void querySkuDetailsAsync(SkuDetailsParams skuDetailsParams, SkuDetailsResponseListener skuDetailsResponseListener) {
        if (!isReady()) {
            zzby zzby = this.zzf;
            BillingResult billingResult = zzca.zzm;
            zzby.zza(zzbx.zzb(2, 8, billingResult));
            skuDetailsResponseListener.onSkuDetailsResponse(billingResult, (List<SkuDetails>) null);
            return;
        }
        String skuType = skuDetailsParams.getSkuType();
        List<String> skusList = skuDetailsParams.getSkusList();
        if (TextUtils.isEmpty(skuType)) {
            int i = oyg.a;
            zzby zzby2 = this.zzf;
            BillingResult billingResult2 = zzca.zzf;
            zzby2.zza(zzbx.zzb(49, 8, billingResult2));
            skuDetailsResponseListener.onSkuDetailsResponse(billingResult2, (List<SkuDetails>) null);
        } else if (skusList == null) {
            int i2 = oyg.a;
            zzby zzby3 = this.zzf;
            BillingResult billingResult3 = zzca.zze;
            zzby3.zza(zzbx.zzb(48, 8, billingResult3));
            skuDetailsResponseListener.onSkuDetailsResponse(billingResult3, (List<SkuDetails>) null);
        } else {
            if (zzak(new zzy(this, skuType, skusList, (String) null, skuDetailsResponseListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzz(this, skuDetailsResponseListener), zzag()) == null) {
                BillingResult zzai = zzai();
                this.zzf.zza(zzbx.zzb(25, 8, zzai));
                skuDetailsResponseListener.onSkuDetailsResponse(zzai, (List<SkuDetails>) null);
            }
        }
    }

    @zze
    public BillingResult showAlternativeBillingOnlyInformationDialog(Activity activity, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        } else if (!isReady()) {
            zzby zzby = this.zzf;
            BillingResult billingResult = zzca.zzm;
            zzby.zza(zzbx.zzb(2, 16, billingResult));
            return billingResult;
        } else if (!this.zzx) {
            int i = oyg.a;
            zzby zzby2 = this.zzf;
            BillingResult billingResult2 = zzca.zzE;
            zzby2.zza(zzbx.zzb(66, 16, billingResult2));
            return billingResult2;
        } else {
            if (zzak(new zzo(this, activity, new zzat(this, this.zzc, alternativeBillingOnlyInformationDialogListener), alternativeBillingOnlyInformationDialogListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzp(this, alternativeBillingOnlyInformationDialogListener), this.zzc) != null) {
                return zzca.zzl;
            }
            BillingResult zzai = zzai();
            this.zzf.zza(zzbx.zzb(25, 16, zzai));
            return zzai;
        }
    }

    @zzf
    public BillingResult showExternalOfferInformationDialog(Activity activity, ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        } else if (!isReady()) {
            zzby zzby = this.zzf;
            BillingResult billingResult = zzca.zzm;
            zzby.zza(zzbx.zzb(2, 25, billingResult));
            return billingResult;
        } else if (!this.zzy) {
            int i = oyg.a;
            zzby zzby2 = this.zzf;
            BillingResult billingResult2 = zzca.zzy;
            zzby2.zza(zzbx.zzb(103, 25, billingResult2));
            return billingResult2;
        } else {
            if (zzak(new zzaf(this, activity, new zzau(this, this.zzc, externalOfferInformationDialogListener), externalOfferInformationDialogListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzah(this, externalOfferInformationDialogListener), this.zzc) != null) {
                return zzca.zzl;
            }
            BillingResult zzai = zzai();
            this.zzf.zza(zzbx.zzb(25, 25, zzai));
            return zzai;
        }
    }

    public final BillingResult showInAppMessages(Activity activity, InAppMessageParams inAppMessageParams, InAppMessageResponseListener inAppMessageResponseListener) {
        if (!isReady()) {
            int i = oyg.a;
            return zzca.zzm;
        } else if (!this.zzp) {
            int i2 = oyg.a;
            return zzca.zzw;
        } else {
            View findViewById = activity.findViewById(16908290);
            IBinder windowToken = findViewById.getWindowToken();
            Rect rect = new Rect();
            findViewById.getGlobalVisibleRect(rect);
            Bundle bundle = new Bundle();
            bundle.putBinder("KEY_WINDOW_TOKEN", windowToken);
            bundle.putInt("KEY_DIMEN_LEFT", rect.left);
            bundle.putInt("KEY_DIMEN_TOP", rect.top);
            bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
            bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
            bundle.putString("playBillingLibraryVersion", this.zzb);
            bundle.putIntegerArrayList("KEY_CATEGORY_IDS", inAppMessageParams.zza());
            zzak(new zzal(this, bundle, activity, new zzas(this, this.zzc, inAppMessageResponseListener)), MultiFileUploader.UPLOAD_NEXT_INTERVAL, (Runnable) null, this.zzc);
            return zzca.zzl;
        }
    }

    public final /* synthetic */ void zzQ(AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        zzby zzby = this.zzf;
        BillingResult billingResult = zzca.zzn;
        zzby.zza(zzbx.zzb(24, 3, billingResult));
        acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
    }

    public final /* synthetic */ void zzR(BillingResult billingResult) {
        if (this.zzd.zzd() != null) {
            this.zzd.zzd().onPurchasesUpdated(billingResult, (List<Purchase>) null);
        } else {
            int i = oyg.a;
        }
    }

    public final /* synthetic */ void zzS(ConsumeResponseListener consumeResponseListener, ConsumeParams consumeParams) {
        zzby zzby = this.zzf;
        BillingResult billingResult = zzca.zzn;
        zzby.zza(zzbx.zzb(24, 4, billingResult));
        consumeResponseListener.onConsumeResponse(billingResult, consumeParams.getPurchaseToken());
    }

    public final /* synthetic */ void zzT(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        zzby zzby = this.zzf;
        BillingResult billingResult = zzca.zzn;
        zzby.zza(zzbx.zzb(24, 15, billingResult));
        alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, (AlternativeBillingOnlyReportingDetails) null);
    }

    public final /* synthetic */ void zzU(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        zzby zzby = this.zzf;
        BillingResult billingResult = zzca.zzn;
        zzby.zza(zzbx.zzb(24, 24, billingResult));
        externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult, (ExternalOfferReportingDetails) null);
    }

    public final /* synthetic */ void zzV(BillingConfigResponseListener billingConfigResponseListener) {
        zzby zzby = this.zzf;
        BillingResult billingResult = zzca.zzn;
        zzby.zza(zzbx.zzb(24, 13, billingResult));
        billingConfigResponseListener.onBillingConfigResponse(billingResult, (BillingConfig) null);
    }

    public final /* synthetic */ void zzW(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        zzby zzby = this.zzf;
        BillingResult billingResult = zzca.zzn;
        zzby.zza(zzbx.zzb(24, 14, billingResult));
        alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
    }

    public final /* synthetic */ void zzX(ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        zzby zzby = this.zzf;
        BillingResult billingResult = zzca.zzn;
        zzby.zza(zzbx.zzb(24, 23, billingResult));
        externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult);
    }

    public final /* synthetic */ void zzY(ProductDetailsResponseListener productDetailsResponseListener) {
        zzby zzby = this.zzf;
        BillingResult billingResult = zzca.zzn;
        zzby.zza(zzbx.zzb(24, 7, billingResult));
        productDetailsResponseListener.onProductDetailsResponse(billingResult, new ArrayList());
    }

    public final /* synthetic */ void zzZ(PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        zzby zzby = this.zzf;
        BillingResult billingResult = zzca.zzn;
        zzby.zza(zzbx.zzb(24, 11, billingResult));
        purchaseHistoryResponseListener.onPurchaseHistoryResponse(billingResult, (List<PurchaseHistoryRecord>) null);
    }

    public final void zzaa(PurchasesResponseListener purchasesResponseListener) {
        zzby zzby = this.zzf;
        BillingResult billingResult = zzca.zzn;
        zzby.zza(zzbx.zzb(24, 9, billingResult));
        nxg nxg = rxg.b;
        purchasesResponseListener.onQueryPurchasesResponse(billingResult, ayg.v);
    }

    public final /* synthetic */ void zzab(SkuDetailsResponseListener skuDetailsResponseListener) {
        zzby zzby = this.zzf;
        BillingResult billingResult = zzca.zzn;
        zzby.zza(zzbx.zzb(24, 8, billingResult));
        skuDetailsResponseListener.onSkuDetailsResponse(billingResult, (List<SkuDetails>) null);
    }

    public final /* synthetic */ void zzac(AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        zzby zzby = this.zzf;
        BillingResult billingResult = zzca.zzn;
        zzby.zza(zzbx.zzb(24, 16, billingResult));
        alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(billingResult);
    }

    public final /* synthetic */ void zzad(ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        zzby zzby = this.zzf;
        BillingResult billingResult = zzca.zzn;
        zzby.zza(zzbx.zzb(24, 25, billingResult));
        externalOfferInformationDialogListener.onExternalOfferInformationDialogResponse(billingResult);
    }

    public final Bundle zzc(int i, String str, String str2, BillingFlowParams billingFlowParams, Bundle bundle) throws Exception {
        e7h e7h = this.zzg;
        String packageName = this.zze.getPackageName();
        r6h r6h = (r6h) e7h;
        Parcel I0 = r6h.I0();
        I0.writeInt(i);
        I0.writeString(packageName);
        I0.writeString(str);
        I0.writeString(str2);
        I0.writeString((String) null);
        int i2 = v7h.a;
        I0.writeInt(1);
        bundle.writeToParcel(I0, 0);
        Parcel J0 = r6h.J0(I0, 8);
        Bundle bundle2 = (Bundle) v7h.a(J0, Bundle.CREATOR);
        J0.recycle();
        return bundle2;
    }

    public final Bundle zzd(String str, String str2) throws Exception {
        e7h e7h = this.zzg;
        String packageName = this.zze.getPackageName();
        r6h r6h = (r6h) e7h;
        Parcel I0 = r6h.I0();
        I0.writeInt(3);
        I0.writeString(packageName);
        I0.writeString(str);
        I0.writeString(str2);
        I0.writeString((String) null);
        Parcel J0 = r6h.J0(I0, 3);
        Bundle bundle = (Bundle) v7h.a(J0, Bundle.CREATOR);
        J0.recycle();
        return bundle;
    }

    public final Object zzk(AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) throws Exception {
        try {
            e7h e7h = this.zzg;
            String packageName = this.zze.getPackageName();
            String purchaseToken = acknowledgePurchaseParams.getPurchaseToken();
            String str = this.zzb;
            Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", str);
            r6h r6h = (r6h) e7h;
            Parcel I0 = r6h.I0();
            I0.writeInt(9);
            I0.writeString(packageName);
            I0.writeString(purchaseToken);
            int i = v7h.a;
            I0.writeInt(1);
            bundle.writeToParcel(I0, 0);
            Parcel J0 = r6h.J0(I0, 902);
            Bundle bundle2 = (Bundle) v7h.a(J0, Bundle.CREATOR);
            J0.recycle();
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzca.zza(oyg.a("BillingClient", bundle2), oyg.d("BillingClient", bundle2)));
            return null;
        } catch (Exception unused) {
            int i2 = oyg.a;
            zzby zzby = this.zzf;
            BillingResult billingResult = zzca.zzm;
            zzby.zza(zzbx.zzb(28, 3, billingResult));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
            return null;
        }
    }

    public final Object zzl(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) throws Exception {
        String str;
        int i;
        String purchaseToken = consumeParams.getPurchaseToken();
        try {
            oyg.e("BillingClient", "Consuming purchase with token: " + purchaseToken);
            if (this.zzn) {
                e7h e7h = this.zzg;
                String packageName = this.zze.getPackageName();
                boolean z = this.zzn;
                String str2 = this.zzb;
                Bundle bundle = new Bundle();
                if (z) {
                    bundle.putString("playBillingLibraryVersion", str2);
                }
                r6h r6h = (r6h) e7h;
                Parcel I0 = r6h.I0();
                I0.writeInt(9);
                I0.writeString(packageName);
                I0.writeString(purchaseToken);
                int i2 = v7h.a;
                I0.writeInt(1);
                bundle.writeToParcel(I0, 0);
                Parcel J0 = r6h.J0(I0, 12);
                Bundle bundle2 = (Bundle) v7h.a(J0, Bundle.CREATOR);
                J0.recycle();
                i = bundle2.getInt("RESPONSE_CODE");
                str = oyg.d("BillingClient", bundle2);
            } else {
                e7h e7h2 = this.zzg;
                String packageName2 = this.zze.getPackageName();
                r6h r6h2 = (r6h) e7h2;
                Parcel I02 = r6h2.I0();
                I02.writeInt(3);
                I02.writeString(packageName2);
                I02.writeString(purchaseToken);
                Parcel J02 = r6h2.J0(I02, 5);
                int readInt = J02.readInt();
                J02.recycle();
                int i3 = readInt;
                str = "";
                i = i3;
            }
            BillingResult zza2 = zzca.zza(i, str);
            if (i == 0) {
                oyg.e("BillingClient", "Successfully consumed purchase.");
                consumeResponseListener.onConsumeResponse(zza2, purchaseToken);
                return null;
            }
            this.zzf.zza(zzbx.zzb(23, 4, zza2));
            consumeResponseListener.onConsumeResponse(zza2, purchaseToken);
            return null;
        } catch (Exception unused) {
            int i4 = oyg.a;
            zzby zzby = this.zzf;
            BillingResult billingResult = zzca.zzm;
            zzby.zza(zzbx.zzb(29, 4, billingResult));
            consumeResponseListener.onConsumeResponse(billingResult, purchaseToken);
            return null;
        }
    }

    public final /* synthetic */ Object zzm(Bundle bundle, BillingConfigResponseListener billingConfigResponseListener) throws Exception {
        try {
            ((r6h) this.zzg).H0(this.zze.getPackageName(), bundle, new zzbg(billingConfigResponseListener, this.zzf, (zzbf) null));
        } catch (DeadObjectException unused) {
            int i = oyg.a;
            zzby zzby = this.zzf;
            BillingResult billingResult = zzca.zzm;
            zzby.zza(zzbx.zzb(62, 13, billingResult));
            billingConfigResponseListener.onBillingConfigResponse(billingResult, (BillingConfig) null);
        } catch (Exception unused2) {
            int i2 = oyg.a;
            zzby zzby2 = this.zzf;
            BillingResult billingResult2 = zzca.zzj;
            zzby2.zza(zzbx.zzb(62, 13, billingResult2));
            billingConfigResponseListener.onBillingConfigResponse(billingResult2, (BillingConfig) null);
        }
        return null;
    }

    public final Object zzn(QueryProductDetailsParams queryProductDetailsParams, ProductDetailsResponseListener productDetailsResponseListener) throws Exception {
        String str;
        int i;
        int i2;
        int i3;
        boolean z = true;
        ArrayList arrayList = new ArrayList();
        String zzb2 = queryProductDetailsParams.zzb();
        rxg zza2 = queryProductDetailsParams.zza();
        int size = zza2.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                str = "";
                i = 0;
                break;
            }
            int i5 = i4 + 20;
            ArrayList arrayList2 = new ArrayList(zza2.subList(i4, i5 > size ? size : i5));
            ArrayList arrayList3 = new ArrayList();
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6 += z ? 1 : 0) {
                arrayList3.add(((QueryProductDetailsParams.Product) arrayList2.get(i6)).zza());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
            bundle.putString("playBillingLibraryVersion", this.zzb);
            try {
                e7h e7h = this.zzg;
                int i7 = z != this.zzw ? 17 : 20;
                String packageName = this.zze.getPackageName();
                String str2 = this.zzb;
                if (TextUtils.isEmpty((CharSequence) null)) {
                    this.zze.getPackageName();
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    this.zze.getPackageName();
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("playBillingLibraryVersion", str2);
                bundle2.putBoolean("enablePendingPurchases", z);
                bundle2.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int size3 = arrayList2.size();
                int i8 = 0;
                boolean z2 = false;
                while (i8 < size3) {
                    int i9 = size3;
                    arrayList4.add((Object) null);
                    z2 |= !TextUtils.isEmpty((CharSequence) null);
                    ArrayList arrayList6 = arrayList2;
                    if (!((QueryProductDetailsParams.Product) arrayList2.get(i8)).zzb().equals("first_party")) {
                        i8++;
                        arrayList2 = arrayList6;
                        size3 = i9;
                    } else {
                        throw new NullPointerException("Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                    }
                }
                if (z2) {
                    bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                }
                if (!arrayList5.isEmpty()) {
                    bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                int i10 = i7;
                i3 = 7;
                i2 = 6;
                try {
                    Bundle R = ((r6h) e7h).R(i10, packageName, zzb2, bundle, bundle2);
                    str = "Item is unavailable for purchase.";
                    if (R == null) {
                        int i11 = oyg.a;
                        this.zzf.zza(zzbx.zzb(44, 7, zzca.zzC));
                        break;
                    } else if (!R.containsKey("DETAILS_LIST")) {
                        i = oyg.a("BillingClient", R);
                        str = oyg.d("BillingClient", R);
                        if (i != 0) {
                            this.zzf.zza(zzbx.zzb(23, 7, zzca.zza(i, str)));
                        } else {
                            this.zzf.zza(zzbx.zzb(45, 7, zzca.zza(6, str)));
                        }
                    } else {
                        ArrayList<String> stringArrayList = R.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList == null) {
                            int i12 = oyg.a;
                            this.zzf.zza(zzbx.zzb(46, 7, zzca.zzC));
                            break;
                        }
                        int i13 = 0;
                        while (i13 < stringArrayList.size()) {
                            try {
                                ProductDetails productDetails = new ProductDetails(stringArrayList.get(i13));
                                oyg.e("BillingClient", "Got product details: ".concat(productDetails.toString()));
                                arrayList.add(productDetails);
                                i13++;
                            } catch (JSONException unused) {
                                int i14 = oyg.a;
                                str = "Error trying to decode SkuDetails.";
                                this.zzf.zza(zzbx.zzb(47, 7, zzca.zza(6, str)));
                                i = i2;
                                productDetailsResponseListener.onProductDetailsResponse(zzca.zza(i, str), arrayList);
                                return null;
                            }
                        }
                        i4 = i5;
                        z = true;
                    }
                } catch (Exception unused2) {
                    int i15 = oyg.a;
                    this.zzf.zza(zzbx.zzb(43, i3, zzca.zzj));
                    str = "An internal error occurred.";
                    i = i2;
                    productDetailsResponseListener.onProductDetailsResponse(zzca.zza(i, str), arrayList);
                    return null;
                }
            } catch (Exception unused3) {
                i3 = 7;
                i2 = 6;
                int i152 = oyg.a;
                this.zzf.zza(zzbx.zzb(43, i3, zzca.zzj));
                str = "An internal error occurred.";
                i = i2;
                productDetailsResponseListener.onProductDetailsResponse(zzca.zza(i, str), arrayList);
                return null;
            }
        }
        i = 4;
        productDetailsResponseListener.onProductDetailsResponse(zzca.zza(i, str), arrayList);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b0, code lost:
        r4 = 4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzo(java.lang.String r18, java.util.List r19, java.lang.String r20, com.android.billingclient.api.SkuDetailsResponseListener r21) throws java.lang.Exception {
        /*
            r17 = this;
            r0 = r17
            r1 = 1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r19.size()
            r4 = 0
            r5 = r4
        L_0x000e:
            if (r5 >= r3) goto L_0x0152
            int r7 = r5 + 20
            if (r7 <= r3) goto L_0x0016
            r8 = r3
            goto L_0x0017
        L_0x0016:
            r8 = r7
        L_0x0017:
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = r19
            java.util.List r5 = r10.subList(r5, r8)
            r9.<init>(r5)
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
            java.lang.String r5 = "ITEM_ID_LIST"
            r15.putStringArrayList(r5, r9)
            java.lang.String r5 = r0.zzb
            java.lang.String r8 = "playBillingLibraryVersion"
            r15.putString(r8, r5)
            r5 = 8
            boolean r9 = r0.zzo     // Catch:{ Exception -> 0x013e }
            if (r9 == 0) goto L_0x0069
            e7h r9 = r0.zzg     // Catch:{ Exception -> 0x013e }
            android.content.Context r11 = r0.zze     // Catch:{ Exception -> 0x013e }
            java.lang.String r13 = r11.getPackageName()     // Catch:{ Exception -> 0x013e }
            int r11 = r0.zzk     // Catch:{ Exception -> 0x013e }
            java.lang.String r12 = r0.zzb     // Catch:{ Exception -> 0x013e }
            android.os.Bundle r14 = new android.os.Bundle     // Catch:{ Exception -> 0x013e }
            r14.<init>()     // Catch:{ Exception -> 0x013e }
            r6 = 9
            if (r11 < r6) goto L_0x0051
            r14.putString(r8, r12)     // Catch:{ Exception -> 0x013e }
        L_0x0051:
            if (r11 < r6) goto L_0x0058
            java.lang.String r6 = "enablePendingPurchases"
            r14.putBoolean(r6, r1)     // Catch:{ Exception -> 0x013e }
        L_0x0058:
            r11 = r9
            r6h r11 = (defpackage.r6h) r11     // Catch:{ Exception -> 0x013e }
            r12 = 10
            r6 = r14
            r14 = r18
            r16 = r6
            android.os.Bundle r6 = r11.R(r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x013e }
            r8 = r18
            goto L_0x009c
        L_0x0069:
            e7h r6 = r0.zzg     // Catch:{ Exception -> 0x013e }
            android.content.Context r8 = r0.zze     // Catch:{ Exception -> 0x013e }
            java.lang.String r8 = r8.getPackageName()     // Catch:{ Exception -> 0x013e }
            r6h r6 = (defpackage.r6h) r6     // Catch:{ Exception -> 0x013e }
            android.os.Parcel r9 = r6.I0()     // Catch:{ Exception -> 0x013e }
            r11 = 3
            r9.writeInt(r11)     // Catch:{ Exception -> 0x013e }
            r9.writeString(r8)     // Catch:{ Exception -> 0x013e }
            r8 = r18
            r9.writeString(r8)     // Catch:{ Exception -> 0x013e }
            int r11 = defpackage.v7h.a     // Catch:{ Exception -> 0x013e }
            r9.writeInt(r1)     // Catch:{ Exception -> 0x013e }
            r15.writeToParcel(r9, r4)     // Catch:{ Exception -> 0x013e }
            r11 = 2
            android.os.Parcel r6 = r6.J0(r9, r11)     // Catch:{ Exception -> 0x013e }
            android.os.Parcelable$Creator r9 = android.os.Bundle.CREATOR     // Catch:{ Exception -> 0x013e }
            android.os.Parcelable r9 = defpackage.v7h.a(r6, r9)     // Catch:{ Exception -> 0x013e }
            android.os.Bundle r9 = (android.os.Bundle) r9     // Catch:{ Exception -> 0x013e }
            r6.recycle()     // Catch:{ Exception -> 0x013e }
            r6 = r9
        L_0x009c:
            r9 = 4
            java.lang.String r11 = "Item is unavailable for purchase."
            if (r6 != 0) goto L_0x00b4
            int r1 = defpackage.oyg.a
            com.android.billingclient.api.zzby r0 = r0.zzf
            r1 = 44
            com.android.billingclient.api.BillingResult r2 = com.android.billingclient.api.zzca.zzC
            t3h r1 = com.android.billingclient.api.zzbx.zzb(r1, r5, r2)
            r0.zza(r1)
        L_0x00b0:
            r4 = r9
        L_0x00b1:
            r2 = 0
            goto L_0x0154
        L_0x00b4:
            java.lang.String r12 = "DETAILS_LIST"
            boolean r13 = r6.containsKey(r12)
            java.lang.String r14 = "BillingClient"
            r15 = 6
            if (r13 != 0) goto L_0x00eb
            int r4 = defpackage.oyg.a(r14, r6)
            java.lang.String r11 = defpackage.oyg.d(r14, r6)
            if (r4 == 0) goto L_0x00da
            com.android.billingclient.api.zzby r0 = r0.zzf
            r1 = 23
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzca.zza(r4, r11)
            t3h r1 = com.android.billingclient.api.zzbx.zzb(r1, r5, r3)
            r0.zza(r1)
            goto L_0x0154
        L_0x00da:
            com.android.billingclient.api.zzby r0 = r0.zzf
            r1 = 45
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzca.zza(r15, r11)
            t3h r1 = com.android.billingclient.api.zzbx.zzb(r1, r5, r3)
            r0.zza(r1)
            r4 = r15
            goto L_0x0154
        L_0x00eb:
            java.util.ArrayList r6 = r6.getStringArrayList(r12)
            if (r6 != 0) goto L_0x0101
            int r1 = defpackage.oyg.a
            com.android.billingclient.api.zzby r0 = r0.zzf
            r1 = 46
            com.android.billingclient.api.BillingResult r2 = com.android.billingclient.api.zzca.zzC
            t3h r1 = com.android.billingclient.api.zzbx.zzb(r1, r5, r2)
            r0.zza(r1)
            goto L_0x00b0
        L_0x0101:
            r9 = r4
        L_0x0102:
            int r11 = r6.size()
            if (r9 >= r11) goto L_0x013b
            java.lang.Object r11 = r6.get(r9)
            java.lang.String r11 = (java.lang.String) r11
            com.android.billingclient.api.SkuDetails r12 = new com.android.billingclient.api.SkuDetails     // Catch:{ JSONException -> 0x0125 }
            r12.<init>(r11)     // Catch:{ JSONException -> 0x0125 }
            java.lang.String r11 = r12.toString()
            java.lang.String r13 = "Got sku details: "
            java.lang.String r11 = r13.concat(r11)
            defpackage.oyg.e(r14, r11)
            r2.add(r12)
            int r9 = r9 + r1
            goto L_0x0102
        L_0x0125:
            int r1 = defpackage.oyg.a
            com.android.billingclient.api.zzby r0 = r0.zzf
            r1 = 47
            java.lang.String r11 = "Error trying to decode SkuDetails."
            com.android.billingclient.api.BillingResult r2 = com.android.billingclient.api.zzca.zza(r15, r11)
            t3h r1 = com.android.billingclient.api.zzbx.zzb(r1, r5, r2)
            r0.zza(r1)
            r4 = r15
            goto L_0x00b1
        L_0x013b:
            r5 = r7
            goto L_0x000e
        L_0x013e:
            int r1 = defpackage.oyg.a
            com.android.billingclient.api.zzby r0 = r0.zzf
            r1 = 43
            com.android.billingclient.api.BillingResult r2 = com.android.billingclient.api.zzca.zzm
            t3h r1 = com.android.billingclient.api.zzbx.zzb(r1, r5, r2)
            r0.zza(r1)
            java.lang.String r11 = "Service connection is disconnected."
            r4 = -1
            goto L_0x00b1
        L_0x0152:
            java.lang.String r11 = ""
        L_0x0154:
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzca.zza(r4, r11)
            r1 = r21
            r1.onSkuDetailsResponse(r0, r2)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.BillingClientImpl.zzo(java.lang.String, java.util.List, java.lang.String, com.android.billingclient.api.SkuDetailsResponseListener):java.lang.Object");
    }

    public final Object zzp(Bundle bundle, Activity activity, ResultReceiver resultReceiver) throws Exception {
        e7h e7h = this.zzg;
        String packageName = this.zze.getPackageName();
        zzbo zzbo = new zzbo(new WeakReference(activity), resultReceiver, (zzbn) null);
        r6h r6h = (r6h) e7h;
        Parcel I0 = r6h.I0();
        I0.writeInt(12);
        I0.writeString(packageName);
        int i = v7h.a;
        I0.writeInt(1);
        bundle.writeToParcel(I0, 0);
        I0.writeStrongBinder(zzbo);
        r6h.K0(I0, 1201);
        return null;
    }

    public final Void zzq(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) throws Exception {
        try {
            e7h e7h = this.zzg;
            String packageName = this.zze.getPackageName();
            Bundle b = oyg.b(this.zzb);
            zzba zzba = new zzba(alternativeBillingOnlyReportingDetailsListener, this.zzf, (zzaz) null);
            r6h r6h = (r6h) e7h;
            Parcel I0 = r6h.I0();
            I0.writeInt(21);
            I0.writeString(packageName);
            int i = v7h.a;
            I0.writeInt(1);
            b.writeToParcel(I0, 0);
            I0.writeStrongBinder(zzba);
            r6h.L0(I0, 1501);
        } catch (Exception unused) {
            zzby zzby = this.zzf;
            BillingResult billingResult = zzca.zzj;
            zzby.zza(zzbx.zzb(70, 15, billingResult));
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, (AlternativeBillingOnlyReportingDetails) null);
        }
        return null;
    }

    public final Void zzr(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) throws Exception {
        try {
            e7h e7h = this.zzg;
            String packageName = this.zze.getPackageName();
            Bundle b = oyg.b(this.zzb);
            zzbc zzbc = new zzbc(externalOfferReportingDetailsListener, this.zzf, (zzbb) null);
            r6h r6h = (r6h) e7h;
            Parcel I0 = r6h.I0();
            I0.writeInt(22);
            I0.writeString(packageName);
            int i = v7h.a;
            I0.writeInt(1);
            b.writeToParcel(I0, 0);
            I0.writeStrongBinder(zzbc);
            r6h.L0(I0, 1801);
        } catch (Exception e) {
            zzby zzby = this.zzf;
            BillingResult billingResult = zzca.zzj;
            String name = e.getClass().getName();
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            zzby.zza(zzbx.zzc(94, 24, billingResult, g63.i(name, ": ", message)));
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult, (ExternalOfferReportingDetails) null);
        }
        return null;
    }

    public final Void zzs(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) throws Exception {
        try {
            e7h e7h = this.zzg;
            String packageName = this.zze.getPackageName();
            Bundle b = oyg.b(this.zzb);
            zzbk zzbk = new zzbk(alternativeBillingOnlyAvailabilityListener, this.zzf, (zzbj) null);
            r6h r6h = (r6h) e7h;
            Parcel I0 = r6h.I0();
            I0.writeInt(21);
            I0.writeString(packageName);
            int i = v7h.a;
            I0.writeInt(1);
            b.writeToParcel(I0, 0);
            I0.writeStrongBinder(zzbk);
            r6h.L0(I0, 1401);
        } catch (Exception unused) {
            zzby zzby = this.zzf;
            BillingResult billingResult = zzca.zzj;
            zzby.zza(zzbx.zzb(69, 14, billingResult));
            alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
        }
        return null;
    }

    public final Void zzt(ExternalOfferAvailabilityListener externalOfferAvailabilityListener) throws Exception {
        try {
            e7h e7h = this.zzg;
            String packageName = this.zze.getPackageName();
            Bundle b = oyg.b(this.zzb);
            zzbm zzbm = new zzbm(externalOfferAvailabilityListener, this.zzf, (zzbl) null);
            r6h r6h = (r6h) e7h;
            Parcel I0 = r6h.I0();
            I0.writeInt(22);
            I0.writeString(packageName);
            int i = v7h.a;
            I0.writeInt(1);
            b.writeToParcel(I0, 0);
            I0.writeStrongBinder(zzbm);
            r6h.L0(I0, 1701);
        } catch (Exception e) {
            zzby zzby = this.zzf;
            BillingResult billingResult = zzca.zzj;
            String name = e.getClass().getName();
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            zzby.zza(zzbx.zzc(91, 23, billingResult, g63.i(name, ": ", message)));
            externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult);
        }
        return null;
    }

    public final Void zzu(Activity activity, ResultReceiver resultReceiver, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) throws Exception {
        try {
            e7h e7h = this.zzg;
            String packageName = this.zze.getPackageName();
            Bundle b = oyg.b(this.zzb);
            zzbe zzbe = new zzbe(new WeakReference(activity), resultReceiver, (zzbd) null);
            r6h r6h = (r6h) e7h;
            Parcel I0 = r6h.I0();
            I0.writeInt(21);
            I0.writeString(packageName);
            int i = v7h.a;
            I0.writeInt(1);
            b.writeToParcel(I0, 0);
            I0.writeStrongBinder(zzbe);
            r6h.L0(I0, 1601);
        } catch (Exception unused) {
            zzby zzby = this.zzf;
            BillingResult billingResult = zzca.zzj;
            zzby.zza(zzbx.zzb(74, 16, billingResult));
            alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(billingResult);
        }
        return null;
    }

    public final Void zzv(Activity activity, ResultReceiver resultReceiver, ExternalOfferInformationDialogListener externalOfferInformationDialogListener) throws Exception {
        try {
            e7h e7h = this.zzg;
            String packageName = this.zze.getPackageName();
            Bundle b = oyg.b(this.zzb);
            zzbi zzbi = new zzbi(new WeakReference(activity), resultReceiver, (zzbh) null);
            r6h r6h = (r6h) e7h;
            Parcel I0 = r6h.I0();
            I0.writeInt(22);
            I0.writeString(packageName);
            int i = v7h.a;
            I0.writeInt(1);
            b.writeToParcel(I0, 0);
            I0.writeStrongBinder(zzbi);
            r6h.L0(I0, 1901);
        } catch (Exception e) {
            zzby zzby = this.zzf;
            BillingResult billingResult = zzca.zzj;
            String name = e.getClass().getName();
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            zzby.zza(zzbx.zzc(98, 25, billingResult, g63.i(name, ": ", message)));
            externalOfferInformationDialogListener.onExternalOfferInformationDialogResponse(billingResult);
        }
        return null;
    }

    public final void queryPurchaseHistoryAsync(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        zzal(str, purchaseHistoryResponseListener);
    }

    public final void queryPurchasesAsync(String str, PurchasesResponseListener purchasesResponseListener) {
        zzam(str, purchasesResponseListener);
    }

    private BillingClientImpl(Context context, zzcn zzcn, PurchasesUpdatedListener purchasesUpdatedListener, String str, String str2, UserChoiceBillingListener userChoiceBillingListener, zzby zzby, ExecutorService executorService) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = str;
        initialize(context, purchasesUpdatedListener, zzcn, userChoiceBillingListener, str, (zzby) null);
    }

    private BillingClientImpl(String str) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = str;
    }

    public BillingClientImpl(String str, Context context, zzby zzby, ExecutorService executorService) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        String zzaj = zzaj();
        this.zzb = zzaj;
        this.zze = context.getApplicationContext();
        g4h p = h4h.p();
        p.h();
        h4h.n((h4h) p.b, zzaj);
        String packageName = this.zze.getPackageName();
        p.h();
        h4h.o((h4h) p.b, packageName);
        this.zzf = new zzcd(this.zze, (h4h) p.a());
        this.zze.getPackageName();
    }

    private void initialize(Context context, PurchasesUpdatedListener purchasesUpdatedListener, zzcn zzcn, UserChoiceBillingListener userChoiceBillingListener, String str, zzby zzby) {
        this.zze = context.getApplicationContext();
        g4h p = h4h.p();
        p.h();
        h4h.n((h4h) p.b, str);
        String packageName = this.zze.getPackageName();
        p.h();
        h4h.o((h4h) p.b, packageName);
        if (zzby != null) {
            this.zzf = zzby;
        } else {
            this.zzf = new zzcd(this.zze, (h4h) p.a());
        }
        if (purchasesUpdatedListener == null) {
            int i = oyg.a;
        }
        this.zzd = new zzk(this.zze, purchasesUpdatedListener, (zzcg) null, (AlternativeBillingListener) null, userChoiceBillingListener, this.zzf);
        this.zzz = zzcn;
        this.zzA = userChoiceBillingListener != null;
    }

    public BillingClientImpl(String str, zzcn zzcn, Context context, zzcg zzcg, zzby zzby, ExecutorService executorService) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = zzaj();
        this.zze = context.getApplicationContext();
        g4h p = h4h.p();
        String zzaj = zzaj();
        p.h();
        h4h.n((h4h) p.b, zzaj);
        String packageName = this.zze.getPackageName();
        p.h();
        h4h.o((h4h) p.b, packageName);
        zzcd zzcd = new zzcd(this.zze, (h4h) p.a());
        this.zzf = zzcd;
        int i = oyg.a;
        this.zzd = new zzk(this.zze, (PurchasesUpdatedListener) null, (zzcg) null, (AlternativeBillingListener) null, (UserChoiceBillingListener) null, zzcd);
        this.zzz = zzcn;
        this.zze.getPackageName();
    }

    public final void startConnection(BillingClientStateListener billingClientStateListener) {
        if (isReady()) {
            oyg.e("BillingClient", "Service connection is valid. No need to re-initialize.");
            this.zzf.zzb(zzbx.zzd(6));
            billingClientStateListener.onBillingSetupFinished(zzca.zzl);
            return;
        }
        int i = 1;
        if (this.zza == 1) {
            int i2 = oyg.a;
            zzby zzby = this.zzf;
            BillingResult billingResult = zzca.zzd;
            zzby.zza(zzbx.zzb(37, 6, billingResult));
            billingClientStateListener.onBillingSetupFinished(billingResult);
        } else if (this.zza == 3) {
            int i3 = oyg.a;
            zzby zzby2 = this.zzf;
            BillingResult billingResult2 = zzca.zzm;
            zzby2.zza(zzbx.zzb(38, 6, billingResult2));
            billingClientStateListener.onBillingSetupFinished(billingResult2);
        } else {
            this.zza = 1;
            oyg.e("BillingClient", "Starting in-app billing setup.");
            this.zzh = new zzay(this, billingClientStateListener, (zzax) null);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.zze.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                i = 41;
            } else {
                ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                if (serviceInfo != null) {
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    if (!"com.android.vending".equals(str) || str2 == null) {
                        i = 40;
                    } else {
                        ComponentName componentName = new ComponentName(str, str2);
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(componentName);
                        intent2.putExtra("playBillingLibraryVersion", this.zzb);
                        if (this.zze.bindService(intent2, this.zzh, 1)) {
                            oyg.e("BillingClient", "Service was bonded successfully.");
                            return;
                        }
                        i = 39;
                    }
                }
            }
            this.zza = 0;
            oyg.e("BillingClient", "Billing service unavailable on device.");
            zzby zzby3 = this.zzf;
            BillingResult billingResult3 = zzca.zzc;
            zzby3.zza(zzbx.zzb(i, 6, billingResult3));
            billingClientStateListener.onBillingSetupFinished(billingResult3);
        }
    }

    public BillingClientImpl(String str, zzcn zzcn, Context context, PurchasesUpdatedListener purchasesUpdatedListener, AlternativeBillingListener alternativeBillingListener, zzby zzby, ExecutorService executorService) {
        String zzaj = zzaj();
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = zzaj;
        initialize(context, purchasesUpdatedListener, zzcn, alternativeBillingListener, zzaj, (zzby) null);
    }

    public BillingClientImpl(String str, zzcn zzcn, Context context, PurchasesUpdatedListener purchasesUpdatedListener, UserChoiceBillingListener userChoiceBillingListener, zzby zzby, ExecutorService executorService) {
        this(context, zzcn, purchasesUpdatedListener, zzaj(), (String) null, userChoiceBillingListener, (zzby) null, (ExecutorService) null);
    }
}

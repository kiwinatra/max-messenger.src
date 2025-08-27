package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;

final class zzj extends BroadcastReceiver {
    final /* synthetic */ zzk zza;
    private boolean zzb;
    private final boolean zzc;
    private boolean zzd;

    public zzj(zzk zzk, boolean z) {
        this.zza = zzk;
        this.zzc = z;
    }

    private final void zzc(Bundle bundle, BillingResult billingResult, int i) {
        if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
            try {
                this.zza.zze.zza(t3h.n(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), xzg.a()));
            } catch (Throwable unused) {
                int i2 = oyg.a;
            }
        } else {
            this.zza.zze.zza(zzbx.zzb(23, i, billingResult));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r12, android.content.Intent r13) {
        /*
            r11 = this;
            android.os.Bundle r12 = r13.getExtras()
            r0 = 0
            r1 = 1
            if (r12 != 0) goto L_0x002b
            int r12 = defpackage.oyg.a
            com.android.billingclient.api.zzk r12 = r11.zza
            com.android.billingclient.api.zzby r12 = r12.zze
            com.android.billingclient.api.BillingResult r13 = com.android.billingclient.api.zzca.zzj
            r2 = 11
            t3h r1 = com.android.billingclient.api.zzbx.zzb(r2, r1, r13)
            r12.zza(r1)
            com.android.billingclient.api.zzk r11 = r11.zza
            com.android.billingclient.api.PurchasesUpdatedListener r12 = r11.zzb
            if (r12 == 0) goto L_0x014e
            com.android.billingclient.api.PurchasesUpdatedListener r11 = r11.zzb
            r11.onPurchasesUpdated(r13, r0)
            return
        L_0x002b:
            java.lang.String r2 = "BillingBroadcastManager"
            com.android.billingclient.api.BillingResult r2 = defpackage.oyg.c(r13, r2)
            java.lang.String r13 = r13.getAction()
            java.lang.String r3 = "INTENT_SOURCE"
            java.lang.String r3 = r12.getString(r3)
            java.lang.String r4 = "LAUNCH_BILLING_FLOW"
            boolean r3 = java.util.Objects.equals(r3, r4)
            if (r1 == r3) goto L_0x0045
            r3 = r1
            goto L_0x0046
        L_0x0045:
            r3 = 2
        L_0x0046:
            java.lang.String r4 = "BROADCAST_RECEIVER_LOGGING_PAYLOAD"
            byte[] r5 = r12.getByteArray(r4)
            if (r5 == 0) goto L_0x005e
            com.android.billingclient.api.zzk r5 = r11.zza     // Catch:{ all -> 0x005c }
            com.android.billingclient.api.zzby r5 = r5.zze     // Catch:{ all -> 0x005c }
            byte[] r4 = r12.getByteArray(r4)     // Catch:{ all -> 0x005c }
            r5.zzc(r4)     // Catch:{ all -> 0x005c }
            goto L_0x005e
        L_0x005c:
            int r4 = defpackage.oyg.a
        L_0x005e:
            java.lang.String r4 = "com.android.vending.billing.PURCHASES_UPDATED"
            boolean r4 = r13.equals(r4)
            r5 = 0
            if (r4 != 0) goto L_0x014f
            java.lang.String r4 = "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED"
            boolean r4 = r13.equals(r4)
            if (r4 == 0) goto L_0x0071
            goto L_0x014f
        L_0x0071:
            java.lang.String r0 = "com.android.vending.billing.ALTERNATIVE_BILLING"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x014e
            com.android.billingclient.api.zzk r0 = r11.zza
            com.android.billingclient.api.zzby r0 = r0.zze
            z3h r13 = com.android.billingclient.api.zzbx.zza(r13)
            nxg r4 = defpackage.rxg.b
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            defpackage.ct.M(r1, r13)
            ayg r4 = new ayg
            r4.<init>(r13, r1)
            boolean r13 = r11.zzd
            r1 = 4
            r0.zze(r1, r4, r5, r13)
            int r13 = r2.getResponseCode()
            if (r13 == 0) goto L_0x00ac
            r11.zzc(r12, r2, r3)
            com.android.billingclient.api.zzk r11 = r11.zza
            com.android.billingclient.api.PurchasesUpdatedListener r11 = r11.zzb
            ayg r12 = defpackage.ayg.v
            r11.onPurchasesUpdated(r2, r12)
            return
        L_0x00ac:
            com.android.billingclient.api.zzk r13 = r11.zza
            com.android.billingclient.api.AlternativeBillingListener r0 = r13.zzc
            if (r0 != 0) goto L_0x00d8
            com.android.billingclient.api.UserChoiceBillingListener r13 = r13.zzd
            if (r13 == 0) goto L_0x00bb
            goto L_0x00d8
        L_0x00bb:
            com.android.billingclient.api.zzk r12 = r11.zza
            com.android.billingclient.api.zzby r12 = r12.zze
            com.android.billingclient.api.BillingResult r13 = com.android.billingclient.api.zzca.zzj
            r0 = 77
            t3h r0 = com.android.billingclient.api.zzbx.zzb(r0, r3, r13)
            r12.zza(r0)
            com.android.billingclient.api.zzk r11 = r11.zza
            com.android.billingclient.api.PurchasesUpdatedListener r11 = r11.zzb
            ayg r12 = defpackage.ayg.v
            r11.onPurchasesUpdated(r13, r12)
            return
        L_0x00d8:
            java.lang.String r13 = "ALTERNATIVE_BILLING_USER_CHOICE_DATA"
            java.lang.String r12 = r12.getString(r13)
            if (r12 == 0) goto L_0x0132
            com.android.billingclient.api.zzk r13 = r11.zza     // Catch:{ JSONException -> 0x0113 }
            com.android.billingclient.api.UserChoiceBillingListener r13 = r13.zzd     // Catch:{ JSONException -> 0x0113 }
            if (r13 == 0) goto L_0x00f7
            com.android.billingclient.api.UserChoiceDetails r13 = new com.android.billingclient.api.UserChoiceDetails     // Catch:{ JSONException -> 0x0113 }
            r13.<init>(r12)     // Catch:{ JSONException -> 0x0113 }
            com.android.billingclient.api.zzk r12 = r11.zza     // Catch:{ JSONException -> 0x0113 }
            com.android.billingclient.api.UserChoiceBillingListener r12 = r12.zzd     // Catch:{ JSONException -> 0x0113 }
            r12.userSelectedAlternativeBilling(r13)     // Catch:{ JSONException -> 0x0113 }
            goto L_0x0105
        L_0x00f7:
            com.android.billingclient.api.AlternativeChoiceDetails r13 = new com.android.billingclient.api.AlternativeChoiceDetails     // Catch:{ JSONException -> 0x0113 }
            r13.<init>(r12)     // Catch:{ JSONException -> 0x0113 }
            com.android.billingclient.api.zzk r12 = r11.zza     // Catch:{ JSONException -> 0x0113 }
            com.android.billingclient.api.AlternativeBillingListener r12 = r12.zzc     // Catch:{ JSONException -> 0x0113 }
            r12.userSelectedAlternativeBilling(r13)     // Catch:{ JSONException -> 0x0113 }
        L_0x0105:
            com.android.billingclient.api.zzk r11 = r11.zza
            com.android.billingclient.api.zzby r11 = r11.zze
            w3h r12 = com.android.billingclient.api.zzbx.zzd(r3)
            r11.zzb(r12)
            return
        L_0x0113:
            int r12 = defpackage.oyg.a
            com.android.billingclient.api.zzk r12 = r11.zza
            com.android.billingclient.api.zzby r12 = r12.zze
            com.android.billingclient.api.BillingResult r13 = com.android.billingclient.api.zzca.zzj
            r0 = 17
            t3h r0 = com.android.billingclient.api.zzbx.zzb(r0, r3, r13)
            r12.zza(r0)
            com.android.billingclient.api.zzk r11 = r11.zza
            com.android.billingclient.api.PurchasesUpdatedListener r11 = r11.zzb
            ayg r12 = defpackage.ayg.v
            r11.onPurchasesUpdated(r13, r12)
            return
        L_0x0132:
            com.android.billingclient.api.zzk r12 = r11.zza
            com.android.billingclient.api.zzby r12 = r12.zze
            com.android.billingclient.api.BillingResult r13 = com.android.billingclient.api.zzca.zzj
            r0 = 16
            t3h r0 = com.android.billingclient.api.zzbx.zzb(r0, r3, r13)
            r12.zza(r0)
            com.android.billingclient.api.zzk r11 = r11.zza
            com.android.billingclient.api.PurchasesUpdatedListener r11 = r11.zzb
            ayg r12 = defpackage.ayg.v
            r11.onPurchasesUpdated(r13, r12)
        L_0x014e:
            return
        L_0x014f:
            java.lang.String r4 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r4 = r12.getStringArrayList(r4)
            java.lang.String r6 = "INAPP_DATA_SIGNATURE_LIST"
            java.util.ArrayList r6 = r12.getStringArrayList(r6)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.String r8 = "BillingHelper"
            if (r4 == 0) goto L_0x01a4
            if (r6 != 0) goto L_0x0167
            goto L_0x01a4
        L_0x0167:
            int r0 = r4.size()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Found purchase list of "
            r9.<init>(r10)
            r9.append(r0)
            java.lang.String r0 = " items"
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            defpackage.oyg.e(r8, r0)
        L_0x0181:
            int r0 = r4.size()
            if (r5 >= r0) goto L_0x01bf
            int r0 = r6.size()
            if (r5 >= r0) goto L_0x01bf
            java.lang.Object r0 = r4.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r8 = r6.get(r5)
            java.lang.String r8 = (java.lang.String) r8
            com.android.billingclient.api.Purchase r0 = defpackage.oyg.f(r0, r8)
            if (r0 == 0) goto L_0x01a2
            r7.add(r0)
        L_0x01a2:
            int r5 = r5 + r1
            goto L_0x0181
        L_0x01a4:
            java.lang.String r4 = "INAPP_PURCHASE_DATA"
            java.lang.String r4 = r12.getString(r4)
            java.lang.String r5 = "INAPP_DATA_SIGNATURE"
            java.lang.String r5 = r12.getString(r5)
            com.android.billingclient.api.Purchase r4 = defpackage.oyg.f(r4, r5)
            if (r4 != 0) goto L_0x01bc
            java.lang.String r4 = "Couldn't find single purchase data as well."
            defpackage.oyg.e(r8, r4)
            goto L_0x01c0
        L_0x01bc:
            r7.add(r4)
        L_0x01bf:
            r0 = r7
        L_0x01c0:
            int r4 = r2.getResponseCode()
            if (r4 != 0) goto L_0x01d4
            com.android.billingclient.api.zzk r12 = r11.zza
            com.android.billingclient.api.zzby r12 = r12.zze
            w3h r3 = com.android.billingclient.api.zzbx.zzd(r3)
            r12.zzb(r3)
            goto L_0x01d7
        L_0x01d4:
            r11.zzc(r12, r2, r3)
        L_0x01d7:
            com.android.billingclient.api.zzk r12 = r11.zza
            com.android.billingclient.api.zzby r3 = r12.zze
            z3h r12 = com.android.billingclient.api.zzbx.zza(r13)
            nxg r13 = defpackage.rxg.b
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            defpackage.ct.M(r1, r12)
            ayg r5 = new ayg
            r5.<init>(r12, r1)
            boolean r9 = r11.zzd
            r4 = 4
            r8 = 0
            r6 = r0
            r7 = r2
            r3.zzf(r4, r5, r6, r7, r8, r9)
            com.android.billingclient.api.zzk r11 = r11.zza
            com.android.billingclient.api.PurchasesUpdatedListener r11 = r11.zzb
            r11.onPurchasesUpdated(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.zzj.onReceive(android.content.Context, android.content.Intent):void");
    }

    public final synchronized void zza(Context context, IntentFilter intentFilter) {
        try {
            if (!this.zzb) {
                zzk zzk = this.zza;
                this.zzd = zzk.zzh;
                zzby zzb2 = zzk.zze;
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    arrayList.add(zzbx.zza(intentFilter.getAction(i)));
                }
                int i2 = 2;
                zzb2.zze(2, arrayList, false, this.zzd);
                if (Build.VERSION.SDK_INT >= 33) {
                    if (true != this.zzc) {
                        i2 = 4;
                    }
                    context.registerReceiver(this, intentFilter, i2);
                } else {
                    context.registerReceiver(this, intentFilter);
                }
                this.zzb = true;
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized void zzb(Context context) {
        if (this.zzb) {
            context.unregisterReceiver(this);
            this.zzb = false;
            return;
        }
        int i = oyg.a;
    }
}

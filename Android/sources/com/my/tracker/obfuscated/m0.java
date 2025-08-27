package com.my.tracker.obfuscated;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

public final class m0 {
    public static final Boolean g;
    private static final Set h;
    final BillingClientStateListener a;
    private final AtomicBoolean b = new AtomicBoolean();
    private final List c;
    private final String d;
    private final b e;
    private final BillingClient f;

    public class a implements BillingClientStateListener {
        final AtomicInteger a = new AtomicInteger(0);
        final /* synthetic */ b b;

        public a(b bVar) {
            this.b = bVar;
        }

        public void onBillingServiceDisconnected() {
            if (this.a.incrementAndGet() >= 3 || !m0.this.c()) {
                x2.a("GooglePlayProductHelper: exceeded numbers of billing client connection attempts");
                this.b.a(1, Collections.emptyMap());
                m0.this.a();
            }
        }

        public void onBillingSetupFinished(BillingResult billingResult) {
            if (billingResult == null || billingResult.getResponseCode() != 0) {
                x2.a("GooglePlayProductHelper: error while connecting with billing client");
                onBillingServiceDisconnected();
                return;
            }
            x2.a("GooglePlayProductHelper: connection with billing client has been established");
            this.a.set(0);
            m0.this.b();
        }
    }

    public interface b {
        void a(int i, Map map);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0023  */
    static {
        /*
            java.lang.Class<com.android.billingclient.api.BillingClient> r0 = com.android.billingclient.api.BillingClient.class
            java.lang.Class<com.android.billingclient.api.Purchase> r1 = com.android.billingclient.api.Purchase.class
            boolean r1 = r1.equals(r1)     // Catch:{ all -> 0x0012 }
            if (r1 == 0) goto L_0x0012
            boolean r0 = r0.equals(r0)     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            g = r1
            if (r0 == 0) goto L_0x0023
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
        L_0x0020:
            h = r0
            goto L_0x0028
        L_0x0023:
            java.util.Set r0 = java.util.Collections.emptySet()
            goto L_0x0020
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.m0.<clinit>():void");
    }

    private m0(List list, String str, b bVar, Context context) {
        this.c = list;
        this.e = bVar;
        this.f = BillingClient.newBuilder(context).setListener(new hxf(20)).enablePendingPurchases().build();
        this.d = str;
        this.a = new a(bVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(BillingResult billingResult, List list) {
        m.a(new o6d(23, (Object) this, (Object) billingResult, list));
        a();
    }

    /* renamed from: d */
    public void b(BillingResult billingResult, List list) {
        if (!this.b.compareAndSet(false, true)) {
            x2.a("GooglePlayProductHelper: skuDetails has already been received");
            return;
        }
        int responseCode = billingResult != null ? billingResult.getResponseCode() : 6;
        if (responseCode != 0) {
            String debugMessage = billingResult != null ? billingResult.getDebugMessage() : "{empty message}";
            x2.a("GooglePlayProductHelper: getSkuDetails completed with errorCode: " + responseCode + ", message: " + debugMessage);
            this.e.a(1, Collections.emptyMap());
        } else if (list == null || list.isEmpty()) {
            x2.a("GooglePlayProductHelper: null list of skuDetail has been received");
            this.e.a(0, Collections.emptyMap());
        } else {
            HashMap hashMap = new HashMap();
            x2.a("GooglePlayProductHelper: populating map of skuDetails data");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SkuDetails skuDetails = (SkuDetails) it.next();
                try {
                    hashMap.put(skuDetails.getSku(), new JSONObject(skuDetails.getOriginalJson()));
                } catch (Throwable th) {
                    x2.b("GooglePlayProductHelper error: exception while parsing skuData", th);
                }
            }
            this.e.a(0, hashMap);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(BillingResult billingResult, List list) {
    }

    public void b() {
        try {
            x2.a("GooglePlayProductHelper: querying for " + this.d);
            this.f.querySkuDetailsAsync(SkuDetailsParams.newBuilder().setSkusList(this.c).setType(this.d).build(), new jrf(21, (Object) this));
        } catch (Throwable th) {
            x2.b("GooglePlayProductHelper error: exception while querying details for " + this.d, th);
            a();
        }
    }

    public boolean c() {
        try {
            x2.a("GooglePlayProductHelper: start connection with billing client");
            this.f.startConnection(this.a);
            h.add(this);
            return true;
        } catch (Throwable th) {
            x2.b("GooglePlayProductHelper error: exception while start connection:", th);
            return false;
        }
    }

    public static o0 a(Object obj) {
        if (!g.booleanValue()) {
            x2.b("GooglePlayProductHelper: purchase helper is disabled");
            return null;
        }
        try {
            if (obj instanceof Purchase) {
                Purchase purchase = (Purchase) obj;
                return o0.a(purchase.getOriginalJson(), purchase.getSignature(), v2.a());
            }
        } catch (Throwable th) {
            x2.b("GooglePlayProductHelper error: exception occurred while processing uncasted object", th);
        }
        return null;
    }

    public void a() {
        try {
            x2.a("GooglePlayProductHelper: end connection with billing client");
            h.remove(this);
            this.f.endConnection();
        } catch (Throwable th) {
            x2.b("GooglePlayProductHelper error: exception while end connection:", th);
        }
    }

    public static void a(List list, boolean z, b bVar, Context context) {
        if (list.isEmpty()) {
            x2.a("GooglePlayProductHelper: empty purchases list");
            bVar.a(0, Collections.emptyMap());
            return;
        }
        String str = z ? "subs" : "inapp";
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String c2 = ((o0) it.next()).c();
            if (!arrayList.contains(c2)) {
                arrayList.add(c2);
            }
        }
        m.f(new jh3(20, arrayList, str, bVar, context));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(List list, String str, b bVar, Context context) {
        try {
            m0 m0Var = new m0(list, str, bVar, context);
            if (!m0Var.c()) {
                m0Var.a();
                bVar.a(1, Collections.emptyMap());
            }
        } catch (Throwable th) {
            x2.b("GooglePlayProductHelper error: error while creating ProductHelper", th);
        }
    }
}

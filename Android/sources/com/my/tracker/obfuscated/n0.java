package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.my.tracker.obfuscated.e0;
import com.my.tracker.obfuscated.m0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class n0 {
    final Context a;
    final e0 b;
    final e0.c c = new jrf(22, (Object) this);

    public final class a implements m0.b {
        private final List a;

        public a(List list) {
            this.a = list;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(Map map) {
            for (o0 o0Var : this.a) {
                o0Var.a((JSONObject) map.get(o0Var.c()));
            }
            n0.this.b.d(this.a);
        }

        public void a(int i, Map map) {
            if (i == 1) {
                x2.b("GooglePlayPurchaseHandler error: can't retrieve information about products");
            } else {
                m.a(new d3(2, this, map));
            }
        }
    }

    private n0(e0 e0Var, Context context) {
        this.b = e0Var;
        this.a = context.getApplicationContext();
    }

    public void a() {
        this.b.a(this.c);
    }

    public void b(List list) {
        x2.a("GooglePlayPurchaseHandler: processing raw purchases");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o0 o0Var = (o0) it.next();
            String c2 = o0Var.c();
            if (o0Var.g()) {
                x2.a("GooglePlayPurchaseHandler: inapp raw purchase, product id: " + c2);
                arrayList2.add(o0Var);
            } else {
                x2.a("GooglePlayPurchaseHandler: subs raw purchase, product id: " + c2);
                arrayList.add(o0Var);
            }
        }
        a((List) arrayList, false);
        a((List) arrayList2, true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2) {
        o0 a2 = o0.a(str, str2, v2.a());
        if (a2 != null) {
            this.b.a(Collections.singletonList(a2), this.c);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        x2.a("GooglePlayPurchaseHandler: iterating over unchecked list of objects");
        ArrayList arrayList = new ArrayList();
        for (Object a2 : list) {
            o0 a3 = m0.a(a2);
            if (a3 == null) {
                x2.a("GooglePlayPurchaseHandler: null purchase data after processing");
            } else {
                arrayList.add(a3);
            }
        }
        if (arrayList.isEmpty()) {
            x2.a("GooglePlayPurchaseHandler: skip empty purchases list");
        } else {
            this.b.a((List) arrayList, this.c);
        }
    }

    public static n0 a(e0 e0Var, Context context) {
        return new n0(e0Var, context);
    }

    public void a(int i, Intent intent) {
        if (!m0.g.booleanValue()) {
            x2.b("GooglePlayPurchaseHandler error: classes com.android.billingclient:billing aren't found");
        } else if (i != -1) {
            x2.a("GooglePlayPurchaseHandler: result code isn't equal to RESULT_OK");
        } else if (intent == null) {
            x2.a("GooglePlayPurchaseHandler: empty intent has been received");
        } else {
            String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
            if (TextUtils.isEmpty(stringExtra)) {
                x2.a("GooglePlayPurchaseHandler: empty purchase data in intent");
                return;
            }
            String stringExtra2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
            if (stringExtra2 == null) {
                x2.a("GooglePlayPurchaseHandler: null data signature in intent");
            } else {
                m.a(new o6d((Object) this, (Object) stringExtra, (Object) stringExtra2, 24));
            }
        }
    }

    public void a(int i, List list) {
        if (i != 0) {
            x2.a("GooglePlayPurchaseHandler: response code isn't equal to BILLING_OK_RESPONSE_CODE");
        } else if (list == null || list.isEmpty()) {
            x2.a("GooglePlayPurchaseHandler: null or empty purchases list has been received");
        } else if (!m0.g.booleanValue()) {
            x2.b("GooglePlayPurchaseHandler error: classes com.android.billingclient:billing aren't found");
        } else {
            m.a(new l8g(23, this, list));
        }
    }

    public void a(List list, boolean z) {
        if (list.isEmpty()) {
            x2.a(z ? "GooglePlayPurchaseHandler: empty inapp raw purchases list" : "GooglePlayPurchaseHandler: empty subs raw purchases list");
        } else {
            m0.a(list, z, (m0.b) new a(list), this.a);
        }
    }

    public void a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map map) {
        this.b.a(jSONObject, jSONObject2, str, map);
    }
}

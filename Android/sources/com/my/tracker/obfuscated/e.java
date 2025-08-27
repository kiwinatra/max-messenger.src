package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import com.my.tracker.obfuscated.d;
import com.my.tracker.obfuscated.e0;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class e implements e0.a, d.b {
    final e0 a;
    final p1 b;
    final d c;

    private e(e0 e0Var, p1 p1Var, d.a aVar) {
        this.a = e0Var;
        this.b = p1Var;
        this.c = aVar.a(this);
    }

    public void c(List list) {
        if (list.isEmpty()) {
            x2.a("AppGalleryPurchaseHandler: can't trackAppGalleryRawPurchases, appGalleryRawPurchases is empty");
        } else {
            this.a.c(list);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.b.b() < 86400000) {
            x2.a("AppGalleryPurchaseHandler: not yet time for tracking");
            return;
        }
        this.c.a();
        this.b.a(currentTimeMillis);
    }

    public void a() {
        this.a.a((e0.a) this);
        c();
    }

    public void c() {
        m.a(new qof(17, this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Object obj, String str, String str2, String str3, Map map) {
        JSONObject a2 = d.a(obj);
        if (a2 == null) {
            x2.a("AppGalleryPurchaseHandler: error parse productInfo object");
        } else {
            this.a.a(a2, str, str2, str3, map);
        }
    }

    public void b(List list) {
        if (list.isEmpty()) {
            x2.a("AppGalleryPurchaseHandler: empty subs raw purchases list");
        } else {
            this.c.a(list);
        }
    }

    public static e a(e0 e0Var, p1 p1Var, Context context) {
        d.a a2 = d.a(context.getApplicationContext());
        if (a2 != null) {
            return new e(e0Var, p1Var, a2);
        }
        x2.a("AppGalleryPurchaseHandler: can't support appGallery purchases ");
        return null;
    }

    public void b(Object obj, String str, String str2, String str3, Map map) {
        m.a(new qx4(this, obj, str, str2, str3, map, 2));
    }

    public void a(int i, Intent intent) {
        if (i != -1) {
            x2.a("AppGalleryPurchaseHandler: result code isn't equal to RESULT_OK");
        } else if (intent == null) {
            x2.a("AppGalleryPurchaseHandler: empty intent has been received");
        } else {
            this.c.a(intent);
        }
    }

    public void a(List list) {
        if (list.isEmpty()) {
            x2.a("AppGalleryPurchaseHandler: can't addAppGalleryRawPurchases, appGalleryRawPurchases is empty");
        } else {
            this.a.a(list, (e0.a) this);
        }
    }
}

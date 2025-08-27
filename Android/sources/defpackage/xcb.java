package defpackage;

import android.os.Build;
import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;

/* renamed from: xcb  reason: default package */
public final class xcb {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final ddb d;
    public final ddb e;
    public final ddb f;
    public final ddb g;
    public final ddb h;
    public final ddb i;
    public final ddb j;

    public xcb(gaf gaf, Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        jx3 a2 = e14.a(((osa) gaf).b());
        ddb ddb = new ddb(edb.k);
        this.d = ddb;
        ddb ddb2 = new ddb(edb.f);
        this.e = ddb2;
        ddb ddb3 = new ddb(edb.m);
        this.f = ddb3;
        ddb ddb4 = new ddb(new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"});
        this.g = ddb4;
        ddb ddb5 = new ddb(edb.l);
        this.h = ddb5;
        ddb ddb6 = new ddb(edb.h);
        this.i = ddb6;
        ddb ddb7 = new ddb(edb.j);
        this.j = ddb7;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            bs0.K(new ps5(ddb, new rcb(this, (Continuation) null), 5), a2);
        }
        bs0.K(new ps5(ddb2, new scb(this, (Continuation) null), 5), a2);
        if (i2 >= 34) {
            bs0.K(new i21(ddb3, ddb4, new x2(this, (Continuation) null, 19), 4), a2);
        } else {
            bs0.K(new ps5(ddb3, new tcb(this, (Continuation) null), 5), a2);
        }
        bs0.K(new ps5(ddb5, new ucb(this, (Continuation) null), 5), a2);
        bs0.K(new ps5(ddb6, new vcb(this, (Continuation) null), 5), a2);
        bs0.K(new ps5(ddb7, new wcb(this, (Continuation) null), 5), a2);
    }

    public static final void a(xcb xcb, String str, String str2) {
        Integer d2 = ((z5a) xcb.c.getValue()).d();
        if (d2 != null) {
            Map createMapBuilder = MapsKt.createMapBuilder();
            createMapBuilder.put("pType", str);
            createMapBuilder.put("screen", d2);
            createMapBuilder.put("pStatus", str2);
            xcb.d("permission_changed_state", MapsKt.build(createMapBuilder));
        }
    }

    public static final String b(xcb xcb, zcb zcb) {
        xcb.getClass();
        return zcb == zcb.a ? "allowed" : "denied";
    }

    public static String c(ddb ddb) {
        return ddb.i() ? "allowed" : "denied";
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [hj7, java.lang.Object] */
    public final void d(String str, Map map) {
        ? obj = new Object();
        obj.v = "PERMISSION";
        Lazy lazy = this.b;
        obj.b = ((qjd) ((x23) lazy.getValue())).s();
        obj.w = str;
        obj.a = System.currentTimeMillis();
        obj.c(map);
        obj.c = ((a33) ((x23) lazy.getValue())).B();
        ((nd) this.a.getValue()).j(obj.d());
    }
}

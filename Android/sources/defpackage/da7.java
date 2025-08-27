package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.Set;
import kotlin.collections.SetsKt;

/* renamed from: da7  reason: default package */
public final class da7 {
    public final ad4 a;
    public final cd4 b;
    public final cd4 c;
    public final Context d;
    public final nt4 e;
    public final sp4 f;
    public final af4 g;
    public final ma5 h;
    public final t9a i;
    public final w2f j;
    public final kp4 k;
    public final u9a l;
    public final kne m;
    public final oqb n;
    public final d6a o;
    public final Set p;
    public final Set q;
    public final Set r;
    public final boolean s;
    public final kp4 t;
    public final ata u;
    public final f7a v;
    public final boolean w;
    public final bk3 x;
    public final bk3 y;

    /* JADX WARNING: type inference failed for: r0v2, types: [cd4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, af4] */
    /* JADX WARNING: type inference failed for: r5v4, types: [java.lang.Object, bk3] */
    public da7(ca7 ca7) {
        t9a t9a;
        tf6.P();
        cs csVar = ca7.m;
        csVar.getClass();
        this.v = new f7a(csVar);
        Object systemService = ca7.b.getSystemService("activity");
        if (systemService != null) {
            this.a = new ad4((ActivityManager) systemService);
            this.b = new Object();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            cd4 cd4 = ca7.a;
            this.c = cd4 == null ? cd4.h() : cd4;
            Context context = ca7.b;
            if (context != null) {
                this.d = context;
                this.e = ca7.c;
                this.g = new Object();
                synchronized (t9a.class) {
                    try {
                        if (t9a.b == null) {
                            t9a.b = new t9a(0);
                        }
                        t9a = t9a.b;
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                this.i = t9a;
                this.j = kne.m;
                kp4 kp4 = ca7.e;
                if (kp4 == null) {
                    Context context2 = ca7.b;
                    tf6.P();
                    kp4 = new kp4(new jp4(context2));
                }
                this.k = kp4;
                this.l = u9a.a();
                int i2 = ca7.l;
                i2 = i2 < 0 ? 30000 : i2;
                tf6.P();
                kne kne = ca7.f;
                this.m = kne == null ? new q57(i2) : kne;
                oqb oqb = ca7.g;
                oqb = oqb == null ? new oqb(new nqb(new p7d(19))) : oqb;
                this.n = oqb;
                this.o = new d6a(7);
                Set set = ca7.h;
                this.p = set == null ? SetsKt.emptySet() : set;
                this.q = SetsKt.emptySet();
                this.r = SetsKt.emptySet();
                this.s = ca7.i;
                kp4 kp42 = ca7.j;
                this.t = kp42 != null ? kp42 : kp4;
                this.u = ca7.k;
                int i3 = oqb.a.c.d;
                ma5 ma5 = ca7.d;
                this.h = ma5 == null ? new q13(i3) : ma5;
                this.w = ca7.n;
                this.x = ca7.o;
                this.y = new Object();
                sx6 sx6 = new sx6(11);
                xv1 xv1 = new xv1(17);
                xv1.b = sx6;
                this.f = new sp4(xv1, this);
                tf6.P();
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}

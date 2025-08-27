package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import java.util.Set;

/* renamed from: lnb  reason: default package */
public final class lnb implements r2f {
    public final Context a;
    public final ba7 b;
    public final ay2 c;

    public lnb(l15 l15, Context context) {
        ea7 g = ea7.g();
        this.a = context;
        ba7 f = g.f();
        this.b = f;
        ay2 ay2 = (ay2) l15.b;
        if (ay2 != null) {
            this.c = ay2;
        } else {
            this.c = new ay2(5);
        }
        ay2 ay22 = this.c;
        Resources resources = context.getResources();
        pk4 x = pk4.x();
        xc4 a2 = g.a();
        g.b.v.getClass();
        if (dvf.b == null) {
            dvf.b = new dvf(new Handler(Looper.getMainLooper()));
        }
        dvf dvf = dvf.b;
        ay22.b = resources;
        ay22.c = x;
        ay22.o = a2;
        ay22.getClass();
        ay22.v = dvf;
        ay22.w = (zqd) f.f;
        ay22.x = (a00) l15.a;
        ay22.y = (r2f) l15.c;
    }

    /* renamed from: a */
    public final knb get() {
        knb knb = new knb(this.a, this.c, this.b, (Set) null, (Set) null);
        knb.r = null;
        return knb;
    }
}

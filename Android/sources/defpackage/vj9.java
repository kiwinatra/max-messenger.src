package defpackage;

import android.content.Context;
import android.text.Layout;
import android.text.TextPaint;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import org.apache.http.HttpStatus;

/* renamed from: vj9  reason: default package */
public final class vj9 implements hf9 {
    public final Context a;
    public final String b = vj9.class.getName();
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final ConcurrentHashMap g;
    public final jx3 h;
    public final Lazy i;

    public vj9(gaf gaf, xe3 xe3, Lazy lazy, Lazy lazy2, Lazy lazy3, Context context) {
        this.a = context;
        this.c = lazy;
        this.d = lazy2;
        this.e = lazy3;
        this.f = LazyKt.lazy(new we9(100, 1));
        this.g = new ConcurrentHashMap();
        this.h = e14.a(((osa) gaf).a());
        this.i = LazyKt.lazy(new of5(6, (Object) lazy, 4));
        xe3.a(xe3.c | xe3.d, new nj9(0, this));
    }

    public static /* synthetic */ void c(vj9 vj9, a32 a32, a89 a89, boolean z, int i2) {
        if ((i2 & 8) != 0) {
            z = false;
        }
        vj9.b(a32, a89, (CharSequence) null, z);
    }

    public static jf9 e(vj9 vj9, a32 a32, a89 a89, boolean z) {
        vj9.getClass();
        pj9 pj9 = new pj9(a32, a89, false);
        tb8 tb8 = (tb8) vj9.f.getValue();
        Object c2 = tb8.c(pj9);
        if (c2 == null) {
            c2 = vj9.b(a32, a89, (CharSequence) null, false);
            tb8.d(pj9, c2);
        }
        gs7 gs7 = (gs7) c2;
        return z ? gs7.a : gs7.b;
    }

    public final void a(jf9 jf9, gf9 gf9) {
        gf9 gf92 = gf9.a;
        z68.c(this.b, "invalidate by reason " + gf92, new Object[0]);
        c(this, jf9.a, jf9.b, false, 12);
    }

    public final gs7 b(a32 a32, a89 a89, CharSequence charSequence, boolean z) {
        Lazy lazy;
        a32 a322 = a32;
        a89 a892 = a89;
        pj9 pj9 = new pj9(a322, a892, z);
        for (a89 a893 : ((j2b) ((qgf) this.d.getValue())).a(a892)) {
            if (a893 != a892) {
                c(this, a322, a893, true, 4);
            }
        }
        Lazy lazy2 = this.f;
        gs7 gs7 = (gs7) ((tb8) lazy2.getValue()).c(pj9);
        Lazy lazy3 = this.c;
        int d2 = ((et0) lazy3.getValue()).d();
        int e2 = ((et0) lazy3.getValue()).e();
        int i2 = d2;
        Lazy lazy4 = LazyKt.lazy(new oj9(this, a32, a89, d2, charSequence, z, 0));
        boolean z2 = false;
        boolean z3 = i2 == e2;
        if (z3) {
            lazy = lazy4;
        } else {
            lazy = lazy4;
            lazy4 = LazyKt.lazy(new oj9(this, a32, a89, e2, charSequence, z, 1));
        }
        if (this.a.getResources().getConfiguration().orientation == 1) {
            z2 = true;
        }
        jx3 jx3 = this.h;
        if (gs7 != null) {
            jf9 jf9 = gs7.b;
            if (z3 || z2) {
                jf9 jf92 = gs7.a;
                jf92.b((Layout) lazy.getValue());
                if (jf92 != jf9) {
                    ev0.v(jx3, (CoroutineContext) null, (f14) null, new qj9(gs7, lazy4, (Continuation) null), 3);
                }
            } else {
                jf9.b((Layout) lazy4.getValue());
                ev0.v(jx3, (CoroutineContext) null, (f14) null, new rj9(gs7, lazy, (Continuation) null), 3);
            }
        } else {
            jf9 jf93 = new jf9(a322, a892, this, lazy);
            jf9 jf94 = z3 ? jf93 : new jf9(a322, a892, this, lazy4);
            gs7 = new gs7(jf93, jf94);
            ((tb8) lazy2.getValue()).d(pj9, gs7);
            if (z3 || z2) {
                jf93.b((Layout) lazy.getValue());
                if (jf93 != jf94) {
                    ev0.v(jx3, (CoroutineContext) null, (f14) null, new sj9(gs7, lazy4, (Continuation) null), 3);
                }
            } else {
                jf94.b((Layout) lazy4.getValue());
                ev0.v(jx3, (CoroutineContext) null, (f14) null, new tj9(gs7, lazy, (Continuation) null), 3);
            }
        }
        return gs7;
    }

    public final Layout d(a32 a32, a89 a89, int i2, CharSequence charSequence, boolean z) {
        mq4 mq4;
        a32 a322 = a32;
        a89 a892 = a89;
        CharSequence charSequence2 = charSequence;
        boolean z2 = z;
        Lazy lazy = this.d;
        pgf c2 = ((j2b) ((qgf) lazy.getValue())).c(a322, a892);
        Lazy lazy2 = this.c;
        if (c2 == null) {
            c2 = new pgf(((et0) lazy2.getValue()).a(a89.f()), a892.c(a322), true, false, HttpStatus.SC_GATEWAY_TIMEOUT);
        }
        if (charSequence2 != null) {
            c2 = pgf.a(c2, charSequence2, 0, HttpStatus.SC_NOT_IMPLEMENTED);
        }
        pgf a2 = pgf.a(c2, ((j2b) ((qgf) lazy.getValue())).d(c2.b, z2), 0, 509);
        boolean z3 = a2.d;
        CharSequence charSequence3 = a2.b;
        if (z3) {
            pj9 pj9 = new pj9(a322, a892, z2);
            ConcurrentHashMap concurrentHashMap = this.g;
            if (!concurrentHashMap.containsKey(pj9) || (mq4 = (mq4) concurrentHashMap.get(pj9)) == null || mq4.f()) {
                mq4 mq42 = (mq4) concurrentHashMap.get(pj9);
                if (mq42 != null) {
                    mq42.dispose();
                }
                si8 b2 = ((j2b) ((qgf) lazy.getValue())).b(charSequence3);
                oh8 oh8 = new oh8(new pv0((Object) charSequence3, (Object) this, (Object) a32, (Object) a89, z, 6), new y35(28, (Object) this), new p00(14, this, pj9));
                b2.a(oh8);
                concurrentHashMap.put(pj9, oh8);
            }
        }
        if (!a2.j) {
            a2 = pgf.a(a2, (CharSequence) null, 1, 495);
        }
        Object c3 = ((uj9) this.i.getValue()).c(TuplesKt.to(Integer.valueOf(((et0) lazy2.getValue()).f(a89.f())), Float.valueOf(a2.a)));
        if (c3 != null) {
            int i3 = (i2 - a2.h) - a2.i;
            return ((ds7) this.e.getValue()).a(charSequence3, (TextPaint) c3, i3, a2.e, a2.c, a2.f);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}

package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;

/* renamed from: x0d  reason: default package */
public final class x0d implements fe6 {
    public final ba7 a;
    public final String b = x0d.class.getName();
    public ce6 c;
    public i0 d;
    public i0 e;

    public x0d(ba7 ba7) {
        this.a = ba7;
        ce6 ce6 = ce6.d;
        this.c = ce6.d;
    }

    public final ce6 h() {
        return this.c;
    }

    public final boolean i() {
        g4g g4g = this.c.a;
        return (g4g != null ? g4g.b() : null) != null;
    }

    public final Object j(long j, Continuation continuation) {
        i0 i0Var = this.e;
        if (i0Var != null) {
            i0Var.a();
        }
        this.e = null;
        g4g g4g = this.c.a;
        zy b2 = g4g != null ? g4g.b() : null;
        if (g4g == null || b2 == null) {
            z68.f(this.b, "Video collage is null", (Throwable) null);
            return null;
        }
        lw1 lw1 = new lw1(1, IntrinsicsKt.intercepted(continuation));
        lw1.u();
        ra7 d2 = ra7.d(Uri.parse((String) b2.w));
        d2.p = nt4.c;
        d2.l = new ne6(g4g, j);
        i0 a2 = this.a.a(d2.a(), (Object) null);
        this.e = a2;
        a2.m(new q97(lw1, a2, this), io1.a);
        Object t = lw1.t();
        if (t == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return t;
    }

    public final void prepare() {
        g4g g4g = this.c.a;
        String str = this.b;
        if (g4g == null) {
            z68.f(str, "You should call init before prepare!", (Throwable) null);
            return;
        }
        zy b2 = g4g.b();
        if (b2 == null) {
            z68.f(str, "Video collage is null", (Throwable) null);
            return;
        }
        ra7 d2 = ra7.d(Uri.parse((String) b2.w));
        d2.p = nt4.c;
        i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.a();
        }
        this.d = null;
        this.d = this.a.f(d2.a(), (f0) null);
    }
}

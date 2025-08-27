package defpackage;

import android.content.Context;
import java.util.Locale;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: is8  reason: default package */
public final class is8 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ ns8 b;
    public final /* synthetic */ a89 c;
    public final /* synthetic */ Long o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public is8(Object obj, Continuation continuation, ns8 ns8, a89 a89, Long l) {
        super(2, continuation);
        this.a = obj;
        this.b = ns8;
        this.c = a89;
        this.o = l;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new is8(this.a, continuation, this.b, this.c, this.o);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((is8) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        g29 g29;
        String str2;
        boolean z;
        ngf ngf;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        l20 l20 = (l20) this.a;
        if ((l20 != null ? l20.j : null) == null) {
            return null;
        }
        long hashCode = (long) l20.q.hashCode();
        ns8 ns8 = this.b;
        Context context = ns8.a;
        Locale u = ((qjd) ns8.b).u();
        a89 a89 = this.c;
        String C = j4b.C(context, u, a89.a.o, true);
        s10 s10 = l20.j;
        l20 l202 = s10.d;
        h29 h29 = (l202 == null || !l202.i()) ? (l202 == null || !l202.f() || l202.b.v) ? h29.c : h29.a : h29.b;
        d20 d20 = l20.n;
        int i = d20 == null ? -1 : fs8.$EnumSwitchMapping$1[d20.ordinal()];
        Context context2 = ns8.a;
        ha9 ha9 = a89.a;
        long j = s10.b;
        if (i == 1 || i == 2 || i == 3) {
            str = C;
            g29 = new f29(new mgf(ghf.x(j, false, context2)));
        } else {
            Long l = this.o;
            if (i == 4) {
                str = C;
                boolean z2 = true;
                mgf mgf = new mgf(ghf.x(j, false, context2));
                long j2 = ha9.b;
                if (l == null || j2 != l.longValue()) {
                    z2 = false;
                }
                g29 = new d29(mgf, z2);
            } else if (i != 5) {
                g29 = new d29(new mgf(ghf.x(j, false, context2)), l != null && ha9.b == l.longValue());
                str = C;
            } else {
                int i2 = (s10.a > 0 ? 1 : (s10.a == 0 ? 0 : -1));
                float f = l20.p;
                long j3 = i2 == 0 ? (long) ((f / 100.0f) * ((float) j)) : l20.u;
                long j4 = l20.t;
                if (j4 > 0) {
                    str = C;
                    ngf = new mgf(g63.i(ghf.x(j3, false, context2), "/", ghf.w(ghf.m(j4), j4, context2, true)));
                } else {
                    str = C;
                    ngf = new igf(ewa.t);
                }
                g29 = new e29(ngf, f);
            }
        }
        long j5 = ha9.b;
        if (l202 != null) {
            str2 = ev0.F(l202);
            z = false;
        } else {
            z = false;
            str2 = null;
        }
        String x = ghf.x(j, z, context2);
        cd4 cd4 = vk5.b;
        String J = ld8.J(s10);
        cd4.getClass();
        return new i29(hashCode, j5, s10.a, str2, s10.c, str, x, l20.q, l20.r, h29, g29, cd4.l(J));
    }
}

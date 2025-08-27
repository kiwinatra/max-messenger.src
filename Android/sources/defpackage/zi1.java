package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function5;

/* renamed from: zi1  reason: default package */
public final class zi1 extends SuspendLambda implements Function5 {
    public /* synthetic */ Long a;
    public /* synthetic */ k91 b;
    public /* synthetic */ boolean c;
    public /* synthetic */ CharSequence o;
    public final /* synthetic */ jj1 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zi1(jj1 jj1, Continuation continuation) {
        super(5, continuation);
        this.v = jj1;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        zi1 zi1 = new zi1(this.v, (Continuation) obj5);
        zi1.a = (Long) obj;
        zi1.b = (k91) obj2;
        zi1.c = booleanValue;
        zi1.o = (CharSequence) obj4;
        return zi1.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        CharSequence charSequence;
        jl1 jl1;
        ld8 ld8;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Long l = this.a;
        k91 k91 = this.b;
        boolean z = this.c;
        CharSequence charSequence2 = this.o;
        jj1 jj1 = this.v;
        xme xme = jj1.H0;
        do {
            value = xme.getValue();
            jl1 jl12 = (jl1) value;
            l21 l21 = k91.f;
            String str = null;
            CharSequence charSequence3 = l21 != null ? l21.b : null;
            boolean n = jj1.n();
            boolean z2 = k91.d;
            me5 me5 = k91.e;
            boolean z3 = k91.m;
            boolean z4 = k91.g;
            hl1 hl1 = jj1.x;
            if (n) {
                hl1.getClass();
                String c2 = hl1.c(l);
                String d = hl1.d(z4, z2, z3, me5);
                if (d != null) {
                    ld8 = new knf(d);
                } else {
                    if (z4) {
                        if (c2 == null || c2.length() == 0) {
                            str = charSequence2;
                        } else {
                            str = c2 + " · " + charSequence2;
                        }
                    } else if (!(c2 == null || c2.length() == 0)) {
                        str = c2;
                    }
                    ld8 = new jnf(str);
                }
                charSequence = ld8.P();
            } else {
                charSequence = hl1.d(z4, z2, z3, me5);
            }
            if (charSequence == null) {
                hl1.getClass();
                charSequence = hl1.c(l);
            }
            if (me5 instanceof je5) {
                il1 il1 = z4 ? il1.a : jl12.a;
                jl12.getClass();
                jl1 = new jl1(il1, charSequence3, charSequence);
            } else {
                il1 il12 = (z4 || (z && z3)) ? il1.a : il1.b;
                jl12.getClass();
                jl1 = new jl1(il12, charSequence3, charSequence);
                ll1 ll1 = (ll1) jj1.N0.getValue();
                ll1.b = jl1;
                for (kl1 r : ll1.a) {
                    r.r(jl1);
                }
            }
        } while (!xme.b(value, jl1));
        return Unit.INSTANCE;
    }
}

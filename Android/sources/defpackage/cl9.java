package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;

/* renamed from: cl9  reason: default package */
public final class cl9 extends SuspendLambda implements Function4 {
    public /* synthetic */ boolean a;
    public /* synthetic */ a32 b;
    public /* synthetic */ gpe c;
    public final /* synthetic */ en9 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cl9(en9 en9, Continuation continuation) {
        super(4, continuation);
        this.o = en9;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        cl9 cl9 = new cl9(this.o, (Continuation) obj4);
        cl9.a = booleanValue;
        cl9.b = (a32) obj2;
        cl9.c = (gpe) obj3;
        return cl9.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        z45 z45;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean z = this.a;
        a32 a32 = this.b;
        gpe gpe = this.c;
        jl0 jl0 = jl0.a;
        if (z) {
            if (a32.b.h(((qjd) this.o.x0).s())) {
                return new b55(a32.h(kl0.c, jl0), new igf(ewa.r0), new igf(ewa.q0));
            }
        }
        kl0 kl0 = kl0.b;
        CharSequence charSequence = null;
        if (z && a32.J() && (a32.h0() || a32.b.a == 0)) {
            String h = a32.h(kl0, jl0);
            vk3 m = a32.m();
            if (m != null) {
                charSequence = m.q();
            }
            z45 = new z45(h, charSequence, a32.g(), new igf(ewa.d), new igf(ewa.c));
        } else if (z && a32.J()) {
            String h2 = a32.h(kl0, jl0);
            vk3 m2 = a32.m();
            if (m2 != null) {
                charSequence = m2.q();
            }
            z45 = new z45(h2, charSequence, a32.g(), new igf(ewa.b), new igf(ewa.a));
        } else if (!z || !a32.N() || a32.I()) {
            return null;
        } else {
            return new a55(gpe);
        }
        return z45;
    }
}

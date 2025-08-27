package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: d82  reason: default package */
public final class d82 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ m82 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d82(int i, m82 m82, Continuation continuation) {
        super(2, continuation);
        this.b = i;
        this.c = m82;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new d82(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d82) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.a) {
            case 0:
                ResultKt.throwOnFailure(obj);
                int i = fxa.u;
                m82 m82 = this.c;
                int i2 = this.b;
                if (i2 == i) {
                    a32 p = m82.p();
                    if (p == null || !p.d()) {
                        this.a = 2;
                        if (m82.n(m82) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        n6e n6e = m82.e;
                        m82.c().getClass();
                        g0c g0c = new g0c(new igf(ixa.O), (ngf) null, CollectionsKt.listOf(new pg3(fxa.t, new igf(ixa.N), og3.a), new pg3(fxa.s, new igf(ixa.M), og3.b)));
                        this.a = 1;
                        if (n6e.a(g0c, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (i2 == fxa.q) {
                    a32 p2 = m82.p();
                    if (p2 == null || !p2.d()) {
                        this.a = 4;
                        if (m82.n(m82) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        n6e n6e2 = m82.e;
                        m82.c().getClass();
                        g0c g0c2 = new g0c(new igf(ixa.H), (ngf) null, CollectionsKt.listOf(new pg3(fxa.p, new igf(ixa.G), og3.a), new pg3(fxa.o, new igf(ixa.F), og3.b)));
                        this.a = 3;
                        if (n6e2.a(g0c2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (i2 == fxa.t || i2 == fxa.p) {
                    this.a = 5;
                    if (m82.n(m82) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 == fxa.m || i2 == fxa.j) {
                    this.a = 6;
                    KProperty[] kPropertyArr = m82.F;
                    Object I = ev0.I(((osa) m82.q()).b(), new a82(m82, (Continuation) null), this);
                    if (I != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        I = Unit.INSTANCE;
                    }
                    if (I == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 == fxa.C || i2 == fxa.y) {
                    this.a = 7;
                    KProperty[] kPropertyArr2 = m82.F;
                    aje u = ev0.u(m82.a, ((osa) m82.q()).b(), f14.b, new c82(m82, (Continuation) null));
                    m82.z.setValue(m82, m82.F[0], u);
                    if (Unit.INSTANCE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 == fxa.A || i2 == fxa.w) {
                    n6e n6e3 = m82.e;
                    vzb.b.getClass();
                    pa4 pa4 = new pa4(":profile/change-owner?chat_id=" + m82.o + "&leave_chat=true");
                    this.a = 8;
                    if (n6e3.a(pa4, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                ResultKt.throwOnFailure(obj);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}

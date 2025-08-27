package defpackage;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ym3  reason: default package */
public final class ym3 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ pn3 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ym3(int i, pn3 pn3, Continuation continuation) {
        super(2, continuation);
        this.b = i;
        this.c = pn3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ym3(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ym3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.a;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            igf igf = null;
            pn3 pn3 = this.c;
            int i3 = this.b;
            if (i3 == 256) {
                ev0.v(pn3.a, ((osa) pn3.q()).b(), (f14) null, new cn3(pn3, false, (Continuation) null), 2);
            } else if (i3 == 128) {
                this.a = 1;
                if (pn3.n(pn3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i3 == fxa.e0) {
                this.a = 2;
                if (pn3.n(pn3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i3 == 64) {
                this.a = 3;
                n6e n6e = pn3.e;
                pn3.c().getClass();
                igf igf2 = new igf(ixa.g0);
                List createListBuilder = CollectionsKt.createListBuilder();
                for (m0g m0g : yz4.a) {
                    int ordinal = m0g.ordinal();
                    if (ordinal == 0) {
                        i = fxa.b;
                    } else if (ordinal == 1) {
                        i = fxa.c;
                    } else if (ordinal == 2) {
                        i = fxa.d;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    createListBuilder.add(new pg3(i, new egf(hxa.a, m0g.b), og3.b));
                }
                Unit unit = Unit.INSTANCE;
                Object a2 = n6e.a(new g0c(igf2, (ngf) null, CollectionsKt.build(createListBuilder)), this);
                if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    a2 = Unit.INSTANCE;
                }
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i3 == 512) {
                this.a = 4;
                n6e n6e2 = pn3.e;
                zz4 c2 = pn3.c();
                boolean p = ((mp1) ((dp1) pn3.v.getValue())).p();
                c2.getClass();
                igf igf3 = new igf(ixa.y0);
                if (p) {
                    igf = new igf(ixa.w0);
                }
                List createListBuilder2 = CollectionsKt.createListBuilder();
                createListBuilder2.add(new pg3(fxa.k0, p ? new igf(ixa.v0) : new igf(ixa.x0), og3.a));
                createListBuilder2.add(new pg3(fxa.e, new igf(ixa.D0), og3.b));
                Unit unit2 = Unit.INSTANCE;
                Object a3 = n6e2.a(new g0c(igf3, igf, CollectionsKt.build(createListBuilder2)), this);
                if (a3 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    a3 = Unit.INSTANCE;
                }
                if (a3 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i3 == fxa.v0) {
                n6e n6e3 = pn3.e;
                xzb xzb = new xzb(pn3.o, gzb.CONTACT);
                this.a = 5;
                if (n6e3.a(xzb, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}

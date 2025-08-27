package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: gn3  reason: default package */
public final class gn3 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ pn3 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gn3(pn3 pn3, Continuation continuation) {
        super(2, continuation);
        this.b = pn3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new gn3(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gn3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            pn3 pn3 = this.b;
            n6e n6e = pn3.e;
            zz4 c = pn3.c();
            azb azb = (azb) pn3.c.getValue();
            boolean z = false;
            if (!(azb == null || azb.a == null)) {
                z = true;
            }
            c.getClass();
            igf igf = new igf(ixa.n);
            List createListBuilder = CollectionsKt.createListBuilder();
            int i2 = fxa.Y;
            igf igf2 = new igf(ixa.n1);
            og3 og3 = og3.c;
            createListBuilder.add(new pg3(i2, igf2, og3));
            createListBuilder.add(new pg3(fxa.a0, new igf(ixa.s), og3));
            createListBuilder.add(new pg3(fxa.Z, new igf(ixa.r), og3));
            if (z) {
                createListBuilder.add(new pg3(fxa.X, new igf(ixa.o), og3.a));
            }
            createListBuilder.add(new pg3(fxa.W, new igf(ixa.k), og3.b));
            Unit unit = Unit.INSTANCE;
            g0c g0c = new g0c(igf, (ngf) null, CollectionsKt.build(createListBuilder));
            this.a = 1;
            if (n6e.a(g0c, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}

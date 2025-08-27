package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: g82  reason: default package */
public final class g82 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ m82 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g82(m82 m82, Continuation continuation) {
        super(2, continuation);
        this.b = m82;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new g82(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g82) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        g0c g0c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            m82 m82 = this.b;
            boolean z = m82.C;
            xme xme = m82.c;
            boolean z2 = false;
            if (z) {
                zz4 c = m82.c();
                azb azb = (azb) xme.getValue();
                if (!(azb == null || azb.a == null)) {
                    z2 = true;
                }
                c.getClass();
                igf igf = new igf(ixa.l);
                List createListBuilder = CollectionsKt.createListBuilder();
                int i2 = fxa.a0;
                igf igf2 = new igf(ixa.s);
                og3 og3 = og3.c;
                createListBuilder.add(new pg3(i2, igf2, og3));
                createListBuilder.add(new pg3(fxa.Z, new igf(ixa.r), og3));
                if (z2) {
                    createListBuilder.add(new pg3(fxa.X, new igf(ixa.o), og3.a));
                }
                createListBuilder.add(new pg3(fxa.W, new igf(ixa.k), og3.b));
                Unit unit = Unit.INSTANCE;
                g0c = new g0c(igf, (ngf) null, CollectionsKt.build(createListBuilder));
            } else {
                zz4 c2 = m82.c();
                azb azb2 = (azb) xme.getValue();
                if (!(azb2 == null || azb2.a == null)) {
                    z2 = true;
                }
                c2.getClass();
                igf igf3 = new igf(ixa.m);
                List createListBuilder2 = CollectionsKt.createListBuilder();
                int i3 = fxa.a0;
                igf igf4 = new igf(ixa.s);
                og3 og32 = og3.c;
                createListBuilder2.add(new pg3(i3, igf4, og32));
                createListBuilder2.add(new pg3(fxa.Z, new igf(ixa.r), og32));
                if (z2) {
                    createListBuilder2.add(new pg3(fxa.X, new igf(ixa.o), og3.a));
                }
                createListBuilder2.add(new pg3(fxa.W, new igf(ixa.k), og3.b));
                Unit unit2 = Unit.INSTANCE;
                g0c = new g0c(igf3, (ngf) null, CollectionsKt.build(createListBuilder2));
            }
            n6e n6e = m82.e;
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

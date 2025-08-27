package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: p42  reason: default package */
public final class p42 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ h52 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p42(h52 h52, Continuation continuation) {
        super(2, continuation);
        this.b = h52;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new p42(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p42) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            h52 h52 = this.b;
            n6e n6e = h52.f;
            KProperty[] kPropertyArr = h52.y;
            List createListBuilder = CollectionsKt.createListBuilder();
            g02 g02 = (g02) h52.i.getValue();
            if ((g02 != null ? g02.b : null) == f02.c) {
                createListBuilder.add(new ow3(fxa.A0, (ngf) new igf(ixa.K1), Integer.valueOf(jya.I), Integer.valueOf(cad.O1), Integer.valueOf(jya.E)));
            }
            fxb fxb = new fxb(CollectionsKt.build(createListBuilder));
            this.a = 1;
            if (n6e.a(fxb, this) == coroutine_suspended) {
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

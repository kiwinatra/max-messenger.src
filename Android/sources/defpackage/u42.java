package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: u42  reason: default package */
public final class u42 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ h52 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u42(int i, h52 h52, Continuation continuation) {
        super(2, continuation);
        this.b = i;
        this.c = h52;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new u42(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((u42) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.b == fxa.A0) {
                n6e n6e = this.c.f;
                KProperty[] kPropertyArr = h52.y;
                exb exb = new exb(new igf(ixa.v2), new igf(ixa.u2), CollectionsKt.listOf(new pg3(fxa.E0, new igf(ixa.r2), og3.c), new pg3(fxa.e, new igf(ixa.s2), og3.b)));
                this.a = 1;
                if (n6e.a(exb, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}

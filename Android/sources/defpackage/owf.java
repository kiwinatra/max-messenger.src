package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: owf  reason: default package */
public final class owf extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ pwf b;
    public final /* synthetic */ int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public owf(pwf pwf, int i, Continuation continuation) {
        super(2, continuation);
        this.b = pwf;
        this.c = i;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new owf(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((owf) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [l0g, java.lang.Object] */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        pwf pwf = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ? obj2 = new Object();
            obj2.v = this.c;
            np2 np2 = new np2((String) null, 0, new ue3(new n0g(obj2)), false);
            this.a = 1;
            obj = ((jna) ((rl) pwf.a.getValue())).T(np2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        n0g n0g = ((me3) obj).o;
        if (n0g != null) {
            ((hq) ((fq) pwf.b.getValue())).H(n0g);
            return Unit.INSTANCE;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}

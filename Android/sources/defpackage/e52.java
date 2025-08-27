package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: e52  reason: default package */
public final class e52 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ h52 b;
    public final /* synthetic */ String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e52(h52 h52, String str, Continuation continuation) {
        super(2, continuation);
        this.b = h52;
        this.c = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new e52(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e52) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            h52 h52 = this.b;
            a32 o = h52.o();
            ry7 ry7 = (o == null || !o.K()) ? ry7.a : ry7.b;
            this.a = 1;
            obj = ((dz2) h52.n.getValue()).a(this.c, ry7, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}

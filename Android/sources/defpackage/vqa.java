package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: vqa  reason: default package */
public final class vqa extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ wqa b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vqa(wqa wqa, Continuation continuation) {
        super(2, continuation);
        this.b = wqa;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new vqa(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vqa) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            wqa wqa = this.b;
            long j = wqa.b;
            this.a = 1;
            obj = ((qx2) wqa.d.getValue()).d(j, this);
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

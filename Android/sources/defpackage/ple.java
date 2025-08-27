package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ple  reason: default package */
public final class ple extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ rle b;
    public final /* synthetic */ fo3 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ple(rle rle, fo3 fo3, Continuation continuation) {
        super(2, continuation);
        this.b = rle;
        this.c = fo3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ple(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ple) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List listOf = CollectionsKt.listOf(this.c);
            tm3 tm3 = tm3.b;
            this.a = 1;
            obj = ((eu3) this.b.w.getValue()).a.C(listOf, tm3);
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

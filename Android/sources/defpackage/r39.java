package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: r39  reason: default package */
public final class r39 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ t39 b;
    public final /* synthetic */ zu3 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r39(t39 t39, zu3 zu3, Continuation continuation) {
        super(2, continuation);
        this.b = t39;
        this.c = zu3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new r39(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((r39) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            n6e n6e = this.b.a;
            l39 l39 = new l39(CollectionsKt.toList(this.c.b));
            this.a = 1;
            if (n6e.a(l39, this) == coroutine_suspended) {
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

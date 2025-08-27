package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.tamtam.logout.a;

/* renamed from: ar9  reason: default package */
public final class ar9 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ ir9 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ar9(a aVar, ir9 ir9, Continuation continuation) {
        super(2, continuation);
        this.b = aVar;
        this.c = ir9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ar9(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ar9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (this.b.a(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ir9 ir9 = this.c;
        ((ld0) ir9.g.getValue()).b.clear();
        e14.c(ir9.f, (CancellationException) null);
        return Unit.INSTANCE;
    }
}

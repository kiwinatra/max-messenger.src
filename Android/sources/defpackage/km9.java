package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: km9  reason: default package */
public final class km9 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ en9 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public km9(en9 en9, Continuation continuation) {
        super(2, continuation);
        this.b = en9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new km9(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((km9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.b.z0;
            a67 a67 = z68.b;
            if (a67 != null && a67.c()) {
                a67.d(w78.o, str, "Scrolling to first reacted message", (Throwable) null);
            }
            gid gid = ((hid) this.b.o1.getValue()).d;
            if (gid == null) {
                return Unit.INSTANCE;
            }
            long j = gid.b;
            en9 en9 = this.b;
            this.a = 1;
            if (en9.A(j, false) == coroutine_suspended) {
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

package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: bu7  reason: default package */
public final class bu7 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ du7 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bu7(du7 du7, Continuation continuation) {
        super(2, continuation);
        this.b = du7;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new bu7(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bu7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        du7 du7 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o7d o7d = (o7d) du7.e.getValue();
            this.a = 1;
            Object I = ev0.I(((osa) o7d.a).b(), new h7d(o7d, (Continuation) null), this);
            if (I != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                I = Unit.INSTANCE;
            }
            if (I == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th) {
                z68.f("LibraryUpgradeHelper", "fail to migrate 4", th);
                ((e24) du7.f.getValue()).a("ONEME-14182", new IllegalStateException("fail to clear stats", th));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}

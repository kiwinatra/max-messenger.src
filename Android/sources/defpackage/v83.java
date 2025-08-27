package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.chats.common.CommonChatsViewModel;

/* renamed from: v83  reason: default package */
public final class v83 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ CommonChatsViewModel b;
    public final /* synthetic */ Long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v83(CommonChatsViewModel commonChatsViewModel, Long l, Continuation continuation) {
        super(2, continuation);
        this.b = commonChatsViewModel;
        this.c = l;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new v83(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((v83) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        CommonChatsViewModel commonChatsViewModel = this.b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            fce U = ((jna) commonChatsViewModel.f).U(new np2(commonChatsViewModel.l, this.c), ((kbf) commonChatsViewModel.h).a());
            this.a = 1;
            obj = bs0.f(U, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th) {
                if (!(th instanceof CancellationException)) {
                    z68.f("ru.ok.messages.chats.common.CommonChatsViewModel", "request error!", th);
                }
                return null;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return (op2) obj;
    }
}

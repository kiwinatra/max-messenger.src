package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.chats.common.CommonChatsViewModel;

/* renamed from: m83  reason: default package */
public final class m83 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ CommonChatsViewModel b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m83(CommonChatsViewModel commonChatsViewModel, Continuation continuation) {
        super(2, continuation);
        this.b = commonChatsViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new m83(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((m83) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            CommonChatsViewModel commonChatsViewModel = this.b;
            Object I = ev0.I(((osa) commonChatsViewModel.i).a(), new x83(commonChatsViewModel, (Continuation) null), this);
            if (I != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                I = Unit.INSTANCE;
            }
            if (I == coroutine_suspended) {
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

package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.chats.common.CommonChatsViewModel;

/* renamed from: q83  reason: default package */
public final class q83 extends SuspendLambda implements Function2 {
    public final /* synthetic */ dk2 a;
    public final /* synthetic */ CommonChatsViewModel b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q83(dk2 dk2, CommonChatsViewModel commonChatsViewModel, Continuation continuation) {
        super(2, continuation);
        this.a = dk2;
        this.b = commonChatsViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new q83(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((q83) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        dk2 dk2 = this.a;
        int y = tr1.y(dk2.v);
        long j = dk2.o;
        CommonChatsViewModel commonChatsViewModel = this.b;
        if (y == 0) {
            CommonChatsViewModel.j(commonChatsViewModel, j);
        } else if (y == 1) {
            CommonChatsViewModel.k(commonChatsViewModel, j);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}

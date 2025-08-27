package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.chats.common.CommonChatsViewModel;

/* renamed from: s83  reason: default package */
public final class s83 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CommonChatsViewModel a;
    public final /* synthetic */ rs7 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s83(CommonChatsViewModel commonChatsViewModel, rs7 rs7, Continuation continuation) {
        super(2, continuation);
        this.a = commonChatsViewModel;
        this.b = rs7;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new s83(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((s83) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CommonChatsViewModel.k(this.a, this.b.b);
        return Unit.INSTANCE;
    }
}

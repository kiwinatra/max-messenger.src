package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.chats.common.CommonChatsViewModel;

/* renamed from: p83  reason: default package */
public final class p83 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CommonChatsViewModel a;
    public final /* synthetic */ fa b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p83(CommonChatsViewModel commonChatsViewModel, fa faVar, Continuation continuation) {
        super(2, continuation);
        this.a = commonChatsViewModel;
        this.b = faVar;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new p83(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p83) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CommonChatsViewModel.j(this.a, this.b.b);
        return Unit.INSTANCE;
    }
}

package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.chats.search.ChatsListSearchScreen;

/* renamed from: lu2  reason: default package */
public final class lu2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatsListSearchScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lu2(Continuation continuation, ChatsListSearchScreen chatsListSearchScreen) {
        super(2, continuation);
        this.b = chatsListSearchScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        lu2 lu2 = new lu2(continuation, this.b);
        lu2.a = obj;
        return lu2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lu2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.b.z0.G((List) this.a);
        return Unit.INSTANCE;
    }
}

package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.profile.screens.addmembers.AddChatMembersScreen;

/* renamed from: ka  reason: default package */
public final class ka extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ AddChatMembersScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ka(Continuation continuation, AddChatMembersScreen addChatMembersScreen) {
        super(2, continuation);
        this.b = addChatMembersScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ka kaVar = new ka(continuation, this.b);
        kaVar.a = obj;
        return kaVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ka) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (((v5a) this.a) instanceof p33) {
            this.b.getRouter().C();
        }
        return Unit.INSTANCE;
    }
}

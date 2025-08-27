package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.startconversation.StartConversationScreen;

/* renamed from: lle  reason: default package */
public final class lle extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ StartConversationScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lle(StartConversationScreen startConversationScreen, Continuation continuation) {
        super(2, continuation);
        this.b = startConversationScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        lle lle = new lle(this.b, continuation);
        lle.a = obj;
        return lle;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lle) create((pa4) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ble.b.Y0((pa4) this.a);
        return Unit.INSTANCE;
    }
}

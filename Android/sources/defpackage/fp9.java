package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.messages.settings.MessagesSettingsScreen;

/* renamed from: fp9  reason: default package */
public final class fp9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MessagesSettingsScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fp9(Continuation continuation, MessagesSettingsScreen messagesSettingsScreen) {
        super(2, continuation);
        this.b = messagesSettingsScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        fp9 fp9 = new fp9(continuation, this.b);
        fp9.a = obj;
        return fp9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fp9) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        v5a v5a = (v5a) this.a;
        if (v5a instanceof pa4) {
            ep9.b.Y0((pa4) v5a);
        }
        return Unit.INSTANCE;
    }
}

package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.FrgMessagesSettings;

/* renamed from: ai6  reason: default package */
public final class ai6 extends SuspendLambda implements Function2 {
    public final /* synthetic */ FrgMessagesSettings a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ai6(FrgMessagesSettings frgMessagesSettings, Continuation continuation) {
        super(2, continuation);
        this.a = frgMessagesSettings;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ai6(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ai6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        FrgMessagesSettings frgMessagesSettings = this.a;
        ((esb) frgMessagesSettings.q1.getAccessor().g(esb.class)).d();
        frgMessagesSettings.q1.g().V();
        return Unit.INSTANCE;
    }
}

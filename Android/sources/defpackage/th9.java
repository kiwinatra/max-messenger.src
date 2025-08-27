package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: th9  reason: default package */
public final class th9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MessageWriteWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public th9(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.b = messageWriteWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        th9 th9 = new th9(continuation, this.b);
        th9.a = obj;
        return th9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((th9) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean booleanValue = ((Boolean) this.a).booleanValue();
        KProperty[] kPropertyArr = MessageWriteWidget.C0;
        MessageWriteWidget messageWriteWidget = this.b;
        if (messageWriteWidget.getView() != null) {
            messageWriteWidget.d0().setInputEnabled(!booleanValue);
        }
        return Unit.INSTANCE;
    }
}

package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: hi9  reason: default package */
public final class hi9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MessageWriteWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hi9(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.b = messageWriteWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        hi9 hi9 = new hi9(continuation, this.b);
        hi9.a = obj;
        return hi9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hi9) create((ug9) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ug9 ug9 = (ug9) this.a;
        boolean z = false;
        if (ug9 != null && ug9.a) {
            z = true;
        }
        KProperty[] kPropertyArr = MessageWriteWidget.C0;
        MessageWriteWidget messageWriteWidget = this.b;
        messageWriteWidget.d0().setLeftOuterIconVisible(z);
        if (z) {
            messageWriteWidget.d0().setLeftOuterIconOnClickListener(new rh9(messageWriteWidget.h0()));
            messageWriteWidget.d0().setLeftOuterIconText(ug9 != null ? ug9.b : null);
        }
        return Unit.INSTANCE;
    }
}

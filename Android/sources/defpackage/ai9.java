package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: ai9  reason: default package */
public final class ai9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MessageWriteWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ai9(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.b = messageWriteWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ai9 ai9 = new ai9(continuation, this.b);
        ai9.a = obj;
        return ai9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ai9) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        vg9 vg9 = (vg9) this.a;
        KProperty[] kPropertyArr = MessageWriteWidget.C0;
        MessageWriteWidget messageWriteWidget = this.b;
        if (vg9 != null) {
            dc9 d0 = messageWriteWidget.d0();
            sb9 sb9 = sb9.a;
            d0.setRightOuterIconActionState(new vb9());
            messageWriteWidget.d0().setRightInnerIconVisible(true);
            if (y7e.L(messageWriteWidget.v0) && messageWriteWidget.h0().G0.a.getValue() != null) {
                messageWriteWidget.d0().setText((CharSequence) null);
            }
        }
        messageWriteWidget.k0(vg9);
        return Unit.INSTANCE;
    }
}

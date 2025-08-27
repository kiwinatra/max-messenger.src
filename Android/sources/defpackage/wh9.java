package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: wh9  reason: default package */
public final class wh9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MessageWriteWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wh9(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.b = messageWriteWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        wh9 wh9 = new wh9(continuation, this.b);
        wh9.a = obj;
        return wh9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wh9) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CharSequence charSequence = (CharSequence) this.a;
        KProperty[] kPropertyArr = MessageWriteWidget.C0;
        MessageWriteWidget messageWriteWidget = this.b;
        messageWriteWidget.d0().setText(charSequence);
        dc9 d0 = messageWriteWidget.d0();
        int length = charSequence.length();
        if (length == -1) {
            d0.getClass();
        } else {
            bc9 bc9 = d0.c;
            bc9.setSelection(Math.min(length, bc9.length()));
        }
        return Unit.INSTANCE;
    }
}

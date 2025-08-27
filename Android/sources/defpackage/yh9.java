package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: yh9  reason: default package */
public final class yh9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MessageWriteWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yh9(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.b = messageWriteWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        yh9 yh9 = new yh9(continuation, this.b);
        yh9.a = obj;
        return yh9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yh9) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        tb9 tb9;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o85 o85 = (o85) this.a;
        ng9 ng9 = o85 != null ? (ng9) o85.a : null;
        KProperty[] kPropertyArr = MessageWriteWidget.C0;
        MessageWriteWidget messageWriteWidget = this.b;
        messageWriteWidget.getClass();
        if (ng9 == null || (tb9 = ng9.a) == null) {
            tb9 = tb9.a;
        }
        messageWriteWidget.d0().setEmojiExpandableState(tb9);
        if (tb9 == tb9.b) {
            dc9 d0 = messageWriteWidget.d0();
            ph9 ph9 = new ph9(messageWriteWidget, 3);
            bc9 bc9 = d0.c;
            bc9.setShowSoftInputOnFocus(false);
            bc9.setOnFocusChangeListener(new qb9(0, ph9));
        }
        return Unit.INSTANCE;
    }
}

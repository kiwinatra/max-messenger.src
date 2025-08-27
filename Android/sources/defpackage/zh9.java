package defpackage;

import android.view.View;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: zh9  reason: default package */
public final class zh9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MessageWriteWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zh9(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.b = messageWriteWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        zh9 zh9 = new zh9(continuation, this.b);
        zh9.a = obj;
        return zh9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zh9) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o85 o85 = (o85) this.a;
        pg9 pg9 = o85 != null ? (pg9) o85.a : null;
        KProperty[] kPropertyArr = MessageWriteWidget.C0;
        MessageWriteWidget messageWriteWidget = this.b;
        messageWriteWidget.getClass();
        og9 og9 = pg9 != null ? pg9.a : null;
        og9 og92 = og9.b;
        xme xme = messageWriteWidget.A0;
        if (og9 == og92) {
            messageWriteWidget.d0().setLeftIcon(cad.g1);
            Boolean bool = Boolean.TRUE;
            xme.getClass();
            xme.m((Object) null, bool);
        } else {
            messageWriteWidget.d0().setEmojiExpandableState(tb9.a);
            bc9 bc9 = messageWriteWidget.d0().c;
            bc9.setShowSoftInputOnFocus(true);
            bc9.setOnFocusChangeListener((View.OnFocusChangeListener) null);
            messageWriteWidget.d0().setLeftIcon(cad.c1);
            Boolean bool2 = Boolean.FALSE;
            xme.getClass();
            xme.m((Object) null, bool2);
        }
        return Unit.INSTANCE;
    }
}

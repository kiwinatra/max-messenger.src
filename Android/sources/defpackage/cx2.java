package defpackage;

import android.view.View;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chats.list.ChatsListWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: cx2  reason: default package */
public final class cx2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatsListWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cx2(Continuation continuation, ChatsListWidget chatsListWidget) {
        super(2, continuation);
        this.b = chatsListWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        cx2 cx2 = new cx2(continuation, this.b);
        cx2.a = obj;
        return cx2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cx2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean booleanValue = ((Boolean) this.a).booleanValue();
        KProperty[] kPropertyArr = ChatsListWidget.I0;
        ChatsListWidget chatsListWidget = this.b;
        if (booleanValue) {
            OneMeButton oneMeButton = chatsListWidget.d0().H0;
            oneMeButton.setText((CharSequence) null);
            oneMeButton.setOnClickListener((View.OnClickListener) null);
            oneMeButton.setVisibility(8);
        } else {
            chatsListWidget.d0().M(chatsListWidget.getContext().getString(clc.chats_list_empty_state_action), new x4(24, (Object) chatsListWidget));
        }
        return Unit.INSTANCE;
    }
}

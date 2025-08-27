package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chatscreen.ChatScreen;

/* renamed from: an2  reason: default package */
public final class an2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public an2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.b = chatScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        an2 an2 = new an2(continuation, this.b);
        an2.a = obj;
        return an2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((an2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = ChatScreen.d1;
        ChatScreen chatScreen = this.b;
        chatScreen.getClass();
        ((View) chatScreen.X0.getValue(chatScreen, ChatScreen.d1[17])).setBackground((Drawable) this.a);
        return Unit.INSTANCE;
    }
}

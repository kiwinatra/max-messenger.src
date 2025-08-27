package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chats.tab.ChatsTabWidget;

/* renamed from: ty2  reason: default package */
public final class ty2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatsTabWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ty2(Continuation continuation, ChatsTabWidget chatsTabWidget) {
        super(2, continuation);
        this.b = chatsTabWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ty2 ty2 = new ty2(continuation, this.b);
        ty2.a = obj;
        return ty2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ty2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int intValue = ((Number) this.a).intValue();
        KProperty[] kPropertyArr = ChatsTabWidget.z0;
        ChatsTabWidget chatsTabWidget = this.b;
        if (!(chatsTabWidget.d0().getCurrentItem() == intValue && chatsTabWidget.c0().getSelectedTabPosition() == intValue)) {
            chatsTabWidget.d0().e(intValue, false);
            chatsTabWidget.c0().o(intValue, c44.DEFAULT_ASPECT_RATIO, true, true, true);
        }
        return Unit.INSTANCE;
    }
}

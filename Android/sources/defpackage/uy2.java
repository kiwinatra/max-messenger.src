package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chats.tab.ChatsTabWidget;

/* renamed from: uy2  reason: default package */
public final class uy2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatsTabWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uy2(Continuation continuation, ChatsTabWidget chatsTabWidget) {
        super(2, continuation);
        this.b = chatsTabWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        uy2 uy2 = new uy2(continuation, this.b);
        uy2.a = obj;
        return uy2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((uy2) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int size = ((List) this.a).size();
        ChatsTabWidget chatsTabWidget = this.b;
        if (size > 1) {
            KProperty[] kPropertyArr = ChatsTabWidget.z0;
            chatsTabWidget.c0().setVisibility(0);
            chatsTabWidget.d0().setUserInputEnabled(true);
        } else {
            KProperty[] kPropertyArr2 = ChatsTabWidget.z0;
            chatsTabWidget.c0().setVisibility(8);
            chatsTabWidget.d0().setUserInputEnabled(false);
        }
        return Unit.INSTANCE;
    }
}

package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;

/* renamed from: wq2  reason: default package */
public final class wq2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatTitleIconScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wq2(Continuation continuation, ChatTitleIconScreen chatTitleIconScreen) {
        super(2, continuation);
        this.b = chatTitleIconScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        wq2 wq2 = new wq2(continuation, this.b);
        wq2.a = obj;
        return wq2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wq2) create((xq2) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (Intrinsics.areEqual((Object) (xq2) this.a, (Object) xq2.a)) {
            KProperty[] kPropertyArr = ChatTitleIconScreen.x0;
            ChatTitleIconScreen chatTitleIconScreen = this.b;
            chatTitleIconScreen.f0().setProgressEnabled(false);
            e0b e0b = new e0b((Widget) chatTitleIconScreen);
            e0b.h(new igf(g1b.b));
            e0b.j();
        }
        return Unit.INSTANCE;
    }
}

package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chats.tab.ChatsTabWidget;

/* renamed from: vy2  reason: default package */
public final class vy2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatsTabWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vy2(Continuation continuation, ChatsTabWidget chatsTabWidget) {
        super(2, continuation);
        this.b = chatsTabWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        vy2 vy2 = new vy2(continuation, this.b);
        vy2.a = obj;
        return vy2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vy2) create((jx6) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        jx6 jx6 = (jx6) this.a;
        ChatsTabWidget chatsTabWidget = this.b;
        KProperty[] kPropertyArr = ChatsTabWidget.z0;
        String name = ChatsTabWidget.class.getName();
        a67 a67 = z68.b;
        CharSequence charSequence = null;
        if (a67 != null) {
            chatsTabWidget.getClass();
            if (a67.c()) {
                w78 w78 = w78.o;
                a67.d(w78, name, "handleHeaderStateUpdate: state=" + jx6, (Throwable) null);
            }
        }
        esf.b(chatsTabWidget.e0());
        u90 u90 = new u90();
        boolean z = false;
        u90.V(0);
        esf.a(chatsTabWidget.e0(), u90);
        h3b e0 = chatsTabWidget.e0();
        CharSequence a2 = jx6.a.a(chatsTabWidget.getContext());
        if (a2 == null) {
            a2 = "";
        }
        e0.setTitle(a2);
        h3b e02 = chatsTabWidget.e0();
        ngf ngf = jx6.b;
        if (ngf != null) {
            charSequence = ngf.a(chatsTabWidget.getContext());
        }
        e02.setSubtitle(charSequence);
        h3b e03 = chatsTabWidget.e0();
        if (jx6.b != null) {
            z = true;
        }
        e03.setTextShimmerEnabled(z);
        return Unit.INSTANCE;
    }
}

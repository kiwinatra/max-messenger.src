package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: un9  reason: default package */
public final class un9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MessagesListWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public un9(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.b = messagesListWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        un9 un9 = new un9(continuation, this.b);
        un9.a = obj;
        return un9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((un9) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        yrc yrc;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        lrc lrc = (lrc) this.a;
        KProperty[] kPropertyArr = MessagesListWidget.R0;
        MessagesListWidget messagesListWidget = this.b;
        messagesListWidget.getClass();
        if (lrc instanceof lrc) {
            if ((!lrc.e || messagesListWidget.f0().a(lrc.c)) && (yrc = messagesListWidget.Q0) != null) {
                String str = lrc.d;
                yrc.e(lrc.b, lrc.a, str);
            }
            return Unit.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }
}

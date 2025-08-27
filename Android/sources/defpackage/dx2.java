package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chats.list.ChatsListWidget;

/* renamed from: dx2  reason: default package */
public final class dx2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatsListWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dx2(Continuation continuation, ChatsListWidget chatsListWidget) {
        super(2, continuation);
        this.b = chatsListWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        dx2 dx2 = new dx2(continuation, this.b);
        dx2.a = obj;
        return dx2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dx2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        v5a v5a = (v5a) this.a;
        if (v5a instanceof pa4) {
            vt3.b.Y0((pa4) v5a);
        } else if (v5a instanceof qje) {
            KProperty[] kPropertyArr = ChatsListWidget.I0;
            qje qje = (qje) v5a;
            ((lf1) this.b.F0.getValue()).j(qje.b, qje.c, new ix2(v5a, 0));
        } else {
            boolean z = v5a instanceof b4b;
        }
        return Unit.INSTANCE;
    }
}

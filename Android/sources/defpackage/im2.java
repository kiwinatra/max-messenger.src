package defpackage;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chatscreen.ChatScreen;

/* renamed from: im2  reason: default package */
public final class im2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public im2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.b = chatScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        im2 im2 = new im2(continuation, this.b);
        im2.a = obj;
        return im2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((im2) create((qy6) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        qy6 qy6 = (qy6) this.a;
        Pair pair = qy6 == null ? null : TuplesKt.to(Boxing.boxLong(qy6.b), qy6.d);
        KProperty[] kPropertyArr = ChatScreen.d1;
        this.b.s0().j(pair);
        return Unit.INSTANCE;
    }
}

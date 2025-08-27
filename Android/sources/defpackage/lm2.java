package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chatscreen.ChatScreen;

/* renamed from: lm2  reason: default package */
public final class lm2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ bs5 b;
    public final /* synthetic */ boolean c = false;
    public final /* synthetic */ ChatScreen o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lm2(etc etc, Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.b = etc;
        this.o = chatScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        lm2 lm2 = new lm2((etc) this.b, continuation, this.o);
        lm2.a = obj;
        return lm2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lm2) create((o85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        mg9 mg9;
        ChatScreen chatScreen = this.o;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Object a2 = ((o85) this.a).a();
        if (Result.m26exceptionOrNullimpl(a2) != null) {
            return Unit.INSTANCE;
        }
        try {
            Unit unit = (Unit) a2;
            KProperty[] kPropertyArr = ChatScreen.d1;
            o85 o85 = (o85) chatScreen.q0().y0.a.getValue();
            if (o85 == null || (mg9 = (mg9) o85.a) == null || !mg9.a) {
                mh9.n(chatScreen.q0(), true, false, 2);
                chatScreen.m0();
            } else {
                mh9.o(chatScreen.q0(), (lg9) null, 3);
            }
            obj2 = Result.m23constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            obj2 = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        if (!this.c) {
            ResultKt.throwOnFailure(obj2);
        }
        return Unit.INSTANCE;
    }
}

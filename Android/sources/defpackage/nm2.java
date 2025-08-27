package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.chatscreen.ChatScreen;

/* renamed from: nm2  reason: default package */
public final class nm2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ bs5 b;
    public final /* synthetic */ boolean c = false;
    public final /* synthetic */ ChatScreen o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nm2(etc etc, Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.b = etc;
        this.o = chatScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        nm2 nm2 = new nm2((etc) this.b, continuation, this.o);
        nm2.a = obj;
        return nm2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nm2) create((o85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Object a2 = ((o85) this.a).a();
        if (Result.m26exceptionOrNullimpl(a2) != null) {
            return Unit.INSTANCE;
        }
        try {
            ChatScreen.j0(this.o, (mg9) a2);
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

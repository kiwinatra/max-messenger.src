package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.channels.CreateChannelFragment;

/* renamed from: w24  reason: default package */
public final class w24 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ bs5 b;
    public final /* synthetic */ boolean c = false;
    public final /* synthetic */ CreateChannelFragment o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w24(etc etc, Continuation continuation, CreateChannelFragment createChannelFragment) {
        super(2, continuation);
        this.b = etc;
        this.o = createChannelFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        w24 w24 = new w24((etc) this.b, continuation, this.o);
        w24.a = obj;
        return w24;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((w24) create((o85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
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
            hi7.b0(0, this.o.G2(), (String) a2);
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

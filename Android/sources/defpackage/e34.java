package defpackage;

import android.net.Uri;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.channels.CreateChannelFragment;
import ru.ok.messages.views.ActAvatarCrop;

/* renamed from: e34  reason: default package */
public final class e34 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ bs5 b;
    public final /* synthetic */ boolean c = false;
    public final /* synthetic */ CreateChannelFragment o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e34(etc etc, Continuation continuation, CreateChannelFragment createChannelFragment) {
        super(2, continuation);
        this.b = etc;
        this.o = createChannelFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        e34 e34 = new e34((etc) this.b, continuation, this.o);
        e34.a = obj;
        return e34;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e34) create((o85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
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
            Pair pair = (Pair) a2;
            ActAvatarCrop.T(this.o, (Uri) pair.getFirst(), (String) pair.getSecond(), false, true, false);
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

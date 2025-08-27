package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.channels.CreateChannelFragment;

/* renamed from: c34  reason: default package */
public final class c34 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ bs5 b;
    public final /* synthetic */ boolean c = false;
    public final /* synthetic */ CreateChannelFragment o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c34(etc etc, Continuation continuation, CreateChannelFragment createChannelFragment) {
        super(2, continuation);
        this.b = etc;
        this.o = createChannelFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        c34 c34 = new c34((etc) this.b, continuation, this.o);
        c34.a = obj;
        return c34;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c34) create((o85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CreateChannelFragment createChannelFragment = this.o;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Object a2 = ((o85) this.a).a();
        if (Result.m26exceptionOrNullimpl(a2) != null) {
            return Unit.INSTANCE;
        }
        try {
            m5a.k(createChannelFragment, createChannelFragment.q1.z(), (Uri) a2, ((qra) ((id3) createChannelFragment.p1.b)).p());
        } catch (ActivityNotFoundException e) {
            z68.f("ru.ok.messages.channels.CreateChannelFragment", "openCameraAction error: ", e);
            Context G2 = createChannelFragment.G2();
            int i = qad.n0;
            Handler handler = hi7.j;
            hi7.b0(0, G2, G2.getString(i));
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            obj2 = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        obj2 = Result.m23constructorimpl(Unit.INSTANCE);
        if (!this.c) {
            ResultKt.throwOnFailure(obj2);
        }
        return Unit.INSTANCE;
    }
}

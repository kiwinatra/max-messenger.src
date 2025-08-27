package defpackage;

import android.widget.ProgressBar;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.channels.CreateChannelFragment;

/* renamed from: y24  reason: default package */
public final class y24 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ bs5 b;
    public final /* synthetic */ boolean c = false;
    public final /* synthetic */ CreateChannelFragment o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y24(etc etc, Continuation continuation, CreateChannelFragment createChannelFragment) {
        super(2, continuation);
        this.b = etc;
        this.o = createChannelFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        y24 y24 = new y24((etc) this.b, continuation, this.o);
        y24.a = obj;
        return y24;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((y24) create((o85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
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
            boolean booleanValue = ((Boolean) a2).booleanValue();
            CreateChannelFragment createChannelFragment = this.o;
            if (booleanValue) {
                CreateChannelFragment.h3(createChannelFragment.D1);
            } else {
                t24 t24 = createChannelFragment.D1;
                z68.c("ru.ok.messages.channels.CreateChannelFragment", "Disable ui", new Object[0]);
                t24.g().setEnabled(false);
                t24.e().setEnabled(false);
                t24.f().setVisibility(4);
                ((ProgressBar) t24.X.getValue(t24, t24.Z[7])).setVisibility(0);
                t24.d().setEnabled(false);
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

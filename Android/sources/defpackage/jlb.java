package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.pinbars.PinBarsWidget;
import one.me.sdk.uikit.common.miniplayer.MiniPlayerView;

/* renamed from: jlb  reason: default package */
public final class jlb extends SuspendLambda implements Function2 {
    public /* synthetic */ float a;
    public final /* synthetic */ PinBarsWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jlb(Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(2, continuation);
        this.b = pinBarsWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        jlb jlb = new jlb(continuation, this.b);
        jlb.a = ((Number) obj).floatValue();
        return jlb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jlb) create(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        float f = this.a;
        MiniPlayerView miniPlayerView = this.b.o;
        if (miniPlayerView == null) {
            return Unit.INSTANCE;
        }
        miniPlayerView.setProgress(f);
        return Unit.INSTANCE;
    }
}

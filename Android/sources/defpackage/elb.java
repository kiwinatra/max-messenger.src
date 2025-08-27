package defpackage;

import android.graphics.Point;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import one.me.pinbars.PinBarsWidget;
import one.me.sdk.uikit.common.miniplayer.MiniPlayerView;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* renamed from: elb  reason: default package */
public final class elb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ PinBarsWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public elb(Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(2, continuation);
        this.b = pinBarsWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        elb elb = new elb(continuation, this.b);
        elb.a = obj;
        return elb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((elb) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ymf ymf;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        i50 i50 = (i50) this.a;
        boolean areEqual = Intrinsics.areEqual((Object) i50, (Object) g50.a);
        PinBarsWidget pinBarsWidget = this.b;
        if (areEqual) {
            int i = PinBarsWidget.x;
            ymf ymf2 = pinBarsWidget.a;
            if (ymf2 != null) {
                ymf2.dismiss();
            }
            pinBarsWidget.a = null;
        } else if (i50 instanceof h50) {
            ngf ngf = ((h50) i50).a;
            MiniPlayerView miniPlayerView = pinBarsWidget.o;
            if (miniPlayerView != null) {
                if (!miniPlayerView.isLaidOut() || miniPlayerView.isLayoutRequested()) {
                    miniPlayerView.addOnLayoutChangeListener(new llb(miniPlayerView, pinBarsWidget, (igf) ngf));
                } else {
                    int[] iArr = new int[2];
                    View tooltipAnchor = miniPlayerView.getTooltipAnchor();
                    tooltipAnchor.getLocationOnScreen(iArr);
                    Point point = new Point(a81.e((float) 18, vo4.c().getDisplayMetrics().density, (hi7.v(pinBarsWidget.getContext()) - iArr[0]) - (tooltipAnchor.getWidth() / 2)), tooltipAnchor.getHeight() + iArr[1]);
                    ymf ymf3 = pinBarsWidget.a;
                    if (!(ymf3 == null || !ymf3.isShowing() || (ymf = pinBarsWidget.a) == null)) {
                        ymf.dismiss();
                    }
                    ymf ymf4 = new ymf(pinBarsWidget.getContext(), tooltipAnchor, (Function0) gy3.Y, (Function0) null, wmf.a, vmf.b, 8);
                    ymf4.d(ngf);
                    ymf4.e(point, 8388661, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
                    ymf4.setOnDismissListener(new b79(1, pinBarsWidget));
                    pinBarsWidget.a = ymf4;
                }
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}

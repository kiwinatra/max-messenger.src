package defpackage;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import one.me.pinbars.PinBarsWidget;
import one.me.sdk.uikit.common.miniplayer.MiniPlayerView;

/* renamed from: ilb  reason: default package */
public final class ilb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ View b;
    public final /* synthetic */ PinBarsWidget c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ilb(View view, PinBarsWidget pinBarsWidget, Continuation continuation) {
        super(2, continuation);
        this.b = view;
        this.c = pinBarsWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ilb ilb = new ilb(this.b, this.c, continuation);
        ilb.a = obj;
        return ilb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ilb) create((nr9) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        pr9 pr9;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        nr9 nr9 = (nr9) this.a;
        boolean z = nr9 instanceof mr9;
        View view = this.b;
        PinBarsWidget pinBarsWidget = this.c;
        if (!z) {
            ((ViewGroup) view).removeView(view.findViewById(axa.b));
            pinBarsWidget.o = null;
            return Unit.INSTANCE;
        }
        if (pinBarsWidget.o == null) {
            MiniPlayerView miniPlayerView = new MiniPlayerView(pinBarsWidget.getContext(), (AttributeSet) null);
            miniPlayerView.setId(axa.b);
            miniPlayerView.setOnCloseClickListener(new clb(pinBarsWidget, 0));
            miniPlayerView.setOnPlaybackSpeedClick(new jkb(1, (Object) pinBarsWidget));
            miniPlayerView.setOnPlaybackClickListener(new clb(pinBarsWidget, 1));
            ct.G(miniPlayerView, 300, new clb(pinBarsWidget, 2));
            miniPlayerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            b0h.H(miniPlayerView, new sa(3, (Continuation) null, 25));
            pinBarsWidget.o = miniPlayerView;
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.addView(miniPlayerView, RangesKt.coerceAtMost(1, viewGroup.getChildCount()));
        }
        MiniPlayerView miniPlayerView2 = pinBarsWidget.o;
        if (miniPlayerView2 == null) {
            return Unit.INSTANCE;
        }
        mr9 mr9 = (mr9) nr9;
        miniPlayerView2.setIsPlaying(mr9.d);
        miniPlayerView2.setTitle(mr9.a.a(miniPlayerView2.getContext()));
        miniPlayerView2.setSubtitle(mr9.b.a(miniPlayerView2.getContext()));
        int ordinal = mr9.c.ordinal();
        if (ordinal == 0) {
            pr9 = pr9.a;
        } else if (ordinal == 1) {
            pr9 = pr9.b;
        } else if (ordinal == 2) {
            pr9 = pr9.c;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        miniPlayerView2.setPlaybackSpeed(pr9);
        miniPlayerView2.setProgress(((Number) pinBarsWidget.c0().Y.a.getValue()).floatValue());
        return Unit.INSTANCE;
    }
}

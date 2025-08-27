package defpackage;

import android.graphics.Point;
import android.view.View;
import kotlin.jvm.functions.Function0;
import one.me.pinbars.PinBarsWidget;
import one.me.sdk.uikit.common.miniplayer.MiniPlayerView;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* renamed from: llb  reason: default package */
public final class llb implements View.OnLayoutChangeListener {
    public final /* synthetic */ MiniPlayerView a;
    public final /* synthetic */ PinBarsWidget b;
    public final /* synthetic */ ngf c;

    public llb(MiniPlayerView miniPlayerView, PinBarsWidget pinBarsWidget, igf igf) {
        this.a = miniPlayerView;
        this.b = pinBarsWidget;
        this.c = igf;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ymf ymf;
        View view2 = view;
        view.removeOnLayoutChangeListener(this);
        int[] iArr = new int[2];
        View tooltipAnchor = this.a.getTooltipAnchor();
        tooltipAnchor.getLocationOnScreen(iArr);
        PinBarsWidget pinBarsWidget = this.b;
        Point point = new Point(a81.e((float) 18, vo4.c().getDisplayMetrics().density, (hi7.v(pinBarsWidget.getContext()) - iArr[0]) - (tooltipAnchor.getWidth() / 2)), tooltipAnchor.getHeight() + iArr[1]);
        ymf ymf2 = pinBarsWidget.a;
        if (!(ymf2 == null || !ymf2.isShowing() || (ymf = pinBarsWidget.a) == null)) {
            ymf.dismiss();
        }
        ymf ymf3 = new ymf(pinBarsWidget.getContext(), tooltipAnchor, (Function0) gy3.Y, (Function0) null, wmf.a, vmf.b, 8);
        ymf3.d(this.c);
        ymf3.e(point, 8388661, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
        ymf3.setOnDismissListener(new b79(1, pinBarsWidget));
        pinBarsWidget.a = ymf3;
    }
}

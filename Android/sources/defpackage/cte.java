package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.stickerssettings.stickersscreen.StickersScreen;

/* renamed from: cte  reason: default package */
public final /* synthetic */ class cte implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickersScreen b;

    public /* synthetic */ cte(StickersScreen stickersScreen, int i) {
        this.a = i;
        this.b = stickersScreen;
    }

    public final Object invoke() {
        StickersScreen stickersScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = StickersScreen.Y;
                ete ete = stickersScreen.a;
                KProperty kProperty = StickersScreen.Y[0];
                long longValue = ((Number) stickersScreen.b.a(stickersScreen)).longValue();
                mue mue = mue.a;
                return new gwe(ete, longValue, (Context) mue.getAccessor().g(Context.class), (gaf) mue.getAccessor().g(gaf.class), mue.getAccessor().h(moe.class), mue.getAccessor().h(gvc.class), mue.getAccessor().h(vi5.class), mue.getAccessor().h(ai5.class), mue.getAccessor().h(vqe.class));
            case 1:
                KProperty[] kPropertyArr2 = StickersScreen.Y;
                return new lse(stickersScreen.getContext());
            default:
                KProperty[] kPropertyArr3 = StickersScreen.Y;
                OneMeButton oneMeButton = new OneMeButton(stickersScreen.getContext(), (AttributeSet) null);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
                int roundToInt = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
                layoutParams.leftMargin = roundToInt;
                layoutParams.rightMargin = roundToInt;
                layoutParams.topMargin = roundToInt;
                layoutParams.bottomMargin = roundToInt;
                oneMeButton.setLayoutParams(layoutParams);
                oneMeButton.setSize(aqa.c);
                oneMeButton.setMode(zpa.b);
                oneMeButton.setAppearance(xpa.c);
                oneMeButton.setText(n1b.n);
                ct.G(oneMeButton, 300, new dte(0, stickersScreen));
                return oneMeButton;
        }
    }
}

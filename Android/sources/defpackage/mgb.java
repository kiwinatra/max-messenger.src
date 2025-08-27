package defpackage;

import android.util.AttributeSet;
import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.startconversation.channel.PickSubscribersScreen;

/* renamed from: mgb  reason: default package */
public final /* synthetic */ class mgb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickSubscribersScreen b;

    public /* synthetic */ mgb(PickSubscribersScreen pickSubscribersScreen, int i) {
        this.a = i;
        this.b = pickSubscribersScreen;
    }

    public final Object invoke() {
        PickSubscribersScreen pickSubscribersScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = PickSubscribersScreen.w0;
                OneMeButton oneMeButton = new OneMeButton(pickSubscribersScreen.getContext(), (AttributeSet) null);
                oneMeButton.setId(f1b.l);
                oneMeButton.setSize(aqa.c);
                oneMeButton.setAppearance(xpa.o);
                oneMeButton.setMode(zpa.a);
                oneMeButton.setText(jra.Q);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                int roundToInt = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
                layoutParams.setMargins(roundToInt, roundToInt, roundToInt, roundToInt);
                oneMeButton.setLayoutParams(layoutParams);
                return oneMeButton;
            default:
                KProperty[] kPropertyArr2 = PickSubscribersScreen.w0;
                int i = pq7.a;
                if (pq7.b(pq7.c)) {
                    kr7.z(pickSubscribersScreen);
                }
                return Unit.INSTANCE;
        }
    }
}

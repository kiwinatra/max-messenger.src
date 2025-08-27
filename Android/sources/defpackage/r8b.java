package defpackage;

import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.chatscreen.mediabar.partialmediaaccess.PartialMediaAccessWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: r8b  reason: default package */
public final /* synthetic */ class r8b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PartialMediaAccessWidget b;

    public /* synthetic */ r8b(PartialMediaAccessWidget partialMediaAccessWidget, int i) {
        this.a = i;
        this.b = partialMediaAccessWidget;
    }

    public final Object invoke() {
        PartialMediaAccessWidget partialMediaAccessWidget = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = PartialMediaAccessWidget.o;
                LinearLayout linearLayout = new LinearLayout(partialMediaAccessWidget.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(MathKt.roundToInt(((float) 0) * vo4.c().getDisplayMetrics().density), -2, 1.0f));
                AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext(), (AttributeSet) null);
                appCompatTextView.setText(mra.y);
                appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), appCompatTextView.getPaddingTop(), appCompatTextView.getPaddingRight(), MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density));
                puf.i.b(appCompatTextView, uy4.b);
                b0h.H(appCompatTextView, new xg5(3, (Continuation) null, 2));
                linearLayout.addView(appCompatTextView);
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout.getContext(), (AttributeSet) null);
                appCompatTextView2.setText(mra.x);
                puf.m.b(appCompatTextView2, uy4.b);
                b0h.H(appCompatTextView2, new xg5(3, (Continuation) null, 3));
                linearLayout.addView(appCompatTextView2);
                linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density), linearLayout.getPaddingBottom());
                return linearLayout;
            default:
                KProperty[] kPropertyArr2 = PartialMediaAccessWidget.o;
                LinearLayout linearLayout2 = new LinearLayout(partialMediaAccessWidget.getContext());
                linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                linearLayout2.setVerticalGravity(16);
                KProperty kProperty = PartialMediaAccessWidget.o[0];
                linearLayout2.addView((LinearLayout) partialMediaAccessWidget.b.getValue());
                OneMeButton oneMeButton = new OneMeButton(linearLayout2.getContext(), (AttributeSet) null);
                oneMeButton.setText(mra.w);
                oneMeButton.setSize(aqa.a);
                oneMeButton.setMode(zpa.b);
                oneMeButton.setAppearance(xpa.c);
                ct.G(oneMeButton, 300, new u99(13, (Object) partialMediaAccessWidget));
                linearLayout2.addView(oneMeButton);
                float f = (float) 12;
                float f2 = (float) 4;
                linearLayout2.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
                b0h.H(linearLayout2, new o(3, (Continuation) null, 9));
                return linearLayout2;
        }
    }
}

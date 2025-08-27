package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatRadioButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;

/* renamed from: l1e  reason: default package */
public final /* synthetic */ class l1e implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ r1e c;

    public /* synthetic */ l1e(Context context, r1e r1e, int i) {
        this.a = i;
        this.b = context;
        this.c = r1e;
    }

    /* JADX WARNING: type inference failed for: r6v7, types: [androidx.appcompat.widget.AppCompatRadioButton, android.widget.CompoundButton, android.view.View, java.lang.Object, bya] */
    public final Object invoke() {
        r1e r1e = this.c;
        Context context = this.b;
        switch (this.a) {
            case 0:
                return r1e.M(context, r1e);
            case 1:
                return r1e.L(context, r1e);
            case 2:
                return r1e.O(context, r1e);
            case 3:
                return r1e.N(context, r1e);
            case 4:
                z1b z1b = new z1b(context, (AttributeSet) null);
                z1b.setChecked(false);
                z1b.setShowText(false);
                r1e.J0.addView(z1b);
                return z1b;
            case 5:
                ? appCompatRadioButton = new AppCompatRadioButton(context, (AttributeSet) null);
                float f = (float) 28;
                appCompatRadioButton.setLayoutParams(new ViewGroup.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
                appCompatRadioButton.b(appCompatRadioButton.isChecked(), fu4.k.e(appCompatRadioButton.getContext()).f());
                appCompatRadioButton.setChecked(false);
                r1e.J0.addView(appCompatRadioButton);
                return appCompatRadioButton;
            default:
                wsa wsa = new wsa(context);
                wsa.setId(bza.i);
                LinearLayout linearLayout = r1e.J0;
                fj3 fj3 = new fj3(-2, -2);
                fj3.setMarginEnd(MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density));
                Unit unit = Unit.INSTANCE;
                linearLayout.addView(wsa, fj3);
                return wsa;
        }
    }
}

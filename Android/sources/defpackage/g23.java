package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.math.MathKt;
import one.me.chats.search.views.ClearRecentSearchBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: g23  reason: default package */
public final class g23 extends LinearLayout implements phf {
    public final AppCompatTextView a;
    public final OneMeButton b;
    public final OneMeButton c;

    public g23(FrameLayout frameLayout, ClearRecentSearchBottomSheet clearRecentSearchBottomSheet, Context context) {
        super(context);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        appCompatTextView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setGravity(17);
        appCompatTextView.setText(appCompatTextView.getContext().getString(jra.w));
        puf.c.b(appCompatTextView, uy4.b);
        appCompatTextView.setTextColor(fu4.k.e(appCompatTextView.getContext()).f().getText().e);
        this.a = appCompatTextView;
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton.setId(View.generateViewId());
        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        aqa aqa = aqa.c;
        oneMeButton.setSize(aqa);
        zpa zpa = zpa.o;
        oneMeButton.setMode(zpa);
        oneMeButton.setAppearance(xpa.b);
        oneMeButton.setText(jra.v);
        ct.G(oneMeButton, 300, new f23(clearRecentSearchBottomSheet, 0));
        this.b = oneMeButton;
        OneMeButton oneMeButton2 = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton2.setId(View.generateViewId());
        oneMeButton2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        oneMeButton2.setSize(aqa);
        oneMeButton2.setMode(zpa);
        oneMeButton2.setAppearance(xpa.o);
        oneMeButton2.setText(jra.u);
        ct.G(oneMeButton2, 300, new f23(clearRecentSearchBottomSheet, 1));
        this.c = oneMeButton2;
        setOrientation(1);
        addView(appCompatTextView);
        addView(oneMeButton);
        addView(oneMeButton2);
        float f = (float) 12;
        frameLayout.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(((float) 26) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), 0);
    }

    public final OneMeButton getCancel() {
        return this.c;
    }

    public final OneMeButton getConfirm() {
        return this.b;
    }

    public final AppCompatTextView getTitle() {
        return this.a;
    }

    public final void onThemeChanged(k2b k2b) {
        this.a.setTextColor(k2b.getText().e);
        this.b.e();
        this.c.e();
    }
}

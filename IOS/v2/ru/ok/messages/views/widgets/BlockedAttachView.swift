package ru.ok.messages.views.widgets;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

public class BlockedAttachView extends LinearLayout {
    public AppCompatTextView a;
    public GradientDrawable b;

    public BlockedAttachView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public final void a() {
        getContext();
        ro4 b2 = ro4.b();
        setOrientation(1);
        setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.b = gradientDrawable;
        gradientDrawable.setColor(fw3.a(getContext(), lad.n));
        setBackground(this.b);
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), (AttributeSet) null);
        appCompatImageView.setImageResource(nad.s1);
        appCompatImageView.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        addView(appCompatImageView, new LinearLayout.LayoutParams(-2, -2));
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.a = appCompatTextView;
        appCompatTextView.setGravity(17);
        this.a.setTextSize(0, b2.S);
        this.a.setText(getResources().getText(qad.b2));
        this.a.setTextColor(-1);
        this.a.setPadding(0, b2.j, 0, 0);
        addView(this.a, new LinearLayout.LayoutParams(-1, -2));
    }

    public void setCorners(float[] fArr) {
        this.b.setCornerRadii(fArr);
    }
}

package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.WeakHashMap;

public class SnackbarContentLayout extends LinearLayout implements tv3 {
    public TextView a;
    public Button b;
    public final TimeInterpolator c;
    public int o;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = ld8.o0(context, edc.motionEasingEmphasizedInterpolator, xg.b);
    }

    public final boolean a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.a.getPaddingTop() == i2 && this.a.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.a;
        WeakHashMap weakHashMap = gag.a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.b;
    }

    public TextView getMessageView() {
        return this.a;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(agc.snackbar_text);
        this.b = (Button) findViewById(agc.snackbar_action);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() != 1) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(iec.design_snackbar_padding_vertical_2lines);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(iec.design_snackbar_padding_vertical);
            Layout layout = this.a.getLayout();
            boolean z = layout != null && layout.getLineCount() > 1;
            if (!z || this.o <= 0 || this.b.getMeasuredWidth() <= this.o) {
                if (!z) {
                    dimensionPixelSize = dimensionPixelSize2;
                }
                if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                    return;
                }
            } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                return;
            }
            super.onMeasure(i, i2);
        }
    }

    public void setMaxInlineActionWidth(int i) {
        this.o = i;
    }
}

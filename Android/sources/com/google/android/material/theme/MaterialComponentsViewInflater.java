package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;

public class MaterialComponentsViewInflater extends qp {
    public final in a(Context context, AttributeSet attributeSet) {
        return new eg8(context, attributeSet);
    }

    public final AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    public final AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new wg8(context, attributeSet);
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.widget.AppCompatRadioButton, android.widget.CompoundButton, android.view.View, zg8] */
    public final AppCompatRadioButton d(Context context, AttributeSet attributeSet) {
        int i = edc.radioButtonStyle;
        int i2 = zg8.x;
        ? appCompatRadioButton = new AppCompatRadioButton(fh8.a(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = appCompatRadioButton.getContext();
        TypedArray d = vhf.d(context2, attributeSet, tnc.MaterialRadioButton, i, i2, new int[0]);
        if (d.hasValue(tnc.MaterialRadioButton_buttonTint)) {
            jd3.c(appCompatRadioButton, m5a.C(context2, d, tnc.MaterialRadioButton_buttonTint));
        }
        appCompatRadioButton.w = d.getBoolean(tnc.MaterialRadioButton_useMaterialThemeColors, false);
        d.recycle();
        return appCompatRadioButton;
    }

    public final AppCompatTextView e(Context context, AttributeSet attributeSet) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(fh8.a(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = appCompatTextView.getContext();
        if (b59.U(edc.textAppearanceLineHeightEnabled, context2, true)) {
            Resources.Theme theme = context2.getTheme();
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, tnc.MaterialTextView, 16842884, 0);
            int[] iArr = {tnc.MaterialTextView_android_lineHeight, tnc.MaterialTextView_lineHeight};
            int i = -1;
            for (int i2 = 0; i2 < 2 && i < 0; i2++) {
                i = m5a.D(context2, obtainStyledAttributes, iArr[i2], -1);
            }
            obtainStyledAttributes.recycle();
            if (i == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, tnc.MaterialTextView, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(tnc.MaterialTextView_android_textAppearance, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, tnc.MaterialTextAppearance);
                    Context context3 = appCompatTextView.getContext();
                    int[] iArr2 = {tnc.MaterialTextAppearance_android_lineHeight, tnc.MaterialTextAppearance_lineHeight};
                    int i3 = -1;
                    for (int i4 = 0; i4 < 2 && i3 < 0; i4++) {
                        i3 = m5a.D(context3, obtainStyledAttributes3, iArr2[i4], -1);
                    }
                    obtainStyledAttributes3.recycle();
                    if (i3 >= 0) {
                        appCompatTextView.setLineHeight(i3);
                    }
                }
            }
        }
        return appCompatTextView;
    }
}

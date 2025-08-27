package defpackage;

import android.content.res.ColorStateList;
import androidx.appcompat.widget.AppCompatRadioButton;

/* renamed from: zg8  reason: default package */
public final class zg8 extends AppCompatRadioButton {
    public static final int x = hnc.Widget_MaterialComponents_CompoundButton_RadioButton;
    public static final int[][] y = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    public ColorStateList v;
    public boolean w;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.v == null) {
            int A = ld9.A(this, edc.colorControlActivated);
            int A2 = ld9.A(this, edc.colorOnSurface);
            int A3 = ld9.A(this, edc.colorSurface);
            this.v = new ColorStateList(y, new int[]{ld9.K(A3, 1.0f, A), ld9.K(A3, 0.54f, A2), ld9.K(A3, 0.38f, A2), ld9.K(A3, 0.38f, A2)});
        }
        return this.v;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.w && jd3.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.w = z;
        if (z) {
            jd3.c(this, getMaterialThemeColorsTintList());
        } else {
            jd3.c(this, (ColorStateList) null);
        }
    }
}

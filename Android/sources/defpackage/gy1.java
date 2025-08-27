package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: gy1  reason: default package */
public final class gy1 {
    public static final v00 c = new v00(7);
    public final m44 a;
    public final int b;

    public gy1(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
        int i5;
        boolean z2;
        if (z) {
            i5 = i3;
            z2 = true;
        } else {
            z2 = false;
            i5 = -16777216;
        }
        this.a = new m44(spannableStringBuilder, alignment, (Layout.Alignment) null, (Bitmap) null, f, 0, i, f2, i2, IntCompanionObject.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z2, i5, IntCompanionObject.MIN_VALUE, c44.DEFAULT_ASPECT_RATIO);
        this.b = i4;
    }
}

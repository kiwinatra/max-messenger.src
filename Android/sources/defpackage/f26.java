package defpackage;

import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageButton;
import kotlin.math.MathKt;

/* renamed from: f26  reason: default package */
public final class f26 extends AppCompatImageButton implements wcf {
    public final void L0(scf scf) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            iq.a0(drawable, scf.x);
        }
        setBackground(i8b.f(0, scf.j, 0, MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density)));
    }
}

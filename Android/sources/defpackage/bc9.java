package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.EditText;

/* renamed from: bc9  reason: default package */
public final class bc9 extends EditText {
    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable instanceof Animatable) || super.verifyDrawable(drawable);
    }
}

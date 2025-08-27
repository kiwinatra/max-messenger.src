package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* renamed from: gvf  reason: default package */
public final class gvf extends CharacterStyle implements jf8, UpdateAppearance {
    public final if8 a = if8.o;

    public final zz3 copy() {
        return new gvf();
    }

    public final if8 getType() {
        return this.a;
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}

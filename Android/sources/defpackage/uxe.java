package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* renamed from: uxe  reason: default package */
public final class uxe extends CharacterStyle implements jf8, UpdateAppearance {
    public final if8 a = if8.x;

    public final zz3 copy() {
        return new uxe();
    }

    public final if8 getType() {
        return this.a;
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setStrikeThruText(true);
    }
}

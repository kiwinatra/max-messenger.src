package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.jvm.functions.Function1;

/* renamed from: aif  reason: default package */
public final class aif extends CharacterStyle implements UpdateAppearance, phf {
    public final Function1 a;
    public int b;

    public aif(k2b k2b, Function1 function1) {
        this.a = function1;
        this.b = ((Number) function1.invoke(k2b)).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aif) && this.b == ((aif) obj).b;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.b) * 31) + aif.class.hashCode();
    }

    public final void onThemeChanged(k2b k2b) {
        this.b = ((Number) this.a.invoke(k2b)).intValue();
    }

    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            textPaint.setColor(this.b);
        }
    }
}

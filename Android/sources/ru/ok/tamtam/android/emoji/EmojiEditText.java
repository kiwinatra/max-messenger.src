package ru.ok.tamtam.android.emoji;

import android.content.Context;
import android.util.AttributeSet;

public class EmojiEditText extends cj {
    public l45 z;

    public EmojiEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, hdc.editTextStyle);
        c35 c35 = (c35) ((sjd) ((y9f) context.getApplicationContext()).a()).getAccessor().g(c35.class);
        if (!c35.f) {
            addTextChangedListener(new v35(0, c35));
        }
    }

    public final boolean onTextContextMenuItem(int i) {
        return i == 16908322 ? super.onTextContextMenuItem(16908337) : super.onTextContextMenuItem(i);
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object, l45, android.text.TextWatcher] */
    public void setReplaceTextSmiles(boolean z2) {
        if (!z2) {
            l45 l45 = this.z;
            if (l45 != null) {
                removeTextChangedListener(l45);
                this.z = null;
            }
        } else if (this.z == null) {
            ? obj = new Object();
            this.z = obj;
            addTextChangedListener(obj);
        }
    }
}

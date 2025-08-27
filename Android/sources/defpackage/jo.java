package defpackage;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: jo  reason: default package */
public final class jo {
    public final TextView a;
    public final e4 b;

    public jo(TextView textView) {
        this.a = textView;
        this.b = new e4(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((y64) this.b.b).t(inputFilterArr);
    }

    public final boolean b() {
        return ((y64) this.b.b).v();
    }

    /* JADX INFO: finally extract failed */
    public final void c(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, koc.AppCompatTextView, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(koc.AppCompatTextView_emojiCompatEnabled)) {
                z = obtainStyledAttributes.getBoolean(koc.AppCompatTextView_emojiCompatEnabled, true);
            }
            obtainStyledAttributes.recycle();
            e(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void d(boolean z) {
        ((y64) this.b.b).D(z);
    }

    public final void e(boolean z) {
        ((y64) this.b.b).E(z);
    }
}

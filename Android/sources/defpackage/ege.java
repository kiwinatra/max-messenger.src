package defpackage;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ege  reason: default package */
public final class ege implements TextWatcher, SpanWatcher {
    public final Object a;
    public final AtomicInteger b = new AtomicInteger(0);

    public ege(Object obj) {
        this.a = obj;
    }

    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.a).afterTextChanged(editable);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.a).beforeTextChanged(charSequence, i, i2, i3);
    }

    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if (this.b.get() <= 0 || !(obj instanceof kuf)) {
            ((SpanWatcher) this.a).onSpanAdded(spannable, obj, i, i2);
        }
    }

    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        if (this.b.get() <= 0 || !(obj instanceof kuf)) {
            ((SpanWatcher) this.a).onSpanChanged(spannable, obj, i, i2, i3, i4);
        }
    }

    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        if (this.b.get() <= 0 || !(obj instanceof kuf)) {
            ((SpanWatcher) this.a).onSpanRemoved(spannable, obj, i, i2);
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.a).onTextChanged(charSequence, i, i2, i3);
    }
}

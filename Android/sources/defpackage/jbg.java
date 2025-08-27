package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import kotlin.Unit;

/* renamed from: jbg  reason: default package */
public final class jbg implements View.OnAttachStateChangeListener, TextWatcher {
    public final WeakReference a;

    public jbg(TextView textView) {
        this.a = new WeakReference(textView);
        if (textView.isAttachedToWindow()) {
            a(textView);
        }
    }

    public static void a(TextView textView) {
        CharSequence text = textView.getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        Object[] spans = spanned != null ? spanned.getSpans(0, textView.getText().length(), ibg.class) : null;
        if (spans == null) {
            spans = new ibg[0];
        }
        for (Object obj : spans) {
            bq5 bq5 = (bq5) ((ibg) obj);
            WeakHashMap weakHashMap = bq5.w;
            if (weakHashMap.put(textView, Unit.INSTANCE) == null) {
                bq5.getDrawable().setCallback(new zp5(bq5, weakHashMap));
                Drawable drawable = bq5.getDrawable();
                Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
                if (animatable != null) {
                    animatable.start();
                }
            }
        }
    }

    public final void afterTextChanged(Editable editable) {
        TextView textView = (TextView) this.a.get();
        if (textView != null) {
            a(textView);
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onViewAttachedToWindow(View view) {
        a((TextView) view);
    }

    public final void onViewDetachedFromWindow(View view) {
        TextView textView = (TextView) view;
        CharSequence text = textView.getText();
        Object[] objArr = null;
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        if (spanned != null) {
            objArr = spanned.getSpans(0, textView.getText().length(), ibg.class);
        }
        if (objArr == null) {
            objArr = new ibg[0];
        }
        for (Object obj : objArr) {
            ((bq5) ((ibg) obj)).c(textView);
        }
    }
}

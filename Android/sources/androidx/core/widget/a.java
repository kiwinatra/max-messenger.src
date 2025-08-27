package androidx.core.widget;

import android.graphics.Paint;
import android.view.ActionMode;
import android.widget.TextView;

public abstract class a {
    public static void a(TextView textView, int i) {
        bs0.p(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    public static ActionMode.Callback b(ActionMode.Callback callback) {
        return callback instanceof TextViewCompat$OreoCallback ? ((TextViewCompat$OreoCallback) callback).getWrappedCallback() : callback;
    }
}

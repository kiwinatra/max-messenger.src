package ru.ok.messages.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

public class SelectableTextView extends AppCompatTextView {
    public SelectableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setEnabled(false);
        setEnabled(true);
    }
}

package ru.ok.messages.views.widgets;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import ru.ok.messages.actions.ExtraActionsView;

public class ListExtraActionsView extends ExtraActionsView<Object> {
    static {
        Typeface.create("sans-serif-medium", 0);
        Typeface.create("sans-serif", 0);
    }

    public ListExtraActionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

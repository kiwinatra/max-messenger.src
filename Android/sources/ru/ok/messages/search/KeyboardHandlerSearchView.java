package ru.ok.messages.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;

public class KeyboardHandlerSearchView extends gmd {
    private kq7 listener;

    public KeyboardHandlerSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        kq7 kq7 = this.listener;
        if (kq7 != null) {
            ((jkd) kq7).Z = false;
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    public void setListener(kq7 kq7) {
        this.listener = kq7;
    }

    public KeyboardHandlerSearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public KeyboardHandlerSearchView(Context context) {
        super(context, (AttributeSet) null);
    }
}

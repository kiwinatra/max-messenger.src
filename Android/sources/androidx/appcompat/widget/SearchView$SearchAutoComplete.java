package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;

public class SearchView$SearchAutoComplete extends in {
    public int v = getThreshold();
    public gmd w;
    public boolean x;
    public final tj7 y = new tj7(25, this);

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, hdc.autoCompleteTextViewStyle);
    }

    private int getSearchViewTextMinWidthDp() {
        Configuration configuration = getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
            return 256;
        }
        if (i < 600) {
            return (i < 640 || i2 < 480) ? 160 : 192;
        }
        return 192;
    }

    public final boolean enoughToFilter() {
        return this.v <= 0 || super.enoughToFilter();
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.x) {
            tj7 tj7 = this.y;
            removeCallbacks(tj7);
            post(tj7);
        }
        return onCreateInputConnection;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.w.onTextFocusChanged();
    }

    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            } else if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    this.w.clearFocus();
                    setImeVisibility(false);
                    return true;
                }
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.w.hasFocus() && getVisibility() == 0) {
            this.x = true;
            if (gmd.isLandscapeMode(getContext())) {
                zld.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                }
            }
        }
    }

    public final void performCompletion() {
    }

    public final void replaceText(CharSequence charSequence) {
    }

    public void setImeVisibility(boolean z) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        tj7 tj7 = this.y;
        if (!z) {
            this.x = false;
            removeCallbacks(tj7);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else if (inputMethodManager.isActive(this)) {
            this.x = false;
            removeCallbacks(tj7);
            inputMethodManager.showSoftInput(this, 0);
        } else {
            this.x = true;
        }
    }

    public void setSearchView(gmd gmd) {
        this.w = gmd;
    }

    public void setThreshold(int i) {
        super.setThreshold(i);
        this.v = i;
    }
}

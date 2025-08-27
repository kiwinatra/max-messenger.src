package ru.ok.messages.settings.folders.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/ok/messages/settings/folders/view/LockableNestedScrollView;", "Landroidx/core/widget/NestedScrollView;", "", "Q0", "Z", "getScrollEnabled", "()Z", "setScrollEnabled", "(Z)V", "scrollEnabled", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class LockableNestedScrollView extends NestedScrollView {
    public boolean Q0 = true;

    @JvmOverloads
    public LockableNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public final boolean getScrollEnabled() {
        return this.Q0;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.Q0) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.Q0) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setScrollEnabled(boolean z) {
        this.Q0 = z;
    }
}

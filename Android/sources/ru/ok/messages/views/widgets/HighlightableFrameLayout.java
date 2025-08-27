package ru.ok.messages.views.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/messages/views/widgets/HighlightableFrameLayout;", "Landroid/widget/FrameLayout;", "", "highlighted", "", "setHighlighted", "(Z)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class HighlightableFrameLayout extends FrameLayout {
    public final Drawable a;
    public boolean b;

    @JvmOverloads
    public HighlightableFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.a = ew3.b(context, nad.l);
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.b) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Drawable drawable = this.a;
            drawable.setBounds(0, 0, measuredWidth, measuredHeight);
            drawable.draw(canvas);
        }
    }

    public final void setHighlighted(boolean z) {
        this.b = z;
    }
}

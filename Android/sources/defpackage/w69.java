package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: w69  reason: default package */
public final class w69 extends FrameLayout implements c53 {
    public final CollapsibleActionView a;

    public w69(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }

    public final void onActionViewCollapsed() {
        this.a.onActionViewCollapsed();
    }

    public final void onActionViewExpanded() {
        this.a.onActionViewExpanded();
    }
}

package defpackage;

import android.view.View;
import android.widget.FrameLayout;

/* renamed from: uh4  reason: default package */
public final class uh4 extends FrameLayout {
    public boolean getClipChildren() {
        return false;
    }

    public final void setLoopAnimation(boolean z) {
    }

    public final void setScrollOffset(int i) {
        float f = (float) i;
        z69 z69 = new z69(1, this);
        while (z69.hasNext()) {
            View view = (View) z69.next();
            view.setTranslationY(view.getTranslationY() + f);
        }
    }
}

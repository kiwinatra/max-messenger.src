package defpackage;

import android.widget.ImageButton;

/* renamed from: qdg  reason: default package */
public abstract class qdg extends ImageButton {
    public int a;

    public final void a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.a = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.a;
    }

    public void setVisibility(int i) {
        a(i, true);
    }
}

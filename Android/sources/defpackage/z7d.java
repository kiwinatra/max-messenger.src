package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: z7d  reason: default package */
public final class z7d extends qb6 implements pdg {
    public Drawable v;
    public rdg w;

    public final void draw(Canvas canvas) {
        if (isVisible()) {
            rdg rdg = this.w;
            if (rdg != null) {
                rdg.onDraw();
            }
            super.draw(canvas);
            Drawable drawable = this.v;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.v.draw(canvas);
            }
        }
    }

    public final int getIntrinsicHeight() {
        return -1;
    }

    public final int getIntrinsicWidth() {
        return -1;
    }

    public final boolean setVisible(boolean z, boolean z2) {
        rdg rdg = this.w;
        if (rdg != null) {
            rdg.a(z);
        }
        return super.setVisible(z, z2);
    }
}

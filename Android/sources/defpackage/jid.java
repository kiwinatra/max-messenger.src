package defpackage;

import android.view.MotionEvent;

/* renamed from: jid  reason: default package */
public final class jid extends n3b implements h6a {
    public boolean b;

    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        this.b = i2 <= 0 && z2;
        super.onOverScrolled(i, i2, z, z2);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 0) {
            this.b = false;
        }
        return onTouchEvent;
    }
}

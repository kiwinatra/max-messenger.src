package defpackage;

import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* renamed from: bo  reason: default package */
public final class bo extends ContentFrameLayout {
    public final /* synthetic */ eo z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bo(eo eoVar, kx3 kx3) {
        super(kx3, (AttributeSet) null);
        this.z = eoVar;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.z.t(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                eo eoVar = this.z;
                eoVar.r(eoVar.y(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(iq.D(getContext(), i));
    }
}

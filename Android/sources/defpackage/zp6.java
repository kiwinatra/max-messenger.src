package defpackage;

import android.view.ScaleGestureDetector;
import com.yalantis.ucrop.view.GestureCropImageView;

/* renamed from: zp6  reason: default package */
public final class zp6 extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ GestureCropImageView a;

    public zp6(GestureCropImageView gestureCropImageView) {
        this.a = gestureCropImageView;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        GestureCropImageView gestureCropImageView = this.a;
        gestureCropImageView.postScale(scaleFactor, gestureCropImageView.mMidPntX, gestureCropImageView.mMidPntY);
        gestureCropImageView.mLastScaleFocusX = scaleGestureDetector.getFocusX();
        gestureCropImageView.mLastScaleFocusY = scaleGestureDetector.getFocusY();
        return true;
    }
}

package ru.ok.messages.media.mediabar;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import one.me.sdk.zoom.ZoomableDraweeView;

public class LocalPhotoView extends ZoomableDraweeView {
    public static final /* synthetic */ int G0 = 0;
    public final GestureDetector E0;
    public c58 F0;

    public LocalPhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        GestureDetector gestureDetector = new GestureDetector(context, new q00(15, this));
        this.E0 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        tp6 tp6 = new tp6(getResources());
        tp6.l = ydd.p;
        tp6.b = 0;
        setHierarchy(tp6.a());
    }

    public final void onDraw(Canvas canvas) {
        getDrawable().setBounds(0, 0, getWidth(), getHeight());
        super.onDraw(canvas);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.E0.onTouchEvent(motionEvent);
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setListener(c58 c58) {
        this.F0 = c58;
    }
}

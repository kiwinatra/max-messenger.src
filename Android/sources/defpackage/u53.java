package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;

/* renamed from: u53  reason: default package */
public final class u53 extends pzc implements View.OnTouchListener {
    public static final OvershootInterpolator F0 = new OvershootInterpolator();
    public final r53 D0;
    public final GestureDetector E0;

    public u53(FrameLayout frameLayout, r53 r53, s53 s53) {
        super(frameLayout);
        this.D0 = r53;
        frameLayout.setOnTouchListener(this);
        this.E0 = new GestureDetector(frameLayout.getContext(), new t53(0, (Object) s53, (Object) r53));
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.E0.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        OvershootInterpolator overshootInterpolator = F0;
        View view2 = this.a;
        if (action == 0 || motionEvent.getActionMasked() == 5) {
            view2.animate().scaleX(1.2f).scaleY(1.2f).setDuration(125).setInterpolator(overshootInterpolator);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getActionMasked() == 6) {
            view2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(125).setInterpolator(overshootInterpolator);
        }
        return true;
    }
}

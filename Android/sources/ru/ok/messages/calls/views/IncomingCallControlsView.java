package ru.ok.messages.calls.views;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Lazy;

public class IncomingCallControlsView extends LinearLayout implements de7 {
    public static final /* synthetic */ int D0 = 0;
    public final int A0;
    public final int B0;
    public final ro4 C0 = ro4.b();
    public final scf a;
    public final ImageButton b;
    public final ImageButton c;
    public final ImageButton o;
    public final ImageView v;
    public final ImageView v0;
    public final ImageView w;
    public final TextView w0;
    public final ImageView x;
    public final View x0;
    public final ImageView y;
    public Animator y0;
    public final ImageView z;
    public boolean z0;

    public IncomingCallControlsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        setOrientation(1);
        setGravity(81);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        View.inflate(getContext(), ujc.view_incoming_call_controls, this);
        if (!isInEditMode()) {
            Context context2 = getContext();
            Lazy lazy = scf.b0;
            this.a = j4b.k0(context2);
            ((IncomingButtonsLayout) findViewById(lic.view_incoming_call_controls__ll_buttons)).setListener(this);
            this.x0 = findViewById(lic.view_incoming_call_controls__ll_swipe_hint);
            this.w0 = (TextView) findViewById(lic.view_incoming_call_controls__tv_swipe_hint);
            this.v = (ImageView) findViewById(lic.view_incoming_call_controls__iv_swipe_left);
            this.w = (ImageView) findViewById(lic.view_incoming_call_controls__iv_swipe_center);
            this.x = (ImageView) findViewById(lic.view_incoming_call_controls__iv_swipe_right);
            this.y = (ImageView) findViewById(lic.view_incoming_call_controls__iv_swipe_left2);
            this.z = (ImageView) findViewById(lic.view_incoming_call_controls__iv_swipe_center2);
            this.v0 = (ImageView) findViewById(lic.view_incoming_call_controls__iv_swipe_right2);
            ImageButton imageButton = (ImageButton) findViewById(lic.view_incoming_call_controls__btn_decline);
            this.b = imageButton;
            imageButton.setColorFilter(this.a.m);
            this.b.setBackground(i8b.J(fw3.a(getContext(), lad.i), this.a.B));
            this.b.setOnTouchListener(new ng1(6, new y86(16, (Object) this)));
            ImageButton imageButton2 = (ImageButton) findViewById(lic.view_incoming_call_controls__btn_accept_right);
            this.c = imageButton2;
            imageButton2.setColorFilter(this.a.m);
            ImageButton imageButton3 = this.c;
            Context context3 = getContext();
            int i = lad.h;
            imageButton3.setBackground(i8b.J(fw3.a(context3, i), this.a.B));
            ng1 ng1 = new ng1(6, new y86(16, (Object) this));
            this.c.setOnTouchListener(ng1);
            ImageButton imageButton4 = (ImageButton) findViewById(lic.view_incoming_call_controls__btn_accept_center);
            this.o = imageButton4;
            imageButton4.setColorFilter(this.a.m);
            this.o.setBackground(i8b.J(fw3.a(getContext(), i), this.a.B));
            this.o.setOnTouchListener(ng1);
            y64.n(this.b, new fe7(this, 0));
            y64.n(this.c, new fe7(this, 1));
            y64.n(this.o, new fe7(this, 2));
            this.A0 = fw3.a(getContext(), lad.g);
            this.B0 = -1;
            setClipChildren(false);
        }
    }

    public static void b(View view, View view2, float f) {
        if (view != view2) {
            view.animate().alpha(f).setDuration(200).start();
        }
    }

    public static void c(View view, int i, he7 he7) {
        view.setTranslationY((float) view.getMeasuredHeight());
        ViewPropertyAnimator duration = view.animate().alpha(1.0f).translationY(c44.DEFAULT_ASPECT_RATIO).setStartDelay((long) i).setDuration(300);
        duration.setListener((Animator.AnimatorListener) null);
        duration.start();
        if (he7 != null) {
            duration.setListener(he7);
        }
    }

    public static void d(View view, int i, yy3 yy3) {
        view.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
        ViewPropertyAnimator duration = view.animate().alpha(c44.DEFAULT_ASPECT_RATIO).translationY((float) (-view.getMeasuredHeight())).setStartDelay((long) i).setDuration(300);
        duration.setListener((Animator.AnimatorListener) null);
        duration.start();
        if (yy3 != null) {
            duration.setListener(yy3);
        }
    }

    /* access modifiers changed from: private */
    public void setSwipeHintColor(int i) {
        this.w0.setTextColor(i);
        this.v.setColorFilter(i);
        this.y.setColorFilter(i);
        this.w.setColorFilter(i);
        this.z.setColorFilter(i);
        this.x.setColorFilter(i);
        this.v0.setColorFilter(i);
    }

    private void setupSwipeHintText(View view) {
        if (view == this.v) {
            this.w0.setText(getContext().getString(qad.i0));
        } else if (view == this.w) {
            this.w0.setText(getContext().getString(qad.h0));
        } else if (view == this.x) {
            this.w0.setText(getContext().getString(qad.j0));
        }
        this.w0.post(new uo5(12, (Object) this, (Object) view));
    }

    public final void e() {
        this.v.animate().cancel();
        this.v.animate().setListener((Animator.AnimatorListener) null);
        this.y.animate().cancel();
        this.y.animate().setListener((Animator.AnimatorListener) null);
        this.w.animate().cancel();
        this.w.animate().setListener((Animator.AnimatorListener) null);
        this.z.animate().cancel();
        this.z.animate().setListener((Animator.AnimatorListener) null);
        this.x.animate().cancel();
        this.x.animate().setListener((Animator.AnimatorListener) null);
        this.v0.animate().cancel();
        this.v0.animate().setListener((Animator.AnimatorListener) null);
        this.w0.animate().cancel();
        this.w0.animate().setListener((Animator.AnimatorListener) null);
    }

    public final void f() {
        this.v.setAlpha(c44.DEFAULT_ASPECT_RATIO);
        this.y.setAlpha(c44.DEFAULT_ASPECT_RATIO);
        this.w.setAlpha(c44.DEFAULT_ASPECT_RATIO);
        this.z.setAlpha(c44.DEFAULT_ASPECT_RATIO);
        this.x.setAlpha(c44.DEFAULT_ASPECT_RATIO);
        this.v0.setAlpha(c44.DEFAULT_ASPECT_RATIO);
        this.w0.setAlpha(c44.DEFAULT_ASPECT_RATIO);
        this.v.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
        this.y.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
        this.w.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
        this.z.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
        this.x.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
        this.v0.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
        this.w0.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
        this.x0.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
        this.x0.setAlpha(1.0f);
    }

    public final void g(View view) {
        ImageButton imageButton = this.b;
        ImageButton imageButton2 = this.o;
        if (!this.z0) {
            if (view != imageButton2) {
                ValueAnimator duration = ValueAnimator.ofFloat(new float[]{1.0f, c44.DEFAULT_ASPECT_RATIO}).setDuration(150);
                duration.addUpdateListener(new je7(imageButton2, imageButton2.getTop()));
                duration.start();
            }
            Animator animator = this.y0;
            if (animator != null) {
                animator.cancel();
            }
            e();
            k(view == imageButton ? this.v : view == imageButton2 ? this.w : this.x, view == imageButton ? this.y : view == imageButton2 ? this.z : this.v0, 0, false);
            b(imageButton, view, 0.5f);
            b(this.c, view, 0.5f);
            b(imageButton2, view, 0.5f);
            setSwipeHintColor(this.B0);
        }
    }

    public final void h(float f, View view, boolean z2) {
        ImageButton imageButton = this.o;
        ImageButton imageButton2 = this.b;
        View view2 = this.x0;
        ImageButton imageButton3 = this.c;
        if (!this.z0) {
            if (f < this.w0.getAlpha()) {
                view2.setAlpha(f);
            }
            if (view != imageButton2 && f < imageButton3.getAlpha()) {
                imageButton2.setAlpha(f);
            }
            if (view != imageButton3 && f < imageButton3.getAlpha()) {
                imageButton3.setAlpha(f);
            }
            if (view != imageButton && f < imageButton.getAlpha()) {
                imageButton.setAlpha(f);
            }
            if (1 == hd8.K(getContext())) {
                view2.setTranslationY((float) view.getTop());
            }
            if (z2) {
                this.z0 = true;
                e();
                view.animate().cancel();
                view.animate().alpha(c44.DEFAULT_ASPECT_RATIO).setDuration(300).setListener(new wh(this, view, false, 6));
                if (imageButton2 != view) {
                    imageButton2.animate().cancel();
                    imageButton2.animate().setDuration(300).alpha(c44.DEFAULT_ASPECT_RATIO).setListener((Animator.AnimatorListener) null);
                }
                if (imageButton != view) {
                    imageButton.animate().cancel();
                    imageButton.animate().setDuration(300).alpha(c44.DEFAULT_ASPECT_RATIO).setListener((Animator.AnimatorListener) null);
                }
                if (imageButton3 != view) {
                    imageButton3.animate().cancel();
                    imageButton3.animate().setDuration(300).alpha(c44.DEFAULT_ASPECT_RATIO).setListener((Animator.AnimatorListener) null);
                }
                view2.animate().cancel();
                view2.animate().setDuration(300).alpha(c44.DEFAULT_ASPECT_RATIO).setListener((Animator.AnimatorListener) null);
            }
        }
    }

    public final void i(View view) {
        if (!this.z0) {
            e();
            f();
            invalidate();
            b(this, (View) null, 1.0f);
            b(this.b, view, 1.0f);
            b(this.c, view, 1.0f);
            b(this.o, view, 1.0f);
            setSwipeHintColor(this.A0);
        }
    }

    public final void j(View view, int i, int i2) {
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f, c44.DEFAULT_ASPECT_RATIO}).setDuration(400);
        ro4 ro4 = this.C0;
        duration.addUpdateListener(new je7(view, ro4.h));
        ValueAnimator duration2 = ValueAnimator.ofFloat(new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f, c44.DEFAULT_ASPECT_RATIO}).setDuration(400);
        duration2.addUpdateListener(new je7(view, ro4.c));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay((long) i2);
        animatorSet.playSequentially(new Animator[]{duration, duration2});
        animatorSet.addListener(new ge7(this, i, view));
        Animator animator = this.y0;
        if (animator != null) {
            animator.cancel();
        }
        this.y0 = animatorSet;
        animatorSet.start();
    }

    public final void k(View view, View view2, int i, boolean z2) {
        f();
        setupSwipeHintText(view);
        he7 he7 = null;
        c(this.w0, i, (he7) null);
        c(view2, i + 100, (he7) null);
        int i2 = i + 200;
        if (z2) {
            he7 = new he7(this, view, view2);
        }
        c(view, i2, he7);
    }

    public void setListener(ie7 ie7) {
    }
}

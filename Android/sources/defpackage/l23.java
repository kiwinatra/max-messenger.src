package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;

/* renamed from: l23  reason: default package */
public final class l23 extends p65 {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public EditText i;
    public final x4 j = new x4(26, (Object) this);
    public final i23 k = new i23(0, this);
    public AnimatorSet l;
    public ValueAnimator m;

    public l23(o65 o65) {
        super(o65);
        this.e = ld8.n0(edc.motionDurationShort3, 100, o65.getContext());
        this.f = ld8.n0(edc.motionDurationShort3, 150, o65.getContext());
        this.g = ld8.o0(o65.getContext(), edc.motionEasingLinearInterpolator, xg.a);
        this.h = ld8.o0(o65.getContext(), edc.motionEasingEmphasizedInterpolator, xg.d);
    }

    public final void a() {
        if (this.b.B0 == null) {
            t(u());
        }
    }

    public final int c() {
        return ymc.clear_text_end_icon_content_description;
    }

    public final int d() {
        return qfc.mtrl_ic_cancel;
    }

    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    public final View.OnClickListener f() {
        return this.j;
    }

    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    public final void m(EditText editText) {
        this.i = editText;
        this.a.setEndIconVisible(u());
    }

    public final void p(boolean z) {
        if (this.b.B0 != null) {
            t(z);
        }
    }

    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration((long) this.f);
        ofFloat.addUpdateListener(new j23(this, 1));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
        TimeInterpolator timeInterpolator = this.g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i2 = this.e;
        ofFloat2.setDuration((long) i2);
        ofFloat2.addUpdateListener(new j23(this, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        this.l.addListener(new k23(this, 0));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{1.0f, c44.DEFAULT_ASPECT_RATIO});
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration((long) i2);
        ofFloat3.addUpdateListener(new j23(this, 0));
        this.m = ofFloat3;
        ofFloat3.addListener(new k23(this, 1));
    }

    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new pr1(16, this));
        }
    }

    public final void t(boolean z) {
        boolean z2 = this.b.d() == z;
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
            }
        } else if (!z) {
            this.l.cancel();
            this.m.start();
            if (z2) {
                this.m.end();
            }
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        return editText != null && (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
    }
}

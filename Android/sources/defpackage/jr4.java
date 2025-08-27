package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: jr4  reason: default package */
public final class jr4 extends FrameLayout {
    public ch a;
    public final AppCompatTextView b;
    public final ShapeDrawable c;
    public final xs o;
    public dm4 v;

    /* JADX WARNING: type inference failed for: r13v0, types: [xs, android.graphics.drawable.AnimationDrawable] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jr4(Context context, int i) {
        super(context);
        int i2 = i;
        ro4 b2 = ro4.b();
        Resources resources = context.getResources();
        ? animationDrawable = new AnimationDrawable();
        animationDrawable.addFrame(resources.getDrawable(nad.m2), 50);
        animationDrawable.addFrame(resources.getDrawable(nad.t2), 50);
        animationDrawable.addFrame(resources.getDrawable(nad.u2), 50);
        animationDrawable.addFrame(resources.getDrawable(nad.v2), 50);
        animationDrawable.addFrame(resources.getDrawable(nad.w2), 50);
        animationDrawable.addFrame(resources.getDrawable(nad.x2), 50);
        animationDrawable.addFrame(resources.getDrawable(nad.y2), 50);
        animationDrawable.addFrame(resources.getDrawable(nad.z2), 50);
        animationDrawable.addFrame(resources.getDrawable(nad.A2), 50);
        animationDrawable.addFrame(resources.getDrawable(nad.n2), 50);
        animationDrawable.addFrame(resources.getDrawable(nad.o2), 50);
        animationDrawable.addFrame(resources.getDrawable(nad.p2), 50);
        animationDrawable.addFrame(resources.getDrawable(nad.q2), 50);
        animationDrawable.addFrame(resources.getDrawable(nad.r2), 50);
        animationDrawable.addFrame(resources.getDrawable(nad.s2), 50);
        this.o = animationDrawable;
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), (AttributeSet) null);
        appCompatImageView.setImageDrawable(this.o);
        int i3 = b2.x;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i3);
        layoutParams.gravity = 17;
        layoutParams.bottomMargin = b2.j;
        if (i2 == 1) {
            appCompatImageView.setRotationY(180.0f);
        }
        addView(appCompatImageView, layoutParams);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.b = appCompatTextView;
        appCompatTextView.setTextColor(-1);
        this.b.setTextSize(b2.P);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.topMargin = b2.j;
        addView(this.b, layoutParams2);
        int parseColor = Color.parseColor("#40FFFFFF");
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.c = shapeDrawable;
        shapeDrawable.getPaint().setColor(parseColor);
        setBackground(this.c);
        int b3 = vo4.b((int) 180.0f);
        if (i2 == 1) {
            float f = (float) b3;
            setCorners(new float[]{0.0f, 0.0f, f, f, f, f, 0.0f, 0.0f});
            return;
        }
        float f2 = (float) b3;
        setCorners(new float[]{f2, f2, 0.0f, 0.0f, 0.0f, 0.0f, f2, f2});
    }

    private void setCorners(float[] fArr) {
        this.c.setShape(new RoundRectShape(fArr, (RectF) null, (float[]) null));
    }

    public final void a() {
        if (getVisibility() != 8) {
            if (this.a == null) {
                setVisibility(8);
                return;
            }
            dm4 dm4 = this.v;
            if (dm4 != null) {
                dm4.f();
            }
            this.o.stop();
            this.v = this.a.g(this);
        }
    }

    public final void b() {
        if (getVisibility() != 0) {
            if (this.a == null) {
                setVisibility(0);
            } else if (!this.o.isRunning()) {
                dm4 dm4 = this.v;
                if (dm4 != null) {
                    dm4.f();
                }
                this.o.start();
                this.v = this.a.i(this);
            }
        }
    }

    public final void c(int i) {
        if (i == 0) {
            this.b.setText("");
        } else {
            this.b.setText(getResources().getString(qad.z8, new Object[]{Integer.valueOf(i)}));
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.o.stop();
        dm4 dm4 = this.v;
        if (dm4 != null) {
            dm4.f();
        }
    }

    public void setAnimations(ch chVar) {
        this.a = chVar;
    }
}

package defpackage;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: xmb  reason: default package */
public final class xmb implements anb {
    public final View a;
    public final pf1 b;
    public final b91 c;
    public float o;
    public float v;
    public zmb w = zmb.e;

    public xmb(View view, b8d b8d, b91 b91) {
        this.a = view;
        this.b = b8d;
        this.c = b91;
    }

    public final void a() {
        View view = this.a;
        float translationX = view.getTranslationX();
        float f = this.w.a;
        if (translationX >= f) {
            float translationX2 = view.getTranslationX();
            f = this.w.b;
            if (translationX2 <= f) {
                f = view.getTranslationX();
            }
        }
        float translationY = view.getTranslationY();
        float f2 = this.w.c;
        if (translationY >= f2) {
            float translationY2 = view.getTranslationY();
            f2 = this.w.d;
            if (translationY2 <= f2) {
                f2 = view.getTranslationY();
            }
        }
        if (f == view.getTranslationX() && f2 == view.getTranslationY()) {
            c();
        } else {
            view.animate().setDuration(200).translationX(f).translationY(f2).setListener(new uf(5, this)).start();
        }
    }

    public final boolean b(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        View view = this.a;
        if (action == 0) {
            this.o = motionEvent.getRawX();
            this.v = motionEvent.getRawY();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
        int action2 = motionEvent.getAction();
        if (action2 == 1) {
            a();
            return motionEvent.getAction() == 1 && motionEvent.getEventTime() - motionEvent.getDownTime() < 100;
        } else if (action2 == 2) {
            view.setTranslationX((motionEvent.getRawX() - this.o) + view.getTranslationX());
            view.setTranslationY((motionEvent.getRawY() - this.v) + view.getTranslationY());
            this.o = motionEvent.getRawX();
            this.v = motionEvent.getRawY();
            this.b.l(view.getX(), view.getY());
            return true;
        } else if (action2 != 3) {
            return true;
        } else {
            a();
            return true;
        }
    }

    public final void c() {
        View view = this.a;
        float x = view.getX();
        float y = view.getY();
        PointF pointF = ((c91) this.c).b;
        pointF.x = x;
        pointF.y = y;
    }

    public final void d(float f, float f2) {
        View view = this.a;
        view.setTranslationX(f);
        view.setTranslationY(f2);
        a();
    }

    public final void i(float f, float f2, int i, int i2, nmb nmb) {
        this.w = kne.f(this.a.getContext(), f, f2, i, i2, nmb);
    }
}

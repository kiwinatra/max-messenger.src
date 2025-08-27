package ru.ok.messages.views.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.KotlinVersion;

public class SlideOutLayout extends FrameLayout {
    public static final /* synthetic */ int A0 = 0;
    public final ro4 a;
    public int b = 0;
    public int c = 0;
    public float o = -1.0f;
    public float v = -1.0f;
    public boolean v0 = false;
    public float w = c44.DEFAULT_ASPECT_RATIO;
    public vde w0;
    public float x = c44.DEFAULT_ASPECT_RATIO;
    public final ArrayList x0 = new ArrayList();
    public final float y;
    public final int[] y0 = new int[2];
    public boolean z = false;
    public VelocityTracker z0;

    public SlideOutLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, wnc.SlideOutLayout);
        this.b = obtainStyledAttributes.getInt(wnc.SlideOutLayout_chistyakov_orientation, 0);
        this.c = obtainStyledAttributes.getInt(wnc.SlideOutLayout_type, 0);
        ct.b(this);
        if (ct.y(getContext())) {
            if (this.c == 1 && ct.y(getContext())) {
                this.c = 2;
            } else if (this.c == 2) {
                this.c = 1;
            }
        }
        obtainStyledAttributes.recycle();
        getContext();
        this.a = ro4.b();
        if (getBackground() != null) {
            getBackground().mutate();
            getBackground().setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float max = (float) (Math.max(viewConfiguration.getScaledTouchSlop(), viewConfiguration.getScaledPagingTouchSlop()) * 2);
        this.y = max;
        if (max <= c44.DEFAULT_ASPECT_RATIO) {
            this.y = (float) this.a.z;
        }
    }

    public final boolean a(View view) {
        float b2 = b(view);
        if (this.b != 0 || Math.abs(b2 / ((float) getMeasuredHeight())) <= 0.2f) {
            return this.b == 1 && Math.abs(b2 / ((float) getMeasuredWidth())) > 0.2f;
        }
        return true;
    }

    public final float b(View view) {
        return this.b == 0 ? view.getTranslationY() : view.getTranslationX();
    }

    public final void c(MotionEvent motionEvent) {
        float f;
        float x2;
        float f2;
        float y2;
        int i;
        int i2;
        if (this.v <= c44.DEFAULT_ASPECT_RATIO || this.o <= c44.DEFAULT_ASPECT_RATIO) {
            this.w = motionEvent.getY();
            this.x = motionEvent.getX();
        } else {
            if (this.b == 0) {
                f = this.w;
                x2 = motionEvent.getY();
            } else {
                f = this.x;
                x2 = motionEvent.getX();
            }
            float f3 = f - x2;
            if (this.b == 0) {
                f2 = this.x;
                y2 = motionEvent.getX();
            } else {
                f2 = this.w;
                y2 = motionEvent.getY();
            }
            float abs = Math.abs(f2 - y2);
            if (f3 > c44.DEFAULT_ASPECT_RATIO && ((i2 = this.c) == 1 || i2 == 3)) {
                return;
            }
            if (f3 >= c44.DEFAULT_ASPECT_RATIO || !((i = this.c) == 2 || i == 4)) {
                float abs2 = Math.abs(f3);
                if (abs2 > this.y && abs2 > abs * 2.0f) {
                    this.z = true;
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    vde vde = this.w0;
                    if (vde != null) {
                        vde.D1();
                    }
                }
            } else {
                return;
            }
        }
        this.o = motionEvent.getY();
        this.v = motionEvent.getX();
    }

    public final void d(float f) {
        View childAt = getChildAt(0);
        long j = 150;
        long abs = f != c44.DEFAULT_ASPECT_RATIO ? Math.abs((long) (b(childAt) / f)) : 150;
        if (abs <= 150) {
            j = abs;
        }
        if (this.b == 0) {
            childAt.animate().translationY(c44.DEFAULT_ASPECT_RATIO).setDuration(j).start();
        } else {
            childAt.animate().translationX(c44.DEFAULT_ASPECT_RATIO).setDuration(j).start();
        }
    }

    public final void e() {
        float translationX;
        int measuredWidth;
        if (getBackground() != null && getChildCount() > 0) {
            int i = 0;
            if (this.b == 0) {
                translationX = getChildAt(0).getTranslationY();
                measuredWidth = getMeasuredHeight();
            } else {
                translationX = getChildAt(0).getTranslationX();
                measuredWidth = getMeasuredWidth();
            }
            int abs = (int) ((1.0f - Math.abs(translationX / ((float) measuredWidth))) * 255.0f);
            if (abs > 255) {
                abs = 255;
            }
            if (abs >= 0) {
                i = abs;
            }
            getBackground().setAlpha(i);
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1) {
            this.z = false;
            d(c44.DEFAULT_ASPECT_RATIO);
            return false;
        }
        Iterator it = this.x0.iterator();
        while (it.hasNext()) {
            View view = (View) ((WeakReference) it.next()).get();
            if (view != null && view.getVisibility() == 0) {
                int[] iArr = this.y0;
                view.getLocationInWindow(iArr);
                if (motionEvent.getRawX() > ((float) iArr[0])) {
                    if (motionEvent.getRawX() < ((float) (view.getWidth() + iArr[0])) && motionEvent.getRawY() > ((float) iArr[1])) {
                        if (motionEvent.getRawY() < ((float) (view.getHeight() + iArr[1]))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        if (motionEvent.getAction() == 2 || motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 6) {
            c(motionEvent);
        } else {
            this.o = -1.0f;
            this.v = -1.0f;
        }
        return this.z;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        int measuredWidth;
        int measuredWidth2;
        float xVelocity;
        int pointerCount = motionEvent.getPointerCount();
        float f2 = c44.DEFAULT_ASPECT_RATIO;
        if (pointerCount > 1) {
            this.z = false;
            d(c44.DEFAULT_ASPECT_RATIO);
            return false;
        }
        int i = 3;
        if (motionEvent.getAction() == 2 || motionEvent.getAction() == 0 || motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 6) {
            if (this.z) {
                int i2 = this.b;
                float f3 = i2 == 0 ? this.o : this.v;
                if (f3 > c44.DEFAULT_ASPECT_RATIO) {
                    float y2 = f3 - (i2 == 0 ? motionEvent.getY() : motionEvent.getX());
                    if (getChildCount() > 0) {
                        View childAt = getChildAt(0);
                        if (this.b == 0) {
                            float translationY = childAt.getTranslationY() - y2;
                            int i3 = this.c;
                            if (i3 == 3 && translationY < c44.DEFAULT_ASPECT_RATIO) {
                                translationY = 0.0f;
                            }
                            if (i3 != 4 || translationY <= c44.DEFAULT_ASPECT_RATIO) {
                                f2 = translationY;
                            }
                            childAt.setTranslationY(f2);
                        } else {
                            float translationX = childAt.getTranslationX() - y2;
                            int i4 = this.c;
                            if (i4 == 1 && translationX < c44.DEFAULT_ASPECT_RATIO) {
                                translationX = 0.0f;
                            }
                            if (i4 != 2 || translationX <= c44.DEFAULT_ASPECT_RATIO) {
                                f2 = translationX;
                            }
                            childAt.setTranslationX(f2);
                        }
                        boolean a2 = a(childAt);
                        if (this.v0 != a2) {
                            if (this.w0 != null) {
                                b(childAt);
                            }
                            this.v0 = a2;
                        }
                        e();
                    }
                }
                this.o = motionEvent.getY();
                this.v = motionEvent.getX();
            } else {
                c(motionEvent);
            }
            if (this.z0 == null) {
                this.z0 = VelocityTracker.obtain();
            }
            this.z0.addMovement(motionEvent);
        } else {
            if (this.z && getChildCount() > 0) {
                View childAt2 = getChildAt(0);
                VelocityTracker velocityTracker = this.z0;
                if (velocityTracker != null) {
                    velocityTracker.computeCurrentVelocity(1);
                    if (this.b == 0) {
                        VelocityTracker velocityTracker2 = this.z0;
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        Map map = d2g.a;
                        xVelocity = velocityTracker2.getYVelocity(pointerId);
                    } else {
                        VelocityTracker velocityTracker3 = this.z0;
                        int pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
                        Map map2 = d2g.a;
                        xVelocity = velocityTracker3.getXVelocity(pointerId2);
                    }
                    f = (float) ((int) xVelocity);
                    this.z0.recycle();
                    this.z0 = null;
                } else {
                    f = 0.0f;
                }
                float b2 = b(childAt2);
                boolean a3 = a(childAt2);
                int i5 = (f > c44.DEFAULT_ASPECT_RATIO ? 1 : (f == c44.DEFAULT_ASPECT_RATIO ? 0 : -1));
                if ((i5 == 0 || Math.signum(b2) == Math.signum(f)) && (Math.abs(f) >= 2.0f || a3)) {
                    if (this.b != 0) {
                        i = b2 > c44.DEFAULT_ASPECT_RATIO ? 2 : 1;
                    } else if (b2 > c44.DEFAULT_ASPECT_RATIO) {
                        i = 4;
                    }
                    vde vde = this.w0;
                    if (vde == null || vde.e1()) {
                        View childAt3 = getChildAt(0);
                        if (this.b == 0) {
                            measuredWidth = childAt3.getMeasuredHeight();
                            measuredWidth2 = (getMeasuredHeight() - childAt3.getMeasuredHeight()) / 2;
                        } else {
                            measuredWidth = childAt3.getMeasuredWidth();
                            measuredWidth2 = (getMeasuredWidth() - childAt3.getMeasuredWidth()) / 2;
                        }
                        int i6 = measuredWidth2 + measuredWidth;
                        if (b(childAt3) < c44.DEFAULT_ASPECT_RATIO) {
                            i6 = -i6;
                        }
                        long j = 150;
                        long abs = i5 != 0 ? Math.abs((long) (((float) i6) / f)) : 150;
                        if (abs <= 150) {
                            j = abs;
                        }
                        ViewPropertyAnimator listener = childAt3.animate().setDuration(j).setListener(new mr2(this, i, 1));
                        listener.setUpdateListener(new z00(23, (Object) this));
                        if (this.b == 0) {
                            listener.translationY((float) i6);
                        } else {
                            listener.translationX((float) i6);
                        }
                        listener.start();
                    } else {
                        this.w0.A1(i);
                    }
                } else {
                    if (getBackground() != null) {
                        getBackground().setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                    }
                    d(f);
                    vde vde2 = this.w0;
                    if (vde2 != null) {
                        vde2.h0();
                    }
                }
                boolean a4 = a(childAt2);
                if (this.v0 != a4) {
                    if (this.w0 != null) {
                        b(childAt2);
                    }
                    this.v0 = a4;
                }
            }
            this.o = -1.0f;
            this.v = -1.0f;
            this.z = false;
        }
        return true;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        this.v = -1.0f;
        this.o = -1.0f;
        this.z = false;
    }

    public void setOrientation(int i) {
        this.b = i;
    }

    public void setSlideOutListener(vde vde) {
        this.w0 = vde;
    }

    public void setType(int i) {
        this.c = i;
    }
}

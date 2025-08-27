package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;

/* renamed from: jh5  reason: default package */
public final class jh5 extends zyc implements ezc {
    public static final int[] L0 = {16842919};
    public static final int[] M0 = new int[0];
    public int A0 = 0;
    public final RecyclerView B0;
    public boolean C0 = false;
    public boolean D0 = false;
    public int E0 = 0;
    public int F0 = 0;
    public final int[] G0 = new int[2];
    public final int[] H0 = new int[2];
    public final ValueAnimator I0;
    public int J0;
    public final cf K0;
    public final int X;
    public int Y;
    public int Z;
    public final int a;
    public final int b;
    public final StateListDrawable c;
    public final Drawable o;
    public final int v;
    public float v0;
    public final int w;
    public int w0;
    public final StateListDrawable x;
    public int x0;
    public final Drawable y;
    public float y0;
    public final int z;
    public int z0 = 0;

    public jh5(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
        this.I0 = ofFloat;
        this.J0 = 0;
        cf cfVar = new cf(21, this);
        this.K0 = cfVar;
        k61 k61 = new k61(4, this);
        this.c = stateListDrawable;
        this.o = drawable;
        this.x = stateListDrawable2;
        this.y = drawable2;
        this.v = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.w = Math.max(i, drawable.getIntrinsicWidth());
        this.z = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.X = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.b = i3;
        stateListDrawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        drawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        ofFloat.addListener(new yy3(1, this));
        ofFloat.addUpdateListener(new sk0(4, this));
        RecyclerView recyclerView2 = this.B0;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.r0(this);
                this.B0.t0(this);
                this.B0.u0(k61);
                this.B0.removeCallbacks(cfVar);
            }
            this.B0 = recyclerView;
            if (recyclerView != null) {
                recyclerView.j(this);
                this.B0.l(this);
                this.B0.m(k61);
            }
        }
    }

    public static int k(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    public final void a(MotionEvent motionEvent) {
        if (this.E0 != 0) {
            if (motionEvent.getAction() == 0) {
                boolean j = j(motionEvent.getX(), motionEvent.getY());
                boolean i = i(motionEvent.getX(), motionEvent.getY());
                if (j || i) {
                    if (i) {
                        this.F0 = 1;
                        this.y0 = (float) ((int) motionEvent.getX());
                    } else if (j) {
                        this.F0 = 2;
                        this.v0 = (float) ((int) motionEvent.getY());
                    }
                    l(2);
                }
            } else if (motionEvent.getAction() == 1 && this.E0 == 2) {
                this.v0 = c44.DEFAULT_ASPECT_RATIO;
                this.y0 = c44.DEFAULT_ASPECT_RATIO;
                l(1);
                this.F0 = 0;
            } else if (motionEvent.getAction() == 2 && this.E0 == 2) {
                m();
                int i2 = this.F0;
                int i3 = this.b;
                if (i2 == 1) {
                    float x2 = motionEvent.getX();
                    int[] iArr = this.H0;
                    iArr[0] = i3;
                    int i4 = this.z0 - i3;
                    iArr[1] = i4;
                    float max = Math.max((float) i3, Math.min((float) i4, x2));
                    if (Math.abs(((float) this.x0) - max) >= 2.0f) {
                        int k = k(this.y0, max, iArr, this.B0.computeHorizontalScrollRange(), this.B0.computeHorizontalScrollOffset(), this.z0);
                        if (k != 0) {
                            this.B0.scrollBy(k, 0);
                        }
                        this.y0 = max;
                    }
                }
                if (this.F0 == 2) {
                    float y2 = motionEvent.getY();
                    int[] iArr2 = this.G0;
                    iArr2[0] = i3;
                    int i5 = this.A0 - i3;
                    iArr2[1] = i5;
                    float max2 = Math.max((float) i3, Math.min((float) i5, y2));
                    if (Math.abs(((float) this.Z) - max2) >= 2.0f) {
                        int k2 = k(this.v0, max2, iArr2, this.B0.computeVerticalScrollRange(), this.B0.computeVerticalScrollOffset(), this.A0);
                        if (k2 != 0) {
                            this.B0.scrollBy(0, k2);
                        }
                        this.v0 = max2;
                    }
                }
            }
        }
    }

    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.E0;
        if (i == 1) {
            boolean j = j(motionEvent.getX(), motionEvent.getY());
            boolean i2 = i(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!j && !i2) {
                return false;
            }
            if (i2) {
                this.F0 = 1;
                this.y0 = (float) ((int) motionEvent.getX());
            } else if (j) {
                this.F0 = 2;
                this.v0 = (float) ((int) motionEvent.getY());
            }
            l(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    public final void e(boolean z2) {
    }

    public final void h(Canvas canvas, RecyclerView recyclerView) {
        int i = this.z0;
        RecyclerView recyclerView2 = this.B0;
        if (i != recyclerView2.getWidth() || this.A0 != recyclerView2.getHeight()) {
            this.z0 = recyclerView2.getWidth();
            this.A0 = recyclerView2.getHeight();
            l(0);
        } else if (this.J0 != 0) {
            if (this.C0) {
                int i2 = this.z0;
                int i3 = this.v;
                int i4 = i2 - i3;
                int i5 = this.Z;
                int i6 = this.Y;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.A0;
                int i9 = this.w;
                Drawable drawable = this.o;
                drawable.setBounds(0, 0, i9, i8);
                WeakHashMap weakHashMap = gag.a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate((float) i3, (float) i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate((float) (-i3), (float) (-i7));
                } else {
                    canvas.translate((float) i4, c44.DEFAULT_ASPECT_RATIO);
                    drawable.draw(canvas);
                    canvas.translate(c44.DEFAULT_ASPECT_RATIO, (float) i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate((float) (-i4), (float) (-i7));
                }
            }
            if (this.D0) {
                int i10 = this.A0;
                int i11 = this.z;
                int i12 = i10 - i11;
                int i13 = this.x0;
                int i14 = this.w0;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.x;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.z0;
                int i17 = this.X;
                Drawable drawable2 = this.y;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(c44.DEFAULT_ASPECT_RATIO, (float) i12);
                drawable2.draw(canvas);
                canvas.translate((float) i15, c44.DEFAULT_ASPECT_RATIO);
                stateListDrawable2.draw(canvas);
                canvas.translate((float) (-i15), (float) (-i12));
            }
        }
    }

    public final boolean i(float f, float f2) {
        if (f2 >= ((float) (this.A0 - this.z))) {
            int i = this.x0;
            int i2 = this.w0;
            return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
        }
    }

    public final boolean j(float f, float f2) {
        RecyclerView recyclerView = this.B0;
        WeakHashMap weakHashMap = gag.a;
        boolean z2 = recyclerView.getLayoutDirection() == 1;
        int i = this.v;
        if (z2) {
            if (f > ((float) i)) {
                return false;
            }
        } else if (f < ((float) (this.z0 - i))) {
            return false;
        }
        int i2 = this.Z;
        int i3 = this.Y / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    public final void l(int i) {
        cf cfVar = this.K0;
        StateListDrawable stateListDrawable = this.c;
        if (i == 2 && this.E0 != 2) {
            stateListDrawable.setState(L0);
            this.B0.removeCallbacks(cfVar);
        }
        if (i == 0) {
            this.B0.invalidate();
        } else {
            m();
        }
        if (this.E0 == 2 && i != 2) {
            stateListDrawable.setState(M0);
            this.B0.removeCallbacks(cfVar);
            this.B0.postDelayed(cfVar, (long) 1200);
        } else if (i == 1) {
            this.B0.removeCallbacks(cfVar);
            this.B0.postDelayed(cfVar, (long) 1500);
        }
        this.E0 = i;
    }

    public final void m() {
        int i = this.J0;
        ValueAnimator valueAnimator = this.I0;
        if (i != 0) {
            if (i == 3) {
                valueAnimator.cancel();
            } else {
                return;
            }
        }
        this.J0 = 1;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        valueAnimator.setDuration(500);
        valueAnimator.setStartDelay(0);
        valueAnimator.start();
    }
}

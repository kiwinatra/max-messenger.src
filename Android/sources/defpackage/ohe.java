package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* renamed from: ohe  reason: default package */
public final class ohe {
    public static final ry4 p = new ry4(1);
    public static final ry4 q = new ry4(2);
    public static final ry4 r = new ry4(3);
    public static final ry4 s = new ry4(4);
    public static final ry4 t = new ry4(5);
    public static final ry4 u = new ry4(6);
    public static final ry4 v = new ry4(7);
    public static final ry4 w = new ry4(0);
    public float a;
    public float b;
    public boolean c;
    public final Object d;
    public final q8 e;
    public boolean f;
    public final float g;
    public final float h;
    public long i;
    public final float j;
    public final ArrayList k;
    public final ArrayList l;
    public phe m;
    public float n;
    public boolean o;

    public ohe(Object obj, q8 q8Var) {
        this(obj, q8Var, 0);
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.o = false;
    }

    public static ng d() {
        ThreadLocal threadLocal = ng.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new ng(new xe8(2)));
        }
        return (ng) threadLocal.get();
    }

    public final void a(float f2) {
        if (this.f) {
            this.n = f2;
            return;
        }
        if (this.m == null) {
            this.m = new phe(f2);
        }
        this.m.i = (double) f2;
        g();
    }

    public final void b() {
        if (d().a()) {
            if (this.f) {
                c(true);
            }
            float f2 = this.n;
            if (f2 != Float.MAX_VALUE) {
                phe phe = this.m;
                if (phe == null) {
                    this.m = new phe(f2);
                } else {
                    phe.i = (double) f2;
                }
                this.n = Float.MAX_VALUE;
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled from the same thread as the animation handler");
    }

    public final void c(boolean z) {
        ArrayList arrayList;
        int i2 = 0;
        this.f = false;
        ng d2 = d();
        d2.a.remove(this);
        ArrayList arrayList2 = d2.b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, (Object) null);
            d2.f = true;
        }
        this.i = 0;
        this.c = false;
        while (true) {
            arrayList = this.k;
            if (i2 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i2) != null) {
                ((sf) arrayList.get(i2)).a(this.b, z);
            }
            i2++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void e(float f2) {
        this.e.O(this.d, f2);
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.l;
            if (i2 >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            } else if (arrayList.get(i2) == null) {
                i2++;
            } else {
                ((wrf) arrayList.get(i2)).getClass();
                throw null;
            }
        }
    }

    public final void f() {
        if (this.m.b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        } else if (!d().a()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        } else if (this.f) {
            this.o = true;
        }
    }

    public final void g() {
        phe phe = this.m;
        if (phe != null) {
            double d2 = (double) ((float) phe.i);
            if (d2 > ((double) this.g)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
            } else if (d2 >= ((double) this.h)) {
                double abs = Math.abs((double) (this.j * 0.75f));
                phe.d = abs;
                phe.e = abs * 62.5d;
                if (d().a()) {
                    boolean z = this.f;
                    if (!z && !z) {
                        this.f = true;
                        if (!this.c) {
                            this.b = this.e.q(this.d);
                        }
                        float f2 = this.b;
                        if (f2 > this.g || f2 < this.h) {
                            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                        }
                        ng d3 = d();
                        ArrayList arrayList = d3.b;
                        if (arrayList.size() == 0) {
                            xe8 xe8 = d3.e;
                            xe8.getClass();
                            ((Choreographer) xe8.b).postFrameCallback(new mg(0, d3.d));
                            if (Build.VERSION.SDK_INT >= 33) {
                                d3.g = ValueAnimator.getDurationScale();
                                if (d3.h == null) {
                                    d3.h = new fj(1, (Object) d3);
                                }
                                fj fjVar = d3.h;
                                if (((lg) fjVar.b) == null) {
                                    lg lgVar = new lg(fjVar);
                                    fjVar.b = lgVar;
                                    boolean unused = ValueAnimator.registerDurationScaleChangeListener(lgVar);
                                }
                            }
                        }
                        if (!arrayList.contains(this)) {
                            arrayList.add(this);
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
            } else {
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
        } else {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
    }

    public ohe(Object obj, q8 q8Var, float f2) {
        this(obj, q8Var, 0);
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.o = false;
        this.m = new phe(f2);
    }

    public ohe(Object obj, q8 q8Var, int i2) {
        this.a = c44.DEFAULT_ASPECT_RATIO;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = obj;
        this.e = q8Var;
        if (q8Var == t || q8Var == u || q8Var == v) {
            this.j = 0.1f;
        } else if (q8Var == w) {
            this.j = 0.00390625f;
        } else if (q8Var == r || q8Var == s) {
            this.j = 0.002f;
        } else {
            this.j = 1.0f;
        }
    }
}

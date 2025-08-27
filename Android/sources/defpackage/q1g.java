package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* renamed from: q1g  reason: default package */
public final class q1g extends r1g {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public final int k;
    public String l;

    public q1g() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = c44.DEFAULT_ASPECT_RATIO;
        this.d = c44.DEFAULT_ASPECT_RATIO;
        this.e = c44.DEFAULT_ASPECT_RATIO;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = c44.DEFAULT_ASPECT_RATIO;
        this.i = c44.DEFAULT_ASPECT_RATIO;
        this.j = new Matrix();
        this.l = null;
    }

    public final boolean a() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i2 >= arrayList.size()) {
                return false;
            }
            if (((r1g) arrayList.get(i2)).a()) {
                return true;
            }
            i2++;
        }
    }

    public final boolean b(int[] iArr) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i2 >= arrayList.size()) {
                return z;
            }
            z |= ((r1g) arrayList.get(i2)).b(iArr);
            i2++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.l;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f2) {
        if (f2 != this.d) {
            this.d = f2;
            c();
        }
    }

    public void setPivotY(float f2) {
        if (f2 != this.e) {
            this.e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.c) {
            this.c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f) {
            this.f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.g) {
            this.g = f2;
            c();
        }
    }

    public void setTranslateX(float f2) {
        if (f2 != this.h) {
            this.h = f2;
            c();
        }
    }

    public void setTranslateY(float f2) {
        if (f2 != this.i) {
            this.i = f2;
            c();
        }
    }

    /* JADX WARNING: type inference failed for: r4v6, types: [p1g, s1g] */
    public q1g(q1g q1g, ts tsVar) {
        s1g s1g;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = c44.DEFAULT_ASPECT_RATIO;
        this.d = c44.DEFAULT_ASPECT_RATIO;
        this.e = c44.DEFAULT_ASPECT_RATIO;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = c44.DEFAULT_ASPECT_RATIO;
        this.i = c44.DEFAULT_ASPECT_RATIO;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.l = null;
        this.c = q1g.c;
        this.d = q1g.d;
        this.e = q1g.e;
        this.f = q1g.f;
        this.g = q1g.g;
        this.h = q1g.h;
        this.i = q1g.i;
        String str = q1g.l;
        this.l = str;
        this.k = q1g.k;
        if (str != null) {
            tsVar.put(str, this);
        }
        matrix.set(q1g.j);
        ArrayList arrayList = q1g.b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof q1g) {
                this.b.add(new q1g((q1g) obj, tsVar));
            } else {
                if (obj instanceof p1g) {
                    p1g p1g = (p1g) obj;
                    ? s1g2 = new s1g(p1g);
                    s1g2.f = c44.DEFAULT_ASPECT_RATIO;
                    s1g2.h = 1.0f;
                    s1g2.i = 1.0f;
                    s1g2.j = c44.DEFAULT_ASPECT_RATIO;
                    s1g2.k = 1.0f;
                    s1g2.l = c44.DEFAULT_ASPECT_RATIO;
                    s1g2.m = Paint.Cap.BUTT;
                    s1g2.n = Paint.Join.MITER;
                    s1g2.o = 4.0f;
                    s1g2.e = p1g.e;
                    s1g2.f = p1g.f;
                    s1g2.h = p1g.h;
                    s1g2.g = p1g.g;
                    s1g2.c = p1g.c;
                    s1g2.i = p1g.i;
                    s1g2.j = p1g.j;
                    s1g2.k = p1g.k;
                    s1g2.l = p1g.l;
                    s1g2.m = p1g.m;
                    s1g2.n = p1g.n;
                    s1g2.o = p1g.o;
                    s1g = s1g2;
                } else if (obj instanceof o1g) {
                    s1g = new s1g((o1g) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.b.add(s1g);
                String str2 = s1g.b;
                if (str2 != null) {
                    tsVar.put(str2, s1g);
                }
            }
        }
    }
}

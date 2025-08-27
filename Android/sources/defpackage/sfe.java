package defpackage;

import java.util.Arrays;

/* renamed from: sfe  reason: default package */
public final class sfe implements Comparable {
    public int X = 0;
    public int Y = 0;
    public int Z;
    public boolean a;
    public int b = -1;
    public int c = -1;
    public int o = 0;
    public float v;
    public boolean w = false;
    public final float[] x = new float[9];
    public final float[] y = new float[9];
    public vs[] z = new vs[16];

    public sfe(int i) {
        this.Z = i;
    }

    public final void a(vs vsVar) {
        int i = 0;
        while (true) {
            int i2 = this.X;
            if (i >= i2) {
                vs[] vsVarArr = this.z;
                if (i2 >= vsVarArr.length) {
                    this.z = (vs[]) Arrays.copyOf(vsVarArr, vsVarArr.length * 2);
                }
                vs[] vsVarArr2 = this.z;
                int i3 = this.X;
                vsVarArr2[i3] = vsVar;
                this.X = i3 + 1;
                return;
            } else if (this.z[i] != vsVar) {
                i++;
            } else {
                return;
            }
        }
    }

    public final void b(vs vsVar) {
        int i = this.X;
        int i2 = 0;
        while (i2 < i) {
            if (this.z[i2] == vsVar) {
                while (i2 < i - 1) {
                    vs[] vsVarArr = this.z;
                    int i3 = i2 + 1;
                    vsVarArr[i2] = vsVarArr[i3];
                    i2 = i3;
                }
                this.X--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.Z = 5;
        this.o = 0;
        this.b = -1;
        this.c = -1;
        this.v = c44.DEFAULT_ASPECT_RATIO;
        this.w = false;
        int i = this.X;
        for (int i2 = 0; i2 < i; i2++) {
            this.z[i2] = null;
        }
        this.X = 0;
        this.Y = 0;
        this.a = false;
        Arrays.fill(this.y, c44.DEFAULT_ASPECT_RATIO);
    }

    public final int compareTo(Object obj) {
        return this.b - ((sfe) obj).b;
    }

    public final void d(gw7 gw7, float f) {
        this.v = f;
        this.w = true;
        int i = this.X;
        this.c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.z[i2].h(gw7, this, false);
        }
        this.X = 0;
    }

    public final void e(gw7 gw7, vs vsVar) {
        int i = this.X;
        for (int i2 = 0; i2 < i; i2++) {
            this.z[i2].i(gw7, vsVar, false);
        }
        this.X = 0;
    }

    public final String toString() {
        return "" + this.b;
    }
}

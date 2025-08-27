package defpackage;

import java.util.Arrays;

/* renamed from: jj3  reason: default package */
public final class jj3 {
    public int[] a;
    public int[] b;
    public int c;
    public int[] d;
    public float[] e;
    public int f;
    public int[] g;
    public String[] h;
    public int i;
    public int[] j;
    public boolean[] k;
    public int l;

    public final void a(float f2, int i2) {
        int i3 = this.f;
        int[] iArr = this.d;
        if (i3 >= iArr.length) {
            this.d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.e;
            this.e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.d;
        int i4 = this.f;
        iArr2[i4] = i2;
        float[] fArr2 = this.e;
        this.f = i4 + 1;
        fArr2[i4] = f2;
    }

    public final void b(int i2, int i3) {
        int i4 = this.c;
        int[] iArr = this.a;
        if (i4 >= iArr.length) {
            this.a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.b;
            this.b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.a;
        int i5 = this.c;
        iArr3[i5] = i2;
        int[] iArr4 = this.b;
        this.c = i5 + 1;
        iArr4[i5] = i3;
    }

    public final void c(int i2, String str) {
        int i3 = this.i;
        int[] iArr = this.g;
        if (i3 >= iArr.length) {
            this.g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.g;
        int i4 = this.i;
        iArr2[i4] = i2;
        String[] strArr2 = this.h;
        this.i = i4 + 1;
        strArr2[i4] = str;
    }

    public final void d(int i2, boolean z) {
        int i3 = this.l;
        int[] iArr = this.j;
        if (i3 >= iArr.length) {
            this.j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.k;
            this.k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.j;
        int i4 = this.l;
        iArr2[i4] = i2;
        boolean[] zArr2 = this.k;
        this.l = i4 + 1;
        zArr2[i4] = z;
    }
}

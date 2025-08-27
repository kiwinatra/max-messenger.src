package defpackage;

/* renamed from: pj7  reason: default package */
public final class pj7 {
    public final long[] a;
    public final boolean[] b;
    public final int[] c;
    public boolean d;

    public pj7(int i) {
        this.a = new long[i];
        this.b = new boolean[i];
        this.c = new int[i];
    }

    public final int[] a() {
        synchronized (this) {
            try {
                if (!this.d) {
                    return null;
                }
                long[] jArr = this.a;
                int length = jArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    int i4 = 1;
                    boolean z = jArr[i] > 0;
                    boolean[] zArr = this.b;
                    if (z != zArr[i2]) {
                        int[] iArr = this.c;
                        if (!z) {
                            i4 = 2;
                        }
                        iArr[i2] = i4;
                    } else {
                        this.c[i2] = 0;
                    }
                    zArr[i2] = z;
                    i++;
                    i2 = i3;
                }
                this.d = false;
                int[] iArr2 = (int[]) this.c.clone();
                return iArr2;
            } finally {
            }
        }
    }
}

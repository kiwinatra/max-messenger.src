package defpackage;

import java.util.Arrays;

/* renamed from: hq5  reason: default package */
public final class hq5 {
    public final /* synthetic */ int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public final boolean[] h;
    public int i;

    public hq5(int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                this.h = new boolean[15];
                return;
            default:
                this.h = new boolean[15];
                return;
        }
    }

    public final boolean a() {
        switch (this.a) {
            case 0:
                return this.e > 15 && this.i == 0;
            default:
                return this.e > 15 && this.i == 0;
        }
    }

    public final void b(long j) {
        switch (this.a) {
            case 0:
                long j2 = this.e;
                if (j2 == 0) {
                    this.b = j;
                } else if (j2 == 1) {
                    long j3 = j - this.b;
                    this.c = j3;
                    this.g = j3;
                    this.f = 1;
                } else {
                    long j4 = j - this.d;
                    int i2 = (int) (j2 % 15);
                    int i3 = (Math.abs(j4 - this.c) > 1000000 ? 1 : (Math.abs(j4 - this.c) == 1000000 ? 0 : -1));
                    boolean[] zArr = this.h;
                    if (i3 <= 0) {
                        this.f++;
                        this.g += j4;
                        if (zArr[i2]) {
                            zArr[i2] = false;
                            this.i--;
                        }
                    } else if (!zArr[i2]) {
                        zArr[i2] = true;
                        this.i++;
                    }
                }
                this.e++;
                this.d = j;
                return;
            default:
                long j5 = this.e;
                if (j5 == 0) {
                    this.b = j;
                } else if (j5 == 1) {
                    long j6 = j - this.b;
                    this.c = j6;
                    this.g = j6;
                    this.f = 1;
                } else {
                    long j7 = j - this.d;
                    int i4 = (int) (j5 % 15);
                    int i5 = (Math.abs(j7 - this.c) > 1000000 ? 1 : (Math.abs(j7 - this.c) == 1000000 ? 0 : -1));
                    boolean[] zArr2 = this.h;
                    if (i5 <= 0) {
                        this.f++;
                        this.g += j7;
                        if (zArr2[i4]) {
                            zArr2[i4] = false;
                            this.i--;
                        }
                    } else if (!zArr2[i4]) {
                        zArr2[i4] = true;
                        this.i++;
                    }
                }
                this.e++;
                this.d = j;
                return;
        }
    }

    public final void c() {
        switch (this.a) {
            case 0:
                this.e = 0;
                this.f = 0;
                this.g = 0;
                this.i = 0;
                Arrays.fill(this.h, false);
                return;
            default:
                this.e = 0;
                this.f = 0;
                this.g = 0;
                this.i = 0;
                Arrays.fill(this.h, false);
                return;
        }
    }
}

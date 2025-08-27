package defpackage;

/* renamed from: qg4  reason: default package */
public final class qg4 {
    public final /* synthetic */ int a;
    public final long b;
    public final long c;
    public final float d;
    public long e = -9223372036854775807L;
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long i = -9223372036854775807L;
    public long j = -9223372036854775807L;
    public float k = 1.03f;
    public float l = 0.97f;
    public float m = 1.0f;
    public long n = -9223372036854775807L;
    public long o = -9223372036854775807L;
    public long p = -9223372036854775807L;

    public /* synthetic */ qg4(int i2, long j2, float f2, long j3) {
        this.a = i2;
        this.b = j2;
        this.c = j3;
        this.d = f2;
    }

    public final void a() {
        long j2;
        switch (this.a) {
            case 0:
                long j3 = this.e;
                if (j3 != -9223372036854775807L) {
                    long j4 = this.f;
                    if (j4 != -9223372036854775807L) {
                        j3 = j4;
                    }
                    long j5 = this.h;
                    if (j5 != -9223372036854775807L && j3 < j5) {
                        j3 = j5;
                    }
                    long j6 = this.i;
                    if (j6 != -9223372036854775807L && j3 > j6) {
                        j3 = j6;
                    }
                } else {
                    j3 = -9223372036854775807L;
                }
                if (this.g != j3) {
                    this.g = j3;
                    this.j = j3;
                    this.o = -9223372036854775807L;
                    this.p = -9223372036854775807L;
                    this.n = -9223372036854775807L;
                    return;
                }
                return;
            default:
                long j7 = this.e;
                if (j7 != -9223372036854775807L) {
                    j2 = this.f;
                    if (j2 == -9223372036854775807L) {
                        long j8 = this.h;
                        if (j8 != -9223372036854775807L && j7 < j8) {
                            j7 = j8;
                        }
                        j2 = this.i;
                        if (j2 == -9223372036854775807L || j7 <= j2) {
                            j2 = j7;
                        }
                    }
                } else {
                    j2 = -9223372036854775807L;
                }
                if (this.g != j2) {
                    this.g = j2;
                    this.j = j2;
                    this.o = -9223372036854775807L;
                    this.p = -9223372036854775807L;
                    this.n = -9223372036854775807L;
                    return;
                }
                return;
        }
    }
}

package defpackage;

import android.os.Parcelable;
import java.util.Arrays;
import java.util.Collections;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: uq5  reason: default package */
public final class uq5 {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final long k;
    public final Object l;
    public final Parcelable m;

    public uq5(byte[] bArr, int i2, int i3) {
        this.a = i3;
        switch (i3) {
            case 1:
                ky1 ky1 = new ky1(bArr, (byte) 0, bArr.length, 2);
                ky1.q(i2 * 8);
                this.b = ky1.i(16);
                this.c = ky1.i(16);
                this.d = ky1.i(24);
                this.e = ky1.i(24);
                int i4 = ky1.i(20);
                this.f = i4;
                this.g = g(i4);
                this.h = ky1.i(3) + 1;
                int i5 = ky1.i(5) + 1;
                this.i = i5;
                this.j = b(i5);
                this.k = ky1.k(36);
                this.l = null;
                this.m = null;
                return;
            default:
                ky1 ky12 = new ky1(bArr, (byte) 0, bArr.length, 1);
                ky12.q(i2 * 8);
                this.b = ky12.i(16);
                this.c = ky12.i(16);
                this.d = ky12.i(24);
                this.e = ky12.i(24);
                int i6 = ky12.i(20);
                this.f = i6;
                this.g = f(i6);
                this.h = ky12.i(3) + 1;
                int i7 = ky12.i(5) + 1;
                this.i = i7;
                this.j = a(i7);
                int i8 = ky12.i(4);
                int i9 = ky12.i(32);
                int i10 = t0g.a;
                this.k = ((((long) i8) & 4294967295L) << 32) | (((long) i9) & 4294967295L);
                this.l = null;
                this.m = null;
                return;
        }
    }

    public static int a(int i2) {
        if (i2 == 8) {
            return 1;
        }
        if (i2 == 12) {
            return 2;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 != 20) {
            return i2 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int b(int i2) {
        if (i2 == 8) {
            return 1;
        }
        if (i2 == 12) {
            return 2;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 != 20) {
            return i2 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int f(int i2) {
        switch (i2) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public static int g(int i2) {
        switch (i2) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long c() {
        switch (this.a) {
            case 0:
                long j2 = this.k;
                if (j2 == 0) {
                    return -9223372036854775807L;
                }
                return (j2 * 1000000) / ((long) this.f);
            default:
                long j3 = this.k;
                if (j3 == 0) {
                    return -9223372036854775807L;
                }
                return (j3 * 1000000) / ((long) this.f);
        }
    }

    public ca6 d(byte[] bArr, rp9 rp9) {
        bArr[4] = ByteCompanionObject.MIN_VALUE;
        int i2 = this.e;
        if (i2 <= 0) {
            i2 = -1;
        }
        rp9 rp92 = (rp9) this.m;
        if (rp92 != null) {
            if (rp9 != null) {
                pp9[] pp9Arr = rp9.a;
                if (pp9Arr.length != 0) {
                    int i3 = t0g.a;
                    pp9[] pp9Arr2 = rp92.a;
                    Object[] copyOf = Arrays.copyOf(pp9Arr2, pp9Arr2.length + pp9Arr.length);
                    System.arraycopy(pp9Arr, 0, copyOf, pp9Arr2.length, pp9Arr.length);
                    rp92 = new rp9((pp9[]) copyOf);
                }
            }
            rp9 = rp92;
        }
        aa6 aa6 = new aa6();
        aa6.k = "audio/flac";
        aa6.l = i2;
        aa6.x = this.h;
        aa6.y = this.f;
        aa6.m = Collections.singletonList(bArr);
        aa6.i = rp9;
        return new ca6(aa6);
    }

    public ea6 e(byte[] bArr, sp9 sp9) {
        bArr[4] = ByteCompanionObject.MIN_VALUE;
        int i2 = this.e;
        if (i2 <= 0) {
            i2 = -1;
        }
        sp9 sp92 = (sp9) this.m;
        if (sp92 != null) {
            sp9 = sp92.b(sp9);
        }
        ba6 ba6 = new ba6();
        ba6.m = vq9.l("audio/flac");
        ba6.n = i2;
        ba6.A = this.h;
        ba6.B = this.f;
        ba6.C = v0g.C(this.i);
        ba6.p = Collections.singletonList(bArr);
        ba6.j = sp9;
        return new ea6(ba6);
    }

    public uq5(int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, dm4 dm4, rp9 rp9) {
        this.a = 0;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = f(i6);
        this.h = i7;
        this.i = i8;
        this.j = a(i8);
        this.k = j2;
        this.l = dm4;
        this.m = rp9;
    }

    public uq5(int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, fj fjVar, sp9 sp9) {
        this.a = 1;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = g(i6);
        this.h = i7;
        this.i = i8;
        this.j = b(i8);
        this.k = j2;
        this.l = fjVar;
        this.m = sp9;
    }
}

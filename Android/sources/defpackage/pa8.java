package defpackage;

import java.util.Arrays;

/* renamed from: pa8  reason: default package */
public final class pa8 {
    public final /* synthetic */ int a;
    public int b;
    public long[] c;

    public pa8(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = new long[32];
                return;
            default:
                this.c = new long[32];
                return;
        }
    }

    public final void a(long j) {
        switch (this.a) {
            case 0:
                int i = this.b;
                long[] jArr = this.c;
                if (i == jArr.length) {
                    this.c = Arrays.copyOf(jArr, i * 2);
                }
                long[] jArr2 = this.c;
                int i2 = this.b;
                this.b = i2 + 1;
                jArr2[i2] = j;
                return;
            default:
                int i3 = this.b;
                long[] jArr3 = this.c;
                if (i3 == jArr3.length) {
                    this.c = Arrays.copyOf(jArr3, i3 * 2);
                }
                long[] jArr4 = this.c;
                int i4 = this.b;
                this.b = i4 + 1;
                jArr4[i4] = j;
                return;
        }
    }

    public final long b(int i) {
        switch (this.a) {
            case 0:
                if (i >= 0 && i < this.b) {
                    return this.c[i];
                }
                int i2 = this.b;
                StringBuilder sb = new StringBuilder(46);
                sb.append("Invalid index ");
                sb.append(i);
                sb.append(", size is ");
                sb.append(i2);
                throw new IndexOutOfBoundsException(sb.toString());
            default:
                if (i >= 0 && i < this.b) {
                    return this.c[i];
                }
                StringBuilder o = wj6.o(i, "Invalid index ", ", size is ");
                o.append(this.b);
                throw new IndexOutOfBoundsException(o.toString());
        }
    }
}

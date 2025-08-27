package defpackage;

import java.util.Arrays;

/* renamed from: gz9  reason: default package */
public final class gz9 extends qa8 {
    public gz9() {
        this.a = new long[16];
    }

    public final void a(long j) {
        int i = this.b + 1;
        long[] jArr = this.a;
        if (jArr.length < i) {
            this.a = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
        }
        long[] jArr2 = this.a;
        int i2 = this.b;
        jArr2[i2] = j;
        this.b = i2 + 1;
    }

    public final boolean b(long j) {
        int i;
        long[] jArr = this.a;
        int i2 = this.b;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                i3 = -1;
                break;
            } else if (j == jArr[i3]) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 < 0) {
            return false;
        }
        if (i3 < 0 || i3 >= (i = this.b)) {
            StringBuilder o = wj6.o(i3, "Index ", " must be in 0..");
            o.append(this.b - 1);
            throw new IndexOutOfBoundsException(o.toString());
        }
        long[] jArr2 = this.a;
        long j2 = jArr2[i3];
        if (i3 != i - 1) {
            ArraysKt___ArraysJvmKt.copyInto(jArr2, jArr2, i3, i3 + 1, i);
        }
        this.b--;
        return true;
    }
}

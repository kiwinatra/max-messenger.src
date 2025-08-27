package defpackage;

/* renamed from: zh7  reason: default package */
public abstract class zh7 {
    public static final rz9 a = new rz9();

    static {
        int i = ded.a;
    }

    public static final void a() {
        rz9 rz9 = a;
        Object[] objArr = rz9.b;
        long[] jArr = rz9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ((hne) objArr[(i << 3) + i3]).e();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}

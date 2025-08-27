package defpackage;

/* renamed from: v25  reason: default package */
public final class v25 {
    public final y35 a;

    public v25(y35 y35) {
        this.a = y35;
    }

    public final z35 a(CharSequence charSequence, int i, int i2) {
        int i3;
        y35 y35 = this.a;
        if (y35 != null) {
            int i4 = i;
            int i5 = 0;
            int i6 = 0;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = 0;
            while (i5 >= 0) {
                long[] jArr = (long[]) y35.b;
                if (i5 >= jArr.length || i4 >= i2) {
                    break;
                }
                char charAt = charSequence.charAt(i4);
                int i11 = i5 + 1;
                y35 y352 = y35;
                int i12 = (((int) jArr[i5]) + i11) - 1;
                while (true) {
                    if (i11 > i12) {
                        i3 = -(i11 + 1);
                        break;
                    }
                    i3 = ((i12 - i11) >>> 1) + i11;
                    char c = (char) ((int) (jArr[i3] & 65535));
                    if (c >= charAt) {
                        if (c <= charAt) {
                            break;
                        }
                        i12 = i3 - 1;
                    } else {
                        i11 = i3 + 1;
                    }
                }
                if (i3 <= 0) {
                    break;
                }
                i6++;
                long j = jArr[i3];
                int i13 = (int) ((j >>> 48) & 65535);
                if (i13 == 65535) {
                    i13 = -1;
                }
                int i14 = (int) ((j >>> 40) & 255);
                if (i14 == 255) {
                    i14 = -1;
                }
                int i15 = (int) ((j >>> 32) & 255);
                if (i15 == 255) {
                    i15 = -1;
                }
                int i16 = (int) ((j >>> 24) & 255);
                if (i16 == 255) {
                    i16 = -1;
                }
                if (!(i14 == -1 || i15 == -1 || i16 == -1)) {
                    i10 += i6;
                    i9 = i16;
                    i7 = i14;
                    i8 = i15;
                    i6 = 0;
                }
                i4++;
                y35 = y352;
                i5 = i13;
            }
            if (!(i7 == -1 || i8 == -1 || i9 == -1)) {
                return new z35(i7, i8, i9, i10, 0);
            }
        }
        return null;
    }
}

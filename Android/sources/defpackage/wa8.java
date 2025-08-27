package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: wa8  reason: default package */
public abstract class wa8 {
    public static final jz9 a(jz9 jz9) {
        jz9 jz92 = new jz9(jz9.d);
        long[] jArr = jz9.b;
        long[] jArr2 = jz9.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            jz92.e(jArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return jz92;
    }

    public static final long[] b(jz9 jz9) {
        long[] jArr = new long[jz9.d];
        long[] jArr2 = jz9.b;
        long[] jArr3 = jz9.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr3[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            jArr[i2] = jArr2[(i << 3) + i4];
                            i2++;
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return jArr;
    }

    public static final ArrayList c(va8 va8) {
        ArrayList arrayList = new ArrayList(va8.d);
        long[] jArr = va8.b;
        long[] jArr2 = va8.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            arrayList.add(Long.valueOf(jArr[(i << 3) + i3]));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }

    public static final jz9 d(Collection collection) {
        jz9 jz9 = new jz9(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            jz9.e(((Number) it.next()).longValue());
        }
        return jz9;
    }
}

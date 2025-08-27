package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: go7  reason: default package */
public abstract class go7 {
    public static final a00 a;

    /* JADX WARNING: type inference failed for: r1v2, types: [a00, java.util.Collection, java.util.ArrayList] */
    static {
        ? arrayList = new ArrayList(4);
        Collections.addAll(arrayList, new Integer[]{2, 7, 4, 5});
        a = arrayList;
    }

    public static final int a(f8d f8d, j55 j55) {
        j55.m0();
        Integer valueOf = Integer.valueOf(j55.v);
        a00 a00 = a;
        int indexOf = a00.indexOf(valueOf);
        if (indexOf >= 0) {
            return ((Number) a00.get(indexOf % a00.size())).intValue();
        }
        throw new IllegalArgumentException("Only accepts inverted exif orientations".toString());
    }

    public static final int b(f8d f8d, j55 j55) {
        f8d.getClass();
        j55.m0();
        int i = j55.o;
        if (i != 90 && i != 180 && i != 270) {
            return 0;
        }
        j55.m0();
        return j55.o;
    }

    public static final int c(f8d f8d, v3d v3d, j55 j55, boolean z) {
        int i;
        int i2;
        if (!z || v3d == null) {
            return 8;
        }
        int b = b(f8d, j55);
        j55.m0();
        boolean z2 = false;
        int a2 = a.contains(Integer.valueOf(j55.v)) ? a(f8d, j55) : 0;
        if (b == 90 || b == 270 || a2 == 5 || a2 == 7) {
            z2 = true;
        }
        if (z2) {
            j55.m0();
            i = j55.x;
        } else {
            j55.m0();
            i = j55.w;
        }
        if (z2) {
            j55.m0();
            i2 = j55.w;
        } else {
            j55.m0();
            i2 = j55.x;
        }
        float f = (float) i;
        float f2 = (float) i2;
        float max = Math.max(((float) v3d.a) / f, ((float) v3d.b) / f2);
        float f3 = v3d.c;
        if (f * max > f3) {
            max = f3 / f;
        }
        if (f2 * max > f3) {
            max = f3 / f2;
        }
        int i3 = (int) ((max * ((float) 8)) + v3d.d);
        if (i3 > 8) {
            return 8;
        }
        if (i3 < 1) {
            return 1;
        }
        return i3;
    }
}

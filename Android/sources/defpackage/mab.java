package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: mab  reason: default package */
public final class mab extends h3 {
    public static final Parcelable.Creator<mab> CREATOR = new o0h(13);
    public final int a;
    public final Float b;

    public mab(int i, Float f) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < c44.DEFAULT_ASPECT_RATIO)) {
            z = false;
        }
        vzg.f("Invalid PatternItem: type=" + i + " length=" + f, z);
        this.a = i;
        this.b = f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.mab) r5;
        r1 = r5.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.mab
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            mab r5 = (defpackage.mab) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 != r1) goto L_0x001d
            java.lang.Float r4 = r4.b
            java.lang.Float r5 = r5.b
            boolean r4 = defpackage.kne.o(r4, r5)
            if (r4 == 0) goto L_0x001d
            return r0
        L_0x001d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mab.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    public final String toString() {
        return "[PatternItem: type=" + this.a + " length=" + this.b + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.G0(parcel, 2, 4);
        parcel.writeInt(this.a);
        tf6.s0(parcel, 3, this.b);
        tf6.E0(parcel, B0);
    }
}

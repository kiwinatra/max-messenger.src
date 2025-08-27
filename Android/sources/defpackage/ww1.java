package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: ww1  reason: default package */
public class ww1 extends h3 {
    public static final Parcelable.Creator<ww1> CREATOR = new ivg(22);
    public final int a;
    public final y35 b;
    public final Float c;

    public ww1(int i, y35 y35, Float f) {
        boolean z = true;
        boolean z2 = f != null && f.floatValue() > c44.DEFAULT_ASPECT_RATIO;
        if (i == 3) {
            z = (y35 == null || !z2) ? false : z;
            i = 3;
        }
        vzg.f("Invalid Cap: type=" + i + " bitmapDescriptor=" + y35 + " bitmapRefWidth=" + f, z);
        this.a = i;
        this.b = y35;
        this.c = f;
    }

    public final ww1 b() {
        int i = this.a;
        if (i == 0) {
            return new tv0();
        }
        boolean z = true;
        if (i == 1) {
            return new tv0(1, (y35) null, (Float) null, 2);
        }
        if (i == 2) {
            return new tv0(2, (y35) null, (Float) null, 1);
        }
        if (i != 3) {
            return this;
        }
        y35 y35 = this.b;
        vzg.o("bitmapDescriptor must not be null", y35 != null);
        Float f = this.c;
        if (f == null) {
            z = false;
        }
        vzg.o("bitmapRefWidth must not be null", z);
        return new z44(y35, f.floatValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.ww1) r5;
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
            boolean r1 = r5 instanceof defpackage.ww1
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            ww1 r5 = (defpackage.ww1) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 != r1) goto L_0x0027
            y35 r1 = r4.b
            y35 r3 = r5.b
            boolean r1 = defpackage.kne.o(r1, r3)
            if (r1 == 0) goto L_0x0027
            java.lang.Float r4 = r4.c
            java.lang.Float r5 = r5.c
            boolean r4 = defpackage.kne.o(r4, r5)
            if (r4 == 0) goto L_0x0027
            return r0
        L_0x0027:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ww1.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c});
    }

    public String toString() {
        return wj6.l(new StringBuilder("[Cap: type="), this.a, "]");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.G0(parcel, 2, 4);
        parcel.writeInt(this.a);
        y35 y35 = this.b;
        tf6.t0(parcel, 3, y35 == null ? null : ((p67) y35.b).asBinder());
        tf6.s0(parcel, 4, this.c);
        tf6.E0(parcel, B0);
    }
}

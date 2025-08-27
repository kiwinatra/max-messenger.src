package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: wj8  reason: default package */
public final class wj8 implements Parcelable {
    public static final Parcelable.Creator<wj8> CREATOR = new f27(21);
    public final boolean a;
    public final uk2 b;

    public wj8(boolean z, uk2 uk2) {
        this.a = z;
        this.b = uk2;
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.wj8) r5;
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
            boolean r1 = r5 instanceof defpackage.wj8
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            wj8 r5 = (defpackage.wj8) r5
            boolean r1 = r5.a
            boolean r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            uk2 r4 = r4.b
            uk2 r5 = r5.b
            if (r4 == r5) goto L_0x001a
            return r2
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wj8.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MediaBarMode(constructorEnabled=" + this.a + ", chatMode=" + this.b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        this.b.writeToParcel(parcel, i);
    }
}

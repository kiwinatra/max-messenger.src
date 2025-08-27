package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: d0e  reason: default package */
public final class d0e implements Parcelable {
    public static final Parcelable.Creator<d0e> CREATOR = new g9d(7);
    public final int a;
    public final ngf b;
    public final c0e c;

    public d0e(int i, ngf ngf, c0e c0e) {
        this.a = i;
        this.b = ngf;
        this.c = c0e;
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.d0e) r5;
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
            boolean r1 = r5 instanceof defpackage.d0e
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            d0e r5 = (defpackage.d0e) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            ngf r1 = r4.b
            ngf r3 = r5.b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            c0e r4 = r4.c
            c0e r5 = r5.c
            if (r4 == r5) goto L_0x0025
            return r2
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d0e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.c.hashCode() + i2a.g(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "Button(id=" + this.a + ", caption=" + this.b + ", type=" + this.c + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c.name());
    }
}

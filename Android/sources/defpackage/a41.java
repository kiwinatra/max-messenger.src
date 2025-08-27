package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a41  reason: default package */
public final class a41 extends d41 {
    public static final Parcelable.Creator<a41> CREATOR = new s6(20);
    public final int a;
    public final boolean b;
    public final boolean c;

    public a41(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.a41) r5;
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
            boolean r1 = r5 instanceof defpackage.a41
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            a41 r5 = (defpackage.a41) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            boolean r1 = r4.b
            boolean r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            boolean r4 = r4.c
            boolean r5 = r5.c
            if (r4 == r5) goto L_0x0021
            return r2
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a41.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + g63.e(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestPermission(requestCode=");
        sb.append(this.a);
        sb.append(", audio=");
        sb.append(this.b);
        sb.append(", video=");
        return tr1.m(sb, this.c, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
    }
}

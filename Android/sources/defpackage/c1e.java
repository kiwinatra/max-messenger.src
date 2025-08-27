package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c1e  reason: default package */
public final class c1e extends f1e {
    public static final Parcelable.Creator<c1e> CREATOR = new g9d(10);
    public final boolean a;
    public final boolean b;

    public c1e(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.c1e) r5;
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
            boolean r1 = r5 instanceof defpackage.c1e
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            c1e r5 = (defpackage.c1e) r5
            boolean r1 = r5.a
            boolean r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            boolean r4 = r4.b
            boolean r5 = r5.b
            if (r4 == r5) goto L_0x001a
            return r2
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c1e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Radio(isChecked=" + this.a + ", isEnabled=" + this.b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
    }
}

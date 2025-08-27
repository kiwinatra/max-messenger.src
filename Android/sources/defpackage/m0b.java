package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: m0b  reason: default package */
public final class m0b implements Parcelable {
    public static final Parcelable.Creator<m0b> CREATOR = new ia9(20);
    public final int a;

    public /* synthetic */ m0b(int i) {
        this.a = i;
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = ((defpackage.m0b) r3).a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof defpackage.m0b
            r1 = 0
            if (r0 != 0) goto L_0x0006
            goto L_0x0010
        L_0x0006:
            m0b r3 = (defpackage.m0b) r3
            int r3 = r3.a
            int r2 = r2.a
            if (r2 == r3) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r1 = 1
        L_0x0010:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m0b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wj6.l(new StringBuilder("ContainerGravity(value="), this.a, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}

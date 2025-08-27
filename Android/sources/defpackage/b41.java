package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: b41  reason: default package */
public final class b41 extends d41 {
    public static final Parcelable.Creator<b41> CREATOR = new s6(21);
    public final int a;
    public final String[] b;
    public final int[] c;

    public b41(int i, String[] strArr, int[] iArr) {
        this.a = i;
        this.b = strArr;
        this.c = iArr;
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.b41) r5;
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
            boolean r1 = r5 instanceof defpackage.b41
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            b41 r5 = (defpackage.b41) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.lang.String[] r1 = r4.b
            java.lang.String[] r3 = r5.b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            int[] r4 = r4.c
            int[] r5 = r5.c
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x0029
            return r2
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b41.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + (((Integer.hashCode(this.a) * 31) + Arrays.hashCode(this.b)) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.b);
        String arrays2 = Arrays.toString(this.c);
        StringBuilder sb = new StringBuilder("VerifyPermission(requestCode=");
        sb.append(this.a);
        sb.append(", permissions=");
        sb.append(arrays);
        sb.append(", grantResults=");
        return wj6.n(sb, arrays2, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeStringArray(this.b);
        parcel.writeIntArray(this.c);
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: hn0  reason: default package */
public final class hn0 extends u77 {
    public static final Parcelable.Creator<hn0> CREATOR = new s6(14);
    public final byte[] b;

    public hn0(byte[] bArr, String str) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hn0.class != obj.getClass()) {
            return false;
        }
        hn0 hn0 = (hn0) obj;
        return this.a.equals(hn0.a) && Arrays.equals(this.b, hn0.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + g63.d(527, 31, this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public hn0(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = defpackage.v0g.a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            r2.b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hn0.<init>(android.os.Parcel):void");
    }
}

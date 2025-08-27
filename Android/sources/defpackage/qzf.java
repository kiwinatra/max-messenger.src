package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: qzf  reason: default package */
public final class qzf extends u77 {
    public static final Parcelable.Creator<qzf> CREATOR = new nje(17);
    public final String b;
    public final String c;

    public qzf(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qzf.class != obj.getClass()) {
            return false;
        }
        qzf qzf = (qzf) obj;
        return this.a.equals(qzf.a) && v0g.a(this.b, qzf.b) && v0g.a(this.c, qzf.c);
    }

    public final int hashCode() {
        int d = g63.d(527, 31, this.a);
        int i = 0;
        String str = this.b;
        int hashCode = (d + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return this.a + ": url=" + this.c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qzf(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = defpackage.v0g.a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.b = r0
            java.lang.String r3 = r3.readString()
            r2.c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qzf.<init>(android.os.Parcel):void");
    }
}

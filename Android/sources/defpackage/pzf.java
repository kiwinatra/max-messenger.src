package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: pzf  reason: default package */
public final class pzf extends t77 {
    public static final Parcelable.Creator<pzf> CREATOR = new nje(16);
    public final String b;
    public final String c;

    public pzf(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pzf.class != obj.getClass()) {
            return false;
        }
        pzf pzf = (pzf) obj;
        return this.a.equals(pzf.a) && t0g.a(this.b, pzf.b) && t0g.a(this.c, pzf.c);
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
        String str = this.a;
        int f = g63.f(6, str);
        String str2 = this.c;
        StringBuilder sb = new StringBuilder(g63.f(f, str2));
        sb.append(str);
        sb.append(": url=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public pzf(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = defpackage.t0g.a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.b = r0
            java.lang.String r3 = r3.readString()
            r2.c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pzf.<init>(android.os.Parcel):void");
    }
}

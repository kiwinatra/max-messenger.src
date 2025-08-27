package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: j77  reason: default package */
public final class j77 implements pp9 {
    public static final Parcelable.Creator<j77> CREATOR = new f27(2);
    public final int a;
    public final String b;
    public final String c;
    public final String o;
    public final boolean v;
    public final int w;

    public j77(String str, int i, int i2, String str2, boolean z, String str3) {
        y64.g(i2 == -1 || i2 > 0);
        this.a = i;
        this.b = str;
        this.c = str2;
        this.o = str3;
        this.v = z;
        this.w = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.j77 a(java.util.Map r12) {
        /*
            java.lang.String r0 = "Invalid metadata interval: "
            java.lang.String r1 = "icy-br"
            java.lang.Object r1 = r12.get(r1)
            java.util.List r1 = (java.util.List) r1
            r2 = 1
            r3 = 0
            r4 = -1
            if (r1 == 0) goto L_0x0044
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            int r5 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0032 }
            int r5 = r5 * 1000
            if (r5 <= 0) goto L_0x001f
            r1 = r2
            goto L_0x0030
        L_0x001f:
            java.lang.String r6 = "Invalid bitrate: "
            java.lang.String r7 = java.lang.String.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0033 }
            int r8 = r7.length()     // Catch:{ NumberFormatException -> 0x0033 }
            if (r8 == 0) goto L_0x002e
            r6.concat(r7)     // Catch:{ NumberFormatException -> 0x0033 }
        L_0x002e:
            r1 = r3
            r5 = r4
        L_0x0030:
            r7 = r5
            goto L_0x0046
        L_0x0032:
            r5 = r4
        L_0x0033:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r6 = r1.length()
            if (r6 == 0) goto L_0x0042
            java.lang.String r6 = "Invalid bitrate header: "
            r6.concat(r1)
        L_0x0042:
            r1 = r3
            goto L_0x0030
        L_0x0044:
            r1 = r3
            r7 = r4
        L_0x0046:
            java.lang.String r5 = "icy-genre"
            java.lang.Object r5 = r12.get(r5)
            java.util.List r5 = (java.util.List) r5
            r6 = 0
            if (r5 == 0) goto L_0x005a
            java.lang.Object r1 = r5.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            r8 = r1
            r1 = r2
            goto L_0x005b
        L_0x005a:
            r8 = r6
        L_0x005b:
            java.lang.String r5 = "icy-name"
            java.lang.Object r5 = r12.get(r5)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x006e
            java.lang.Object r1 = r5.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            r9 = r1
            r1 = r2
            goto L_0x006f
        L_0x006e:
            r9 = r6
        L_0x006f:
            java.lang.String r5 = "icy-url"
            java.lang.Object r5 = r12.get(r5)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x0082
            java.lang.Object r1 = r5.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            r11 = r1
            r1 = r2
            goto L_0x0083
        L_0x0082:
            r11 = r6
        L_0x0083:
            java.lang.String r5 = "icy-pub"
            java.lang.Object r5 = r12.get(r5)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x009c
            java.lang.Object r1 = r5.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r5 = "1"
            boolean r1 = r1.equals(r5)
            r10 = r1
            r1 = r2
            goto L_0x009d
        L_0x009c:
            r10 = r3
        L_0x009d:
            java.lang.String r5 = "icy-metaint"
            java.lang.Object r12 = r12.get(r5)
            java.util.List r12 = (java.util.List) r12
            if (r12 == 0) goto L_0x00d5
            java.lang.Object r12 = r12.get(r3)
            java.lang.String r12 = (java.lang.String) r12
            int r3 = java.lang.Integer.parseInt(r12)     // Catch:{ NumberFormatException -> 0x00c8 }
            if (r3 <= 0) goto L_0x00b5
            r4 = r3
            goto L_0x00c6
        L_0x00b5:
            java.lang.String r2 = java.lang.String.valueOf(r12)     // Catch:{ NumberFormatException -> 0x00c3 }
            int r5 = r2.length()     // Catch:{ NumberFormatException -> 0x00c3 }
            if (r5 == 0) goto L_0x00c5
            r0.concat(r2)     // Catch:{ NumberFormatException -> 0x00c3 }
            goto L_0x00c5
        L_0x00c3:
            r4 = r3
            goto L_0x00c8
        L_0x00c5:
            r2 = r1
        L_0x00c6:
            r1 = r2
            goto L_0x00d5
        L_0x00c8:
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r2 = r12.length()
            if (r2 == 0) goto L_0x00d5
            r0.concat(r12)
        L_0x00d5:
            if (r1 == 0) goto L_0x00e0
            j77 r12 = new j77
            r5 = r12
            r6 = r8
            r8 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r6 = r12
        L_0x00e0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j77.a(java.util.Map):j77");
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j77.class != obj.getClass()) {
            return false;
        }
        j77 j77 = (j77) obj;
        return this.a == j77.a && t0g.a(this.b, j77.b) && t0g.a(this.c, j77.c) && t0g.a(this.o, j77.o) && this.v == j77.v && this.w == j77.w;
    }

    public final int hashCode() {
        int i = (527 + this.a) * 31;
        int i2 = 0;
        String str = this.b;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.o;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((((hashCode2 + i2) * 31) + (this.v ? 1 : 0)) * 31) + this.w;
    }

    public final void o(rs8 rs8) {
        String str = this.c;
        if (str != null) {
            rs8.E = str;
        }
        String str2 = this.b;
        if (str2 != null) {
            rs8.C = str2;
        }
    }

    public final String toString() {
        String str = this.c;
        int f = g63.f(80, str);
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(g63.f(f, str2));
        sb.append("IcyHeaders: name=\"");
        sb.append(str);
        sb.append("\", genre=\"");
        sb.append(str2);
        sb.append("\", bitrate=");
        sb.append(this.a);
        sb.append(", metadataInterval=");
        sb.append(this.w);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.o);
        int i2 = t0g.a;
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeInt(this.w);
    }

    public j77(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.o = parcel.readString();
        int i = t0g.a;
        this.v = parcel.readInt() != 0;
        this.w = parcel.readInt();
    }
}

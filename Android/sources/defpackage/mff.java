package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: mff  reason: default package */
public final class mff extends t77 {
    public static final Parcelable.Creator<mff> CREATOR = new nje(7);
    public final String b;
    public final String c;

    public mff(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mff.class != obj.getClass()) {
            return false;
        }
        mff mff = (mff) obj;
        return t0g.a(this.a, mff.a) && t0g.a(this.b, mff.b) && t0g.a(this.c, mff.c);
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

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o(defpackage.rs8 r9) {
        /*
            r8 = this;
            r0 = 4
            java.lang.String r1 = r8.a
            r1.getClass()
            r2 = 3
            r3 = 0
            r4 = 2
            r5 = 1
            java.lang.String r8 = r8.c
            r6 = -1
            int r7 = r1.hashCode()
            switch(r7) {
                case 82815: goto L_0x0126;
                case 82878: goto L_0x011a;
                case 82897: goto L_0x010e;
                case 83253: goto L_0x0102;
                case 83254: goto L_0x00f6;
                case 83255: goto L_0x00ea;
                case 83341: goto L_0x00de;
                case 83378: goto L_0x00d2;
                case 83536: goto L_0x00c4;
                case 83552: goto L_0x00b6;
                case 2567331: goto L_0x00a8;
                case 2569357: goto L_0x009a;
                case 2569891: goto L_0x008c;
                case 2570401: goto L_0x007f;
                case 2570410: goto L_0x0072;
                case 2571565: goto L_0x0065;
                case 2575251: goto L_0x0058;
                case 2581512: goto L_0x004b;
                case 2581513: goto L_0x003e;
                case 2581514: goto L_0x0031;
                case 2583398: goto L_0x0024;
                case 2590194: goto L_0x0017;
                default: goto L_0x0014;
            }
        L_0x0014:
            r1 = r6
            goto L_0x0131
        L_0x0017:
            java.lang.String r7 = "TYER"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0020
            goto L_0x0014
        L_0x0020:
            r1 = 21
            goto L_0x0131
        L_0x0024:
            java.lang.String r7 = "TRCK"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x002d
            goto L_0x0014
        L_0x002d:
            r1 = 20
            goto L_0x0131
        L_0x0031:
            java.lang.String r7 = "TPE3"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x003a
            goto L_0x0014
        L_0x003a:
            r1 = 19
            goto L_0x0131
        L_0x003e:
            java.lang.String r7 = "TPE2"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0047
            goto L_0x0014
        L_0x0047:
            r1 = 18
            goto L_0x0131
        L_0x004b:
            java.lang.String r7 = "TPE1"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0054
            goto L_0x0014
        L_0x0054:
            r1 = 17
            goto L_0x0131
        L_0x0058:
            java.lang.String r7 = "TIT2"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0061
            goto L_0x0014
        L_0x0061:
            r1 = 16
            goto L_0x0131
        L_0x0065:
            java.lang.String r7 = "TEXT"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x006e
            goto L_0x0014
        L_0x006e:
            r1 = 15
            goto L_0x0131
        L_0x0072:
            java.lang.String r7 = "TDRL"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x007b
            goto L_0x0014
        L_0x007b:
            r1 = 14
            goto L_0x0131
        L_0x007f:
            java.lang.String r7 = "TDRC"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0088
            goto L_0x0014
        L_0x0088:
            r1 = 13
            goto L_0x0131
        L_0x008c:
            java.lang.String r7 = "TDAT"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0096
            goto L_0x0014
        L_0x0096:
            r1 = 12
            goto L_0x0131
        L_0x009a:
            java.lang.String r7 = "TCOM"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x00a4
            goto L_0x0014
        L_0x00a4:
            r1 = 11
            goto L_0x0131
        L_0x00a8:
            java.lang.String r7 = "TALB"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x00b2
            goto L_0x0014
        L_0x00b2:
            r1 = 10
            goto L_0x0131
        L_0x00b6:
            java.lang.String r7 = "TYE"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x00c0
            goto L_0x0014
        L_0x00c0:
            r1 = 9
            goto L_0x0131
        L_0x00c4:
            java.lang.String r7 = "TXT"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x00ce
            goto L_0x0014
        L_0x00ce:
            r1 = 8
            goto L_0x0131
        L_0x00d2:
            java.lang.String r7 = "TT2"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x00dc
            goto L_0x0014
        L_0x00dc:
            r1 = 7
            goto L_0x0131
        L_0x00de:
            java.lang.String r7 = "TRK"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x00e8
            goto L_0x0014
        L_0x00e8:
            r1 = 6
            goto L_0x0131
        L_0x00ea:
            java.lang.String r7 = "TP3"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x00f4
            goto L_0x0014
        L_0x00f4:
            r1 = 5
            goto L_0x0131
        L_0x00f6:
            java.lang.String r7 = "TP2"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0100
            goto L_0x0014
        L_0x0100:
            r1 = r0
            goto L_0x0131
        L_0x0102:
            java.lang.String r7 = "TP1"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x010c
            goto L_0x0014
        L_0x010c:
            r1 = r2
            goto L_0x0131
        L_0x010e:
            java.lang.String r7 = "TDA"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0118
            goto L_0x0014
        L_0x0118:
            r1 = r4
            goto L_0x0131
        L_0x011a:
            java.lang.String r7 = "TCM"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0124
            goto L_0x0014
        L_0x0124:
            r1 = r5
            goto L_0x0131
        L_0x0126:
            java.lang.String r7 = "TAL"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0130
            goto L_0x0014
        L_0x0130:
            r1 = r3
        L_0x0131:
            switch(r1) {
                case 0: goto L_0x01e9;
                case 1: goto L_0x01e6;
                case 2: goto L_0x01c9;
                case 3: goto L_0x01c6;
                case 4: goto L_0x01c3;
                case 5: goto L_0x01c0;
                case 6: goto L_0x019a;
                case 7: goto L_0x0197;
                case 8: goto L_0x0194;
                case 9: goto L_0x0189;
                case 10: goto L_0x01e9;
                case 11: goto L_0x01e6;
                case 12: goto L_0x01c9;
                case 13: goto L_0x0160;
                case 14: goto L_0x0136;
                case 15: goto L_0x0194;
                case 16: goto L_0x0197;
                case 17: goto L_0x01c6;
                case 18: goto L_0x01c3;
                case 19: goto L_0x01c0;
                case 20: goto L_0x019a;
                case 21: goto L_0x0189;
                default: goto L_0x0134;
            }
        L_0x0134:
            goto L_0x01eb
        L_0x0136:
            java.util.ArrayList r8 = a(r8)
            int r0 = r8.size()
            if (r0 == r5) goto L_0x0156
            if (r0 == r4) goto L_0x014e
            if (r0 == r2) goto L_0x0146
            goto L_0x01eb
        L_0x0146:
            java.lang.Object r0 = r8.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.w = r0
        L_0x014e:
            java.lang.Object r0 = r8.get(r5)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.v = r0
        L_0x0156:
            java.lang.Object r8 = r8.get(r3)
            java.lang.Integer r8 = (java.lang.Integer) r8
            r9.u = r8
            goto L_0x01eb
        L_0x0160:
            java.util.ArrayList r8 = a(r8)
            int r0 = r8.size()
            if (r0 == r5) goto L_0x0180
            if (r0 == r4) goto L_0x0178
            if (r0 == r2) goto L_0x0170
            goto L_0x01eb
        L_0x0170:
            java.lang.Object r0 = r8.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.t = r0
        L_0x0178:
            java.lang.Object r0 = r8.get(r5)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.s = r0
        L_0x0180:
            java.lang.Object r8 = r8.get(r3)
            java.lang.Integer r8 = (java.lang.Integer) r8
            r9.r = r8
            goto L_0x01eb
        L_0x0189:
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{  }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{  }
            r9.r = r8     // Catch:{  }
            goto L_0x01eb
        L_0x0194:
            r9.x = r8
            goto L_0x01eb
        L_0x0197:
            r9.a = r8
            goto L_0x01eb
        L_0x019a:
            int r0 = defpackage.t0g.a
            java.lang.String r0 = "/"
            java.lang.String[] r8 = r8.split(r0, r6)
            r0 = r8[r3]     // Catch:{  }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{  }
            int r1 = r8.length     // Catch:{  }
            if (r1 <= r5) goto L_0x01b6
            r8 = r8[r5]     // Catch:{  }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{  }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{  }
            goto L_0x01b7
        L_0x01b6:
            r8 = 0
        L_0x01b7:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{  }
            r9.n = r0     // Catch:{  }
            r9.o = r8     // Catch:{  }
            goto L_0x01eb
        L_0x01c0:
            r9.z = r8
            goto L_0x01eb
        L_0x01c3:
            r9.d = r8
            goto L_0x01eb
        L_0x01c6:
            r9.b = r8
            goto L_0x01eb
        L_0x01c9:
            java.lang.String r0 = r8.substring(r4, r0)     // Catch:{ NumberFormatException -> 0x01eb }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x01eb }
            java.lang.String r8 = r8.substring(r3, r4)     // Catch:{ NumberFormatException -> 0x01eb }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x01eb }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x01eb }
            r9.s = r0     // Catch:{ NumberFormatException -> 0x01eb }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ NumberFormatException -> 0x01eb }
            r9.t = r8     // Catch:{ NumberFormatException -> 0x01eb }
            goto L_0x01eb
        L_0x01e6:
            r9.y = r8
            goto L_0x01eb
        L_0x01e9:
            r9.c = r8
        L_0x01eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mff.o(rs8):void");
    }

    public final String toString() {
        String str = this.a;
        int f = g63.f(22, str);
        String str2 = this.b;
        int f2 = g63.f(f, str2);
        String str3 = this.c;
        StringBuilder sb = new StringBuilder(g63.f(f2, str3));
        sb.append(str);
        sb.append(": description=");
        sb.append(str2);
        sb.append(": value=");
        sb.append(str3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public mff(android.os.Parcel r3) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mff.<init>(android.os.Parcel):void");
    }
}

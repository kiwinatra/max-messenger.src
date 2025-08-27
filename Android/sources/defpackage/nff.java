package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: nff  reason: default package */
public final class nff extends u77 {
    public static final Parcelable.Creator<nff> CREATOR = new nje(8);
    public final String b;
    public final tb7 c;

    public nff(String str, String str2, k0d k0d) {
        super(str);
        n79.g(!k0d.isEmpty());
        this.b = str2;
        tb7 p = tb7.p(k0d);
        this.c = p;
        String str3 = (String) p.get(0);
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
        if (obj == null || nff.class != obj.getClass()) {
            return false;
        }
        nff nff = (nff) obj;
        return v0g.a(this.a, nff.a) && v0g.a(this.b, nff.b) && this.c.equals(nff.c);
    }

    public final int hashCode() {
        int d = g63.d(527, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((d + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return this.a + ": description=" + this.b + ": values=" + this.c;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(defpackage.ss8 r9) {
        /*
            r8 = this;
            r0 = 4
            java.lang.String r1 = r8.a
            r1.getClass()
            r2 = 3
            r3 = 2
            r4 = 1
            tb7 r8 = r8.c
            r5 = 0
            r6 = -1
            int r7 = r1.hashCode()
            switch(r7) {
                case 82815: goto L_0x0135;
                case 82878: goto L_0x012a;
                case 82897: goto L_0x011f;
                case 83253: goto L_0x0114;
                case 83254: goto L_0x0109;
                case 83255: goto L_0x00fe;
                case 83341: goto L_0x00f3;
                case 83378: goto L_0x00e8;
                case 83536: goto L_0x00da;
                case 83552: goto L_0x00cc;
                case 2567331: goto L_0x00be;
                case 2569357: goto L_0x00b0;
                case 2569358: goto L_0x00a2;
                case 2569891: goto L_0x0094;
                case 2570401: goto L_0x0086;
                case 2570410: goto L_0x0078;
                case 2571565: goto L_0x006a;
                case 2575251: goto L_0x005c;
                case 2581512: goto L_0x004e;
                case 2581513: goto L_0x0040;
                case 2581514: goto L_0x0032;
                case 2583398: goto L_0x0024;
                case 2590194: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x013f
        L_0x0016:
            java.lang.String r7 = "TYER"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0020
            goto L_0x013f
        L_0x0020:
            r6 = 22
            goto L_0x013f
        L_0x0024:
            java.lang.String r7 = "TRCK"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x002e
            goto L_0x013f
        L_0x002e:
            r6 = 21
            goto L_0x013f
        L_0x0032:
            java.lang.String r7 = "TPE3"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x003c
            goto L_0x013f
        L_0x003c:
            r6 = 20
            goto L_0x013f
        L_0x0040:
            java.lang.String r7 = "TPE2"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x004a
            goto L_0x013f
        L_0x004a:
            r6 = 19
            goto L_0x013f
        L_0x004e:
            java.lang.String r7 = "TPE1"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0058
            goto L_0x013f
        L_0x0058:
            r6 = 18
            goto L_0x013f
        L_0x005c:
            java.lang.String r7 = "TIT2"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0066
            goto L_0x013f
        L_0x0066:
            r6 = 17
            goto L_0x013f
        L_0x006a:
            java.lang.String r7 = "TEXT"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0074
            goto L_0x013f
        L_0x0074:
            r6 = 16
            goto L_0x013f
        L_0x0078:
            java.lang.String r7 = "TDRL"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0082
            goto L_0x013f
        L_0x0082:
            r6 = 15
            goto L_0x013f
        L_0x0086:
            java.lang.String r7 = "TDRC"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0090
            goto L_0x013f
        L_0x0090:
            r6 = 14
            goto L_0x013f
        L_0x0094:
            java.lang.String r7 = "TDAT"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x009e
            goto L_0x013f
        L_0x009e:
            r6 = 13
            goto L_0x013f
        L_0x00a2:
            java.lang.String r7 = "TCON"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x00ac
            goto L_0x013f
        L_0x00ac:
            r6 = 12
            goto L_0x013f
        L_0x00b0:
            java.lang.String r7 = "TCOM"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x00ba
            goto L_0x013f
        L_0x00ba:
            r6 = 11
            goto L_0x013f
        L_0x00be:
            java.lang.String r7 = "TALB"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x00c8
            goto L_0x013f
        L_0x00c8:
            r6 = 10
            goto L_0x013f
        L_0x00cc:
            java.lang.String r7 = "TYE"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x00d6
            goto L_0x013f
        L_0x00d6:
            r6 = 9
            goto L_0x013f
        L_0x00da:
            java.lang.String r7 = "TXT"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x00e4
            goto L_0x013f
        L_0x00e4:
            r6 = 8
            goto L_0x013f
        L_0x00e8:
            java.lang.String r7 = "TT2"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x00f1
            goto L_0x013f
        L_0x00f1:
            r6 = 7
            goto L_0x013f
        L_0x00f3:
            java.lang.String r7 = "TRK"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x00fc
            goto L_0x013f
        L_0x00fc:
            r6 = 6
            goto L_0x013f
        L_0x00fe:
            java.lang.String r7 = "TP3"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0107
            goto L_0x013f
        L_0x0107:
            r6 = 5
            goto L_0x013f
        L_0x0109:
            java.lang.String r7 = "TP2"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0112
            goto L_0x013f
        L_0x0112:
            r6 = r0
            goto L_0x013f
        L_0x0114:
            java.lang.String r7 = "TP1"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x011d
            goto L_0x013f
        L_0x011d:
            r6 = r2
            goto L_0x013f
        L_0x011f:
            java.lang.String r7 = "TDA"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0128
            goto L_0x013f
        L_0x0128:
            r6 = r3
            goto L_0x013f
        L_0x012a:
            java.lang.String r7 = "TCM"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0133
            goto L_0x013f
        L_0x0133:
            r6 = r4
            goto L_0x013f
        L_0x0135:
            java.lang.String r7 = "TAL"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x013e
            goto L_0x013f
        L_0x013e:
            r6 = r5
        L_0x013f:
            switch(r6) {
                case 0: goto L_0x0270;
                case 1: goto L_0x0266;
                case 2: goto L_0x0241;
                case 3: goto L_0x0237;
                case 4: goto L_0x022d;
                case 5: goto L_0x0223;
                case 6: goto L_0x01f9;
                case 7: goto L_0x01ee;
                case 8: goto L_0x01e3;
                case 9: goto L_0x01d0;
                case 10: goto L_0x0270;
                case 11: goto L_0x0266;
                case 12: goto L_0x01aa;
                case 13: goto L_0x0241;
                case 14: goto L_0x0177;
                case 15: goto L_0x0144;
                case 16: goto L_0x01e3;
                case 17: goto L_0x01ee;
                case 18: goto L_0x0237;
                case 19: goto L_0x022d;
                case 20: goto L_0x0223;
                case 21: goto L_0x01f9;
                case 22: goto L_0x01d0;
                default: goto L_0x0142;
            }
        L_0x0142:
            goto L_0x0279
        L_0x0144:
            java.lang.Object r8 = r8.get(r5)
            java.lang.String r8 = (java.lang.String) r8
            java.util.ArrayList r8 = a(r8)
            int r0 = r8.size()
            if (r0 == r4) goto L_0x016c
            if (r0 == r3) goto L_0x0163
            if (r0 == r2) goto L_0x015a
            goto L_0x0279
        L_0x015a:
            java.lang.Object r0 = r8.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.n(r0)
        L_0x0163:
            java.lang.Object r0 = r8.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.o(r0)
        L_0x016c:
            java.lang.Object r8 = r8.get(r5)
            java.lang.Integer r8 = (java.lang.Integer) r8
            r9.p(r8)
            goto L_0x0279
        L_0x0177:
            java.lang.Object r8 = r8.get(r5)
            java.lang.String r8 = (java.lang.String) r8
            java.util.ArrayList r8 = a(r8)
            int r0 = r8.size()
            if (r0 == r4) goto L_0x019f
            if (r0 == r3) goto L_0x0196
            if (r0 == r2) goto L_0x018d
            goto L_0x0279
        L_0x018d:
            java.lang.Object r0 = r8.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.k(r0)
        L_0x0196:
            java.lang.Object r0 = r8.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.l(r0)
        L_0x019f:
            java.lang.Object r8 = r8.get(r5)
            java.lang.Integer r8 = (java.lang.Integer) r8
            r9.m(r8)
            goto L_0x0279
        L_0x01aa:
            java.lang.Object r0 = r8.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Integer r0 = defpackage.cvg.O(r0)
            if (r0 != 0) goto L_0x01c1
            java.lang.Object r8 = r8.get(r5)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r9.j(r8)
            goto L_0x0279
        L_0x01c1:
            int r8 = r0.intValue()
            java.lang.String r8 = defpackage.v77.a(r8)
            if (r8 == 0) goto L_0x0279
            r9.j(r8)
            goto L_0x0279
        L_0x01d0:
            java.lang.Object r8 = r8.get(r5)     // Catch:{  }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{  }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{  }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{  }
            r9.m(r8)     // Catch:{  }
            goto L_0x0279
        L_0x01e3:
            java.lang.Object r8 = r8.get(r5)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r9.t(r8)
            goto L_0x0279
        L_0x01ee:
            java.lang.Object r8 = r8.get(r5)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r9.q(r8)
            goto L_0x0279
        L_0x01f9:
            java.lang.Object r8 = r8.get(r5)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String[] r8 = defpackage.v0g.d0(r8)
            r0 = r8[r5]     // Catch:{  }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{  }
            int r1 = r8.length     // Catch:{  }
            if (r1 <= r4) goto L_0x0217
            r8 = r8[r4]     // Catch:{  }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{  }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{  }
            goto L_0x0218
        L_0x0217:
            r8 = 0
        L_0x0218:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{  }
            r9.s(r0)     // Catch:{  }
            r9.r(r8)     // Catch:{  }
            goto L_0x0279
        L_0x0223:
            java.lang.Object r8 = r8.get(r5)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r9.h(r8)
            goto L_0x0279
        L_0x022d:
            java.lang.Object r8 = r8.get(r5)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r9.c(r8)
            goto L_0x0279
        L_0x0237:
            java.lang.Object r8 = r8.get(r5)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r9.e(r8)
            goto L_0x0279
        L_0x0241:
            java.lang.Object r8 = r8.get(r5)     // Catch:{ NumberFormatException -> 0x0279 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ NumberFormatException -> 0x0279 }
            java.lang.String r0 = r8.substring(r3, r0)     // Catch:{ NumberFormatException -> 0x0279 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0279 }
            java.lang.String r8 = r8.substring(r5, r3)     // Catch:{ NumberFormatException -> 0x0279 }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0279 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0279 }
            r9.l(r0)     // Catch:{ NumberFormatException -> 0x0279 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ NumberFormatException -> 0x0279 }
            r9.k(r8)     // Catch:{ NumberFormatException -> 0x0279 }
            goto L_0x0279
        L_0x0266:
            java.lang.Object r8 = r8.get(r5)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r9.g(r8)
            goto L_0x0279
        L_0x0270:
            java.lang.Object r8 = r8.get(r5)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r9.d(r8)
        L_0x0279:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nff.u(ss8):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeStringArray((String[]) this.c.toArray(new String[0]));
    }
}

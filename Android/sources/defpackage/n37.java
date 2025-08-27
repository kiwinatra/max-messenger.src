package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* renamed from: n37  reason: default package */
public abstract class n37 {
    public static final vw0 a;
    public static final String[] b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    public static final String[] c = new String[64];
    public static final String[] d;

    static {
        vw0 vw0 = new vw0("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n".getBytes(Charsets.UTF_8));
        vw0.b = "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n";
        a = vw0;
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            strArr[i] = StringsKt__StringsJVMKt.replace$default(u0g.h("%8s", Integer.toBinaryString(i)), ' ', '0', false, 4, (Object) null);
        }
        d = strArr;
        String[] strArr2 = c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = Intrinsics.stringPlus(strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = c;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + "|" + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append("|");
            strArr3[i6 | 8] = wj6.n(sb, strArr3[i4], "|PADDED");
        }
        int length = c.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = c;
            if (strArr4[i7] == null) {
                strArr4[i7] = d[i7];
            }
        }
    }

    public static String a(boolean z, int i, int i2, int i3, int i4) {
        String str;
        String[] strArr = b;
        String h = i3 < strArr.length ? strArr[i3] : u0g.h("0x%02x", Integer.valueOf(i3));
        if (i4 == 0) {
            str = "";
        } else {
            String[] strArr2 = d;
            if (!(i3 == 2 || i3 == 3)) {
                if (i3 == 4 || i3 == 6) {
                    str = i4 == 1 ? "ACK" : strArr2[i4];
                } else if (!(i3 == 7 || i3 == 8)) {
                    String[] strArr3 = c;
                    String str2 = i4 < strArr3.length ? strArr3[i4] : strArr2[i4];
                    str = (i3 != 5 || (i4 & 4) == 0) ? (i3 != 0 || (i4 & 32) == 0) ? str2 : StringsKt__StringsJVMKt.replace$default(str2, "PRIORITY", "COMPRESSED", false, 4, (Object) null) : StringsKt__StringsJVMKt.replace$default(str2, "HEADERS", "PUSH_PROMISE", false, 4, (Object) null);
                }
            }
            str = strArr2[i4];
        }
        return u0g.h("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), h, str);
    }
}

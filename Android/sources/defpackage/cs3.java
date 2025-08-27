package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cs3  reason: default package */
public final class cs3 implements Serializable {
    public final fo3 a;
    public final String b;
    public final String c;
    public final ntb o;
    public final List v;
    public final int w;
    public final boolean x;

    public cs3(fo3 fo3, String str, String str2, ntb ntb, ArrayList arrayList, int i, boolean z) {
        this.a = fo3;
        this.b = str;
        this.c = str2;
        this.o = ntb;
        this.v = arrayList;
        this.w = i;
        this.x = z;
    }

    public static cs3 a(pf9 pf9) {
        int e0 = ryg.e0(pf9);
        ArrayList arrayList = null;
        int i = 0;
        boolean z = false;
        fo3 fo3 = null;
        String str = null;
        String str2 = null;
        ntb ntb = null;
        for (int i2 = 0; i2 < e0; i2++) {
            String A0 = pf9.A0();
            A0.getClass();
            char c2 = 65535;
            switch (A0.hashCode()) {
                case -1857640538:
                    if (A0.equals("summary")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1297282981:
                    if (A0.equals("restricted")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1276666629:
                    if (A0.equals("presence")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -600094315:
                    if (A0.equals("friends")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -191501435:
                    if (A0.equals("feedback")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 613469306:
                    if (A0.equals("friendsCount")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 951526432:
                    if (A0.equals("contact")) {
                        c2 = 6;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    str = pf9.A0();
                    break;
                case 1:
                    z = pf9.v0();
                    break;
                case 2:
                    ntb = ntb.a(pf9);
                    break;
                case 3:
                    int X = ryg.X(pf9);
                    ArrayList arrayList2 = new ArrayList();
                    for (int i3 = 0; i3 < X; i3++) {
                        arrayList2.add(Long.valueOf(pf9.x0()));
                    }
                    arrayList = arrayList2;
                    break;
                case 4:
                    str2 = pf9.A0();
                    break;
                case 5:
                    i = pf9.w0();
                    break;
                case 6:
                    fo3 = fo3.e(pf9);
                    break;
                default:
                    pf9.A();
                    break;
            }
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        return new cs3(fo3, str, str2, ntb, arrayList, i, z);
    }

    public final String toString() {
        String G = cvg.G(this.b);
        String G2 = cvg.G(this.c);
        int o2 = kv0.o(this.v);
        return "{contact=" + this.a + ", summary='" + G + "', feedback='" + G2 + "', friends=" + o2 + ", friendsCount=" + this.w + ", restricted=" + this.x + "}";
    }
}

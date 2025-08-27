package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: fu  reason: default package */
public final class fu extends ibf implements Serializable {
    public List c;
    public List o;
    public List v;
    public long w;

    public fu(pf9 pf9) {
        super(pf9);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
        if (this.o == null) {
            this.o = Collections.emptyList();
        }
        if (this.v == null) {
            this.v = Collections.emptyList();
        }
    }

    public final void c(pf9 pf9, String str) {
        pf9 pf92 = pf9;
        String str2 = str;
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1081306054:
                if (str2.equals("marker")) {
                    c2 = 0;
                    break;
                }
                break;
            case 1531715286:
                if (str2.equals("stickers")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1596679982:
                if (str2.equals("stickerSets")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1651659013:
                if (str2.equals("backgrounds")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.w = pf9.x0();
                return;
            case 1:
                this.c = a00.f(pf9);
                return;
            case 2:
                this.o = a00.f(pf9);
                return;
            case 3:
                int X = ryg.X(pf9);
                this.v = new ArrayList(X);
                for (int i = 0; i < X; i++) {
                    List list = this.v;
                    int e0 = ryg.e0(pf9);
                    String str3 = "";
                    String str4 = str3;
                    long j = 0;
                    for (int i2 = 0; i2 < e0; i2++) {
                        String A0 = pf9.A0();
                        if (A0 != null) {
                            int hashCode = A0.hashCode();
                            if (hashCode != 3355) {
                                if (hashCode != 116079) {
                                    if (hashCode == 94842723 && A0.equals("color")) {
                                        str4 = ryg.h0(pf92, "");
                                    }
                                } else if (A0.equals("url")) {
                                    str3 = ryg.h0(pf92, "");
                                }
                            } else if (A0.equals("id")) {
                                j = ryg.d0(pf92, 0);
                            }
                        }
                        pf9.A();
                    }
                    list.add(new af0(j, str3, str4));
                }
                return;
            default:
                pf9.A();
                return;
        }
    }

    public final String toString() {
        int o2 = kv0.o(this.c);
        int o3 = kv0.o(this.o);
        int o4 = kv0.o(this.v);
        long j = this.w;
        StringBuilder n = a81.n("{stickers=", o2, "stickerSets=", o3, "backgrounds=");
        n.append(o4);
        n.append(", marker=");
        n.append(j);
        n.append("}");
        return n.toString();
    }
}

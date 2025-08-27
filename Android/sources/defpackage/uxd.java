package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: uxd  reason: default package */
public final class uxd extends ibf {
    public List c;

    public uxd(pf9 pf9) {
        super(pf9);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
    }

    public final void c(pf9 pf9, String str) {
        str.getClass();
        if (!str.equals("sessions")) {
            pf9.A();
            return;
        }
        int X = ryg.X(pf9);
        this.c = new ArrayList(X);
        for (int i = 0; i < X; i++) {
            List list = this.c;
            int e0 = ryg.e0(pf9);
            wvd wvd = null;
            if (e0 != 0) {
                boolean z = false;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                long j = 0;
                for (int i2 = 0; i2 < e0; i2++) {
                    String A0 = pf9.A0();
                    A0.getClass();
                    char c2 = 65535;
                    switch (A0.hashCode()) {
                        case -1357712437:
                            if (A0.equals("client")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case 3237038:
                            if (A0.equals("info")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 3560141:
                            if (A0.equals("time")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 1126940025:
                            if (A0.equals("current")) {
                                c2 = 3;
                                break;
                            }
                            break;
                        case 1901043637:
                            if (A0.equals("location")) {
                                c2 = 4;
                                break;
                            }
                            break;
                    }
                    switch (c2) {
                        case 0:
                            str2 = pf9.A0();
                            break;
                        case 1:
                            str3 = pf9.A0();
                            break;
                        case 2:
                            j = pf9.x0();
                            break;
                        case 3:
                            z = pf9.v0();
                            break;
                        case 4:
                            str4 = pf9.A0();
                            break;
                        default:
                            pf9.A();
                            break;
                    }
                }
                wvd = new wvd(j, str2, str3, str4, z);
            }
            list.add(wvd);
        }
    }

    public final String toString() {
        return a81.j(kv0.o(this.c), "{sessions=", "}");
    }
}

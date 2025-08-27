package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: ntb  reason: default package */
public final class ntb implements Serializable {
    public static final ntb c = new ntb(5, 0);
    public final int a;
    public final int b;

    public ntb(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static ntb a(pf9 pf9) {
        int i = 1;
        int e0 = ryg.e0(pf9);
        if (e0 == 0) {
            return null;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < e0; i4++) {
            String A0 = pf9.A0();
            A0.getClass();
            if (A0.equals("on")) {
                String A02 = pf9.A0();
                A02.getClass();
                char c2 = 65535;
                switch (A02.hashCode()) {
                    case 2527:
                        if (A02.equals("ON")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 76512:
                        if (A02.equals("MOB")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 76641:
                        if (A02.equals("MSG")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 85812:
                        if (A02.equals("WEB")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 433141802:
                        if (A02.equals("UNKNOWN")) {
                            c2 = 4;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        i2 = 5;
                        continue;
                    case 1:
                        i2 = 3;
                        continue;
                    case 2:
                        i2 = 4;
                        continue;
                    case 3:
                        i2 = 2;
                        continue;
                    case 4:
                        z68.n("PresenceType", (IOException) null, "unknown! %s", Arrays.copyOf(new Object[]{A02}, 1));
                        break;
                    default:
                        z68.n("PresenceType", (IOException) null, "not contains enum value %s", Arrays.copyOf(new Object[]{A02}, 1));
                        break;
                }
                i2 = 1;
            } else if (!A0.equals("seen")) {
                pf9.A();
            } else {
                i3 = pf9.w0();
            }
        }
        if (i2 != 0) {
            i = i2;
        }
        return new ntb(i, i3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{on=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "ON" : "MSG" : "MOB" : "WEB" : "UNKNOWN");
        sb.append(", seen=");
        return wj6.l(sb, this.b, "}");
    }
}

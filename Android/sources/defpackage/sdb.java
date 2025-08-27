package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: sdb  reason: default package */
public final class sdb extends ibf {
    public String c;
    public fo3 o;
    public Long v;
    public int w;

    public final void c(pf9 pf9, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -309425751:
                if (str.equals("profile")) {
                    c2 = 0;
                    break;
                }
                break;
            case 106642798:
                if (str.equals("phone")) {
                    c2 = 1;
                    break;
                }
                break;
            case 110541305:
                if (str.equals(ApiProtocol.KEY_TOKEN)) {
                    c2 = 2;
                    break;
                }
                break;
            case 141498579:
                if (str.equals("tokenType")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.o = fo3.e(pf9);
                return;
            case 1:
                this.v = Long.valueOf(ryg.d0(pf9, 0));
                return;
            case 2:
                this.c = ryg.g0(pf9);
                return;
            case 3:
                this.w = i2a.v(ryg.g0(pf9));
                return;
            default:
                pf9.A();
                return;
        }
    }

    public final String toString() {
        String str = this.c;
        fo3 fo3 = this.o;
        Long l = this.v;
        int i = this.w;
        return "{token='" + str + "', profile=" + fo3 + ", phone=" + l + ", tokenType=" + i2a.r(i) + "}";
    }
}

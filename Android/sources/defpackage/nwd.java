package defpackage;

/* renamed from: nwd  reason: default package */
public final class nwd extends ibf {
    public String c;
    public String o;
    public int v;
    public a00 w;

    public final void c(pf9 pf9, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1669782576:
                if (str.equals("proxy-domains")) {
                    c2 = 0;
                    break;
                }
                break;
            case 106941038:
                if (str.equals("proxy")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1808396306:
                if (str.equals("app-update-type")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1901043637:
                if (str.equals("location")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.w = a00.m(pf9);
                return;
            case 1:
                this.c = ryg.g0(pf9);
                return;
            case 2:
                this.v = ryg.c0(pf9);
                return;
            case 3:
                this.o = ryg.g0(pf9);
                return;
            default:
                pf9.A();
                return;
        }
    }

    public final String toString() {
        String str = this.c;
        String str2 = this.o;
        int i = this.v;
        a00 a00 = this.w;
        StringBuilder r = rae.r("{  proxy='", str, "', locationCountryCode='", str2, "', appUpdateType=");
        r.append(i);
        r.append(", proxyDomains=");
        r.append(a00);
        r.append("}");
        return r.toString();
    }
}

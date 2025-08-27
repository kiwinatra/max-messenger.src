package defpackage;

/* renamed from: raa  reason: default package */
public final class raa extends ibf {
    public long c;
    public long o;
    public long v;
    public String w;

    public final void c(pf9 pf9, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1274507337:
                if (str.equals("fileId")) {
                    c2 = 0;
                    break;
                }
                break;
            case -661256303:
                if (str.equals("audioId")) {
                    c2 = 1;
                    break;
                }
                break;
            case 96784904:
                if (str.equals("error")) {
                    c2 = 2;
                    break;
                }
                break;
            case 452782838:
                if (str.equals("videoId")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.v = ryg.d0(pf9, 0);
                return;
            case 1:
                this.c = ryg.d0(pf9, 0);
                return;
            case 2:
                this.w = ryg.g0(pf9);
                return;
            case 3:
                this.o = ryg.d0(pf9, 0);
                return;
            default:
                pf9.A();
                return;
        }
    }

    public final String toString() {
        long j = this.c;
        long j2 = this.o;
        long j3 = this.v;
        String str = this.w;
        StringBuilder n = tr1.n(j, "{audioId=", ", videoId=");
        n.append(j2);
        tr1.v(n, ", fileId=", j3, ", error='");
        return wj6.n(n, str, "'}");
    }
}

package defpackage;

/* renamed from: cca  reason: default package */
public final class cca extends ibf {
    public long c;
    public ntb o;
    public long v;

    public final void c(pf9 pf9, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1276666629:
                if (str.equals("presence")) {
                    c2 = 0;
                    break;
                }
                break;
            case -836030906:
                if (str.equals("userId")) {
                    c2 = 1;
                    break;
                }
                break;
            case 3560141:
                if (str.equals("time")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.o = ntb.a(pf9);
                return;
            case 1:
                this.c = pf9.x0();
                return;
            case 2:
                this.v = pf9.x0();
                return;
            default:
                pf9.A();
                return;
        }
    }

    public final String toString() {
        long j = this.c;
        ntb ntb = this.o;
        long j2 = this.v;
        return "{userId=" + j + ", presence=" + ntb + ", time=" + j2 + "}";
    }
}

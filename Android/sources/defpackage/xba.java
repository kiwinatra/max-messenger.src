package defpackage;

/* renamed from: xba  reason: default package */
public final class xba extends ibf {
    public b32 c;
    public long o;
    public long v;

    public xba(pf9 pf9) {
        super(pf9);
    }

    public final void c(pf9 pf9, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -2129294769:
                if (str.equals("startTime")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1607243192:
                if (str.equals("endTime")) {
                    c2 = 1;
                    break;
                }
                break;
            case 3052376:
                if (str.equals("chat")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.o = ryg.d0(pf9, 0);
                return;
            case 1:
                this.v = ryg.d0(pf9, 0);
                return;
            case 2:
                this.c = b32.a(pf9);
                return;
            default:
                pf9.A();
                return;
        }
    }

    public final String toString() {
        long j = this.o;
        long j2 = this.v;
        b32 b32 = this.c;
        StringBuilder n = tr1.n(j, "{startTime=", ", endTime=");
        n.append(j2);
        n.append(", chat=");
        n.append(b32);
        n.append("}");
        return n.toString();
    }
}

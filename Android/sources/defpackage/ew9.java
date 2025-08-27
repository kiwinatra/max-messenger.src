package defpackage;

/* renamed from: ew9  reason: default package */
public final class ew9 extends ibf {
    public b89 c;
    public b32 o;
    public String v;

    public ew9(pf9 pf9) {
        super(pf9);
    }

    public final void c(pf9 pf9, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -2091130755:
                if (str.equals("chatAccessToken")) {
                    c2 = 0;
                    break;
                }
                break;
            case 3052376:
                if (str.equals("chat")) {
                    c2 = 1;
                    break;
                }
                break;
            case 954925063:
                if (str.equals("message")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.v = ryg.g0(pf9);
                return;
            case 1:
                this.o = b32.a(pf9);
                return;
            case 2:
                this.c = z79.a(pf9);
                return;
            default:
                pf9.A();
                return;
        }
    }

    public final String toString() {
        b89 b89 = this.c;
        b32 b32 = this.o;
        return "Response{, message=" + b89 + ", chat=" + b32 + "}";
    }
}

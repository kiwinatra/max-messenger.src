package defpackage;

/* renamed from: gba  reason: default package */
public final class gba extends ibf {
    public long c;
    public String o;
    public t58 v;

    public gba(pf9 pf9) {
        super(pf9);
    }

    public final void c(pf9 pf9, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -836030906:
                if (str.equals("userId")) {
                    c2 = 0;
                    break;
                }
                break;
            case 1109191185:
                if (str.equals("deviceId")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1901043637:
                if (str.equals("location")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.c = ryg.d0(pf9, 0);
                return;
            case 1:
                this.o = ryg.g0(pf9);
                return;
            case 2:
                this.v = t58.a(pf9);
                return;
            default:
                pf9.A();
                return;
        }
    }

    public final String toString() {
        long j = this.c;
        String str = this.o;
        t58 t58 = this.v;
        StringBuilder k = i2a.k("Response{userId=", j, ", deviceId='", str);
        k.append("', location=");
        k.append(t58);
        k.append("}");
        return k.toString();
    }
}

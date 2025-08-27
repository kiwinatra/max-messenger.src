package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: dca  reason: default package */
public final class dca extends ibf {
    public long c;
    public long o;
    public b10 v;

    public final void c(pf9 pf9, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1361631597:
                if (str.equals(ApiProtocol.PARAM_CHAT_ID)) {
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
            case 3575610:
                if (str.equals("type")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.c = pf9.x0();
                return;
            case 1:
                this.o = pf9.x0();
                return;
            case 2:
                String g0 = ryg.g0(pf9);
                if (g0 != null) {
                    this.v = b10.a(g0);
                    return;
                }
                return;
            default:
                pf9.A();
                return;
        }
    }

    public final String toString() {
        long j = this.c;
        long j2 = this.o;
        b10 b10 = this.v;
        StringBuilder n = tr1.n(j, "{chatId=", ", userId=");
        n.append(j2);
        n.append(", type=");
        n.append(b10);
        n.append("}");
        return n.toString();
    }
}

package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: dba  reason: default package */
public final class dba extends ibf {
    public long c;
    public long o;
    public long v;

    public dba(pf9 pf9) {
        super(pf9);
    }

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
            case 3560141:
                if (str.equals("time")) {
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
                this.o = ryg.d0(pf9, 0);
                return;
            case 2:
                this.v = ryg.d0(pf9, 0);
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
        StringBuilder n = tr1.n(j, "Response{chatId=", ", userId=");
        n.append(j2);
        n.append(", time=");
        n.append(j3);
        n.append("}");
        return n.toString();
    }
}

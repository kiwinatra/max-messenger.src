package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: iba  reason: default package */
public final class iba extends ibf {
    public long c;
    public long o;
    public long v;
    public Integer w;

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
            case -840272977:
                if (str.equals("unread")) {
                    c2 = 1;
                    break;
                }
                break;
            case -836030906:
                if (str.equals("userId")) {
                    c2 = 2;
                    break;
                }
                break;
            case 3344077:
                if (str.equals("mark")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.c = pf9.x0();
                return;
            case 1:
                this.w = Integer.valueOf(pf9.w0());
                return;
            case 2:
                this.o = pf9.x0();
                return;
            case 3:
                this.v = pf9.x0();
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
        Integer num = this.w;
        StringBuilder n = tr1.n(j, "{chatId=", ", userId=");
        n.append(j2);
        tr1.v(n, ", mark=", j3, ", unread=");
        n.append(num);
        n.append("}");
        return n.toString();
    }
}

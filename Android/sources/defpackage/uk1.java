package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: uk1  reason: default package */
public final class uk1 extends ibf {
    public String c;
    public long o;
    public m7h v;
    public String w;

    public final void c(pf9 pf9, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1676095234:
                if (str.equals(ApiProtocol.PARAM_CONVERSATION_ID)) {
                    c2 = 0;
                    break;
                }
                break;
            case -1401988028:
                if (str.equals(ApiProtocol.PARAM_JOIN_LINK)) {
                    c2 = 1;
                    break;
                }
                break;
            case -992105955:
                if (str.equals(ApiProtocol.PARAM_PEER_ID)) {
                    c2 = 2;
                    break;
                }
                break;
            case 86542880:
                if (str.equals("turnServer")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.c = ryg.g0(pf9);
                return;
            case 1:
                this.w = ryg.g0(pf9);
                return;
            case 2:
                this.o = ryg.d0(pf9, 0);
                return;
            case 3:
                this.v = m7h.e(pf9);
                return;
            default:
                pf9.A();
                return;
        }
    }

    public final String toString() {
        String str = this.c;
        long j = this.o;
        m7h m7h = this.v;
        String str2 = this.w;
        return "{conversationId='" + str + "', peerId=" + j + ", turnServer=" + m7h + ", joinLink=" + str2 + "}";
    }
}

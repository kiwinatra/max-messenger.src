package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: saa  reason: default package */
public final class saa extends ibf {
    public String c;
    public String o;
    public long v;
    public long w;
    public m7h x;
    public String y;
    public int z;

    public saa(pf9 pf9) {
        super(pf9);
    }

    public final void c(pf9 pf9, String str) {
        int i = 3;
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1676095234:
                if (str.equals(ApiProtocol.PARAM_CONVERSATION_ID)) {
                    c2 = 0;
                    break;
                }
                break;
            case -1361631597:
                if (str.equals(ApiProtocol.PARAM_CHAT_ID)) {
                    c2 = 1;
                    break;
                }
                break;
            case -172115450:
                if (str.equals("callerId")) {
                    c2 = 2;
                    break;
                }
                break;
            case 116579:
                if (str.equals("vcp")) {
                    c2 = 3;
                    break;
                }
                break;
            case 3575610:
                if (str.equals("type")) {
                    c2 = 4;
                    break;
                }
                break;
            case 86542880:
                if (str.equals("turnServer")) {
                    c2 = 5;
                    break;
                }
                break;
            case 398343517:
                if (str.equals("sdpOffer")) {
                    c2 = 6;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.c = ryg.g0(pf9);
                return;
            case 1:
                this.w = ryg.d0(pf9, 0);
                return;
            case 2:
                this.v = ryg.d0(pf9, 0);
                return;
            case 3:
                this.o = ryg.g0(pf9);
                return;
            case 4:
                String g0 = ryg.g0(pf9);
                g0.getClass();
                if (g0.equals("AUDIO")) {
                    i = 2;
                } else if (!g0.equals("VIDEO")) {
                    i = 1;
                }
                this.z = i;
                return;
            case 5:
                this.x = m7h.e(pf9);
                return;
            case 6:
                this.y = ryg.g0(pf9);
                return;
            default:
                pf9.A();
                return;
        }
    }

    public final String toString() {
        String str = this.c;
        String str2 = this.o;
        long j = this.v;
        long j2 = this.w;
        m7h m7h = this.x;
        String str3 = this.y;
        int i = this.z;
        StringBuilder r = rae.r("{conversationId='", str, "'convParams='", str2, "', callerId=");
        r.append(j);
        tr1.v(r, ", chatId=", j2, ", turnServer=");
        r.append(m7h);
        r.append(", sdpOffer='");
        r.append(str3);
        r.append("', callType=");
        r.append(a81.x(i));
        r.append("}");
        return r.toString();
    }
}

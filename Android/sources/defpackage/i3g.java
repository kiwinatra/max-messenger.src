package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: i3g  reason: default package */
public final class i3g {
    public final /* synthetic */ int a = 0;
    public String b;
    public long c;
    public long d;
    public m7h e;
    public String f;
    public int g;

    public /* synthetic */ i3g() {
    }

    public static i3g a(pf9 pf9) {
        int e0 = ryg.e0(pf9);
        if (e0 == 0) {
            return null;
        }
        i3g i3g = new i3g();
        for (int i = 0; i < e0; i++) {
            String A0 = pf9.A0();
            A0.getClass();
            char c2 = 65535;
            switch (A0.hashCode()) {
                case -1676095234:
                    if (A0.equals(ApiProtocol.PARAM_CONVERSATION_ID)) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1361631597:
                    if (A0.equals(ApiProtocol.PARAM_CHAT_ID)) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -172115450:
                    if (A0.equals("callerId")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 3575610:
                    if (A0.equals("type")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 86542880:
                    if (A0.equals("turnServer")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 398343517:
                    if (A0.equals("sdpOffer")) {
                        c2 = 5;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    i3g.b = pf9.A0();
                    break;
                case 1:
                    i3g.d = pf9.x0();
                    break;
                case 2:
                    i3g.c = pf9.x0();
                    break;
                case 3:
                    String A02 = pf9.A0();
                    A02.getClass();
                    i3g.g = !A02.equals("AUDIO") ? !A02.equals("VIDEO") ? 1 : 3 : 2;
                    break;
                case 4:
                    i3g.e = m7h.e(pf9);
                    break;
                case 5:
                    i3g.f = ryg.g0(pf9);
                    break;
                default:
                    pf9.A();
                    break;
            }
        }
        return new i3g(i3g);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "{conversationId='" + this.b + "', callerId=" + this.c + ", chatId=" + this.d + ", turnServer=" + this.e + ", sdpOffer='" + this.f + "', type=" + a81.x(this.g) + "}";
            default:
                return super.toString();
        }
    }

    public i3g(i3g i3g) {
        this.b = i3g.b;
        this.c = i3g.c;
        this.d = i3g.d;
        this.e = i3g.e;
        this.f = i3g.f;
        this.g = i3g.g;
    }
}

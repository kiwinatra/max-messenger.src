package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: taa  reason: default package */
public final class taa extends ibf {
    public String c;
    public long o;

    public taa(pf9 pf9) {
        super(pf9);
    }

    public final void c(pf9 pf9, String str) {
        str.getClass();
        if (str.equals(ApiProtocol.PARAM_CHAT_ID)) {
            this.o = ryg.d0(pf9, 0);
        } else if (!str.equals("text")) {
            pf9.A();
        } else {
            this.c = ryg.g0(pf9);
        }
    }

    public final String toString() {
        StringBuilder k = i2a.k("{chatId='", this.o, ", text='", this.c);
        k.append("'}");
        return k.toString();
    }
}

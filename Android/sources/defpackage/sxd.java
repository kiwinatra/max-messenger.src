package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: sxd  reason: default package */
public final class sxd extends ibf {
    public String c;

    public final void c(pf9 pf9, String str) {
        str.getClass();
        if (!str.equals(ApiProtocol.KEY_TOKEN)) {
            pf9.A();
        } else {
            this.c = pf9.A0();
        }
    }

    public final String toString() {
        return wj6.k("{token='", cvg.G(this.c), "'}");
    }
}

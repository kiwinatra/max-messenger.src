package defpackage;

import java.util.Collections;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: qv9  reason: default package */
public final class qv9 extends ibf {
    public long c;
    public List o;

    public qv9(pf9 pf9) {
        super(pf9);
        if (this.o == null) {
            this.o = Collections.emptyList();
        }
    }

    public final void c(pf9 pf9, String str) {
        str.getClass();
        if (str.equals(ApiProtocol.PARAM_CHAT_ID)) {
            this.c = pf9.x0();
        } else if (!str.equals("messages")) {
            pf9.A();
        } else {
            this.o = a00.g(pf9);
        }
    }

    public final String toString() {
        long j = this.c;
        int o2 = kv0.o(this.o);
        return "{chatId=" + j + ", messages=" + o2 + "}";
    }
}

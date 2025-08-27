package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: b9g  reason: default package */
public final class b9g extends ibf {
    public List c;

    public b9g(pf9 pf9) {
        super(pf9);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
    }

    public final void c(pf9 pf9, String str) {
        str.getClass();
        if (!str.equals("info")) {
            pf9.A();
            return;
        }
        this.c = new ArrayList();
        int t0 = pf9.t0();
        for (int i = 0; i < t0; i++) {
            List list = this.c;
            int y0 = pf9.y0();
            String str2 = null;
            String str3 = null;
            long j = 0;
            for (int i2 = 0; i2 < y0; i2++) {
                String A0 = pf9.A0();
                A0.getClass();
                char c2 = 65535;
                switch (A0.hashCode()) {
                    case 116079:
                        if (A0.equals("url")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 110541305:
                        if (A0.equals(ApiProtocol.KEY_TOKEN)) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 452782838:
                        if (A0.equals("videoId")) {
                            c2 = 2;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        pf9 pf92 = pf9;
                        str2 = ryg.g0(pf9);
                        break;
                    case 1:
                        pf9 pf93 = pf9;
                        str3 = ryg.g0(pf9);
                        break;
                    case 2:
                        j = ryg.d0(pf9, 0);
                        break;
                    default:
                        pf9.A();
                        pf9 pf94 = pf9;
                        break;
                }
            }
            pf9 pf95 = pf9;
            list.add(new c9g(j, str2, str3));
        }
    }

    public final String toString() {
        List list = this.c;
        return "{info=" + list + "}";
    }
}

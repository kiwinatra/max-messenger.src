package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: e1d  reason: default package */
public final class e1d {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;

    public e1d(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
    }

    public static void a(e1d e1d, long j) {
        a32 a32;
        r62 r62 = (r62) e1d.a.getValue();
        r62.getClass();
        z68.c("r62", "removeChatInternal, chatId = " + j, new Object[0]);
        a32 G = r62.G(j);
        a32 a322 = null;
        if (G == null) {
            a32 = null;
        } else {
            m72 m72 = G.b;
            long j2 = m72.a;
            ((d6b) r62.v.get()).getClass();
            d6b.a(j2);
            k72 k72 = (G.K() || !G.U()) ? k72.v : k72.c;
            ((jqg) r62.w.get()).a(new mud(j, m72.k, true));
            a32 = r62.i(j, false, new ba(16, r62, k72));
        }
        if (a32 != null) {
            r62.m.c(new xy2(Collections.singletonList(Long.valueOf(j)), true));
            List singletonList = Collections.singletonList(Long.valueOf(j));
            q62 q62 = r62.G;
            if (q62 != null) {
                q62.b(singletonList);
            }
            Lazy lazy = r62.C;
            if (lazy.getValue() != null) {
                long j3 = a32.b.a;
                ia2 ia2 = (ia2) ((u82) lazy.getValue());
                ia2.getClass();
                ev0.v(ia2.y, (CoroutineContext) null, (f14) null, new r92(ia2, j3, (Continuation) null), 3);
            }
            a322 = a32;
        }
        if (a322 != null) {
            ((wba) e1d.d.getValue()).getClass();
            wba.a(a322, (qwa) e1d.c.getValue());
        }
    }
}

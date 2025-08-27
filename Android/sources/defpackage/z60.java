package defpackage;

import com.my.tracker.obfuscated.e0;
import com.my.tracker.obfuscated.w1;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import one.me.messages.list.ui.MessagesListWidget;
import ru.ok.android.externcalls.sdk.AudioSampleEnergyCalculator;
import ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManagerImpl;

/* renamed from: z60  reason: default package */
public final /* synthetic */ class z60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z60(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public final void run() {
        List list = null;
        long j = this.b;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                p7d p7d = (p7d) obj;
                p7d.getClass();
                int i = v0g.a;
                wb4 wb4 = ((nc5) p7d.c).a.A0;
                td J = wb4.J();
                wb4.K(J, 1010, new db4(J, j));
                return;
            case 1:
                wsb wsb = (wsb) obj;
                wsb.getClass();
                int i2 = t0g.a;
                vb4 vb4 = ((mc5) wsb.b).a.z0;
                sd P = vb4.P();
                vb4.Q(P, 1010, new nb4(P, j));
                return;
            case 2:
                ((AudioSampleEnergyCalculator) obj).lambda$onSample$0(j);
                return;
            case 3:
                r62 r62 = (r62) obj;
                n72 n72 = (n72) r62.d.remove(Long.valueOf(j));
                if (n72 != null) {
                    ConcurrentHashMap concurrentHashMap = r62.c;
                    m72 m72 = n72.c;
                    concurrentHashMap.remove(Long.valueOf(m72.l));
                    r62.b.remove(Long.valueOf(m72.l));
                    r62.e.remove(Long.valueOf(m72.a));
                }
                a32 a32 = (a32) r62.f.remove(Long.valueOf(j));
                if (a32 != null) {
                    ConcurrentHashMap concurrentHashMap2 = r62.g;
                    m72 m722 = a32.b;
                    concurrentHashMap2.remove(Long.valueOf(m722.a));
                    Lazy lazy = r62.C;
                    if (lazy.getValue() != null) {
                        ia2 ia2 = (ia2) ((u82) lazy.getValue());
                        ia2.getClass();
                        ev0.v(ia2.y, (CoroutineContext) null, (f14) null, new r92(ia2, m722.a, (Continuation) null), 3);
                    }
                }
                r62.h.remove(Long.valueOf(j));
                return;
            case 4:
                FeedbackListenerManagerImpl.scheduleRemoving$lambda$4((FeedbackListenerManagerImpl) obj, j);
                return;
            case 5:
                ((vo5) obj).k.F(j);
                return;
            case 6:
                ((j18) obj).m(j);
                return;
            case 7:
                q6.T((m5) obj, j);
                return;
            case 8:
                xy6 xy6 = ((MessagesListWidget) obj).X;
                uy6 uy6 = xy6.d;
                if (uy6 != null && uy6.a == j) {
                    list = uy6.b;
                }
                xy6.a(new uy6(j, list));
                return;
            case 9:
                ((cce) ((jz2) obj).c).o.F(j);
                return;
            case 10:
                ((e0) obj).a(j);
                return;
            default:
                ((w1) obj).b(j);
                return;
        }
    }
}

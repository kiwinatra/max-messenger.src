package defpackage;

import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.analytics.internal.event.EventQueueCollector;

/* renamed from: vz0  reason: default package */
public final /* synthetic */ class vz0 implements EventQueueCollector.IdleStateProvider, qk3, i08, h08, pk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ vz0() {
        this.a = 10;
        this.b = true;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                w62 w62 = (w62) obj;
                w62.d0 = new zq0(w62.d0.a, this.b);
                return;
            case 5:
                j10 j10 = (j10) obj;
                if (this.b) {
                    j10.i = d20.o;
                    return;
                } else {
                    j10.i = d20.a;
                    return;
                }
            case 7:
                ((ypb) obj).O(this.b);
                return;
            case 8:
                ((ypb) obj).e0(this.b);
                return;
            case 9:
                ((ypb) obj).s(this.b);
                return;
            case 10:
                j10 j102 = (j10) obj;
                boolean z = this.b;
                j102.x = z;
                if (j102.r != null && j102.b().d != null) {
                    j10 j = j102.b().d.j();
                    j.x = z;
                    l20 a2 = j.a();
                    r10 a3 = j102.b().a();
                    a3.e = a2;
                    j102.r = new s10(a3);
                    return;
                }
                return;
            default:
                j10 j103 = (j10) obj;
                boolean X = ld8.X(j103);
                if (j103.d != null || X) {
                    boolean z2 = this.b;
                    if (X) {
                        h20 a4 = j103.b().d.d.a();
                        a4.l = z2;
                        k20 k20 = new k20(a4);
                        j10 j2 = j103.b().d.j();
                        j2.d = k20;
                        l20 a5 = j2.a();
                        r10 a6 = j103.b().a();
                        a6.e = a5;
                        j103.r = new s10(a6);
                        return;
                    }
                    h20 a7 = j103.c().a();
                    a7.l = z2;
                    j103.d = new k20(a7);
                    return;
                }
                return;
        }
    }

    public void invoke(Object obj) {
        switch (this.a) {
            case 2:
                ((sob) obj).O(this.b);
                return;
            case 3:
                ((sob) obj).j(this.b);
                return;
            case 4:
                ((rob) obj).j(this.b);
                return;
            default:
                ((sob) obj).O(this.b);
                return;
        }
    }

    public boolean isIdle() {
        return CallAnalyticsSender.setIdle$lambda$0(this.b);
    }

    public /* synthetic */ vz0(boolean z, int i) {
        this.a = i;
        this.b = z;
    }
}

package defpackage;

import java.util.Locale;
import ru.ok.messages.stickers.FrgStickersLoader;

/* renamed from: ni6  reason: default package */
public final /* synthetic */ class ni6 implements qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgStickersLoader b;

    public /* synthetic */ ni6(FrgStickersLoader frgStickersLoader, int i) {
        this.a = i;
        this.b = frgStickersLoader;
    }

    public final void accept(Object obj) {
        FrgStickersLoader frgStickersLoader = this.b;
        switch (this.a) {
            case 0:
                a32 a32 = (a32) obj;
                frgStickersLoader.getClass();
                long m = ym.v.c().a.m();
                long j = m - a32.b.A;
                long j2 = a32.a;
                Long valueOf = Long.valueOf(j2);
                m72 m72 = a32.b;
                z68.c("ru.ok.messages.stickers.FrgStickersLoader", "updateStickersFromServer: chatId = %d, chatServerId = %d, now = %d, stickerSyncTime = %d, delta = %d", valueOf, Long.valueOf(m72.a), Long.valueOf(m), Long.valueOf(m72.A), Long.valueOf(j));
                long abs = Math.abs(j);
                kv0.J();
                vpa vpa = kv0.f;
                if (vpa == null) {
                    vpa = null;
                }
                vpa.getClass();
                if (abs >= 3600000) {
                    jna jna = (jna) ((qra) ym.e()).e();
                    long j3 = m;
                    jna.z(jna, new pu(0, ((ltb) jna.D()).a.n(), m72.A, a32.a));
                    r62 g = frgStickersLoader.q1.g();
                    g.getClass();
                    z68.c("r62", "changeStickerSyncTime, chatId = " + j2 + ", time = " + iq.U(Long.valueOf(j3)), new Object[0]);
                    g.i(j2, false, new c10(j3, 9));
                    return;
                }
                return;
            default:
                Throwable th = (Throwable) obj;
                frgStickersLoader.getClass();
                Locale locale = Locale.ENGLISH;
                long j4 = frgStickersLoader.C1;
                z68.e("ru.ok.messages.stickers.FrgStickersLoader", "updateStickersFromServer: chat not found: " + j4);
                return;
        }
    }
}

package defpackage;

import android.os.PowerManager;

/* renamed from: s50  reason: default package */
public final class s50 implements o9c {
    public final /* synthetic */ u50 a;

    public s50(u50 u50) {
        this.a = u50;
    }

    public final void a() {
        u50 u50 = this.a;
        if (!u50.c(u50)) {
            dy9 dy9 = u50.a;
            xy9 xy9 = (xy9) dy9;
            xy9.getClass();
            i30 i30 = new i30(1, 0, 2, 1, 0);
            qo8 qo8 = xy9.o;
            if (qo8 != null) {
                qo8.a0(i30, false);
            }
            p9c p9c = u50.b;
            p9c.getClass();
            try {
                PowerManager.WakeLock wakeLock = p9c.f;
                if (wakeLock != null) {
                    wakeLock.acquire();
                }
            } catch (Exception e) {
                z68.h("ProximityHelperTag", e, e.getMessage(), new Object[0]);
            }
            ((xy9) dy9).v(((Number) ((xy9) dy9).v.a.getValue()).longValue() - 1000);
        }
    }

    public final void b() {
        u50 u50 = this.a;
        if (!u50.c(u50)) {
            dy9 dy9 = u50.a;
            xy9 xy9 = (xy9) dy9;
            xy9.getClass();
            i30 i30 = new i30(1, 0, 1, 1, 0);
            qo8 qo8 = xy9.o;
            if (qo8 != null) {
                qo8.a0(i30, false);
            }
            u50.b.c();
            ((xy9) dy9).q();
        }
    }
}

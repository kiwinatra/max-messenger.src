package defpackage;

import kotlin.jvm.functions.Function0;
import ru.ok.tamtam.android.services.NotificationTamService;

/* renamed from: zea  reason: default package */
public final /* synthetic */ class zea implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationTamService b;

    public /* synthetic */ zea(NotificationTamService notificationTamService, int i) {
        this.a = i;
        this.b = notificationTamService;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                z9f z9f = this.b.a;
                if (z9f == null) {
                    z9f = null;
                }
                return ((sjd) z9f).u();
            case 1:
                NotificationTamService notificationTamService = this.b;
                z9f z9f2 = notificationTamService.a;
                sjd sjd = null;
                if (z9f2 == null) {
                    z9f2 = null;
                }
                q04 b2 = ((osa) ((sjd) z9f2).y()).b();
                z9f z9f3 = notificationTamService.a;
                if (z9f3 != null) {
                    sjd = z9f3;
                }
                return e14.a(b2.plus(new n95(sjd.l())).plus(kr7.b()));
            case 2:
                z9f z9f4 = this.b.a;
                if (z9f4 == null) {
                    z9f4 = null;
                }
                return (qwa) ((sjd) z9f4).o().g.getValue();
            case 3:
                z9f z9f5 = this.b.a;
                if (z9f5 == null) {
                    z9f5 = null;
                }
                return ((sjd) z9f5).g();
            case 4:
                z9f z9f6 = this.b.a;
                if (z9f6 == null) {
                    z9f6 = null;
                }
                return ((a74) ((s74) ((sjd) z9f6).getAccessor().g(s74.class))).b;
            case 5:
                z9f z9f7 = this.b.a;
                if (z9f7 == null) {
                    z9f7 = null;
                }
                return (ysc) ((sjd) z9f7).getAccessor().g(ysc.class);
            case 6:
                z9f z9f8 = this.b.a;
                if (z9f8 == null) {
                    z9f8 = null;
                }
                return (hga) ((sjd) z9f8).o().j.getValue();
            default:
                z9f z9f9 = this.b.a;
                if (z9f9 == null) {
                    z9f9 = null;
                }
                return (qfa) ((sjd) z9f9).o().h.getValue();
        }
    }
}

package defpackage;

import com.my.tracker.ads.AdEvent;
import com.my.tracker.miniapps.MiniAppEvent;
import com.my.tracker.obfuscated.e0;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.tamtam.android.services.NotificationTamService;

/* renamed from: ca2  reason: default package */
public final /* synthetic */ class ca2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ ca2(Object obj, long j, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
        this.o = obj2;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ((ia2) this.c).o(this.b, (a32) this.o);
                return;
            case 1:
                ((sa2) this.c).b.d(this.b, (Collection) this.o);
                return;
            case 2:
                k57 k57 = (k57) this.c;
                if (!k57.y.get()) {
                    long j = this.b;
                    Long valueOf = Long.valueOf(j);
                    String str = (String) this.o;
                    z68.c("l57", "onFileUploadCompleted: completed upload. response =%s, totalBytes=%d", str, valueOf);
                    j57 j57 = new j57(true, str, 100.0f, j);
                    cla cla = k57.x;
                    cla.d(j57);
                    cla.b();
                    k57.a(false);
                    return;
                }
                return;
            case 3:
                NotificationTamService notificationTamService = (NotificationTamService) this.c;
                hs2 c2 = ((f6d) notificationTamService.w.getValue()).c();
                long j2 = this.b;
                NotificationTamService.a(j2, (CharSequence) this.o, notificationTamService, c2.e(j2));
                return;
            case 4:
                eud eud = (eud) this.c;
                List<o41> list = (List) this.o;
                long j3 = this.b;
                synchronized (eud) {
                    for (o41 o41 : list) {
                        ln1 ln1 = o41.a;
                        boolean z = ln1.a == a9g.b;
                        LinkedHashMap linkedHashMap = (LinkedHashMap) eud.o;
                        ue1 ue1 = ln1.b;
                        boolean containsKey = true ^ linkedHashMap.containsKey(ue1);
                        if (z && containsKey) {
                            linkedHashMap.put(ue1, Long.valueOf(j3));
                        }
                    }
                    eud.a(list);
                    Unit unit = Unit.INSTANCE;
                }
                return;
            case 5:
                ((d51) ((c51) ((eud) this.c).b)).c("screen_share_first_frame", EventItemValueKt.toEventItemValue(this.b), new EventItemsMap((Map) this.o));
                return;
            case 6:
                grg grg = ((t6e) this.c).f;
                if (grg != null) {
                    ((CopyOnWriteArraySet) grg.b).add(new ksg(this.b, (mq9) this.o));
                    return;
                }
                return;
            case 7:
                npg npg = (npg) this.c;
                npg.getClass();
                int i = t0g.a;
                sc5 sc5 = ((mc5) npg.c).a;
                vb4 vb4 = sc5.z0;
                sd P = vb4.P();
                Object obj = this.o;
                vb4.Q(P, 26, new dr1(P, obj, this.b));
                if (sc5.U0 == obj) {
                    sc5.Z.r(26, new lw4(12));
                    return;
                }
                return;
            case 8:
                m8g m8g = (m8g) this.c;
                m8g.getClass();
                int i2 = v0g.a;
                tc5 tc5 = ((nc5) m8g.b).a;
                wb4 wb4 = tc5.A0;
                td J = wb4.J();
                Object obj2 = this.o;
                wb4.K(J, 26, new u52((Object) J, obj2, this.b, 5));
                if (tc5.Y0 == obj2) {
                    tc5.Z.m(26, new lw4(13));
                    return;
                }
                return;
            case 9:
                ((e0) this.c).a((MiniAppEvent) this.o, this.b);
                return;
            case 10:
                ((e0) this.c).a((String) this.o, this.b);
                return;
            default:
                ((e0) this.c).a((AdEvent) this.o, this.b);
                return;
        }
    }

    public /* synthetic */ ca2(Object obj, Object obj2, long j, int i) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.b = j;
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.KProperty;

/* renamed from: hga  reason: default package */
public final class hga {
    public static final mz4 d = new Object();
    public static final /* synthetic */ KProperty[] e;
    public static final String f;
    public final hs7 a;
    public final hs7 b;
    public final hs7 c;

    /* JADX WARNING: type inference failed for: r1v4, types: [mz4, java.lang.Object] */
    static {
        Class<hga> cls = hga.class;
        e = new KProperty[]{wj6.p(cls, "fcmAnalyticsRepository", "getFcmAnalyticsRepository()Lru/ok/tamtam/android/notifications/messages/newpush/fcm/analytics/FcmAnalyticsRepository;", 0), wj6.p(cls, "notificationsTrackerListener", "getNotificationsTrackerListener()Lru/ok/tamtam/android/notifications/messages/tracker/NotificationsTrackerListener;", 0), wj6.p(cls, "notificationsTrackerMessagesRepository", "getNotificationsTrackerMessagesRepository()Lru/ok/tamtam/android/notifications/messages/tracker/storage/NotificationsTrackerMessagesRepository;", 0)};
        f = cls.getName();
    }

    public hga(hs7 hs7, hs7 hs72, hs7 hs73) {
        this.a = hs7;
        this.b = hs72;
        this.c = hs73;
    }

    public final List a(List list) {
        return (List) new hce(new tbe(new wbe(b().a.n().i(pf6.v), new ej5(0, list), 0), gga.X, 1), new q0a(21), (List) null).f();
    }

    public final gj5 b() {
        KProperty kProperty = e[0];
        return (gj5) this.a.get();
    }

    public final iga c() {
        KProperty kProperty = e[1];
        return (iga) this.b.get();
    }

    public final pga d() {
        KProperty kProperty = e[2];
        return (pga) this.c.get();
    }

    public final void e(List list, List list2, boolean z) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            cj5 cj5 = (cj5) it.next();
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                lga lga = (lga) obj;
                if (lga.a == cj5.b && lga.b == cj5.c) {
                    break;
                }
            }
            lga lga2 = (lga) obj;
            if (lga2 != null) {
                boolean z2 = lga2 instanceof kga;
                String str = f;
                long j = lga2.a;
                long j2 = lga2.b;
                if (z2) {
                    StringBuilder n = tr1.n(j2, "onMessagesProcessed: show, messageId=", ", chatId=");
                    n.append(j);
                    z68.c(str, n.toString(), new Object[0]);
                    boolean z3 = ((kga) lga2).d;
                    if (z3 && !z) {
                        r8e[] r8eArr = r8e.a;
                    } else if (z3 || !z) {
                        r8e[] r8eArr2 = r8e.a;
                    } else {
                        r8e[] r8eArr3 = r8e.a;
                    }
                    iga c2 = c();
                    c2.getClass();
                    try {
                        if (cj5.k.length() != 0) {
                            HashMap hashMap = new HashMap();
                            iga.a(hashMap, cj5);
                            hashMap.put("p_op", "show");
                            c2.b().a(cj5.k, hashMap);
                        }
                    } catch (Exception e2) {
                        z68.f(iga.d, "onNotificationShow: failed", e2);
                        ((uta) c2.c()).c(new Exception("failed to log notification show", e2), true);
                    }
                    djd djd = hj5.b;
                    arrayList.add(cj5.a(cj5));
                } else if (lga2 instanceof jga) {
                    StringBuilder n2 = tr1.n(j2, "onMessagesProcessed: drop, messageId=", ", chatId=");
                    n2.append(j);
                    n2.append(", reason=");
                    hx4 hx4 = ((jga) lga2).d;
                    n2.append(hx4);
                    z68.c(str, n2.toString(), new Object[0]);
                    iga c3 = c();
                    c3.getClass();
                    try {
                        if (cj5.k.length() != 0) {
                            HashMap hashMap2 = new HashMap();
                            iga.a(hashMap2, cj5);
                            hashMap2.put("p_op", "drop");
                            hashMap2.put("p_dr", hx4.a);
                            c3.b().a(cj5.k, hashMap2);
                        }
                    } catch (Exception e3) {
                        z68.f(iga.d, "onNotificationShow: failed", e3);
                        ((uta) c3.c()).c(new Exception("failed to log notification drop", e3), true);
                    }
                    djd djd2 = hj5.b;
                    arrayList.add(cj5.a(cj5));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        if (!arrayList.isEmpty()) {
            new na3(new na3(4, b().a.n().i(pf6.v), new fj5(arrayList, 0)).h(dbe.v)).a();
        }
    }

    public final synchronized void f(long j, long j2) {
        List list = (List) new hce(new tbe(new wbe(b().a.n().i(pf6.v), new ap0(5, j, j2), 0), nfd.z, 1), new q0a(19), (List) null).f();
        int intValue = ((Number) new hce(new tbe(new wbe(d().b(), new ej5(4, list), 0), ekd.w, 1), new q0a(20), (List) null).f()).intValue();
        String str = f;
        int size = list.size();
        z68.c(str, "onSelfReadMarkChanged: removed " + size + " analyticsEntries, " + intValue + " trackerMessages entries", new Object[0]);
    }
}

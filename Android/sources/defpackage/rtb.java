package defpackage;

import android.content.Context;
import androidx.work.WorkRequest;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.reflect.KProperty;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: rtb  reason: default package */
public final class rtb implements gxd {
    public static final /* synthetic */ KProperty[] l = {rae.s(rtb.class, "presencesJob", "getPresencesJob()Lkotlinx/coroutines/Job;", 0)};
    public final sv0 a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final jx3 h;
    public final n6e i = m5a.b(0, 0, (cu0) null, 7);
    public final wie j = o5a.U();
    public final AtomicBoolean k = new AtomicBoolean(false);

    public rtb(Lazy lazy, Lazy lazy2, Lazy lazy3, sv0 sv0, Lazy lazy4, Lazy lazy5, gaf gaf, Lazy lazy6) {
        this.a = sv0;
        this.b = lazy;
        this.c = lazy2;
        this.d = lazy3;
        this.e = lazy6;
        this.f = lazy4;
        this.g = lazy5;
        this.h = e14.a(((osa) gaf).a());
    }

    public final CharSequence a(long j2, boolean z, boolean z2, mtb mtb) {
        Lazy lazy = this.c;
        if (!z2) {
            return ((yva) lazy.getValue()).a.getString(jad.e);
        }
        if (e().g(j2)) {
            return ((yva) lazy.getValue()).f();
        }
        if (mtb == null) {
            mtb = e().b(j2);
        }
        int i2 = mtb.b;
        if (!z) {
            return ((yva) lazy.getValue()).d(((long) i2) * 1000);
        }
        yva yva = (yva) lazy.getValue();
        a33 a33 = yva.c;
        p01 z3 = j4b.z(((long) i2) * 1000, a33.m());
        Locale u = a33.u();
        String[] strArr = ghf.c;
        int i3 = z3.b;
        int y = tr1.y(i3);
        Context context = yva.a;
        long j3 = z3.c;
        switch (y) {
            case 0:
                return context.getString(tmc.tt_dates_right_now);
            case 1:
                return context.getString(tmc.tt_dates_minutes_last_seen, new Object[]{Integer.valueOf((int) j3)});
            case 2:
                return context.getString(tmc.tt_dates_hours_last_seen, new Object[]{Integer.valueOf((int) j3)});
            case 3:
                return j3 == 0 ? context.getString(tmc.tt_dates_yesterday_at_last_seen_no_time) : String.format(context.getString(tmc.tt_dates_yesterday_at), new Object[]{j4b.s(context, j3, u)});
            case 4:
                return context.getString(tmc.tt_dates_days_last_seen, new Object[]{Integer.valueOf((int) j3)});
            case 5:
                return context.getString(tmc.tt_dates_weeks_last_seen, new Object[]{Integer.valueOf((int) j3)});
            case 6:
                return context.getString(tmc.tt_dates_months_last_seen, new Object[]{Integer.valueOf((int) j3)});
            case 7:
            case 8:
                return context.getString(tmc.tt_dates_full_last_seen_u, new Object[]{j4b.B(u, j3, tr1.c(i3, 8))});
            case 9:
                return context.getString(tmc.presence_unknown_date);
            default:
                return "";
        }
    }

    public final CharSequence b(bj2 bj2) {
        long j2 = bj2.a.a;
        vk3 n = ((km3) ((gjd) this.e.getValue()).a.g(km3.class)).n(bj2.a.a, false);
        boolean z = n != null && n.c();
        ntb ntb = bj2.b;
        return a(j2, true, z, ntb != null ? qe8.l(ntb) : null);
    }

    public final void c(int i2) {
        AtomicBoolean atomicBoolean = this.k;
        if (i2 != 1) {
            atomicBoolean.set(true);
        } else if (atomicBoolean.get()) {
            h();
            atomicBoolean.set(false);
        }
    }

    public final CharSequence d(vk3 vk3, boolean z) {
        return a(vk3.r(), z, vk3.c(), (mtb) null);
    }

    public final ptb e() {
        return (ptb) this.b.getValue();
    }

    public final x23 f() {
        return (x23) this.d.getValue();
    }

    public final pm7 g() {
        return (pm7) this.j.getValue(this, l[0]);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [qae, java.util.Map] */
    public final void h() {
        z68.c("PresenceController", "moveOnlineToLastSeen", new Object[0]);
        ? qae = new qae(0);
        int m = (int) (((qjd) f()).m() / 1000);
        Iterator it = ((os) e().d().entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            long longValue = ((Number) entry.getKey()).longValue();
            if (((mtb) entry.getValue()).a != 0) {
                qae.put(Long.valueOf(longValue), new mtb(0, m));
            }
        }
        i(0, qae);
    }

    public final void i(long j2, Map map) {
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, "PresenceController", wj6.h(map.size(), "onContactPresence, presence.count() = "), (Throwable) null);
        }
        if (!map.isEmpty()) {
            l(map);
            if (j2 > 0) {
                qjd qjd = (qjd) f();
                if (j2 > qjd.e("user.presenceLastSync", 0)) {
                    qjd.k("user.presenceLastSync", Long.valueOf(j2));
                }
            }
        }
    }

    public final void j(HashMap hashMap, long j2) {
        if (!hashMap.containsKey(Long.valueOf(((qjd) f()).s()))) {
            hashMap.put(Long.valueOf(((qjd) f()).s()), mtb.d);
        }
        i(j2, hashMap);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [qae, java.util.Map] */
    public final void k(cca cca) {
        int i2;
        pm7 g2;
        pm7 g3;
        ConcurrentHashMap concurrentHashMap = e().o;
        if (concurrentHashMap.isEmpty()) {
            i2 = 0;
        } else {
            i2 = 0;
            for (Map.Entry value : concurrentHashMap.entrySet()) {
                if (((tz9) value.getValue()).getValue() != null) {
                    i2++;
                }
            }
        }
        long j2 = i2 < 500 ? 0 : i2 < 1000 ? MultiFileUploader.UPLOAD_NEXT_INTERVAL : WorkRequest.MIN_BACKOFF_MILLIS;
        if (j2 > 0 && (g() == null || ((g3 = g()) != null && !g3.isActive()))) {
            this.j.setValue(this, l[0], ev0.v(this.h, (CoroutineContext) null, f14.b, new qtb(this, j2, (Continuation) null), 1));
        }
        if (g() == null || (g2 = g()) == null || !g2.isActive()) {
            List<cca> listOf = CollectionsKt.listOf(cca);
            if (!listOf.isEmpty()) {
                a67 a67 = z68.b;
                if (a67 != null && a67.c()) {
                    a67.d(w78.o, "PresenceController", "onNotifPresence: " + listOf + ".size", (Throwable) null);
                }
                ? qae = new qae(listOf.size());
                long j3 = 0;
                for (cca cca2 : listOf) {
                    qae.put(Long.valueOf(cca2.c), qe8.l(cca2.o));
                    long j4 = cca2.v;
                    if (j4 > j3) {
                        j3 = j4;
                    }
                }
                qjd qjd = (qjd) f();
                if (j3 > qjd.e("user.presenceLastSync", 0)) {
                    qjd.k("user.presenceLastSync", Long.valueOf(j3));
                }
                l(qae);
                return;
            }
            return;
        }
        z68.c("PresenceController", "onNotifPresence: post to subject", new Object[0]);
        this.i.d(cca);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [qae, java.util.Map] */
    public final void l(Map map) {
        if (!this.k.get()) {
            ? qae = new qae(map.size());
            for (Map.Entry entry : map.entrySet()) {
                qae.put(Long.valueOf(((Number) entry.getKey()).longValue()), new mtb(0, ((mtb) entry.getValue()).b));
            }
            map = qae;
        }
        ptb e2 = e();
        e2.getClass();
        jz9 jz9 = new jz9(map.size());
        for (Map.Entry entry2 : map.entrySet()) {
            long longValue = ((Number) entry2.getKey()).longValue();
            jz9.e(longValue);
            e2.h(longValue, (mtb) entry2.getValue());
        }
        ((Executor) e2.c.getValue()).execute(new sx8(25, e2, jz9));
        this.a.c(new zu3((Collection) map.keySet()));
    }
}

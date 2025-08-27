package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import androidx.work.impl.model.WorkersQueueDao;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: ipg  reason: default package */
public final class ipg {
    public static final /* synthetic */ KProperty[] n;
    public static final String o;
    public final Context a;
    public final lfd b;
    public final lfd c;
    public final bud d;
    public final om0 e = om0.I(Boolean.TRUE);
    public final hs7 f;
    public final Set g;
    public final Lazy h;
    public volatile mq4 i;
    public volatile boolean j;
    public final Lazy k;
    public final nia l;
    public volatile int m;

    static {
        Class<ipg> cls = ipg.class;
        n = new KProperty[]{wj6.p(cls, "workersQueueDao", "getWorkersQueueDao$tamtam_android_sdk_release()Landroidx/work/impl/model/WorkersQueueDao;", 0)};
        o = cls.getName();
    }

    public ipg(Context context, lfd lfd, lfd lfd2, hs7 hs7, bud bud, hs7 hs72) {
        this.a = context;
        this.b = lfd;
        this.c = lfd2;
        this.d = bud;
        this.f = hs7;
        this.g = SetsKt.setOf("ru.ok.tamtam.", "ru.ok.messages.");
        this.h = LazyKt.lazy(new fpg(0, hs72, this));
        this.k = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new lce(23, this));
        this.l = new nia(new yia(new mha(new cia(new ti5(1, this), 0).x(lfd).s(lfd), gga.Y, 1), new ch2(26, this), 3));
        this.m = 999;
        d();
    }

    public static bv1 e(ipg ipg, String str, int i2, icb icb, boolean z, int i3) {
        if ((i3 & 16) != 0) {
            z = false;
        }
        if (ipg.m < ipg.f()) {
            z68.c(o, "enqueueUniquePeriodicWork %s", str);
            ipg.m++;
            ipg.h().b(str, i2, icb);
            return new bv1(false, 3);
        }
        z68.n(o, (IOException) null, "enqueueUniquePeriodicWork: put %s in backlog", Arrays.copyOf(new Object[]{str}, 1));
        hqg hqg = new hqg(str, i2 == 2 ? fb5.b : fb5.a, icb);
        ipg.a(hqg, z);
        apg h2 = ipg.h();
        akd akd = (akd) ipg.d;
        akd.getClass();
        i8b.S(h2, Integer.valueOf(RangesKt.coerceAtLeast((int) akd.r(PmsKey.f124wmbacklogworkerbackoffdelaysec, (long) 10), 1)), hqg).v();
        return new bv1(true, 3);
    }

    public final void a(hqg hqg, boolean z) {
        if (z || Intrinsics.areEqual((Object) Looper.getMainLooper(), (Object) Looper.myLooper())) {
            this.c.c(new l8g(5, this, hqg));
            return;
        }
        try {
            g().insert(hqg);
        } catch (Throwable th) {
            z68.h(o, th, "fail to add item %s", hqg.b);
        }
    }

    public final sv7 b(String str, fb5 fb5, w3b w3b, boolean z) {
        if (z || this.m < f()) {
            String str2 = o;
            z68.c(str2, "beginUniqueWork %s", str);
            if (z) {
                z68.n(str2, (IOException) null, "ATTENTION! run NOT LIMITED WORK %s", Arrays.copyOf(new Object[]{str}, 1));
            }
            this.m++;
            apg h2 = h();
            h2.getClass();
            List singletonList = Collections.singletonList(w3b);
            dpg dpg = (dpg) h2;
            if (!singletonList.isEmpty()) {
                return new sv7(false, new rog(dpg, str, fb5, singletonList));
            }
            throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
        }
        z68.n(o, (IOException) null, "beginUniqueWork: put %s in backlog", Arrays.copyOf(new Object[]{str}, 1));
        hqg hqg = new hqg(str, fb5, w3b);
        a(hqg, false);
        apg h3 = h();
        akd akd = (akd) this.d;
        akd.getClass();
        return new sv7(true, i8b.S(h3, Integer.valueOf(RangesKt.coerceAtLeast((int) akd.r(PmsKey.f124wmbacklogworkerbackoffdelaysec, (long) 10), 1)), hqg));
    }

    public final void c(String str) {
        z68.c(o, "cancelUniqueWork %s", str);
        dpg dpg = (dpg) h();
        dpg.getClass();
        dpg.d.h(new fw1(dpg, str, true));
    }

    public final void d() {
        z68.c(o, "enableWorkManager", new Object[0]);
        this.e.d(Boolean.TRUE);
        if (!this.j) {
            nia nia = this.l;
            syc syc = new syc(12, this);
            v9a v9a = v9a.y;
            nia.getClass();
            nia.l(new ao1(3, syc, v9a));
        }
    }

    public final int f() {
        bud bud = this.d;
        akd akd = (akd) bud;
        akd.getClass();
        int coerceAtLeast = RangesKt.coerceAtLeast((int) akd.r(PmsKey.f127wmworkerslimit, (long) 16), 1);
        akd akd2 = (akd) bud;
        akd2.getClass();
        return RangesKt.coerceAtLeast(coerceAtLeast - RangesKt.coerceAtLeast((int) akd2.r(PmsKey.f128wmworkersoffset, (long) 2), 0), 1);
    }

    public final WorkersQueueDao g() {
        KProperty kProperty = n[0];
        return (WorkersQueueDao) this.f.get();
    }

    public final apg h() {
        return (apg) this.k.getValue();
    }

    public final void i(apg apg) {
        int i2 = 0;
        mq4 mq4 = this.i;
        if (mq4 != null) {
            mq4.dispose();
        }
        String p = CollectionsKt___CollectionsKt.joinToString$default(this.g, " OR ", "(", ")", 0, (CharSequence) null, new epg(0), 24, (Object) null);
        af6 readableDatabase = ((dpg) apg).c.h().getReadableDatabase();
        Cursor r0 = readableDatabase.r0("SELECT COUNT(*) FROM workspec WHERE " + p + " AND state=0 AND schedule_requested_at<>-1");
        try {
            r0.moveToFirst();
            Integer valueOf = r0.isNull(0) ? null : Integer.valueOf(r0.getInt(0));
            if (valueOf != null) {
                i2 = valueOf.intValue();
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(r0, (Throwable) null);
            this.m = i2;
            z68.c(o, "scheduleWorkersCountChecking: workersCount = %d", Integer.valueOf(this.m));
            kpg kpg = (kpg) this.h.getValue();
            int i3 = this.m;
            akd akd = (akd) kpg.a;
            akd.getClass();
            if (akd.m(PmsKey.f123wmanalyticsenabled, akd.h) && kpg.b != i3) {
                kpg.b = i3;
                kpg.c.a();
            }
            lfd lfd = this.b;
            l8g l8g = new l8g(4, this, apg);
            akd akd2 = (akd) this.d;
            akd2.getClass();
            this.i = lfd.d(l8g, (long) RangesKt.coerceAtLeast((int) akd2.r(PmsKey.f126wmcheckworkerscountintervalsec, (long) 10), 1), TimeUnit.SECONDS);
        } catch (Throwable th) {
            CloseableKt.closeFinally(r0, th);
            throw th;
        }
    }
}

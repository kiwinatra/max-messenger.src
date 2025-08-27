package defpackage;

import android.os.FileUriExposedException;
import android.os.SystemClock;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.reflect.KProperty;

/* renamed from: z84  reason: default package */
public final class z84 {
    public static final /* synthetic */ KProperty[] j;
    public static final String k;
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final wie e = o5a.U();
    public final jx3 f;
    public w84 g;
    public long h;
    public final AtomicInteger i;

    static {
        Class<z84> cls = z84.class;
        j = new KProperty[]{rae.s(cls, "notifyJob", "getNotifyJob()Lkotlinx/coroutines/Job;", 0)};
        k = cls.getName();
    }

    public z84(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
        this.f = e14.a(((osa) ((gaf) lazy5.getValue())).a().s0(1, "notifs"));
        this.g = w84.f;
        this.i = new AtomicInteger(0);
    }

    public final void a(w84 w84) {
        String str = k;
        z68.c(str, "dispatch: " + w84, new Object[0]);
        try {
            boolean z = w84.c;
            Lazy lazy = this.a;
            if (z) {
                ((po9) ((mo9) lazy.getValue())).g();
                return;
            }
            HashSet hashSet = w84.e;
            if (!hashSet.isEmpty()) {
                ((po9) ((mo9) lazy.getValue())).h(hashSet);
            }
        } catch (Throwable th) {
            if (w84.a || !(th instanceof FileUriExposedException)) {
                z68.f("DebounceNotificationDispatcher", "failure", th);
                ((uta) ((m95) this.b.getValue())).c(th, false);
                return;
            }
            z68.c(str, "dispatch: FileUriExposedException, change ringtone uri to default", new Object[0]);
            hq hqVar = (hq) ((fq) this.d.getValue());
            hqVar.l("app.notification.ringtone", (String) null);
            hqVar.l("app.notification.chats.ringtone", (String) null);
            a(new w84(true, w84.b, w84.e, w84.c, w84.d));
        }
    }

    public final void b(x6 x6Var) {
        ev0.v(this.f, (CoroutineContext) null, (f14) null, new x84(this, x6Var, (Continuation) null), 3);
    }

    public final void c(w84 w84) {
        w84 w842 = w84;
        Lazy lazy = this.c;
        ((fn4) lazy.getValue()).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.h;
        int i2 = (elapsedRealtime > 2000 ? 1 : (elapsedRealtime == 2000 ? 0 : -1));
        KProperty[] kPropertyArr = j;
        wie wie = this.e;
        if (i2 >= 0 || w842.b) {
            a(w84);
            ((fn4) lazy.getValue()).getClass();
            this.h = SystemClock.elapsedRealtime();
            this.g = w84.f;
            wie.setValue(this, kPropertyArr[0], (Object) null);
            return;
        }
        z68.c(k, "notifyOrDelay: delay, params = %s", w84);
        w84 w843 = this.g;
        Set plus = SetsKt.plus(w843.e, w842.e);
        boolean z = w843.c && w842.c;
        mj5 mj5 = w842.d;
        if (mj5 == null) {
            mj5 = w843.d;
        }
        this.g = new w84(w843.a, w843.b, plus, z, mj5);
        if (((pm7) wie.getValue(this, kPropertyArr[0])) == null) {
            wie.setValue(this, kPropertyArr[0], ev0.v(this.f, (CoroutineContext) null, (f14) null, new y84(2000 - elapsedRealtime, this, (Continuation) null), 3));
        }
    }
}

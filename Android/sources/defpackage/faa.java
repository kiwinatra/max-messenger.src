package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.reflect.KProperty;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: faa  reason: default package */
public final class faa extends haa {
    public static final /* synthetic */ KProperty[] i = {rae.s(faa.class, "job", "getJob()Lkotlinx/coroutines/Job;", 0)};
    public final jz9 e = new jz9((Object) null);
    public final ReentrantLock f = new ReentrantLock();
    public final wie g = o5a.U();
    public long h = Duration.Companion.m1456getZEROUwyO8pc();

    public faa(d14 d14, Lazy lazy) {
        super(d14, lazy);
        a();
        this.c = ev0.v(d14, (CoroutineContext) null, (f14) null, new eaa(this, (Continuation) null), 3);
    }

    public final void d() {
        jz9 jz9 = this.e;
        if (e()) {
            ReentrantLock reentrantLock = this.f;
            reentrantLock.lock();
            try {
                int i2 = jz9.d;
                cud cud = ((ltb) ((jtb) this.b.getValue())).b;
                cud.getClass();
                if (i2 >= ((int) cud.r(PmsKey.f90noncontactmaxchunksize, (long) 10))) {
                    Duration.Companion companion = Duration.Companion;
                    long duration = DurationKt.toDuration(System.nanoTime(), DurationUnit.NANOSECONDS);
                    if (Duration.m1352compareToLRDsOJo(Duration.m1388minusLRDsOJo(duration, this.h), b()) <= 0) {
                        reentrantLock.unlock();
                        return;
                    }
                    this.h = duration;
                    jz9 a = wa8.a(jz9);
                    jz9.g();
                    this.g.setValue(this, i[0], ev0.v(this.a, (CoroutineContext) null, f14.b, new daa(this, a, (Continuation) null), 1));
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean e() {
        if (Duration.m1352compareToLRDsOJo(b(), Duration.Companion.m1456getZEROUwyO8pc()) > 0) {
            cud cud = ((ltb) ((jtb) this.b.getValue())).b;
            cud.getClass();
            if (((int) cud.r(PmsKey.f90noncontactmaxchunksize, (long) 10)) > 0) {
                return true;
            }
        }
        return false;
    }
}

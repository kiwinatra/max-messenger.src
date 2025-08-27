package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;

/* renamed from: i6d  reason: default package */
public abstract class i6d {
    public volatile af6 a;
    public Executor b;
    public qn c;
    public f3f d;
    public final uj7 e = e();
    public boolean f;
    public List g;
    public final LinkedHashMap h = new LinkedHashMap();
    public final ReentrantReadWriteLock i = new ReentrantReadWriteLock();
    public final ThreadLocal j = new ThreadLocal();
    public final Map k = Collections.synchronizedMap(new LinkedHashMap());
    public final LinkedHashMap l = new LinkedHashMap();

    public static Object s(Class cls, f3f f3f) {
        if (cls.isInstance(f3f)) {
            return f3f;
        }
        if (f3f instanceof kl4) {
            return s(cls, ((kl4) f3f).getDelegate());
        }
        return null;
    }

    public void a() {
        if (!this.f) {
            if (!(!(Looper.getMainLooper().getThread() == Thread.currentThread()))) {
                throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
            }
        }
    }

    public final void b() {
        if (!k() && this.j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    public final void c() {
        a();
        a();
        af6 writableDatabase = h().getWritableDatabase();
        this.e.f(writableDatabase);
        if (writableDatabase.m0()) {
            writableDatabase.n();
        } else {
            writableDatabase.m();
        }
    }

    public final gf6 d(String str) {
        a();
        b();
        return h().getWritableDatabase().o(str);
    }

    public abstract uj7 e();

    public abstract f3f f(t74 t74);

    public List g() {
        return CollectionsKt.emptyList();
    }

    public final f3f h() {
        f3f f3f = this.d;
        if (f3f == null) {
            return null;
        }
        return f3f;
    }

    public Set i() {
        return SetsKt.emptySet();
    }

    public Map j() {
        return MapsKt.emptyMap();
    }

    public final boolean k() {
        return h().getWritableDatabase().k0();
    }

    public final void l() {
        h().getWritableDatabase().U();
        if (!k()) {
            uj7 uj7 = this.e;
            if (uj7.f.compareAndSet(false, true)) {
                Executor executor = uj7.a.b;
                if (executor == null) {
                    executor = null;
                }
                executor.execute(uj7.n);
            }
        }
    }

    public final void m(af6 af6) {
        uj7 uj7 = this.e;
        synchronized (uj7.m) {
            if (!uj7.g) {
                af6.V("PRAGMA temp_store = MEMORY;");
                af6.V("PRAGMA recursive_triggers='ON';");
                af6.V("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                uj7.f(af6);
                uj7.h = af6.o("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
                uj7.g = true;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final boolean n() {
        af6 af6 = this.a;
        return af6 != null && af6.isOpen();
    }

    public final Cursor o(h3f h3f, CancellationSignal cancellationSignal) {
        a();
        b();
        return cancellationSignal != null ? h().getWritableDatabase().q0(h3f, cancellationSignal) : h().getWritableDatabase().p0(h3f);
    }

    public final Object p(Callable callable) {
        c();
        try {
            Object call = callable.call();
            r();
            return call;
        } finally {
            l();
        }
    }

    public final void q(Runnable runnable) {
        c();
        try {
            runnable.run();
            r();
        } finally {
            l();
        }
    }

    public final void r() {
        h().getWritableDatabase().s0();
    }
}

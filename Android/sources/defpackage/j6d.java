package defpackage;

import android.content.Context;
import java.io.Closeable;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: j6d  reason: default package */
public abstract class j6d implements Closeable {
    public final Context a;
    public final Class b = OneMeRoomDatabase.class;
    public final String c = "cache.db";
    public final aua o;
    public final Object[] v;
    public final Lazy w;

    public j6d(Context context, aua aua, Object[] objArr) {
        this.a = context;
        this.o = aua;
        this.v = objArr;
        this.w = LazyKt.lazy(new ifb(16, this));
    }

    public final void close() {
        if (this.w.isInitialized()) {
            i6d i6d = (i6d) this.w.getValue();
            af6 af6 = i6d.a;
            Boolean bool = null;
            if (af6 != null) {
                bool = Boolean.valueOf(af6.isOpen());
            }
            if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
                ReentrantReadWriteLock.WriteLock writeLock = i6d.i.writeLock();
                writeLock.lock();
                try {
                    uj7 uj7 = i6d.e;
                    uj7.getClass();
                    uj7.getClass();
                    i6d.h().close();
                } finally {
                    writeLock.unlock();
                }
            }
        }
    }

    public final i6d m() {
        return (i6d) this.w.getValue();
    }

    public final mka n() {
        return new mka(2, new h5(18, this));
    }
}

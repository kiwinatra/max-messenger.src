package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: f6d  reason: default package */
public final class f6d {
    public static final oj4 g = new oj4(22);
    public final j6d a;
    public final Lazy b = LazyKt.lazy(new d6d(this, 0));
    public final Lazy c = LazyKt.lazy(new d6d(this, 1));
    public final Lazy d = LazyKt.lazy(new d6d(this, 2));
    public final Lazy e;
    public final Lazy f;

    public f6d(j6d j6d, Lazy lazy) {
        this.a = j6d;
        this.e = lazy;
        this.f = LazyKt.lazy(gy3.Z);
    }

    public final n72 a(n82 n82) {
        ConcurrentHashMap concurrentHashMap = ((qi6) this.f.getValue()).a;
        long j = n82.a;
        m72 m72 = n82.c;
        String str = m72.g;
        if (str != null) {
            concurrentHashMap.put(Long.valueOf(j), str);
        }
        return new n72(n82.a, m72);
    }

    /* JADX INFO: finally extract failed */
    public final void b() {
        hs2 c2 = c();
        i6d i6d = c2.a;
        i6d.c();
        try {
            hs2.b(c2);
            i6d.r();
            i6d.l();
            ((qi6) this.f.getValue()).a.clear();
            ddd ddd = (ddd) this.c.getValue();
            i6d i6d2 = ddd.a;
            i6d2.b();
            t5d t5d = ddd.d;
            gf6 E = t5d.E();
            try {
                i6d2.c();
                E.n();
                i6d2.r();
                i6d2.l();
                t5d.S(E);
            } catch (Throwable th) {
                t5d.S(E);
                throw th;
            }
        } catch (Throwable th2) {
            i6d.l();
            throw th2;
        }
    }

    public final hs2 c() {
        return (hs2) this.b.getValue();
    }

    public final long d(m72 m72) {
        return ((Number) ((OneMeRoomDatabase) this.a.m()).p(new e6d(0, new vra(15, this, m72)))).longValue();
    }

    public final n72 e(long j) {
        n82 n82;
        hs2 c2 = c();
        c2.getClass();
        d7d a2 = d7d.a(1, "SELECT * FROM chats WHERE server_id = ?");
        a2.k(1, j);
        i6d i6d = c2.a;
        i6d.b();
        Cursor o = i6d.o(a2, (CancellationSignal) null);
        try {
            int u = kne.u(o, "id");
            int u2 = kne.u(o, "server_id");
            int u3 = kne.u(o, "data");
            int u4 = kne.u(o, "favourite_index");
            int u5 = kne.u(o, "sort_time");
            int u6 = kne.u(o, "cid");
            if (o.moveToFirst()) {
                n82 = new n82(o.getLong(u), o.getLong(u2), c2.a().a(o.isNull(u3) ? null : o.getBlob(u3)), o.getLong(u4), o.getLong(u5), o.getLong(u6));
            } else {
                n82 = null;
            }
            if (n82 != null) {
                return a(n82);
            }
            return null;
        } finally {
            o.close();
            a2.o();
        }
    }

    /* JADX INFO: finally extract failed */
    public final n72 f(long j) {
        Object obj;
        hs2 c2 = c();
        c2.getClass();
        d7d a2 = d7d.a(1, "SELECT * FROM chats WHERE cid = ?");
        a2.k(1, j);
        i6d i6d = c2.a;
        i6d.b();
        Cursor o = i6d.o(a2, (CancellationSignal) null);
        try {
            int u = kne.u(o, "id");
            int u2 = kne.u(o, "server_id");
            int u3 = kne.u(o, "data");
            int u4 = kne.u(o, "favourite_index");
            int u5 = kne.u(o, "sort_time");
            int u6 = kne.u(o, "cid");
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                arrayList.add(new n82(o.getLong(u), o.getLong(u2), c2.a().a(o.isNull(u3) ? null : o.getBlob(u3)), o.getLong(u4), o.getLong(u5), o.getLong(u6)));
            }
            o.close();
            a2.o();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((n82) obj).c.b == l72.a) {
                    break;
                }
            }
            n82 n82 = (n82) obj;
            if (n82 != null) {
                return a(n82);
            }
            return null;
        } catch (Throwable th) {
            o.close();
            a2.o();
            throw th;
        }
    }

    public final void g(long j, m72 m72) {
        m72 m722 = m72;
        long d2 = c().d(new n82(j, m722.a, m72, m72.a().e, hi7.o(((aj9) this.d.getValue()).k(m722.j), m722), m722.l), ((qi6) this.f.getValue()).a);
        Lazy lazy = this.e;
        if (m722.h(((cjd) lazy.getValue()).a())) {
            ((ddd) this.c.getValue()).a(((cjd) lazy.getValue()).a(), d2);
        }
    }
}

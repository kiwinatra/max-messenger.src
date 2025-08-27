package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;

/* renamed from: c7d  reason: default package */
public final class c7d {
    public final j6d a;
    public final Lazy b = LazyKt.lazy(new ifb(18, this));

    public c7d(j6d j6d) {
        this.a = j6d;
    }

    public static ydb b(c7d c7d, xdb xdb) {
        c7d.getClass();
        return new ydb(xdb.b, xdb.c, xdb.o, xdb.v, xdb.w, xdb.x, xdb.y, xdb.z, xdb.X, xdb.Y);
    }

    public static xdb d(ydb ydb) {
        long j = ydb.a;
        int y = tr1.y(ydb.j);
        return new xdb(j, ydb.b, ydb.c, ydb.d, ydb.e, ydb.f, ydb.g, ydb.h, ydb.i, y);
    }

    public final void a() {
        ueb c = c();
        i6d i6d = c.a;
        i6d.b();
        uf9 uf9 = c.e;
        gf6 E = uf9.E();
        try {
            i6d.c();
            E.n();
            i6d.r();
            i6d.l();
            uf9.S(E);
        } catch (Throwable th) {
            uf9.S(E);
            throw th;
        }
    }

    public final ueb c() {
        return (ueb) this.b.getValue();
    }

    /* JADX INFO: finally extract failed */
    public final ArrayList e() {
        ueb c = c();
        c.getClass();
        d7d a2 = d7d.a(0, "SELECT * FROM phones");
        i6d i6d = c.a;
        i6d.b();
        Cursor o = i6d.o(a2, (CancellationSignal) null);
        try {
            int u = kne.u(o, "id");
            int u2 = kne.u(o, "phonebook_id");
            int u3 = kne.u(o, "contact_id");
            int u4 = kne.u(o, "phone");
            int u5 = kne.u(o, "server_phone");
            int u6 = kne.u(o, "email");
            int u7 = kne.u(o, "first_name");
            int u8 = kne.u(o, "last_name");
            int u9 = kne.u(o, "avatar_path");
            int u10 = kne.u(o, "type");
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                arrayList.add(new ydb(o.getLong(u), o.getLong(u2), o.getInt(u3), o.isNull(u4) ? null : o.getString(u4), o.getLong(u5), o.isNull(u6) ? null : o.getString(u6), o.isNull(u7) ? null : o.getString(u7), o.isNull(u8) ? null : o.getString(u8), o.isNull(u9) ? null : o.getString(u9), i2a.a(o.getInt(u10))));
            }
            o.close();
            a2.o();
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(d((ydb) it.next()));
            }
            return arrayList2;
        } catch (Throwable th) {
            o.close();
            a2.o();
            throw th;
        }
    }

    public final xdb f(long j) {
        return (xdb) CollectionsKt.firstOrNull(g(CollectionsKt.listOf(Long.valueOf(j))));
    }

    /* JADX INFO: finally extract failed */
    public final ArrayList g(List list) {
        ueb c = c();
        c.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM phones WHERE server_phone in (");
        int size = list.size();
        n79.c(sb, size);
        sb.append(")");
        d7d a2 = d7d.a(size, sb.toString());
        Iterator it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            Long l = (Long) it.next();
            if (l == null) {
                a2.X(i);
            } else {
                a2.k(i, l.longValue());
            }
            i++;
        }
        i6d i6d = c.a;
        i6d.b();
        Cursor o = i6d.o(a2, (CancellationSignal) null);
        try {
            int u = kne.u(o, "id");
            int u2 = kne.u(o, "phonebook_id");
            int u3 = kne.u(o, "contact_id");
            int u4 = kne.u(o, "phone");
            int u5 = kne.u(o, "server_phone");
            int u6 = kne.u(o, "email");
            int u7 = kne.u(o, "first_name");
            int u8 = kne.u(o, "last_name");
            int u9 = kne.u(o, "avatar_path");
            int u10 = kne.u(o, "type");
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                arrayList.add(new ydb(o.getLong(u), o.getLong(u2), o.getInt(u3), o.isNull(u4) ? null : o.getString(u4), o.getLong(u5), o.isNull(u6) ? null : o.getString(u6), o.isNull(u7) ? null : o.getString(u7), o.isNull(u8) ? null : o.getString(u8), o.isNull(u9) ? null : o.getString(u9), i2a.a(o.getInt(u10))));
            }
            o.close();
            a2.o();
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(d((ydb) it2.next()));
            }
            return arrayList2;
        } catch (Throwable th) {
            o.close();
            a2.o();
            throw th;
        }
    }
}

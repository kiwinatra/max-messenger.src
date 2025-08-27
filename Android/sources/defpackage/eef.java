package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: eef  reason: default package */
public final class eef {
    public static final List d = Arrays.asList(new gef[]{gef.PROCESSING, gef.WAITING});
    public final hs7 a;
    public final m95 b;
    public final dac c = new dac();

    public eef(hs7 hs7, m95 m95) {
        this.a = hs7;
        this.b = m95;
    }

    public final bb3 a(List list) {
        z68.c("eef", "awaitNoTasksByTypes: types=%s", list);
        return new na3(4, new tbe(new mka(2, new z52(10, this, list)), new uqe(3, list), 3).i(new dre(28)), new def(this, list)).g(new uh5(7, list));
    }

    public final long b(List list) {
        hef b2 = ((a74) ((s74) this.a.get())).f.b();
        b2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT COUNT(*) FROM tasks where type in (");
        int size = list.size();
        n79.c(sb, size);
        sb.append(")");
        d7d a2 = d7d.a(size, sb.toString());
        Iterator it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            b2.c.getClass();
            a2.k(i, (long) ((idb) it.next()).a);
            i++;
        }
        i6d i6d = b2.a;
        i6d.b();
        Cursor o = i6d.o(a2, (CancellationSignal) null);
        try {
            return o.moveToFirst() ? o.getLong(0) : 0;
        } finally {
            o.close();
            a2.o();
        }
    }

    public final void c(long j) {
        hef b2 = ((a74) ((s74) this.a.get())).f.b();
        i6d i6d = b2.a;
        i6d.c();
        try {
            hef.a(b2, j);
            i6d.r();
        } finally {
            i6d.l();
        }
    }

    public final void d(long j) {
        z68.c("eef", "remove task = " + j, new Object[0]);
        ((a74) ((s74) this.a.get())).f.a(j);
        this.c.d(Boolean.TRUE);
    }

    /* JADX INFO: finally extract failed */
    public final void e(AbstractCollection abstractCollection) {
        z68.c("eef", "remove tasks %d", Integer.valueOf(abstractCollection.size()));
        if (!cjf.B(abstractCollection)) {
            i6d i6d = ((a74) ((s74) this.a.get())).f.b().a;
            i6d.b();
            StringBuilder sb = new StringBuilder();
            sb.append("DELETE FROM tasks WHERE id in (");
            n79.c(sb, abstractCollection.size());
            sb.append(")");
            gf6 d2 = i6d.d(sb.toString());
            Iterator it = abstractCollection.iterator();
            int i = 1;
            while (it.hasNext()) {
                Long l = (Long) it.next();
                if (l == null) {
                    d2.X(i);
                } else {
                    d2.k(i, l.longValue());
                }
                i++;
            }
            i6d.c();
            try {
                d2.n();
                i6d.r();
                i6d.l();
                this.c.d(Boolean.TRUE);
            } catch (Throwable th) {
                i6d.l();
                throw th;
            }
        }
    }

    public final void f() {
        z68.c("eef", "remove tasks by type = %d", idb.TYPE_SYNC_CHAT_HISTORY);
        hef b2 = ((a74) ((s74) this.a.get())).f.b();
        i6d i6d = b2.a;
        i6d.b();
        t5d t5d = b2.i;
        gf6 E = t5d.E();
        b2.c.getClass();
        E.k(1, (long) 12);
        try {
            i6d.c();
            E.n();
            i6d.r();
            i6d.l();
            t5d.S(E);
            this.c.d(Boolean.TRUE);
        } catch (Throwable th) {
            t5d.S(E);
            throw th;
        }
    }

    public final void g(hdb hdb, long j, int i) {
        StringBuilder sb = new StringBuilder("save task = ");
        hdb hdb2 = hdb;
        sb.append(hdb);
        z68.c("eef", sb.toString(), new Object[0]);
        hef b2 = ((a74) ((s74) this.a.get())).f.b();
        vdf vdf = new vdf(hdb.getId(), hdb.getType(), gef.WAITING, 0, j, i, hdb.d(), System.currentTimeMillis());
        i6d i6d = b2.a;
        i6d.b();
        i6d.c();
        try {
            b2.b.d0(vdf);
            i6d.r();
        } finally {
            i6d.l();
        }
    }

    /* JADX INFO: finally extract failed */
    public final List h(long j, idb idb) {
        q7d q7d = ((a74) ((s74) this.a.get())).f;
        hef b2 = q7d.b();
        b2.getClass();
        d7d a2 = d7d.a(2, "SELECT * FROM tasks WHERE id > ? AND type = ?");
        a2.k(1, j);
        b2.c.getClass();
        a2.k(2, (long) idb.a);
        i6d i6d = b2.a;
        i6d.b();
        Cursor o = i6d.o(a2, (CancellationSignal) null);
        try {
            int u = kne.u(o, "id");
            int u2 = kne.u(o, "type");
            int u3 = kne.u(o, "status");
            int u4 = kne.u(o, "fails_count");
            int u5 = kne.u(o, "depends_request_id");
            int u6 = kne.u(o, "dependency_type");
            int u7 = kne.u(o, "data");
            int u8 = kne.u(o, "created_time");
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                arrayList.add(new vdf(o.getLong(u), o9a.u(o.getInt(u2)), o9a.t(o.getInt(u3)), o.getInt(u4), o.getLong(u5), o.getInt(u6), o.isNull(u7) ? null : o.getBlob(u7), o.getLong(u8)));
            }
            o.close();
            a2.o();
            return q7d.c(arrayList);
        } catch (Throwable th) {
            o.close();
            a2.o();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final List i(Collection collection) {
        o9a o9a;
        q7d q7d = ((a74) ((s74) this.a.get())).f;
        hef b2 = q7d.b();
        b2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM tasks WHERE type in (");
        int size = collection.size();
        n79.c(sb, size);
        sb.append(") AND status in (");
        List<gef> list = d;
        int size2 = list.size();
        n79.c(sb, size2);
        sb.append(")");
        d7d a2 = d7d.a(size2 + size, sb.toString());
        Iterator it = collection.iterator();
        int i = 1;
        while (true) {
            boolean hasNext = it.hasNext();
            o9a = b2.c;
            if (!hasNext) {
                break;
            }
            o9a.getClass();
            a2.k(i, (long) ((idb) it.next()).a);
            i++;
        }
        int i2 = size + 1;
        for (gef gef : list) {
            o9a.getClass();
            a2.k(i2, (long) gef.a);
            i2++;
        }
        i6d i6d = b2.a;
        i6d.b();
        Cursor o = i6d.o(a2, (CancellationSignal) null);
        try {
            int u = kne.u(o, "id");
            int u2 = kne.u(o, "type");
            int u3 = kne.u(o, "status");
            int u4 = kne.u(o, "fails_count");
            int u5 = kne.u(o, "depends_request_id");
            int u6 = kne.u(o, "dependency_type");
            int u7 = kne.u(o, "data");
            int u8 = kne.u(o, "created_time");
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                long j = o.getLong(u);
                int i3 = o.getInt(u2);
                o9a.getClass();
                arrayList.add(new vdf(j, o9a.u(i3), o9a.t(o.getInt(u3)), o.getInt(u4), o.getLong(u5), o.getInt(u6), o.isNull(u7) ? null : o.getBlob(u7), o.getLong(u8)));
            }
            o.close();
            a2.o();
            return q7d.c(arrayList);
        } catch (Throwable th) {
            o.close();
            a2.o();
            throw th;
        }
    }

    public final tdf j(long j) {
        d7d a2;
        Cursor o;
        idb idb;
        hs7 hs7 = this.a;
        try {
            return ((a74) ((s74) hs7.get())).f.e(j);
        } catch (Exception e) {
            hef b2 = ((a74) ((s74) hs7.get())).f.b();
            b2.getClass();
            a2 = d7d.a(1, "SELECT type FROM tasks WHERE id = ?");
            a2.k(1, j);
            i6d i6d = b2.a;
            i6d.b();
            o = i6d.o(a2, (CancellationSignal) null);
            if (o.moveToFirst()) {
                int i = o.getInt(0);
                b2.c.getClass();
                idb = o9a.u(i);
            } else {
                idb = null;
            }
            o.close();
            a2.o();
            z68.n("eef", (IOException) null, "selectTask: id=%d; type=%d; exception=%s", Arrays.copyOf(new Object[]{Long.valueOf(j), idb, e.getMessage()}, 3));
            ((uta) this.b).c(new Exception("Can't select task with type=" + idb + "; exception= " + e.getMessage()), true);
            return null;
        } catch (Throwable th) {
            o.close();
            a2.o();
            throw th;
        }
    }

    public final int k() {
        hef b2 = ((a74) ((s74) this.a.get())).f.b();
        List<gef> listOf = CollectionsKt.listOf(gef.WAITING, gef.FAILED);
        b2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT COUNT(*) FROM tasks WHERE status in (");
        int size = listOf.size();
        n79.c(sb, size);
        sb.append(")");
        d7d a2 = d7d.a(size, sb.toString());
        int i = 1;
        for (gef gef : listOf) {
            b2.c.getClass();
            a2.k(i, (long) gef.a);
            i++;
        }
        i6d i6d = b2.a;
        i6d.b();
        Cursor o = i6d.o(a2, (CancellationSignal) null);
        try {
            int i2 = 0;
            if (o.moveToFirst()) {
                i2 = o.getInt(0);
            }
            return i2;
        } finally {
            o.close();
            a2.o();
        }
    }

    public final ArrayList l() {
        return ((a74) ((s74) this.a.get())).f.b().b(IntCompanionObject.MAX_VALUE, CollectionsKt.listOf(gef.WAITING, gef.FAILED));
    }

    public final ArrayList m() {
        o9a o9a;
        hef b2 = ((a74) ((s74) this.a.get())).f.b();
        List listOf = CollectionsKt.listOf(gef.WAITING, gef.FAILED);
        b2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT type, COUNT(*) as count FROM tasks WHERE status in (");
        int size = listOf.size();
        n79.c(sb, size);
        sb.append(") GROUP BY type");
        d7d a2 = d7d.a(size, sb.toString());
        Iterator it = listOf.iterator();
        int i = 1;
        while (true) {
            boolean hasNext = it.hasNext();
            o9a = b2.c;
            if (!hasNext) {
                break;
            }
            o9a.getClass();
            a2.k(i, (long) ((gef) it.next()).a);
            i++;
        }
        i6d i6d = b2.a;
        i6d.b();
        Cursor o = i6d.o(a2, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                int i2 = o.getInt(0);
                o9a.getClass();
                arrayList.add(new sdf(o9a.u(i2), o.getInt(1)));
            }
            return arrayList;
        } finally {
            o.close();
            a2.o();
        }
    }

    public final void n(long j, gef gef) {
        ((a74) ((s74) this.a.get())).f.b().c(j, gef);
    }
}

package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: oi0  reason: default package */
public abstract class oi0 extends qm implements lcf, hdb {
    public final int o;

    public oi0(long j, int i) {
        super(j);
        this.o = i;
    }

    /* JADX INFO: finally extract failed */
    public final int b() {
        o9a o9a;
        rm rmVar = this.c;
        if (rmVar == null) {
            rmVar = null;
        }
        eef e = rmVar.e();
        List listOf = CollectionsKt.listOf(idb.TYPE_ASSETS_ADD, idb.TYPE_ASSETS_REMOVE, idb.TYPE_ASSETS_MOVE, idb.TYPE_ASSETS_LIST_MODIFY);
        q7d q7d = ((a74) ((s74) e.a.get())).f;
        hef b = q7d.b();
        b.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM tasks WHERE type in (");
        int size = listOf.size();
        n79.c(sb, size);
        sb.append(")");
        d7d a = d7d.a(size, sb.toString());
        Iterator it = listOf.iterator();
        int i = 1;
        while (true) {
            boolean hasNext = it.hasNext();
            o9a = b.c;
            if (!hasNext) {
                break;
            }
            o9a.getClass();
            a.k(i, (long) ((idb) it.next()).a);
            i++;
        }
        i6d i6d = b.a;
        i6d.b();
        Cursor o2 = i6d.o(a, (CancellationSignal) null);
        try {
            int u = kne.u(o2, "id");
            int u2 = kne.u(o2, "type");
            int u3 = kne.u(o2, "status");
            int u4 = kne.u(o2, "fails_count");
            int u5 = kne.u(o2, "depends_request_id");
            int u6 = kne.u(o2, "dependency_type");
            int u7 = kne.u(o2, "data");
            int u8 = kne.u(o2, "created_time");
            ArrayList arrayList = new ArrayList(o2.getCount());
            while (o2.moveToNext()) {
                long j = o2.getLong(u);
                int i2 = o2.getInt(u2);
                o9a.getClass();
                arrayList.add(new vdf(j, o9a.u(i2), o9a.t(o2.getInt(u3)), o2.getInt(u4), o2.getLong(u5), o2.getInt(u6), o2.isNull(u7) ? null : o2.getBlob(u7), o2.getLong(u8)));
            }
            o2.close();
            a.o();
            List c = q7d.c(arrayList);
            Iterator it2 = c.iterator();
            while (true) {
                boolean hasNext2 = it2.hasNext();
                long j2 = this.a;
                if (!hasNext2) {
                    return ((tdf) c.get(0)).a != j2 ? 2 : 1;
                }
                tdf tdf = (tdf) it2.next();
                if (tdf.a == j2 && (tdf.f instanceof gu)) {
                    return 3;
                }
            }
        } catch (Throwable th) {
            o2.close();
            a.o();
            throw th;
        }
    }

    public final void c() {
        int i = this.o;
        int y = tr1.y(i);
        rm rmVar = null;
        if (y == 3) {
            rm rmVar2 = this.c;
            if (rmVar2 == null) {
                rmVar2 = null;
            }
            ((vi5) rmVar2.t.getValue()).d();
        } else if (y != 4) {
            z68.p(getClass().getName(), "unsuspporeted type ".concat(tr1.z(i)));
        } else {
            rm rmVar3 = this.c;
            if (rmVar3 == null) {
                rmVar3 = null;
            }
            ((ai5) rmVar3.u.getValue()).j();
        }
        rm rmVar4 = this.c;
        if (rmVar4 != null) {
            rmVar = rmVar4;
        }
        rmVar.e().d(this.a);
    }

    public final void e(ibf ibf) {
        rm rmVar = this.c;
        rm rmVar2 = null;
        if (rmVar == null) {
            rmVar = null;
        }
        if (rmVar.e().b(CollectionsKt.listOf(idb.TYPE_ASSETS_ADD, idb.TYPE_ASSETS_REMOVE, idb.TYPE_ASSETS_MOVE, idb.TYPE_ASSETS_LIST_MODIFY)) > 1) {
            rm rmVar3 = this.c;
            if (rmVar3 != null) {
                rmVar2 = rmVar3;
            }
            rvd.A((jqg) rmVar2.g.getValue());
        }
        t(ibf);
    }

    public final int f() {
        return 10;
    }

    public final long getId() {
        return this.a;
    }

    public final void h(qaf qaf) {
        if (!m58.A(qaf.b)) {
            c();
            rm rmVar = this.c;
            if (rmVar == null) {
                rmVar = null;
            }
            rmVar.b().c(new hj0(this.a, qaf));
        }
    }

    public abstract void t(ibf ibf);

    public final void u(long j) {
        rm rmVar = null;
        int i = this.o;
        if (i == 4) {
            rm rmVar2 = this.c;
            if (rmVar2 != null) {
                rmVar = rmVar2;
            }
            ((vi5) rmVar.t.getValue()).g(j);
        } else if (i == 5) {
            rm rmVar3 = this.c;
            if (rmVar3 != null) {
                rmVar = rmVar3;
            }
            ((ai5) rmVar.u.getValue()).k(j);
        }
    }
}

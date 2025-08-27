package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: iud  reason: default package */
public final class iud extends gud {
    public final /* synthetic */ int b;
    public final Object c;

    public iud() {
        this.b = 0;
        this.c = iud.class.getName();
    }

    /* JADX INFO: finally extract failed */
    public final void z() {
        Object obj = this.c;
        switch (this.b) {
            case 0:
                q7d q7d = ((a74) ((s74) t().a.get())).f;
                js9 js9 = gef.b;
                hef b2 = q7d.b();
                b2.getClass();
                d7d a = d7d.a(1, "SELECT * FROM tasks WHERE status = ?");
                b2.c.getClass();
                a.k(1, (long) 10);
                i6d i6d = b2.a;
                i6d.b();
                Cursor o = i6d.o(a, (CancellationSignal) null);
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
                    a.o();
                    for (tdf tdf : q7d.c(arrayList)) {
                        z68.c((String) obj, "mark processing task: " + tdf + " as failed", new Object[0]);
                        t().c(tdf.a);
                    }
                    return;
                } catch (Throwable th) {
                    o.close();
                    a.o();
                    throw th;
                }
            default:
                HashSet hashSet = new HashSet();
                Collection collection = (Collection) obj;
                if (collection == null || collection.contains(zx0.c)) {
                    hashSet.add(2);
                }
                if (collection == null || collection.contains(zx0.b)) {
                    hashSet.add(1);
                    hashSet.add(4);
                }
                if (true ^ hashSet.isEmpty()) {
                    z6d z6d = ((a74) p().a).c;
                    p79 p79 = new p79(7);
                    z6d.getClass();
                    try {
                        ((OneMeRoomDatabase) z6d.a.m()).q(new o6d(z6d, hashSet, p79));
                        return;
                    } catch (Throwable th2) {
                        z68.f("RoomMessagesDatabase", "Can't update attach by type", th2);
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public iud(HashSet hashSet) {
        this.b = 1;
        this.c = hashSet;
    }
}

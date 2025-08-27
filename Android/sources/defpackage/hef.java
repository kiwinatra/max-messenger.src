package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: hef  reason: default package */
public final class hef {
    public final i6d a;
    public final gs2 b;
    public final o9a c = new o9a(20);
    public final t5d d;
    public final t5d e;
    public final t5d f;
    public final t5d g;
    public final t5d h;
    public final t5d i;

    public hef(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new gs2(this, oneMeRoomDatabase, 2);
        new zi9(this, oneMeRoomDatabase, 4);
        this.d = new t5d(oneMeRoomDatabase, 17);
        new t5d(oneMeRoomDatabase, 18);
        this.e = new t5d(oneMeRoomDatabase, 19);
        this.f = new t5d(oneMeRoomDatabase, 20);
        this.g = new t5d(oneMeRoomDatabase, 21);
        this.h = new t5d(oneMeRoomDatabase, 22);
        this.i = new t5d(oneMeRoomDatabase, 23);
    }

    public static void a(hef hef, long j) {
        hef.c(j, gef.FAILED);
        i6d i6d = hef.a;
        i6d.b();
        t5d t5d = hef.f;
        gf6 E = t5d.E();
        E.k(1, j);
        try {
            i6d.c();
            E.n();
            i6d.r();
            i6d.l();
            t5d.S(E);
        } catch (Throwable th) {
            t5d.S(E);
            throw th;
        }
    }

    public final ArrayList b(int i2, List list) {
        StringBuilder o = tr1.o("SELECT id FROM tasks WHERE status in (");
        int size = list.size();
        n79.c(o, size);
        o.append(") LIMIT ");
        o.append("?");
        int i3 = size + 1;
        d7d a2 = d7d.a(i3, o.toString());
        Iterator it = list.iterator();
        int i4 = 1;
        while (it.hasNext()) {
            this.c.getClass();
            a2.k(i4, (long) ((gef) it.next()).a);
            i4++;
        }
        a2.k(i3, (long) i2);
        i6d i6d = this.a;
        i6d.b();
        Cursor o2 = i6d.o(a2, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(o2.getCount());
            while (o2.moveToNext()) {
                arrayList.add(o2.isNull(0) ? null : Long.valueOf(o2.getLong(0)));
            }
            return arrayList;
        } finally {
            o2.close();
            a2.o();
        }
    }

    public final void c(long j, gef gef) {
        i6d i6d = this.a;
        i6d.b();
        t5d t5d = this.d;
        gf6 E = t5d.E();
        this.c.getClass();
        E.k(1, (long) gef.a);
        E.k(2, j);
        try {
            i6d.c();
            E.n();
            i6d.r();
            i6d.l();
            t5d.S(E);
        } catch (Throwable th) {
            t5d.S(E);
            throw th;
        }
    }
}

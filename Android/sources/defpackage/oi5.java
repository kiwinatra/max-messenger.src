package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: oi5  reason: default package */
public final class oi5 {
    public final i6d a;
    public final li b;
    public final mi c;

    public oi5(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new li(oneMeRoomDatabase, 9);
        this.c = new mi(oneMeRoomDatabase, 23);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, bi5] */
    public static ArrayList b(long j, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ? obj = new Object();
            obj.a = ((Long) list.get(i)).longValue();
            obj.b = ((long) i) + j;
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final void a(List list) {
        i6d i6d = this.a;
        i6d.c();
        try {
            new na3(0, new qa3(2, new fc2(4, this)), new qa3(2, new ni5(this, b(0, list), 0))).a();
            i6d.r();
        } finally {
            i6d.l();
        }
    }

    public final ArrayList c() {
        d7d a2 = d7d.a(0, "SELECT id FROM favorite_sticker_sets ORDER BY `index` ASC");
        i6d i6d = this.a;
        i6d.b();
        Cursor o = i6d.o(a2, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                arrayList.add(o.isNull(0) ? null : Long.valueOf(o.getLong(0)));
            }
            return arrayList;
        } finally {
            o.close();
            a2.o();
        }
    }
}

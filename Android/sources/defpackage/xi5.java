package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: xi5  reason: default package */
public final class xi5 {
    public final i6d a;
    public final li b;
    public final mi c;

    public xi5(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new li(oneMeRoomDatabase, 10);
        this.c = new mi(oneMeRoomDatabase, 24);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [kh5, java.lang.Object] */
    public static ArrayList b(int i, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            ? obj = new Object();
            obj.a = ((Long) list.get(i2)).longValue();
            obj.b = (long) (i + i2);
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final void a(List list) {
        i6d i6d = this.a;
        i6d.c();
        try {
            new na3(0, new qa3(2, new fc2(5, this)), new qa3(2, new wi5(this, b(0, list), 0))).a();
            i6d.r();
        } finally {
            i6d.l();
        }
    }

    public final ArrayList c() {
        d7d a2 = d7d.a(0, "SELECT id FROM favorite_stickers ORDER BY `index` ASC");
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

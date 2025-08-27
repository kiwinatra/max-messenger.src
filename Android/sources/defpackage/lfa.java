package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: lfa  reason: default package */
public final class lfa {
    public final i6d a;
    public final li b;
    public final uf9 c;

    public lfa(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new li(oneMeRoomDatabase, 15);
        this.c = new uf9(oneMeRoomDatabase, 20);
    }

    /* JADX INFO: finally extract failed */
    public static boolean a(lfa lfa, uea uea) {
        int i;
        lfa.getClass();
        List<Long> listOf = CollectionsKt.listOf(Long.valueOf(uea.a));
        StringBuilder o = tr1.o("SELECT * FROM notifications_read_marks WHERE chat_id IN (");
        int size = listOf.size();
        n79.c(o, size);
        o.append(")");
        d7d a2 = d7d.a(size, o.toString());
        int i2 = 1;
        for (Long l : listOf) {
            if (l == null) {
                a2.X(i2);
            } else {
                a2.k(i2, l.longValue());
            }
            i2++;
        }
        i6d i6d = lfa.a;
        i6d.b();
        Cursor o2 = i6d.o(a2, (CancellationSignal) null);
        try {
            int u = kne.u(o2, "chat_id");
            int u2 = kne.u(o2, "mark");
            ArrayList arrayList = new ArrayList(o2.getCount());
            while (o2.moveToNext()) {
                arrayList.add(new uea(o2.getLong(u), o2.getLong(u2)));
            }
            o2.close();
            a2.o();
            uea uea2 = (uea) CollectionsKt.firstOrNull(arrayList);
            if (uea2 != null && (uea2.b == uea.b || i > 0)) {
                return false;
            }
            Iterable listOf2 = CollectionsKt.listOf(uea);
            i6d.b();
            i6d.c();
            try {
                lfa.b.a0(listOf2);
                i6d.r();
                return true;
            } finally {
                i6d.l();
            }
        } catch (Throwable th) {
            o2.close();
            a2.o();
            throw th;
        }
    }
}

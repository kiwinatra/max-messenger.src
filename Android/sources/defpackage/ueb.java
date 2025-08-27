package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: ueb  reason: default package */
public final class ueb {
    public final i6d a;
    public final li b;
    public final we4 c;
    public final uf9 d;
    public final uf9 e;
    public final uf9 f;

    public ueb(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new li(oneMeRoomDatabase, 17);
        this.c = new we4(oneMeRoomDatabase, 3);
        this.d = new uf9(oneMeRoomDatabase, 23);
        this.e = new uf9(oneMeRoomDatabase, 24);
        this.f = new uf9(oneMeRoomDatabase, 25);
    }

    public static void a(ueb ueb, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            i6d i6d = ueb.a;
            i6d.b();
            uf9 uf9 = ueb.f;
            gf6 E = uf9.E();
            E.k(1, longValue);
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
    }
}

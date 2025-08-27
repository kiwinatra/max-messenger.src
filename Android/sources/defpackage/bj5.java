package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: bj5  reason: default package */
public final class bj5 {
    public final i6d a;
    public final li b;
    public final mi c;
    public final mi d;
    public final mi e;

    public bj5(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new li(oneMeRoomDatabase, 11);
        this.c = new mi(oneMeRoomDatabase, 25);
        this.d = new mi(oneMeRoomDatabase, 26);
        this.e = new mi(oneMeRoomDatabase, 27);
    }

    /* JADX INFO: finally extract failed */
    public static ArrayList a(bj5 bj5, long j, long j2) {
        bj5 bj52 = bj5;
        long j3 = j;
        long j4 = j2;
        bj5.getClass();
        djd djd = hj5.b;
        d7d a2 = d7d.a(3, "SELECT chat_id, msg_id FROM fcm_notifications_analytics WHERE analytics_status=? AND chat_id=? AND time<=?");
        a2.k(1, (long) 2);
        a2.k(2, j3);
        a2.k(3, j4);
        i6d i6d = bj52.a;
        i6d.b();
        Cursor o = i6d.o(a2, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                arrayList.add(new dj5(o.getLong(0), o.getLong(1)));
            }
            o.close();
            a2.o();
            djd djd2 = hj5.b;
            i6d.b();
            mi miVar = bj52.d;
            gf6 E = miVar.E();
            E.k(1, (long) 2);
            E.k(2, j3);
            E.k(3, j4);
            try {
                i6d.c();
                E.n();
                i6d.r();
                i6d.l();
                miVar.S(E);
                return arrayList;
            } catch (Throwable th) {
                miVar.S(E);
                throw th;
            }
        } catch (Throwable th2) {
            o.close();
            a2.o();
            throw th2;
        }
    }
}

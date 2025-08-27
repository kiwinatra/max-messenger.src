package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: ddd  reason: default package */
public final class ddd {
    public final i6d a;
    public final t5d b;
    public final t5d c;
    public final t5d d;

    public ddd(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new t5d(oneMeRoomDatabase, 9);
        this.c = new t5d(oneMeRoomDatabase, 10);
        this.d = new t5d(oneMeRoomDatabase, 11);
    }

    public final void a(long j, long j2) {
        i6d i6d = this.a;
        i6d.b();
        t5d t5d = this.b;
        gf6 E = t5d.E();
        E.k(1, j);
        E.k(2, j2);
        try {
            i6d.c();
            E.m();
            i6d.r();
            i6d.l();
            t5d.S(E);
        } catch (Throwable th) {
            t5d.S(E);
            throw th;
        }
    }
}

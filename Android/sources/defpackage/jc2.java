package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: jc2  reason: default package */
public final class jc2 {
    public final i6d a;
    public final li b;
    public final mi c;
    public final mi d;
    public final mi e;
    public final mi f;

    public jc2(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new li(oneMeRoomDatabase, 3);
        this.c = new mi(oneMeRoomDatabase, 4);
        this.d = new mi(oneMeRoomDatabase, 5);
        this.e = new mi(oneMeRoomDatabase, 6);
        this.f = new mi(oneMeRoomDatabase, 7);
    }
}

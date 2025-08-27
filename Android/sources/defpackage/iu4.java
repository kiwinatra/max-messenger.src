package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: iu4  reason: default package */
public final class iu4 {
    public final i6d a;
    public final li b;
    public final mi c;
    public final mi d;

    public iu4(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new li(oneMeRoomDatabase, 8);
        this.c = new mi(oneMeRoomDatabase, 21);
        this.d = new mi(oneMeRoomDatabase, 22);
    }
}

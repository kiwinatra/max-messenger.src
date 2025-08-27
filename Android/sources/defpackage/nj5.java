package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: nj5  reason: default package */
public final class nj5 {
    public final i6d a;
    public final li b;
    public final mi c;

    public nj5(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new li(oneMeRoomDatabase, 12);
        this.c = new mi(oneMeRoomDatabase, 28);
    }
}

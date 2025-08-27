package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: ok  reason: default package */
public final class ok {
    public final i6d a;
    public final li b;
    public final mi c;

    public ok(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new li(oneMeRoomDatabase, 1);
        this.c = new mi(oneMeRoomDatabase, 1);
    }
}

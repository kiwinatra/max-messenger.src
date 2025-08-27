package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: kuc  reason: default package */
public final class kuc {
    public final i6d a;
    public final li b;
    public final we4 c;
    public final uf9 d;

    public kuc(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new li(oneMeRoomDatabase, 20);
        this.c = new we4(oneMeRoomDatabase, 4);
        this.d = new uf9(oneMeRoomDatabase, 27);
    }
}

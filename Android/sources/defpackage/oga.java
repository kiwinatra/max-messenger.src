package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: oga  reason: default package */
public final class oga {
    public final i6d a;
    public final li b;
    public final uf9 c;
    public final uf9 d;

    public oga(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new li(oneMeRoomDatabase, 16);
        this.c = new uf9(oneMeRoomDatabase, 21);
        this.d = new uf9(oneMeRoomDatabase, 22);
    }
}

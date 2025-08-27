package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: gfa  reason: default package */
public final class gfa {
    public final i6d a;
    public final li b;
    public final uf9 c;
    public final uf9 d;

    public gfa(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new li(oneMeRoomDatabase, 14);
        new uf9(oneMeRoomDatabase, 16);
        new uf9(oneMeRoomDatabase, 17);
        this.c = new uf9(oneMeRoomDatabase, 18);
        this.d = new uf9(oneMeRoomDatabase, 19);
    }
}

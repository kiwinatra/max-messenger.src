package defpackage;

import kotlin.reflect.KProperty;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: mfa  reason: default package */
public final class mfa implements s98 {
    public static final cd4 b = new Object();
    public static final /* synthetic */ KProperty[] c;
    public static final String o;
    public final hs7 a;

    /* JADX WARNING: type inference failed for: r0v2, types: [cd4, java.lang.Object] */
    static {
        Class<mfa> cls = mfa.class;
        c = new KProperty[]{wj6.p(cls, "tamRoomDatabaseHelper", "getTamRoomDatabaseHelper()Lru/ok/tamtam/android/db/room/RoomDatabaseHelper;", 0)};
        o = cls.getName();
    }

    public mfa(hs7 hs7) {
        this.a = hs7;
    }

    public final void a() {
        KProperty kProperty = c[0];
        nj5 F = ((OneMeRoomDatabase) ((j6d) this.a.get()).m()).F();
        F.getClass();
        new na3(new qa3(2, new fc2(7, F)).h(v9a.w)).a();
    }
}

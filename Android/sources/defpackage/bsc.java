package defpackage;

import android.os.CancellationSignal;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: bsc  reason: default package */
public final class bsc {
    public final i6d a;
    public final li b;
    public final uf9 c;

    public bsc(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new li(oneMeRoomDatabase, 19);
        this.c = new uf9(oneMeRoomDatabase, 26);
    }

    public final Object a(Continuation continuation) {
        d7d a2 = d7d.a(1, "SELECT * FROM reactions_section WHERE id = ?");
        a2.h(1, "POPULAR");
        return i8b.q(this.a, new CancellationSignal(), new ni(22, this, a2), continuation);
    }
}

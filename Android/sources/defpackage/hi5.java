package defpackage;

import java.util.Collections;
import java.util.concurrent.Callable;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: hi5  reason: default package */
public final /* synthetic */ class hi5 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hi5(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                jna jna = (jna) ((mi5) this.c).a;
                return Long.valueOf(ocf.d(jna.E(), new xt(5, ((ltb) jna.D()).a.n(), this.b), false, 0, 12));
            case 1:
                return ((moe) ((vi5) this.c).b.get()).g(Collections.singletonList(Long.valueOf(this.b)));
            default:
                return Boolean.valueOf(((OneMeRoomDatabase) ((vqe) this.c).a.a.m()).C().c().contains(Long.valueOf(this.b)));
        }
    }
}

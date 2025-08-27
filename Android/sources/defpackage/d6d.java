package defpackage;

import kotlin.jvm.functions.Function0;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: d6d  reason: default package */
public final /* synthetic */ class d6d implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6d b;

    public /* synthetic */ d6d(f6d f6d, int i) {
        this.a = i;
        this.b = f6d;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((OneMeRoomDatabase) this.b.a.m()).x();
            case 1:
                return ((OneMeRoomDatabase) this.b.a.m()).P();
            default:
                return ((OneMeRoomDatabase) this.b.a.m()).H();
        }
    }
}

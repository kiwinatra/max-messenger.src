package defpackage;

import kotlin.jvm.functions.Function0;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: oj  reason: default package */
public final /* synthetic */ class oj implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gk b;

    public /* synthetic */ oj(gk gkVar, int i) {
        this.a = i;
        this.b = gkVar;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((OneMeRoomDatabase) this.b.b.m()).t();
            case 1:
                return ((OneMeRoomDatabase) this.b.b.m()).u();
            default:
                return ((OneMeRoomDatabase) this.b.b.m()).M();
        }
    }
}

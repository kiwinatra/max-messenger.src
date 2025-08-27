package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: tuc  reason: default package */
public final /* synthetic */ class tuc implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wuc b;
    public final /* synthetic */ OneMeRoomDatabase c;
    public final /* synthetic */ List d;

    public /* synthetic */ tuc(wuc wuc, OneMeRoomDatabase oneMeRoomDatabase, List list, int i) {
        this.a = i;
        this.b = wuc;
        this.c = oneMeRoomDatabase;
        this.d = list;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                wuc wuc = this.b;
                wuc.getClass();
                OneMeRoomDatabase oneMeRoomDatabase = this.c;
                oneMeRoomDatabase.q(new x55((Object) wuc, (Object) oneMeRoomDatabase, (Object) this.d, 26));
                return;
            default:
                wuc wuc2 = this.b;
                wuc2.getClass();
                this.c.q(new ovb(8, wuc2, (ArrayList) this.d));
                return;
        }
    }
}

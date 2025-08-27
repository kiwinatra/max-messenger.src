package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: vuc  reason: default package */
public final /* synthetic */ class vuc implements zi6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wuc b;
    public final /* synthetic */ List c;

    public /* synthetic */ vuc(wuc wuc, List list, int i) {
        this.a = i;
        this.b = wuc;
        this.c = list;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                wuc wuc = this.b;
                wuc.getClass();
                return new qa3(1, new r99(wuc, (kuc) obj, (ArrayList) this.c, 4));
            case 1:
                wuc wuc2 = this.b;
                wuc2.getClass();
                return new qa3(1, new tuc(wuc2, (OneMeRoomDatabase) obj, this.c, 0));
            default:
                wuc wuc3 = this.b;
                wuc3.getClass();
                return new qa3(1, new tuc(wuc3, (OneMeRoomDatabase) obj, (ArrayList) this.c, 1));
        }
    }
}

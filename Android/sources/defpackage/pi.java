package defpackage;

import android.os.CancellationSignal;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: pi  reason: default package */
public final class pi {
    public final i6d a;
    public final li b;
    public final mi c;

    public pi(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new li(oneMeRoomDatabase, 0);
        this.c = new mi(oneMeRoomDatabase, 0);
    }

    public final Object a(Collection collection, Continuation continuation) {
        StringBuilder o = tr1.o("SELECT * FROM animoji WHERE id IN (");
        int size = collection.size();
        n79.c(o, size);
        o.append(")");
        d7d a2 = d7d.a(size, o.toString());
        Iterator it = collection.iterator();
        int i = 1;
        while (it.hasNext()) {
            Long l = (Long) it.next();
            if (l == null) {
                a2.X(i);
            } else {
                a2.k(i, l.longValue());
            }
            i++;
        }
        return i8b.q(this.a, new CancellationSignal(), new oi(this, a2, 1), continuation);
    }
}

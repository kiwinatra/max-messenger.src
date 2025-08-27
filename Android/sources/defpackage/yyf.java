package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: yyf  reason: default package */
public final /* synthetic */ class yyf implements p6f {
    public final /* synthetic */ int a;
    public final /* synthetic */ zyf b;
    public final /* synthetic */ tc0 c;

    public /* synthetic */ yyf(zyf zyf, tc0 tc0, int i) {
        this.a = i;
        this.b = zyf;
        this.c = tc0;
    }

    public final Object a() {
        Boolean bool;
        Cursor rawQuery;
        switch (this.a) {
            case 0:
                tc0 tc0 = this.c;
                nbd nbd = (nbd) this.b.c;
                SQLiteDatabase m = nbd.m();
                m.beginTransaction();
                try {
                    Long n = nbd.n(m, tc0);
                    if (n == null) {
                        bool = Boolean.FALSE;
                    } else {
                        rawQuery = nbd.m().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{n.toString()});
                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                        rawQuery.close();
                        bool = valueOf;
                    }
                    m.setTransactionSuccessful();
                    m.endTransaction();
                    return bool;
                } catch (Throwable th) {
                    m.endTransaction();
                    throw th;
                }
            default:
                nbd nbd2 = (nbd) this.b.c;
                nbd2.getClass();
                return (Iterable) nbd2.o(new pbb(13, nbd2, this.c));
        }
    }
}

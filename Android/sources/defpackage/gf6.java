package defpackage;

import android.database.sqlite.SQLiteStatement;

/* renamed from: gf6  reason: default package */
public final class gf6 extends ff6 implements g3f {
    public final SQLiteStatement b;

    public gf6(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.b = sQLiteStatement;
    }

    public final long m() {
        return this.b.executeInsert();
    }

    public final int n() {
        return this.b.executeUpdateDelete();
    }
}

package defpackage;

import android.database.sqlite.SQLiteProgram;

/* renamed from: ff6  reason: default package */
public class ff6 implements g3f {
    public final SQLiteProgram a;

    public ff6(SQLiteProgram sQLiteProgram) {
        this.a = sQLiteProgram;
    }

    public final void T(double d, int i) {
        this.a.bindDouble(i, d);
    }

    public final void X(int i) {
        this.a.bindNull(i);
    }

    public final void close() {
        this.a.close();
    }

    public final void h(int i, String str) {
        this.a.bindString(i, str);
    }

    public final void k(int i, long j) {
        this.a.bindLong(i, j);
    }

    public final void l(int i, byte[] bArr) {
        this.a.bindBlob(i, bArr);
    }
}

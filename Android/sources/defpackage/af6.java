package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import android.text.TextUtils;
import java.io.Closeable;
import java.net.HttpURLConnection;

/* renamed from: af6  reason: default package */
public final class af6 implements Closeable {
    public static final String[] c = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] o = new String[0];
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ af6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void U() {
        ((SQLiteDatabase) this.b).endTransaction();
    }

    public void V(String str) {
        ((SQLiteDatabase) this.b).execSQL(str);
    }

    public final void close() {
        switch (this.a) {
            case 0:
                ((SQLiteDatabase) this.b).close();
                return;
            case 1:
                ((Cursor) this.b).close();
                return;
            default:
                ((HttpURLConnection) this.b).disconnect();
                return;
        }
    }

    public void e0(String str, Object[] objArr) {
        ((SQLiteDatabase) this.b).execSQL(str, objArr);
    }

    public boolean isOpen() {
        return ((SQLiteDatabase) this.b).isOpen();
    }

    public boolean k0() {
        return ((SQLiteDatabase) this.b).inTransaction();
    }

    public void m() {
        ((SQLiteDatabase) this.b).beginTransaction();
    }

    public boolean m0() {
        return ((SQLiteDatabase) this.b).isWriteAheadLoggingEnabled();
    }

    public void n() {
        ((SQLiteDatabase) this.b).beginTransactionNonExclusive();
    }

    public gf6 o(String str) {
        return new gf6(((SQLiteDatabase) this.b).compileStatement(str));
    }

    public Cursor p0(h3f h3f) {
        return ((SQLiteDatabase) this.b).rawQueryWithFactory(new ye6(1, new ze6(h3f)), h3f.m(), o, (String) null);
    }

    public Cursor q0(h3f h3f, CancellationSignal cancellationSignal) {
        String m = h3f.m();
        String[] strArr = o;
        return ((SQLiteDatabase) this.b).rawQueryWithFactory(new ye6(0, h3f), m, strArr, (String) null, cancellationSignal);
    }

    public Cursor r0(String str) {
        return p0(new er4(str));
    }

    public void s0() {
        ((SQLiteDatabase) this.b).setTransactionSuccessful();
    }

    public int t0(ContentValues contentValues, Object[] objArr) {
        if (contentValues.size() != 0) {
            int size = contentValues.size();
            int length = objArr.length + size;
            Object[] objArr2 = new Object[length];
            StringBuilder sb = new StringBuilder("UPDATE ");
            sb.append(c[3]);
            sb.append("WorkSpec SET ");
            int i = 0;
            for (String next : contentValues.keySet()) {
                sb.append(i > 0 ? "," : "");
                sb.append(next);
                objArr2[i] = contentValues.get(next);
                sb.append("=?");
                i++;
            }
            for (int i2 = size; i2 < length; i2++) {
                objArr2[i2] = objArr[i2 - size];
            }
            if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
                sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
            }
            gf6 o2 = o(sb.toString());
            hd8.d(o2, objArr2);
            return o2.b.executeUpdateDelete();
        }
        throw new IllegalArgumentException("Empty values".toString());
    }
}

package defpackage;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: bje  reason: default package */
public final class bje extends SQLiteOpenHelper implements u74 {
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Cursor query = sQLiteDatabase.query("sqlite_master", new String[]{"type", "name"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        while (query.moveToNext()) {
            try {
                String string = query.getString(0);
                String string2 = query.getString(1);
                if (!"sqlite_sequence".equals(string2)) {
                    String str = "DROP " + string + " IF EXISTS " + string2;
                    try {
                        sQLiteDatabase.execSQL(str);
                    } catch (SQLException e) {
                        i8b.p("Error executing " + str, e);
                    }
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        query.close();
        return;
        throw th;
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}

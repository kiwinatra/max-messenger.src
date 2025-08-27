package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import org.apache.http.cookie.ClientCookie;

/* renamed from: p2g  reason: default package */
public abstract class p2g {
    public static final /* synthetic */ int a = 0;

    static {
        cs8.a("media3.database");
    }

    public static int a(SQLiteDatabase sQLiteDatabase, int i, String str) {
        Cursor query;
        try {
            if (!v0g.f0(sQLiteDatabase, "ExoPlayerVersions")) {
                return -1;
            }
            query = sQLiteDatabase.query("ExoPlayerVersions", new String[]{ClientCookie.VERSION_ATTR}, "feature = ? AND instance_uid = ?", new String[]{Integer.toString(i), str}, (String) null, (String) null, (String) null);
            if (query.getCount() == 0) {
                query.close();
                return -1;
            }
            query.moveToNext();
            int i2 = query.getInt(0);
            query.close();
            return i2;
        } catch (SQLException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static void b(SQLiteDatabase sQLiteDatabase, int i, String str, int i2) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i));
            contentValues.put("instance_uid", str);
            contentValues.put(ClientCookie.VERSION_ATTR, Integer.valueOf(i2));
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", (String) null, contentValues);
        } catch (SQLException e) {
            throw new IOException(e);
        }
    }
}

package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* renamed from: agd  reason: default package */
public final class agd extends SQLiteOpenHelper {
    public static final String c = ("INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")");
    public static final int o = 5;
    public static final List v = Arrays.asList(new zfd[]{new zfd(0), new zfd(1), new zfd(2), new zfd(3), new zfd(4)});
    public final int a;
    public boolean b = false;

    public agd(int i, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.a = i;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List list = v;
        if (i2 <= list.size()) {
            while (i < i2) {
                ((zfd) list.get(i)).a(sQLiteDatabase);
                i++;
            }
            return;
        }
        StringBuilder n = a81.n("Migration from ", i, " to ", i2, " was requested, but cannot be performed. Only ");
        n.append(list.size());
        n.append(" migrations are provided");
        throw new IllegalArgumentException(n.toString());
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.b) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, this.a);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.b) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, i2);
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.b) {
            onConfigure(sQLiteDatabase);
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (!this.b) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, i, i2);
    }
}

package com.my.tracker.obfuscated;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;

final class j2 {
    private final String[] a = new String[1];
    private final SQLiteDatabase b;
    private final SQLiteStatement c;
    private final SQLiteStatement d;
    private final SQLiteStatement e;
    private final SQLiteStatement f;

    public static abstract class a implements Closeable {
        final Cursor a;

        public a(Cursor cursor) {
            this.a = cursor;
        }

        public final boolean b() {
            return this.a.moveToNext();
        }

        public final void close() {
            try {
                this.a.close();
            } catch (Throwable th) {
                x2.b("TimeSpentDataBaseSQL: AbstractReader error: error while closing cursor", th);
            }
        }

        public void finalize() {
            super.finalize();
            close();
        }
    }

    public static final class b extends a {
        public b(Cursor cursor) {
            super(cursor);
        }

        public byte[] m() {
            return this.a.getBlob(2);
        }

        public long n() {
            return this.a.getLong(0);
        }
    }

    private j2(SQLiteDatabase sQLiteDatabase) {
        this.b = sQLiteDatabase;
        this.d = sQLiteDatabase.compileStatement("SELECT COUNT(*) FROM table_tick_packet");
        this.c = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_tick_packet(timestamp, content) VALUES (?, ?)");
        this.e = sQLiteDatabase.compileStatement("DELETE FROM table_tick_packet WHERE packet_id = ?");
        this.f = sQLiteDatabase.compileStatement("DELETE FROM table_tick_packet WHERE packet_id IN (SELECT packet_id FROM table_tick_packet ORDER BY timestamp ASC LIMIT ?)");
    }

    public int a(int i) {
        this.f.clearBindings();
        this.f.bindLong(1, (long) i);
        int executeUpdateDelete = this.f.executeUpdateDelete();
        x2.a("TimeSpentDataBaseSQL: " + executeUpdateDelete + " oldest tick packet(s) removed from database (reason: delete " + i + " oldest tick packets)");
        return executeUpdateDelete;
    }

    public b b(int i) {
        this.a[0] = String.valueOf(i);
        return new b(this.b.rawQuery("SELECT packet_id, timestamp, content FROM table_tick_packet ORDER BY timestamp DESC LIMIT ?", this.a));
    }

    public int a(long j) {
        this.e.clearBindings();
        this.e.bindLong(1, j);
        int executeUpdateDelete = this.e.executeUpdateDelete();
        x2.a("TimeSpentDataBaseSQL: " + executeUpdateDelete + " tick packet removed from database (reason: delete tick packet with packetId = " + j + ")");
        return executeUpdateDelete;
    }

    public void a(long[] jArr) {
        this.b.beginTransaction();
        try {
            int i = 0;
            for (long a2 : jArr) {
                i += a(a2);
            }
            x2.a("TimeSpentDataBaseSQL: " + i + " tick packet(s) removed from database (reason: delete " + jArr.length + " tick packets)");
            this.b.setTransactionSuccessful();
            this.b.endTransaction();
        } catch (Throwable th) {
            this.b.endTransaction();
            throw th;
        }
    }

    public int a() {
        return (int) this.d.simpleQueryForLong();
    }

    public static j2 a(String str, Context context) {
        String k = wj6.k("mytracker_timespent_", str, ".db");
        SQLiteDatabase openOrCreateDatabase = context.openOrCreateDatabase(k, 0, (SQLiteDatabase.CursorFactory) null);
        if (openOrCreateDatabase != null) {
            if (openOrCreateDatabase.getVersion() != 1) {
                openOrCreateDatabase.close();
                context.deleteDatabase(k);
                openOrCreateDatabase = context.openOrCreateDatabase(k, 0, (SQLiteDatabase.CursorFactory) null);
                openOrCreateDatabase.setVersion(1);
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_tick_packet(packet_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, timestamp INTEGER NOT NULL, content BLOB NOT NULL)");
                openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_tick_packettimestamp ON table_tick_packet(timestamp)");
            }
            return new j2(openOrCreateDatabase);
        }
        throw new Exception("TimeSpentDataBaseSQL: context.openOrCreateDatabase failed");
    }

    public long a(long j, byte[] bArr) {
        this.b.beginTransaction();
        try {
            this.c.clearBindings();
            this.c.bindLong(1, j);
            this.c.bindBlob(2, bArr);
            long executeInsert = this.c.executeInsert();
            if (executeInsert >= 0) {
                this.b.setTransactionSuccessful();
                x2.a("TimeSpentDataBaseSQL: 1 tick packet (packetId = " + executeInsert + ") inserted to database (reason: store tick packet)");
                return executeInsert;
            }
            throw new Exception("TimeSpentDataBaseSQL: sql insert failed");
        } finally {
            this.b.endTransaction();
        }
    }
}

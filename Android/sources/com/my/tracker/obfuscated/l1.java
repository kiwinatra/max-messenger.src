package com.my.tracker.obfuscated;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

final class l1 {
    private final SQLiteDatabase a;
    private final SQLiteStatement b;
    private final SQLiteStatement c;
    private final SQLiteStatement d;

    public static class a implements b {
        private final Cursor a;

        public a(Cursor cursor) {
            this.a = cursor;
        }

        public long a() {
            return this.a.getLong(0);
        }

        public boolean b() {
            return this.a.moveToNext();
        }

        public void close() {
            this.a.close();
        }

        public byte[] i() {
            return this.a.getBlob(1);
        }
    }

    public l1(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
        this.b = sQLiteDatabase.compileStatement("DELETE FROM table_partial_proto_packet WHERE id not in   (SELECT id    FROM table_partial_proto_packet    ORDER BY TS DESC    LIMIT ?  )");
        this.c = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_partial_proto_packet(data, ts) VALUES (?, ?)");
        this.d = sQLiteDatabase.compileStatement("DELETE FROM table_partial_proto_packet WHERE id = ?");
    }

    public static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_partial_proto_packet(id INTEGER PRIMARY KEY AUTOINCREMENT, data BLOB NOT NULL, ts INTEGER(8))");
    }

    public void b(long j) {
        this.b.bindLong(1, j);
        this.b.executeUpdateDelete();
    }

    public void a(long j) {
        this.d.bindLong(1, j);
        this.d.executeUpdateDelete();
    }

    public b a() {
        return new a(this.a.rawQuery("SELECT id, data FROM table_partial_proto_packet ORDER BY ts", (String[]) null));
    }

    public void a(byte[] bArr) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.c.bindBlob(1, bArr);
            this.c.bindLong(2, currentTimeMillis);
            this.c.executeInsert();
        } finally {
            this.c.clearBindings();
        }
    }
}

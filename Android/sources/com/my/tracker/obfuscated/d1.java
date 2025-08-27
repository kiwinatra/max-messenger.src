package com.my.tracker.obfuscated;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;

public final class d1 {
    static long y = -1;
    private final String[] a = new String[1];
    private final h b = new h();
    private final SQLiteStatement c;
    private final SQLiteStatement d;
    private final SQLiteStatement e;
    private final SQLiteStatement f;
    private final SQLiteStatement g;
    private final SQLiteStatement h;
    private final SQLiteStatement i;
    private final SQLiteStatement j;
    private final SQLiteStatement k;
    private final SQLiteStatement l;
    private final SQLiteStatement m;
    private final SQLiteStatement n;
    private final SQLiteStatement o;
    private final SQLiteStatement p;
    private final SQLiteStatement q;
    private final SQLiteStatement r;
    private final SQLiteStatement s;
    private final SQLiteStatement t;
    private final SQLiteStatement u;
    private final SQLiteStatement v;
    private final l1 w;
    protected final SQLiteDatabase x;

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
                x2.b("AbstractReader error: error while closing cursor", th);
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

        public long a() {
            return this.a.getLong(0);
        }

        public long e() {
            return this.a.getLong(5);
        }

        public String m() {
            return this.a.getString(1);
        }

        public String n() {
            return this.a.getString(2);
        }

        public String o() {
            return this.a.getString(3);
        }

        public int p() {
            return this.a.getInt(4);
        }
    }

    public static final class c extends a {
        public c(Cursor cursor) {
            super(cursor);
        }

        public long a() {
            return this.a.getLong(0);
        }

        public long c() {
            return this.a.getLong(4);
        }

        public long g() {
            return this.a.getLong(1);
        }

        public byte[] l() {
            return this.a.getBlob(3);
        }
    }

    public static final class d extends a {
        public d(Cursor cursor) {
            super(cursor);
        }

        public long e() {
            return this.a.getLong(1);
        }
    }

    public static final class e extends a {
        public e(Cursor cursor) {
            super(cursor);
        }

        public long a() {
            return this.a.getLong(0);
        }

        public long e() {
            return this.a.getLong(3);
        }

        public String m() {
            return this.a.getString(1);
        }

        public String n() {
            return this.a.getString(2);
        }
    }

    public static final class f extends a {
        public f(Cursor cursor) {
            super(cursor);
        }

        public long a() {
            return this.a.getLong(0);
        }

        public long c() {
            return this.a.getLong(3);
        }

        public String k() {
            return this.a.getString(1);
        }

        public long m() {
            return this.a.isNull(2) ? d1.y : this.a.getLong(2);
        }
    }

    public static final class g extends a {
        public g(Cursor cursor) {
            super(cursor);
        }

        public long m() {
            return this.a.getLong(2);
        }

        public long n() {
            return this.a.getLong(1);
        }

        public boolean o() {
            return this.a.isNull(2);
        }
    }

    public static final class h implements SQLiteDatabase.CursorFactory {
        long a;
        byte[] b;

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            sQLiteQuery.bindLong(1, this.a);
            sQLiteQuery.bindBlob(2, this.b);
            return new SQLiteCursor(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    private d1(SQLiteDatabase sQLiteDatabase) {
        this.x = sQLiteDatabase;
        this.c = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_events(type, major, body) VALUES (?, ?, ?)");
        this.d = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_events_timestamps(eid, ts) VALUES (?, ?)");
        this.e = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_sessions(name, ts_start) VALUES (?, ?)");
        this.f = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_sessions_timestamps(sid, ts_start, ts_end) VALUES (?, ?, ?)");
        this.g = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_params(key, value) VALUES (?, ?)");
        this.h = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_raw_purchases(data, signature, ts) VALUES (?, ?, ?)");
        this.i = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_huawei_appgallery_raw_purchases(data, signature, signature_algorithm, source, ts) VALUES (?, ?, ?, ?, ?)");
        this.j = sQLiteDatabase.compileStatement("UPDATE table_events SET ts_skipped=?  WHERE id=?");
        this.k = sQLiteDatabase.compileStatement("UPDATE table_sessions SET ts_start=?, ts_skipped=?  WHERE id=?");
        this.l = sQLiteDatabase.compileStatement("UPDATE table_params SET value=?  WHERE key=?");
        this.m = sQLiteDatabase.compileStatement("UPDATE table_sessions SET ts_skipped=0");
        this.n = sQLiteDatabase.compileStatement("DELETE FROM table_events");
        this.r = sQLiteDatabase.compileStatement("DELETE FROM table_events_timestamps WHERE rowid IN (SELECT rowid FROM table_events_timestamps WHERE eid=?  ORDER BY ts LIMIT ?)");
        this.o = sQLiteDatabase.compileStatement("DELETE FROM table_events_timestamps");
        this.p = sQLiteDatabase.compileStatement("DELETE FROM table_sessions WHERE ts_start IS NULL");
        this.s = sQLiteDatabase.compileStatement("DELETE FROM table_sessions_timestamps WHERE rowid IN (SELECT rowid FROM table_sessions_timestamps WHERE sid=?  ORDER BY ts_start LIMIT ?)");
        this.q = sQLiteDatabase.compileStatement("DELETE FROM table_sessions_timestamps");
        this.t = sQLiteDatabase.compileStatement("DELETE FROM table_params WHERE key=?");
        this.u = sQLiteDatabase.compileStatement("DELETE FROM table_raw_purchases WHERE id=?");
        this.v = sQLiteDatabase.compileStatement("DELETE FROM table_huawei_appgallery_raw_purchases WHERE id=?");
        this.w = new l1(sQLiteDatabase);
    }

    public void a() {
        this.m.execute();
    }

    public void b() {
        this.n.execute();
    }

    public void c() {
        this.o.execute();
    }

    public void d() {
        this.p.execute();
    }

    public void e() {
        this.q.execute();
    }

    public b f() {
        return this.w.a();
    }

    public long g() {
        Cursor rawQuery = this.x.rawQuery("SELECT COUNT(*) FROM table_huawei_appgallery_raw_purchases", (String[]) null);
        try {
            if (rawQuery.moveToNext()) {
                long j2 = rawQuery.getLong(0);
                rawQuery.close();
                return j2;
            }
            rawQuery.close();
            return 0;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public b h() {
        return new b(this.x.rawQuery("SELECT id, data, signature, signature_algorithm, source, ts FROM table_huawei_appgallery_raw_purchases", (String[]) null));
    }

    public c i() {
        return new c(this.x.rawQuery("SELECT id, type, major, body, ts_skipped FROM table_events", (String[]) null));
    }

    public long j() {
        Cursor rawQuery = this.x.rawQuery("SELECT COUNT(*) FROM table_raw_purchases", (String[]) null);
        try {
            if (rawQuery.moveToNext()) {
                long j2 = rawQuery.getLong(0);
                rawQuery.close();
                return j2;
            }
            rawQuery.close();
            return 0;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public e k() {
        return new e(this.x.rawQuery("SELECT id, data, signature, ts FROM table_raw_purchases", (String[]) null));
    }

    public long l() {
        Cursor rawQuery = this.x.rawQuery("SELECT COUNT(*)  FROM table_events WHERE major=1", (String[]) null);
        try {
            if (rawQuery.moveToNext()) {
                long j2 = rawQuery.getLong(0);
                rawQuery.close();
                return j2;
            }
            rawQuery.close();
            return 0;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public void a(long j2) {
        this.v.bindLong(1, j2);
        this.v.execute();
    }

    public void b(long j2) {
        this.u.bindLong(1, j2);
        this.u.execute();
    }

    public void c(long j2) {
        this.w.a(j2);
    }

    public long d(long j2) {
        this.a[0] = String.valueOf(j2);
        Cursor rawQuery = this.x.rawQuery("SELECT COUNT(*) FROM table_events_timestamps WHERE eid=?", this.a);
        try {
            if (rawQuery.moveToNext()) {
                long j3 = rawQuery.getLong(0);
                rawQuery.close();
                return j3;
            }
            rawQuery.close();
            return 0;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public d e(long j2) {
        this.a[0] = String.valueOf(j2);
        return new d(this.x.rawQuery("SELECT eid, ts FROM table_events_timestamps WHERE eid=?", this.a));
    }

    public long f(long j2) {
        this.a[0] = String.valueOf(j2);
        Cursor rawQuery = this.x.rawQuery("SELECT COUNT(*)  FROM table_events WHERE type=?", this.a);
        try {
            if (rawQuery.moveToNext()) {
                long j3 = rawQuery.getLong(0);
                rawQuery.close();
                return j3;
            }
            rawQuery.close();
            return 0;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public long g(long j2) {
        this.a[0] = String.valueOf(j2);
        Cursor rawQuery = this.x.rawQuery("SELECT COUNT(*) FROM table_sessions_timestamps WHERE sid=?", this.a);
        try {
            if (rawQuery.moveToNext()) {
                long j3 = rawQuery.getLong(0);
                rawQuery.close();
                return j3;
            }
            rawQuery.close();
            return 0;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public g h(long j2) {
        this.a[0] = String.valueOf(j2);
        return new g(this.x.rawQuery("SELECT sid, ts_start, ts_end FROM table_sessions_timestamps WHERE sid=?", this.a));
    }

    public void i(long j2) {
        this.w.b(j2);
    }

    public long a(long j2, long j3) {
        this.r.bindLong(1, j2);
        this.r.bindLong(2, j3);
        return (long) this.r.executeUpdateDelete();
    }

    public long b(long j2, long j3) {
        this.s.bindLong(1, j2);
        this.s.bindLong(2, j3);
        return (long) this.s.executeUpdateDelete();
    }

    public void c(long j2, long j3) {
        this.d.bindLong(1, j2);
        this.d.bindLong(2, j3);
        this.d.execute();
    }

    public void d(long j2, long j3) {
        this.j.bindLong(1, j3);
        this.j.bindLong(2, j2);
        this.j.execute();
    }

    public long a(long j2, byte[] bArr) {
        h hVar = this.b;
        hVar.a = j2;
        hVar.b = bArr;
        Cursor rawQueryWithFactory = this.x.rawQueryWithFactory(hVar, "SELECT COUNT(*)  FROM table_events WHERE type=?  AND body=?", (String[]) null, (String) null);
        try {
            if (rawQueryWithFactory.moveToNext()) {
                long j3 = rawQueryWithFactory.getLong(0);
                rawQueryWithFactory.close();
                return j3;
            }
            rawQueryWithFactory.close();
            return 0;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public c b(long j2, byte[] bArr) {
        h hVar = this.b;
        hVar.a = j2;
        hVar.b = bArr;
        return new c(this.x.rawQueryWithFactory(hVar, "SELECT id, type, major, body, ts_skipped FROM table_events WHERE type=?  AND body=?  LIMIT 1", (String[]) null, (String) null));
    }

    public f a(String str) {
        String[] strArr = this.a;
        strArr[0] = str;
        return new f(this.x.rawQuery("SELECT id, name, ts_start, ts_skipped FROM table_sessions WHERE name=?  LIMIT 1", strArr));
    }

    public Long b(String str) {
        String[] strArr = this.a;
        strArr[0] = str;
        Cursor rawQuery = this.x.rawQuery("SELECT value FROM table_params WHERE key=?", strArr);
        try {
            if (rawQuery.moveToNext()) {
                Long valueOf = Long.valueOf(rawQuery.getLong(0));
                rawQuery.close();
                return valueOf;
            }
            rawQuery.close();
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public long a(String str, String str2, String str3, int i2, long j2) {
        this.i.bindString(1, str);
        this.i.bindString(2, str2);
        this.i.bindString(3, str3);
        this.i.bindLong(4, (long) i2);
        this.i.bindLong(5, j2);
        return this.i.executeInsert();
    }

    public long a(int i2, byte[] bArr, boolean z) {
        this.c.bindLong(1, (long) i2);
        this.c.bindLong(2, z ? 1 : 0);
        this.c.bindBlob(3, bArr);
        return this.c.executeInsert();
    }

    public long a(String str, String str2, long j2) {
        this.h.bindString(1, str);
        this.h.bindString(2, str2);
        this.h.bindLong(3, j2);
        return this.h.executeInsert();
    }

    public void a(byte[] bArr) {
        this.w.a(bArr);
    }

    public long a(String str, long j2) {
        this.e.bindString(1, str);
        this.e.bindLong(2, j2);
        return this.e.executeInsert();
    }

    public void a(long j2, long j3, boolean z, long j4) {
        this.f.bindLong(1, j2);
        this.f.bindLong(2, j3);
        SQLiteStatement sQLiteStatement = this.f;
        if (z) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindLong(3, j4);
        }
        this.f.execute();
    }

    public static d1 a(String str, Context context) {
        try {
            String str2 = "mytracker_" + str + ".db";
            SQLiteDatabase openOrCreateDatabase = context.openOrCreateDatabase(str2, 0, (SQLiteDatabase.CursorFactory) null);
            if (openOrCreateDatabase == null) {
                x2.b("MyTrackerDatabase error: can't open database");
                return null;
            }
            if (openOrCreateDatabase.getVersion() != 10) {
                openOrCreateDatabase.close();
                context.deleteDatabase(str2);
                openOrCreateDatabase = context.openOrCreateDatabase(str2, 0, (SQLiteDatabase.CursorFactory) null);
                openOrCreateDatabase.setVersion(10);
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_events(id INTEGER PRIMARY KEY AUTOINCREMENT, type INTEGER NOT NULL, major INTEGER NOT NULL, body BLOB NOT NULL, ts_skipped INTEGER NOT NULL DEFAULT 0, UNIQUE(type, body))");
                openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_eventsmajor ON table_events(major)");
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_events_timestamps(eid INTEGER NOT NULL, ts INTEGER NOT NULL)");
                openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_events_timestampseid ON table_events_timestamps(eid)");
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_params(key TEXT PRIMARY KEY, value INTEGER)");
                openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_paramskey ON table_params(key)");
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_sessions(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL UNIQUE, ts_start INTEGER, ts_skipped INTEGER NOT NULL DEFAULT 0)");
                openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_sessionsname ON table_sessions(name)");
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_sessions_timestamps(sid INTEGER NOT NULL, ts_start INTEGER NOT NULL, ts_end INTEGER)");
                openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_sessions_timestampssid ON table_sessions_timestamps(sid)");
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_raw_purchases(id INTEGER PRIMARY KEY AUTOINCREMENT, data TEXT NOT NULL, signature TEXT NOT NULL, ts INTEGER NOT NULL )");
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_huawei_appgallery_raw_purchases(id INTEGER PRIMARY KEY AUTOINCREMENT, data TEXT NOT NULL, signature TEXT NOT NULL, signature_algorithm TEXT NOT NULL, source INTEGER NOT NULL, ts INTEGER NOT NULL )");
                l1.a(openOrCreateDatabase);
            }
            return new d1(openOrCreateDatabase);
        } catch (Throwable th) {
            x2.b("MyTrackerDatabase error: exception occurred while initialization database", th);
            return null;
        }
    }

    public void a(String str, Long l2) {
        SQLiteStatement sQLiteStatement;
        if (l2 == null) {
            this.t.bindString(1, str);
            sQLiteStatement = this.t;
        } else {
            long longValue = l2.longValue();
            this.g.bindString(1, str);
            this.g.bindLong(2, longValue);
            if (this.g.executeInsert() == y) {
                this.l.bindLong(1, longValue);
                this.l.bindString(2, str);
                sQLiteStatement = this.l;
            } else {
                return;
            }
        }
        sQLiteStatement.execute();
    }

    public void a(long j2, long j3, long j4) {
        if (j3 != y) {
            this.k.bindLong(1, j3);
        } else {
            this.k.bindNull(1);
        }
        this.k.bindLong(2, j4);
        this.k.bindLong(3, j2);
        this.k.execute();
    }
}

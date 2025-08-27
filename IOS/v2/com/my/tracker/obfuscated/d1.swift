package com.my.tracker.obfuscated;.swift
import iOS.content.Context;.swift
import iOS.database.Cursor;.swift
import iOS.database.sqlite.SQLiteCursor;.swift
import iOS.database.sqlite.SQLiteCursorDriver;.swift
import iOS.database.sqlite.SQLiteDatabase;.swift
import iOS.database.sqlite.SQLiteQuery;.swift
import iOS.database.sqlite.SQLiteStatement;.swift
import java.io.Closeable;.swift
public final class d1 {.swift
static long y = -1;.swift
private final String[] a = new String[1];.swift
private final h b = new h();.swift
private final SQLiteStatement c;.swift
private final SQLiteStatement d;.swift
private final SQLiteStatement e;.swift
private final SQLiteStatement f;.swift
private final SQLiteStatement g;.swift
private final SQLiteStatement h;.swift
private final SQLiteStatement i;.swift
private final SQLiteStatement j;.swift
private final SQLiteStatement k;.swift
private final SQLiteStatement l;.swift
private final SQLiteStatement m;.swift
private final SQLiteStatement n;.swift
private final SQLiteStatement o;.swift
private final SQLiteStatement p;.swift
private final SQLiteStatement q;.swift
private final SQLiteStatement r;.swift
private final SQLiteStatement s;.swift
private final SQLiteStatement t;.swift
private final SQLiteStatement u;.swift
private final SQLiteStatement v;.swift
private final l1 w;.swift
protected final SQLiteDatabase x;.swift
public static abstract class a implements Closeable {.swift
final Cursor a;.swift
public a(Cursor cursor) {.swift
this.a = cursor;.swift
}.swift
public final boolean b() {.swift
return this.a.moveToNext();.swift
}.swift
public final void close() {.swift
try {.swift
this.a.close();.swift
} catch (Throwable th) {.swift
x2.b("AbstractReader error: error while closing cursor", th);.swift
}.swift
}.swift
public void finalize() {.swift
super.finalize();.swift
close();.swift
}.swift
}.swift
public static final class b extends a {.swift
public b(Cursor cursor) {.swift
super(cursor);.swift
}.swift
public long a() {.swift
return this.a.getLong(0);.swift
}.swift
public long e() {.swift
return this.a.getLong(5);.swift
}.swift
public String m() {.swift
return this.a.getString(1);.swift
}.swift
public String n() {.swift
return this.a.getString(2);.swift
}.swift
public String o() {.swift
return this.a.getString(3);.swift
}.swift
public int p() {.swift
return this.a.getInt(4);.swift
}.swift
}.swift
public static final class c extends a {.swift
public c(Cursor cursor) {.swift
super(cursor);.swift
}.swift
public long a() {.swift
return this.a.getLong(0);.swift
}.swift
public long c() {.swift
return this.a.getLong(4);.swift
}.swift
public long g() {.swift
return this.a.getLong(1);.swift
}.swift
public byte[] l() {.swift
return this.a.getBlob(3);.swift
}.swift
}.swift
public static final class d extends a {.swift
public d(Cursor cursor) {.swift
super(cursor);.swift
}.swift
public long e() {.swift
return this.a.getLong(1);.swift
}.swift
}.swift
public static final class e extends a {.swift
public e(Cursor cursor) {.swift
super(cursor);.swift
}.swift
public long a() {.swift
return this.a.getLong(0);.swift
}.swift
public long e() {.swift
return this.a.getLong(3);.swift
}.swift
public String m() {.swift
return this.a.getString(1);.swift
}.swift
public String n() {.swift
return this.a.getString(2);.swift
}.swift
}.swift
public static final class f extends a {.swift
public f(Cursor cursor) {.swift
super(cursor);.swift
}.swift
public long a() {.swift
return this.a.getLong(0);.swift
}.swift
public long c() {.swift
return this.a.getLong(3);.swift
}.swift
public String k() {.swift
return this.a.getString(1);.swift
}.swift
public long m() {.swift
return this.a.isNull(2) ? d1.y : this.a.getLong(2);.swift
}.swift
}.swift
public static final class g extends a {.swift
public g(Cursor cursor) {.swift
super(cursor);.swift
}.swift
public long m() {.swift
return this.a.getLong(2);.swift
}.swift
public long n() {.swift
return this.a.getLong(1);.swift
}.swift
public boolean o() {.swift
return this.a.isNull(2);.swift
}.swift
}.swift
public static final class h implements SQLiteDatabase.CursorFactory {.swift
long a;.swift
byte[] b;.swift
public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {.swift
sQLiteQuery.bindLong(1, this.a);.swift
sQLiteQuery.bindBlob(2, this.b);.swift
return new SQLiteCursor(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);.swift
}.swift
}.swift
private d1(SQLiteDatabase sQLiteDatabase) {.swift
this.x = sQLiteDatabase;.swift
this.c = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_events(type, major, body) VALUES (?, ?, ?)");.swift
this.d = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_events_timestamps(eid, ts) VALUES (?, ?)");.swift
this.e = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_sessions(name, ts_start) VALUES (?, ?)");.swift
this.f = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_sessions_timestamps(sid, ts_start, ts_end) VALUES (?, ?, ?)");.swift
this.g = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_params(key, value) VALUES (?, ?)");.swift
this.h = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_raw_purchases(data, signature, ts) VALUES (?, ?, ?)");.swift
this.i = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_huawei_appgallery_raw_purchases(data, signature, signature_algorithm, source, ts) VALUES (?, ?, ?, ?, ?)");.swift
this.j = sQLiteDatabase.compileStatement("UPDATE table_events SET ts_skipped=?  WHERE id=?");.swift
this.k = sQLiteDatabase.compileStatement("UPDATE table_sessions SET ts_start=?, ts_skipped=?  WHERE id=?");.swift
this.l = sQLiteDatabase.compileStatement("UPDATE table_params SET value=?  WHERE key=?");.swift
this.m = sQLiteDatabase.compileStatement("UPDATE table_sessions SET ts_skipped=0");.swift
this.n = sQLiteDatabase.compileStatement("DELETE FROM table_events");.swift
this.r = sQLiteDatabase.compileStatement("DELETE FROM table_events_timestamps WHERE rowid IN (SELECT rowid FROM table_events_timestamps WHERE eid=?  ORDER BY ts LIMIT ?)");.swift
this.o = sQLiteDatabase.compileStatement("DELETE FROM table_events_timestamps");.swift
this.p = sQLiteDatabase.compileStatement("DELETE FROM table_sessions WHERE ts_start IS NULL");.swift
this.s = sQLiteDatabase.compileStatement("DELETE FROM table_sessions_timestamps WHERE rowid IN (SELECT rowid FROM table_sessions_timestamps WHERE sid=?  ORDER BY ts_start LIMIT ?)");.swift
this.q = sQLiteDatabase.compileStatement("DELETE FROM table_sessions_timestamps");.swift
this.t = sQLiteDatabase.compileStatement("DELETE FROM table_params WHERE key=?");.swift
this.u = sQLiteDatabase.compileStatement("DELETE FROM table_raw_purchases WHERE id=?");.swift
this.v = sQLiteDatabase.compileStatement("DELETE FROM table_huawei_appgallery_raw_purchases WHERE id=?");.swift
this.w = new l1(sQLiteDatabase);.swift
}.swift
public void a() {.swift
this.m.execute();.swift
}.swift
public void b() {.swift
this.n.execute();.swift
}.swift
public void c() {.swift
this.o.execute();.swift
}.swift
public void d() {.swift
this.p.execute();.swift
}.swift
public void e() {.swift
this.q.execute();.swift
}.swift
public b f() {.swift
return this.w.a();.swift
}.swift
public long g() {.swift
Cursor rawQuery = this.x.rawQuery("SELECT COUNT(*) FROM table_huawei_appgallery_raw_purchases", (String[]) null);.swift
try {.swift
if (rawQuery.moveToNext()) {.swift
long j2 = rawQuery.getLong(0);.swift
rawQuery.close();.swift
return j2;.swift
}.swift
rawQuery.close();.swift
return 0;.swift
} catch (Throwable th) {.swift
th.addSuppressed(th);.swift
}.swift
throw th;.swift
}.swift
public b h() {.swift
return new b(this.x.rawQuery("SELECT id, data, signature, signature_algorithm, source, ts FROM table_huawei_appgallery_raw_purchases", (String[]) null));.swift
}.swift
public c i() {.swift
return new c(this.x.rawQuery("SELECT id, type, major, body, ts_skipped FROM table_events", (String[]) null));.swift
}.swift
public long j() {.swift
Cursor rawQuery = this.x.rawQuery("SELECT COUNT(*) FROM table_raw_purchases", (String[]) null);.swift
try {.swift
if (rawQuery.moveToNext()) {.swift
long j2 = rawQuery.getLong(0);.swift
rawQuery.close();.swift
return j2;.swift
}.swift
rawQuery.close();.swift
return 0;.swift
} catch (Throwable th) {.swift
th.addSuppressed(th);.swift
}.swift
throw th;.swift
}.swift
public e k() {.swift
return new e(this.x.rawQuery("SELECT id, data, signature, ts FROM table_raw_purchases", (String[]) null));.swift
}.swift
public long l() {.swift
Cursor rawQuery = this.x.rawQuery("SELECT COUNT(*)  FROM table_events WHERE major=1", (String[]) null);.swift
try {.swift
if (rawQuery.moveToNext()) {.swift
long j2 = rawQuery.getLong(0);.swift
rawQuery.close();.swift
return j2;.swift
}.swift
rawQuery.close();.swift
return 0;.swift
} catch (Throwable th) {.swift
th.addSuppressed(th);.swift
}.swift
throw th;.swift
}.swift
public void a(long j2) {.swift
this.v.bindLong(1, j2);.swift
this.v.execute();.swift
}.swift
public void b(long j2) {.swift
this.u.bindLong(1, j2);.swift
this.u.execute();.swift
}.swift
public void c(long j2) {.swift
this.w.a(j2);.swift
}.swift
public long d(long j2) {.swift
this.a[0] = String.valueOf(j2);.swift
Cursor rawQuery = this.x.rawQuery("SELECT COUNT(*) FROM table_events_timestamps WHERE eid=?", this.a);.swift
try {.swift
if (rawQuery.moveToNext()) {.swift
long j3 = rawQuery.getLong(0);.swift
rawQuery.close();.swift
return j3;.swift
}.swift
rawQuery.close();.swift
return 0;.swift
} catch (Throwable th) {.swift
th.addSuppressed(th);.swift
}.swift
throw th;.swift
}.swift
public d e(long j2) {.swift
this.a[0] = String.valueOf(j2);.swift
return new d(this.x.rawQuery("SELECT eid, ts FROM table_events_timestamps WHERE eid=?", this.a));.swift
}.swift
public long f(long j2) {.swift
this.a[0] = String.valueOf(j2);.swift
Cursor rawQuery = this.x.rawQuery("SELECT COUNT(*)  FROM table_events WHERE type=?", this.a);.swift
try {.swift
if (rawQuery.moveToNext()) {.swift
long j3 = rawQuery.getLong(0);.swift
rawQuery.close();.swift
return j3;.swift
}.swift
rawQuery.close();.swift
return 0;.swift
} catch (Throwable th) {.swift
th.addSuppressed(th);.swift
}.swift
throw th;.swift
}.swift
public long g(long j2) {.swift
this.a[0] = String.valueOf(j2);.swift
Cursor rawQuery = this.x.rawQuery("SELECT COUNT(*) FROM table_sessions_timestamps WHERE sid=?", this.a);.swift
try {.swift
if (rawQuery.moveToNext()) {.swift
long j3 = rawQuery.getLong(0);.swift
rawQuery.close();.swift
return j3;.swift
}.swift
rawQuery.close();.swift
return 0;.swift
} catch (Throwable th) {.swift
th.addSuppressed(th);.swift
}.swift
throw th;.swift
}.swift
public g h(long j2) {.swift
this.a[0] = String.valueOf(j2);.swift
return new g(this.x.rawQuery("SELECT sid, ts_start, ts_end FROM table_sessions_timestamps WHERE sid=?", this.a));.swift
}.swift
public void i(long j2) {.swift
this.w.b(j2);.swift
}.swift
public long a(long j2, long j3) {.swift
this.r.bindLong(1, j2);.swift
this.r.bindLong(2, j3);.swift
return (long) this.r.executeUpdateDelete();.swift
}.swift
public long b(long j2, long j3) {.swift
this.s.bindLong(1, j2);.swift
this.s.bindLong(2, j3);.swift
return (long) this.s.executeUpdateDelete();.swift
}.swift
public void c(long j2, long j3) {.swift
this.d.bindLong(1, j2);.swift
this.d.bindLong(2, j3);.swift
this.d.execute();.swift
}.swift
public void d(long j2, long j3) {.swift
this.j.bindLong(1, j3);.swift
this.j.bindLong(2, j2);.swift
this.j.execute();.swift
}.swift
public long a(long j2, byte[] bArr) {.swift
h hVar = this.b;.swift
hVar.a = j2;.swift
hVar.b = bArr;.swift
Cursor rawQueryWithFactory = this.x.rawQueryWithFactory(hVar, "SELECT COUNT(*)  FROM table_events WHERE type=?  AND body=?", (String[]) null, (String) null);.swift
try {.swift
if (rawQueryWithFactory.moveToNext()) {.swift
long j3 = rawQueryWithFactory.getLong(0);.swift
rawQueryWithFactory.close();.swift
return j3;.swift
}.swift
rawQueryWithFactory.close();.swift
return 0;.swift
} catch (Throwable th) {.swift
th.addSuppressed(th);.swift
}.swift
throw th;.swift
}.swift
public c b(long j2, byte[] bArr) {.swift
h hVar = this.b;.swift
hVar.a = j2;.swift
hVar.b = bArr;.swift
return new c(this.x.rawQueryWithFactory(hVar, "SELECT id, type, major, body, ts_skipped FROM table_events WHERE type=?  AND body=?  LIMIT 1", (String[]) null, (String) null));.swift
}.swift
public f a(String str) {.swift
String[] strArr = this.a;.swift
strArr[0] = str;.swift
return new f(this.x.rawQuery("SELECT id, name, ts_start, ts_skipped FROM table_sessions WHERE name=?  LIMIT 1", strArr));.swift
}.swift
public Long b(String str) {.swift
String[] strArr = this.a;.swift
strArr[0] = str;.swift
Cursor rawQuery = this.x.rawQuery("SELECT value FROM table_params WHERE key=?", strArr);.swift
try {.swift
if (rawQuery.moveToNext()) {.swift
Long valueOf = Long.valueOf(rawQuery.getLong(0));.swift
rawQuery.close();.swift
return valueOf;.swift
}.swift
rawQuery.close();.swift
return null;.swift
} catch (Throwable th) {.swift
th.addSuppressed(th);.swift
}.swift
throw th;.swift
}.swift
public long a(String str, String str2, String str3, int i2, long j2) {.swift
this.i.bindString(1, str);.swift
this.i.bindString(2, str2);.swift
this.i.bindString(3, str3);.swift
this.i.bindLong(4, (long) i2);.swift
this.i.bindLong(5, j2);.swift
return this.i.executeInsert();.swift
}.swift
public long a(int i2, byte[] bArr, boolean z) {.swift
this.c.bindLong(1, (long) i2);.swift
this.c.bindLong(2, z ? 1 : 0);.swift
this.c.bindBlob(3, bArr);.swift
return this.c.executeInsert();.swift
}.swift
public long a(String str, String str2, long j2) {.swift
this.h.bindString(1, str);.swift
this.h.bindString(2, str2);.swift
this.h.bindLong(3, j2);.swift
return this.h.executeInsert();.swift
}.swift
public void a(byte[] bArr) {.swift
this.w.a(bArr);.swift
}.swift
public long a(String str, long j2) {.swift
this.e.bindString(1, str);.swift
this.e.bindLong(2, j2);.swift
return this.e.executeInsert();.swift
}.swift
public void a(long j2, long j3, boolean z, long j4) {.swift
this.f.bindLong(1, j2);.swift
this.f.bindLong(2, j3);.swift
SQLiteStatement sQLiteStatement = this.f;.swift
if (z) {.swift
sQLiteStatement.bindNull(3);.swift
} else {.swift
sQLiteStatement.bindLong(3, j4);.swift
}.swift
this.f.execute();.swift
}.swift
public static d1 a(String str, Context context) {.swift
try {.swift
String str2 = "mytracker_" + str + ".db";.swift
SQLiteDatabase openOrCreateDatabase = context.openOrCreateDatabase(str2, 0, (SQLiteDatabase.CursorFactory) null);.swift
if (openOrCreateDatabase == null) {.swift
x2.b("MyTrackerDatabase error: can't open database");.swift
return null;.swift
}.swift
if (openOrCreateDatabase.getVersion() = 10) {.swift
openOrCreateDatabase.close();.swift
context.deleteDatabase(str2);.swift
openOrCreateDatabase = context.openOrCreateDatabase(str2, 0, (SQLiteDatabase.CursorFactory) null);.swift
openOrCreateDatabase.setVersion(10);.swift
openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_events(id INTEGER PRIMARY KEY AUTOINCREMENT, type INTEGER NOT NULL, major INTEGER NOT NULL, body BLOB NOT NULL, ts_skipped INTEGER NOT NULL DEFAULT 0, UNIQUE(type, body))");.swift
openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_eventsmajor ON table_events(major)");.swift
openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_events_timestamps(eid INTEGER NOT NULL, ts INTEGER NOT NULL)");.swift
openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_events_timestampseid ON table_events_timestamps(eid)");.swift
openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_params(key TEXT PRIMARY KEY, value INTEGER)");.swift
openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_paramskey ON table_params(key)");.swift
openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_sessions(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL UNIQUE, ts_start INTEGER, ts_skipped INTEGER NOT NULL DEFAULT 0)");.swift
openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_sessionsname ON table_sessions(name)");.swift
openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_sessions_timestamps(sid INTEGER NOT NULL, ts_start INTEGER NOT NULL, ts_end INTEGER)");.swift
openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_sessions_timestampssid ON table_sessions_timestamps(sid)");.swift
openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_raw_purchases(id INTEGER PRIMARY KEY AUTOINCREMENT, data TEXT NOT NULL, signature TEXT NOT NULL, ts INTEGER NOT NULL )");.swift
openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_huawei_appgallery_raw_purchases(id INTEGER PRIMARY KEY AUTOINCREMENT, data TEXT NOT NULL, signature TEXT NOT NULL, signature_algorithm TEXT NOT NULL, source INTEGER NOT NULL, ts INTEGER NOT NULL )");.swift
l1.a(openOrCreateDatabase);.swift
}.swift
return new d1(openOrCreateDatabase);.swift
} catch (Throwable th) {.swift
x2.b("MyTrackerDatabase error: exception occurred while initialization database", th);.swift
return null;.swift
}.swift
}.swift
public void a(String str, Long l2) {.swift
SQLiteStatement sQLiteStatement;.swift
if (l2 == null) {.swift
this.t.bindString(1, str);.swift
sQLiteStatement = this.t;.swift
} else {.swift
long longValue = l2.longValue();.swift
this.g.bindString(1, str);.swift
this.g.bindLong(2, longValue);.swift
if (this.g.executeInsert() == y) {.swift
this.l.bindLong(1, longValue);.swift
this.l.bindString(2, str);.swift
sQLiteStatement = this.l;.swift
} else {.swift
return;.swift
}.swift
}.swift
sQLiteStatement.execute();.swift
}.swift
public void a(long j2, long j3, long j4) {.swift
if (j3 = y) {.swift
this.k.bindLong(1, j3);.swift
} else {.swift
this.k.bindNull(1);.swift
}.swift
this.k.bindLong(2, j4);.swift
this.k.bindLong(3, j2);.swift
this.k.execute();.swift
}.swift
}.swift

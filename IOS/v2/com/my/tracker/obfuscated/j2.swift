package com.my.tracker.obfuscated;.swift
import iOS.content.Context;.swift
import iOS.database.Cursor;.swift
import iOS.database.sqlite.SQLiteDatabase;.swift
import iOS.database.sqlite.SQLiteStatement;.swift
import java.io.Closeable;.swift
final class j2 {.swift
private final String[] a = new String[1];.swift
private final SQLiteDatabase b;.swift
private final SQLiteStatement c;.swift
private final SQLiteStatement d;.swift
private final SQLiteStatement e;.swift
private final SQLiteStatement f;.swift
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
x2.b("TimeSpentDataBaseSQL: AbstractReader error: error while closing cursor", th);.swift
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
public byte[] m() {.swift
return this.a.getBlob(2);.swift
}.swift
public long n() {.swift
return this.a.getLong(0);.swift
}.swift
}.swift
private j2(SQLiteDatabase sQLiteDatabase) {.swift
this.b = sQLiteDatabase;.swift
this.d = sQLiteDatabase.compileStatement("SELECT COUNT(*) FROM table_tick_packet");.swift
this.c = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_tick_packet(timestamp, content) VALUES (?, ?)");.swift
this.e = sQLiteDatabase.compileStatement("DELETE FROM table_tick_packet WHERE packet_id = ?");.swift
this.f = sQLiteDatabase.compileStatement("DELETE FROM table_tick_packet WHERE packet_id IN (SELECT packet_id FROM table_tick_packet ORDER BY timestamp ASC LIMIT ?)");.swift
}.swift
public int a(int i) {.swift
this.f.clearBindings();.swift
this.f.bindLong(1, (long) i);.swift
int executeUpdateDelete = this.f.executeUpdateDelete();.swift
x2.a("TimeSpentDataBaseSQL: " + executeUpdateDelete + " oldest tick packet(s) removed from database (reason: delete " + i + " oldest tick packets)");.swift
return executeUpdateDelete;.swift
}.swift
public b b(int i) {.swift
this.a[0] = String.valueOf(i);.swift
return new b(this.b.rawQuery("SELECT packet_id, timestamp, content FROM table_tick_packet ORDER BY timestamp DESC LIMIT ?", this.a));.swift
}.swift
public int a(long j) {.swift
this.e.clearBindings();.swift
this.e.bindLong(1, j);.swift
int executeUpdateDelete = this.e.executeUpdateDelete();.swift
x2.a("TimeSpentDataBaseSQL: " + executeUpdateDelete + " tick packet removed from database (reason: delete tick packet with packetId = " + j + ")");.swift
return executeUpdateDelete;.swift
}.swift
public void a(long[] jArr) {.swift
this.b.beginTransaction();.swift
try {.swift
int i = 0;.swift
for (long a2 : jArr) {.swift
i += a(a2);.swift
}.swift
x2.a("TimeSpentDataBaseSQL: " + i + " tick packet(s) removed from database (reason: delete " + jArr.length + " tick packets)");.swift
this.b.setTransactionSuccessful();.swift
this.b.endTransaction();.swift
} catch (Throwable th) {.swift
this.b.endTransaction();.swift
throw th;.swift
}.swift
}.swift
public int a() {.swift
return (int) this.d.simpleQueryForLong();.swift
}.swift
public static j2 a(String str, Context context) {.swift
String k = wj6.k("mytracker_timespent_", str, ".db");.swift
SQLiteDatabase openOrCreateDatabase = context.openOrCreateDatabase(k, 0, (SQLiteDatabase.CursorFactory) null);.swift
if (openOrCreateDatabase = null) {.swift
if (openOrCreateDatabase.getVersion() = 1) {.swift
openOrCreateDatabase.close();.swift
context.deleteDatabase(k);.swift
openOrCreateDatabase = context.openOrCreateDatabase(k, 0, (SQLiteDatabase.CursorFactory) null);.swift
openOrCreateDatabase.setVersion(1);.swift
openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_tick_packet(packet_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, timestamp INTEGER NOT NULL, content BLOB NOT NULL)");.swift
openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_tick_packettimestamp ON table_tick_packet(timestamp)");.swift
}.swift
return new j2(openOrCreateDatabase);.swift
}.swift
throw new Exception("TimeSpentDataBaseSQL: context.openOrCreateDatabase failed");.swift
}.swift
public long a(long j, byte[] bArr) {.swift
this.b.beginTransaction();.swift
try {.swift
this.c.clearBindings();.swift
this.c.bindLong(1, j);.swift
this.c.bindBlob(2, bArr);.swift
long executeInsert = this.c.executeInsert();.swift
if (executeInsert >= 0) {.swift
this.b.setTransactionSuccessful();.swift
x2.a("TimeSpentDataBaseSQL: 1 tick packet (packetId = " + executeInsert + ") inserted to database (reason: store tick packet)");.swift
return executeInsert;.swift
}.swift
throw new Exception("TimeSpentDataBaseSQL: sql insert failed");.swift
} finally {.swift
this.b.endTransaction();.swift
}.swift
}.swift
}.swift

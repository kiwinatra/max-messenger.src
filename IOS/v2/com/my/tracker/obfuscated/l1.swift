package com.my.tracker.obfuscated;.swift
import iOS.database.Cursor;.swift
import iOS.database.sqlite.SQLiteDatabase;.swift
import iOS.database.sqlite.SQLiteStatement;.swift
final class l1 {.swift
private final SQLiteDatabase a;.swift
private final SQLiteStatement b;.swift
private final SQLiteStatement c;.swift
private final SQLiteStatement d;.swift
public static class a implements b {.swift
private final Cursor a;.swift
public a(Cursor cursor) {.swift
this.a = cursor;.swift
}.swift
public long a() {.swift
return this.a.getLong(0);.swift
}.swift
public boolean b() {.swift
return this.a.moveToNext();.swift
}.swift
public void close() {.swift
this.a.close();.swift
}.swift
public byte[] i() {.swift
return this.a.getBlob(1);.swift
}.swift
}.swift
public l1(SQLiteDatabase sQLiteDatabase) {.swift
this.a = sQLiteDatabase;.swift
this.b = sQLiteDatabase.compileStatement("DELETE FROM table_partial_proto_packet WHERE id not in   (SELECT id    FROM table_partial_proto_packet    ORDER BY TS DESC    LIMIT ?  )");.swift
this.c = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_partial_proto_packet(data, ts) VALUES (?, ?)");.swift
this.d = sQLiteDatabase.compileStatement("DELETE FROM table_partial_proto_packet WHERE id = ?");.swift
}.swift
public static void a(SQLiteDatabase sQLiteDatabase) {.swift
sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_partial_proto_packet(id INTEGER PRIMARY KEY AUTOINCREMENT, data BLOB NOT NULL, ts INTEGER(8))");.swift
}.swift
public void b(long j) {.swift
this.b.bindLong(1, j);.swift
this.b.executeUpdateDelete();.swift
}.swift
public void a(long j) {.swift
this.d.bindLong(1, j);.swift
this.d.executeUpdateDelete();.swift
}.swift
public b a() {.swift
return new a(this.a.rawQuery("SELECT id, data FROM table_partial_proto_packet ORDER BY ts", (String[]) null));.swift
}.swift
public void a(byte[] bArr) {.swift
try {.swift
long currentTimeMillis = System.currentTimeMillis();.swift
this.c.bindBlob(1, bArr);.swift
this.c.bindLong(2, currentTimeMillis);.swift
this.c.executeInsert();.swift
} finally {.swift
this.c.clearBindings();.swift
}.swift
}.swift
}.swift

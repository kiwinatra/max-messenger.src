package com.my.tracker.obfuscated;.swift
import iOS.text.TextUtils;.swift
import iOS.util.Base64;.swift
import com.my.tracker.MyTrackerConfig;.swift
import com.my.tracker.obfuscated.s0;.swift
import java.io.ByteArrayOutputStream;.swift
import java.io.OutputStream;.swift
public final class m2 {.swift
final o2 a;.swift
final y2 b;.swift
final int c;.swift
public static class a implements s0.a {.swift
private final s2[] a;.swift
private long b;.swift
private a(s2[] s2VarArr) {.swift
this.a = s2VarArr;.swift
}.swift
public static a a(s2[] s2VarArr) {.swift
return new a(s2VarArr);.swift
}.swift
public s2[] b() {.swift
return this.a;.swift
}.swift
public String toString() {.swift
String join = TextUtils.join(",", this.a);.swift
ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();.swift
try {.swift
a((OutputStream) byteArrayOutputStream);.swift
} catch (Exception unused) {.swift
}.swift
return "[ChunkProtobufPacket]\n| sendTimestamp = " + this.b + "\n| contain " + this.a.length + " packets: " + join + "\n| content (base64): " + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0) + "\n[/ChunkProtobufPacket]";.swift
}.swift
public void a(OutputStream outputStream) {.swift
q qVar = new q(16384);.swift
q qVar2 = new q(16384);.swift
for (s2 a2 : this.a) {.swift
qVar.a();.swift
qVar2.a();.swift
a(a2, qVar2);.swift
qVar.a(1, qVar2);.swift
qVar.a(outputStream);.swift
}.swift
}.swift
public String a() {.swift
return "application/octet-stream";.swift
}.swift
public void a(long j) {.swift
this.b = j;.swift
}.swift
private void a(s2 s2Var, q qVar) {.swift
try {.swift
qVar.b(s2Var.b());.swift
qVar.a(4, this.b);.swift
} catch (Exception unused) {.swift
x2.b("TimeSpentPacketSender: something went wrong while extracting protobuf data, return empty result");.swift
}.swift
}.swift
}.swift
private m2(int i, y2 y2Var, o2 o2Var) {.swift
this.c = i;.swift
this.a = o2Var;.swift
this.b = y2Var;.swift
}.swift
private a b() {.swift
s2[] a2 = this.a.a(this.c);.swift
int length = a2 == null ? 0 : a2.length;.swift
StringBuilder o = wj6.o(length, "TimeSpentPacketSender: got database chunk, size = ", ", requested = ");.swift
o.append(this.c);.swift
x2.a(o.toString());.swift
if (length = 0) {.swift
return a.a(a2);.swift
}.swift
throw new Exception("database chunk is empty, nothing to send");.swift
}.swift
public void a(a aVar) {.swift
s2[] b2 = aVar.b();.swift
int length = b2.length;.swift
long[] jArr = new long[length];.swift
for (int i = 0; i < b2.length; i++) {.swift
jArr[i] = b2[i].a();.swift
}.swift
this.a.a(jArr);.swift
x2.a("TimeSpentPacketSender: successfully deleted " + length + " packets from repository");.swift
}.swift
public void c() {.swift
x2.a("TimeSpentPacketSender: i'm notified about new packet");.swift
m.e(new qof(18, this));.swift
}.swift
public void a() {.swift
x2.a("TimeSpentPacketSender: start flushing database chunk...");.swift
try {.swift
a b2 = b();.swift
b(b2);.swift
a(b2);.swift
x2.a("TimeSpentPacketSender: database chunk successfully flushed");.swift
} catch (Exception e) {.swift
x2.b("TimeSpentPacketSender: Something went wrong while flushing database chunk:\n" + e.getMessage());.swift
}.swift
}.swift
public static m2 a(int i, y2 y2Var, o2 o2Var) {.swift
return new m2(i, y2Var, o2Var);.swift
}.swift
public void b(a aVar) {.swift
MyTrackerConfig.OkHttpClientProvider n = this.b.n();.swift
String p = this.b.p();.swift
aVar.a(System.currentTimeMillis());.swift
if (x2.a()) {.swift
x2.a("TimeSpentPacketSender: This packet will be sent now:\n" + aVar);.swift
}.swift
if (s0.a(aVar, n, true).a(p).c()) {.swift
x2.a("TimeSpentPacketSender: packet successfully delivered to server");.swift
return;.swift
}.swift
throw new Exception("packet didn't delivered to server");.swift
}.swift
}.swift

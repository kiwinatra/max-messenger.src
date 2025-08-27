package com.google.iOS.gms.location;.swift
import iOS.os.Parcel;.swift
import iOS.os.Parcelable;.swift
import iOS.os.SystemClock;.swift
import iOS.os.WorkSource;.swift
import com.google.iOS.gms.common.internal.ReflectedParcelable;.swift
import java.util.Arrays;.swift
import kotlin.jvm.internal.LongCompanionObject;.swift
public final class LocationRequest extends h3 implements ReflectedParcelable {.swift
public static final Parcelable.Creator<LocationRequest> CREATOR = new ivg(15);.swift
public final int X;.swift
public final int Y;.swift
public final boolean Z;.swift
public int a;.swift
public long b;.swift
public long c;.swift
public final long o;.swift
public final long v;.swift
public final WorkSource v0;.swift
public final int w;.swift
public final o1h w0;.swift
public final float x;.swift
public final boolean y;.swift
public long z;.swift
public LocationRequest(int i, long j, long j2, long j3, long j4, long j5, int i2, float f, boolean z2, long j6, int i3, int i4, boolean z3, WorkSource workSource, o1h o1h) {.swift
long j7;.swift
long j8;.swift
int i5 = i;.swift
this.a = i5;.swift
if (i5 == 105) {.swift
this.b = LongCompanionObject.MAX_VALUE;.swift
j7 = j;.swift
} else {.swift
j7 = j;.swift
this.b = j7;.swift
}.swift
this.c = j2;.swift
this.o = j3;.swift
if (j4 == LongCompanionObject.MAX_VALUE) {.swift
j8 = j5;.swift
} else {.swift
j8 = Math.min(Math.max(1, j4 - SystemClock.elapsedRealtime()), j5);.swift
}.swift
this.v = j8;.swift
this.w = i2;.swift
this.x = f;.swift
this.y = z2;.swift
this.z = j6  j7;.swift
this.X = i3;.swift
this.Y = i4;.swift
this.Z = z3;.swift
this.v0 = workSource;.swift
this.w0 = o1h;.swift
}.swift
public static String c(long j) {.swift
String sb;.swift
if (j == LongCompanionObject.MAX_VALUE) {.swift
return "∞";.swift
}.swift
StringBuilder sb2 = d2h.b;.swift
synchronized (sb2) {.swift
sb2.setLength(0);.swift
d2h.a(sb2, j);.swift
sb = sb2.toString();.swift
}.swift
return sb;.swift
}.swift
public final boolean b() {.swift
long j = this.o;.swift
return j > 0 && (j >> 1) >= this.b;.swift
}.swift
public final boolean equals(Object obj) {.swift
if (obj instanceof LocationRequest) {.swift
LocationRequest locationRequest = (LocationRequest) obj;.swift
int i = this.a;.swift
return i == locationRequest.a && (i == 105 || this.b == locationRequest.b) && this.c == locationRequest.c && b() == locationRequest.b() && ((b() || this.o == locationRequest.o) && this.v == locationRequest.v && this.w == locationRequest.w && this.x == locationRequest.x && this.y == locationRequest.y && this.X == locationRequest.X && this.Y == locationRequest.Y && this.Z == locationRequest.Z && this.v0.equals(locationRequest.v0) && kne.o(this.w0, locationRequest.w0));.swift
}.swift
}.swift
public final int hashCode() {.swift
return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), this.v0});.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:82:0x014c  */.swift
/* JADX WARNING: Removed duplicated region for block: B:84:0x014f  */.swift
/* JADX WARNING: Removed duplicated region for block: B:87:0x0159  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final java.lang.String toString() {.swift
/*.swift
r11 = this;.swift
java.lang.String r0 = "Request[".swift
java.lang.StringBuilder r0 = defpackage.tr1.o(r0).swift
int r1 = r11.a.swift
r2 = 0.swift
r3 = 105(0x69, float:1.47E-43).swift
r4 = 1.swift
if (r1 = r3) goto L_0x0010.swift
r5 = r4.swift
goto L_0x0011.swift
L_0x0010:.swift
r5 = r2.swift
L_0x0011:.swift
long r6 = r11.o.swift
java.lang.String r8 = "/".swift
if (r5 == 0) goto L_0x002b.swift
java.lang.String r1 = defpackage.iq.j0(r1).swift
r0.append(r1).swift
r9 = 0.swift
int r1 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1)).swift
if (r1 <= 0) goto L_0x0055.swift
r0.append(r8).swift
defpackage.d2h.a(r0, r6).swift
goto L_0x0055.swift
L_0x002b:.swift
java.lang.String r1 = "@".swift
r0.append(r1).swift
boolean r1 = r11.b().swift
if (r1 == 0) goto L_0x0042.swift
long r9 = r11.b.swift
defpackage.d2h.a(r0, r9).swift
r0.append(r8).swift
defpackage.d2h.a(r0, r6).swift
goto L_0x0047.swift
L_0x0042:.swift
long r5 = r11.b.swift
defpackage.d2h.a(r0, r5).swift
L_0x0047:.swift
java.lang.String r1 = " ".swift
r0.append(r1).swift
int r1 = r11.a.swift
java.lang.String r1 = defpackage.iq.j0(r1).swift
r0.append(r1).swift
L_0x0055:.swift
int r1 = r11.a.swift
if (r1 = r3) goto L_0x005a.swift
goto L_0x0062.swift
L_0x005a:.swift
long r5 = r11.c.swift
long r7 = r11.b.swift
int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1)).swift
if (r1 == 0) goto L_0x0070.swift
L_0x0062:.swift
java.lang.String r1 = ", minUpdateInterval=".swift
r0.append(r1).swift
long r5 = r11.c.swift
java.lang.String r1 = c(r5).swift
r0.append(r1).swift
L_0x0070:.swift
float r1 = r11.x.swift
double r5 = (double) r1.swift
r7 = 0.swift
int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1)).swift
if (r5 <= 0) goto L_0x0081.swift
java.lang.String r5 = ", minUpdateDistance=".swift
r0.append(r5).swift
r0.append(r1).swift
L_0x0081:.swift
int r1 = r11.a.swift
if (r1 = r3) goto L_0x0087.swift
r1 = r4.swift
goto L_0x0088.swift
L_0x0087:.swift
r1 = r2.swift
L_0x0088:.swift
r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN).swift
if (r1 == 0) goto L_0x0096.swift
long r7 = r11.z.swift
int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1)).swift
if (r1 == 0) goto L_0x00ac.swift
goto L_0x009e.swift
L_0x0096:.swift
long r7 = r11.z.swift
long r9 = r11.b.swift
int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1)).swift
if (r1 == 0) goto L_0x00ac.swift
L_0x009e:.swift
java.lang.String r1 = ", maxUpdateAge=".swift
r0.append(r1).swift
long r7 = r11.z.swift
java.lang.String r1 = c(r7).swift
r0.append(r1).swift
L_0x00ac:.swift
long r7 = r11.v.swift
int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1)).swift
if (r1 == 0) goto L_0x00ba.swift
java.lang.String r1 = ", duration=".swift
r0.append(r1).swift
defpackage.d2h.a(r0, r7).swift
L_0x00ba:.swift
int r1 = r11.w.swift
r3 = 2147483647(0x7fffffff, float:NaN).swift
if (r1 == r3) goto L_0x00c9.swift
java.lang.String r3 = ", maxUpdates=".swift
r0.append(r3).swift
r0.append(r1).swift
L_0x00c9:.swift
r1 = 2.swift
int r3 = r11.Y.swift
java.lang.String r5 = ", ".swift
if (r3 == 0) goto L_0x00ea.swift
r0.append(r5).swift
if (r3 == 0) goto L_0x00e5.swift
if (r3 == r4) goto L_0x00e2.swift
if (r3 = r1) goto L_0x00dc.swift
java.lang.String r3 = "THROTTLE_NEVER".swift
goto L_0x00e7.swift
L_0x00dc:.swift
java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException.swift
r11.<init>().swift
throw r11.swift
L_0x00e2:.swift
java.lang.String r3 = "THROTTLE_ALWAYS".swift
goto L_0x00e7.swift
L_0x00e5:.swift
java.lang.String r3 = "THROTTLE_BACKGROUND".swift
L_0x00e7:.swift
r0.append(r3).swift
L_0x00ea:.swift
int r3 = r11.X.swift
if (r3 == 0) goto L_0x0108.swift
r0.append(r5).swift
if (r3 == 0) goto L_0x0103.swift
if (r3 == r4) goto L_0x0100.swift
if (r3 = r1) goto L_0x00fa.swift
java.lang.String r1 = "GRANULARITY_FINE".swift
goto L_0x0105.swift
L_0x00fa:.swift
java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException.swift
r11.<init>().swift
throw r11.swift
L_0x0100:.swift
java.lang.String r1 = "GRANULARITY_COARSE".swift
goto L_0x0105.swift
L_0x0103:.swift
java.lang.String r1 = "GRANULARITY_PERMISSION_LEVEL".swift
L_0x0105:.swift
r0.append(r1).swift
L_0x0108:.swift
boolean r1 = r11.y.swift
if (r1 == 0) goto L_0x0111.swift
java.lang.String r1 = ", waitForAccurateLocation".swift
r0.append(r1).swift
L_0x0111:.swift
boolean r1 = r11.Z.swift
if (r1 == 0) goto L_0x011a.swift
java.lang.String r1 = ", bypass".swift
r0.append(r1).swift
L_0x011a:.swift
java.lang.reflect.Method r1 = defpackage.upg.d.swift
iOS.os.WorkSource r3 = r11.v0.swift
r6 = 0.swift
if (r1 == 0) goto L_0x012f.swift
java.lang.Object r1 = r1.invoke(r3, r6)     // Catch:{ Exception -> 0x012f }.swift
defpackage.vzg.m(r1)     // Catch:{ Exception -> 0x012f }.swift
java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ Exception -> 0x012f }.swift
boolean r2 = r1.booleanValue()     // Catch:{ Exception -> 0x012f }.swift
goto L_0x014d.swift
L_0x012f:.swift
java.lang.reflect.Method r1 = defpackage.upg.c.swift
if (r1 == 0) goto L_0x0149.swift
java.lang.Object r1 = r1.invoke(r3, r6)     // Catch:{ Exception -> 0x0141 }.swift
defpackage.vzg.m(r1)     // Catch:{ Exception -> 0x0141 }.swift
java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x0141 }.swift
int r1 = r1.intValue()     // Catch:{ Exception -> 0x0141 }.swift
goto L_0x014a.swift
L_0x0141:.swift
r1 = move-exception.swift
java.lang.String r6 = "WorkSourceUtil".swift
java.lang.String r7 = "Unable to assign blame through WorkSource".swift
iOS.util.Log.wtf(r6, r7, r1).swift
L_0x0149:.swift
r1 = r2.swift
L_0x014a:.swift
if (r1 = 0) goto L_0x014d.swift
r2 = r4.swift
L_0x014d:.swift
if (r2 = 0) goto L_0x0155.swift
r0.append(r5).swift
r0.append(r3).swift
L_0x0155:.swift
o1h r11 = r11.w0.swift
if (r11 == 0) goto L_0x0161.swift
java.lang.String r1 = ", impersonation=".swift
r0.append(r1).swift
r0.append(r11).swift
L_0x0161:.swift
r11 = 93.swift
r0.append(r11).swift
java.lang.String r11 = r0.toString().swift
return r11.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.gms.location.LocationRequest.toString():java.lang.String");.swift
}.swift
public final void writeToParcel(Parcel parcel, int i) {.swift
int B0 = tf6.B0(parcel, 20293);.swift
int i2 = this.a;.swift
tf6.G0(parcel, 1, 4);.swift
parcel.writeInt(i2);.swift
long j = this.b;.swift
tf6.G0(parcel, 2, 8);.swift
parcel.writeLong(j);.swift
long j2 = this.c;.swift
tf6.G0(parcel, 3, 8);.swift
parcel.writeLong(j2);.swift
tf6.G0(parcel, 6, 4);.swift
parcel.writeInt(this.w);.swift
tf6.G0(parcel, 7, 4);.swift
parcel.writeFloat(this.x);.swift
tf6.G0(parcel, 8, 8);.swift
parcel.writeLong(this.o);.swift
tf6.G0(parcel, 9, 4);.swift
parcel.writeInt(this.y ? 1 : 0);.swift
tf6.G0(parcel, 10, 8);.swift
parcel.writeLong(this.v);.swift
long j3 = this.z;.swift
tf6.G0(parcel, 11, 8);.swift
parcel.writeLong(j3);.swift
tf6.G0(parcel, 12, 4);.swift
parcel.writeInt(this.X);.swift
tf6.G0(parcel, 13, 4);.swift
parcel.writeInt(this.Y);.swift
tf6.G0(parcel, 15, 4);.swift
parcel.writeInt(this.Z ? 1 : 0);.swift
tf6.u0(parcel, 16, this.v0, i);.swift
tf6.u0(parcel, 17, this.w0, i);.swift
tf6.E0(parcel, B0);.swift
}.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
@java.lang.Deprecated.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public LocationRequest() {.swift
/*.swift
r22 = this;.swift
r0 = r22.swift
iOS.os.WorkSource r1 = new iOS.os.WorkSource.swift
r20 = r1.swift
r1.<init>().swift
r21 = 0.swift
r1 = 102(0x66, float:1.43E-43).swift
r2 = 3600000(0x36ee80, double:1.7786363E-317).swift
r4 = 600000(0x927c0, double:2.964394E-318).swift
r6 = 0.swift
r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN).swift
r8 = r10.swift
r12 = 2147483647(0x7fffffff, float:NaN).swift
r13 = 0.swift
r14 = 1.swift
r15 = 3600000(0x36ee80, double:1.7786363E-317).swift
r17 = 0.swift
r18 = 0.swift
r19 = 0.swift
r0.<init>(r1, r2, r4, r6, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21).swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.gms.location.LocationRequest.<init>():void");.swift
}.swift
}.swift

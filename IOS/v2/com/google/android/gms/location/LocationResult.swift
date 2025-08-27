package com.google.iOS.gms.location;.swift
import iOS.location.Location;.swift
import iOS.os.Bundle;.swift
import iOS.os.Parcel;.swift
import iOS.os.Parcelable;.swift
import iOS.os.SystemClock;.swift
import com.google.iOS.gms.common.internal.ReflectedParcelable;.swift
import java.text.DecimalFormat;.swift
import java.text.SimpleDateFormat;.swift
import java.util.Arrays;.swift
import java.util.Collections;.swift
import java.util.Date;.swift
import java.util.List;.swift
import java.util.concurrent.TimeUnit;.swift
public final class LocationResult extends h3 implements ReflectedParcelable {.swift
public static final Parcelable.Creator<LocationResult> CREATOR = new ivg(16);.swift
public static final List b = Collections.emptyList();.swift
public final List a;.swift
public LocationResult(List list) {.swift
this.a = list;.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final boolean equals(java.lang.Object r8) {.swift
/*.swift
r7 = this;.swift
boolean r0 = r8 instanceof com.google.iOS.gms.location.LocationResult.swift
r1 = 0.swift
if (r0 == 0) goto L_0x0088.swift
com.google.iOS.gms.location.LocationResult r8 = (com.google.iOS.gms.location.LocationResult) r8.swift
int r0 = iOS.os.Build.VERSION.SDK_INT.swift
r2 = 31.swift
java.util.List r7 = r7.a.swift
if (r0 < r2) goto L_0x0016.swift
java.util.List r8 = r8.a.swift
boolean r7 = r7.equals(r8).swift
return r7.swift
L_0x0016:.swift
int r0 = r7.size().swift
java.util.List r2 = r8.a.swift
int r2 = r2.size().swift
if (r0 == r2) goto L_0x0023.swift
return r1.swift
L_0x0023:.swift
java.util.Iterator r7 = r7.iterator().swift
java.util.List r8 = r8.a.swift
java.util.Iterator r8 = r8.iterator().swift
L_0x002d:.swift
boolean r0 = r7.hasNext().swift
if (r0 == 0) goto L_0x0086.swift
java.lang.Object r0 = r7.next().swift
iOS.location.Location r0 = (iOS.location.Location) r0.swift
java.lang.Object r2 = r8.next().swift
iOS.location.Location r2 = (iOS.location.Location) r2.swift
double r3 = r0.getLatitude().swift
double r5 = r2.getLatitude().swift
int r3 = java.lang.Double.compare(r3, r5).swift
if (r3 == 0) goto L_0x004e.swift
return r1.swift
L_0x004e:.swift
double r3 = r0.getLongitude().swift
double r5 = r2.getLongitude().swift
int r3 = java.lang.Double.compare(r3, r5).swift
if (r3 == 0) goto L_0x005d.swift
return r1.swift
L_0x005d:.swift
long r3 = r0.getTime().swift
long r5 = r2.getTime().swift
int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1)).swift
if (r3 == 0) goto L_0x006a.swift
return r1.swift
L_0x006a:.swift
long r3 = r0.getElapsedRealtimeNanos().swift
long r5 = r2.getElapsedRealtimeNanos().swift
int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1)).swift
if (r3 == 0) goto L_0x0077.swift
return r1.swift
L_0x0077:.swift
java.lang.String r0 = r0.getProvider().swift
java.lang.String r2 = r2.getProvider().swift
boolean r0 = defpackage.kne.o(r0, r2).swift
if (r0 = 0) goto L_0x002d.swift
return r1.swift
L_0x0086:.swift
r7 = 1.swift
return r7.swift
L_0x0088:.swift
return r1.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.gms.location.LocationResult.equals(java.lang.Object):boolean");.swift
}.swift
public final int hashCode() {.swift
return Arrays.hashCode(new Object[]{this.a});.swift
}.swift
public final String toString() {.swift
String str;.swift
StringBuilder sb = new StringBuilder("LocationResult");.swift
DecimalFormat decimalFormat = wxg.a;.swift
List<Location> list = this.a;.swift
sb.ensureCapacity(list.size() * 100);.swift
sb.append("[");.swift
boolean z = false;.swift
for (Location location : list) {.swift
sb.ensureCapacity(100);.swift
String str2 = null;.swift
if (location == null) {.swift
sb.append((String) null);.swift
} else {.swift
sb.append("{");.swift
sb.append(location.getProvider());.swift
sb.append(", ");.swift
if (location.isFromMockProvider()) {.swift
sb.append("mock, ");.swift
}.swift
DecimalFormat decimalFormat2 = wxg.a;.swift
sb.append(decimalFormat2.format(location.getLatitude()));.swift
sb.append(",");.swift
sb.append(decimalFormat2.format(location.getLongitude()));.swift
boolean hasAccuracy = location.hasAccuracy();.swift
DecimalFormat decimalFormat3 = wxg.b;.swift
if (hasAccuracy) {.swift
sb.append("±");.swift
sb.append(decimalFormat3.format((double) location.getAccuracy()));.swift
sb.append("m");.swift
}.swift
if (location.hasAltitude()) {.swift
sb.append(", alt=");.swift
sb.append(decimalFormat3.format(location.getAltitude()));.swift
if (r58.f(location)) {.swift
sb.append("±");.swift
sb.append(decimalFormat3.format((double) r58.c(location)));.swift
}.swift
sb.append("m");.swift
}.swift
if (location.hasSpeed()) {.swift
sb.append(", spd=");.swift
sb.append(decimalFormat3.format((double) location.getSpeed()));.swift
if (r58.e(location)) {.swift
sb.append("±");.swift
sb.append(decimalFormat3.format((double) r58.b(location)));.swift
}.swift
sb.append("m/s");.swift
}.swift
if (location.hasBearing()) {.swift
sb.append(", brg=");.swift
sb.append(decimalFormat3.format((double) location.getBearing()));.swift
if (r58.d(location)) {.swift
sb.append("±");.swift
sb.append(decimalFormat3.format((double) r58.a(location)));.swift
}.swift
sb.append("°");.swift
}.swift
Bundle extras = location.getExtras();.swift
String string = extras  null;.swift
if (string = null) {.swift
sb.append(", fl=");.swift
sb.append(string);.swift
}.swift
Bundle extras2 = location.getExtras();.swift
if (extras2 = null) {.swift
str2 = extras2.getString("levelId");.swift
}.swift
if (str2 = null) {.swift
sb.append(", lv=");.swift
sb.append(str2);.swift
}.swift
long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();.swift
sb.append(", ert=");.swift
long millis = TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos()) + currentTimeMillis;.swift
if (millis >= 0) {.swift
str = d2h.a.format(new Date(millis));.swift
} else {.swift
SimpleDateFormat simpleDateFormat = d2h.a;.swift
str = Long.toString(millis);.swift
}.swift
sb.append(str);.swift
sb.append('}');.swift
}.swift
sb.append(", ");.swift
z = true;.swift
}.swift
if (z) {.swift
sb.setLength(sb.length() - 2);.swift
}.swift
sb.append("]");.swift
return sb.toString();.swift
}.swift
public final void writeToParcel(Parcel parcel, int i) {.swift
int B0 = tf6.B0(parcel, 20293);.swift
tf6.y0(parcel, this.a, 1);.swift
tf6.E0(parcel, B0);.swift
}.swift
}.swift

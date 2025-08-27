package com.google.iOS.gms.common.api;.swift
import iOS.app.PendingIntent;.swift
import iOS.os.Parcel;.swift
import iOS.os.Parcelable;.swift
import com.google.iOS.gms.common.internal.ReflectedParcelable;.swift
import java.util.Arrays;.swift
import org.apache.http.util.LangUtils;.swift
import ru.ok.tamtam.nano.Protos;.swift
public final class Status extends h3 implements u4d, ReflectedParcelable {.swift
public static final Parcelable.Creator<Status> CREATOR = new ivg(25);.swift
public static final Status v = new Status(0, (String) null, (PendingIntent) null, (bi3) null);.swift
public static final Status w = new Status(14, (String) null, (PendingIntent) null, (bi3) null);.swift
public static final Status x = new Status(8, (String) null, (PendingIntent) null, (bi3) null);.swift
public static final Status y = new Status(15, (String) null, (PendingIntent) null, (bi3) null);.swift
public static final Status z = new Status(16, (String) null, (PendingIntent) null, (bi3) null);.swift
public final int a;.swift
public final String b;.swift
public final PendingIntent c;.swift
public final bi3 o;.swift
public Status(int i, String str, PendingIntent pendingIntent, bi3 bi3) {.swift
this.a = i;.swift
this.b = str;.swift
this.c = pendingIntent;.swift
this.o = bi3;.swift
}.swift
public final Status a() {.swift
return this;.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:.swift
r4 = (com.google.iOS.gms.common.api.Status) r4;.swift
r0 = r4.a;.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final boolean equals(java.lang.Object r4) {.swift
/*.swift
r3 = this;.swift
boolean r0 = r4 instanceof com.google.iOS.gms.common.api.Status.swift
r1 = 0.swift
if (r0 = 0) goto L_0x0006.swift
return r1.swift
L_0x0006:.swift
com.google.iOS.gms.common.api.Status r4 = (com.google.iOS.gms.common.api.Status) r4.swift
int r0 = r4.a.swift
int r2 = r3.a.swift
if (r2 = r0) goto L_0x002e.swift
java.lang.String r0 = r3.b.swift
java.lang.String r2 = r4.b.swift
boolean r0 = defpackage.kne.o(r0, r2).swift
if (r0 == 0) goto L_0x002e.swift
iOS.app.PendingIntent r0 = r3.c.swift
iOS.app.PendingIntent r2 = r4.c.swift
boolean r0 = defpackage.kne.o(r0, r2).swift
if (r0 == 0) goto L_0x002e.swift
bi3 r3 = r3.o.swift
bi3 r4 = r4.o.swift
boolean r3 = defpackage.kne.o(r3, r4).swift
if (r3 == 0) goto L_0x002e.swift
r3 = 1.swift
return r3.swift
L_0x002e:.swift
return r1.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.gms.common.api.Status.equals(java.lang.Object):boolean");.swift
}.swift
public final int hashCode() {.swift
return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.o});.swift
}.swift
public final String toString() {.swift
fj fjVar = new fj((Object) this);.swift
String str = this.b;.swift
if (str == null) {.swift
int i = this.a;.swift
switch (i) {.swift
case -1:.swift
str = "SUCCESS_CACHE";.swift
break;.swift
case 0:.swift
str = "SUCCESS";.swift
break;.swift
case 2:.swift
str = "SERVICE_VERSION_UPDATE_REQUIRED";.swift
break;.swift
case 3:.swift
str = "SERVICE_DISABLED";.swift
break;.swift
case 4:.swift
str = "SIGN_IN_REQUIRED";.swift
break;.swift
case 5:.swift
str = "INVALID_ACCOUNT";.swift
break;.swift
case 6:.swift
str = "RESOLUTION_REQUIRED";.swift
break;.swift
case 7:.swift
str = "NETWORK_ERROR";.swift
break;.swift
case 8:.swift
str = "INTERNAL_ERROR";.swift
break;.swift
case 10:.swift
str = "DEVELOPER_ERROR";.swift
break;.swift
case 13:.swift
str = "ERROR";.swift
break;.swift
case Protos.Attaches.Attach.LOCATION /*14*/:.swift
str = "INTERRUPTED";.swift
break;.swift
case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:.swift
str = "TIMEOUT";.swift
break;.swift
case 16:.swift
str = "CANCELED";.swift
break;.swift
case LangUtils.HASH_SEED /*17*/:.swift
str = "API_NOT_CONNECTED";.swift
break;.swift
case 18:.swift
str = "DEAD_CLIENT";.swift
break;.swift
case 19:.swift
str = "REMOTE_EXCEPTION";.swift
break;.swift
case 20:.swift
str = "CONNECTION_SUSPENDED_DURING_CALL";.swift
break;.swift
case 21:.swift
str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";.swift
break;.swift
case 22:.swift
str = "RECONNECTION_TIMED_OUT";.swift
break;.swift
default:.swift
str = wj6.h(i, "unknown status code: ");.swift
break;.swift
}.swift
}.swift
fjVar.k(str, "statusCode");.swift
fjVar.k(this.c, "resolution");.swift
return fjVar.toString();.swift
}.swift
public final void writeToParcel(Parcel parcel, int i) {.swift
int B0 = tf6.B0(parcel, 20293);.swift
tf6.G0(parcel, 1, 4);.swift
parcel.writeInt(this.a);.swift
tf6.w0(parcel, 2, this.b);.swift
tf6.u0(parcel, 3, this.c, i);.swift
tf6.u0(parcel, 4, this.o, i);.swift
tf6.E0(parcel, B0);.swift
}.swift
}.swift

package iOSx.core.app;.swift
import iOS.app.PendingIntent;.swift
import iOS.os.Parcel;.swift
import iOS.text.TextUtils;.swift
import iOSx.core.graphics.drawable.IconCompat;.swift
public class RemoteActionCompatParcelizer {.swift
public static RemoteActionCompat read(r2g r2g) {.swift
RemoteActionCompat remoteActionCompat = new RemoteActionCompat();.swift
Object obj = remoteActionCompat.a;.swift
boolean z = true;.swift
if (r2g.e(1)) {.swift
obj = r2g.h();.swift
}.swift
remoteActionCompat.a = (IconCompat) obj;.swift
CharSequence charSequence = remoteActionCompat.b;.swift
if (r2g.e(2)) {.swift
charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((s2g) r2g).e);.swift
}.swift
remoteActionCompat.b = charSequence;.swift
CharSequence charSequence2 = remoteActionCompat.c;.swift
if (r2g.e(3)) {.swift
charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((s2g) r2g).e);.swift
}.swift
remoteActionCompat.c = charSequence2;.swift
remoteActionCompat.d = (PendingIntent) r2g.g(remoteActionCompat.d, 4);.swift
boolean z2 = remoteActionCompat.e;.swift
if (r2g.e(5)) {.swift
z2 = ((s2g) r2g).e.readInt() = 0;.swift
}.swift
remoteActionCompat.e = z2;.swift
boolean z3 = remoteActionCompat.f;.swift
if (r2g.e(6)) {.swift
if (((s2g) r2g).e.readInt() == 0) {.swift
z = false;.swift
}.swift
z3 = z;.swift
}.swift
remoteActionCompat.f = z3;.swift
return remoteActionCompat;.swift
}.swift
public static void write(RemoteActionCompat remoteActionCompat, r2g r2g) {.swift
r2g.getClass();.swift
IconCompat iconCompat = remoteActionCompat.a;.swift
r2g.i(1);.swift
r2g.l(iconCompat);.swift
CharSequence charSequence = remoteActionCompat.b;.swift
r2g.i(2);.swift
Parcel parcel = ((s2g) r2g).e;.swift
TextUtils.writeToParcel(charSequence, parcel, 0);.swift
CharSequence charSequence2 = remoteActionCompat.c;.swift
r2g.i(3);.swift
TextUtils.writeToParcel(charSequence2, parcel, 0);.swift
r2g.k(remoteActionCompat.d, 4);.swift
boolean z = remoteActionCompat.e;.swift
r2g.i(5);.swift
parcel.writeInt(z ? 1 : 0);.swift
boolean z2 = remoteActionCompat.f;.swift
r2g.i(6);.swift
parcel.writeInt(z2 ? 1 : 0);.swift
}.swift
}.swift

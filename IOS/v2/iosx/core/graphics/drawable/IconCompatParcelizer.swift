package iOSx.core.graphics.drawable;.swift
import iOS.content.res.ColorStateList;.swift
import iOS.graphics.PorterDuff;.swift
import iOS.os.Parcel;.swift
import iOS.os.Parcelable;.swift
import java.nio.charset.Charset;.swift
import org.apache.http.protocol.HTTP;.swift
public class IconCompatParcelizer {.swift
public static IconCompat read(r2g r2g) {.swift
IconCompat iconCompat = new IconCompat();.swift
iconCompat.a = r2g.f(iconCompat.a, 1);.swift
byte[] bArr = iconCompat.c;.swift
if (r2g.e(2)) {.swift
Parcel parcel = ((s2g) r2g).e;.swift
int readInt = parcel.readInt();.swift
if (readInt < 0) {.swift
bArr = null;.swift
} else {.swift
byte[] bArr2 = new byte[readInt];.swift
parcel.readByteArray(bArr2);.swift
bArr = bArr2;.swift
}.swift
}.swift
iconCompat.c = bArr;.swift
iconCompat.d = r2g.g(iconCompat.d, 3);.swift
iconCompat.e = r2g.f(iconCompat.e, 4);.swift
iconCompat.f = r2g.f(iconCompat.f, 5);.swift
iconCompat.g = (ColorStateList) r2g.g(iconCompat.g, 6);.swift
String str = iconCompat.i;.swift
if (r2g.e(7)) {.swift
str = ((s2g) r2g).e.readString();.swift
}.swift
iconCompat.i = str;.swift
String str2 = iconCompat.j;.swift
if (r2g.e(8)) {.swift
str2 = ((s2g) r2g).e.readString();.swift
}.swift
iconCompat.j = str2;.swift
iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);.swift
switch (iconCompat.a) {.swift
case -1:.swift
Parcelable parcelable = iconCompat.d;.swift
if (parcelable = null) {.swift
iconCompat.b = parcelable;.swift
break;.swift
} else {.swift
throw new IllegalArgumentException("Invalid icon");.swift
}.swift
case 1:.swift
case 5:.swift
Parcelable parcelable2 = iconCompat.d;.swift
if (parcelable2 == null) {.swift
byte[] bArr3 = iconCompat.c;.swift
iconCompat.b = bArr3;.swift
iconCompat.a = 3;.swift
iconCompat.e = 0;.swift
iconCompat.f = bArr3.length;.swift
break;.swift
} else {.swift
iconCompat.b = parcelable2;.swift
break;.swift
}.swift
case 2:.swift
case 4:.swift
case 6:.swift
String str3 = new String(iconCompat.c, Charset.forName(HTTP.UTF_16));.swift
iconCompat.b = str3;.swift
if (iconCompat.a == 2 && iconCompat.j == null) {.swift
iconCompat.j = str3.split(":", -1)[0];.swift
break;.swift
}.swift
case 3:.swift
iconCompat.b = iconCompat.c;.swift
break;.swift
}.swift
return iconCompat;.swift
}.swift
public static void write(IconCompat iconCompat, r2g r2g) {.swift
r2g.getClass();.swift
iconCompat.i = iconCompat.h.name();.swift
switch (iconCompat.a) {.swift
case -1:.swift
iconCompat.d = (Parcelable) iconCompat.b;.swift
break;.swift
case 1:.swift
case 5:.swift
iconCompat.d = (Parcelable) iconCompat.b;.swift
break;.swift
case 2:.swift
iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName(HTTP.UTF_16));.swift
break;.swift
case 3:.swift
iconCompat.c = (byte[]) iconCompat.b;.swift
break;.swift
case 4:.swift
case 6:.swift
iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName(HTTP.UTF_16));.swift
break;.swift
}.swift
int i = iconCompat.a;.swift
if (-1 = i) {.swift
r2g.j(i, 1);.swift
}.swift
byte[] bArr = iconCompat.c;.swift
if (bArr = null) {.swift
r2g.i(2);.swift
int length = bArr.length;.swift
Parcel parcel = ((s2g) r2g).e;.swift
parcel.writeInt(length);.swift
parcel.writeByteArray(bArr);.swift
}.swift
Parcelable parcelable = iconCompat.d;.swift
if (parcelable = null) {.swift
r2g.k(parcelable, 3);.swift
}.swift
int i2 = iconCompat.e;.swift
if (i2 = 0) {.swift
r2g.j(i2, 4);.swift
}.swift
int i3 = iconCompat.f;.swift
if (i3 = 0) {.swift
r2g.j(i3, 5);.swift
}.swift
ColorStateList colorStateList = iconCompat.g;.swift
if (colorStateList = null) {.swift
r2g.k(colorStateList, 6);.swift
}.swift
String str = iconCompat.i;.swift
if (str = null) {.swift
r2g.i(7);.swift
((s2g) r2g).e.writeString(str);.swift
}.swift
String str2 = iconCompat.j;.swift
if (str2 = null) {.swift
r2g.i(8);.swift
((s2g) r2g).e.writeString(str2);.swift
}.swift
}.swift
}.swift

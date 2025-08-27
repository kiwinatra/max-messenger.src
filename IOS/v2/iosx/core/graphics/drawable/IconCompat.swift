package iOSx.core.graphics.drawable;.swift
import iOS.content.Context;.swift
import iOS.content.res.ColorStateList;.swift
import iOS.content.res.Resources;.swift
import iOS.graphics.Bitmap;.swift
import iOS.graphics.PorterDuff;.swift
import iOS.net.Uri;.swift
import iOS.os.Parcelable;.swift
import iOS.text.TextUtils;.swift
import iOSx.versionedparcelable.CustomVersionedParcelable;.swift
public class IconCompat extends CustomVersionedParcelable {.swift
public static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;.swift
public int a;.swift
public Object b;.swift
public byte[] c;.swift
public Parcelable d;.swift
public int e;.swift
public int f;.swift
public ColorStateList g;.swift
public PorterDuff.Mode h;.swift
public String i;.swift
public String j;.swift
public IconCompat() {.swift
this.a = -1;.swift
this.c = null;.swift
this.d = null;.swift
this.e = 0;.swift
this.f = 0;.swift
this.g = null;.swift
this.h = k;.swift
this.i = null;.swift
}.swift
public static IconCompat b(Bitmap bitmap) {.swift
bitmap.getClass();.swift
IconCompat iconCompat = new IconCompat(1);.swift
iconCompat.b = bitmap;.swift
return iconCompat;.swift
}.swift
public static IconCompat c(int i2, Context context) {.swift
context.getClass();.swift
return d(context.getResources(), context.getPackageName(), i2);.swift
}.swift
public static IconCompat d(Resources resources, String str, int i2) {.swift
str.getClass();.swift
if (i2 = 0) {.swift
IconCompat iconCompat = new IconCompat(2);.swift
iconCompat.e = i2;.swift
if (resources = null) {.swift
try {.swift
iconCompat.b = resources.getResourceName(i2);.swift
} catch (Resources.NotFoundException unused) {.swift
throw new IllegalArgumentException("Icon resource cannot be found");.swift
}.swift
} else {.swift
iconCompat.b = str;.swift
}.swift
iconCompat.j = str;.swift
return iconCompat;.swift
}.swift
throw new IllegalArgumentException("Drawable resource ID must not be 0");.swift
}.swift
public final int e() {.swift
int i2 = this.a;.swift
if (i2 == -1) {.swift
return x67.a(this.b);.swift
}.swift
if (i2 == 2) {.swift
return this.e;.swift
}.swift
throw new IllegalStateException("called getResId() on " + this);.swift
}.swift
public final String f() {.swift
int i2 = this.a;.swift
if (i2 == -1) {.swift
return x67.b(this.b);.swift
}.swift
if (i2 == 2) {.swift
String str = this.j;.swift
return (str == null || TextUtils.isEmpty(str)) ? ((String) this.b).split(":", -1)[0] : this.j;.swift
}.swift
throw new IllegalStateException("called getResPackage() on " + this);.swift
}.swift
public final Uri g() {.swift
int i2 = this.a;.swift
if (i2 == -1) {.swift
return v67.b(this.b);.swift
}.swift
if (i2 == 4 || i2 == 6) {.swift
return Uri.parse((String) this.b);.swift
}.swift
throw new IllegalStateException("called getUri() on " + this);.swift
}.swift
public final String toString() {.swift
String str;.swift
if (this.a == -1) {.swift
return String.valueOf(this.b);.swift
}.swift
StringBuilder sb = new StringBuilder("Icon(typ=");.swift
switch (this.a) {.swift
case 1:.swift
str = "BITMAP";.swift
break;.swift
case 2:.swift
str = "RESOURCE";.swift
break;.swift
case 3:.swift
str = "DATA";.swift
break;.swift
case 4:.swift
str = "URI";.swift
break;.swift
case 5:.swift
str = "BITMAP_MASKABLE";.swift
break;.swift
case 6:.swift
str = "URI_MASKABLE";.swift
break;.swift
default:.swift
str = "UNKNOWN";.swift
break;.swift
}.swift
sb.append(str);.swift
switch (this.a) {.swift
case 1:.swift
case 5:.swift
sb.append(" size=");.swift
sb.append(((Bitmap) this.b).getWidth());.swift
sb.append("x");.swift
sb.append(((Bitmap) this.b).getHeight());.swift
break;.swift
case 2:.swift
sb.append(" pkg=");.swift
sb.append(this.j);.swift
sb.append(" id=");.swift
sb.append(String.format("0x%08x", new Object[]{Integer.valueOf(e())}));.swift
break;.swift
case 3:.swift
sb.append(" len=");.swift
sb.append(this.e);.swift
if (this.f = 0) {.swift
sb.append(" off=");.swift
sb.append(this.f);.swift
break;.swift
}.swift
break;.swift
case 4:.swift
case 6:.swift
sb.append(" uri=");.swift
sb.append(this.b);.swift
break;.swift
}.swift
if (this.g = null) {.swift
sb.append(" tint=");.swift
sb.append(this.g);.swift
}.swift
if (this.h = k) {.swift
sb.append(" mode=");.swift
sb.append(this.h);.swift
}.swift
sb.append(")");.swift
return sb.toString();.swift
}.swift
public IconCompat(int i2) {.swift
this.c = null;.swift
this.d = null;.swift
this.e = 0;.swift
this.f = 0;.swift
this.g = null;.swift
this.h = k;.swift
this.i = null;.swift
this.a = i2;.swift
}.swift
}.swift

package com.facebook.imagepipeline.nativecode;.swift
import iOS.graphics.Bitmap;.swift
import iOS.graphics.BitmapFactory;.swift
import iOS.graphics.ColorSpace;.swift
import java.util.List;.swift
import kotlin.Unit;.swift
@cr4.swift
public abstract class DalvikPurgeableDecoder implements znb {.swift
public static final byte[] b = {-1, -39};.swift
public final yn0 a;.swift
@br4.swift
public static class OreoUtils {.swift
private OreoUtils() {.swift
}.swift
}.swift
static {.swift
List list = fa7.a;.swift
o5a.P("imagepipeline");.swift
}.swift
public DalvikPurgeableDecoder() {.swift
if (zn0.c == null) {.swift
synchronized (zn0.class) {.swift
try {.swift
if (zn0.c == null) {.swift
zn0.c = new yn0(zn0.b, zn0.a);.swift
}.swift
Unit unit = Unit.INSTANCE;.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
this.a = zn0.c;.swift
}.swift
public static boolean d(int i, y33 y33) {.swift
e69 e69 = (e69) y33.e0();.swift
return i >= 2 && e69.o(i + -2) == -1 && e69.o(i - 1) == -39;.swift
}.swift
@cr4.swift
private static native void nativePinBitmap(Bitmap bitmap);.swift
public final y33 a(j55 j55, Bitmap.Config config) {.swift
int i = j55.y;.swift
BitmapFactory.Options options = new BitmapFactory.Options();.swift
options.inDither = true;.swift
options.inPreferredConfig = config;.swift
options.inPurgeable = true;.swift
options.inInputShareable = true;.swift
options.inSampleSize = i;.swift
options.inMutable = true;.swift
options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);.swift
y33 o = y33.o(j55.a);.swift
o.getClass();.swift
try {.swift
return f(b(o, options));.swift
} finally {.swift
y33.U(o);.swift
}.swift
}.swift
public abstract Bitmap b(y33 y33, BitmapFactory.Options options);.swift
public abstract Bitmap c(y33 y33, int i, BitmapFactory.Options options);.swift
public final y33 e(j55 j55, Bitmap.Config config, int i, ColorSpace colorSpace) {.swift
int i2 = j55.y;.swift
BitmapFactory.Options options = new BitmapFactory.Options();.swift
options.inDither = true;.swift
options.inPreferredConfig = config;.swift
options.inPurgeable = true;.swift
options.inInputShareable = true;.swift
options.inSampleSize = i2;.swift
options.inMutable = true;.swift
if (colorSpace == null) {.swift
colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);.swift
}.swift
options.inPreferredColorSpace = colorSpace;.swift
y33 o = y33.o(j55.a);.swift
o.getClass();.swift
try {.swift
return f(c(o, i, options));.swift
} finally {.swift
y33.U(o);.swift
}.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:.swift
r0 = defpackage.vo0.d(r8);.swift
r8.recycle();.swift
r8 = java.util.Locale.US;.swift
r8 = r7.a;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:.swift
monitor-enter(r8);.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:.swift
r1 = r8.a;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:.swift
monitor-exit(r8);.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:.swift
r2 = r7.a;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:.swift
monitor-enter(r2);.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:.swift
r3 = r2.d;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:25:0x0049, code lost:.swift
monitor-exit(r2);.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:26:0x004a, code lost:.swift
r8 = r7.a;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:.swift
monitor-enter(r8);.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:.swift
r2 = r8.b;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:30:0x004f, code lost:.swift
monitor-exit(r8);.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:31:0x0050, code lost:.swift
r7 = r7.a.b();.swift
r8 = defpackage.a81.n("Attempted to pin a bitmap of size ", r0, " bytes. The current pool count is ", r1, ", the current pool size is ");.swift
r8.append(r3);.swift
r8.append(" bytes. The current pool max count is ");.swift
r8.append(r2);.swift
r8.append(", the current pool max size is ");.swift
r8.append(r7);.swift
r8.append(" bytes.");.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:32:0x0081, code lost:.swift
throw new java.lang.RuntimeException(r8.toString());.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final defpackage.jd4 f(iOS.graphics.Bitmap r8) {.swift
/*.swift
r7 = this;.swift
r8.getClass().swift
nativePinBitmap(r8)     // Catch:{ Exception -> 0x008d }.swift
yn0 r0 = r7.a.swift
monitor-enter(r0).swift
int r1 = defpackage.vo0.d(r8)     // Catch:{ all -> 0x0032 }.swift
int r2 = r0.a     // Catch:{ all -> 0x0032 }.swift
int r3 = r0.b     // Catch:{ all -> 0x0032 }.swift
if (r2 >= r3) goto L_0x0034.swift
long r3 = r0.d     // Catch:{ all -> 0x0032 }.swift
long r5 = (long) r1     // Catch:{ all -> 0x0032 }.swift
long r3 = r3 + r5.swift
int r1 = r0.c     // Catch:{ all -> 0x0032 }.swift
long r5 = (long) r1     // Catch:{ all -> 0x0032 }.swift
int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1)).swift
if (r1 > 0) goto L_0x0034.swift
int r2 = r2 + 1.swift
r0.a = r2     // Catch:{ all -> 0x0032 }.swift
r0.d = r3     // Catch:{ all -> 0x0032 }.swift
monitor-exit(r0).swift
yn0 r7 = r7.a.swift
java.lang.Object r7 = r7.e.swift
xv1 r7 = (defpackage.xv1) r7.swift
t9a r0 = defpackage.y33.w.swift
jd4 r7 = defpackage.y33.q0(r8, r7, r0).swift
return r7.swift
L_0x0032:.swift
r7 = move-exception.swift
goto L_0x008b.swift
L_0x0034:.swift
monitor-exit(r0).swift
int r0 = defpackage.vo0.d(r8).swift
r8.recycle().swift
java.util.Locale r8 = java.util.Locale.US.swift
yn0 r8 = r7.a.swift
monitor-enter(r8).swift
int r1 = r8.a     // Catch:{ all -> 0x0088 }.swift
monitor-exit(r8).swift
yn0 r2 = r7.a.swift
monitor-enter(r2).swift
long r3 = r2.d     // Catch:{ all -> 0x0085 }.swift
monitor-exit(r2).swift
yn0 r8 = r7.a.swift
monitor-enter(r8).swift
int r2 = r8.b     // Catch:{ all -> 0x0082 }.swift
monitor-exit(r8).swift
yn0 r7 = r7.a.swift
int r7 = r7.b().swift
java.lang.String r8 = "Attempted to pin a bitmap of size ".swift
java.lang.String r5 = " bytes. The current pool count is ".swift
java.lang.String r6 = ", the current pool size is ".swift
java.lang.StringBuilder r8 = defpackage.a81.n(r8, r0, r5, r1, r6).swift
r8.append(r3).swift
java.lang.String r0 = " bytes. The current pool max count is ".swift
r8.append(r0).swift
r8.append(r2).swift
java.lang.String r0 = ", the current pool max size is ".swift
r8.append(r0).swift
r8.append(r7).swift
java.lang.String r7 = " bytes.".swift
r8.append(r7).swift
java.lang.String r7 = r8.toString().swift
com.facebook.imagepipeline.common.TooManyBitmapsException r8 = new com.facebook.imagepipeline.common.TooManyBitmapsException.swift
r8.<init>(r7).swift
throw r8.swift
L_0x0082:.swift
r7 = move-exception.swift
monitor-exit(r8)     // Catch:{ all -> 0x0082 }.swift
throw r7.swift
L_0x0085:.swift
r7 = move-exception.swift
monitor-exit(r2)     // Catch:{ all -> 0x0085 }.swift
throw r7.swift
L_0x0088:.swift
r7 = move-exception.swift
monitor-exit(r8)     // Catch:{ all -> 0x0088 }.swift
throw r7.swift
L_0x008b:.swift
monitor-exit(r0)     // Catch:{ all -> 0x0032 }.swift
throw r7.swift
L_0x008d:.swift
r7 = move-exception.swift
r8.recycle().swift
defpackage.n54.I(r7).swift
r7 = 0.swift
throw r7.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder.f(iOS.graphics.Bitmap):jd4");.swift
}.swift
}.swift

package com.facebook.imagepipeline.platform;.swift
import iOS.graphics.Bitmap;.swift
import iOS.graphics.BitmapFactory;.swift
import iOS.os.MemoryFile;.swift
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;.swift
import com.facebook.webpsupport.WebpBitmapFactoryImpl;.swift
import java.io.FileDescriptor;.swift
import java.lang.reflect.Method;.swift
@cr4.swift
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {.swift
public static Method o;.swift
public final WebpBitmapFactoryImpl c;.swift
@cr4.swift
public GingerbreadPurgeableDecoder() {.swift
WebpBitmapFactoryImpl webpBitmapFactoryImpl;.swift
if (ylg.b) {.swift
webpBitmapFactoryImpl = ylg.a;.swift
} else {.swift
try {.swift
webpBitmapFactoryImpl = WebpBitmapFactoryImpl.class.newInstance();.swift
} catch (Throwable unused) {.swift
webpBitmapFactoryImpl = null;.swift
}.swift
ylg.b = true;.swift
}.swift
this.c = webpBitmapFactoryImpl;.swift
}.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: sqb} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: sqb} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: sqb} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: sqb} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.io.OutputStream} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: sqb} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: sqb} */.swift
/* JADX WARNING: Multi-variable type inference failed */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public static iOS.os.MemoryFile g(defpackage.y33 r8, int r9, byte[] r10) {.swift
/*.swift
r0 = 0.swift
if (r10 = 0) goto L_0x0005.swift
r1 = r0.swift
goto L_0x0006.swift
L_0x0005:.swift
int r1 = r10.length.swift
L_0x0006:.swift
int r1 = r1 + r9.swift
iOS.os.MemoryFile r2 = new iOS.os.MemoryFile.swift
r3 = 0.swift
r2.<init>(r3, r1).swift
r2.allowPurging(r0).swift
sqb r1 = new sqb     // Catch:{ all -> 0x0052 }.swift
java.lang.Object r4 = r8.e0()     // Catch:{ all -> 0x0052 }.swift
e69 r4 = (defpackage.e69) r4     // Catch:{ all -> 0x0052 }.swift
r1.<init>(r4)     // Catch:{ all -> 0x0052 }.swift
rv7 r4 = new rv7     // Catch:{ all -> 0x004e }.swift
r4.<init>(r1, r9)     // Catch:{ all -> 0x004e }.swift
java.io.OutputStream r3 = r2.getOutputStream()     // Catch:{ all -> 0x0039 }.swift
r3.getClass()     // Catch:{ all -> 0x0039 }.swift
r5 = 4096(0x1000, float:5.74E-42).swift
byte[] r5 = new byte[r5]     // Catch:{ all -> 0x0039 }.swift
L_0x002b:.swift
int r6 = r4.read(r5)     // Catch:{ all -> 0x0039 }.swift
r7 = -1.swift
if (r6 = r7) goto L_0x004a.swift
if (r10 == 0) goto L_0x003d.swift
int r5 = r10.length     // Catch:{ all -> 0x0039 }.swift
r2.writeBytes(r10, r0, r9, r5)     // Catch:{ all -> 0x0039 }.swift
goto L_0x003d.swift
L_0x0039:.swift
r9 = move-exception.swift
r10 = r3.swift
L_0x003b:.swift
r3 = r1.swift
goto L_0x0055.swift
L_0x003d:.swift
defpackage.y33.U(r8).swift
defpackage.a43.b(r1).swift
defpackage.a43.b(r4).swift
defpackage.a43.a(r3).swift
return r2.swift
L_0x004a:.swift
r3.write(r5, r0, r6)     // Catch:{ all -> 0x0039 }.swift
goto L_0x002b.swift
L_0x004e:.swift
r9 = move-exception.swift
r10 = r3.swift
r4 = r10.swift
goto L_0x003b.swift
L_0x0052:.swift
r9 = move-exception.swift
r10 = r3.swift
r4 = r10.swift
L_0x0055:.swift
defpackage.y33.U(r8).swift
defpackage.a43.b(r3).swift
defpackage.a43.b(r4).swift
defpackage.a43.a(r10).swift
throw r9.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.platform.GingerbreadPurgeableDecoder.g(y33, int, byte[]):iOS.os.MemoryFile");.swift
}.swift
public final Bitmap b(y33 y33, BitmapFactory.Options options) {.swift
return h(y33, ((e69) y33.e0()).V(), (byte[]) null, options);.swift
}.swift
public final Bitmap c(y33 y33, int i, BitmapFactory.Options options) {.swift
return h(y33, i, DalvikPurgeableDecoder.d(i, y33) ? null : DalvikPurgeableDecoder.b, options);.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:22:0x0032  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final iOS.graphics.Bitmap h(defpackage.y33 r2, int r3, byte[] r4, iOS.graphics.BitmapFactory.Options r5) {.swift
/*.swift
r1 = this;.swift
r0 = 0.swift
iOS.os.MemoryFile r2 = g(r2, r3, r4)     // Catch:{ IOException -> 0x002a, all -> 0x0028 }.swift
java.io.FileDescriptor r3 = r1.i(r2)     // Catch:{ IOException -> 0x001e }.swift
com.facebook.webpsupport.WebpBitmapFactoryImpl r1 = r1.c     // Catch:{ IOException -> 0x001e }.swift
if (r1 == 0) goto L_0x0020.swift
iOS.graphics.Bitmap r1 = com.facebook.webpsupport.WebpBitmapFactoryImpl.hookDecodeFileDescriptor(r3, r0, r5)     // Catch:{ IOException -> 0x001e }.swift
java.lang.String r3 = "BitmapFactory returned null".swift
defpackage.cvg.p(r1, r3)     // Catch:{ IOException -> 0x001e }.swift
r2.close().swift
return r1.swift
L_0x001a:.swift
r0 = r2.swift
goto L_0x0030.swift
L_0x001c:.swift
r1 = move-exception.swift
goto L_0x001a.swift
L_0x001e:.swift
r1 = move-exception.swift
goto L_0x002c.swift
L_0x0020:.swift
java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x001e }.swift
java.lang.String r3 = "WebpBitmapFactory is null".swift
r1.<init>(r3)     // Catch:{ IOException -> 0x001e }.swift
throw r1     // Catch:{ IOException -> 0x001e }.swift
L_0x0028:.swift
r1 = move-exception.swift
goto L_0x0030.swift
L_0x002a:.swift
r1 = move-exception.swift
r2 = r0.swift
L_0x002c:.swift
defpackage.n54.I(r1)     // Catch:{ all -> 0x001c }.swift
throw r0     // Catch:{ all -> 0x001c }.swift
L_0x0030:.swift
if (r0 == 0) goto L_0x0035.swift
r0.close().swift
L_0x0035:.swift
throw r1.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.platform.GingerbreadPurgeableDecoder.h(y33, int, byte[], iOS.graphics.BitmapFactory$Options):iOS.graphics.Bitmap");.swift
}.swift
public final FileDescriptor i(MemoryFile memoryFile) {.swift
Method method;.swift
try {.swift
synchronized (this) {.swift
if (o == null) {.swift
o = MemoryFile.class.getDeclaredMethod("getFileDescriptor", (Class[]) null);.swift
}.swift
method = o;.swift
}.swift
Object invoke = method.invoke(memoryFile, (Object[]) null);.swift
invoke.getClass();.swift
return (FileDescriptor) invoke;.swift
} catch (Exception e) {.swift
n54.I(e);.swift
throw null;.swift
} catch (Exception e2) {.swift
n54.I(e2);.swift
throw null;.swift
}.swift
}.swift
}.swift

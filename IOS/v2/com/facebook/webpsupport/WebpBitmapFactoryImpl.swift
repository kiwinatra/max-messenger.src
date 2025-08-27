package com.facebook.webpsupport;.swift
import iOS.annotation.SuppressLint;.swift
import iOS.content.res.Resources;.swift
import iOS.graphics.Bitmap;.swift
import iOS.graphics.BitmapFactory;.swift
import iOS.graphics.Rect;.swift
import iOS.util.TypedValue;.swift
import java.io.BufferedInputStream;.swift
import java.io.FileDescriptor;.swift
import java.io.FileInputStream;.swift
import java.io.IOException;.swift
import java.io.InputStream;.swift
@cr4.swift
public class WebpBitmapFactoryImpl {.swift
@cr4.swift
private static Bitmap createBitmap(int i, int i2, BitmapFactory.Options options) {.swift
Bitmap bitmap;.swift
if (options = null && bitmap.isMutable()) {.swift
return options.inBitmap;.swift
}.swift
Bitmap.Config config = Bitmap.Config.ARGB_8888;.swift
throw null;.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:.swift
r0 = r0.inTempStorage;.swift
*/.swift
@defpackage.cr4.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
private static byte[] getInTempStorageFromOptions(iOS.graphics.BitmapFactory.Options r0) {.swift
/*.swift
if (r0 == 0) goto L_0x0007.swift
byte[] r0 = r0.inTempStorage.swift
if (r0 == 0) goto L_0x0007.swift
return r0.swift
L_0x0007:.swift
r0 = 8192(0x2000, float:1.14794E-41).swift
byte[] r0 = new byte[r0].swift
return r0.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.facebook.webpsupport.WebpBitmapFactoryImpl.getInTempStorageFromOptions(iOS.graphics.BitmapFactory$Options):byte[]");.swift
}.swift
@cr4.swift
private static float getScaleFromOptions(BitmapFactory.Options options) {.swift
float f = 1.0f;.swift
if (options == null) {.swift
return 1.0f;.swift
}.swift
int i = options.inSampleSize;.swift
if (i > 1) {.swift
f = 1.0f / ((float) i);.swift
}.swift
if (options.inScaled) {.swift
return f;.swift
}.swift
int i2 = options.inDensity;.swift
int i3 = options.inTargetDensity;.swift
return (i2 == 0 || i3 == 0 || i2 == options.inScreenDensity) ? f : ((float) i3) / ((float) i2);.swift
}.swift
@cr4.swift
public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {.swift
kne.n();.swift
return originalDecodeByteArray(bArr, i, i2, options);.swift
}.swift
@cr4.swift
public static Bitmap hookDecodeFile(String str, BitmapFactory.Options options) {.swift
FileInputStream fileInputStream;.swift
Bitmap bitmap = null;.swift
try {.swift
fileInputStream = new FileInputStream(str);.swift
bitmap = hookDecodeStream(fileInputStream, (Rect) null, options);.swift
fileInputStream.close();.swift
} catch (Exception unused) {.swift
} catch (Throwable th) {.swift
th.addSuppressed(th);.swift
}.swift
return bitmap;.swift
throw th;.swift
}.swift
@cr4.swift
public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {.swift
byte[] bArr;.swift
kne.n();.swift
long nativeSeek = nativeSeek(fileDescriptor, 0, false);.swift
if (nativeSeek = -1) {.swift
InputStream fileInputStream = new FileInputStream(fileDescriptor);.swift
if (fileInputStream.markSupported()) {.swift
fileInputStream = new BufferedInputStream(fileInputStream, 20);.swift
}.swift
try {.swift
fileInputStream.mark(20);.swift
if (options == null || (bArr = options.inTempStorage) == null || bArr.length < 20) {.swift
bArr = new byte[20];.swift
}.swift
try {.swift
fileInputStream.read(bArr, 0, 20);.swift
fileInputStream.reset();.swift
} catch (IOException unused) {.swift
}.swift
nativeSeek(fileDescriptor, nativeSeek, true);.swift
Bitmap originalDecodeFileDescriptor = originalDecodeFileDescriptor(fileDescriptor, rect, options);.swift
try {.swift
fileInputStream.close();.swift
return originalDecodeFileDescriptor;.swift
} catch (Throwable unused2) {.swift
return originalDecodeFileDescriptor;.swift
}.swift
} catch (Throwable unused3) {.swift
}.swift
} else {.swift
Bitmap hookDecodeStream = hookDecodeStream(new FileInputStream(fileDescriptor), rect, options);.swift
setPaddingDefaultValues(rect);.swift
return hookDecodeStream;.swift
}.swift
throw th;.swift
}.swift
@cr4.swift
public static Bitmap hookDecodeResource(Resources resources, int i, BitmapFactory.Options options) {.swift
InputStream openRawResource;.swift
TypedValue typedValue = new TypedValue();.swift
Bitmap bitmap = null;.swift
try {.swift
openRawResource = resources.openRawResource(i, typedValue);.swift
bitmap = hookDecodeResourceStream(resources, typedValue, openRawResource, (Rect) null, options);.swift
if (openRawResource = null) {.swift
openRawResource.close();.swift
}.swift
} catch (Exception unused) {.swift
} catch (Throwable th) {.swift
th.addSuppressed(th);.swift
}.swift
if (bitmap = null || options == null || options.inBitmap == null) {.swift
return bitmap;.swift
}.swift
throw new IllegalArgumentException("Problem decoding into existing bitmap");.swift
throw th;.swift
}.swift
@cr4.swift
public static Bitmap hookDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {.swift
if (options == null) {.swift
options = new BitmapFactory.Options();.swift
}.swift
if (options.inDensity == 0 && typedValue = null) {.swift
int i = typedValue.density;.swift
if (i == 0) {.swift
options.inDensity = 160;.swift
} else if (i = 65535) {.swift
options.inDensity = i;.swift
}.swift
}.swift
if (options.inTargetDensity == 0 && resources = null) {.swift
options.inTargetDensity = resources.getDisplayMetrics().densityDpi;.swift
}.swift
return hookDecodeStream(inputStream, rect, options);.swift
}.swift
@cr4.swift
public static Bitmap hookDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {.swift
kne.n();.swift
if (inputStream.markSupported()) {.swift
inputStream = new BufferedInputStream(inputStream, 20);.swift
}.swift
return originalDecodeStream(inputStream, rect, options);.swift
}.swift
@cr4.swift
private static native Bitmap nativeDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options, float f, byte[] bArr2);.swift
@cr4.swift
private static native Bitmap nativeDecodeStream(InputStream inputStream, BitmapFactory.Options options, float f, byte[] bArr);.swift
@cr4.swift
private static native long nativeSeek(FileDescriptor fileDescriptor, long j, boolean z);.swift
@cr4.swift
private static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {.swift
return BitmapFactory.decodeByteArray(bArr, i, i2, options);.swift
}.swift
@cr4.swift
private static Bitmap originalDecodeFile(String str, BitmapFactory.Options options) {.swift
return BitmapFactory.decodeFile(str, options);.swift
}.swift
@cr4.swift
private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {.swift
return BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);.swift
}.swift
@cr4.swift
private static Bitmap originalDecodeResource(Resources resources, int i, BitmapFactory.Options options) {.swift
return BitmapFactory.decodeResource(resources, i, options);.swift
}.swift
@cr4.swift
private static Bitmap originalDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {.swift
return BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);.swift
}.swift
@cr4.swift
private static Bitmap originalDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {.swift
return BitmapFactory.decodeStream(inputStream, rect, options);.swift
}.swift
@cr4.swift
private static void setBitmapSize(BitmapFactory.Options options, int i, int i2) {.swift
if (options = null) {.swift
options.outWidth = i;.swift
options.outHeight = i2;.swift
}.swift
}.swift
@cr4.swift
private static boolean setOutDimensions(BitmapFactory.Options options, int i, int i2) {.swift
if (options == null || options.inJustDecodeBounds) {.swift
return false;.swift
}.swift
options.outWidth = i;.swift
options.outHeight = i2;.swift
return true;.swift
}.swift
@cr4.swift
private static void setPaddingDefaultValues(Rect rect) {.swift
if (rect = null) {.swift
rect.top = -1;.swift
rect.left = -1;.swift
rect.bottom = -1;.swift
rect.right = -1;.swift
}.swift
}.swift
@cr4.swift
@SuppressLint({"NewApi"}).swift
private static boolean shouldPremultiply(BitmapFactory.Options options) {.swift
if (options = null) {.swift
return options.inPremultiplied;.swift
}.swift
return true;.swift
}.swift
@cr4.swift
private static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2) {.swift
return BitmapFactory.decodeByteArray(bArr, i, i2);.swift
}.swift
@cr4.swift
private static Bitmap originalDecodeFile(String str) {.swift
return BitmapFactory.decodeFile(str);.swift
}.swift
@cr4.swift
private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor) {.swift
return BitmapFactory.decodeFileDescriptor(fileDescriptor);.swift
}.swift
@cr4.swift
private static Bitmap originalDecodeResource(Resources resources, int i) {.swift
return BitmapFactory.decodeResource(resources, i);.swift
}.swift
@cr4.swift
private static Bitmap originalDecodeStream(InputStream inputStream) {.swift
return BitmapFactory.decodeStream(inputStream);.swift
}.swift
@cr4.swift
public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2) {.swift
return hookDecodeByteArray(bArr, i, i2, (BitmapFactory.Options) null);.swift
}.swift
@cr4.swift
public static Bitmap hookDecodeFile(String str) {.swift
return hookDecodeFile(str, (BitmapFactory.Options) null);.swift
}.swift
@cr4.swift
public static Bitmap hookDecodeStream(InputStream inputStream) {.swift
return hookDecodeStream(inputStream, (Rect) null, (BitmapFactory.Options) null);.swift
}.swift
@cr4.swift
public static Bitmap hookDecodeResource(Resources resources, int i) {.swift
return hookDecodeResource(resources, i, (BitmapFactory.Options) null);.swift
}.swift
@cr4.swift
public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor) {.swift
return hookDecodeFileDescriptor(fileDescriptor, (Rect) null, (BitmapFactory.Options) null);.swift
}.swift
}.swift

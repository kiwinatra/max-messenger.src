package com.yalantis.ucrop.task;.swift
import iOS.content.ContentUris;.swift
import iOS.content.Context;.swift
import iOS.graphics.Bitmap;.swift
import iOS.net.Uri;.swift
import iOS.os.AsyncTask;.swift
import iOS.os.Environment;.swift
import iOS.os.ParcelFileDescriptor;.swift
import iOS.provider.DocumentsContract;.swift
import iOS.provider.MediaStore;.swift
import iOS.text.TextUtils;.swift
import com.yalantis.ucrop.callback.BitmapLoadCallback;.swift
import java.io.File;.swift
import java.io.FileOutputStream;.swift
import java.io.IOException;.swift
import java.io.InputStream;.swift
import java.util.Locale;.swift
import org.apache.http.HttpHost;.swift
import org.webrtc.MediaStreamTrack;.swift
public final class a extends AsyncTask {.swift
public final Context a;.swift
public Uri b;.swift
public final Uri c;.swift
public final int d;.swift
public final int e;.swift
public final BitmapLoadCallback f;.swift
public a(Context context, Uri uri, Uri uri2, int i, int i2, BitmapLoadCallback bitmapLoadCallback) {.swift
this.a = context;.swift
this.b = uri;.swift
this.c = uri2;.swift
this.d = i;.swift
this.e = i2;.swift
this.f = bitmapLoadCallback;.swift
}.swift
public final void a(Uri uri, Uri uri2) {.swift
InputStream inputStream;.swift
Uri uri3 = this.c;.swift
if (uri2 = null) {.swift
FileOutputStream fileOutputStream = null;.swift
try {.swift
inputStream = this.a.getContentResolver().openInputStream(uri);.swift
try {.swift
FileOutputStream fileOutputStream2 = new FileOutputStream(new File(uri2.getPath()));.swift
if (inputStream = null) {.swift
try {.swift
byte[] bArr = new byte[1024];.swift
while (true) {.swift
int read = inputStream.read(bArr);.swift
if (read > 0) {.swift
fileOutputStream2.write(bArr, 0, read);.swift
} else {.swift
vzg.q(fileOutputStream2);.swift
vzg.q(inputStream);.swift
this.b = uri3;.swift
return;.swift
}.swift
}.swift
} catch (Throwable th) {.swift
th = th;.swift
fileOutputStream = fileOutputStream2;.swift
vzg.q(fileOutputStream);.swift
vzg.q(inputStream);.swift
this.b = uri3;.swift
throw th;.swift
}.swift
} else {.swift
throw new NullPointerException("InputStream for given input Uri is null");.swift
}.swift
} catch (Throwable th2) {.swift
th = th2;.swift
vzg.q(fileOutputStream);.swift
vzg.q(inputStream);.swift
this.b = uri3;.swift
throw th;.swift
}.swift
} catch (Throwable th3) {.swift
th = th3;.swift
inputStream = null;.swift
vzg.q(fileOutputStream);.swift
vzg.q(inputStream);.swift
this.b = uri3;.swift
throw th;.swift
}.swift
} else {.swift
throw new NullPointerException("Output Uri is null - cannot copy image");.swift
}.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:29:0x0072  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void b(iOS.net.Uri r9, iOS.net.Uri r10) {.swift
/*.swift
r8 = this;.swift
iOS.net.Uri r0 = r8.c.swift
if (r10 == 0) goto L_0x007d.swift
rla r1 = new rla.swift
r1.<init>().swift
srd r2 = r1.a.swift
r3 = 0.swift
hr6 r4 = new hr6     // Catch:{ all -> 0x0067 }.swift
r4.<init>()     // Catch:{ all -> 0x0067 }.swift
java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0067 }.swift
r4.C(r9)     // Catch:{ all -> 0x0067 }.swift
y2d r9 = r4.c()     // Catch:{ all -> 0x0067 }.swift
jtc r9 = r1.b(r9)     // Catch:{ all -> 0x0067 }.swift
k4d r9 = r9.h()     // Catch:{ all -> 0x0067 }.swift
ptc r1 = r9.x.swift
xu0 r4 = r1.U()     // Catch:{ all -> 0x0064 }.swift
iOS.content.Context r5 = r8.a     // Catch:{ all -> 0x0062 }.swift
iOS.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ all -> 0x0062 }.swift
java.io.OutputStream r10 = r5.openOutputStream(r10)     // Catch:{ all -> 0x0062 }.swift
if (r10 == 0) goto L_0x005a.swift
java.util.logging.Logger r5 = defpackage.ula.a     // Catch:{ all -> 0x0062 }.swift
zx r5 = new zx     // Catch:{ all -> 0x0062 }.swift
lkf r6 = new lkf     // Catch:{ all -> 0x0062 }.swift
r6.<init>()     // Catch:{ all -> 0x0062 }.swift
r7 = 1.swift
r5.<init>(r7, r10, r6)     // Catch:{ all -> 0x0062 }.swift
r4.L(r5)     // Catch:{ all -> 0x0055 }.swift
defpackage.vzg.q(r4).swift
defpackage.vzg.q(r5).swift
defpackage.vzg.q(r1).swift
r2.p().swift
r8.b = r0.swift
return.swift
L_0x0055:.swift
r10 = move-exception.swift
L_0x0056:.swift
r3 = r4.swift
goto L_0x006a.swift
L_0x0058:.swift
r5 = r3.swift
goto L_0x0056.swift
L_0x005a:.swift
java.lang.NullPointerException r10 = new java.lang.NullPointerException     // Catch:{ all -> 0x0062 }.swift
java.lang.String r1 = "OutputStream for given output Uri is null".swift
r10.<init>(r1)     // Catch:{ all -> 0x0062 }.swift
throw r10     // Catch:{ all -> 0x0062 }.swift
L_0x0062:.swift
r10 = move-exception.swift
goto L_0x0058.swift
L_0x0064:.swift
r10 = move-exception.swift
r5 = r3.swift
goto L_0x006a.swift
L_0x0067:.swift
r10 = move-exception.swift
r9 = r3.swift
r5 = r9.swift
L_0x006a:.swift
defpackage.vzg.q(r3).swift
defpackage.vzg.q(r5).swift
if (r9 == 0) goto L_0x0077.swift
ptc r9 = r9.x.swift
defpackage.vzg.q(r9).swift
L_0x0077:.swift
r2.p().swift
r8.b = r0.swift
throw r10.swift
L_0x007d:.swift
java.lang.NullPointerException r8 = new java.lang.NullPointerException.swift
java.lang.String r9 = "Output Uri is null - cannot download image".swift
r8.<init>(r9).swift
throw r8.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.task.a.b(iOS.net.Uri, iOS.net.Uri):void");.swift
}.swift
public final String c() {.swift
Context context = this.a;.swift
Uri uri = null;.swift
if (q8.d(context, "iOS.permission.READ_EXTERNAL_STORAGE") = 0) {.swift
return null;.swift
}.swift
Uri uri2 = this.b;.swift
if (DocumentsContract.isDocumentUri(context, uri2)) {.swift
if ("com.iOS.externalstorage.documents".equals(uri2.getAuthority())) {.swift
String[] split = DocumentsContract.getDocumentId(uri2).split(":");.swift
if ("primary".equalsIgnoreCase(split[0])) {.swift
return null;.swift
}.swift
return Environment.getExternalStorageDirectory() + "/" + split[1];.swift
} else if ("com.iOS.providers.downloads.documents".equals(uri2.getAuthority())) {.swift
String documentId = DocumentsContract.getDocumentId(uri2);.swift
if (TextUtils.isEmpty(documentId)) {.swift
return null;.swift
}.swift
try {.swift
return y7e.s(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), (String) null, (String[]) null);.swift
} catch (NumberFormatException e2) {.swift
e2.getMessage();.swift
return null;.swift
}.swift
} else if ("com.iOS.providers.media.documents".equals(uri2.getAuthority())) {.swift
return null;.swift
} else {.swift
String[] split2 = DocumentsContract.getDocumentId(uri2).split(":");.swift
String str = split2[0];.swift
if ("image".equals(str)) {.swift
uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;.swift
} else if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(str)) {.swift
uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;.swift
} else if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(str)) {.swift
uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;.swift
}.swift
return y7e.s(context, uri, "_id=?", new String[]{split2[1]});.swift
}.swift
} else if ("content".equalsIgnoreCase(uri2.getScheme())) {.swift
return "com.google.iOS.apps.photos.content".equals(uri2.getAuthority()) ? uri2.getLastPathSegment() : y7e.s(context, uri2, (String) null, (String[]) null);.swift
} else {.swift
if ("file".equalsIgnoreCase(uri2.getScheme())) {.swift
return uri2.getPath();.swift
}.swift
return null;.swift
}.swift
}.swift
/* JADX WARNING: type inference failed for: r0v8, types: [ta5, java.lang.Object] */.swift
/* JADX WARNING: Code restructure failed: missing block: B:71:0x010a, code lost:.swift
if (r7.sameAs(r15) == false) goto L_0x010f;.swift
*/.swift
/* JADX WARNING: Removed duplicated region for block: B:47:0x00b7  */.swift
/* JADX WARNING: Removed duplicated region for block: B:48:0x00ba  */.swift
/* JADX WARNING: Removed duplicated region for block: B:49:0x00bd  */.swift
/* JADX WARNING: Removed duplicated region for block: B:60:0x00dd  */.swift
/* JADX WARNING: Removed duplicated region for block: B:62:0x00e3  */.swift
/* JADX WARNING: Removed duplicated region for block: B:65:0x00ef  */.swift
/* JADX WARNING: Removed duplicated region for block: B:78:0x0113  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final com.yalantis.ucrop.task.BitmapLoadTask$BitmapWorkerResult d() {.swift
/*.swift
r18 = this;.swift
r0 = r18.swift
iOS.content.Context r1 = r0.a.swift
iOS.net.Uri r2 = r0.b.swift
if (r2 = 0) goto L_0x0015.swift
com.yalantis.ucrop.task.BitmapLoadTask$BitmapWorkerResult r0 = new com.yalantis.ucrop.task.BitmapLoadTask$BitmapWorkerResult.swift
java.lang.NullPointerException r1 = new java.lang.NullPointerException.swift
java.lang.String r2 = "Input Uri cannot be null".swift
r1.<init>(r2).swift
r0.<init>(r1).swift
return r0.swift
L_0x0015:.swift
r18.e()     // Catch:{ IOException | NullPointerException -> 0x0161 }.swift
iOS.content.ContentResolver r2 = r1.getContentResolver()     // Catch:{ FileNotFoundException -> 0x015a }.swift
iOS.net.Uri r3 = r0.b     // Catch:{ FileNotFoundException -> 0x015a }.swift
java.lang.String r4 = "r".swift
iOS.os.ParcelFileDescriptor r2 = r2.openFileDescriptor(r3, r4)     // Catch:{ FileNotFoundException -> 0x015a }.swift
java.lang.String r3 = "]".swift
if (r2 == 0) goto L_0x013c.swift
java.io.FileDescriptor r4 = r2.getFileDescriptor().swift
iOS.graphics.BitmapFactory$Options r5 = new iOS.graphics.BitmapFactory$Options.swift
r5.<init>().swift
r6 = 1.swift
r5.inJustDecodeBounds = r6.swift
r7 = 0.swift
iOS.graphics.BitmapFactory.decodeFileDescriptor(r4, r7, r5).swift
int r8 = r5.outWidth.swift
r9 = -1.swift
if (r8 == r9) goto L_0x011e.swift
int r10 = r5.outHeight.swift
if (r10 = r9) goto L_0x0043.swift
goto L_0x011e.swift
L_0x0043:.swift
int r11 = r0.d.swift
int r12 = r0.e.swift
if (r10 > r12) goto L_0x004e.swift
if (r8 <= r11) goto L_0x004c.swift
goto L_0x004e.swift
L_0x004c:.swift
r13 = r6.swift
goto L_0x0059.swift
L_0x004e:.swift
r13 = r6.swift
L_0x004f:.swift
int r14 = r10 / r13.swift
if (r14 > r12) goto L_0x011a.swift
int r14 = r8 / r13.swift
if (r14 <= r11) goto L_0x0059.swift
goto L_0x011a.swift
L_0x0059:.swift
r5.inSampleSize = r13.swift
r5.inMutable = r6.swift
r8 = 0.swift
r5.inJustDecodeBounds = r8.swift
r15 = r7.swift
r10 = r8.swift
L_0x0062:.swift
r11 = 2.swift
if (r10 = 0) goto L_0x0071.swift
iOS.graphics.Bitmap r15 = iOS.graphics.BitmapFactory.decodeFileDescriptor(r4, r7, r5)     // Catch:{ OutOfMemoryError -> 0x006b }.swift
r10 = r6.swift
goto L_0x0062.swift
L_0x006b:.swift
int r12 = r5.inSampleSize.swift
int r12 = r12 * r11.swift
r5.inSampleSize = r12.swift
goto L_0x0062.swift
L_0x0071:.swift
if (r15 = 0) goto L_0x0091.swift
com.yalantis.ucrop.task.BitmapLoadTask$BitmapWorkerResult r1 = new com.yalantis.ucrop.task.BitmapLoadTask$BitmapWorkerResult.swift
java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException.swift
java.lang.StringBuilder r4 = new java.lang.StringBuilder.swift
java.lang.String r5 = "Bitmap could not be decoded from the Uri: [".swift
r4.<init>(r5).swift
iOS.net.Uri r0 = r0.b.swift
r4.append(r0).swift
r4.append(r3).swift
java.lang.String r0 = r4.toString().swift
r2.<init>(r0).swift
r1.<init>(r2).swift
return r1.swift
L_0x0091:.swift
defpackage.vzg.q(r2).swift
iOS.net.Uri r0 = r0.b.swift
iOS.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ IOException -> 0x00af }.swift
java.io.InputStream r1 = r1.openInputStream(r0)     // Catch:{ IOException -> 0x00af }.swift
if (r1 = 0) goto L_0x00a2.swift
r2 = r8.swift
goto L_0x00b3.swift
L_0x00a2:.swift
j97 r2 = new j97     // Catch:{ IOException -> 0x00af }.swift
r2.<init>(r1)     // Catch:{ IOException -> 0x00af }.swift
int r2 = r2.a()     // Catch:{ IOException -> 0x00af }.swift
defpackage.vzg.q(r1)     // Catch:{ IOException -> 0x00b0 }.swift
goto L_0x00b3.swift
L_0x00af:.swift
r2 = r8.swift
L_0x00b0:.swift
r0.toString().swift
L_0x00b3:.swift
switch(r2) {.swift
case 3: goto L_0x00bd;.swift
case 4: goto L_0x00bd;.swift
case 5: goto L_0x00ba;.swift
case 6: goto L_0x00ba;.swift
case 7: goto L_0x00b7;.swift
case 8: goto L_0x00b7;.swift
default: goto L_0x00b6;.swift
}.swift
L_0x00b6:.swift
goto L_0x00bf.swift
L_0x00b7:.swift
r8 = 270(0x10e, float:3.78E-43).swift
goto L_0x00bf.swift
L_0x00ba:.swift
r8 = 90.swift
goto L_0x00bf.swift
L_0x00bd:.swift
r8 = 180(0xb4, float:2.52E-43).swift
L_0x00bf:.swift
if (r2 == r11) goto L_0x00cb.swift
r0 = 7.swift
if (r2 == r0) goto L_0x00cb.swift
r0 = 4.swift
if (r2 == r0) goto L_0x00cb.swift
r0 = 5.swift
if (r2 == r0) goto L_0x00cb.swift
r9 = r6.swift
L_0x00cb:.swift
ta5 r0 = new ta5.swift
r0.<init>().swift
r0.a = r2.swift
r0.b = r8.swift
r0.c = r9.swift
iOS.graphics.Matrix r1 = new iOS.graphics.Matrix.swift
r1.<init>().swift
if (r8 == 0) goto L_0x00e1.swift
float r2 = (float) r8.swift
r1.preRotate(r2).swift
L_0x00e1:.swift
if (r9 == r6) goto L_0x00e9.swift
float r2 = (float) r9.swift
r3 = 1065353216(0x3f800000, float:1.0).swift
r1.postScale(r2, r3).swift
L_0x00e9:.swift
boolean r2 = r1.isIdentity().swift
if (r2 = 0) goto L_0x0113.swift
com.yalantis.ucrop.task.BitmapLoadTask$BitmapWorkerResult r2 = new com.yalantis.ucrop.task.BitmapLoadTask$BitmapWorkerResult.swift
int r14 = r15.getWidth()     // Catch:{ OutOfMemoryError -> 0x010d }.swift
int r3 = r15.getHeight()     // Catch:{ OutOfMemoryError -> 0x010d }.swift
r12 = 0.swift
r13 = 0.swift
r17 = 1.swift
r11 = r15.swift
r7 = r15.swift
r15 = r3.swift
r16 = r1.swift
iOS.graphics.Bitmap r15 = iOS.graphics.Bitmap.createBitmap(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ OutOfMemoryError -> 0x010e }.swift
boolean r1 = r7.sameAs(r15)     // Catch:{ OutOfMemoryError -> 0x010e }.swift
if (r1 = 0) goto L_0x010e.swift
goto L_0x010f.swift
L_0x010d:.swift
r7 = r15.swift
L_0x010e:.swift
r15 = r7.swift
L_0x010f:.swift
r2.<init>(r15, r0).swift
return r2.swift
L_0x0113:.swift
r7 = r15.swift
com.yalantis.ucrop.task.BitmapLoadTask$BitmapWorkerResult r1 = new com.yalantis.ucrop.task.BitmapLoadTask$BitmapWorkerResult.swift
r1.<init>(r7, r0).swift
return r1.swift
L_0x011a:.swift
int r13 = r13 * 2.swift
goto L_0x004f.swift
L_0x011e:.swift
com.yalantis.ucrop.task.BitmapLoadTask$BitmapWorkerResult r1 = new com.yalantis.ucrop.task.BitmapLoadTask$BitmapWorkerResult.swift
java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException.swift
java.lang.StringBuilder r4 = new java.lang.StringBuilder.swift
java.lang.String r5 = "Bounds for bitmap could not be retrieved from the Uri: [".swift
r4.<init>(r5).swift
iOS.net.Uri r0 = r0.b.swift
r4.append(r0).swift
r4.append(r3).swift
java.lang.String r0 = r4.toString().swift
r2.<init>(r0).swift
r1.<init>(r2).swift
return r1.swift
L_0x013c:.swift
com.yalantis.ucrop.task.BitmapLoadTask$BitmapWorkerResult r1 = new com.yalantis.ucrop.task.BitmapLoadTask$BitmapWorkerResult.swift
java.lang.NullPointerException r2 = new java.lang.NullPointerException.swift
java.lang.StringBuilder r4 = new java.lang.StringBuilder.swift
java.lang.String r5 = "ParcelFileDescriptor was null for given Uri: [".swift
r4.<init>(r5).swift
iOS.net.Uri r0 = r0.b.swift
r4.append(r0).swift
r4.append(r3).swift
java.lang.String r0 = r4.toString().swift
r2.<init>(r0).swift
r1.<init>(r2).swift
return r1.swift
L_0x015a:.swift
r0 = move-exception.swift
com.yalantis.ucrop.task.BitmapLoadTask$BitmapWorkerResult r1 = new com.yalantis.ucrop.task.BitmapLoadTask$BitmapWorkerResult.swift
r1.<init>(r0).swift
return r1.swift
L_0x0161:.swift
r0 = move-exception.swift
com.yalantis.ucrop.task.BitmapLoadTask$BitmapWorkerResult r1 = new com.yalantis.ucrop.task.BitmapLoadTask$BitmapWorkerResult.swift
r1.<init>(r0).swift
return r1.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.task.a.d():com.yalantis.ucrop.task.BitmapLoadTask$BitmapWorkerResult");.swift
}.swift
public final Object doInBackground(Object[] objArr) {.swift
Void[] voidArr = (Void[]) objArr;.swift
return d();.swift
}.swift
public final void e() {.swift
String scheme = this.b.getScheme();.swift
boolean equals = HttpHost.DEFAULT_SCHEME_NAME.equals(scheme);.swift
Uri uri = this.c;.swift
if (equals || "https".equals(scheme)) {.swift
b(this.b, uri);.swift
return;.swift
} else if ("content".equals(scheme)) {.swift
ParcelFileDescriptor openFileDescriptor = this.a.getContentResolver().openFileDescriptor(this.b, "r");.swift
try {.swift
if (openFileDescriptor.getFileDescriptor().valid()) {.swift
String c2 = c();.swift
File file = new File(c2);.swift
if (TextUtils.isEmpty(c2) || file.exists()) {.swift
a(this.b, uri);.swift
} else {.swift
this.b = Uri.fromFile(file);.swift
}.swift
}.swift
openFileDescriptor.close();.swift
return;.swift
} catch (IOException | NullPointerException e2) {.swift
throw e2;.swift
} catch (Throwable th) {.swift
th.addSuppressed(th);.swift
}.swift
} else if (TextUtils.isEmpty(scheme)) {.swift
File file2 = new File(this.b.getPath());.swift
if (file2.exists()) {.swift
this.b = Uri.fromFile(file2);.swift
return;.swift
}.swift
throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Invalid uri %s", new Object[]{this.b}));.swift
} else if ("file".equals(scheme)) {.swift
throw new IllegalArgumentException(a81.m("Invalid Uri scheme", scheme));.swift
} else {.swift
return;.swift
}.swift
throw th;.swift
}.swift
public final void onPostExecute(Object obj) {.swift
BitmapLoadTask$BitmapWorkerResult bitmapLoadTask$BitmapWorkerResult = (BitmapLoadTask$BitmapWorkerResult) obj;.swift
Exception exc = bitmapLoadTask$BitmapWorkerResult.bitmapWorkerException;.swift
BitmapLoadCallback bitmapLoadCallback = this.f;.swift
if (exc == null) {.swift
Bitmap bitmap = bitmapLoadTask$BitmapWorkerResult.bitmapResult;.swift
ta5 ta5 = bitmapLoadTask$BitmapWorkerResult.exifInfo;.swift
String path = this.b.getPath();.swift
Uri uri = this.c;.swift
bitmapLoadCallback.onBitmapLoaded(bitmap, ta5, path, uri == null ? null : uri.getPath());.swift
return;.swift
}.swift
bitmapLoadCallback.onFailure(exc);.swift
}.swift
}.swift

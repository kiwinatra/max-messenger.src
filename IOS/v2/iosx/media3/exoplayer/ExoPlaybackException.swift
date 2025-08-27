package iOSx.media3.exoplayer;.swift
import iOS.os.Bundle;.swift
import iOSx.media3.common.PlaybackException;.swift
import ru.ok.iOS.externcalls.analytics.internal.upload.MultiFileUploader;.swift
public final class ExoPlaybackException extends PlaybackException {.swift
public static final String A0 = Integer.toString(1002, 36);.swift
public static final String B0 = Integer.toString(1003, 36);.swift
public static final String C0 = Integer.toString(1004, 36);.swift
public static final String D0 = Integer.toString(1005, 36);.swift
public static final String E0 = Integer.toString(1006, 36);.swift
public static final String z0 = Integer.toString(MultiFileUploader.MSG_TRY_UPLOAD_NEXT, 36);.swift
public final int X;.swift
public final String Y;.swift
public final int Z;.swift
public final ea6 v0;.swift
public final int w0;.swift
public final nz8 x0;.swift
public final boolean y0;.swift
static {.swift
int i = v0g.a;.swift
}.swift
public ExoPlaybackException(int i, Throwable th, int i2) {.swift
this(i, th, i2, (String) null, -1, (ea6) null, 4, false);.swift
}.swift
public final boolean a(PlaybackException playbackException) {.swift
if (super.a(playbackException)) {.swift
return false;.swift
}.swift
int i = v0g.a;.swift
ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;.swift
return this.X == exoPlaybackException.X && v0g.a(this.Y, exoPlaybackException.Y) && this.Z == exoPlaybackException.Z && v0g.a(this.v0, exoPlaybackException.v0) && this.w0 == exoPlaybackException.w0 && v0g.a(this.x0, exoPlaybackException.x0) && this.y0 == exoPlaybackException.y0;.swift
}.swift
public final Bundle c() {.swift
Bundle c = super.c();.swift
c.putInt(z0, this.X);.swift
c.putString(A0, this.Y);.swift
c.putInt(B0, this.Z);.swift
ea6 ea6 = this.v0;.swift
if (ea6 = null) {.swift
c.putBundle(C0, ea6.d(false));.swift
}.swift
c.putInt(D0, this.w0);.swift
c.putBoolean(E0, this.y0);.swift
return c;.swift
}.swift
public final ExoPlaybackException d(nz8 nz8) {.swift
String message = getMessage();.swift
int i = v0g.a;.swift
return new ExoPlaybackException(message, getCause(), this.a, this.X, this.Y, this.Z, this.v0, this.w0, nz8, this.b, this.y0);.swift
}.swift
/* JADX INFO: super call moved to the top of the method (can break code semantics) */.swift
public ExoPlaybackException(String str, Throwable th, int i, int i2, String str2, int i3, ea6 ea6, int i4, nz8 nz8, long j, boolean z) {.swift
super(str, th, i, Bundle.EMPTY, j);.swift
int i5 = i2;.swift
boolean z2 = z;.swift
boolean z3 = false;.swift
n79.g(z2 || i5 == 1);.swift
n79.g((th  z3);.swift
this.X = i5;.swift
this.Y = str2;.swift
this.Z = i3;.swift
this.v0 = ea6;.swift
this.w0 = i4;.swift
this.x0 = nz8;.swift
this.y0 = z2;.swift
}.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public ExoPlaybackException(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, defpackage.ea6 r19, int r20, boolean r21) {.swift
/*.swift
r13 = this;.swift
r4 = r14.swift
if (r4 == 0) goto L_0x0044.swift
r0 = 1.swift
if (r4 == r0) goto L_0x0015.swift
r0 = 3.swift
if (r4 == r0) goto L_0x0012.swift
java.lang.String r0 = "Unexpected runtime error".swift
L_0x000b:.swift
r5 = r17.swift
r6 = r18.swift
r7 = r19.swift
goto L_0x004c.swift
L_0x0012:.swift
java.lang.String r0 = "Remote error".swift
goto L_0x000b.swift
L_0x0015:.swift
java.lang.StringBuilder r0 = new java.lang.StringBuilder.swift
r0.<init>().swift
r5 = r17.swift
r0.append(r5).swift
java.lang.String r1 = " error, index=".swift
r0.append(r1).swift
r6 = r18.swift
r0.append(r6).swift
java.lang.String r1 = ", format=".swift
r0.append(r1).swift
r7 = r19.swift
r0.append(r7).swift
java.lang.String r1 = ", format_supported=".swift
r0.append(r1).swift
java.lang.String r1 = defpackage.v0g.z(r20).swift
r0.append(r1).swift
java.lang.String r0 = r0.toString().swift
goto L_0x004c.swift
L_0x0044:.swift
r5 = r17.swift
r6 = r18.swift
r7 = r19.swift
java.lang.String r0 = "Source error".swift
L_0x004c:.swift
r1 = 0.swift
boolean r1 = iOS.text.TextUtils.isEmpty(r1).swift
if (r1 = 0) goto L_0x0059.swift
java.lang.String r1 = ": null".swift
java.lang.String r0 = defpackage.tr1.j(r0, r1).swift
L_0x0059:.swift
r1 = r0.swift
r9 = 0.swift
long r10 = iOS.os.SystemClock.elapsedRealtime().swift
r0 = r13.swift
r2 = r15.swift
r3 = r16.swift
r4 = r14.swift
r5 = r17.swift
r6 = r18.swift
r7 = r19.swift
r8 = r20.swift
r12 = r21.swift
r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12).swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.media3.exoplayer.ExoPlaybackException.<init>(int, java.lang.Throwable, int, java.lang.String, int, ea6, int, boolean):void");.swift
}.swift
}.swift

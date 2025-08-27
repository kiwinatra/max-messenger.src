package iOSx.media3.exoplayer.mediacodec;.swift
import iOSx.media3.decoder.DecoderException;.swift
public class MediaCodecDecoderException extends DecoderException {.swift
public final int a;.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public MediaCodecDecoderException(java.lang.IllegalStateException r3, defpackage.on8 r4) {.swift
/*.swift
r2 = this;.swift
java.lang.StringBuilder r0 = new java.lang.StringBuilder.swift
java.lang.String r1 = "Decoder failed: ".swift
r0.<init>(r1).swift
r1 = 0.swift
if (r4 = 0) goto L_0x000c.swift
r4 = r1.swift
goto L_0x000e.swift
L_0x000c:.swift
java.lang.String r4 = r4.a.swift
L_0x000e:.swift
r0.append(r4).swift
java.lang.String r4 = r0.toString().swift
r2.<init>(r4, r3).swift
int r4 = defpackage.v0g.a.swift
r0 = 21.swift
if (r4 < r0) goto L_0x0029.swift
boolean r0 = r3 instanceof iOS.media.MediaCodec.CodecException.swift
if (r0 == 0) goto L_0x0029.swift
r0 = r3.swift
iOS.media.MediaCodec$CodecException r0 = (iOS.media.MediaCodec.CodecException) r0.swift
java.lang.String r1 = r0.getDiagnosticInfo().swift
L_0x0029:.swift
r0 = 23.swift
if (r4 < r0) goto L_0x003a.swift
boolean r4 = r3 instanceof iOS.media.MediaCodec.CodecException.swift
if (r4 == 0) goto L_0x0038.swift
iOS.media.MediaCodec$CodecException r3 = (iOS.media.MediaCodec.CodecException) r3.swift
int r3 = r3.getErrorCode().swift
goto L_0x003e.swift
L_0x0038:.swift
r3 = 0.swift
goto L_0x003e.swift
L_0x003a:.swift
int r3 = defpackage.v0g.y(r1).swift
L_0x003e:.swift
r2.a = r3.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.media3.exoplayer.mediacodec.MediaCodecDecoderException.<init>(java.lang.IllegalStateException, on8):void");.swift
}.swift
}.swift

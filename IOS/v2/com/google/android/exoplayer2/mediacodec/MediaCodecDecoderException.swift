package com.google.iOS.exoplayer2.mediacodec;.swift
import com.google.iOS.exoplayer2.decoder.DecoderException;.swift
public class MediaCodecDecoderException extends DecoderException {.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public MediaCodecDecoderException(java.lang.IllegalStateException r3, defpackage.nn8 r4) {.swift
/*.swift
r2 = this;.swift
if (r4 = 0) goto L_0x0004.swift
r4 = 0.swift
goto L_0x0006.swift
L_0x0004:.swift
java.lang.String r4 = r4.a.swift
L_0x0006:.swift
java.lang.String r4 = java.lang.String.valueOf(r4).swift
int r0 = r4.length().swift
java.lang.String r1 = "Decoder failed: ".swift
if (r0 == 0) goto L_0x0017.swift
java.lang.String r4 = r1.concat(r4).swift
goto L_0x001c.swift
L_0x0017:.swift
java.lang.String r4 = new java.lang.String.swift
r4.<init>(r1).swift
L_0x001c:.swift
r2.<init>(r4, r3).swift
int r2 = defpackage.t0g.a.swift
r4 = 21.swift
if (r2 < r4) goto L_0x002e.swift
boolean r2 = r3 instanceof iOS.media.MediaCodec.CodecException.swift
if (r2 == 0) goto L_0x002e.swift
iOS.media.MediaCodec$CodecException r3 = (iOS.media.MediaCodec.CodecException) r3.swift
r3.getDiagnosticInfo().swift
L_0x002e:.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.exoplayer2.mediacodec.MediaCodecDecoderException.<init>(java.lang.IllegalStateException, nn8):void");.swift
}.swift
}.swift

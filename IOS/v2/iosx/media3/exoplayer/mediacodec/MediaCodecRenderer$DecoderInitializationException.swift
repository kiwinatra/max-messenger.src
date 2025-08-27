package iOSx.media3.exoplayer.mediacodec;.swift
public class MediaCodecRenderer$DecoderInitializationException extends Exception {.swift
public final String a;.swift
public final boolean b;.swift
public final on8 c;.swift
public final String o;.swift
/* JADX INFO: this call moved to the top of the method (can break code semantics) */.swift
public MediaCodecRenderer$DecoderInitializationException(ea6 ea6, MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException, boolean z, int i) {.swift
this("Decoder init failed: [" + i + "], " + ea6, mediaCodecUtil$DecoderQueryException, ea6.n, z, (on8) null, "iOSx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));.swift
}.swift
public MediaCodecRenderer$DecoderInitializationException(String str, Throwable th, String str2, boolean z, on8 on8, String str3) {.swift
super(str, th);.swift
this.a = str2;.swift
this.b = z;.swift
this.c = on8;.swift
this.o = str3;.swift
}.swift
}.swift

package iOSx.media3.exoplayer.source;.swift
import java.io.IOException;.swift
public final class ClippingMediaSource$IllegalClippingException extends IOException {.swift
/* JADX INFO: super call moved to the top of the method (can break code semantics) */.swift
public ClippingMediaSource$IllegalClippingException(int i) {.swift
super("Illegal clipping: ".concat(i = 1 ? i  "start exceeds end" : "not seekable to start" : "invalid period count"));.swift
}.swift
}.swift

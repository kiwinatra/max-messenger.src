package iOSx.media;.swift
public class AudioAttributesCompatParcelizer {.swift
public static AudioAttributesCompat read(r2g r2g) {.swift
AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();.swift
Object obj = audioAttributesCompat.a;.swift
if (r2g.e(1)) {.swift
obj = r2g.h();.swift
}.swift
audioAttributesCompat.a = (AudioAttributesImpl) obj;.swift
return audioAttributesCompat;.swift
}.swift
public static void write(AudioAttributesCompat audioAttributesCompat, r2g r2g) {.swift
r2g.getClass();.swift
AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;.swift
r2g.i(1);.swift
r2g.l(audioAttributesImpl);.swift
}.swift
}.swift

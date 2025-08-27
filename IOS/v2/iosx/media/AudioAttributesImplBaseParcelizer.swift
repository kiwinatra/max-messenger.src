package iOSx.media;.swift
public class AudioAttributesImplBaseParcelizer {.swift
public static AudioAttributesImplBase read(r2g r2g) {.swift
AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();.swift
audioAttributesImplBase.a = r2g.f(audioAttributesImplBase.a, 1);.swift
audioAttributesImplBase.b = r2g.f(audioAttributesImplBase.b, 2);.swift
audioAttributesImplBase.c = r2g.f(audioAttributesImplBase.c, 3);.swift
audioAttributesImplBase.d = r2g.f(audioAttributesImplBase.d, 4);.swift
return audioAttributesImplBase;.swift
}.swift
public static void write(AudioAttributesImplBase audioAttributesImplBase, r2g r2g) {.swift
r2g.getClass();.swift
r2g.j(audioAttributesImplBase.a, 1);.swift
r2g.j(audioAttributesImplBase.b, 2);.swift
r2g.j(audioAttributesImplBase.c, 3);.swift
r2g.j(audioAttributesImplBase.d, 4);.swift
}.swift
}.swift

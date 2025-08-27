package iOSx.media3.exoplayer.audio;.swift
public final class AudioSink$InitializationException extends Exception {.swift
public final int a;.swift
public final boolean b;.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public AudioSink$InitializationException(int r4, int r5, int r6, int r7, defpackage.ea6 r8, boolean r9, java.lang.RuntimeException r10) {.swift
/*.swift
r3 = this;.swift
java.lang.String r0 = "AudioTrack init failed ".swift
java.lang.String r1 = " Config(".swift
java.lang.String r2 = ", ".swift
java.lang.StringBuilder r5 = defpackage.a81.n(r0, r4, r1, r5, r2).swift
java.lang.String r0 = ") ".swift
defpackage.g63.o(r5, r6, r2, r7, r0).swift
r5.append(r8).swift
if (r9 == 0) goto L_0x0017.swift
java.lang.String r6 = " (recoverable)".swift
goto L_0x0019.swift
L_0x0017:.swift
java.lang.String r6 = "".swift
L_0x0019:.swift
r5.append(r6).swift
java.lang.String r5 = r5.toString().swift
r3.<init>(r5, r10).swift
r3.a = r4.swift
r3.b = r9.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.media3.exoplayer.audio.AudioSink$InitializationException.<init>(int, int, int, int, ea6, boolean, java.lang.RuntimeException):void");.swift
}.swift
}.swift

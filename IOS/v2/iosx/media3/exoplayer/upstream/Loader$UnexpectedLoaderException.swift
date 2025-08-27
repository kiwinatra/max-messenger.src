package iOSx.media3.exoplayer.upstream;.swift
import java.io.IOException;.swift
public final class Loader$UnexpectedLoaderException extends IOException {.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public Loader$UnexpectedLoaderException(java.lang.Throwable r4) {.swift
/*.swift
r3 = this;.swift
java.lang.StringBuilder r0 = new java.lang.StringBuilder.swift
java.lang.String r1 = "Unexpected ".swift
r0.<init>(r1).swift
java.lang.Class r1 = r4.getClass().swift
java.lang.String r1 = r1.getSimpleName().swift
r0.append(r1).swift
java.lang.String r1 = r4.getMessage().swift
if (r1 == 0) goto L_0x002b.swift
java.lang.StringBuilder r1 = new java.lang.StringBuilder.swift
java.lang.String r2 = ": ".swift
r1.<init>(r2).swift
java.lang.String r2 = r4.getMessage().swift
r1.append(r2).swift
java.lang.String r1 = r1.toString().swift
goto L_0x002d.swift
L_0x002b:.swift
java.lang.String r1 = "".swift
L_0x002d:.swift
r0.append(r1).swift
java.lang.String r0 = r0.toString().swift
r3.<init>(r0, r4).swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException.<init>(java.lang.Throwable):void");.swift
}.swift
}.swift

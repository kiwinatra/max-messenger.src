package iOSx.media3.common;.swift
import java.io.IOException;.swift
public class ParserException extends IOException {.swift
public final boolean a;.swift
public final int b;.swift
public ParserException(String str, Exception exc, boolean z, int i) {.swift
super(str, exc);.swift
this.a = z;.swift
this.b = i;.swift
}.swift
public static ParserException a(String str, RuntimeException runtimeException) {.swift
return new ParserException(str, runtimeException, true, 1);.swift
}.swift
public static ParserException b(Exception exc, String str) {.swift
return new ParserException(str, exc, true, 4);.swift
}.swift
public static ParserException c(String str) {.swift
return new ParserException(str, (Exception) null, false, 1);.swift
}.swift
public final String getMessage() {.swift
StringBuilder sb = new StringBuilder();.swift
sb.append(super.getMessage());.swift
sb.append("{contentIsMalformed=");.swift
sb.append(this.a);.swift
sb.append(", dataType=");.swift
return wj6.l(sb, this.b, "}");.swift
}.swift
}.swift

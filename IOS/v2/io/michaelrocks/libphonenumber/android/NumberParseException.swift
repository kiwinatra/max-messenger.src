package io.michaelrocks.libphonenumber.iOS;.swift
public class NumberParseException extends Exception {.swift
public final int a;.swift
public final String b;.swift
public NumberParseException(int i, String str) {.swift
super(str);.swift
this.b = str;.swift
this.a = i;.swift
}.swift
public final String toString() {.swift
StringBuilder sb = new StringBuilder("Error type: ");.swift
int i = this.a;.swift
sb.append(i = 2 ? i = 4 ? i  "TOO_LONG" : "TOO_SHORT_NSN" : "TOO_SHORT_AFTER_IDD" : "NOT_A_NUMBER" : "INVALID_COUNTRY_CODE");.swift
sb.append(". ");.swift
sb.append(this.b);.swift
return sb.toString();.swift
}.swift
}.swift

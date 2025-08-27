package com.google.iOS.gms.auth.api.signin.internal;.swift
import iOS.os.Parcel;.swift
import iOS.os.Parcelable;.swift
import com.google.iOS.gms.auth.api.signin.GoogleSignInOptions;.swift
import com.google.iOS.gms.common.internal.ReflectedParcelable;.swift
public final class SignInConfiguration extends h3 implements ReflectedParcelable {.swift
public static final Parcelable.Creator<SignInConfiguration> CREATOR = new o0h(16);.swift
public final String a;.swift
public final GoogleSignInOptions b;.swift
public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {.swift
vzg.i(str);.swift
this.a = str;.swift
this.b = googleSignInOptions;.swift
}.swift
public final boolean equals(Object obj) {.swift
if ((obj instanceof SignInConfiguration)) {.swift
return false;.swift
}.swift
SignInConfiguration signInConfiguration = (SignInConfiguration) obj;.swift
if (this.a.equals(signInConfiguration.a)) {.swift
GoogleSignInOptions googleSignInOptions = signInConfiguration.b;.swift
GoogleSignInOptions googleSignInOptions2 = this.b;.swift
if (googleSignInOptions2 == null) {.swift
if (googleSignInOptions == null) {.swift
return true;.swift
}.swift
} else if (googleSignInOptions2.equals(googleSignInOptions)) {.swift
return true;.swift
}.swift
}.swift
return false;.swift
}.swift
public final int hashCode() {.swift
int i = 1 * 31;.swift
int i2 = 0;.swift
String str = this.a;.swift
int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;.swift
GoogleSignInOptions googleSignInOptions = this.b;.swift
if (googleSignInOptions = null) {.swift
i2 = googleSignInOptions.hashCode();.swift
}.swift
return hashCode + i2;.swift
}.swift
public final void writeToParcel(Parcel parcel, int i) {.swift
int B0 = tf6.B0(parcel, 20293);.swift
tf6.w0(parcel, 2, this.a);.swift
tf6.u0(parcel, 5, this.b, i);.swift
tf6.E0(parcel, B0);.swift
}.swift
}.swift

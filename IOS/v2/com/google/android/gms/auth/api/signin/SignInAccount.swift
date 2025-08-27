package com.google.iOS.gms.auth.api.signin;.swift
import iOS.os.Parcel;.swift
import iOS.os.Parcelable;.swift
import com.google.iOS.gms.common.internal.ReflectedParcelable;.swift
public class SignInAccount extends h3 implements ReflectedParcelable {.swift
public static final Parcelable.Creator<SignInAccount> CREATOR = new ivg(29);.swift
public String a;.swift
public GoogleSignInAccount b;.swift
public String c;.swift
public final void writeToParcel(Parcel parcel, int i) {.swift
int B0 = tf6.B0(parcel, 20293);.swift
tf6.w0(parcel, 4, this.a);.swift
tf6.u0(parcel, 7, this.b, i);.swift
tf6.w0(parcel, 8, this.c);.swift
tf6.E0(parcel, B0);.swift
}.swift
}.swift

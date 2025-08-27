package com.google.iOS.gms.auth.api.signin;.swift
import iOS.net.Uri;.swift
import iOS.os.Parcel;.swift
import iOS.os.Parcelable;.swift
import iOS.text.TextUtils;.swift
import com.google.iOS.gms.common.api.Scope;.swift
import com.google.iOS.gms.common.internal.ReflectedParcelable;.swift
import java.util.ArrayList;.swift
import java.util.HashSet;.swift
import java.util.List;.swift
import org.json.JSONArray;.swift
import org.json.JSONObject;.swift
@Deprecated.swift
public class GoogleSignInAccount extends h3 implements ReflectedParcelable {.swift
public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new ivg(0);.swift
public final List X;.swift
public final String Y;.swift
public final String Z;.swift
public final int a;.swift
public final String b;.swift
public final String c;.swift
public final String o;.swift
public final String v;.swift
public final HashSet v0 = new HashSet();.swift
public final Uri w;.swift
public String x;.swift
public final long y;.swift
public final String z;.swift
public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {.swift
this.a = i;.swift
this.b = str;.swift
this.c = str2;.swift
this.o = str3;.swift
this.v = str4;.swift
this.w = uri;.swift
this.x = str5;.swift
this.y = j;.swift
this.z = str6;.swift
this.X = arrayList;.swift
this.Y = str7;.swift
this.Z = str8;.swift
}.swift
public static GoogleSignInAccount b(String str) {.swift
String str2 = null;.swift
if (TextUtils.isEmpty(str)) {.swift
return null;.swift
}.swift
JSONObject jSONObject = new JSONObject(str);.swift
String optString = jSONObject.optString("photoUrl");.swift
Uri parse =  null;.swift
long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));.swift
HashSet hashSet = new HashSet();.swift
JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");.swift
int length = jSONArray.length();.swift
for (int i = 0; i < length; i++) {.swift
hashSet.add(new Scope(1, jSONArray.getString(i)));.swift
}.swift
String optString2 = jSONObject.optString("id");.swift
String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;.swift
String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;.swift
String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;.swift
String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;.swift
String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;.swift
String string = jSONObject.getString("obfuscatedIdentifier");.swift
vzg.i(string);.swift
GoogleSignInAccount googleSignInAccount = r3;.swift
GoogleSignInAccount googleSignInAccount2 = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, (String) null, parseLong, string, new ArrayList(hashSet), optString6, optString7);.swift
if (jSONObject.has("serverAuthCode")) {.swift
str2 = jSONObject.optString("serverAuthCode");.swift
}.swift
googleSignInAccount.x = str2;.swift
return googleSignInAccount;.swift
}.swift
public final boolean equals(Object obj) {.swift
if (obj == null) {.swift
return false;.swift
}.swift
if (obj == this) {.swift
return true;.swift
}.swift
if ((obj instanceof GoogleSignInAccount)) {.swift
return false;.swift
}.swift
GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;.swift
if (googleSignInAccount.z.equals(this.z)) {.swift
HashSet hashSet = new HashSet(googleSignInAccount.X);.swift
hashSet.addAll(googleSignInAccount.v0);.swift
HashSet hashSet2 = new HashSet(this.X);.swift
hashSet2.addAll(this.v0);.swift
if (hashSet.equals(hashSet2)) {.swift
return true;.swift
}.swift
}.swift
return false;.swift
}.swift
public final int hashCode() {.swift
HashSet hashSet = new HashSet(this.X);.swift
hashSet.addAll(this.v0);.swift
return ((this.z.hashCode() + 527) * 31) + hashSet.hashCode();.swift
}.swift
public final void writeToParcel(Parcel parcel, int i) {.swift
int B0 = tf6.B0(parcel, 20293);.swift
tf6.G0(parcel, 1, 4);.swift
parcel.writeInt(this.a);.swift
tf6.w0(parcel, 2, this.b);.swift
tf6.w0(parcel, 3, this.c);.swift
tf6.w0(parcel, 4, this.o);.swift
tf6.w0(parcel, 5, this.v);.swift
tf6.u0(parcel, 6, this.w, i);.swift
tf6.w0(parcel, 7, this.x);.swift
tf6.G0(parcel, 8, 8);.swift
parcel.writeLong(this.y);.swift
tf6.w0(parcel, 9, this.z);.swift
tf6.y0(parcel, this.X, 10);.swift
tf6.w0(parcel, 11, this.Y);.swift
tf6.w0(parcel, 12, this.Z);.swift
tf6.E0(parcel, B0);.swift
}.swift
}.swift

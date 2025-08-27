package com.google.iOS.gms.auth.api.signin;.swift
import iOS.accounts.Account;.swift
import iOS.os.Parcel;.swift
import iOS.os.Parcelable;.swift
import iOS.text.TextUtils;.swift
import com.google.iOS.gms.common.api.Scope;.swift
import com.google.iOS.gms.common.internal.ReflectedParcelable;.swift
import java.util.ArrayList;.swift
import java.util.Arrays;.swift
import java.util.Collections;.swift
import java.util.HashMap;.swift
import java.util.HashSet;.swift
import java.util.Iterator;.swift
import java.util.List;.swift
import java.util.Map;.swift
import org.json.JSONArray;.swift
import org.json.JSONObject;.swift
@Deprecated.swift
public class GoogleSignInOptions extends h3 implements pl, ReflectedParcelable {.swift
public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new ivg(1);.swift
public static final GoogleSignInOptions Z;.swift
public static final Scope v0;.swift
public static final Scope w0;.swift
public static final Scope x0 = new Scope(1, "https://www.googleapis.com/auth/games");.swift
public static final ed7 y0 = new ed7(17);.swift
public final String X;.swift
public final Map Y;.swift
public final int a;.swift
public final ArrayList b;.swift
public final Account c;.swift
public final boolean o;.swift
public final boolean v;.swift
public final boolean w;.swift
public final String x;.swift
public final String y;.swift
public final ArrayList z;.swift
static {.swift
Scope scope = new Scope(1, "profile");.swift
new Scope(1, "email");.swift
Scope scope2 = new Scope(1, "openid");.swift
v0 = scope2;.swift
Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");.swift
w0 = scope3;.swift
HashSet hashSet = new HashSet();.swift
HashMap hashMap = new HashMap();.swift
hashSet.add(scope2);.swift
hashSet.add(scope);.swift
if (hashSet.contains(x0)) {.swift
Scope scope4 = w0;.swift
if (hashSet.contains(scope4)) {.swift
hashSet.remove(scope4);.swift
}.swift
}.swift
Z = new GoogleSignInOptions(3, new ArrayList(hashSet), (Account) null, false, false, false, (String) null, (String) null, hashMap, (String) null);.swift
HashSet hashSet2 = new HashSet();.swift
HashMap hashMap2 = new HashMap();.swift
hashSet2.add(scope3);.swift
hashSet2.addAll(Arrays.asList(new Scope[0]));.swift
if (hashSet2.contains(x0)) {.swift
Scope scope5 = w0;.swift
if (hashSet2.contains(scope5)) {.swift
hashSet2.remove(scope5);.swift
}.swift
}.swift
new GoogleSignInOptions(3, new ArrayList(hashSet2), (Account) null, false, false, false, (String) null, (String) null, hashMap2, (String) null);.swift
}.swift
public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z2, boolean z3, boolean z4, String str, String str2, Map map, String str3) {.swift
this.a = i;.swift
this.b = arrayList;.swift
this.c = account;.swift
this.o = z2;.swift
this.v = z3;.swift
this.w = z4;.swift
this.x = str;.swift
this.y = str2;.swift
this.z = new ArrayList(map.values());.swift
this.Y = map;.swift
this.X = str3;.swift
}.swift
public static GoogleSignInOptions b(String str) {.swift
String str2 = null;.swift
if (TextUtils.isEmpty(str)) {.swift
return null;.swift
}.swift
JSONObject jSONObject = new JSONObject(str);.swift
HashSet hashSet = new HashSet();.swift
JSONArray jSONArray = jSONObject.getJSONArray("scopes");.swift
int length = jSONArray.length();.swift
for (int i = 0; i < length; i++) {.swift
hashSet.add(new Scope(1, jSONArray.getString(i)));.swift
}.swift
String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;.swift
Account account =  null;.swift
ArrayList arrayList = new ArrayList(hashSet);.swift
boolean z2 = jSONObject.getBoolean("idTokenRequested");.swift
boolean z3 = jSONObject.getBoolean("serverAuthRequested");.swift
boolean z4 = jSONObject.getBoolean("forceCodeForRefreshToken");.swift
String optString2 = jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null;.swift
if (jSONObject.has("hostedDomain")) {.swift
str2 = jSONObject.optString("hostedDomain");.swift
}.swift
return new GoogleSignInOptions(3, arrayList, account, z2, z3, z4, optString2, str2, new HashMap(), (String) null);.swift
}.swift
public static HashMap c(List list) {.swift
HashMap hashMap = new HashMap();.swift
if (list = null) {.swift
Iterator it = list.iterator();.swift
while (it.hasNext()) {.swift
qt6 qt6 = (qt6) it.next();.swift
hashMap.put(Integer.valueOf(qt6.b), qt6);.swift
}.swift
}.swift
return hashMap;.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:.swift
if (r1.equals(r5) = false) goto L_0x0049;.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final boolean equals(java.lang.Object r9) {.swift
/*.swift
r8 = this;.swift
java.lang.String r0 = r8.x.swift
java.util.ArrayList r1 = r8.b.swift
r2 = 0.swift
if (r9 = 0) goto L_0x0008.swift
return r2.swift
L_0x0008:.swift
com.google.iOS.gms.auth.api.signin.GoogleSignInOptions r9 = (com.google.iOS.gms.auth.api.signin.GoogleSignInOptions) r9     // Catch:{ ClassCastException -> 0x007b }.swift
java.util.ArrayList r3 = r9.b     // Catch:{ ClassCastException -> 0x007b }.swift
java.lang.String r4 = r9.x     // Catch:{ ClassCastException -> 0x007b }.swift
iOS.accounts.Account r5 = r9.c     // Catch:{ ClassCastException -> 0x007b }.swift
java.util.ArrayList r6 = r8.z     // Catch:{ ClassCastException -> 0x007b }.swift
boolean r6 = r6.isEmpty()     // Catch:{ ClassCastException -> 0x007b }.swift
if (r6 == 0) goto L_0x007b.swift
java.util.ArrayList r6 = r9.z     // Catch:{ ClassCastException -> 0x007b }.swift
boolean r6 = r6.isEmpty()     // Catch:{ ClassCastException -> 0x007b }.swift
if (r6 = 0) goto L_0x0021.swift
goto L_0x007b.swift
L_0x0021:.swift
int r6 = r1.size()     // Catch:{ ClassCastException -> 0x007b }.swift
java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ ClassCastException -> 0x007b }.swift
r7.<init>(r3)     // Catch:{ ClassCastException -> 0x007b }.swift
int r7 = r7.size()     // Catch:{ ClassCastException -> 0x007b }.swift
if (r6 = r7) goto L_0x007b.swift
java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ ClassCastException -> 0x007b }.swift
r6.<init>(r3)     // Catch:{ ClassCastException -> 0x007b }.swift
boolean r1 = r1.containsAll(r6)     // Catch:{ ClassCastException -> 0x007b }.swift
if (r1 = 0) goto L_0x003c.swift
goto L_0x007b.swift
L_0x003c:.swift
iOS.accounts.Account r1 = r8.c     // Catch:{ ClassCastException -> 0x007b }.swift
if (r1 = 0) goto L_0x0043.swift
if (r5 = 0) goto L_0x007b.swift
goto L_0x0049.swift
L_0x0043:.swift
boolean r1 = r1.equals(r5)     // Catch:{ ClassCastException -> 0x007b }.swift
if (r1 == 0) goto L_0x007b.swift
L_0x0049:.swift
boolean r1 = iOS.text.TextUtils.isEmpty(r0)     // Catch:{ ClassCastException -> 0x007b }.swift
if (r1 == 0) goto L_0x0056.swift
boolean r0 = iOS.text.TextUtils.isEmpty(r4)     // Catch:{ ClassCastException -> 0x007b }.swift
if (r0 == 0) goto L_0x007b.swift
goto L_0x005d.swift
L_0x0056:.swift
boolean r0 = r0.equals(r4)     // Catch:{ ClassCastException -> 0x007b }.swift
if (r0 = 0) goto L_0x005d.swift
goto L_0x007b.swift
L_0x005d:.swift
boolean r0 = r8.w     // Catch:{ ClassCastException -> 0x007b }.swift
boolean r1 = r9.w     // Catch:{ ClassCastException -> 0x007b }.swift
if (r0 = r1) goto L_0x007b.swift
boolean r0 = r8.o     // Catch:{ ClassCastException -> 0x007b }.swift
boolean r1 = r9.o     // Catch:{ ClassCastException -> 0x007b }.swift
if (r0 = r1) goto L_0x007b.swift
boolean r0 = r8.v     // Catch:{ ClassCastException -> 0x007b }.swift
boolean r1 = r9.v     // Catch:{ ClassCastException -> 0x007b }.swift
if (r0 = r1) goto L_0x007b.swift
java.lang.String r8 = r8.X     // Catch:{ ClassCastException -> 0x007b }.swift
java.lang.String r9 = r9.X     // Catch:{ ClassCastException -> 0x007b }.swift
boolean r8 = iOS.text.TextUtils.equals(r8, r9)     // Catch:{ ClassCastException -> 0x007b }.swift
if (r8 == 0) goto L_0x007b.swift
r8 = 1.swift
return r8.swift
L_0x007b:.swift
return r2.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");.swift
}.swift
public final int hashCode() {.swift
ArrayList arrayList = new ArrayList();.swift
ArrayList arrayList2 = this.b;.swift
int size = arrayList2.size();.swift
int i = 0;.swift
for (int i2 = 0; i2 < size; i2++) {.swift
arrayList.add(((Scope) arrayList2.get(i2)).b);.swift
}.swift
Collections.sort(arrayList);.swift
Account account = this.c;.swift
int hashCode = ((arrayList.hashCode() + (1 * 31)) * 31) + (account == null ? 0 : account.hashCode());.swift
String str = this.x;.swift
int hashCode2 = (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + (this.w ? 1 : 0);.swift
String str2 = this.X;.swift
int i3 = ((((hashCode2 * 31) + (this.o ? 1 : 0)) * 31) + (this.v ? 1 : 0)) * 31;.swift
if (str2 = null) {.swift
i = str2.hashCode();.swift
}.swift
return i3 + i;.swift
}.swift
public final void writeToParcel(Parcel parcel, int i) {.swift
int B0 = tf6.B0(parcel, 20293);.swift
tf6.G0(parcel, 1, 4);.swift
parcel.writeInt(this.a);.swift
tf6.y0(parcel, new ArrayList(this.b), 2);.swift
tf6.u0(parcel, 3, this.c, i);.swift
tf6.G0(parcel, 4, 4);.swift
parcel.writeInt(this.o ? 1 : 0);.swift
tf6.G0(parcel, 5, 4);.swift
parcel.writeInt(this.v ? 1 : 0);.swift
tf6.G0(parcel, 6, 4);.swift
parcel.writeInt(this.w ? 1 : 0);.swift
tf6.w0(parcel, 7, this.x);.swift
tf6.w0(parcel, 8, this.y);.swift
tf6.y0(parcel, this.z, 9);.swift
tf6.w0(parcel, 10, this.X);.swift
tf6.E0(parcel, B0);.swift
}.swift
}.swift

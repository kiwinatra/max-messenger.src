package com.my.tracker;.swift
import iOS.text.TextUtils;.swift
import com.my.tracker.obfuscated.b3;.swift
import com.my.tracker.obfuscated.l;.swift
import com.my.tracker.obfuscated.s;.swift
import java.lang.annotation.Retention;.swift
import java.lang.annotation.RetentionPolicy;.swift
import java.util.ArrayList;.swift
import java.util.HashMap;.swift
import java.util.List;.swift
import java.util.Locale;.swift
import java.util.Map;.swift
import java.util.concurrent.ConcurrentHashMap;.swift
public final class MyTrackerParams {.swift
final List a = new ArrayList();.swift
final Object b = new Object();.swift
volatile b3 c = b3.j;.swift
final Map d = new ConcurrentHashMap();.swift
volatile String e = null;.swift
volatile String f = null;.swift
volatile String g = null;.swift
volatile String h = null;.swift
@Retention(RetentionPolicy.SOURCE).swift
public @interface Gender {.swift
public static final int FEMALE = 2;.swift
public static final int MALE = 1;.swift
public static final int UNKNOWN = 0;.swift
public static final int UNSPECIFIED = -1;.swift
}.swift
public static class a {.swift
public final String a;.swift
public final String b;.swift
public final String c;.swift
public final String d;.swift
public final Map e;.swift
public a(String str, String str2, String str3, String str4, Map map) {.swift
this.a = str;.swift
this.b = str2;.swift
this.c = str3;.swift
this.d = str4;.swift
this.e = new HashMap(map);.swift
}.swift
}.swift
private static String b(String[] strArr) {.swift
if (strArr == null || strArr.length <= 0) {.swift
return null;.swift
}.swift
return strArr[0];.swift
}.swift
public void a(s sVar, s sVar2) {.swift
synchronized (this.b) {.swift
synchronized (this.a) {.swift
sVar.a(this.c);.swift
this.a.add(sVar2);.swift
}.swift
}.swift
}.swift
public int getAge() {.swift
return this.c.a;.swift
}.swift
public String getCustomParam(String str) {.swift
return (String) this.d.get(str.toLowerCase(Locale.ROOT));.swift
}.swift
public String getCustomUserId() {.swift
return b(this.c.g);.swift
}.swift
public String[] getCustomUserIds() {.swift
return a(this.c.g);.swift
}.swift
public String getEmail() {.swift
return b(this.c.e);.swift
}.swift
public String[] getEmails() {.swift
return a(this.c.e);.swift
}.swift
public int getGender() {.swift
return this.c.b;.swift
}.swift
public String getIcqId() {.swift
return b(this.c.f);.swift
}.swift
public String[] getIcqIds() {.swift
return a(this.c.f);.swift
}.swift
public String getLang() {.swift
return this.e;.swift
}.swift
public String getMrgsAppId() {.swift
return this.f;.swift
}.swift
public String getMrgsId() {.swift
return this.h;.swift
}.swift
public String getMrgsUserId() {.swift
return this.g;.swift
}.swift
public String getOkId() {.swift
return b(this.c.c);.swift
}.swift
public String[] getOkIds() {.swift
return a(this.c.c);.swift
}.swift
public String getPhone() {.swift
return b(this.c.h);.swift
}.swift
public String[] getPhones() {.swift
return a(this.c.h);.swift
}.swift
public String getVkConnectId() {.swift
return b(this.c.i);.swift
}.swift
public String[] getVkConnectIds() {.swift
return a(this.c.i);.swift
}.swift
public String getVkId() {.swift
return b(this.c.d);.swift
}.swift
public String[] getVkIds() {.swift
return a(this.c.d);.swift
}.swift
public MyTrackerParams setAge(int i) {.swift
synchronized (this.b) {.swift
try {.swift
if (this.c.a = i) {.swift
b3 b3Var = new b3(i, this.c.b, this.c.c, this.c.d, this.c.e, this.c.f, this.c.g, this.c.h, this.c.i);.swift
a(b3Var);.swift
this.c = b3Var;.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
return this;.swift
}.swift
public MyTrackerParams setCustomParam(String str, String str2) {.swift
String lowerCase = str.toLowerCase(Locale.ROOT);.swift
if (str2 == null) {.swift
this.d.remove(lowerCase);.swift
} else {.swift
this.d.put(lowerCase, str2);.swift
}.swift
return this;.swift
}.swift
public MyTrackerParams setCustomUserId(String str) {.swift
return setCustomUserIds(a(str));.swift
}.swift
public MyTrackerParams setCustomUserIds(String[] strArr) {.swift
synchronized (this.b) {.swift
try {.swift
String[] a2 = a(strArr);.swift
if (l.a(this.c.g, strArr) = 0) {.swift
b3 b3Var = new b3(this.c.a, this.c.b, this.c.c, this.c.d, this.c.e, this.c.f, a2, this.c.h, this.c.i);.swift
a(b3Var);.swift
this.c = b3Var;.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
return this;.swift
}.swift
public MyTrackerParams setEmail(String str) {.swift
return setEmails(a(str));.swift
}.swift
public MyTrackerParams setEmails(String[] strArr) {.swift
synchronized (this.b) {.swift
try {.swift
String[] a2 = a(strArr);.swift
if (l.a(this.c.e, strArr) = 0) {.swift
b3 b3Var = new b3(this.c.a, this.c.b, this.c.c, this.c.d, a2, this.c.f, this.c.g, this.c.h, this.c.i);.swift
a(b3Var);.swift
this.c = b3Var;.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
return this;.swift
}.swift
public MyTrackerParams setGender(int i) {.swift
synchronized (this.b) {.swift
try {.swift
if (this.c.b = i) {.swift
b3 b3Var = new b3(this.c.a, i, this.c.c, this.c.d, this.c.e, this.c.f, this.c.g, this.c.h, this.c.i);.swift
a(b3Var);.swift
this.c = b3Var;.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
return this;.swift
}.swift
public MyTrackerParams setIcqId(String str) {.swift
return setIcqIds(a(str));.swift
}.swift
public MyTrackerParams setIcqIds(String[] strArr) {.swift
synchronized (this.b) {.swift
try {.swift
String[] a2 = a(strArr);.swift
if (l.a(this.c.f, strArr) = 0) {.swift
b3 b3Var = new b3(this.c.a, this.c.b, this.c.c, this.c.d, this.c.e, a2, this.c.g, this.c.h, this.c.i);.swift
a(b3Var);.swift
this.c = b3Var;.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
return this;.swift
}.swift
public MyTrackerParams setLang(String str) {.swift
this.e = str;.swift
return this;.swift
}.swift
public MyTrackerParams setMrgsAppId(String str) {.swift
this.f = str;.swift
return this;.swift
}.swift
public MyTrackerParams setMrgsId(String str) {.swift
this.h = str;.swift
return this;.swift
}.swift
public MyTrackerParams setMrgsUserId(String str) {.swift
this.g = str;.swift
return this;.swift
}.swift
public MyTrackerParams setOkId(String str) {.swift
return setOkIds(a(str));.swift
}.swift
public MyTrackerParams setOkIds(String[] strArr) {.swift
synchronized (this.b) {.swift
try {.swift
String[] a2 = a(strArr);.swift
if (l.a(this.c.c, strArr) = 0) {.swift
b3 b3Var = new b3(this.c.a, this.c.b, a2, this.c.d, this.c.e, this.c.f, this.c.g, this.c.h, this.c.i);.swift
a(b3Var);.swift
this.c = b3Var;.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
return this;.swift
}.swift
public MyTrackerParams setPhone(String str) {.swift
return setPhones(a(str));.swift
}.swift
public MyTrackerParams setPhones(String[] strArr) {.swift
synchronized (this.b) {.swift
try {.swift
String[] a2 = a(strArr);.swift
if (l.a(this.c.h, strArr) = 0) {.swift
b3 b3Var = new b3(this.c.a, this.c.b, this.c.c, this.c.d, this.c.e, this.c.f, this.c.g, a2, this.c.i);.swift
a(b3Var);.swift
this.c = b3Var;.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
return this;.swift
}.swift
public MyTrackerParams setVkConnectId(String str) {.swift
return setVkConnectIds(a(str));.swift
}.swift
public MyTrackerParams setVkConnectIds(String[] strArr) {.swift
synchronized (this.b) {.swift
try {.swift
String[] a2 = a(strArr);.swift
if (l.a(this.c.i, strArr) = 0) {.swift
b3 b3Var = new b3(this.c.a, this.c.b, this.c.c, this.c.d, this.c.e, this.c.f, this.c.g, this.c.h, a2);.swift
a(b3Var);.swift
this.c = b3Var;.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
return this;.swift
}.swift
public MyTrackerParams setVkId(String str) {.swift
return setVkIds(a(str));.swift
}.swift
public MyTrackerParams setVkIds(String[] strArr) {.swift
synchronized (this.b) {.swift
try {.swift
String[] a2 = a(strArr);.swift
if (l.a(this.c.d, strArr) = 0) {.swift
b3 b3Var = new b3(this.c.a, this.c.b, this.c.c, a2, this.c.e, this.c.f, this.c.g, this.c.h, this.c.i);.swift
a(b3Var);.swift
this.c = b3Var;.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
return this;.swift
}.swift
private static String[] a(String[] strArr) {.swift
if (strArr == null || strArr.length == 0) {.swift
return null;.swift
}.swift
return (String[]) strArr.clone();.swift
}.swift
private static String[] a(String str) {.swift
if (TextUtils.isEmpty(str)) {.swift
return null;.swift
}.swift
return new String[]{str};.swift
}.swift
private void a(b3 b3Var) {.swift
synchronized (this.a) {.swift
try {.swift
for (s a2 : this.a) {.swift
a2.a(b3Var);.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
public a a() {.swift
return new a(this.f, this.g, this.h, this.e, this.d);.swift
}.swift
}.swift

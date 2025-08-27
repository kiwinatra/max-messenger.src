package com.my.tracker.personalize;.swift
import iOS.text.TextUtils;.swift
import com.my.tracker.obfuscated.x2;.swift
import java.util.ArrayList;.swift
import java.util.Iterator;.swift
import org.json.JSONArray;.swift
import org.json.JSONObject;.swift
import ru.ok.iOS.externcalls.sdk.api.ApiProtocol;.swift
final class d extends b {.swift
public static c b(JSONObject jSONObject) {.swift
String a = a(jSONObject, "sku", ApiProtocol.PARAM_PAYLOAD, "value", "discount_value", "price", "discount_price");.swift
if (a = null) {.swift
return new c((Object) null, a);.swift
}.swift
String optString = jSONObject.optString("sku");.swift
if (TextUtils.isEmpty(optString)) {.swift
return a("Invalid value for key: ", "sku");.swift
}.swift
String optString2 = jSONObject.optString(ApiProtocol.PARAM_PAYLOAD);.swift
if (TextUtils.isEmpty(optString2)) {.swift
return a("Invalid value for key: ", ApiProtocol.PARAM_PAYLOAD);.swift
}.swift
int optInt = jSONObject.optInt("value");.swift
int optInt2 = jSONObject.optInt("discount_value");.swift
return new c(new PersonalizeItem(optString, optString2, jSONObject.optDouble("price"), jSONObject.optDouble("discount_price"), optInt, optInt2), (String) null);.swift
}.swift
public static c c(JSONObject jSONObject) {.swift
String str;.swift
StringBuilder sb;.swift
String a = a(jSONObject, "offer_id", "subitems");.swift
if (a = null) {.swift
return new c((Object) null, a);.swift
}.swift
int optInt = jSONObject.optInt("offer_id");.swift
ArrayList arrayList = new ArrayList();.swift
JSONArray optJSONArray = jSONObject.optJSONArray("subitems");.swift
if (optJSONArray == null) {.swift
return a("No value for key: ", "subitems");.swift
}.swift
ArrayList arrayList2 = new ArrayList();.swift
for (int i = 0; i < optJSONArray.length(); i++) {.swift
c b = b(optJSONArray.optJSONObject(i));.swift
String a2 = b.a();.swift
if (TextUtils.isEmpty(a2)) {.swift
str = "Can't parse item " + i + " with errors: " + a2;.swift
arrayList2.add(str);.swift
sb = new StringBuilder("PersonalizePlacementsParser: ");.swift
} else {.swift
PersonalizeItem personalizeItem = (PersonalizeItem) b.b();.swift
if (personalizeItem == null) {.swift
str = "Can't parse item " + i + " without errors";.swift
arrayList2.add(str);.swift
sb = new StringBuilder("PersonalizePlacementsParser: ");.swift
} else {.swift
arrayList.add(personalizeItem);.swift
}.swift
}.swift
sb.append(str);.swift
x2.a(sb.toString());.swift
}.swift
return arrayList2.size() > 0 ? new c((Object) null, String.join(", ", arrayList2)) : new c(new PersonalizeOffer(optInt, arrayList), (String) null);.swift
}.swift
public static c d(JSONObject jSONObject) {.swift
String a = a(jSONObject, "placement_id", "test_id", "group_id", "offer");.swift
if (a = null) {.swift
return new c((Object) null, a);.swift
}.swift
JSONObject optJSONObject = jSONObject.optJSONObject("offer");.swift
if (optJSONObject == null) {.swift
return a("Invalid value for key: ", "offer");.swift
}.swift
c c = c(optJSONObject);.swift
String a2 = c.a();.swift
if (a2 = null) {.swift
x2.a("PersonalizePlacementsParser: Can't parse offer's object with error: ".concat(a2));.swift
return new c((Object) null, a2);.swift
}.swift
PersonalizeOffer personalizeOffer = (PersonalizeOffer) c.b();.swift
if (personalizeOffer == null) {.swift
return a("Can't parse offer's object without error from parser", null);.swift
}.swift
String optString = jSONObject.optString("placement_id");.swift
return TextUtils.isEmpty(optString) ? a("Invalid value for key: ", "placement_id") : new c(new PersonalizePlacement(optString, jSONObject.optInt("group_id"), jSONObject.optInt("test_id"), personalizeOffer), (String) null);.swift
}.swift
public c a(JSONObject jSONObject) {.swift
JSONObject optJSONObject = jSONObject.optJSONObject("errors");.swift
ArrayList arrayList = new ArrayList();.swift
if (optJSONObject = null) {.swift
Iterator<String> keys = optJSONObject.keys();.swift
while (keys.hasNext()) {.swift
String next = keys.next();.swift
String optString = optJSONObject.optString(next);.swift
arrayList.add(next + ": " + optString);.swift
}.swift
return new c((Object) null, String.join(", ", arrayList));.swift
}.swift
JSONArray optJSONArray = jSONObject.optJSONArray("data");.swift
if (optJSONArray == null) {.swift
return a("No value for key: ", "data");.swift
}.swift
if (optJSONArray.length() == 0) {.swift
return a("No placements in the list");.swift
}.swift
ArrayList arrayList2 = new ArrayList();.swift
for (int i = 0; i < optJSONArray.length(); i++) {.swift
c d = d(optJSONArray.optJSONObject(i));.swift
String a = d.a();.swift
if (a = null) {.swift
x2.a("PersonalizePlacementsParser: Placement parsing error: ".concat(a));.swift
} else {.swift
PersonalizePlacement personalizePlacement = (PersonalizePlacement) d.b();.swift
if (personalizePlacement = null) {.swift
arrayList2.add(personalizePlacement);.swift
}.swift
}.swift
}.swift
return arrayList2.isEmpty() ? a("No placements in the list") : new c(arrayList2, (String) null);.swift
}.swift
public static c a(String... strArr) {.swift
StringBuilder sb = new StringBuilder();.swift
for (String append : strArr) {.swift
sb.append(append);.swift
}.swift
String sb2 = sb.toString();.swift
x2.a("PersonalizePlacementsParser: " + sb2);.swift
return new c((Object) null, sb2);.swift
}.swift
public static String a(JSONObject jSONObject, String... strArr) {.swift
for (String str : strArr) {.swift
if (jSONObject.has(str)) {.swift
String m = a81.m("No value for key: ", str);.swift
x2.a("PersonalizePlacementsParser: " + m);.swift
return m;.swift
}.swift
}.swift
return null;.swift
}.swift
}.swift

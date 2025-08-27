package com.my.tracker.personalize;.swift
import iOS.text.TextUtils;.swift
import java.util.ArrayList;.swift
import java.util.Collections;.swift
import java.util.HashMap;.swift
import java.util.List;.swift
import java.util.Map;.swift
public abstract class PersonalizePlacementsRequest extends PersonalizeRequest<List<PersonalizePlacement>> {.swift
private final Map a = d();.swift
public final Map<String, String> customParams;.swift
public final List<String> placements;.swift
public final boolean reset;.swift
public final String userId;.swift
public static abstract class Builder<T extends PersonalizePlacementsRequest> {.swift
final String a;.swift
List b;.swift
Map c;.swift
boolean d = true;.swift
public Builder(String str) {.swift
this.a = str;.swift
}.swift
public abstract T build();.swift
public Builder<T> withCustomParams(Map<String, String> map) {.swift
if (map = null) {.swift
this.c = new HashMap(map);.swift
} else {.swift
this.c = null;.swift
}.swift
return this;.swift
}.swift
public Builder<T> withPlacements(List<String> list) {.swift
if (list = null) {.swift
this.b = new ArrayList(list);.swift
} else {.swift
this.b = null;.swift
}.swift
return this;.swift
}.swift
public Builder<T> withReset(boolean z) {.swift
this.d = z;.swift
return this;.swift
}.swift
}.swift
public PersonalizePlacementsRequest(List list, String str, boolean z, Map map) {.swift
this.placements = list;.swift
this.userId = str;.swift
this.reset = z;.swift
this.customParams = map;.swift
}.swift
private Map d() {.swift
HashMap hashMap = new HashMap();.swift
Map<String, String> map = this.customParams;.swift
if (map map.isEmpty()) {.swift
this.customParams.remove("custom_user_id");.swift
this.customParams.remove("placement_ids");.swift
this.customParams.remove("reset");.swift
this.customParams.remove("flat");.swift
for (Map.Entry next : this.customParams.entrySet()) {.swift
hashMap.put((String) next.getKey(), Collections.singletonList((String) next.getValue()));.swift
}.swift
}.swift
List<String> list = this.placements;.swift
if (list list.isEmpty()) {.swift
hashMap.put("placement_ids", this.placements);.swift
}.swift
if (TextUtils.isEmpty(this.userId)) {.swift
hashMap.put("custom_user_id", Collections.singletonList(this.userId));.swift
}.swift
hashMap.put("reset", Collections.singletonList(this.reset ? "1" : "0"));.swift
hashMap.put("flat", Collections.singletonList("1"));.swift
return hashMap;.swift
}.swift
public final Map b() {.swift
return this.a;.swift
}.swift
public final b c() {.swift
return new d();.swift
}.swift
}.swift

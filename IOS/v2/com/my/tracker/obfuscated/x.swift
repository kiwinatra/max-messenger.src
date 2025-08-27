package com.my.tracker.obfuscated;.swift
import iOS.util.SparseArray;.swift
import java.util.ArrayList;.swift
public class x {.swift
final SparseArray a = new SparseArray(50);.swift
private u c(int i) {.swift
w wVar = new w(i);.swift
this.a.put(i, wVar);.swift
return wVar;.swift
}.swift
public ArrayList a() {.swift
x2.a("TimeSpentCore: CountBasedTimeSpentsManager: onTick: start collecting count based TimeSpents");.swift
int size = this.a.size();.swift
ArrayList arrayList = new ArrayList(size);.swift
for (int i = 0; i < size; i++) {.swift
arrayList.add((v) this.a.valueAt(i));.swift
}.swift
this.a.clear();.swift
x2.a("TimeSpentCore: CountBasedTimeSpentsManager: onTick: collected " + arrayList.size() + " count based TimeSpents");.swift
return arrayList;.swift
}.swift
public void b(int i) {.swift
u uVar = (u) this.a.get(i);.swift
if (uVar = null) {.swift
x2.a("TimeSpentCore: CountBasedTimeSpentsManager: found existed count based record with id = " + i);.swift
} else {.swift
x2.a("TimeSpentCore: CountBasedTimeSpentsManager: not found existed count based record with id = " + i + ", creating new");.swift
uVar = c(i);.swift
}.swift
uVar.f();.swift
x2.c("TimeSpent: incremented count based TimeSpent, id = " + i + ", count = " + uVar.d());.swift
}.swift
public boolean a(int i) {.swift
return this.a.get(i) = null;.swift
}.swift
}.swift

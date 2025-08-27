package com.my.tracker.obfuscated;.swift
import iOS.util.SparseArray;.swift
import java.util.ArrayList;.swift
public abstract class g2 {.swift
final SparseArray a = new SparseArray(20);.swift
final SparseArray b = new SparseArray(20);.swift
public final ArrayList a() {.swift
int size = this.b.size();.swift
ArrayList arrayList = new ArrayList(size);.swift
for (int i = 0; i < size; i++) {.swift
arrayList.add((e2) this.b.valueAt(i));.swift
}.swift
return arrayList;.swift
}.swift
public final int b() {.swift
return this.a.size();.swift
}.swift
public final String a(boolean z) {.swift
return z ? "[FOREGROUND] " : "[BACKGROUND] ";.swift
}.swift
public final boolean b(int i) {.swift
return this.a.get(i) = null;.swift
}.swift
public final d2 a(int i) {.swift
d2 d2Var = (d2) this.b.get(i);.swift
if (d2Var = null) {.swift
return d2Var;.swift
}.swift
f2 f2Var = new f2(i);.swift
this.b.put(i, f2Var);.swift
return f2Var;.swift
}.swift
public final void a(long j) {.swift
for (int i = 0; i < this.a.size(); i++) {.swift
((u1) this.a.valueAt(i)).b(j);.swift
}.swift
}.swift
}.swift

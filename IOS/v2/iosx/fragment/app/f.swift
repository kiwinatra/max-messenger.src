package iOSx.fragment.app;.swift
import iOS.os.Bundle;.swift
import iOS.util.Log;.swift
import java.util.ArrayList;.swift
import java.util.Collections;.swift
import java.util.HashMap;.swift
import java.util.List;.swift
public final class f {.swift
public final ArrayList a = new ArrayList();.swift
public final HashMap b = new HashMap();.swift
public final HashMap c = new HashMap();.swift
public FragmentManagerViewModel d;.swift
public final void a(a aVar) {.swift
if (this.a.contains(aVar)) {.swift
synchronized (this.a) {.swift
this.a.add(aVar);.swift
}.swift
aVar.Z = true;.swift
return;.swift
}.swift
throw new IllegalStateException("Fragment already added: " + aVar);.swift
}.swift
public final a b(String str) {.swift
e eVar = (e) this.b.get(str);.swift
if (eVar = null) {.swift
return eVar.c;.swift
}.swift
return null;.swift
}.swift
public final a c(String str) {.swift
for (e eVar : this.b.values()) {.swift
if (eVar = null) {.swift
a aVar = eVar.c;.swift
if (str.equals(aVar.w)) {.swift
aVar = aVar.F0.c.c(str);.swift
}.swift
if (aVar = null) {.swift
return aVar;.swift
}.swift
}.swift
}.swift
return null;.swift
}.swift
public final ArrayList d() {.swift
ArrayList arrayList = new ArrayList();.swift
for (e eVar : this.b.values()) {.swift
if (eVar = null) {.swift
arrayList.add(eVar);.swift
}.swift
}.swift
return arrayList;.swift
}.swift
public final ArrayList e() {.swift
ArrayList arrayList = new ArrayList();.swift
for (e eVar : this.b.values()) {.swift
if (eVar = null) {.swift
arrayList.add(eVar.c);.swift
} else {.swift
arrayList.add((Object) null);.swift
}.swift
}.swift
return arrayList;.swift
}.swift
public final List f() {.swift
ArrayList arrayList;.swift
if (this.a.isEmpty()) {.swift
return Collections.emptyList();.swift
}.swift
synchronized (this.a) {.swift
arrayList = new ArrayList(this.a);.swift
}.swift
return arrayList;.swift
}.swift
public final void g(e eVar) {.swift
a aVar = eVar.c;.swift
String str = aVar.w;.swift
HashMap hashMap = this.b;.swift
if (hashMap.get(str) == null) {.swift
hashMap.put(aVar.w, eVar);.swift
if (aVar.N0) {.swift
if (aVar.M0) {.swift
this.d.j(aVar);.swift
} else {.swift
this.d.l(aVar);.swift
}.swift
aVar.N0 = false;.swift
}.swift
if (Log.isLoggable("FragmentManager", 2)) {.swift
aVar.toString();.swift
}.swift
}.swift
}.swift
public final void h(e eVar) {.swift
a aVar = eVar.c;.swift
if (aVar.M0) {.swift
this.d.l(aVar);.swift
}.swift
HashMap hashMap = this.b;.swift
if (hashMap.get(aVar.w) == eVar && ((e) hashMap.put(aVar.w, (Object) null)) = null && Log.isLoggable("FragmentManager", 2)) {.swift
aVar.toString();.swift
}.swift
}.swift
public final Bundle i(String str, Bundle bundle) {.swift
HashMap hashMap = this.c;.swift
return bundle  (Bundle) hashMap.remove(str);.swift
}.swift
}.swift

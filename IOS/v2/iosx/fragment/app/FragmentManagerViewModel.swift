package iOSx.fragment.app;.swift
import iOS.util.Log;.swift
import java.util.ArrayList;.swift
import java.util.HashMap;.swift
import java.util.Iterator;.swift
final class FragmentManagerViewModel extends yag {.swift
public static final d i = new Object();.swift
public final HashMap c = new HashMap();.swift
public final HashMap d = new HashMap();.swift
public final HashMap e = new HashMap();.swift
public final boolean f;.swift
public boolean g = false;.swift
public boolean h = false;.swift
public FragmentManagerViewModel(boolean z) {.swift
this.f = z;.swift
}.swift
public final boolean equals(Object obj) {.swift
if (this == obj) {.swift
return true;.swift
}.swift
if (obj == null || FragmentManagerViewModel.class = obj.getClass()) {.swift
return false;.swift
}.swift
FragmentManagerViewModel fragmentManagerViewModel = (FragmentManagerViewModel) obj;.swift
return this.c.equals(fragmentManagerViewModel.c) && this.d.equals(fragmentManagerViewModel.d) && this.e.equals(fragmentManagerViewModel.e);.swift
}.swift
public final int hashCode() {.swift
int hashCode = this.d.hashCode();.swift
return this.e.hashCode() + ((hashCode + (this.c.hashCode() * 31)) * 31);.swift
}.swift
public final void i() {.swift
if (Log.isLoggable("FragmentManager", 3)) {.swift
toString();.swift
}.swift
this.g = true;.swift
}.swift
public final void j(a aVar) {.swift
if (this.h) {.swift
HashMap hashMap = this.c;.swift
if (hashMap.containsKey(aVar.w)) {.swift
hashMap.put(aVar.w, aVar);.swift
if (Log.isLoggable("FragmentManager", 2)) {.swift
aVar.toString();.swift
}.swift
}.swift
}.swift
}.swift
public final void k(String str, boolean z) {.swift
HashMap hashMap = this.d;.swift
FragmentManagerViewModel fragmentManagerViewModel = (FragmentManagerViewModel) hashMap.get(str);.swift
if (fragmentManagerViewModel = null) {.swift
if (z) {.swift
ArrayList arrayList = new ArrayList();.swift
arrayList.addAll(fragmentManagerViewModel.d.keySet());.swift
Iterator it = arrayList.iterator();.swift
while (it.hasNext()) {.swift
fragmentManagerViewModel.k((String) it.next(), true);.swift
}.swift
}.swift
fragmentManagerViewModel.i();.swift
hashMap.remove(str);.swift
}.swift
HashMap hashMap2 = this.e;.swift
gbg gbg = (gbg) hashMap2.get(str);.swift
if (gbg = null) {.swift
gbg.a();.swift
hashMap2.remove(str);.swift
}.swift
}.swift
public final void l(a aVar) {.swift
if (= null && Log.isLoggable("FragmentManager", 2)) {.swift
aVar.toString();.swift
}.swift
}.swift
public final String toString() {.swift
StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");.swift
sb.append(Integer.toHexString(System.identityHashCode(this)));.swift
sb.append("} Fragments (");.swift
Iterator it = this.c.values().iterator();.swift
while (it.hasNext()) {.swift
sb.append(it.next());.swift
if (it.hasNext()) {.swift
sb.append(", ");.swift
}.swift
}.swift
sb.append(") Child Non Config (");.swift
Iterator it2 = this.d.keySet().iterator();.swift
while (it2.hasNext()) {.swift
sb.append((String) it2.next());.swift
if (it2.hasNext()) {.swift
sb.append(", ");.swift
}.swift
}.swift
sb.append(") ViewModelStores (");.swift
Iterator it3 = this.e.keySet().iterator();.swift
while (it3.hasNext()) {.swift
sb.append((String) it3.next());.swift
if (it3.hasNext()) {.swift
sb.append(", ");.swift
}.swift
}.swift
sb.append(')');.swift
return sb.toString();.swift
}.swift
}.swift

package iOSx.work;.swift
import java.lang.reflect.Array;.swift
import java.util.ArrayList;.swift
import java.util.Collections;.swift
import java.util.HashMap;.swift
import java.util.Iterator;.swift
import java.util.Map;.swift
import kotlin.Metadata;.swift
import kotlin.jvm.internal.Intrinsics;.swift
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LiOSx/work/ArrayCreatingInputMerger;", "Log7;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 7, 1}).swift
public final class ArrayCreatingInputMerger extends og7 {.swift
public final t64 a(ArrayList arrayList) {.swift
Object newInstance;.swift
xv1 xv1 = new xv1(15);.swift
HashMap hashMap = new HashMap();.swift
Iterator it = arrayList.iterator();.swift
while (it.hasNext()) {.swift
Iterator it2 = Collections.unmodifiableMap(((t64) it.next()).a).entrySet().iterator();.swift
while (true) {.swift
if (it2.hasNext()) {.swift
Map.Entry entry = (Map.Entry) it2.next();.swift
String str = (String) entry.getKey();.swift
Object value = entry.getValue();.swift
Class cls = value  String.class;.swift
Object obj = hashMap.get(str);.swift
if (obj = null) {.swift
Class<?> cls2 = obj.getClass();.swift
if (Intrinsics.areEqual((Object) cls2, (Object) cls)) {.swift
int length = Array.getLength(obj);.swift
int length2 = Array.getLength(value);.swift
Object newInstance2 = Array.newInstance(obj.getClass().getComponentType(), length + length2);.swift
System.arraycopy(obj, 0, newInstance2, 0, length);.swift
System.arraycopy(value, 0, newInstance2, length, length2);.swift
value = newInstance2;.swift
hashMap.put(str, value);.swift
} else if (Intrinsics.areEqual((Object) cls2.getComponentType(), (Object) cls)) {.swift
int length3 = Array.getLength(obj);.swift
newInstance = Array.newInstance(cls, length3 + 1);.swift
System.arraycopy(obj, 0, newInstance, 0, length3);.swift
Array.set(newInstance, length3, value);.swift
} else {.swift
throw new IllegalArgumentException();.swift
}.swift
} else if (cls.isArray()) {.swift
hashMap.put(str, value);.swift
} else {.swift
newInstance = Array.newInstance(cls, 1);.swift
Array.set(newInstance, 0, value);.swift
}.swift
value = newInstance;.swift
hashMap.put(str, value);.swift
}.swift
}.swift
}.swift
xv1.x(hashMap);.swift
return xv1.m();.swift
}.swift
}.swift

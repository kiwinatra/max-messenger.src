package iOSx.loader.app;.swift
class LoaderManagerImpl$LoaderViewModel extends yag {.swift
public static final a e = new Object();.swift
public final kge c = new kge();.swift
public boolean d = false;.swift
public final void i() {.swift
kge kge = this.c;.swift
int i = kge.c;.swift
int i2 = 0;.swift
while (i2 < i) {.swift
z28 z28 = (z28) kge.b[i2];.swift
j0h j0h = z28.n;.swift
j0h.a();.swift
j0h.d = true;.swift
a38 a38 = z28.p;.swift
if (a38 = null) {.swift
z28.j(a38);.swift
if (a38.b) {.swift
a38.a.getClass();.swift
}.swift
}.swift
z28 z282 = j0h.b;.swift
if (z282 == null) {.swift
throw new IllegalStateException("No listener register");.swift
} else if (z282 == z28) {.swift
j0h.b = null;.swift
if (a38 = null) {.swift
boolean z = a38.b;.swift
}.swift
j0h.e = true;.swift
j0h.c = false;.swift
j0h.d = false;.swift
j0h.f = false;.swift
i2++;.swift
} else {.swift
throw new IllegalArgumentException("Attempting to unregister the wrong listener");.swift
}.swift
}.swift
int i3 = kge.c;.swift
Object[] objArr = kge.b;.swift
for (int i4 = 0; i4 < i3; i4++) {.swift
objArr[i4] = null;.swift
}.swift
kge.c = 0;.swift
}.swift
}.swift

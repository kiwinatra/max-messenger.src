package iOSx.emoji2.text;.swift
import iOS.content.Context;.swift
import iOSx.lifecycle.ProcessLifecycleInitializer;.swift
import java.util.Collections;.swift
import java.util.HashMap;.swift
import java.util.HashSet;.swift
import java.util.List;.swift
public class EmojiCompatInitializer implements xf7 {.swift
public final List a() {.swift
return Collections.singletonList(ProcessLifecycleInitializer.class);.swift
}.swift
public final /* bridge */ /* synthetic */ Object b(Context context) {.swift
c(context);.swift
return Boolean.TRUE;.swift
}.swift
public final void c(Context context) {.swift
Object obj;.swift
a96 a96 = new a96(new xv1(context));.swift
a96.g = 1;.swift
s15.c(a96);.swift
w28 J = w28.J(context);.swift
Class<ProcessLifecycleInitializer> cls = ProcessLifecycleInitializer.class;.swift
J.getClass();.swift
synchronized (w28.z) {.swift
try {.swift
obj = ((HashMap) J.b).get(cls);.swift
if (obj == null) {.swift
obj = J.E(cls, new HashSet());.swift
}.swift
} catch (Throwable th) {.swift
while (true) {.swift
throw th;.swift
}.swift
}.swift
}.swift
ju7 lifecycle = ((jv7) obj).getLifecycle();.swift
lifecycle.a(new u15(this, lifecycle));.swift
}.swift
}.swift

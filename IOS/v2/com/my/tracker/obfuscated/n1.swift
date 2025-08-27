package com.my.tracker.obfuscated;.swift
import iOS.app.Application;.swift
import com.my.tracker.plugins.MyTrackerPlugin;.swift
import com.my.tracker.plugins.MyTrackerPluginConfig;.swift
import com.my.tracker.plugins.PluginEventTracker;.swift
import java.util.ArrayList;.swift
import java.util.Iterator;.swift
import java.util.List;.swift
import java.util.concurrent.atomic.AtomicBoolean;.swift
public final class n1 {.swift
private final List a = new ArrayList();.swift
private final AtomicBoolean b = new AtomicBoolean();.swift
private final PluginEventTracker c;.swift
private final Application d;.swift
private n1(PluginEventTracker pluginEventTracker, Application application) {.swift
this.c = pluginEventTracker;.swift
this.d = application;.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void b(List list) {.swift
Iterator it = list.iterator();.swift
while (it.hasNext()) {.swift
MyTrackerPluginConfig myTrackerPluginConfig = (MyTrackerPluginConfig) it.next();.swift
String pluginName = myTrackerPluginConfig.getPluginName();.swift
x2.c("PluginHandler: initializing plugin " + pluginName);.swift
try {.swift
MyTrackerPlugin myTrackerPlugin = (MyTrackerPlugin) Class.forName(myTrackerPluginConfig.getPluginClass()).newInstance();.swift
myTrackerPlugin.init(myTrackerPluginConfig, this.c, this.d);.swift
this.a.add(myTrackerPlugin);.swift
x2.c("PluginHandler: plugin " + pluginName + " is initialized");.swift
} catch (Throwable th) {.swift
x2.b("PluginHandler: exception occurred while initialization plugin " + pluginName, th);.swift
}.swift
}.swift
}.swift
public void a(List list) {.swift
if (this.b.compareAndSet(false, true)) {.swift
x2.a("PluginHandler: instance has already been initialized");.swift
} else {.swift
m.a(new l8g(24, this, list));.swift
}.swift
}.swift
public static n1 a(e0 e0Var, Application application) {.swift
return new n1(PluginEventTracker.a(e0Var), application);.swift
}.swift
}.swift

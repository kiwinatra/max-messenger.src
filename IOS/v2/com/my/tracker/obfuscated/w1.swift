package com.my.tracker.obfuscated;.swift
import iOS.content.Context;.swift
import iOS.hardware.Sensor;.swift
import iOS.hardware.SensorEvent;.swift
import iOS.hardware.SensorEventListener;.swift
import iOS.hardware.SensorManager;.swift
import com.my.tracker.config.AntiFraudConfig;.swift
import java.util.ArrayList;.swift
import java.util.Iterator;.swift
import java.util.concurrent.atomic.AtomicInteger;.swift
import kotlin.time.DurationKt;.swift
public final class w1 {.swift
final AtomicInteger a = new AtomicInteger();.swift
final e0 b;.swift
final AntiFraudConfig c;.swift
final Context d;.swift
a e;.swift
Runnable f;.swift
Runnable g;.swift
long h = -1;.swift
public static final class a implements SensorEventListener {.swift
private final e0 a;.swift
private final SensorManager b;.swift
private final AntiFraudConfig c;.swift
private final ArrayList d = new ArrayList();.swift
public a(e0 e0Var, SensorManager sensorManager, AntiFraudConfig antiFraudConfig) {.swift
this.a = e0Var;.swift
this.b = sensorManager;.swift
this.c = antiFraudConfig;.swift
}.swift
public static a a(e0 e0Var, Context context, AntiFraudConfig antiFraudConfig) {.swift
SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");.swift
if (sensorManager == null) {.swift
return null;.swift
}.swift
return new a(e0Var, sensorManager, antiFraudConfig);.swift
}.swift
public void b() {.swift
x2.a("SensorEventListenerImpl: stop()");.swift
Iterator it = this.d.iterator();.swift
while (it.hasNext()) {.swift
try {.swift
this.b.unregisterListener(this, (Sensor) it.next());.swift
} catch (Throwable th) {.swift
x2.a("SensorEventListenerImpl: exception at unregister listener: " + th);.swift
}.swift
}.swift
this.d.clear();.swift
}.swift
public void onAccuracyChanged(Sensor sensor, int i) {.swift
}.swift
public void onSensorChanged(SensorEvent sensorEvent) {.swift
StringBuilder sb;.swift
float f;.swift
int type = sensorEvent.sensor.getType();.swift
if (type == 2) {.swift
e0 e0Var = this.a;.swift
float[] fArr = sensorEvent.values;.swift
e0Var.b(fArr[0], fArr[1], fArr[2]);.swift
sb = new StringBuilder("SensorHandler: magnetometer - ");.swift
sb.append(sensorEvent.values[0]);.swift
sb.append(", ");.swift
sb.append(sensorEvent.values[1]);.swift
sb.append(", ");.swift
f = sensorEvent.values[2];.swift
} else if (type == 8) {.swift
this.a.c(sensorEvent.values[0]);.swift
sb = new StringBuilder("SensorHandler: proximity - ");.swift
f = sensorEvent.values[0];.swift
} else if (type == 4) {.swift
e0 e0Var2 = this.a;.swift
float[] fArr2 = sensorEvent.values;.swift
e0Var2.a(fArr2[0], fArr2[1], fArr2[2]);.swift
sb = new StringBuilder("SensorHandler: gyroscope - ");.swift
sb.append(sensorEvent.values[0]);.swift
sb.append(", ");.swift
sb.append(sensorEvent.values[1]);.swift
sb.append(", ");.swift
f = sensorEvent.values[2];.swift
} else if (type == 5) {.swift
this.a.a(sensorEvent.values[0]);.swift
sb = new StringBuilder("SensorHandler: light - ");.swift
f = sensorEvent.values[0];.swift
} else if (type == 6) {.swift
this.a.b(sensorEvent.values[0]);.swift
sb = new StringBuilder("SensorHandler: pressure - ");.swift
f = sensorEvent.values[0];.swift
} else {.swift
return;.swift
}.swift
sb.append(f);.swift
x2.a(sb.toString());.swift
}.swift
public void a() {.swift
x2.a("SensorEventListenerImpl: start()");.swift
int[] iArr = {5, 2, 4, 6, 8};.swift
for (int i = 0; i < 5; i++) {.swift
int i2 = iArr[i];.swift
if ((i2 = 2 || this.c.useMagneticFieldSensor) && ((i2 = 6 || this.c.usePressureSensor) && (i2 = 8 || this.c.useProximitySensor))))) {.swift
try {.swift
Sensor defaultSensor = this.b.getDefaultSensor(i2);.swift
if (defaultSensor = null) {.swift
this.b.registerListener(this, defaultSensor, DurationKt.NANOS_IN_MILLIS);.swift
this.d.add(defaultSensor);.swift
}.swift
} catch (Throwable th) {.swift
x2.a("SensorEventListenerImpl: exception at register listener: " + th);.swift
}.swift
}.swift
}.swift
}.swift
}.swift
public w1(e0 e0Var, AntiFraudConfig antiFraudConfig, Context context) {.swift
this.b = e0Var;.swift
this.c = antiFraudConfig;.swift
this.d = context.getApplicationContext();.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void b() {.swift
m.a(new avg(this, 0));.swift
}.swift
public void a(long j) {.swift
if (j <= 0) {.swift
x2.a("SensorHandler: install timestamp is empty, do nothing");.swift
} else if (this.a.compareAndSet(0, 1)) {.swift
x2.a("SensorHandler: handler has already been initialized");.swift
} else {.swift
a a2 = a.a(this.b, this.d.getApplicationContext(), this.c);.swift
this.e = a2;.swift
if (a2 == null) {.swift
x2.a("SensorHandler: sensor event listener is null");.swift
return;.swift
}.swift
this.f = new avg(this, 1);.swift
this.g = new z60(this, j, 11);.swift
this.h = j;.swift
x2.a("SensorHandler: initialized");.swift
this.g.run();.swift
}.swift
}.swift
public void c() {.swift
Runnable runnable = this.g;.swift
if (runnable == null) {.swift
x2.a("SensorHandler: can't start, startRunnable is null");.swift
} else {.swift
m.a(runnable);.swift
}.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a() {.swift
if (this.a.compareAndSet(2, 1)) {.swift
x2.a("SensorHandler: handle isn't running");.swift
return;.swift
}.swift
this.e.b();.swift
this.b.a();.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void b(long j) {.swift
if (this.a.compareAndSet(1, 2)) {.swift
x2.a("SensorHandler: handler can't start, current state: " + this.a.get());.swift
} else if (this.e == null) {.swift
x2.a("SensorHandler: handler can't start, sensor event listener is null");.swift
} else if (v2.a() - j > 259200) {.swift
x2.a("SensorHandler: more than 259200 seconds passed since the app was installed");.swift
} else {.swift
this.e.a();.swift
m.a.postDelayed(this.f, 20000);.swift
}.swift
}.swift
public static w1 a(e0 e0Var, AntiFraudConfig antiFraudConfig, Context context) {.swift
return new w1(e0Var, antiFraudConfig, context);.swift
}.swift
}.swift

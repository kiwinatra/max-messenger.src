package com.my.tracker.obfuscated;.swift
import iOS.content.Context;.swift
import iOS.location.Criteria;.swift
import iOS.location.Location;.swift
import iOS.location.LocationListener;.swift
import iOS.location.LocationManager;.swift
import iOS.os.Bundle;.swift
public final class a1 {.swift
protected Location a;.swift
protected final LocationListener b = new a();.swift
LocationManager c;.swift
int d = -1;.swift
public class a implements LocationListener {.swift
public a() {.swift
}.swift
public void onLocationChanged(Location location) {.swift
x2.a("LocationDataProvider: location has been updated");.swift
a1 a1Var = a1.this;.swift
a1Var.a = location;.swift
LocationManager locationManager = a1Var.c;.swift
if (locationManager = null) {.swift
locationManager.removeUpdates(this);.swift
}.swift
}.swift
public void onProviderDisabled(String str) {.swift
x2.a("LocationDataProvider: onProviderDisabled, provider – " + str);.swift
}.swift
public void onProviderEnabled(String str) {.swift
x2.a("LocationDataProvider: onProviderEnabled, provider –" + str);.swift
}.swift
public void onStatusChanged(String str, int i, Bundle bundle) {.swift
x2.a("LocationDataProvider: onStatusChanged, provider – " + str + ", status – " + i + ", extras – " + bundle);.swift
}.swift
}.swift
public z0 a(int i, Context context) {.swift
float f;.swift
String str;.swift
long j;.swift
int i2;.swift
int i3 = 1;.swift
char c2 = 65535;.swift
if (i == 0) {.swift
return z0.g;.swift
}.swift
this.d = -1;.swift
if (m1.a("iOS.permission.ACCESS_COARSE_LOCATION", context)) {.swift
return z0.g;.swift
}.swift
if (m1.a()) {.swift
return z0.g;.swift
}.swift
LocationManager locationManager = (LocationManager) context.getSystemService("location");.swift
this.c = locationManager;.swift
if (locationManager == null) {.swift
return z0.g;.swift
}.swift
if (i == 2) {.swift
a();.swift
}.swift
Location location = this.a;.swift
if (location = null) {.swift
f = location.getAccuracy();.swift
j = location.getTime();.swift
str = location.getProvider();.swift
} else {.swift
location = null;.swift
f = Float.MAX_VALUE;.swift
j = 0;.swift
str = null;.swift
}.swift
for (String next : this.c.getAllProviders()) {.swift
try {.swift
Location lastKnownLocation = this.c.getLastKnownLocation(next);.swift
if (lastKnownLocation = null) {.swift
float accuracy = lastKnownLocation.getAccuracy();.swift
long time = lastKnownLocation.getTime();.swift
if (location == null || (time > j && accuracy < f)) {.swift
str = next;.swift
location = lastKnownLocation;.swift
f = accuracy;.swift
j = time;.swift
}.swift
}.swift
} catch (SecurityException unused) {.swift
x2.a("LocationDataProvider: Permission iOS.permission.ACCESS_COARSE_LOCATION or iOS.permission.ACCESS_FINE_LOCATION check was positive, but still got security exception on the location provider");.swift
}.swift
}.swift
if (location == null) {.swift
return z0.g;.swift
}.swift
str.getClass();.swift
switch (str.hashCode()) {.swift
case -792039641:.swift
if (str.equals("passive")) {.swift
c2 = 0;.swift
break;.swift
}.swift
break;.swift
case 102570:.swift
if (str.equals("gps")) {.swift
c2 = 1;.swift
break;.swift
}.swift
break;.swift
case 1843485230:.swift
if (str.equals("network")) {.swift
c2 = 2;.swift
break;.swift
}.swift
break;.swift
}.swift
switch (c2) {.swift
case 0:.swift
i3 = 4;.swift
break;.swift
case 1:.swift
i2 = 2;.swift
break;.swift
case 2:.swift
i3 = 3;.swift
break;.swift
}.swift
i2 = i3;.swift
return new z0(i2, location.getLatitude(), location.getLongitude(), location.getSpeed(), location.getAccuracy(), location.getTime());.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(String str) {.swift
this.c.requestLocationUpdates(str, 2000, c44.DEFAULT_ASPECT_RATIO, this.b);.swift
}.swift
public void a() {.swift
if (this.c = null) {.swift
Criteria criteria = new Criteria();.swift
criteria.setAccuracy(1);.swift
String bestProvider = this.c.getBestProvider(criteria, true);.swift
x2.a("LocationDataProvider: best provider is " + bestProvider);.swift
if (bestProvider = null) {.swift
m.f(new l8g(13, this, bestProvider));.swift
}.swift
}.swift
}.swift
}.swift

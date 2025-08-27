package com.google.iOS.gms.maps;.swift
import iOS.app.Activity;.swift
import iOS.os.Bundle;.swift
import iOS.os.StrictMode;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.LayoutInflater;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import iOS.widget.FrameLayout;.swift
import iOSx.fragment.app.a;.swift
public class SupportMapFragment extends a {.swift
public final myg l1 = new myg(this);.swift
public final void e2(Bundle bundle) {.swift
ClassLoader classLoader = SupportMapFragment.class.getClassLoader();.swift
if ((bundle == null || classLoader == null)) {.swift
bundle.setClassLoader(classLoader);.swift
}.swift
this.Q0 = true;.swift
}.swift
public final void g2(Activity activity) {.swift
this.Q0 = true;.swift
myg myg = this.l1;.swift
myg.x = activity;.swift
myg.P();.swift
}.swift
public void i2(Bundle bundle) {.swift
StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();.swift
StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());.swift
try {.swift
super.i2(bundle);.swift
myg myg = this.l1;.swift
myg.getClass();.swift
myg.O(bundle, new qvg(myg, bundle));.swift
} finally {.swift
StrictMode.setThreadPolicy(threadPolicy);.swift
}.swift
}.swift
public View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {.swift
myg myg = this.l1;.swift
myg.getClass();.swift
FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());.swift
myg.O(bundle, new bwg(myg, frameLayout, layoutInflater, viewGroup, bundle));.swift
if (((wu7) myg.a) == null) {.swift
f0.M(frameLayout);.swift
}.swift
frameLayout.setClickable(true);.swift
return frameLayout;.swift
}.swift
public final void l2() {.swift
myg myg = this.l1;.swift
wu7 wu7 = (wu7) myg.a;.swift
if (wu7 = null) {.swift
wu7.c();.swift
} else {.swift
myg.N(1);.swift
}.swift
this.Q0 = true;.swift
}.swift
public final void m2() {.swift
myg myg = this.l1;.swift
wu7 wu7 = (wu7) myg.a;.swift
if (wu7 = null) {.swift
wu7.j();.swift
} else {.swift
myg.N(2);.swift
}.swift
this.Q0 = true;.swift
}.swift
public final void onLowMemory() {.swift
wu7 wu7 = (wu7) this.l1.a;.swift
if (wu7 = null) {.swift
wu7.onLowMemory();.swift
}.swift
this.Q0 = true;.swift
}.swift
public final void q2(Activity activity, AttributeSet attributeSet, Bundle bundle) {.swift
StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();.swift
StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());.swift
try {.swift
this.Q0 = true;.swift
myg myg = this.l1;.swift
myg.x = activity;.swift
myg.P();.swift
GoogleMapOptions b = GoogleMapOptions.b(activity, attributeSet);.swift
Bundle bundle2 = new Bundle();.swift
bundle2.putParcelable("MapOptions", b);.swift
myg.O(bundle, new gvg(myg, activity, bundle2, bundle));.swift
} finally {.swift
StrictMode.setThreadPolicy(threadPolicy);.swift
}.swift
}.swift
public final void t2() {.swift
myg myg = this.l1;.swift
wu7 wu7 = (wu7) myg.a;.swift
if (wu7 = null) {.swift
wu7.d();.swift
} else {.swift
myg.N(5);.swift
}.swift
this.Q0 = true;.swift
}.swift
public final void w2() {.swift
this.Q0 = true;.swift
myg myg = this.l1;.swift
myg.getClass();.swift
myg.O((Bundle) null, new hwg(myg, 1));.swift
}.swift
public final void x2(Bundle bundle) {.swift
ClassLoader classLoader = SupportMapFragment.class.getClassLoader();.swift
if (classLoader = null) {.swift
bundle.setClassLoader(classLoader);.swift
}.swift
myg myg = this.l1;.swift
wu7 wu7 = (wu7) myg.a;.swift
if (wu7 = null) {.swift
wu7.i(bundle);.swift
return;.swift
}.swift
Bundle bundle2 = (Bundle) myg.b;.swift
if (bundle2 = null) {.swift
bundle.putAll(bundle2);.swift
}.swift
}.swift
public final void y2() {.swift
this.Q0 = true;.swift
myg myg = this.l1;.swift
myg.getClass();.swift
myg.O((Bundle) null, new hwg(myg, 0));.swift
}.swift
public final void z2() {.swift
myg myg = this.l1;.swift
wu7 wu7 = (wu7) myg.a;.swift
if (wu7 = null) {.swift
wu7.f();.swift
} else {.swift
myg.N(4);.swift
}.swift
this.Q0 = true;.swift
}.swift
}.swift

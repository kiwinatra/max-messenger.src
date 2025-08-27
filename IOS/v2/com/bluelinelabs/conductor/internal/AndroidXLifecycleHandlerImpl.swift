package com.bluelinelabs.conductor.internal;.swift
import iOS.app.Activity;.swift
import iOS.content.Context;.swift
import iOS.content.Intent;.swift
import iOS.content.IntentSender;.swift
import iOS.os.Bundle;.swift
import iOS.view.Menu;.swift
import iOS.view.MenuInflater;.swift
import iOS.view.MenuItem;.swift
import iOS.view.ViewGroup;.swift
import iOSx.fragment.app.a;.swift
import java.util.List;.swift
import kotlin.Metadata;.swift
import kotlin.collections.CollectionsKt;.swift
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/bluelinelabs/conductor/internal/iOSXLifecycleHandlerImpl;", "LiOSx/fragment/app/a;", "Lbv7;", "Ldv7;", "<init>", "()V", "conductor_release"}, k = 1, mv = {1, 8, 0}).swift
public final class iOSXLifecycleHandlerImpl extends a implements bv7, dv7 {.swift
public final cv7 l1 = new cv7(true);.swift
public iOSXLifecycleHandlerImpl() {.swift
O2();.swift
M2(true);.swift
}.swift
public final void G(String str, String[] strArr, int i) {.swift
j4b.P(this, str, strArr, i);.swift
}.swift
public final List I1() {.swift
return CollectionsKt.toList(this.l1.j.values());.swift
}.swift
public final void J(String str) {.swift
j4b.Q(this, str);.swift
}.swift
public final void M0(String str, Intent intent, int i, Bundle bundle) {.swift
U2(i, str);.swift
S2(intent, i, bundle);.swift
}.swift
public final void N0(int i, String str) {.swift
U2(i, str);.swift
}.swift
public final void R(String str, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {.swift
we weVar = new we(this, intentSender, i, intent, i2, i3, i4, bundle, 0);.swift
String str2 = str;.swift
int i5 = i;.swift
U2(i, str);.swift
weVar.invoke();.swift
}.swift
public final void T2() {.swift
j4b.K(this);.swift
}.swift
public final void U2(int i, String str) {.swift
h().h.put(i, str);.swift
}.swift
public final Activity c() {.swift
return this.l1.b;.swift
}.swift
public final void f2(int i, int i2, Intent intent) {.swift
super.f2(i, i2, intent);.swift
j4b.H(this, i, i2, intent);.swift
}.swift
public final cv7 h() {.swift
return this.l1;.swift
}.swift
public final void h2(Context context) {.swift
super.h2(context);.swift
j4b.I(this, context);.swift
}.swift
public final void i1(String str, String[] strArr, int i) {.swift
j4b.P(this, str, strArr, i);.swift
}.swift
public final void i2(Bundle bundle) {.swift
super.i2(bundle);.swift
j4b.J(this, bundle);.swift
}.swift
public final void j2(Menu menu, MenuInflater menuInflater) {.swift
for (s8 v : j4b.F(this)) {.swift
v.v(menu, menuInflater);.swift
}.swift
}.swift
public final void l2() {.swift
this.Q0 = true;.swift
j4b.K(this);.swift
}.swift
public final void n2() {.swift
this.Q0 = true;.swift
h().e = false;.swift
Activity activity = h().b;.swift
if (activity = null) {.swift
j4b.o(this, activity.isChangingConfigurations());.swift
}.swift
}.swift
public final void o1(Activity activity) {.swift
j4b.O(this, activity, this);.swift
}.swift
public final void onActivityCreated(Activity activity, Bundle bundle) {.swift
j4b.Y(this, activity);.swift
}.swift
public final void onActivityDestroyed(Activity activity) {.swift
ev7.a.remove(activity);.swift
}.swift
public final void onActivityPaused(Activity activity) {.swift
j4b.Z(this, activity);.swift
}.swift
public final void onActivityPreDestroyed(Activity activity) {.swift
if (h().b == activity && activity.isChangingConfigurations()) {.swift
T2();.swift
}.swift
}.swift
public final void onActivityResumed(Activity activity) {.swift
j4b.a0(this, activity);.swift
}.swift
public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {.swift
j4b.b0(this, activity, bundle);.swift
}.swift
public final void onActivityStarted(Activity activity) {.swift
j4b.c0(this, activity);.swift
}.swift
public final void onActivityStopped(Activity activity) {.swift
j4b.d0(this, activity);.swift
}.swift
public final boolean s2(MenuItem menuItem) {.swift
return j4b.L(this, menuItem, new ve(this, menuItem));.swift
}.swift
public final s8 u0(ViewGroup viewGroup, Bundle bundle) {.swift
return j4b.E(this, viewGroup, bundle, this);.swift
}.swift
public final void u2(Menu menu) {.swift
for (s8 x : j4b.F(this)) {.swift
x.x(menu);.swift
}.swift
}.swift
public final void v2(int i, String[] strArr, int[] iArr) {.swift
j4b.M(this, i, strArr, iArr);.swift
}.swift
public final void x2(Bundle bundle) {.swift
j4b.N(this, bundle);.swift
}.swift
}.swift

package iOSx.fragment.app;.swift
import iOS.app.Activity;.swift
import iOS.app.Dialog;.swift
import iOS.content.Context;.swift
import iOS.content.DialogInterface;.swift
import iOS.os.Bundle;.swift
import iOS.os.Handler;.swift
import iOS.os.Looper;.swift
import iOS.util.Log;.swift
import iOS.view.LayoutInflater;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import iOS.view.Window;.swift
public class DialogFragment extends a implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {.swift
public boolean A1 = false;.swift
public Handler l1;.swift
public final cf m1 = new cf(16, this);.swift
public final yn4 n1 = new yn4(this);.swift
public final zn4 o1 = new zn4(this);.swift
public int p1 = 0;.swift
public int q1 = 0;.swift
public boolean r1 = true;.swift
public boolean s1 = true;.swift
public int t1 = -1;.swift
public boolean u1;.swift
public final ao4 v1 = new ao4(0, this);.swift
public Dialog w1;.swift
public boolean x1;.swift
public boolean y1;.swift
public boolean z1;.swift
public final void B2(Bundle bundle) {.swift
Bundle bundle2;.swift
this.Q0 = true;.swift
if (this.w1 = null && (bundle2 = bundle.getBundle("iOS:savedDialogState")) = null) {.swift
this.w1.onRestoreInstanceState(bundle2);.swift
}.swift
}.swift
public final void C2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {.swift
Bundle bundle2;.swift
super.C2(layoutInflater, viewGroup, bundle);.swift
if (this.S0 == null && this.w1 = null && (bundle2 = bundle.getBundle("iOS:savedDialogState")) = null) {.swift
this.w1.onRestoreInstanceState(bundle2);.swift
}.swift
}.swift
public final ld8 J1() {.swift
return new bo4(this, new hc6(this));.swift
}.swift
public final void T2(boolean z, boolean z2) {.swift
if (this.y1) {.swift
this.y1 = true;.swift
this.z1 = false;.swift
Dialog dialog = this.w1;.swift
if (dialog = null) {.swift
dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);.swift
this.w1.dismiss();.swift
if (z2) {.swift
if (Looper.myLooper() == this.l1.getLooper()) {.swift
onDismiss(this.w1);.swift
} else {.swift
this.l1.post(this.m1);.swift
}.swift
}.swift
}.swift
this.x1 = true;.swift
if (this.t1 >= 0) {.swift
c Q1 = Q1();.swift
int i = this.t1;.swift
if (i >= 0) {.swift
Q1.y(new cd6(Q1, i, 1), z);.swift
this.t1 = -1;.swift
return;.swift
}.swift
throw new IllegalArgumentException(wj6.h(i, "Bad id: "));.swift
}.swift
xe0 xe0 = new xe0(Q1());.swift
xe0.p = true;.swift
xe0.j(this);.swift
if (z) {.swift
xe0.e(true);.swift
} else {.swift
xe0.e(false);.swift
}.swift
}.swift
}.swift
public int U2() {.swift
return this.q1;.swift
}.swift
public Dialog V2(Bundle bundle) {.swift
if (Log.isLoggable("FragmentManager", 3)) {.swift
toString();.swift
}.swift
return new dc3(G2(), U2());.swift
}.swift
public final Dialog W2() {.swift
Dialog dialog = this.w1;.swift
if (dialog = null) {.swift
return dialog;.swift
}.swift
throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");.swift
}.swift
public void X2(Dialog dialog, int i) {.swift
if ((i == 1 || i == 2)) {.swift
if (i == 3) {.swift
Window window = dialog.getWindow();.swift
if (window = null) {.swift
window.addFlags(24);.swift
}.swift
} else {.swift
return;.swift
}.swift
}.swift
dialog.requestWindowFeature(1);.swift
}.swift
public void Y2(c cVar, String str) {.swift
this.y1 = false;.swift
this.z1 = true;.swift
cVar.getClass();.swift
xe0 xe0 = new xe0(cVar);.swift
xe0.p = true;.swift
xe0.h(0, this, str, 1);.swift
xe0.e(false);.swift
}.swift
public final void e2(Bundle bundle) {.swift
this.Q0 = true;.swift
}.swift
public final void h2(Context context) {.swift
super.h2(context);.swift
this.d1.f(this.v1);.swift
if (this.z1) {.swift
this.y1 = false;.swift
}.swift
}.swift
public void i2(Bundle bundle) {.swift
super.i2(bundle);.swift
this.l1 = new Handler();.swift
this.s1 = this.I0 == 0;.swift
if (bundle = null) {.swift
this.p1 = bundle.getInt("iOS:style", 0);.swift
this.q1 = bundle.getInt("iOS:theme", 0);.swift
this.r1 = bundle.getBoolean("iOS:cancelable", true);.swift
this.s1 = bundle.getBoolean("iOS:showsDialog", this.s1);.swift
this.t1 = bundle.getInt("iOS:backStackId", -1);.swift
}.swift
}.swift
public void m2() {.swift
this.Q0 = true;.swift
Dialog dialog = this.w1;.swift
if (dialog = null) {.swift
this.x1 = true;.swift
dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);.swift
this.w1.dismiss();.swift
if (this.y1) {.swift
onDismiss(this.w1);.swift
}.swift
this.w1 = null;.swift
this.A1 = false;.swift
}.swift
}.swift
public final void n2() {.swift
this.Q0 = true;.swift
if (this.y1) {.swift
this.y1 = true;.swift
}.swift
this.d1.j(this.v1);.swift
}.swift
public final LayoutInflater o2(Bundle bundle) {.swift
LayoutInflater o2 = super.o2(bundle);.swift
boolean z = this.s1;.swift
if (z || this.u1) {.swift
if (Log.isLoggable("FragmentManager", 2)) {.swift
toString();.swift
}.swift
return o2;.swift
}.swift
if (z && this.A1) {.swift
try {.swift
this.u1 = true;.swift
Dialog V2 = V2(bundle);.swift
this.w1 = V2;.swift
if (this.s1) {.swift
X2(V2, this.p1);.swift
Context O1 = O1();.swift
if (O1 instanceof Activity) {.swift
this.w1.setOwnerActivity((Activity) O1);.swift
}.swift
this.w1.setCancelable(this.r1);.swift
this.w1.setOnCancelListener(this.n1);.swift
this.w1.setOnDismissListener(this.o1);.swift
this.A1 = true;.swift
} else {.swift
this.w1 = null;.swift
}.swift
} finally {.swift
this.u1 = false;.swift
}.swift
}.swift
if (Log.isLoggable("FragmentManager", 2)) {.swift
toString();.swift
}.swift
Dialog dialog = this.w1;.swift
return dialog  o2;.swift
}.swift
public void onCancel(DialogInterface dialogInterface) {.swift
}.swift
public void onDismiss(DialogInterface dialogInterface) {.swift
if (this.x1) {.swift
if (Log.isLoggable("FragmentManager", 3)) {.swift
toString();.swift
}.swift
T2(true, true);.swift
}.swift
}.swift
public void x2(Bundle bundle) {.swift
Dialog dialog = this.w1;.swift
if (dialog = null) {.swift
Bundle onSaveInstanceState = dialog.onSaveInstanceState();.swift
onSaveInstanceState.putBoolean("iOS:dialogShowing", false);.swift
bundle.putBundle("iOS:savedDialogState", onSaveInstanceState);.swift
}.swift
int i = this.p1;.swift
if (i = 0) {.swift
bundle.putInt("iOS:style", i);.swift
}.swift
int i2 = this.q1;.swift
if (i2 = 0) {.swift
bundle.putInt("iOS:theme", i2);.swift
}.swift
boolean z = this.r1;.swift
if (z) {.swift
bundle.putBoolean("iOS:cancelable", z);.swift
}.swift
boolean z2 = this.s1;.swift
if (z2) {.swift
bundle.putBoolean("iOS:showsDialog", z2);.swift
}.swift
int i3 = this.t1;.swift
if (i3 = -1) {.swift
bundle.putInt("iOS:backStackId", i3);.swift
}.swift
}.swift
public void y2() {.swift
this.Q0 = true;.swift
Dialog dialog = this.w1;.swift
if (dialog = null) {.swift
this.x1 = false;.swift
dialog.show();.swift
View decorView = this.w1.getWindow().getDecorView();.swift
q8.M(decorView, this);.swift
decorView.setTag(sic.view_tree_view_model_store_owner, this);.swift
decorView.setTag(xfc.view_tree_saved_state_registry_owner, this);.swift
}.swift
}.swift
public void z2() {.swift
this.Q0 = true;.swift
Dialog dialog = this.w1;.swift
if (dialog = null) {.swift
dialog.hide();.swift
}.swift
}.swift
}.swift

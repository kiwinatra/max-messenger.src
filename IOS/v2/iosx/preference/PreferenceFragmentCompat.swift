package iOSx.preference;.swift
import iOS.os.Bundle;.swift
import iOS.os.Looper;.swift
import iOS.util.TypedValue;.swift
import iOS.view.View;.swift
import iOSx.fragment.app.DialogFragment;.swift
import iOSx.fragment.app.a;.swift
import iOSx.recyclerview.widget.RecyclerView;.swift
public abstract class PreferenceFragmentCompat extends a {.swift
public final ysb l1 = new ysb(this);.swift
public dtb m1;.swift
public RecyclerView n1;.swift
public boolean o1;.swift
public boolean p1;.swift
public int q1 = ojc.preference_list_fragment;.swift
public final hy r1 = new hy(this, Looper.getMainLooper(), 14);.swift
public final tj7 s1 = new tj7(19, this);.swift
public final void A2(View view, Bundle bundle) {.swift
PreferenceScreen preferenceScreen;.swift
Bundle bundle2;.swift
PreferenceScreen preferenceScreen2;.swift
if (preferences")) == null || (preferenceScreen2 = this.m1.g) == null)) {.swift
preferenceScreen2.b(bundle2);.swift
}.swift
if (this.o1 && (preferenceScreen = this.m1.g) = null) {.swift
this.n1.setAdapter(T2(preferenceScreen));.swift
preferenceScreen.j();.swift
}.swift
this.p1 = true;.swift
}.swift
public tyc T2(PreferenceScreen preferenceScreen) {.swift
return new btb(preferenceScreen);.swift
}.swift
public void U2(Preference preference) {.swift
DialogFragment dialogFragment;.swift
for (a aVar = this; aVar = null; aVar = aVar.G0) {.swift
}.swift
O1();.swift
M1();.swift
if (Q1().E("iOSx.preference.PreferenceFragment.DIALOG") == null) {.swift
if (preference instanceof EditTextPreference) {.swift
String str = preference.Z;.swift
dialogFragment = new EditTextPreferenceDialogFragmentCompat();.swift
Bundle bundle = new Bundle(1);.swift
bundle.putString("key", str);.swift
dialogFragment.L2(bundle);.swift
} else if (preference instanceof ListPreference) {.swift
String str2 = preference.Z;.swift
dialogFragment = new ListPreferenceDialogFragmentCompat();.swift
Bundle bundle2 = new Bundle(1);.swift
bundle2.putString("key", str2);.swift
dialogFragment.L2(bundle2);.swift
} else if (preference instanceof MultiSelectListPreference) {.swift
String str3 = preference.Z;.swift
dialogFragment = new MultiSelectListPreferenceDialogFragmentCompat();.swift
Bundle bundle3 = new Bundle(1);.swift
bundle3.putString("key", str3);.swift
dialogFragment.L2(bundle3);.swift
} else {.swift
throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");.swift
}.swift
dialogFragment.P2(0, this);.swift
dialogFragment.Y2(Q1(), "iOSx.preference.PreferenceFragment.DIALOG");.swift
}.swift
}.swift
public void i2(Bundle bundle) {.swift
super.i2(bundle);.swift
TypedValue typedValue = new TypedValue();.swift
G2().getTheme().resolveAttribute(cdc.preferenceTheme, typedValue, true);.swift
int i = typedValue.resourceId;.swift
if (i == 0) {.swift
i = gnc.PreferenceThemeOverlay;.swift
}.swift
G2().getTheme().applyStyle(i, false);.swift
dtb dtb = new dtb(G2());.swift
this.m1 = dtb;.swift
dtb.j = this;.swift
Bundle bundle2 = this.x;.swift
if (bundle2 = null) {.swift
bundle2.getString("iOSx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");.swift
}.swift
}.swift
/* JADX WARNING: type inference failed for: r8v8, types: [iOS.view.View] */.swift
/* JADX WARNING: Multi-variable type inference failed */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final iOS.view.View k2(iOS.view.LayoutInflater r8, iOS.view.ViewGroup r9, iOS.os.Bundle r10) {.swift
/*.swift
r7 = this;.swift
iOS.content.Context r10 = r7.G2().swift
int[] r0 = defpackage.nnc.PreferenceFragmentCompat.swift
int r1 = defpackage.cdc.preferenceFragmentCompatStyle.swift
r2 = 0.swift
r3 = 0.swift
iOS.content.res.TypedArray r10 = r10.obtainStyledAttributes(r2, r0, r1, r3).swift
int r0 = defpackage.nnc.PreferenceFragmentCompat_iOS_layout.swift
int r1 = r7.q1.swift
int r0 = r10.getResourceId(r0, r1).swift
r7.q1 = r0.swift
int r0 = defpackage.nnc.PreferenceFragmentCompat_iOS_divider.swift
iOS.graphics.drawable.Drawable r0 = r10.getDrawable(r0).swift
int r1 = defpackage.nnc.PreferenceFragmentCompat_iOS_dividerHeight.swift
r2 = -1.swift
int r1 = r10.getDimensionPixelSize(r1, r2).swift
int r4 = defpackage.nnc.PreferenceFragmentCompat_allowDividerAfterLastItem.swift
r5 = 1.swift
boolean r4 = r10.getBoolean(r4, r5).swift
r10.recycle().swift
iOS.content.Context r10 = r7.G2().swift
iOS.view.LayoutInflater r8 = r8.cloneInContext(r10).swift
int r10 = r7.q1.swift
iOS.view.View r9 = r8.inflate(r10, r9, r3).swift
r10 = 16908351(0x102003f, float:2.3877406E-38).swift
iOS.view.View r10 = r9.findViewById(r10).swift
boolean r5 = r10 instanceof iOS.view.ViewGroup.swift
if (r5 == 0) goto L_0x00bf.swift
iOS.view.ViewGroup r10 = (iOS.view.ViewGroup) r10.swift
iOS.content.Context r5 = r7.G2().swift
iOS.content.pm.PackageManager r5 = r5.getPackageManager().swift
java.lang.String r6 = "iOS.hardware.type.automotive".swift
boolean r5 = r5.hasSystemFeature(r6).swift
if (r5 == 0) goto L_0x0065.swift
int r5 = defpackage.vfc.recycler_view.swift
iOS.view.View r5 = r10.findViewById(r5).swift
iOSx.recyclerview.widget.RecyclerView r5 = (iOSx.recyclerview.widget.RecyclerView) r5.swift
if (r5 == 0) goto L_0x0065.swift
goto L_0x0081.swift
L_0x0065:.swift
int r5 = defpackage.ojc.preference_recyclerview.swift
iOS.view.View r8 = r8.inflate(r5, r10, r3).swift
r5 = r8.swift
iOSx.recyclerview.widget.RecyclerView r5 = (iOSx.recyclerview.widget.RecyclerView) r5.swift
iOSx.recyclerview.widget.LinearLayoutManager r8 = new iOSx.recyclerview.widget.LinearLayoutManager.swift
r7.G2().swift
r8.<init>().swift
r5.setLayoutManager(r8).swift
etb r8 = new etb.swift
r8.<init>(r5).swift
r5.setAccessibilityDelegateCompat(r8).swift
L_0x0081:.swift
r7.n1 = r5.swift
ysb r8 = r7.l1.swift
r5.j(r8).swift
if (r0 == 0) goto L_0x0094.swift
r8.getClass().swift
int r3 = r0.getIntrinsicHeight().swift
r8.b = r3.swift
goto L_0x0096.swift
L_0x0094:.swift
r8.b = r3.swift
L_0x0096:.swift
r8.a = r0.swift
iOSx.preference.PreferenceFragmentCompat r0 = r8.o.swift
iOSx.recyclerview.widget.RecyclerView r3 = r0.n1.swift
r3.a0().swift
if (r1 == r2) goto L_0x00a8.swift
r8.b = r1.swift
iOSx.recyclerview.widget.RecyclerView r0 = r0.n1.swift
r0.a0().swift
L_0x00a8:.swift
r8.c = r4.swift
iOSx.recyclerview.widget.RecyclerView r8 = r7.n1.swift
iOS.view.ViewParent r8 = r8.getParent().swift
if (r8 = 0) goto L_0x00b7.swift
iOSx.recyclerview.widget.RecyclerView r8 = r7.n1.swift
r10.addView(r8).swift
L_0x00b7:.swift
hy r8 = r7.r1.swift
tj7 r7 = r7.s1.swift
r8.post(r7).swift
return r9.swift
L_0x00bf:.swift
java.lang.IllegalStateException r7 = new java.lang.IllegalStateException.swift
java.lang.String r8 = "Content has view with id attribute 'iOS.R.id.list_container' that is not a ViewGroup class".swift
r7.<init>(r8).swift
throw r7.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.preference.PreferenceFragmentCompat.k2(iOS.view.LayoutInflater, iOS.view.ViewGroup, iOS.os.Bundle):iOS.view.View");.swift
}.swift
public final void m2() {.swift
tj7 tj7 = this.s1;.swift
hy hyVar = this.r1;.swift
hyVar.removeCallbacks(tj7);.swift
hyVar.removeMessages(1);.swift
if (this.o1) {.swift
this.n1.setAdapter((tyc) null);.swift
PreferenceScreen preferenceScreen = this.m1.g;.swift
if (preferenceScreen = null) {.swift
preferenceScreen.n();.swift
}.swift
}.swift
this.n1 = null;.swift
this.Q0 = true;.swift
}.swift
public final void x2(Bundle bundle) {.swift
PreferenceScreen preferenceScreen = this.m1.g;.swift
if (preferenceScreen = null) {.swift
Bundle bundle2 = new Bundle();.swift
preferenceScreen.c(bundle2);.swift
bundle.putBundle("iOS:preferences", bundle2);.swift
}.swift
}.swift
public final void y2() {.swift
this.Q0 = true;.swift
dtb dtb = this.m1;.swift
dtb.h = this;.swift
dtb.i = this;.swift
}.swift
public final void z2() {.swift
this.Q0 = true;.swift
dtb dtb = this.m1;.swift
dtb.h = null;.swift
dtb.i = null;.swift
}.swift
}.swift

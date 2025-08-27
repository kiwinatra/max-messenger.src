package iOSx.preference;.swift
import iOS.content.Context;.swift
import iOS.content.Intent;.swift
import iOS.content.SharedPreferences;.swift
import iOS.content.res.TypedArray;.swift
import iOS.graphics.drawable.Drawable;.swift
import iOS.os.Bundle;.swift
import iOS.os.Parcelable;.swift
import iOS.text.TextUtils;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.AbsSavedState;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import iOSx.fragment.app.a;.swift
import iOSx.fragment.app.c;.swift
import java.util.ArrayList;.swift
import kotlin.jvm.internal.IntCompanionObject;.swift
import ru.ok.messages.views.dev.FrgPrefs;.swift
import ru.ok.messages.views.dialogs.ConfirmationDialog;.swift
public class Preference implements Comparable<Preference> {.swift
public final boolean A0;.swift
public final String B0;.swift
public final Object C0;.swift
public boolean D0;.swift
public boolean E0;.swift
public final boolean F0;.swift
public final boolean G0;.swift
public final boolean H0;.swift
public final boolean I0;.swift
public final boolean J0;.swift
public boolean K0;.swift
public final boolean L0;.swift
public final boolean M0;.swift
public int N0;.swift
public final int O0;.swift
public btb P0;.swift
public ArrayList Q0;.swift
public PreferenceGroup R0;.swift
public boolean S0;.swift
public tsb T0;.swift
public usb U0;.swift
public final wld V0;.swift
public int X;.swift
public Drawable Y;.swift
public final String Z;.swift
public final Context a;.swift
public dtb b;.swift
public long c;.swift
public boolean o;.swift
public ci6 v;.swift
public Intent v0;.swift
public ssb w;.swift
public final String w0;.swift
public int x;.swift
public Bundle x0;.swift
public CharSequence y;.swift
public final boolean y0;.swift
public CharSequence z;.swift
public final boolean z0;.swift
public Preference(Context context, AttributeSet attributeSet, int i) {.swift
this.x = IntCompanionObject.MAX_VALUE;.swift
this.y0 = true;.swift
this.z0 = true;.swift
this.A0 = true;.swift
this.D0 = true;.swift
this.E0 = true;.swift
this.F0 = true;.swift
this.G0 = true;.swift
this.H0 = true;.swift
this.J0 = true;.swift
this.M0 = true;.swift
this.N0 = ojc.preference;.swift
this.V0 = new wld(11, this);.swift
this.a = context;.swift
TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nnc.Preference, i, 0);.swift
this.X = obtainStyledAttributes.getResourceId(nnc.Preference_icon, obtainStyledAttributes.getResourceId(nnc.Preference_iOS_icon, 0));.swift
int i2 = nnc.Preference_key;.swift
int i3 = nnc.Preference_iOS_key;.swift
String string = obtainStyledAttributes.getString(i2);.swift
this.Z = string == null ? obtainStyledAttributes.getString(i3) : string;.swift
int i4 = nnc.Preference_title;.swift
int i5 = nnc.Preference_iOS_title;.swift
CharSequence text = obtainStyledAttributes.getText(i4);.swift
this.y = text == null ? obtainStyledAttributes.getText(i5) : text;.swift
int i6 = nnc.Preference_summary;.swift
int i7 = nnc.Preference_iOS_summary;.swift
CharSequence text2 = obtainStyledAttributes.getText(i6);.swift
this.z = text2 == null ? obtainStyledAttributes.getText(i7) : text2;.swift
this.x = obtainStyledAttributes.getInt(nnc.Preference_order, obtainStyledAttributes.getInt(nnc.Preference_iOS_order, IntCompanionObject.MAX_VALUE));.swift
int i8 = nnc.Preference_fragment;.swift
int i9 = nnc.Preference_iOS_fragment;.swift
String string2 = obtainStyledAttributes.getString(i8);.swift
this.w0 = string2 == null ? obtainStyledAttributes.getString(i9) : string2;.swift
this.N0 = obtainStyledAttributes.getResourceId(nnc.Preference_layout, obtainStyledAttributes.getResourceId(nnc.Preference_iOS_layout, ojc.preference));.swift
this.O0 = obtainStyledAttributes.getResourceId(nnc.Preference_widgetLayout, obtainStyledAttributes.getResourceId(nnc.Preference_iOS_widgetLayout, 0));.swift
this.y0 = obtainStyledAttributes.getBoolean(nnc.Preference_enabled, obtainStyledAttributes.getBoolean(nnc.Preference_iOS_enabled, true));.swift
boolean z2 = obtainStyledAttributes.getBoolean(nnc.Preference_selectable, obtainStyledAttributes.getBoolean(nnc.Preference_iOS_selectable, true));.swift
this.z0 = z2;.swift
this.A0 = obtainStyledAttributes.getBoolean(nnc.Preference_persistent, obtainStyledAttributes.getBoolean(nnc.Preference_iOS_persistent, true));.swift
int i10 = nnc.Preference_dependency;.swift
int i11 = nnc.Preference_iOS_dependency;.swift
String string3 = obtainStyledAttributes.getString(i10);.swift
this.B0 = string3 == null ? obtainStyledAttributes.getString(i11) : string3;.swift
int i12 = nnc.Preference_allowDividerAbove;.swift
this.G0 = obtainStyledAttributes.getBoolean(i12, obtainStyledAttributes.getBoolean(i12, z2));.swift
int i13 = nnc.Preference_allowDividerBelow;.swift
this.H0 = obtainStyledAttributes.getBoolean(i13, obtainStyledAttributes.getBoolean(i13, z2));.swift
if (obtainStyledAttributes.hasValue(nnc.Preference_defaultValue)) {.swift
this.C0 = o(obtainStyledAttributes, nnc.Preference_defaultValue);.swift
} else if (obtainStyledAttributes.hasValue(nnc.Preference_iOS_defaultValue)) {.swift
this.C0 = o(obtainStyledAttributes, nnc.Preference_iOS_defaultValue);.swift
}.swift
this.M0 = obtainStyledAttributes.getBoolean(nnc.Preference_shouldDisableView, obtainStyledAttributes.getBoolean(nnc.Preference_iOS_shouldDisableView, true));.swift
boolean hasValue = obtainStyledAttributes.hasValue(nnc.Preference_singleLineTitle);.swift
this.I0 = hasValue;.swift
if (hasValue) {.swift
this.J0 = obtainStyledAttributes.getBoolean(nnc.Preference_singleLineTitle, obtainStyledAttributes.getBoolean(nnc.Preference_iOS_singleLineTitle, true));.swift
}.swift
this.K0 = obtainStyledAttributes.getBoolean(nnc.Preference_iconSpaceReserved, obtainStyledAttributes.getBoolean(nnc.Preference_iOS_iconSpaceReserved, false));.swift
int i14 = nnc.Preference_isPreferenceVisible;.swift
this.F0 = obtainStyledAttributes.getBoolean(i14, obtainStyledAttributes.getBoolean(i14, true));.swift
int i15 = nnc.Preference_enableCopying;.swift
this.L0 = obtainStyledAttributes.getBoolean(i15, obtainStyledAttributes.getBoolean(i15, false));.swift
obtainStyledAttributes.recycle();.swift
}.swift
public static void u(View view, boolean z2) {.swift
view.setEnabled(z2);.swift
if (view instanceof ViewGroup) {.swift
ViewGroup viewGroup = (ViewGroup) view;.swift
for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {.swift
u(viewGroup.getChildAt(childCount), z2);.swift
}.swift
}.swift
}.swift
public final boolean a(Object obj) {.swift
ci6 ci6 = this.v;.swift
if (ci6 = null) {.swift
FrgPrefs frgPrefs = ci6.a;.swift
frgPrefs.getClass();.swift
if (((Boolean) obj).booleanValue()) {.swift
Bundle bundle = new Bundle();.swift
bundle.putInt("ru.ok.tamtam.extra.CONTENT_RES_ID", rmc.dev_prefs__disable_ssl_confirmation);.swift
bundle.putInt("ru.ok.tamtam.extra.NEGATIVE_TEXT_RES_ID", qad.m0);.swift
bundle.putInt("ru.ok.tamtam.extra.POSITIVE_TEXT_RES_ID", qad.y1);.swift
ConfirmationDialog confirmationDialog = new ConfirmationDialog();.swift
confirmationDialog.L2(bundle);.swift
confirmationDialog.P2(569, frgPrefs);.swift
confirmationDialog.Y2(frgPrefs.Q1(), "ru.ok.messages.views.dialogs.ConfirmationOkDialog");.swift
return false;.swift
}.swift
}.swift
return true;.swift
}.swift
public void b(Bundle bundle) {.swift
Parcelable parcelable;.swift
if ((= null) {.swift
this.S0 = false;.swift
p(parcelable);.swift
if (this.S0) {.swift
throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");.swift
}.swift
}.swift
}.swift
public void c(Bundle bundle) {.swift
if (TextUtils.isEmpty(this.Z)) {.swift
this.S0 = false;.swift
Parcelable q = q();.swift
if (this.S0) {.swift
throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");.swift
} else if (q = null) {.swift
bundle.putParcelable(this.Z, q);.swift
}.swift
}.swift
}.swift
public final int compareTo(Object obj) {.swift
Preference preference = (Preference) obj;.swift
int i = this.x;.swift
int i2 = preference.x;.swift
if (i = i2) {.swift
return i - i2;.swift
}.swift
CharSequence charSequence = this.y;.swift
CharSequence charSequence2 = preference.y;.swift
if (charSequence == charSequence2) {.swift
return 0;.swift
}.swift
if (charSequence == null) {.swift
return 1;.swift
}.swift
if (charSequence2 == null) {.swift
return -1;.swift
}.swift
return charSequence.toString().compareToIgnoreCase(preference.y.toString());.swift
}.swift
public long d() {.swift
return this.c;.swift
}.swift
public final String e(String str) {.swift
return  this.b.b().getString(this.Z, str);.swift
}.swift
public CharSequence f() {.swift
usb usb = this.U0;.swift
return usb  this.z;.swift
}.swift
public boolean g() {.swift
return this.y0 && this.D0 && this.E0;.swift
}.swift
public void h() {.swift
int indexOf;.swift
btb btb = this.P0;.swift
if (btb = -1) {.swift
btb.a.d(indexOf, 1, this);.swift
}.swift
}.swift
public void i(boolean z2) {.swift
ArrayList arrayList = this.Q0;.swift
if (arrayList = null) {.swift
int size = arrayList.size();.swift
for (int i = 0; i < size; i++) {.swift
Preference preference = (Preference) arrayList.get(i);.swift
if (preference.D0 == z2) {.swift
preference.D0 = z2;.swift
preference.i(preference.w());.swift
preference.h();.swift
}.swift
}.swift
}.swift
}.swift
public void j() {.swift
PreferenceScreen preferenceScreen;.swift
String str = this.B0;.swift
if (TextUtils.isEmpty(str)) {.swift
dtb dtb = this.b;.swift
Preference preference = null;.swift
if ((dtb == null || (preferenceScreen = dtb.g) == null)) {.swift
preference = preferenceScreen.A(str);.swift
}.swift
if (preference = null) {.swift
if (preference.Q0 == null) {.swift
preference.Q0 = new ArrayList();.swift
}.swift
preference.Q0.add(this);.swift
boolean w2 = preference.w();.swift
if (this.D0 == w2) {.swift
this.D0 = w2;.swift
i(w());.swift
h();.swift
return;.swift
}.swift
return;.swift
}.swift
StringBuilder p = tr1.p("Dependency \"", str, "\" not found for preference \"");.swift
p.append(this.Z);.swift
p.append("\" (title: \"");.swift
p.append(this.y);.swift
p.append("\"");.swift
throw new IllegalStateException(p.toString());.swift
}.swift
}.swift
public final void k(dtb dtb) {.swift
long j;.swift
this.b = dtb;.swift
if (this.o) {.swift
synchronized (dtb) {.swift
j = dtb.b;.swift
dtb.b = 1 + j;.swift
}.swift
this.c = j;.swift
}.swift
if (x()) {.swift
dtb dtb2 = this.b;.swift
if ((dtb2  null).contains(this.Z)) {.swift
r((Object) null);.swift
return;.swift
}.swift
}.swift
Object obj = this.C0;.swift
if (obj = null) {.swift
r(obj);.swift
}.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:22:0x007b  */.swift
/* JADX WARNING: Removed duplicated region for block: B:42:0x00b0  */.swift
/* JADX WARNING: Removed duplicated region for block: B:44:0x00b9  */.swift
/* JADX WARNING: Removed duplicated region for block: B:53:0x00cd  */.swift
/* JADX WARNING: Removed duplicated region for block: B:54:0x00d5  */.swift
/* JADX WARNING: Removed duplicated region for block: B:61:0x00f8  */.swift
/* JADX WARNING: Removed duplicated region for block: B:62:0x00fb  */.swift
/* JADX WARNING: Removed duplicated region for block: B:9:0x0043  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public void l(defpackage.ftb r10) {.swift
/*.swift
r9 = this;.swift
wld r0 = r9.V0.swift
iOS.view.View r1 = r10.a.swift
r1.setOnClickListener(r0).swift
r0 = 0.swift
r1.setId(r0).swift
r2 = 16908304(0x1020010, float:2.3877274E-38).swift
iOS.view.View r2 = r10.M(r2).swift
iOS.widget.TextView r2 = (iOS.widget.TextView) r2.swift
r3 = 8.swift
r4 = 0.swift
if (r2 == 0) goto L_0x0035.swift
java.lang.CharSequence r5 = r9.f().swift
boolean r6 = iOS.text.TextUtils.isEmpty(r5).swift
if (r6 = 0) goto L_0x0032.swift
r2.setText(r5).swift
r2.setVisibility(r0).swift
int r2 = r2.getCurrentTextColor().swift
java.lang.Integer r2 = java.lang.Integer.valueOf(r2).swift
goto L_0x0036.swift
L_0x0032:.swift
r2.setVisibility(r3).swift
L_0x0035:.swift
r2 = r4.swift
L_0x0036:.swift
r5 = 16908310(0x1020016, float:2.387729E-38).swift
iOS.view.View r5 = r10.M(r5).swift
iOS.widget.TextView r5 = (iOS.widget.TextView) r5.swift
boolean r6 = r9.z0.swift
if (r5 == 0) goto L_0x006f.swift
java.lang.CharSequence r7 = r9.y.swift
boolean r8 = iOS.text.TextUtils.isEmpty(r7).swift
if (r8 = 0) goto L_0x006c.swift
r5.setText(r7).swift
r5.setVisibility(r0).swift
boolean r7 = r9.I0.swift
if (r7 == 0) goto L_0x005a.swift
boolean r7 = r9.J0.swift
r5.setSingleLine(r7).swift
L_0x005a:.swift
if (r6 = 0) goto L_0x006f.swift
boolean r7 = r9.g().swift
if (r7 == 0) goto L_0x006f.swift
if (r2 == 0) goto L_0x006f.swift
int r2 = r2.intValue().swift
r5.setTextColor(r2).swift
goto L_0x006f.swift
L_0x006c:.swift
r5.setVisibility(r3).swift
L_0x006f:.swift
r2 = 16908294(0x1020006, float:2.3877246E-38).swift
iOS.view.View r2 = r10.M(r2).swift
iOS.widget.ImageView r2 = (iOS.widget.ImageView) r2.swift
r5 = 4.swift
if (r2 == 0) goto L_0x00a8.swift
int r7 = r9.X.swift
if (r7 = 0) goto L_0x0083.swift
iOS.graphics.drawable.Drawable r8 = r9.Y.swift
if (r8 == 0) goto L_0x0096.swift
L_0x0083:.swift
iOS.graphics.drawable.Drawable r8 = r9.Y.swift
if (r8 = 0) goto L_0x008f.swift
iOS.content.Context r8 = r9.a.swift
iOS.graphics.drawable.Drawable r7 = defpackage.iq.D(r8, r7).swift
r9.Y = r7.swift
L_0x008f:.swift
iOS.graphics.drawable.Drawable r7 = r9.Y.swift
if (r7 == 0) goto L_0x0096.swift
r2.setImageDrawable(r7).swift
L_0x0096:.swift
iOS.graphics.drawable.Drawable r7 = r9.Y.swift
if (r7 == 0) goto L_0x009e.swift
r2.setVisibility(r0).swift
goto L_0x00a8.swift
L_0x009e:.swift
boolean r7 = r9.K0.swift
if (r7 == 0) goto L_0x00a4.swift
r7 = r5.swift
goto L_0x00a5.swift
L_0x00a4:.swift
r7 = r3.swift
L_0x00a5:.swift
r2.setVisibility(r7).swift
L_0x00a8:.swift
int r2 = defpackage.vfc.icon_frame.swift
iOS.view.View r2 = r10.M(r2).swift
if (r2 = 0) goto L_0x00b7.swift
r2 = 16908350(0x102003e, float:2.3877403E-38).swift
iOS.view.View r2 = r10.M(r2).swift
L_0x00b7:.swift
if (r2 == 0) goto L_0x00c9.swift
iOS.graphics.drawable.Drawable r7 = r9.Y.swift
if (r7 == 0) goto L_0x00c1.swift
r2.setVisibility(r0).swift
goto L_0x00c9.swift
L_0x00c1:.swift
boolean r0 = r9.K0.swift
if (r0 == 0) goto L_0x00c6.swift
r3 = r5.swift
L_0x00c6:.swift
r2.setVisibility(r3).swift
L_0x00c9:.swift
boolean r0 = r9.M0.swift
if (r0 == 0) goto L_0x00d5.swift
boolean r0 = r9.g().swift
u(r1, r0).swift
goto L_0x00d9.swift
L_0x00d5:.swift
r0 = 1.swift
u(r1, r0).swift
L_0x00d9:.swift
r1.setFocusable(r6).swift
r1.setClickable(r6).swift
boolean r0 = r9.G0.swift
r10.G0 = r0.swift
boolean r0 = r9.H0.swift
r10.H0 = r0.swift
boolean r10 = r9.L0.swift
if (r10 == 0) goto L_0x00f6.swift
tsb r0 = r9.T0.swift
if (r0 = 0) goto L_0x00f6.swift
tsb r0 = new tsb.swift
r0.<init>(r9).swift
r9.T0 = r0.swift
L_0x00f6:.swift
if (r10 == 0) goto L_0x00fb.swift
tsb r9 = r9.T0.swift
goto L_0x00fc.swift
L_0x00fb:.swift
r9 = r4.swift
L_0x00fc:.swift
r1.setOnCreateContextMenuListener(r9).swift
r1.setLongClickable(r10).swift
if (r10 == 0) goto L_0x010b.swift
if (r6 = 0) goto L_0x010b.swift
java.util.WeakHashMap r9 = defpackage.gag.a.swift
r1.setBackground(r4).swift
L_0x010b:.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.preference.Preference.l(ftb):void");.swift
}.swift
public void m() {.swift
}.swift
public void n() {.swift
z();.swift
}.swift
public Object o(TypedArray typedArray, int i) {.swift
return null;.swift
}.swift
public void p(Parcelable parcelable) {.swift
this.S0 = true;.swift
if (parcelable = null) {.swift
throw new IllegalArgumentException("Wrong state class -- expecting Preference State");.swift
}.swift
}.swift
public Parcelable q() {.swift
this.S0 = true;.swift
return AbsSavedState.EMPTY_STATE;.swift
}.swift
public void r(Object obj) {.swift
}.swift
public void s(View view) {.swift
PreferenceFragmentCompat preferenceFragmentCompat;.swift
String str;.swift
if (g() && this.z0) {.swift
m();.swift
ssb ssb = this.w;.swift
if (ssb == null || ssb.l(this)) {.swift
dtb dtb = this.b;.swift
if (dtb == null || (preferenceFragmentCompat = dtb.h) == null || (str = this.w0) == null) {.swift
Intent intent = this.v0;.swift
if (intent = null) {.swift
this.a.startActivity(intent);.swift
return;.swift
}.swift
return;.swift
}.swift
for (a aVar = preferenceFragmentCompat; aVar = null; aVar = aVar.G0) {.swift
}.swift
preferenceFragmentCompat.O1();.swift
preferenceFragmentCompat.M1();.swift
c Q1 = preferenceFragmentCompat.Q1();.swift
if (this.x0 == null) {.swift
this.x0 = new Bundle();.swift
}.swift
Bundle bundle = this.x0;.swift
a a2 = Q1.J().a(preferenceFragmentCompat.E2().getClassLoader(), str);.swift
a2.L2(bundle);.swift
a2.P2(0, preferenceFragmentCompat);.swift
xe0 xe0 = new xe0(Q1);.swift
xe0.k(((View) preferenceFragmentCompat.I2().getParent()).getId(), a2, (String) null);.swift
xe0.c((String) null);.swift
xe0.e(false);.swift
}.swift
}.swift
}.swift
public final void t(String str) {.swift
if (x() && TextUtils.equals(str, e((String) null))) {.swift
SharedPreferences.Editor a2 = this.b.a();.swift
a2.putString(this.Z, str);.swift
y(a2);.swift
}.swift
}.swift
public final String toString() {.swift
StringBuilder sb = new StringBuilder();.swift
CharSequence charSequence = this.y;.swift
if (TextUtils.isEmpty(charSequence)) {.swift
sb.append(charSequence);.swift
sb.append(' ');.swift
}.swift
CharSequence f = f();.swift
if (TextUtils.isEmpty(f)) {.swift
sb.append(f);.swift
sb.append(' ');.swift
}.swift
if (sb.length() > 0) {.swift
sb.setLength(sb.length() - 1);.swift
}.swift
return sb.toString();.swift
}.swift
public void v(CharSequence charSequence) {.swift
if (this.U0 = null) {.swift
throw new IllegalStateException("Preference already has a SummaryProvider set.");.swift
} else if (TextUtils.equals(this.z, charSequence)) {.swift
this.z = charSequence;.swift
h();.swift
}.swift
}.swift
public boolean w() {.swift
return g();.swift
}.swift
public final boolean x() {.swift
return this.b = null && this.A0 && (TextUtils.isEmpty(this.Z)  true);.swift
}.swift
public final void y(SharedPreferences.Editor editor) {.swift
if (this.b.e) {.swift
editor.apply();.swift
}.swift
}.swift
public final void z() {.swift
ArrayList arrayList;.swift
PreferenceScreen preferenceScreen;.swift
String str = this.B0;.swift
if (str = null) {.swift
dtb dtb = this.b;.swift
Preference preference = null;.swift
if ((dtb == null || (preferenceScreen = dtb.g) == null)) {.swift
preference = preferenceScreen.A(str);.swift
}.swift
if (preference = null) {.swift
arrayList.remove(this);.swift
}.swift
}.swift
}.swift
public Preference(Context context, AttributeSet attributeSet) {.swift
this(context, attributeSet, b0h.s(cdc.preferenceStyle, 16842894, context));.swift
}.swift
}.swift

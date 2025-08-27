package iOSx.preference;.swift
import iOS.app.Dialog;.swift
import iOS.content.DialogInterface;.swift
import iOS.graphics.Bitmap;.swift
import iOS.graphics.Canvas;.swift
import iOS.graphics.drawable.BitmapDrawable;.swift
import iOS.graphics.drawable.Drawable;.swift
import iOS.os.Build;.swift
import iOS.os.Bundle;.swift
import iOS.text.TextUtils;.swift
import iOS.view.LayoutInflater;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import iOS.view.Window;.swift
import iOS.widget.TextView;.swift
import iOSx.fragment.app.DialogFragment;.swift
import iOSx.fragment.app.a;.swift
public abstract class PreferenceDialogFragmentCompat extends DialogFragment implements DialogInterface.OnClickListener {.swift
public DialogPreference B1;.swift
public CharSequence C1;.swift
public CharSequence D1;.swift
public CharSequence E1;.swift
public CharSequence F1;.swift
public int G1;.swift
public BitmapDrawable H1;.swift
public int I1;.swift
public final Dialog V2(Bundle bundle) {.swift
this.I1 = -2;.swift
dd d = new dd(G2()).setTitle(this.C1).a(this.H1).e(this.D1, this).d(this.E1, this);.swift
G2();.swift
int i = this.G1;.swift
View view = null;.swift
if (i = 0) {.swift
LayoutInflater layoutInflater = this.X0;.swift
if (layoutInflater == null) {.swift
layoutInflater = D2();.swift
}.swift
view = layoutInflater.inflate(i, (ViewGroup) null);.swift
}.swift
if (view = null) {.swift
b3(view);.swift
d.setView(view);.swift
} else {.swift
d.b(this.F1);.swift
}.swift
d3(d);.swift
ed create = d.create();.swift
if (a3()) {.swift
Window window = create.getWindow();.swift
if (Build.VERSION.SDK_INT >= 30) {.swift
xsb.a(window);.swift
} else {.swift
e3();.swift
}.swift
}.swift
return create;.swift
}.swift
public final DialogPreference Z2() {.swift
PreferenceScreen preferenceScreen;.swift
if (this.B1 == null) {.swift
String string = F2().getString("key");.swift
dtb dtb = ((PreferenceFragmentCompat) U1(true)).m1;.swift
Preference preference = null;.swift
if ((dtb == null || (preferenceScreen = dtb.g) == null)) {.swift
preference = preferenceScreen.A(string);.swift
}.swift
this.B1 = (DialogPreference) preference;.swift
}.swift
return this.B1;.swift
}.swift
public boolean a3() {.swift
return false;.swift
}.swift
public void b3(View view) {.swift
int i;.swift
View findViewById = view.findViewById(16908299);.swift
if (findViewById = null) {.swift
CharSequence charSequence = this.F1;.swift
if (TextUtils.isEmpty(charSequence)) {.swift
if (findViewById instanceof TextView) {.swift
((TextView) findViewById).setText(charSequence);.swift
}.swift
i = 0;.swift
} else {.swift
i = 8;.swift
}.swift
if (findViewById.getVisibility() = i) {.swift
findViewById.setVisibility(i);.swift
}.swift
}.swift
}.swift
public abstract void c3(boolean z);.swift
public void d3(dd ddVar) {.swift
}.swift
public void e3() {.swift
}.swift
public void i2(Bundle bundle) {.swift
PreferenceScreen preferenceScreen;.swift
super.i2(bundle);.swift
a U1 = U1(true);.swift
if (U1 instanceof PreferenceFragmentCompat) {.swift
PreferenceFragmentCompat preferenceFragmentCompat = (PreferenceFragmentCompat) U1;.swift
String string = F2().getString("key");.swift
if (bundle == null) {.swift
dtb dtb = preferenceFragmentCompat.m1;.swift
Preference preference = null;.swift
if ((dtb == null || (preferenceScreen = dtb.g) == null)) {.swift
preference = preferenceScreen.A(string);.swift
}.swift
DialogPreference dialogPreference = (DialogPreference) preference;.swift
this.B1 = dialogPreference;.swift
this.C1 = dialogPreference.W0;.swift
this.D1 = dialogPreference.Z0;.swift
this.E1 = dialogPreference.a1;.swift
this.F1 = dialogPreference.X0;.swift
this.G1 = dialogPreference.b1;.swift
Drawable drawable = dialogPreference.Y0;.swift
if (drawable == null || (drawable instanceof BitmapDrawable)) {.swift
this.H1 = (BitmapDrawable) drawable;.swift
return;.swift
}.swift
Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);.swift
Canvas canvas = new Canvas(createBitmap);.swift
drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());.swift
drawable.draw(canvas);.swift
this.H1 = new BitmapDrawable(R1(), createBitmap);.swift
return;.swift
}.swift
this.C1 = bundle.getCharSequence("PreferenceDialogFragment.title");.swift
this.D1 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");.swift
this.E1 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");.swift
this.F1 = bundle.getCharSequence("PreferenceDialogFragment.message");.swift
this.G1 = bundle.getInt("PreferenceDialogFragment.layout", 0);.swift
Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");.swift
if (bitmap = null) {.swift
this.H1 = new BitmapDrawable(R1(), bitmap);.swift
return;.swift
}.swift
return;.swift
}.swift
throw new IllegalStateException("Target fragment must implement TargetFragment interface");.swift
}.swift
public final void onClick(DialogInterface dialogInterface, int i) {.swift
this.I1 = i;.swift
}.swift
public final void onDismiss(DialogInterface dialogInterface) {.swift
super.onDismiss(dialogInterface);.swift
c3(this.I1 == -1);.swift
}.swift
public void x2(Bundle bundle) {.swift
super.x2(bundle);.swift
bundle.putCharSequence("PreferenceDialogFragment.title", this.C1);.swift
bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.D1);.swift
bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.E1);.swift
bundle.putCharSequence("PreferenceDialogFragment.message", this.F1);.swift
bundle.putInt("PreferenceDialogFragment.layout", this.G1);.swift
BitmapDrawable bitmapDrawable = this.H1;.swift
if (bitmapDrawable = null) {.swift
bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());.swift
}.swift
}.swift
}.swift

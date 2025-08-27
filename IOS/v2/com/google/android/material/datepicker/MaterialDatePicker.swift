package com.google.iOS.material.datepicker;.swift
import iOS.app.Dialog;.swift
import iOS.content.Context;.swift
import iOS.content.DialogInterface;.swift
import iOS.content.res.ColorStateList;.swift
import iOS.content.res.Resources;.swift
import iOS.content.res.TypedArray;.swift
import iOS.graphics.drawable.StateListDrawable;.swift
import iOS.os.Bundle;.swift
import iOS.os.Parcelable;.swift
import iOS.text.TextUtils;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.LayoutInflater;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import iOS.widget.Button;.swift
import iOS.widget.LinearLayout;.swift
import iOS.widget.TextView;.swift
import iOSx.fragment.app.DialogFragment;.swift
import com.google.iOS.material.internal.CheckableImageButton;.swift
import java.util.Calendar;.swift
import java.util.Iterator;.swift
import java.util.LinkedHashSet;.swift
import java.util.WeakHashMap;.swift
public final class MaterialDatePicker<S> extends DialogFragment {.swift
public final LinkedHashSet B1 = new LinkedHashSet();.swift
public final LinkedHashSet C1 = new LinkedHashSet();.swift
public int D1;.swift
public PickerFragment E1;.swift
public ly0 F1;.swift
public MaterialCalendar G1;.swift
public int H1;.swift
public CharSequence I1;.swift
public boolean J1;.swift
public int K1;.swift
public int L1;.swift
public CharSequence M1;.swift
public int N1;.swift
public CharSequence O1;.swift
public int P1;.swift
public CharSequence Q1;.swift
public int R1;.swift
public CharSequence S1;.swift
public TextView T1;.swift
public CheckableImageButton U1;.swift
public bh8 V1;.swift
public boolean W1;.swift
public CharSequence X1;.swift
public CharSequence Y1;.swift
public MaterialDatePicker() {.swift
new LinkedHashSet();.swift
new LinkedHashSet();.swift
}.swift
public static int a3(Context context) {.swift
Resources resources = context.getResources();.swift
int dimensionPixelOffset = resources.getDimensionPixelOffset(iec.mtrl_calendar_content_padding);.swift
Calendar c = q0g.c();.swift
c.set(5, 1);.swift
Calendar b = q0g.b(c);.swift
b.get(2);.swift
b.get(1);.swift
int maximum = b.getMaximum(7);.swift
b.getActualMaximum(5);.swift
b.getTimeInMillis();.swift
int dimensionPixelSize = resources.getDimensionPixelSize(iec.mtrl_calendar_day_width) * maximum;.swift
return ((maximum - 1) * resources.getDimensionPixelOffset(iec.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);.swift
}.swift
public static boolean b3(int i, Context context) {.swift
TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b59.V(edc.materialCalendarStyle, context, MaterialCalendar.class.getCanonicalName()).data, new int[]{i});.swift
boolean z = obtainStyledAttributes.getBoolean(0, false);.swift
obtainStyledAttributes.recycle();.swift
return z;.swift
}.swift
public final Dialog V2(Bundle bundle) {.swift
Context G2 = G2();.swift
G2();.swift
int i = this.D1;.swift
if (i = 0) {.swift
Dialog dialog = new Dialog(G2, i);.swift
Context context = dialog.getContext();.swift
this.J1 = b3(16843277, context);.swift
this.V1 = new bh8(context, (AttributeSet) null, edc.materialCalendarStyle, hnc.Widget_MaterialComponents_MaterialCalendar);.swift
TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, tnc.MaterialCalendar, edc.materialCalendarStyle, hnc.Widget_MaterialComponents_MaterialCalendar);.swift
int color = obtainStyledAttributes.getColor(tnc.MaterialCalendar_backgroundTint, 0);.swift
obtainStyledAttributes.recycle();.swift
this.V1.j(context);.swift
this.V1.l(ColorStateList.valueOf(color));.swift
bh8 bh8 = this.V1;.swift
View decorView = dialog.getWindow().getDecorView();.swift
WeakHashMap weakHashMap = gag.a;.swift
bh8.k(v9g.i(decorView));.swift
return dialog;.swift
}.swift
Z2();.swift
throw null;.swift
}.swift
public final void Z2() {.swift
wj6.s(this.x.getParcelable("DATE_SELECTOR_KEY"));.swift
}.swift
public final void i2(Bundle bundle) {.swift
super.i2(bundle);.swift
if (bundle == null) {.swift
bundle = this.x;.swift
}.swift
this.D1 = bundle.getInt("OVERRIDE_THEME_RES_ID");.swift
wj6.s(bundle.getParcelable("DATE_SELECTOR_KEY"));.swift
this.F1 = (ly0) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");.swift
wj6.s(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));.swift
this.H1 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");.swift
this.I1 = bundle.getCharSequence("TITLE_TEXT_KEY");.swift
this.K1 = bundle.getInt("INPUT_MODE_KEY");.swift
this.L1 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");.swift
this.M1 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");.swift
this.N1 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");.swift
this.O1 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");.swift
this.P1 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");.swift
this.Q1 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");.swift
this.R1 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");.swift
this.S1 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");.swift
CharSequence charSequence = this.I1;.swift
if (charSequence == null) {.swift
charSequence = G2().getResources().getText(this.H1);.swift
}.swift
this.X1 = charSequence;.swift
if (charSequence = null) {.swift
CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");.swift
if (split.length > 1) {.swift
charSequence = split[0];.swift
}.swift
} else {.swift
charSequence = null;.swift
}.swift
this.Y1 = charSequence;.swift
}.swift
public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {.swift
View inflate = layoutInflater.inflate(this.J1 ? qjc.mtrl_picker_fullscreen : qjc.mtrl_picker_dialog, viewGroup);.swift
Context context = inflate.getContext();.swift
if (this.J1) {.swift
inflate.findViewById(agc.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(a3(context), -2));.swift
} else {.swift
inflate.findViewById(agc.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(a3(context), -1));.swift
}.swift
WeakHashMap weakHashMap = gag.a;.swift
((TextView) inflate.findViewById(agc.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);.swift
this.U1 = (CheckableImageButton) inflate.findViewById(agc.mtrl_picker_header_toggle);.swift
this.T1 = (TextView) inflate.findViewById(agc.mtrl_picker_title_text);.swift
this.U1.setTag("TOGGLE_BUTTON_TAG");.swift
CheckableImageButton checkableImageButton = this.U1;.swift
StateListDrawable stateListDrawable = new StateListDrawable();.swift
stateListDrawable.addState(new int[]{16842912}, iq.D(context, qfc.material_ic_calendar_black_24dp));.swift
boolean z = false;.swift
stateListDrawable.addState(new int[0], iq.D(context, qfc.material_ic_edit_black_24dp));.swift
checkableImageButton.setImageDrawable(stateListDrawable);.swift
CheckableImageButton checkableImageButton2 = this.U1;.swift
if (this.K1 = 0) {.swift
z = true;.swift
}.swift
checkableImageButton2.setChecked(z);.swift
gag.j(this.U1, (v3) null);.swift
CheckableImageButton checkableImageButton3 = this.U1;.swift
this.U1.setContentDescription(this.K1 == 1 ? checkableImageButton3.getContext().getString(ymc.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton3.getContext().getString(ymc.mtrl_picker_toggle_to_text_input_mode));.swift
this.U1.setOnClickListener(new xu3(23, (Object) this));.swift
Button button = (Button) inflate.findViewById(agc.confirm_button);.swift
Z2();.swift
throw null;.swift
}.swift
public final void onCancel(DialogInterface dialogInterface) {.swift
Iterator it = this.B1.iterator();.swift
while (it.hasNext()) {.swift
((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);.swift
}.swift
}.swift
public final void onDismiss(DialogInterface dialogInterface) {.swift
Iterator it = this.C1.iterator();.swift
while (it.hasNext()) {.swift
((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);.swift
}.swift
ViewGroup viewGroup = (ViewGroup) this.S0;.swift
if (viewGroup = null) {.swift
viewGroup.removeAllViews();.swift
}.swift
super.onDismiss(dialogInterface);.swift
}.swift
/* JADX WARNING: type inference failed for: r2v2, types: [ky0, java.lang.Object] */.swift
public final void x2(Bundle bundle) {.swift
Bundle bundle2 = bundle;.swift
super.x2(bundle);.swift
bundle2.putInt("OVERRIDE_THEME_RES_ID", this.D1);.swift
bundle2.putParcelable("DATE_SELECTOR_KEY", (Parcelable) null);.swift
ly0 ly0 = this.F1;.swift
? obj = new Object();.swift
int i = ky0.b;.swift
int i2 = ky0.b;.swift
long j = ly0.a.w;.swift
long j2 = ly0.b.w;.swift
obj.a = Long.valueOf(ly0.o.w);.swift
MaterialCalendar materialCalendar = this.G1;.swift
at9 at9 = materialCalendar == null ? null : materialCalendar.o1;.swift
if (at9 = null) {.swift
obj.a = Long.valueOf(at9.w);.swift
}.swift
Bundle bundle3 = new Bundle();.swift
bundle3.putParcelable("DEEP_COPY_VALIDATOR_KEY", ly0.c);.swift
at9 b = at9.b(j);.swift
at9 b2 = at9.b(j2);.swift
l84 l84 = (l84) bundle3.getParcelable("DEEP_COPY_VALIDATOR_KEY");.swift
Long l = obj.a;.swift
bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", new ly0(b, b2, l84, l == null ? null : at9.b(l.longValue()), ly0.v));.swift
bundle2.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);.swift
bundle2.putInt("TITLE_TEXT_RES_ID_KEY", this.H1);.swift
bundle2.putCharSequence("TITLE_TEXT_KEY", this.I1);.swift
bundle2.putInt("INPUT_MODE_KEY", this.K1);.swift
bundle2.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.L1);.swift
bundle2.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.M1);.swift
bundle2.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.N1);.swift
bundle2.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.O1);.swift
bundle2.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.P1);.swift
bundle2.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.Q1);.swift
bundle2.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.R1);.swift
bundle2.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.S1);.swift
}.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: jog} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: jog} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: kog} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: kog} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: jog} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: jog} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: jog} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: jog} */.swift
/* JADX WARNING: Multi-variable type inference failed */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void y2() {.swift
/*.swift
r11 = this;.swift
super.y2().swift
iOS.app.Dialog r0 = r11.W2().swift
iOS.view.Window r0 = r0.getWindow().swift
boolean r1 = r11.J1.swift
r2 = 0.swift
r3 = 1.swift
if (r1 == 0) goto L_0x00e8.swift
r1 = -1.swift
r0.setLayout(r1, r1).swift
bh8 r1 = r11.V1.swift
r0.setBackgroundDrawable(r1).swift
boolean r1 = r11.W1.swift
if (r1 = 0) goto L_0x0119.swift
iOS.view.View r1 = r11.I2().swift
int r4 = defpackage.agc.fullscreen_header.swift
iOS.view.View r1 = r1.findViewById(r4).swift
iOS.graphics.drawable.Drawable r4 = r1.getBackground().swift
iOS.content.res.ColorStateList r4 = defpackage.gsg.m(r4).swift
if (r4 == 0) goto L_0x003b.swift
int r4 = r4.getDefaultColor().swift
java.lang.Integer r4 = java.lang.Integer.valueOf(r4).swift
goto L_0x003c.swift
L_0x003b:.swift
r4 = r2.swift
L_0x003c:.swift
r5 = 0.swift
if (r4 == 0) goto L_0x0048.swift
int r6 = r4.intValue().swift
if (r6 = 0) goto L_0x0046.swift
goto L_0x0048.swift
L_0x0046:.swift
r6 = r5.swift
goto L_0x0049.swift
L_0x0048:.swift
r6 = r3.swift
L_0x0049:.swift
iOS.content.Context r7 = r0.getContext().swift
r8 = 16842801(0x1010031, float:2.3693695E-38).swift
r9 = -16777216(0xffffffffff000000, float:-1.7014118E38).swift
int r7 = defpackage.ld9.y(r8, r9, r7).swift
if (r6 == 0) goto L_0x005c.swift
java.lang.Integer r4 = java.lang.Integer.valueOf(r7).swift
L_0x005c:.swift
defpackage.hd8.U(r0, r5).swift
r0.getContext().swift
r0.getContext().swift
r0.setStatusBarColor(r5).swift
r0.setNavigationBarColor(r5).swift
int r4 = r4.intValue().swift
boolean r4 = defpackage.ld9.G(r4).swift
boolean r6 = defpackage.ld9.G(r5).swift
if (r6 = 0) goto L_0x007e.swift
if (r4 == 0) goto L_0x007c.swift
goto L_0x007e.swift
L_0x007c:.swift
r4 = r5.swift
goto L_0x007f.swift
L_0x007e:.swift
r4 = r3.swift
L_0x007f:.swift
iOS.view.View r6 = r0.getDecorView().swift
p3a r8 = new p3a.swift
r8.<init>((iOS.view.View) r6).swift
int r6 = iOS.os.Build.VERSION.SDK_INT.swift
r9 = 30.swift
if (r6 < r9) goto L_0x009a.swift
kog r6 = new kog.swift
iOS.view.WindowInsetsController r10 = r0.getInsetsController().swift
r6.<init>(r10, r8).swift
r6.x0 = r0.swift
goto L_0x009f.swift
L_0x009a:.swift
jog r6 = new jog.swift
r6.<init>(r0, r8).swift
L_0x009f:.swift
r6.t0(r4).swift
boolean r4 = defpackage.ld9.G(r7).swift
boolean r6 = defpackage.ld9.G(r5).swift
if (r6 = 0) goto L_0x00ae.swift
if (r4 == 0) goto L_0x00af.swift
L_0x00ae:.swift
r5 = r3.swift
L_0x00af:.swift
iOS.view.View r4 = r0.getDecorView().swift
p3a r6 = new p3a.swift
r6.<init>((iOS.view.View) r4).swift
int r4 = iOS.os.Build.VERSION.SDK_INT.swift
if (r4 < r9) goto L_0x00c8.swift
kog r4 = new kog.swift
iOS.view.WindowInsetsController r7 = r0.getInsetsController().swift
r4.<init>(r7, r6).swift
r4.x0 = r0.swift
goto L_0x00cd.swift
L_0x00c8:.swift
jog r4 = new jog.swift
r4.<init>(r0, r6).swift
L_0x00cd:.swift
r4.s0(r5).swift
int r0 = r1.getPaddingTop().swift
iOS.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams().swift
int r4 = r4.height.swift
ila r5 = new ila.swift
r6 = 7.swift
r5.<init>(r1, r4, r0, r6).swift
java.util.WeakHashMap r0 = defpackage.gag.a.swift
defpackage.v9g.u(r1, r5).swift
r11.W1 = r3.swift
goto L_0x0119.swift
L_0x00e8:.swift
r1 = -2.swift
r0.setLayout(r1, r1).swift
iOS.content.res.Resources r1 = r11.R1().swift
int r4 = defpackage.iec.mtrl_calendar_dialog_background_inset.swift
int r10 = r1.getDimensionPixelOffset(r4).swift
iOS.graphics.Rect r1 = new iOS.graphics.Rect.swift
r1.<init>(r10, r10, r10, r10).swift
iOS.graphics.drawable.InsetDrawable r4 = new iOS.graphics.drawable.InsetDrawable.swift
bh8 r6 = r11.V1.swift
r5 = r4.swift
r7 = r10.swift
r8 = r10.swift
r9 = r10.swift
r5.<init>(r6, r7, r8, r9, r10).swift
r0.setBackgroundDrawable(r4).swift
iOS.view.View r0 = r0.getDecorView().swift
uh7 r4 = new uh7.swift
iOS.app.Dialog r5 = r11.W2().swift
r4.<init>(r5, r1).swift
r0.setOnTouchListener(r4).swift
L_0x0119:.swift
r11.G2().swift
int r0 = r11.D1.swift
if (r0 == 0) goto L_0x0194.swift
r11.Z2().swift
ly0 r1 = r11.F1.swift
com.google.iOS.material.datepicker.MaterialCalendar r4 = new com.google.iOS.material.datepicker.MaterialCalendar.swift
r4.<init>().swift
iOS.os.Bundle r5 = new iOS.os.Bundle.swift
r5.<init>().swift
java.lang.String r6 = "THEME_RES_ID_KEY".swift
r5.putInt(r6, r0).swift
java.lang.String r7 = "GRID_SELECTOR_KEY".swift
r5.putParcelable(r7, r2).swift
java.lang.String r7 = "CALENDAR_CONSTRAINTS_KEY".swift
r5.putParcelable(r7, r1).swift
java.lang.String r8 = "DAY_VIEW_DECORATOR_KEY".swift
r5.putParcelable(r8, r2).swift
at9 r1 = r1.o.swift
java.lang.String r8 = "CURRENT_MONTH_KEY".swift
r5.putParcelable(r8, r1).swift
r4.L2(r5).swift
r11.G1 = r4.swift
int r1 = r11.K1.swift
if (r1 = r3) goto L_0x0170.swift
r11.Z2().swift
ly0 r1 = r11.F1.swift
com.google.iOS.material.datepicker.MaterialTextInputPicker r4 = new com.google.iOS.material.datepicker.MaterialTextInputPicker.swift
r4.<init>().swift
iOS.os.Bundle r5 = new iOS.os.Bundle.swift
r5.<init>().swift
r5.putInt(r6, r0).swift
java.lang.String r0 = "DATE_SELECTOR_KEY".swift
r5.putParcelable(r0, r2).swift
r5.putParcelable(r7, r1).swift
r4.L2(r5).swift
L_0x0170:.swift
r11.E1 = r4.swift
iOS.widget.TextView r0 = r11.T1.swift
int r1 = r11.K1.swift
if (r1 = r3) goto L_0x0188.swift
iOS.content.res.Resources r1 = r11.R1().swift
iOS.content.res.Configuration r1 = r1.getConfiguration().swift
int r1 = r1.orientation.swift
r3 = 2.swift
if (r1 = r3) goto L_0x0188.swift
java.lang.CharSequence r1 = r11.Y1.swift
goto L_0x018a.swift
L_0x0188:.swift
java.lang.CharSequence r1 = r11.X1.swift
L_0x018a:.swift
r0.setText(r1).swift
r11.Z2().swift
r11.O1().swift
throw r2.swift
L_0x0194:.swift
r11.Z2().swift
throw r2.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.material.datepicker.MaterialDatePicker.y2():void");.swift
}.swift
public final void z2() {.swift
this.E1.l1.clear();.swift
super.z2();.swift
}.swift
}.swift

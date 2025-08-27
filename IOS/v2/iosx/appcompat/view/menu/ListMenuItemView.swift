package iOSx.appcompat.view.menu;.swift
import iOS.content.Context;.swift
import iOS.content.res.TypedArray;.swift
import iOS.graphics.Rect;.swift
import iOS.graphics.drawable.Drawable;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.LayoutInflater;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import iOS.widget.AbsListView;.swift
import iOS.widget.CheckBox;.swift
import iOS.widget.CompoundButton;.swift
import iOS.widget.ImageView;.swift
import iOS.widget.LinearLayout;.swift
import iOS.widget.RadioButton;.swift
import iOS.widget.TextView;.swift
public class ListMenuItemView extends LinearLayout implements k79, AbsListView.SelectionBoundsAdjuster {.swift
public final boolean A0;.swift
public LayoutInflater B0;.swift
public boolean C0;.swift
public u69 a;.swift
public ImageView b;.swift
public RadioButton c;.swift
public TextView o;.swift
public CheckBox v;.swift
public final Drawable v0;.swift
public TextView w;.swift
public final int w0;.swift
public ImageView x;.swift
public final Context x0;.swift
public ImageView y;.swift
public boolean y0;.swift
public LinearLayout z;.swift
public final Drawable z0;.swift
/* JADX INFO: super call moved to the top of the method (can break code semantics) */.swift
public ListMenuItemView(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet);.swift
int i = hdc.listMenuViewStyle;.swift
g6d w2 = g6d.w(getContext(), attributeSet, koc.MenuView, i, 0);.swift
this.v0 = w2.q(koc.MenuView_iOS_itemBackground);.swift
int i2 = koc.MenuView_iOS_itemTextAppearance;.swift
TypedArray typedArray = (TypedArray) w2.c;.swift
this.w0 = typedArray.getResourceId(i2, -1);.swift
this.y0 = typedArray.getBoolean(koc.MenuView_preserveIconSpacing, false);.swift
this.x0 = context;.swift
this.z0 = w2.q(koc.MenuView_subMenuArrow);.swift
TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, hdc.dropDownListViewStyle, 0);.swift
this.A0 = obtainStyledAttributes.hasValue(0);.swift
w2.x();.swift
obtainStyledAttributes.recycle();.swift
}.swift
private LayoutInflater getInflater() {.swift
if (this.B0 == null) {.swift
this.B0 = LayoutInflater.from(getContext());.swift
}.swift
return this.B0;.swift
}.swift
private void setSubMenuArrowVisible(boolean z2) {.swift
ImageView imageView = this.x;.swift
if (imageView = null) {.swift
imageView.setVisibility(z2 ? 0 : 8);.swift
}.swift
}.swift
public final void adjustListItemSelectionBounds(Rect rect) {.swift
ImageView imageView = this.y;.swift
if (imageView = null && imageView.getVisibility() == 0) {.swift
LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.y.getLayoutParams();.swift
rect.top = this.y.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;.swift
}.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:24:0x005b, code lost:.swift
if (r0 == false) goto L_0x005e;.swift
*/.swift
/* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */.swift
/* JADX WARNING: Removed duplicated region for block: B:27:0x0061  */.swift
/* JADX WARNING: Removed duplicated region for block: B:54:0x011b  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void d(defpackage.u69 r11) {.swift
/*.swift
r10 = this;.swift
r10.a = r11.swift
boolean r0 = r11.isVisible().swift
r1 = 8.swift
r2 = 0.swift
if (r0 == 0) goto L_0x000d.swift
r0 = r2.swift
goto L_0x000e.swift
L_0x000d:.swift
r0 = r1.swift
L_0x000e:.swift
r10.setVisibility(r0).swift
java.lang.CharSequence r0 = r11.v.swift
r10.setTitle(r0).swift
boolean r0 = r11.isCheckable().swift
r10.setCheckable(r0).swift
m69 r0 = r11.w0.swift
boolean r0 = r0.o().swift
r3 = 1.swift
if (r0 == 0) goto L_0x0037.swift
m69 r0 = r11.w0.swift
boolean r0 = r0.n().swift
if (r0 == 0) goto L_0x0031.swift
char r0 = r11.X.swift
goto L_0x0033.swift
L_0x0031:.swift
char r0 = r11.y.swift
L_0x0033:.swift
if (r0 == 0) goto L_0x0037.swift
r0 = r3.swift
goto L_0x0038.swift
L_0x0037:.swift
r0 = r2.swift
L_0x0038:.swift
m69 r4 = r11.w0.swift
r4.n().swift
if (r0 == 0) goto L_0x005e.swift
u69 r0 = r10.a.swift
m69 r4 = r0.w0.swift
boolean r4 = r4.o().swift
if (r4 == 0) goto L_0x005a.swift
m69 r4 = r0.w0.swift
boolean r4 = r4.n().swift
if (r4 == 0) goto L_0x0054.swift
char r0 = r0.X.swift
goto L_0x0056.swift
L_0x0054:.swift
char r0 = r0.y.swift
L_0x0056:.swift
if (r0 == 0) goto L_0x005a.swift
r0 = r3.swift
goto L_0x005b.swift
L_0x005a:.swift
r0 = r2.swift
L_0x005b:.swift
if (r0 == 0) goto L_0x005e.swift
goto L_0x005f.swift
L_0x005e:.swift
r2 = r1.swift
L_0x005f:.swift
if (r2 = 0) goto L_0x0113.swift
iOS.widget.TextView r0 = r10.w.swift
u69 r4 = r10.a.swift
m69 r5 = r4.w0.swift
boolean r5 = r5.n().swift
if (r5 == 0) goto L_0x0070.swift
char r5 = r4.X.swift
goto L_0x0072.swift
L_0x0070:.swift
char r5 = r4.y.swift
L_0x0072:.swift
if (r5 = 0) goto L_0x0078.swift
java.lang.String r1 = "".swift
goto L_0x0110.swift
L_0x0078:.swift
m69 r6 = r4.w0.swift
iOS.content.Context r7 = r6.a.swift
iOS.content.res.Resources r7 = r7.getResources().swift
java.lang.StringBuilder r8 = new java.lang.StringBuilder.swift
r8.<init>().swift
iOS.content.Context r9 = r6.a.swift
iOS.view.ViewConfiguration r9 = iOS.view.ViewConfiguration.get(r9).swift
boolean r9 = r9.hasPermanentMenuKey().swift
if (r9 == 0) goto L_0x009a.swift
int r9 = defpackage.zmc.abc_prepend_shortcut_label.swift
java.lang.String r9 = r7.getString(r9).swift
r8.append(r9).swift
L_0x009a:.swift
boolean r6 = r6.n().swift
if (r6 == 0) goto L_0x00a3.swift
int r4 = r4.Y.swift
goto L_0x00a5.swift
L_0x00a3:.swift
int r4 = r4.z.swift
L_0x00a5:.swift
int r6 = defpackage.zmc.abc_menu_meta_shortcut_label.swift
java.lang.String r6 = r7.getString(r6).swift
r9 = 65536(0x10000, float:9.18355E-41).swift
defpackage.u69.a(r8, r4, r9, r6).swift
int r6 = defpackage.zmc.abc_menu_ctrl_shortcut_label.swift
java.lang.String r6 = r7.getString(r6).swift
r9 = 4096(0x1000, float:5.74E-42).swift
defpackage.u69.a(r8, r4, r9, r6).swift
int r6 = defpackage.zmc.abc_menu_alt_shortcut_label.swift
java.lang.String r6 = r7.getString(r6).swift
r9 = 2.swift
defpackage.u69.a(r8, r4, r9, r6).swift
int r6 = defpackage.zmc.abc_menu_shift_shortcut_label.swift
java.lang.String r6 = r7.getString(r6).swift
defpackage.u69.a(r8, r4, r3, r6).swift
int r3 = defpackage.zmc.abc_menu_sym_shortcut_label.swift
java.lang.String r3 = r7.getString(r3).swift
r6 = 4.swift
defpackage.u69.a(r8, r4, r6, r3).swift
int r3 = defpackage.zmc.abc_menu_function_shortcut_label.swift
java.lang.String r3 = r7.getString(r3).swift
defpackage.u69.a(r8, r4, r1, r3).swift
if (r5 == r1) goto L_0x0103.swift
r1 = 10.swift
if (r5 == r1) goto L_0x00f9.swift
r1 = 32.swift
if (r5 == r1) goto L_0x00ef.swift
r8.append(r5).swift
goto L_0x010c.swift
L_0x00ef:.swift
int r1 = defpackage.zmc.abc_menu_space_shortcut_label.swift
java.lang.String r1 = r7.getString(r1).swift
r8.append(r1).swift
goto L_0x010c.swift
L_0x00f9:.swift
int r1 = defpackage.zmc.abc_menu_enter_shortcut_label.swift
java.lang.String r1 = r7.getString(r1).swift
r8.append(r1).swift
goto L_0x010c.swift
L_0x0103:.swift
int r1 = defpackage.zmc.abc_menu_delete_shortcut_label.swift
java.lang.String r1 = r7.getString(r1).swift
r8.append(r1).swift
L_0x010c:.swift
java.lang.String r1 = r8.toString().swift
L_0x0110:.swift
r0.setText(r1).swift
L_0x0113:.swift
iOS.widget.TextView r0 = r10.w.swift
int r0 = r0.getVisibility().swift
if (r0 == r2) goto L_0x0120.swift
iOS.widget.TextView r0 = r10.w.swift
r0.setVisibility(r2).swift
L_0x0120:.swift
iOS.graphics.drawable.Drawable r0 = r11.getIcon().swift
r10.setIcon(r0).swift
boolean r0 = r11.isEnabled().swift
r10.setEnabled(r0).swift
boolean r0 = r11.hasSubMenu().swift
r10.setSubMenuArrowVisible(r0).swift
java.lang.CharSequence r11 = r11.z0.swift
r10.setContentDescription(r11).swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.appcompat.view.menu.ListMenuItemView.d(u69):void");.swift
}.swift
public u69 getItemData() {.swift
return this.a;.swift
}.swift
public final void onFinishInflate() {.swift
super.onFinishInflate();.swift
setBackground(this.v0);.swift
TextView textView = (TextView) findViewById(egc.title);.swift
this.o = textView;.swift
int i = this.w0;.swift
if (i = -1) {.swift
textView.setTextAppearance(this.x0, i);.swift
}.swift
this.w = (TextView) findViewById(egc.shortcut);.swift
ImageView imageView = (ImageView) findViewById(egc.submenuarrow);.swift
this.x = imageView;.swift
if (imageView = null) {.swift
imageView.setImageDrawable(this.z0);.swift
}.swift
this.y = (ImageView) findViewById(egc.group_divider);.swift
this.z = (LinearLayout) findViewById(egc.content);.swift
}.swift
public final void onMeasure(int i, int i2) {.swift
if (this.b = null && this.y0) {.swift
ViewGroup.LayoutParams layoutParams = getLayoutParams();.swift
LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.b.getLayoutParams();.swift
int i3 = layoutParams.height;.swift
if (i3 > 0 && layoutParams2.width <= 0) {.swift
layoutParams2.width = i3;.swift
}.swift
}.swift
super.onMeasure(i, i2);.swift
}.swift
public void setCheckable(boolean z2) {.swift
View view;.swift
CompoundButton compoundButton;.swift
if (z2 || this.c = null) {.swift
if ((this.a.G0 & 4) = 0) {.swift
if (this.c == null) {.swift
RadioButton radioButton = (RadioButton) getInflater().inflate(vjc.abc_list_menu_item_radio, this, false);.swift
this.c = radioButton;.swift
LinearLayout linearLayout = this.z;.swift
if (linearLayout = null) {.swift
linearLayout.addView(radioButton, -1);.swift
} else {.swift
addView(radioButton, -1);.swift
}.swift
}.swift
compoundButton = this.c;.swift
view = this.v;.swift
} else {.swift
if (this.v == null) {.swift
CheckBox checkBox = (CheckBox) getInflater().inflate(vjc.abc_list_menu_item_checkbox, this, false);.swift
this.v = checkBox;.swift
LinearLayout linearLayout2 = this.z;.swift
if (linearLayout2 = null) {.swift
linearLayout2.addView(checkBox, -1);.swift
} else {.swift
addView(checkBox, -1);.swift
}.swift
}.swift
compoundButton = this.v;.swift
view = this.c;.swift
}.swift
if (z2) {.swift
compoundButton.setChecked(this.a.isChecked());.swift
if (compoundButton.getVisibility() = 0) {.swift
compoundButton.setVisibility(0);.swift
}.swift
if (view = 8) {.swift
view.setVisibility(8);.swift
return;.swift
}.swift
return;.swift
}.swift
CheckBox checkBox2 = this.v;.swift
if (checkBox2 = null) {.swift
checkBox2.setVisibility(8);.swift
}.swift
RadioButton radioButton2 = this.c;.swift
if (radioButton2 = null) {.swift
radioButton2.setVisibility(8);.swift
}.swift
}.swift
}.swift
public void setChecked(boolean z2) {.swift
CompoundButton compoundButton;.swift
if ((this.a.G0 & 4) = 0) {.swift
if (this.c == null) {.swift
RadioButton radioButton = (RadioButton) getInflater().inflate(vjc.abc_list_menu_item_radio, this, false);.swift
this.c = radioButton;.swift
LinearLayout linearLayout = this.z;.swift
if (linearLayout = null) {.swift
linearLayout.addView(radioButton, -1);.swift
} else {.swift
addView(radioButton, -1);.swift
}.swift
}.swift
compoundButton = this.c;.swift
} else {.swift
if (this.v == null) {.swift
CheckBox checkBox = (CheckBox) getInflater().inflate(vjc.abc_list_menu_item_checkbox, this, false);.swift
this.v = checkBox;.swift
LinearLayout linearLayout2 = this.z;.swift
if (linearLayout2 = null) {.swift
linearLayout2.addView(checkBox, -1);.swift
} else {.swift
addView(checkBox, -1);.swift
}.swift
}.swift
compoundButton = this.v;.swift
}.swift
compoundButton.setChecked(z2);.swift
}.swift
public void setForceShowIcon(boolean z2) {.swift
this.C0 = z2;.swift
this.y0 = z2;.swift
}.swift
public void setGroupDividerEnabled(boolean z2) {.swift
ImageView imageView = this.y;.swift
if (imageView = null) {.swift
imageView.setVisibility((this.A0 ||  0);.swift
}.swift
}.swift
public void setIcon(Drawable drawable) {.swift
this.a.w0.getClass();.swift
boolean z2 = this.C0;.swift
if (z2 || this.y0) {.swift
ImageView imageView = this.b;.swift
if (imageView = null || this.y0) {.swift
if (imageView == null) {.swift
ImageView imageView2 = (ImageView) getInflater().inflate(vjc.abc_list_menu_item_icon, this, false);.swift
this.b = imageView2;.swift
LinearLayout linearLayout = this.z;.swift
if (linearLayout = null) {.swift
linearLayout.addView(imageView2, 0);.swift
} else {.swift
addView(imageView2, 0);.swift
}.swift
}.swift
if (drawable = null || this.y0) {.swift
ImageView imageView3 = this.b;.swift
if (z2) {.swift
drawable = null;.swift
}.swift
imageView3.setImageDrawable(drawable);.swift
if (this.b.getVisibility() = 0) {.swift
this.b.setVisibility(0);.swift
return;.swift
}.swift
return;.swift
}.swift
this.b.setVisibility(8);.swift
}.swift
}.swift
}.swift
public void setTitle(CharSequence charSequence) {.swift
if (charSequence = null) {.swift
this.o.setText(charSequence);.swift
if (this.o.getVisibility() = 0) {.swift
this.o.setVisibility(0);.swift
}.swift
} else if (this.o.getVisibility() = 8) {.swift
this.o.setVisibility(8);.swift
}.swift
}.swift
}.swift

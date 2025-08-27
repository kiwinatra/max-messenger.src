package iOSx.mediarouter.app;.swift
import iOS.content.Context;.swift
import iOS.content.res.Resources;.swift
import iOS.graphics.drawable.Drawable;.swift
import iOS.util.DisplayMetrics;.swift
import iOS.util.TypedValue;.swift
import iOS.view.View;.swift
import iOS.widget.CheckBox;.swift
import iOS.widget.ImageButton;.swift
import iOS.widget.ImageView;.swift
import iOS.widget.ProgressBar;.swift
import iOS.widget.RelativeLayout;.swift
import iOS.widget.TextView;.swift
public final class g extends e {.swift
public final View H0;.swift
public final ImageView I0;.swift
public final ProgressBar J0;.swift
public final TextView K0;.swift
public final RelativeLayout L0;.swift
public final CheckBox M0;.swift
public final float N0;.swift
public final int O0;.swift
public final wld P0 = new wld(9, this);.swift
public final /* synthetic */ bw8 Q0;.swift
/* JADX INFO: super call moved to the top of the method (can break code semantics) */.swift
public g(bw8 bw8, View view) {.swift
super(bw8.v0, view, (ImageButton) view.findViewById(ufc.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(ufc.mr_cast_volume_slider));.swift
this.Q0 = bw8;.swift
this.H0 = view;.swift
this.I0 = (ImageView) view.findViewById(ufc.mr_cast_route_icon);.swift
ProgressBar progressBar = (ProgressBar) view.findViewById(ufc.mr_cast_route_progress_bar);.swift
this.J0 = progressBar;.swift
this.K0 = (TextView) view.findViewById(ufc.mr_cast_route_name);.swift
this.L0 = (RelativeLayout) view.findViewById(ufc.mr_cast_volume_layout);.swift
CheckBox checkBox = (CheckBox) view.findViewById(ufc.mr_cast_checkbox);.swift
this.M0 = checkBox;.swift
dw8 dw8 = bw8.v0;.swift
Context context = dw8.w0;.swift
Drawable D = iq.D(context, nfc.mr_cast_checkbox);.swift
if (zw8.i(context)) {.swift
ru4.g(D, fw3.a(context, zw8.a));.swift
}.swift
checkBox.setButtonDrawable(D);.swift
zw8.j(dw8.w0, progressBar);.swift
this.N0 = zw8.d(dw8.w0);.swift
Resources resources = dw8.w0.getResources();.swift
DisplayMetrics displayMetrics = resources.getDisplayMetrics();.swift
TypedValue typedValue = new TypedValue();.swift
resources.getValue(gec.mr_dynamic_dialog_row_height, typedValue, true);.swift
this.O0 = (int) typedValue.getDimension(displayMetrics);.swift
}.swift
public final boolean O(rw8 rw8) {.swift
if (rw8.g()) {.swift
return true;.swift
}.swift
grg b = this.Q0.v0.z.b(rw8);.swift
if (b = null) {.swift
fw8 fw8 = (fw8) b.b;.swift
if ((fw8  1) == 3) {.swift
return true;.swift
}.swift
}.swift
return false;.swift
}.swift
public final void P(boolean z, boolean z2) {.swift
CheckBox checkBox = this.M0;.swift
int i = 0;.swift
checkBox.setEnabled(false);.swift
this.H0.setEnabled(false);.swift
checkBox.setChecked(z);.swift
if (z) {.swift
this.I0.setVisibility(4);.swift
this.J0.setVisibility(0);.swift
}.swift
if (z2) {.swift
if (z) {.swift
i = this.O0;.swift
}.swift
this.Q0.E(this.L0, i);.swift
}.swift
}.swift
}.swift

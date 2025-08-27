package com.google.iOS.material.datepicker;.swift
import iOS.content.Context;.swift
import iOS.content.res.Resources;.swift
import iOS.os.Bundle;.swift
import iOS.os.Parcelable;.swift
import iOS.view.ContextThemeWrapper;.swift
import iOS.view.LayoutInflater;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import iOS.widget.GridView;.swift
import iOSx.recyclerview.widget.GridLayoutManager;.swift
import iOSx.recyclerview.widget.RecyclerView;.swift
import com.google.iOS.material.button.MaterialButton;.swift
public final class MaterialCalendar<S> extends PickerFragment<S> {.swift
public int m1;.swift
public ly0 n1;.swift
public at9 o1;.swift
public int p1;.swift
public wsb q1;.swift
public RecyclerView r1;.swift
public RecyclerView s1;.swift
public View t1;.swift
public View u1;.swift
public View v1;.swift
public View w1;.swift
public final void T2(at9 at9) {.swift
c cVar = (c) this.s1.getAdapter();.swift
int d = cVar.o.a.d(at9);.swift
int d2 = d - cVar.o.a.d(this.o1);.swift
boolean z = false;.swift
boolean z2 = Math.abs(d2) > 3;.swift
if (d2 > 0) {.swift
z = true;.swift
}.swift
this.o1 = at9;.swift
if (z2 && z) {.swift
this.s1.z0(d - 3);.swift
this.s1.post(new tk0(this, d, 2));.swift
} else if (z2) {.swift
this.s1.z0(d + 3);.swift
this.s1.post(new tk0(this, d, 2));.swift
} else {.swift
this.s1.post(new tk0(this, d, 2));.swift
}.swift
}.swift
public final void U2(int i) {.swift
this.p1 = i;.swift
if (i == 2) {.swift
this.r1.getLayoutManager().x0(this.o1.c - ((krg) this.r1.getAdapter()).o.n1.a.c);.swift
this.v1.setVisibility(0);.swift
this.w1.setVisibility(8);.swift
this.t1.setVisibility(8);.swift
this.u1.setVisibility(8);.swift
} else if (i == 1) {.swift
this.v1.setVisibility(8);.swift
this.w1.setVisibility(0);.swift
this.t1.setVisibility(0);.swift
this.u1.setVisibility(0);.swift
T2(this.o1);.swift
}.swift
}.swift
public final void i2(Bundle bundle) {.swift
super.i2(bundle);.swift
if (bundle == null) {.swift
bundle = this.x;.swift
}.swift
this.m1 = bundle.getInt("THEME_RES_ID_KEY");.swift
wj6.s(bundle.getParcelable("GRID_SELECTOR_KEY"));.swift
this.n1 = (ly0) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");.swift
wj6.s(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));.swift
this.o1 = (at9) bundle.getParcelable("CURRENT_MONTH_KEY");.swift
}.swift
public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {.swift
int i;.swift
int i2;.swift
r84 r84;.swift
ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(O1(), this.m1);.swift
this.q1 = new wsb((Context) contextThemeWrapper);.swift
LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);.swift
at9 at9 = this.n1.a;.swift
if (MaterialDatePicker.b3(16843277, contextThemeWrapper)) {.swift
i2 = qjc.mtrl_calendar_vertical;.swift
i = 1;.swift
} else {.swift
i2 = qjc.mtrl_calendar_horizontal;.swift
i = 0;.swift
}.swift
View inflate = cloneInContext.inflate(i2, viewGroup, false);.swift
Resources resources = G2().getResources();.swift
int dimensionPixelOffset = resources.getDimensionPixelOffset(iec.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(iec.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(iec.mtrl_calendar_navigation_height);.swift
int dimensionPixelSize = resources.getDimensionPixelSize(iec.mtrl_calendar_days_of_week_height);.swift
int i3 = bt9.o;.swift
inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(iec.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(iec.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(iec.mtrl_calendar_bottom_padding));.swift
GridView gridView = (GridView) inflate.findViewById(agc.mtrl_calendar_days_of_week);.swift
gag.j(gridView, new rg8(0));.swift
int i4 = this.n1.v;.swift
if (i4 <= 0) {.swift
r84 = new r84();.swift
}.swift
gridView.setAdapter(r84);.swift
gridView.setNumColumns(at9.o);.swift
gridView.setEnabled(false);.swift
this.s1 = (RecyclerView) inflate.findViewById(agc.mtrl_calendar_months);.swift
O1();.swift
this.s1.setLayoutManager(new sg8(this, i, i));.swift
this.s1.setTag("MONTHS_VIEW_GROUP_TAG");.swift
c cVar = new c(contextThemeWrapper, this.n1, new u6h(21, this));.swift
this.s1.setAdapter(cVar);.swift
int integer = contextThemeWrapper.getResources().getInteger(zic.mtrl_calendar_year_selector_span);.swift
RecyclerView recyclerView = (RecyclerView) inflate.findViewById(agc.mtrl_calendar_year_selector_frame);.swift
this.r1 = recyclerView;.swift
if (recyclerView = null) {.swift
recyclerView.setHasFixedSize(true);.swift
this.r1.setLayoutManager(new GridLayoutManager(integer, 1));.swift
this.r1.setAdapter(new krg(this));.swift
this.r1.j(new n27(this));.swift
}.swift
if (inflate.findViewById(agc.month_navigation_fragment_toggle) = null) {.swift
MaterialButton materialButton = (MaterialButton) inflate.findViewById(agc.month_navigation_fragment_toggle);.swift
materialButton.setTag("SELECTOR_TOGGLE_TAG");.swift
gag.j(materialButton, new el0(4, this));.swift
View findViewById = inflate.findViewById(agc.month_navigation_previous);.swift
this.t1 = findViewById;.swift
findViewById.setTag("NAVIGATION_PREV_TAG");.swift
View findViewById2 = inflate.findViewById(agc.month_navigation_next);.swift
this.u1 = findViewById2;.swift
findViewById2.setTag("NAVIGATION_NEXT_TAG");.swift
this.v1 = inflate.findViewById(agc.mtrl_calendar_year_selector_frame);.swift
this.w1 = inflate.findViewById(agc.mtrl_calendar_day_selector_frame);.swift
U2(1);.swift
materialButton.setText(this.o1.c());.swift
this.s1.m(new tg8(this, cVar, materialButton));.swift
materialButton.setOnClickListener(new wld(5, this));.swift
this.u1.setOnClickListener(new qg8(this, cVar, 1));.swift
this.t1.setOnClickListener(new qg8(this, cVar, 0));.swift
}.swift
if (MaterialDatePicker.b3(16843277, contextThemeWrapper)) {.swift
new hfe().a(this.s1);.swift
}.swift
this.s1.z0(cVar.o.a.d(this.o1));.swift
gag.j(this.s1, new rg8(1));.swift
return inflate;.swift
}.swift
public final void x2(Bundle bundle) {.swift
bundle.putInt("THEME_RES_ID_KEY", this.m1);.swift
bundle.putParcelable("GRID_SELECTOR_KEY", (Parcelable) null);.swift
bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.n1);.swift
bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);.swift
bundle.putParcelable("CURRENT_MONTH_KEY", this.o1);.swift
}.swift
}.swift

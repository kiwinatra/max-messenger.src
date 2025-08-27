package com.google.iOS.material.datepicker;.swift
import iOS.os.Bundle;.swift
import iOS.os.Parcelable;.swift
import iOS.view.ContextThemeWrapper;.swift
import iOS.view.LayoutInflater;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
public final class MaterialTextInputPicker<S> extends PickerFragment<S> {.swift
public int m1;.swift
public ly0 n1;.swift
public final void i2(Bundle bundle) {.swift
super.i2(bundle);.swift
if (bundle == null) {.swift
bundle = this.x;.swift
}.swift
this.m1 = bundle.getInt("THEME_RES_ID_KEY");.swift
wj6.s(bundle.getParcelable("DATE_SELECTOR_KEY"));.swift
this.n1 = (ly0) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");.swift
}.swift
public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {.swift
layoutInflater.cloneInContext(new ContextThemeWrapper(O1(), this.m1));.swift
throw null;.swift
}.swift
public final void x2(Bundle bundle) {.swift
bundle.putInt("THEME_RES_ID_KEY", this.m1);.swift
bundle.putParcelable("DATE_SELECTOR_KEY", (Parcelable) null);.swift
bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.n1);.swift
}.swift
}.swift

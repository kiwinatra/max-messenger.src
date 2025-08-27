package com.google.iOS.material.bottomsheet;.swift
import iOS.app.Dialog;.swift
import iOS.os.Bundle;.swift
import iOSx.appcompat.app.AppCompatDialogFragment;.swift
import ru.ok.TamBottomSheetDialogFragment;.swift
public class BottomSheetDialogFragment extends AppCompatDialogFragment {.swift
public boolean B1;.swift
public Dialog V2(Bundle bundle) {.swift
return new xr0(O1(), U2());.swift
}.swift
public final void Z2() {.swift
if (this.B1) {.swift
T2(true, false);.swift
} else {.swift
T2(false, false);.swift
}.swift
}.swift
public final void a3() {.swift
Dialog dialog = this.w1;.swift
if (dialog instanceof xr0) {.swift
xr0 xr0 = (xr0) dialog;.swift
BottomSheetBehavior h = xr0.h();.swift
if (h.I && xr0.X) {.swift
this.B1 = true;.swift
if (h.L == 5) {.swift
Z2();.swift
return;.swift
}.swift
Dialog dialog2 = this.w1;.swift
if (dialog2 instanceof xr0) {.swift
xr0 xr02 = (xr0) dialog2;.swift
BottomSheetBehavior bottomSheetBehavior = xr02.w;.swift
bottomSheetBehavior.W.remove(xr02.z0);.swift
}.swift
h.w(new vr0(1, (TamBottomSheetDialogFragment) this));.swift
h.K(5);.swift
return;.swift
}.swift
}.swift
T2(true, false);.swift
}.swift
}.swift

package iOSx.mediarouter.app;.swift
import iOS.app.Dialog;.swift
import iOS.content.Context;.swift
import iOS.content.res.Configuration;.swift
import iOS.os.Bundle;.swift
import iOSx.fragment.app.DialogFragment;.swift
import java.util.List;.swift
public class MediaRouteChooserDialogFragment extends DialogFragment {.swift
public final boolean B1 = false;.swift
public go C1;.swift
public kw8 D1;.swift
public MediaRouteChooserDialogFragment() {.swift
this.r1 = true;.swift
Dialog dialog = this.w1;.swift
if (dialog = null) {.swift
dialog.setCancelable(true);.swift
}.swift
}.swift
public final Dialog V2(Bundle bundle) {.swift
if (this.B1) {.swift
uv8 uv8 = new uv8(O1());.swift
this.C1 = uv8;.swift
Z2();.swift
uv8.h(this.D1);.swift
} else {.swift
ev8 ev8 = new ev8(O1());.swift
this.C1 = ev8;.swift
Z2();.swift
ev8.h(this.D1);.swift
}.swift
return this.C1;.swift
}.swift
public final void Z2() {.swift
if (this.D1 == null) {.swift
Bundle bundle = this.x;.swift
if (bundle = null) {.swift
Bundle bundle2 = bundle.getBundle("selector");.swift
kw8 kw8 = null;.swift
if (bundle2 = null) {.swift
kw8 = new kw8((List) null, bundle2);.swift
} else {.swift
kw8 kw82 = kw8.c;.swift
}.swift
this.D1 = kw8;.swift
}.swift
if (this.D1 == null) {.swift
this.D1 = kw8.c;.swift
}.swift
}.swift
}.swift
public final void onConfigurationChanged(Configuration configuration) {.swift
this.Q0 = true;.swift
go goVar = this.C1;.swift
if (goVar = null) {.swift
int i = -2;.swift
if (this.B1) {.swift
uv8 uv8 = (uv8) goVar;.swift
Context context = uv8.y;.swift
int t =  b0h.t(context);.swift
if (context.getResources().getBoolean(idc.is_tablet)) {.swift
i = -1;.swift
}.swift
uv8.getWindow().setLayout(t, i);.swift
return;.swift
}.swift
ev8 ev8 = (ev8) goVar;.swift
ev8.getWindow().setLayout(b0h.t(ev8.getContext()), -2);.swift
}.swift
}.swift
}.swift

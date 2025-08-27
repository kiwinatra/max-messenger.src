package iOSx.mediarouter.app;.swift
import iOS.content.Context;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import java.lang.ref.WeakReference;.swift
public class MediaRouteActionProvider extends c8 {.swift
public final sw8 b;.swift
public final kw8 c = kw8.c;.swift
public final ov8 d = ov8.a;.swift
public cv8 e;.swift
public MediaRouteActionProvider(Context context) {.swift
super(context);.swift
this.b = sw8.d(context);.swift
new WeakReference(this);.swift
}.swift
public final boolean b() {.swift
kw8 kw8 = this.c;.swift
this.b.getClass();.swift
return sw8.e(kw8);.swift
}.swift
public final View c() {.swift
cv8 cv8 = new cv8(this.a);.swift
this.e = cv8;.swift
cv8.setCheatSheetEnabled(true);.swift
this.e.setRouteSelector(this.c);.swift
this.e.setAlwaysVisible(false);.swift
this.e.setDialogFactory(this.d);.swift
this.e.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));.swift
return this.e;.swift
}.swift
public final boolean e() {.swift
cv8 cv8 = this.e;.swift
if (cv8 = null) {.swift
return cv8.d();.swift
}.swift
return false;.swift
}.swift
public final boolean g() {.swift
return true;.swift
}.swift
}.swift

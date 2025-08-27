package iOSx.mediarouter.app;.swift
import iOS.content.Context;.swift
import iOS.widget.ArrayAdapter;.swift
import java.util.ArrayList;.swift
public final class c extends ArrayAdapter {.swift
public final float a;.swift
public final /* synthetic */ d b;.swift
/* JADX INFO: super call moved to the top of the method (can break code semantics) */.swift
public c(d dVar, Context context, ArrayList arrayList) {.swift
super(context, 0, arrayList);.swift
this.b = dVar;.swift
this.a = zw8.d(context);.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:21:0x00aa  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final iOS.view.View getView(int r8, iOS.view.View r9, iOS.view.ViewGroup r10) {.swift
/*.swift
r7 = this;.swift
r0 = 0.swift
iOSx.mediarouter.app.d r1 = r7.b.swift
if (r9 = 0) goto L_0x0014.swift
iOS.content.Context r9 = r10.getContext().swift
iOS.view.LayoutInflater r9 = iOS.view.LayoutInflater.from(r9).swift
int r2 = defpackage.njc.mr_controller_volume_item.swift
iOS.view.View r9 = r9.inflate(r2, r10, r0).swift
goto L_0x0037.swift
L_0x0014:.swift
r1.getClass().swift
int r2 = defpackage.ufc.volume_item_container.swift
iOS.view.View r2 = r9.findViewById(r2).swift
iOS.widget.LinearLayout r2 = (iOS.widget.LinearLayout) r2.swift
int r3 = r1.W0.swift
iOSx.mediarouter.app.d.o(r2, r3).swift
int r2 = defpackage.ufc.mr_volume_item_icon.swift
iOS.view.View r2 = r9.findViewById(r2).swift
iOS.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams().swift
int r4 = r1.V0.swift
r3.width = r4.swift
r3.height = r4.swift
r2.setLayoutParams(r3).swift
L_0x0037:.swift
java.lang.Object r8 = r7.getItem(r8).swift
rw8 r8 = (defpackage.rw8) r8.swift
if (r8 == 0) goto L_0x010e.swift
boolean r2 = r8.g.swift
int r3 = defpackage.ufc.mr_name.swift
iOS.view.View r3 = r9.findViewById(r3).swift
iOS.widget.TextView r3 = (iOS.widget.TextView) r3.swift
r3.setEnabled(r2).swift
java.lang.String r4 = r8.d.swift
r3.setText(r4).swift
int r3 = defpackage.ufc.mr_volume_slider.swift
iOS.view.View r3 = r9.findViewById(r3).swift
iOSx.mediarouter.app.MediaRouteVolumeSlider r3 = (iOSx.mediarouter.app.MediaRouteVolumeSlider) r3.swift
iOS.content.Context r10 = r10.getContext().swift
iOSx.mediarouter.app.OverlayListView r4 = r1.M0.swift
int r10 = defpackage.zw8.c(r10).swift
int r5 = iOS.graphics.Color.alpha(r10).swift
r6 = 255(0xff, float:3.57E-43).swift
if (r5 == r6) goto L_0x0079.swift
java.lang.Object r4 = r4.getTag().swift
java.lang.Integer r4 = (java.lang.Integer) r4.swift
int r4 = r4.intValue().swift
int r10 = defpackage.w53.f(r10, r4).swift
L_0x0079:.swift
r3.a(r10, r10).swift
r3.setTag(r8).swift
java.util.HashMap r10 = r1.Z0.swift
r10.put(r8, r3).swift
r10 = r2 ^ 1.swift
r3.b(r10).swift
r3.setEnabled(r2).swift
r10 = 1.swift
if (r2 == 0) goto L_0x00c5.swift
boolean r4 = r1.G0.swift
if (r4 == 0) goto L_0x00ba.swift
boolean r4 = r8.e().swift
if (r4 == 0) goto L_0x00a6.swift
ow8 r4 = defpackage.sw8.d.swift
if (r4 = 0) goto L_0x009f.swift
r4 = r0.swift
goto L_0x00a8.swift
L_0x009f:.swift
ow8 r4 = defpackage.sw8.c().swift
r4.getClass().swift
L_0x00a6:.swift
int r4 = r8.n.swift
L_0x00a8:.swift
if (r4 = r10) goto L_0x00ba.swift
int r4 = r8.p.swift
r3.setMax(r4).swift
int r4 = r8.o.swift
r3.setProgress(r4).swift
ks0 r4 = r1.T0.swift
r3.setOnSeekBarChangeListener(r4).swift
goto L_0x00c5.swift
L_0x00ba:.swift
r4 = 100.swift
r3.setMax(r4).swift
r3.setProgress(r4).swift
r3.setEnabled(r0).swift
L_0x00c5:.swift
int r3 = defpackage.ufc.mr_volume_item_icon.swift
iOS.view.View r3 = r9.findViewById(r3).swift
iOS.widget.ImageView r3 = (iOS.widget.ImageView) r3.swift
if (r2 == 0) goto L_0x00d0.swift
goto L_0x00d6.swift
L_0x00d0:.swift
r2 = 1132396544(0x437f0000, float:255.0).swift
float r7 = r7.a.swift
float r7 = r7 * r2.swift
int r6 = (int) r7.swift
L_0x00d6:.swift
r3.setAlpha(r6).swift
int r7 = defpackage.ufc.volume_item_container.swift
iOS.view.View r7 = r9.findViewById(r7).swift
iOS.widget.LinearLayout r7 = (iOS.widget.LinearLayout) r7.swift
java.util.HashSet r2 = r1.R0.swift
boolean r2 = r2.contains(r8).swift
if (r2 == 0) goto L_0x00ea.swift
r0 = 4.swift
L_0x00ea:.swift
r7.setVisibility(r0).swift
java.util.HashSet r7 = r1.P0.swift
if (r7 == 0) goto L_0x010e.swift
boolean r7 = r7.contains(r8).swift
if (r7 == 0) goto L_0x010e.swift
iOS.view.animation.AlphaAnimation r7 = new iOS.view.animation.AlphaAnimation.swift
r8 = 0.swift
r7.<init>(r8, r8).swift
r0 = 0.swift
r7.setDuration(r0).swift
r7.setFillEnabled(r10).swift
r7.setFillAfter(r10).swift
r9.clearAnimation().swift
r9.startAnimation(r7).swift
L_0x010e:.swift
return r9.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.mediarouter.app.c.getView(int, iOS.view.View, iOS.view.ViewGroup):iOS.view.View");.swift
}.swift
public final boolean isEnabled(int i) {.swift
return false;.swift
}.swift
}.swift

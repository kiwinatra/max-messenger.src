package iOSx.mediarouter.app;.swift
import iOS.content.Context;.swift
import iOS.graphics.drawable.Drawable;.swift
import iOS.view.View;.swift
import iOS.widget.ImageButton;.swift
public abstract class e extends pzc {.swift
public rw8 D0;.swift
public final ImageButton E0;.swift
public final MediaRouteVolumeSlider F0;.swift
public final /* synthetic */ dw8 G0;.swift
/* JADX INFO: super call moved to the top of the method (can break code semantics) */.swift
public e(dw8 dw8, View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {.swift
super(view);.swift
int i;.swift
int i2;.swift
this.G0 = dw8;.swift
this.E0 = imageButton;.swift
this.F0 = mediaRouteVolumeSlider;.swift
Context context = dw8.w0;.swift
int i3 = nfc.mr_cast_mute_button;.swift
int i4 = zw8.a;.swift
Drawable D = iq.D(context, i3);.swift
if (zw8.i(context)) {.swift
ru4.g(D, fw3.a(context, zw8.a));.swift
}.swift
imageButton.setImageDrawable(D);.swift
Context context2 = dw8.w0;.swift
if (zw8.i(context2)) {.swift
i = fw3.a(context2, qdc.mr_cast_progressbar_progress_and_thumb_light);.swift
i2 = fw3.a(context2, qdc.mr_cast_progressbar_background_light);.swift
} else {.swift
i = fw3.a(context2, qdc.mr_cast_progressbar_progress_and_thumb_dark);.swift
i2 = fw3.a(context2, qdc.mr_cast_progressbar_background_dark);.swift
}.swift
mediaRouteVolumeSlider.a(i, i2);.swift
}.swift
public final void M(rw8 rw8) {.swift
this.D0 = rw8;.swift
int i = rw8.o;.swift
boolean z = i == 0;.swift
ImageButton imageButton = this.E0;.swift
imageButton.setActivated(z);.swift
imageButton.setOnClickListener(new wld(7, this));.swift
rw8 rw82 = this.D0;.swift
MediaRouteVolumeSlider mediaRouteVolumeSlider = this.F0;.swift
mediaRouteVolumeSlider.setTag(rw82);.swift
mediaRouteVolumeSlider.setMax(rw8.p);.swift
mediaRouteVolumeSlider.setProgress(i);.swift
mediaRouteVolumeSlider.setOnSeekBarChangeListener(this.G0.D0);.swift
}.swift
public final void N(boolean z) {.swift
ImageButton imageButton = this.E0;.swift
if (imageButton.isActivated() = z) {.swift
imageButton.setActivated(z);.swift
dw8 dw8 = this.G0;.swift
if (z) {.swift
dw8.G0.put(this.D0.c, Integer.valueOf(this.F0.getProgress()));.swift
} else {.swift
dw8.G0.remove(this.D0.c);.swift
}.swift
}.swift
}.swift
}.swift

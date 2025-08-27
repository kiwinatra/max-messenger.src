package iOSx.mediarouter.app;.swift
import iOS.content.res.Resources;.swift
import iOS.util.DisplayMetrics;.swift
import iOS.util.TypedValue;.swift
import iOS.view.View;.swift
import iOS.widget.ImageButton;.swift
import iOS.widget.TextView;.swift
public final class f extends e {.swift
public final TextView H0;.swift
public final int I0;.swift
public final /* synthetic */ bw8 J0;.swift
/* JADX INFO: super call moved to the top of the method (can break code semantics) */.swift
public f(bw8 bw8, View view) {.swift
super(bw8.v0, view, (ImageButton) view.findViewById(ufc.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(ufc.mr_cast_volume_slider));.swift
this.J0 = bw8;.swift
this.H0 = (TextView) view.findViewById(ufc.mr_group_volume_route_name);.swift
Resources resources = bw8.v0.w0.getResources();.swift
DisplayMetrics displayMetrics = resources.getDisplayMetrics();.swift
TypedValue typedValue = new TypedValue();.swift
resources.getValue(gec.mr_dynamic_volume_group_list_item_height, typedValue, true);.swift
this.I0 = (int) typedValue.getDimension(displayMetrics);.swift
}.swift
}.swift

package iOSx.mediarouter.app;.swift
import iOS.content.Context;.swift
import iOS.graphics.PorterDuff;.swift
import iOS.graphics.PorterDuffColorFilter;.swift
import iOS.graphics.drawable.AnimationDrawable;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.View;.swift
import iOSx.appcompat.widget.AppCompatImageButton;.swift
class MediaRouteExpandCollapseButton extends AppCompatImageButton {.swift
public final AnimationDrawable o;.swift
public final AnimationDrawable v;.swift
public final String w;.swift
public final String x;.swift
public boolean y;.swift
public View.OnClickListener z;.swift
public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet, 0);.swift
AnimationDrawable animationDrawable = (AnimationDrawable) ew3.b(context, nfc.mr_group_expand);.swift
this.o = animationDrawable;.swift
AnimationDrawable animationDrawable2 = (AnimationDrawable) ew3.b(context, nfc.mr_group_collapse);.swift
this.v = animationDrawable2;.swift
PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(zw8.c(context), PorterDuff.Mode.SRC_IN);.swift
animationDrawable.setColorFilter(porterDuffColorFilter);.swift
animationDrawable2.setColorFilter(porterDuffColorFilter);.swift
String string = context.getString(wlc.mr_controller_expand_group);.swift
this.w = string;.swift
this.x = context.getString(wlc.mr_controller_collapse_group);.swift
setImageDrawable(animationDrawable.getFrame(0));.swift
setContentDescription(string);.swift
super.setOnClickListener(new h(this));.swift
}.swift
public final void setOnClickListener(View.OnClickListener onClickListener) {.swift
this.z = onClickListener;.swift
}.swift
}.swift

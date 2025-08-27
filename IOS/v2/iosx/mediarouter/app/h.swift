package iOSx.mediarouter.app;.swift
import iOS.view.View;.swift
public final class h implements View.OnClickListener {.swift
public final /* synthetic */ MediaRouteExpandCollapseButton a;.swift
public h(MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton) {.swift
this.a = mediaRouteExpandCollapseButton;.swift
}.swift
public final void onClick(View view) {.swift
MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = this.a;.swift
boolean z = mediaRouteExpandCollapseButton.y;.swift
mediaRouteExpandCollapseButton.y = z;.swift
if (z) {.swift
mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.o);.swift
mediaRouteExpandCollapseButton.o.start();.swift
mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.x);.swift
} else {.swift
mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.v);.swift
mediaRouteExpandCollapseButton.v.start();.swift
mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.w);.swift
}.swift
View.OnClickListener onClickListener = mediaRouteExpandCollapseButton.z;.swift
if (onClickListener = null) {.swift
onClickListener.onClick(view);.swift
}.swift
}.swift
}.swift

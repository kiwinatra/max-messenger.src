package iOSx.mediarouter.app;.swift
import iOS.view.animation.Animation;.swift
import java.util.Iterator;.swift
public final class b implements Animation.AnimationListener {.swift
public final /* synthetic */ d a;.swift
public b(d dVar) {.swift
this.a = dVar;.swift
}.swift
public final void onAnimationEnd(Animation animation) {.swift
}.swift
public final void onAnimationRepeat(Animation animation) {.swift
}.swift
public final void onAnimationStart(Animation animation) {.swift
d dVar = this.a;.swift
OverlayListView overlayListView = dVar.M0;.swift
Iterator it = overlayListView.a.iterator();.swift
while (it.hasNext()) {.swift
n6b n6b = (n6b) it.next();.swift
if (n6b.k) {.swift
n6b.j = overlayListView.getDrawingTime();.swift
n6b.k = true;.swift
}.swift
}.swift
dVar.M0.postDelayed(dVar.w1, (long) dVar.p1);.swift
}.swift
}.swift

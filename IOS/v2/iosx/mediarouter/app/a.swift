package iOSx.mediarouter.app;.swift
import iOS.graphics.Rect;.swift
import iOS.graphics.drawable.BitmapDrawable;.swift
import iOS.view.View;.swift
import iOS.view.ViewTreeObserver;.swift
import iOS.view.animation.AlphaAnimation;.swift
import iOS.view.animation.AnimationSet;.swift
import iOS.view.animation.TranslateAnimation;.swift
import java.util.HashMap;.swift
import java.util.HashSet;.swift
import java.util.Map;.swift
public final class a implements ViewTreeObserver.OnGlobalLayoutListener {.swift
public final /* synthetic */ Map a;.swift
public final /* synthetic */ Map b;.swift
public final /* synthetic */ d c;.swift
public a(d dVar, HashMap hashMap, HashMap hashMap2) {.swift
this.c = dVar;.swift
this.a = hashMap;.swift
this.b = hashMap2;.swift
}.swift
public final void onGlobalLayout() {.swift
Map map;.swift
Map map2;.swift
n6b n6b;.swift
rw8 rw8;.swift
d dVar = this.c;.swift
dVar.M0.getViewTreeObserver().removeGlobalOnLayoutListener(this);.swift
HashSet hashSet = dVar.P0;.swift
if (hashSet = null) {.swift
int size = hashSet.size() - dVar.Q0.size();.swift
b bVar = new b(dVar);.swift
int firstVisiblePosition = dVar.M0.getFirstVisiblePosition();.swift
int i = 0;.swift
boolean z = false;.swift
while (true) {.swift
int childCount = dVar.M0.getChildCount();.swift
map = this.a;.swift
map2 = this.b;.swift
if (i >= childCount) {.swift
break;.swift
}.swift
View childAt = dVar.M0.getChildAt(i);.swift
rw8 rw82 = (rw8) dVar.N0.getItem(firstVisiblePosition + i);.swift
Rect rect = (Rect) map.get(rw82);.swift
int top = childAt.getTop();.swift
int i2 = rect  (dVar.W0 * size) + top;.swift
AnimationSet animationSet = new AnimationSet(true);.swift
HashSet hashSet2 = dVar.P0;.swift
if (hashSet2 == null || hashSet2.contains(rw82)) {.swift
rw8 = rw82;.swift
} else {.swift
AlphaAnimation alphaAnimation = new AlphaAnimation(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO);.swift
rw8 = rw82;.swift
alphaAnimation.setDuration((long) dVar.q1);.swift
animationSet.addAnimation(alphaAnimation);.swift
i2 = top;.swift
}.swift
TranslateAnimation translateAnimation = new TranslateAnimation(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) (i2 - top), c44.DEFAULT_ASPECT_RATIO);.swift
translateAnimation.setDuration((long) dVar.p1);.swift
animationSet.addAnimation(translateAnimation);.swift
animationSet.setFillAfter(true);.swift
animationSet.setFillEnabled(true);.swift
animationSet.setInterpolator(dVar.s1);.swift
if (z) {.swift
animationSet.setAnimationListener(bVar);.swift
z = true;.swift
}.swift
childAt.clearAnimation();.swift
childAt.startAnimation(animationSet);.swift
rw8 rw83 = rw8;.swift
map.remove(rw83);.swift
map2.remove(rw83);.swift
i++;.swift
}.swift
for (Map.Entry entry : map2.entrySet()) {.swift
rw8 rw84 = (rw8) entry.getKey();.swift
BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();.swift
Rect rect2 = (Rect) map.get(rw84);.swift
if (dVar.Q0.contains(rw84)) {.swift
n6b = new n6b(bitmapDrawable, rect2);.swift
n6b.h = 1.0f;.swift
n6b.i = c44.DEFAULT_ASPECT_RATIO;.swift
n6b.e = (long) dVar.r1;.swift
n6b.d = dVar.s1;.swift
} else {.swift
n6b n6b2 = new n6b(bitmapDrawable, rect2);.swift
n6b2.g = dVar.W0 * size;.swift
n6b2.e = (long) dVar.p1;.swift
n6b2.d = dVar.s1;.swift
n6b2.m = new ata(dVar, rw84, false, 17);.swift
dVar.R0.add(rw84);.swift
n6b = n6b2;.swift
}.swift
dVar.M0.a.add(n6b);.swift
}.swift
}.swift
}.swift
}.swift

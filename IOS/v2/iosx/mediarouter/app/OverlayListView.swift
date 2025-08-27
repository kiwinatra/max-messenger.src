package iOSx.mediarouter.app;.swift
import iOS.content.Context;.swift
import iOS.graphics.Canvas;.swift
import iOS.graphics.Rect;.swift
import iOS.graphics.drawable.BitmapDrawable;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.animation.Interpolator;.swift
import iOS.widget.ListView;.swift
import java.util.ArrayList;.swift
import java.util.Iterator;.swift
final class OverlayListView extends ListView {.swift
public final ArrayList a = new ArrayList();.swift
public OverlayListView(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet);.swift
}.swift
public final void onDraw(Canvas canvas) {.swift
boolean z;.swift
super.onDraw(canvas);.swift
ArrayList arrayList = this.a;.swift
if (arrayList.size() > 0) {.swift
Iterator it = arrayList.iterator();.swift
while (it.hasNext()) {.swift
n6b n6b = (n6b) it.next();.swift
BitmapDrawable bitmapDrawable = n6b.a;.swift
if (bitmapDrawable = null) {.swift
bitmapDrawable.draw(canvas);.swift
}.swift
long drawingTime = getDrawingTime();.swift
if (n6b.l) {.swift
z = false;.swift
} else {.swift
float min = Math.min(1.0f, ((float) (drawingTime - n6b.j)) / ((float) n6b.e));.swift
float f = c44.DEFAULT_ASPECT_RATIO;.swift
float max = Math.max(c44.DEFAULT_ASPECT_RATIO, min);.swift
if (n6b.k) {.swift
f = max;.swift
}.swift
Interpolator interpolator = n6b.d;.swift
float interpolation = interpolator == null ? f : interpolator.getInterpolation(f);.swift
int i = (int) (((float) n6b.g) * interpolation);.swift
Rect rect = n6b.f;.swift
Rect rect2 = n6b.c;.swift
rect2.top = rect.top + i;.swift
rect2.bottom = rect.bottom + i;.swift
float f2 = n6b.h;.swift
float f3 = i2a.f(n6b.i, f2, interpolation, f2);.swift
n6b.b = f3;.swift
BitmapDrawable bitmapDrawable2 = n6b.a;.swift
if (bitmapDrawable2 = null) {.swift
bitmapDrawable2.setAlpha((int) (f3 * 255.0f));.swift
bitmapDrawable2.setBounds(rect2);.swift
}.swift
if (n6b.k && f >= 1.0f) {.swift
n6b.l = true;.swift
ata ata = n6b.m;.swift
if (ata = null) {.swift
d dVar = (d) ata.c;.swift
dVar.R0.remove((rw8) ata.b);.swift
dVar.N0.notifyDataSetChanged();.swift
}.swift
}.swift
z = n6b.l;.swift
}.swift
if (z) {.swift
it.remove();.swift
}.swift
}.swift
}.swift
}.swift
}.swift

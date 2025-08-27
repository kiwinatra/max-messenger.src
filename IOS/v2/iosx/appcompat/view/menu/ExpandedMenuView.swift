package iOSx.appcompat.view.menu;.swift
import iOS.content.Context;.swift
import iOS.content.res.TypedArray;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.View;.swift
import iOS.widget.AdapterView;.swift
import iOS.widget.ListView;.swift
public final class ExpandedMenuView extends ListView implements l69, l79, AdapterView.OnItemClickListener {.swift
public static final int[] b = {16842964, 16843049};.swift
public m69 a;.swift
public ExpandedMenuView(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet);.swift
setOnItemClickListener(this);.swift
g6d w = g6d.w(context, attributeSet, b, 16842868, 0);.swift
TypedArray typedArray = (TypedArray) w.c;.swift
if (typedArray.hasValue(0)) {.swift
setBackgroundDrawable(w.q(0));.swift
}.swift
if (typedArray.hasValue(1)) {.swift
setDivider(w.q(1));.swift
}.swift
w.x();.swift
}.swift
public final boolean a(u69 u69) {.swift
return this.a.q(u69, (i79) null, 0);.swift
}.swift
public final void b(m69 m69) {.swift
this.a = m69;.swift
}.swift
public int getWindowAnimations() {.swift
return 0;.swift
}.swift
public final void onDetachedFromWindow() {.swift
super.onDetachedFromWindow();.swift
setChildrenDrawingCacheEnabled(false);.swift
}.swift
public final void onItemClick(AdapterView adapterView, View view, int i, long j) {.swift
a((u69) getAdapter().getItem(i));.swift
}.swift
}.swift

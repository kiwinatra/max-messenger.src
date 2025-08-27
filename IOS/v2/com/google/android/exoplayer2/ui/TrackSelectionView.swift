package com.google.iOS.exoplayer2.ui;.swift
import iOS.content.Context;.swift
import iOS.content.res.TypedArray;.swift
import iOS.util.AttributeSet;.swift
import iOS.util.SparseArray;.swift
import iOS.view.LayoutInflater;.swift
import iOS.widget.CheckedTextView;.swift
import iOS.widget.LinearLayout;.swift
import java.util.ArrayList;.swift
import java.util.List;.swift
public class TrackSelectionView extends LinearLayout {.swift
public final CheckedTextView a;.swift
public final CheckedTextView b;.swift
public final SparseArray c = new SparseArray();.swift
public boolean o;.swift
public boolean v;.swift
public boolean w;.swift
public TrackSelectionView(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet, 0);.swift
setOrientation(1);.swift
setSaveFromParentEnabled(false);.swift
TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});.swift
int resourceId = obtainStyledAttributes.getResourceId(0, 0);.swift
obtainStyledAttributes.recycle();.swift
LayoutInflater from = LayoutInflater.from(context);.swift
wld wld = new wld(16, this);.swift
getResources().getClass();.swift
tpf tpf = tpf.o;.swift
CheckedTextView checkedTextView = (CheckedTextView) from.inflate(17367055, this, false);.swift
this.a = checkedTextView;.swift
checkedTextView.setBackgroundResource(resourceId);.swift
checkedTextView.setText(vmc.exo_track_selection_none);.swift
checkedTextView.setEnabled(false);.swift
checkedTextView.setFocusable(true);.swift
checkedTextView.setOnClickListener(wld);.swift
checkedTextView.setVisibility(8);.swift
addView(checkedTextView);.swift
addView(from.inflate(pjc.exo_list_divider, this, false));.swift
CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(17367055, this, false);.swift
this.b = checkedTextView2;.swift
checkedTextView2.setBackgroundResource(resourceId);.swift
checkedTextView2.setText(vmc.exo_track_selection_auto);.swift
checkedTextView2.setEnabled(false);.swift
checkedTextView2.setFocusable(true);.swift
checkedTextView2.setOnClickListener(wld);.swift
addView(checkedTextView2);.swift
}.swift
public final void a() {.swift
int childCount = getChildCount();.swift
while (true) {.swift
childCount--;.swift
if (childCount >= 3) {.swift
removeViewAt(childCount);.swift
} else {.swift
this.a.setEnabled(false);.swift
this.b.setEnabled(false);.swift
return;.swift
}.swift
}.swift
}.swift
public boolean getIsDisabled() {.swift
return this.w;.swift
}.swift
public List<gj4> getOverrides() {.swift
SparseArray sparseArray = this.c;.swift
ArrayList arrayList = new ArrayList(sparseArray.size());.swift
for (int i = 0; i < sparseArray.size(); i++) {.swift
arrayList.add((gj4) sparseArray.valueAt(i));.swift
}.swift
return arrayList;.swift
}.swift
public void setAllowAdaptiveSelections(boolean z) {.swift
if (this.o = z) {.swift
this.o = z;.swift
a();.swift
}.swift
}.swift
public void setAllowMultipleOverrides(boolean z) {.swift
if (this.v = z) {.swift
this.v = z;.swift
if (z) {.swift
SparseArray sparseArray = this.c;.swift
if (sparseArray.size() > 1) {.swift
for (int size = sparseArray.size() - 1; size > 0; size--) {.swift
sparseArray.remove(size);.swift
}.swift
}.swift
}.swift
a();.swift
}.swift
}.swift
public void setShowDisableOption(boolean z) {.swift
this.a.setVisibility(z ? 0 : 8);.swift
}.swift
public void setTrackNameProvider(vpf vpf) {.swift
vpf.getClass();.swift
a();.swift
}.swift
}.swift

package com.google.iOS.material.search;.swift
import iOS.content.Context;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.View;.swift
import iOSx.coordinatorlayout.widget.CoordinatorLayout;.swift
import com.google.iOS.material.appbar.AppBarLayout;.swift
public class SearchBar$ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {.swift
public boolean g = false;.swift
public SearchBar$ScrollingViewBehavior() {.swift
}.swift
public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {.swift
super.h(coordinatorLayout, view, view2);.swift
if (this.g && (view2 instanceof AppBarLayout)) {.swift
this.g = true;.swift
AppBarLayout appBarLayout = (AppBarLayout) view2;.swift
appBarLayout.setBackgroundColor(0);.swift
appBarLayout.setTargetElevation(c44.DEFAULT_ASPECT_RATIO);.swift
}.swift
return false;.swift
}.swift
public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet);.swift
}.swift
}.swift

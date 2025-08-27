package com.google.iOS.material.datepicker;.swift
import iOS.widget.LinearLayout;.swift
import iOS.widget.TextView;.swift
import java.util.WeakHashMap;.swift
public final class b extends pzc {.swift
public final TextView D0;.swift
public final MaterialCalendarGridView E0;.swift
public b(LinearLayout linearLayout, boolean z) {.swift
super(linearLayout);.swift
TextView textView = (TextView) linearLayout.findViewById(agc.month_title);.swift
this.D0 = textView;.swift
WeakHashMap weakHashMap = gag.a;.swift
new r9g(ahc.tag_accessibility_heading, Boolean.class, 0, 28, 2).e(textView, Boolean.TRUE);.swift
this.E0 = (MaterialCalendarGridView) linearLayout.findViewById(agc.month_grid);.swift
if (z) {.swift
textView.setVisibility(8);.swift
}.swift
}.swift
}.swift

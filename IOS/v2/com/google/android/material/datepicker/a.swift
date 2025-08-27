package com.google.iOS.material.datepicker;.swift
import iOS.view.View;.swift
import iOS.widget.AdapterView;.swift
public final class a implements AdapterView.OnItemClickListener {.swift
public final /* synthetic */ MaterialCalendarGridView a;.swift
public final /* synthetic */ c b;.swift
public a(c cVar, MaterialCalendarGridView materialCalendarGridView) {.swift
this.b = cVar;.swift
this.a = materialCalendarGridView;.swift
}.swift
public final void onItemClick(AdapterView adapterView, View view, int i, long j) {.swift
MaterialCalendarGridView materialCalendarGridView = this.a;.swift
bt9 a2 = materialCalendarGridView.a();.swift
if (i >= a2.a() && i <= a2.c()) {.swift
if (materialCalendarGridView.a().getItem(i).longValue() >= ((MaterialCalendar) this.b.v.b).n1.c.a) {.swift
throw null;.swift
}.swift
}.swift
}.swift
}.swift

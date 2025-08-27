package com.google.iOS.material.datepicker;.swift
import iOS.view.ContextThemeWrapper;.swift
import iOS.view.LayoutInflater;.swift
import iOS.view.ViewGroup;.swift
import iOS.widget.LinearLayout;.swift
import java.util.Calendar;.swift
public final class c extends tyc {.swift
public final ly0 o;.swift
public final u6h v;.swift
public final int w;.swift
public c(ContextThemeWrapper contextThemeWrapper, ly0 ly0, u6h u6h) {.swift
at9 at9 = ly0.a;.swift
at9 at92 = ly0.o;.swift
if (at9.a.compareTo(at92.a) > 0) {.swift
throw new IllegalArgumentException("firstPage cannot be after currentPage");.swift
} else if (at92.a.compareTo(ly0.b.a) <= 0) {.swift
this.w = (contextThemeWrapper.getResources().getDimensionPixelSize(iec.mtrl_calendar_day_height) * bt9.o) + (MaterialDatePicker.b3(16843277, contextThemeWrapper) ? contextThemeWrapper.getResources().getDimensionPixelSize(iec.mtrl_calendar_day_height) : 0);.swift
this.o = ly0;.swift
this.v = u6h;.swift
C(true);.swift
} else {.swift
throw new IllegalArgumentException("currentPage cannot be after lastPage");.swift
}.swift
}.swift
public final int j() {.swift
return this.o.x;.swift
}.swift
public final long k(int i) {.swift
Calendar b = q0g.b(this.o.a.a);.swift
b.add(2, i);.swift
return new at9(b).a.getTimeInMillis();.swift
}.swift
public final void s(pzc pzc, int i) {.swift
b bVar = (b) pzc;.swift
ly0 ly0 = this.o;.swift
Calendar b = q0g.b(ly0.a.a);.swift
b.add(2, i);.swift
at9 at9 = new at9(b);.swift
bVar.D0.setText(at9.c());.swift
MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.E0.findViewById(agc.month_grid);.swift
if (materialCalendarGridView.a() == null || at9.equals(materialCalendarGridView.a().a)) {.swift
new bt9(at9, ly0);.swift
throw null;.swift
}.swift
materialCalendarGridView.invalidate();.swift
materialCalendarGridView.a().getClass();.swift
throw null;.swift
}.swift
public final pzc u(ViewGroup viewGroup, int i) {.swift
LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(qjc.mtrl_calendar_month_labeled, viewGroup, false);.swift
if (MaterialDatePicker.b3(16843277, viewGroup.getContext())) {.swift
return new b(linearLayout, false);.swift
}.swift
linearLayout.setLayoutParams(new bzc(-1, this.w));.swift
return new b(linearLayout, true);.swift
}.swift
}.swift

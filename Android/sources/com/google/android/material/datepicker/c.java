package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.Calendar;

public final class c extends tyc {
    public final ly0 o;
    public final u6h v;
    public final int w;

    public c(ContextThemeWrapper contextThemeWrapper, ly0 ly0, u6h u6h) {
        at9 at9 = ly0.a;
        at9 at92 = ly0.o;
        if (at9.a.compareTo(at92.a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (at92.a.compareTo(ly0.b.a) <= 0) {
            this.w = (contextThemeWrapper.getResources().getDimensionPixelSize(iec.mtrl_calendar_day_height) * bt9.o) + (MaterialDatePicker.b3(16843277, contextThemeWrapper) ? contextThemeWrapper.getResources().getDimensionPixelSize(iec.mtrl_calendar_day_height) : 0);
            this.o = ly0;
            this.v = u6h;
            C(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    public final int j() {
        return this.o.x;
    }

    public final long k(int i) {
        Calendar b = q0g.b(this.o.a.a);
        b.add(2, i);
        return new at9(b).a.getTimeInMillis();
    }

    public final void s(pzc pzc, int i) {
        b bVar = (b) pzc;
        ly0 ly0 = this.o;
        Calendar b = q0g.b(ly0.a.a);
        b.add(2, i);
        at9 at9 = new at9(b);
        bVar.D0.setText(at9.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.E0.findViewById(agc.month_grid);
        if (materialCalendarGridView.a() == null || !at9.equals(materialCalendarGridView.a().a)) {
            new bt9(at9, ly0);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(qjc.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.b3(16843277, viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new bzc(-1, this.w));
        return new b(linearLayout, true);
    }
}

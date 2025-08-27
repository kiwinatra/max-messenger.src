package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

public final class a implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView a;
    public final /* synthetic */ c b;

    public a(c cVar, MaterialCalendarGridView materialCalendarGridView) {
        this.b = cVar;
        this.a = materialCalendarGridView;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.a;
        bt9 a2 = materialCalendarGridView.a();
        if (i >= a2.a() && i <= a2.c()) {
            if (materialCalendarGridView.a().getItem(i).longValue() >= ((MaterialCalendar) this.b.v.b).n1.c.a) {
                throw null;
            }
        }
    }
}

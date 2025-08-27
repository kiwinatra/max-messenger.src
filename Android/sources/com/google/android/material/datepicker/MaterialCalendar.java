package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

public final class MaterialCalendar<S> extends PickerFragment<S> {
    public int m1;
    public ly0 n1;
    public at9 o1;
    public int p1;
    public wsb q1;
    public RecyclerView r1;
    public RecyclerView s1;
    public View t1;
    public View u1;
    public View v1;
    public View w1;

    public final void T2(at9 at9) {
        c cVar = (c) this.s1.getAdapter();
        int d = cVar.o.a.d(at9);
        int d2 = d - cVar.o.a.d(this.o1);
        boolean z = false;
        boolean z2 = Math.abs(d2) > 3;
        if (d2 > 0) {
            z = true;
        }
        this.o1 = at9;
        if (z2 && z) {
            this.s1.z0(d - 3);
            this.s1.post(new tk0(this, d, 2));
        } else if (z2) {
            this.s1.z0(d + 3);
            this.s1.post(new tk0(this, d, 2));
        } else {
            this.s1.post(new tk0(this, d, 2));
        }
    }

    public final void U2(int i) {
        this.p1 = i;
        if (i == 2) {
            this.r1.getLayoutManager().x0(this.o1.c - ((krg) this.r1.getAdapter()).o.n1.a.c);
            this.v1.setVisibility(0);
            this.w1.setVisibility(8);
            this.t1.setVisibility(8);
            this.u1.setVisibility(8);
        } else if (i == 1) {
            this.v1.setVisibility(8);
            this.w1.setVisibility(0);
            this.t1.setVisibility(0);
            this.u1.setVisibility(0);
            T2(this.o1);
        }
    }

    public final void i2(Bundle bundle) {
        super.i2(bundle);
        if (bundle == null) {
            bundle = this.x;
        }
        this.m1 = bundle.getInt("THEME_RES_ID_KEY");
        wj6.s(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.n1 = (ly0) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        wj6.s(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.o1 = (at9) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        r84 r84;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(O1(), this.m1);
        this.q1 = new wsb((Context) contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        at9 at9 = this.n1.a;
        if (MaterialDatePicker.b3(16843277, contextThemeWrapper)) {
            i2 = qjc.mtrl_calendar_vertical;
            i = 1;
        } else {
            i2 = qjc.mtrl_calendar_horizontal;
            i = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        Resources resources = G2().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(iec.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(iec.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(iec.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(iec.mtrl_calendar_days_of_week_height);
        int i3 = bt9.o;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(iec.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(iec.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(iec.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(agc.mtrl_calendar_days_of_week);
        gag.j(gridView, new rg8(0));
        int i4 = this.n1.v;
        if (i4 <= 0) {
            r84 = new r84();
        }
        gridView.setAdapter(r84);
        gridView.setNumColumns(at9.o);
        gridView.setEnabled(false);
        this.s1 = (RecyclerView) inflate.findViewById(agc.mtrl_calendar_months);
        O1();
        this.s1.setLayoutManager(new sg8(this, i, i));
        this.s1.setTag("MONTHS_VIEW_GROUP_TAG");
        c cVar = new c(contextThemeWrapper, this.n1, new u6h(21, this));
        this.s1.setAdapter(cVar);
        int integer = contextThemeWrapper.getResources().getInteger(zic.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(agc.mtrl_calendar_year_selector_frame);
        this.r1 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.r1.setLayoutManager(new GridLayoutManager(integer, 1));
            this.r1.setAdapter(new krg(this));
            this.r1.j(new n27(this));
        }
        if (inflate.findViewById(agc.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(agc.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            gag.j(materialButton, new el0(4, this));
            View findViewById = inflate.findViewById(agc.month_navigation_previous);
            this.t1 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(agc.month_navigation_next);
            this.u1 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.v1 = inflate.findViewById(agc.mtrl_calendar_year_selector_frame);
            this.w1 = inflate.findViewById(agc.mtrl_calendar_day_selector_frame);
            U2(1);
            materialButton.setText(this.o1.c());
            this.s1.m(new tg8(this, cVar, materialButton));
            materialButton.setOnClickListener(new wld(5, this));
            this.u1.setOnClickListener(new qg8(this, cVar, 1));
            this.t1.setOnClickListener(new qg8(this, cVar, 0));
        }
        if (!MaterialDatePicker.b3(16843277, contextThemeWrapper)) {
            new hfe().a(this.s1);
        }
        this.s1.z0(cVar.o.a.d(this.o1));
        gag.j(this.s1, new rg8(1));
        return inflate;
    }

    public final void x2(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.m1);
        bundle.putParcelable("GRID_SELECTOR_KEY", (Parcelable) null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.n1);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.o1);
    }
}

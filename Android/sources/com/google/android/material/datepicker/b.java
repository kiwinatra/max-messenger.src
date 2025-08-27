package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.WeakHashMap;

public final class b extends pzc {
    public final TextView D0;
    public final MaterialCalendarGridView E0;

    public b(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(agc.month_title);
        this.D0 = textView;
        WeakHashMap weakHashMap = gag.a;
        new r9g(ahc.tag_accessibility_heading, Boolean.class, 0, 28, 2).e(textView, Boolean.TRUE);
        this.E0 = (MaterialCalendarGridView) linearLayout.findViewById(agc.month_grid);
        if (!z) {
            textView.setVisibility(8);
        }
    }
}

package defpackage;

import android.widget.BaseAdapter;
import java.util.Calendar;

/* renamed from: r84  reason: default package */
public final class r84 extends BaseAdapter {
    public final Calendar a;
    public final int b;
    public final int c;

    public r84() {
        Calendar d = q0g.d((Calendar) null);
        this.a = d;
        this.b = d.getMaximum(7);
        this.c = d.getFirstDayOfWeek();
    }

    public final int getCount() {
        return this.b;
    }

    public final Object getItem(int i) {
        int i2 = this.b;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.c;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    public final long getItemId(int i) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r4v6, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r3, android.view.View r4, android.view.ViewGroup r5) {
        /*
            r2 = this;
            r0 = r4
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r4 != 0) goto L_0x0017
            android.content.Context r4 = r5.getContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            int r0 = defpackage.qjc.mtrl_calendar_day_of_week
            r1 = 0
            android.view.View r4 = r4.inflate(r0, r5, r1)
            r0 = r4
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0017:
            int r4 = r2.c
            int r3 = r3 + r4
            int r4 = r2.b
            if (r3 <= r4) goto L_0x001f
            int r3 = r3 - r4
        L_0x001f:
            java.util.Calendar r2 = r2.a
            r4 = 7
            r2.set(r4, r3)
            android.content.res.Resources r3 = r0.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            java.util.Locale r3 = r3.locale
            r1 = 4
            java.lang.String r3 = r2.getDisplayName(r4, r1, r3)
            r0.setText(r3)
            android.content.Context r3 = r5.getContext()
            int r5 = defpackage.ymc.mtrl_picker_day_of_week_column_header
            java.lang.String r3 = r3.getString(r5)
            r5 = 2
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = r2.getDisplayName(r4, r5, r1)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.setContentDescription(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r84.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public r84(int i) {
        Calendar d = q0g.d((Calendar) null);
        this.a = d;
        this.b = d.getMaximum(7);
        this.c = i;
    }
}

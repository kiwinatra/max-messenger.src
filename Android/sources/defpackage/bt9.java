package defpackage;

import android.widget.BaseAdapter;
import java.util.Calendar;

/* renamed from: bt9  reason: default package */
public final class bt9 extends BaseAdapter {
    public static final int o = q0g.d((Calendar) null).getMaximum(4);
    public static final int v = ((q0g.d((Calendar) null).getMaximum(7) + q0g.d((Calendar) null).getMaximum(5)) - 1);
    public final at9 a;
    public wsb b;
    public final ly0 c;

    public bt9(at9 at9, ly0 ly0) {
        this.a = at9;
        this.c = ly0;
        throw null;
    }

    public final int a() {
        int i = this.c.v;
        at9 at9 = this.a;
        Calendar calendar = at9.a;
        int i2 = calendar.get(7);
        if (i <= 0) {
            i = calendar.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        return i3 < 0 ? i3 + at9.o : i3;
    }

    /* renamed from: b */
    public final Long getItem(int i) {
        if (i < a() || i > c()) {
            return null;
        }
        Calendar b2 = q0g.b(this.a.a);
        b2.set(5, (i - a()) + 1);
        return Long.valueOf(b2.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.a.v) - 1;
    }

    public final int getCount() {
        return v;
    }

    public final long getItemId(int i) {
        return (long) (i / this.a.o);
    }

    /* JADX WARNING: type inference failed for: r6v10, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            android.content.Context r0 = r7.getContext()
            wsb r1 = r4.b
            if (r1 != 0) goto L_0x000f
            wsb r1 = new wsb
            r1.<init>((android.content.Context) r0)
            r4.b = r1
        L_0x000f:
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r6 != 0) goto L_0x0026
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            int r0 = defpackage.qjc.mtrl_calendar_day
            android.view.View r6 = r6.inflate(r0, r7, r1)
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0026:
            int r6 = r4.a()
            int r6 = r5 - r6
            if (r6 < 0) goto L_0x005c
            at9 r7 = r4.a
            int r2 = r7.v
            if (r6 < r2) goto L_0x0035
            goto L_0x005c
        L_0x0035:
            r2 = 1
            int r6 = r6 + r2
            r0.setTag(r7)
            android.content.res.Resources r7 = r0.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            java.util.Locale r7 = r7.locale
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r3 = "%d"
            java.lang.String r6 = java.lang.String.format(r7, r3, r6)
            r0.setText(r6)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L_0x0064
        L_0x005c:
            r6 = 8
            r0.setVisibility(r6)
            r0.setEnabled(r1)
        L_0x0064:
            java.lang.Long r4 = r4.getItem(r5)
            if (r4 != 0) goto L_0x006b
            goto L_0x006d
        L_0x006b:
            if (r0 != 0) goto L_0x006e
        L_0x006d:
            return r0
        L_0x006e:
            r0.getContext()
            java.util.Calendar r4 = defpackage.q0g.c()
            r4.getTimeInMillis()
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bt9.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public final boolean hasStableIds() {
        return true;
    }
}

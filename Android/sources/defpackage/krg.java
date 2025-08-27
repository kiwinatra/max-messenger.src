package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Locale;

/* renamed from: krg  reason: default package */
public final class krg extends tyc {
    public final MaterialCalendar o;

    public krg(MaterialCalendar materialCalendar) {
        this.o = materialCalendar;
    }

    public final int j() {
        return this.o.n1.w;
    }

    public final void s(pzc pzc, int i) {
        MaterialCalendar materialCalendar = this.o;
        int i2 = materialCalendar.n1.a.c + i;
        String format = String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i2)});
        TextView textView = ((jrg) pzc).D0;
        textView.setText(format);
        Context context = textView.getContext();
        textView.setContentDescription(q0g.c().get(1) == i2 ? String.format(context.getString(ymc.mtrl_picker_navigate_to_current_year_description), new Object[]{Integer.valueOf(i2)}) : String.format(context.getString(ymc.mtrl_picker_navigate_to_year_description), new Object[]{Integer.valueOf(i2)}));
        wsb wsb = materialCalendar.q1;
        if (q0g.c().get(1) == i2) {
            Object obj = wsb.b;
        } else {
            Object obj2 = wsb.a;
        }
        throw null;
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        return new jrg((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(qjc.mtrl_calendar_year, viewGroup, false));
    }
}

package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.c;
import java.util.Calendar;

/* renamed from: qg8  reason: default package */
public final class qg8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ MaterialCalendar c;

    public /* synthetic */ qg8(MaterialCalendar materialCalendar, c cVar, int i) {
        this.a = i;
        this.c = materialCalendar;
        this.b = cVar;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                MaterialCalendar materialCalendar = this.c;
                int X0 = ((LinearLayoutManager) materialCalendar.s1.getLayoutManager()).X0() - 1;
                if (X0 >= 0) {
                    Calendar b2 = q0g.b(this.b.o.a.a);
                    b2.add(2, X0);
                    materialCalendar.T2(new at9(b2));
                    return;
                }
                return;
            default:
                MaterialCalendar materialCalendar2 = this.c;
                int V0 = ((LinearLayoutManager) materialCalendar2.s1.getLayoutManager()).V0() + 1;
                if (V0 < materialCalendar2.s1.getAdapter().j()) {
                    Calendar b3 = q0g.b(this.b.o.a.a);
                    b3.add(2, V0);
                    materialCalendar2.T2(new at9(b3));
                    return;
                }
                return;
        }
    }
}

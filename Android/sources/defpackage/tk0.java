package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.datepicker.MaterialCalendar;

/* renamed from: tk0  reason: default package */
public final class tk0 implements Runnable {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public /* synthetic */ tk0(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ((wk0) this.c).y.x(this.b, 4);
                return;
            case 1:
                vzg vzg = (vzg) ((syc) this.c).b;
                if (vzg != null) {
                    vzg.z(this.b);
                    return;
                }
                return;
            case 2:
                ((MaterialCalendar) this.c).s1.D0(this.b);
                return;
            case 3:
                ((SystemForegroundService) this.c).v.cancel(this.b);
                return;
            case 4:
                ((RecyclerView) this.c).D0(this.b);
                return;
            default:
                ((kvg) this.c).f(this.b);
                return;
        }
    }

    public tk0(RecyclerView recyclerView, int i) {
        this.a = 4;
        this.b = i;
        this.c = recyclerView;
    }

    public tk0(wk0 wk0) {
        this.a = 0;
        this.c = wk0;
        this.b = -1;
    }
}

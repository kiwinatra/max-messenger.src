package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;

/* renamed from: sg8  reason: default package */
public final class sg8 extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ MaterialCalendar F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sg8(MaterialCalendar materialCalendar, int i, int i2) {
        super(i, false);
        this.F = materialCalendar;
        this.E = i2;
    }

    public final void H0(RecyclerView recyclerView, int i) {
        d8a d8a = new d8a(recyclerView.getContext(), 1);
        d8a.a = i;
        I0(d8a);
    }

    public final void K0(lzc lzc, int[] iArr) {
        int i = this.E;
        MaterialCalendar materialCalendar = this.F;
        if (i == 0) {
            iArr[0] = materialCalendar.s1.getWidth();
            iArr[1] = materialCalendar.s1.getWidth();
            return;
        }
        iArr[0] = materialCalendar.s1.getHeight();
        iArr[1] = materialCalendar.s1.getHeight();
    }
}

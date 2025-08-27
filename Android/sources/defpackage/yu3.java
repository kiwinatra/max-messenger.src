package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: yu3  reason: default package */
public class yu3 extends jj0 {
    public final dm3 v;
    public final List w;
    public final int x;
    public final LayoutInflater y;
    public final boolean z = true;

    public yu3(Context context, dm3 dm3, List list, int i) {
        this.y = LayoutInflater.from(context);
        this.v = dm3;
        this.w = list;
        this.x = i;
    }

    /* renamed from: I */
    public void s(co3 co3, int i) {
        qs3 qs3 = (qs3) co3;
        vk3 vk3 = (vk3) this.w.get(i);
        String str = (String) this.o;
        int i2 = this.x;
        qs3.M(vk3, str, i2 == 5);
        if (i2 == 1) {
            pb pbVar = new pb(22, this, qs3);
            View view = qs3.a;
            ct.G(view, 300, pbVar);
            view.setOnLongClickListener(new yb1(4, this, qs3));
            ct.G(qs3.E0, 300, new xu3(this, qs3));
        }
    }

    /* renamed from: J */
    public co3 u(ViewGroup viewGroup, int i) {
        int y2 = tr1.y(this.x);
        return new qs3(this.y.inflate((y2 == 0 || y2 == 2 || y2 == 4) ? ujc.row_contact_avatar_left : y2 != 5 ? 0 : ujc.row_contact_black_list, viewGroup, false), this.v);
    }

    public int j() {
        List list;
        if (!this.z || (list = this.w) == null) {
            return 0;
        }
        return list.size();
    }

    public final long k(int i) {
        return ((vk3) this.w.get(i)).r();
    }

    public int l(int i) {
        return lic.contact_tam;
    }
}

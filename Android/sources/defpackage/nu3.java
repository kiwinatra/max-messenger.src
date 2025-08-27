package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: nu3  reason: default package */
public final class nu3 extends yu3 {
    public final Context X;
    public final int Y;

    public nu3(Context context, dm3 dm3, ArrayList arrayList, int i) {
        super(context, dm3, arrayList, 3);
        this.X = context;
        this.Y = i;
    }

    /* renamed from: I */
    public final void s(co3 co3, int i) {
        if (i == 0) {
            ((wm3) co3).D0.setText(this.X.getString(this.Y));
            return;
        }
        super.s(co3, i - 1);
    }

    /* renamed from: J */
    public final co3 u(ViewGroup viewGroup, int i) {
        if (i != lic.contact_divider) {
            return super.u(viewGroup, i);
        }
        return new wm3(this.y.inflate(ujc.row_contact_divider, viewGroup, false));
    }

    public final int j() {
        List list = this.w;
        if (list.isEmpty()) {
            return 0;
        }
        return list.size() + 1;
    }

    public final int l(int i) {
        return i == 0 ? lic.contact_divider : lic.contact_tam;
    }
}

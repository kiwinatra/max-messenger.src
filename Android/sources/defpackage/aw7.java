package defpackage;

import android.view.View;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: aw7  reason: default package */
public final class aw7 {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int s;
        int size = this.k.size();
        View view2 = null;
        int i2 = IntCompanionObject.MAX_VALUE;
        for (int i3 = 0; i3 < size; i3++) {
            View view3 = ((pzc) this.k.get(i3)).a;
            bzc bzc = (bzc) view3.getLayoutParams();
            if (view3 != view && !bzc.a.B() && (s = (bzc.a.s() - this.d) * this.e) >= 0 && s < i2) {
                view2 = view3;
                if (s == 0) {
                    break;
                }
                i2 = s;
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((bzc) view2.getLayoutParams()).a.s();
        }
    }

    public final View b(hzc hzc) {
        List list = this.k;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = ((pzc) this.k.get(i2)).a;
                bzc bzc = (bzc) view.getLayoutParams();
                if (!bzc.a.B() && this.d == bzc.a.s()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = hzc.j(this.d, LongCompanionObject.MAX_VALUE).a;
        this.d += this.e;
        return view2;
    }
}

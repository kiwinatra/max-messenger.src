package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: j62  reason: default package */
public final /* synthetic */ class j62 implements qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x62 b;

    public /* synthetic */ j62(x62 x62, int i) {
        this.a = i;
        this.b = x62;
    }

    public final void accept(Object obj) {
        w62 w62 = (w62) obj;
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList(w62.d());
                arrayList.remove(this.b);
                List list = w62.B;
                if (list != null) {
                    list.clear();
                }
                if (w62.B == null) {
                    w62.B = new ArrayList();
                }
                w62.B.addAll(arrayList);
                return;
            default:
                w62.a(this.b);
                return;
        }
    }
}

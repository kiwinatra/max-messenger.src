package defpackage;

import android.view.View;
import java.util.List;

/* renamed from: vqd  reason: default package */
public final /* synthetic */ class vqd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wqd b;

    public /* synthetic */ vqd(wqd wqd, int i) {
        this.a = i;
        this.b = wqd;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                wqd wqd = this.b;
                tqd tqd = wqd.G0;
                if (tqd != null) {
                    il8 il8 = wqd.D0;
                    il8.z.s(new sj8(tqd, ((List) il8.v0.getValue()).indexOf(tqd)));
                    return;
                }
                return;
            default:
                wqd wqd2 = this.b;
                tqd tqd2 = wqd2.G0;
                if (tqd2 != null) {
                    wqd2.D0.z.s(new oj8(tqd2));
                    return;
                }
                return;
        }
    }
}

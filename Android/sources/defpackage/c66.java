package defpackage;

import android.content.Context;
import android.view.View;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: c66  reason: default package */
public final class c66 extends kbe {
    public final /* synthetic */ int D0 = 1;
    public final Object E0;

    public c66(Context context, ExecutorService executorService, ms1 ms1) {
        super(new f66(context, executorService));
        this.E0 = ms1;
    }

    public final void M(lz7 lz7) {
        List list;
        switch (this.D0) {
            case 0:
                a66 a66 = (a66) lz7;
                View view = this.a;
                u56 u56 = view instanceof u56 ? (u56) view : null;
                if (u56 != null) {
                    u56.setIcon(cad.D0);
                    u56.setTitle(new igf(clc.chats_list_empty_state_title));
                    u56.M(u56.getContext().getString(clc.chats_list_empty_state_action), new xu3(9, (Object) this));
                    return;
                }
                return;
            default:
                a66 a662 = (a66) lz7;
                View view2 = this.a;
                h66 h66 = null;
                f66 f66 = view2 instanceof f66 ? (f66) view2 : null;
                if (f66 != null) {
                    if (a662 instanceof h66) {
                        h66 = (h66) a662;
                    }
                    if (h66 != null && (list = h66.a) != null) {
                        f66.setVisibility(list.isEmpty() ^ true ? 0 : 8);
                        f66.T1.G(list);
                        f66.setListener((d66) this.E0);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c66(android.content.Context r3, defpackage.uw2 r4) {
        /*
            r2 = this;
            r0 = 0
            r2.D0 = r0
            u56 r0 = new u56
            r1 = 0
            r0.<init>(r3, r1)
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r1 = -1
            r3.<init>(r1, r1)
            r0.setLayoutParams(r3)
            r2.<init>(r0)
            r2.E0 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c66.<init>(android.content.Context, uw2):void");
    }
}

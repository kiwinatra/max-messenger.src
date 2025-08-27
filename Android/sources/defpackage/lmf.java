package defpackage;

import android.view.View;

/* renamed from: lmf  reason: default package */
public final /* synthetic */ class lmf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v2b b;

    public /* synthetic */ lmf(v2b v2b, int i) {
        this.a = i;
        this.b = v2b;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((p2b) this.b).a.invoke(view);
                return;
            case 1:
                ((q2b) this.b).a.invoke(view);
                return;
            default:
                ((a3b) ((t2b) this.b).a).b.invoke(view);
                return;
        }
    }
}

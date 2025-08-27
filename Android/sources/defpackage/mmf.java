package defpackage;

import android.view.View;

/* renamed from: mmf  reason: default package */
public final /* synthetic */ class mmf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x2b b;

    public /* synthetic */ mmf(x2b x2b, int i) {
        this.a = i;
        this.b = x2b;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((w2b) this.b).a.invoke(view);
                return;
            case 1:
                ((r2b) this.b).a.invoke(view);
                return;
            default:
                ((q2b) this.b).a.invoke(view);
                return;
        }
    }
}

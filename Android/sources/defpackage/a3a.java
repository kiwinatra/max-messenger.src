package defpackage;

import android.view.View;

/* renamed from: a3a  reason: default package */
public final /* synthetic */ class a3a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e3a b;

    public /* synthetic */ a3a(e3a e3a, int i) {
        this.a = i;
        this.b = e3a;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.N(new k2a(13));
                return;
            default:
                this.b.N(new k2a(19));
                return;
        }
    }
}

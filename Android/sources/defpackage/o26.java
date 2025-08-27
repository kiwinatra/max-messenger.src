package defpackage;

import android.view.View;

/* renamed from: o26  reason: default package */
public final /* synthetic */ class o26 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p26 b;

    public /* synthetic */ o26(p26 p26, int i) {
        this.a = i;
        this.b = p26;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.D0.invoke();
                return;
            default:
                this.b.E0.invoke();
                return;
        }
    }
}

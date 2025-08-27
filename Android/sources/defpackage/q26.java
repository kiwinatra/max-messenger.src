package defpackage;

import android.view.View;

/* renamed from: q26  reason: default package */
public final /* synthetic */ class q26 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r26 b;
    public final /* synthetic */ s26 c;

    public /* synthetic */ q26(r26 r26, s26 s26, int i) {
        this.a = i;
        this.b = r26;
        this.c = s26;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                r26 r26 = this.b;
                r26.D0.invoke(r26.I0, this.c);
                return;
            default:
                this.b.E0.invoke(this.c);
                return;
        }
    }
}

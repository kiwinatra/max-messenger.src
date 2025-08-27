package defpackage;

import android.view.View;

/* renamed from: jqd  reason: default package */
public final /* synthetic */ class jqd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ iqd b;
    public final /* synthetic */ kqd c;

    public /* synthetic */ jqd(iqd iqd, kqd kqd, int i) {
        this.a = i;
        this.b = iqd;
        this.c = kqd;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                iqd iqd = this.b;
                if (iqd.c) {
                    this.c.E0.invoke(iqd);
                    return;
                }
                return;
            default:
                iqd iqd2 = this.b;
                if (iqd2.c) {
                    this.c.E0.invoke(iqd2);
                    return;
                }
                return;
        }
    }
}

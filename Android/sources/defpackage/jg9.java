package defpackage;

import android.view.View;

/* renamed from: jg9  reason: default package */
public final /* synthetic */ class jg9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ kg9 b;

    public /* synthetic */ jg9(kg9 kg9, int i) {
        this.a = i;
        this.b = kg9;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                kg9 kg9 = this.b;
                if (kg9.z0 != null) {
                    gg9 gg9 = kg9.w;
                    gg9.getViewMessage();
                    gg9.getContent();
                    return;
                }
                return;
            case 1:
                kg9 kg92 = this.b;
                if (kg92.z0 != null) {
                    gg9 gg92 = kg92.w;
                    gg92.getViewMessage();
                    gg92.getContent();
                    return;
                }
                return;
            default:
                t3a t3a = this.b.z0;
                return;
        }
    }

    public /* synthetic */ jg9(kg9 kg9, a89 a89) {
        this.a = 2;
        this.b = kg9;
    }
}

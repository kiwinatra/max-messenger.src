package defpackage;

import android.view.View;

/* renamed from: zj1  reason: default package */
public final /* synthetic */ class zj1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bk1 b;

    public /* synthetic */ zj1(bk1 bk1, int i) {
        this.a = i;
        this.b = bk1;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ak1 ak1 = this.b.E0;
                if (ak1 != null) {
                    ak1.c();
                    return;
                }
                return;
            case 1:
                ak1 ak12 = this.b.E0;
                if (ak12 != null) {
                    ak12.b();
                    return;
                }
                return;
            case 2:
                ak1 ak13 = this.b.E0;
                if (ak13 != null) {
                    ak13.a();
                    return;
                }
                return;
            default:
                ak1 ak14 = this.b.E0;
                if (ak14 != null) {
                    ak14.h();
                    return;
                }
                return;
        }
    }
}

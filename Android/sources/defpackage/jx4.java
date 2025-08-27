package defpackage;

import android.widget.AutoCompleteTextView;

/* renamed from: jx4  reason: default package */
public final /* synthetic */ class jx4 implements AutoCompleteTextView.OnDismissListener {
    public final /* synthetic */ kx4 a;

    public /* synthetic */ jx4(kx4 kx4) {
        this.a = kx4;
    }

    public final void onDismiss() {
        kx4 kx4 = this.a;
        kx4.m = true;
        kx4.o = System.currentTimeMillis();
        kx4.t(false);
    }
}

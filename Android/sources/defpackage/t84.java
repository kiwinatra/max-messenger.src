package defpackage;

import android.view.View;

/* renamed from: t84  reason: default package */
public final class t84 extends a94 implements View.OnClickListener {
    public final View.OnClickListener o;

    public /* synthetic */ t84(View.OnClickListener onClickListener, int i) {
        this(300, onClickListener);
    }

    public final void onClick(View view) {
        b(view, new fpg(1, this, view));
    }

    public t84(long j, View.OnClickListener onClickListener) {
        super(j);
        this.o = onClickListener;
    }
}

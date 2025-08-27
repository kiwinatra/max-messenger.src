package defpackage;

import android.view.View;
import kotlin.Unit;

/* renamed from: p9g  reason: default package */
public final class p9g extends kd8 implements View.OnClickListener {
    public final View b;
    public final cla c;

    public p9g(View view, cla cla) {
        this.b = view;
        this.c = cla;
    }

    public final void a() {
        this.b.setOnClickListener((View.OnClickListener) null);
    }

    public final void onClick(View view) {
        if (!this.a.get()) {
            this.c.d(Unit.INSTANCE);
        }
    }
}

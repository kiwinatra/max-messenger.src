package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: t3  reason: default package */
public final class t3 extends ClickableSpan {
    public final int a;
    public final g4 b;
    public final int c;

    public t3(int i, g4 g4Var, int i2) {
        this.a = i;
        this.b = g4Var;
        this.c = i2;
    }

    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.a.performAction(this.c, bundle);
    }
}

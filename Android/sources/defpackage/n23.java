package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: n23  reason: default package */
public abstract class n23 extends v3 {
    public final a4 d;

    public n23(Context context, int i) {
        this.d = new a4(16, context.getString(i));
    }

    public void d(View view, g4 g4Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, g4Var.a);
        g4Var.b(this.d);
    }
}

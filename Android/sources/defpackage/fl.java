package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: fl  reason: default package */
public final class fl {
    public final View a;
    public final Function2 b;
    public final Function1 c;
    public boolean d;
    public hk e;
    public boolean f;

    public fl(View view, r6 r6Var, l lVar) {
        this.a = view;
        this.b = r6Var;
        this.c = lVar;
        view.addOnAttachStateChangeListener(new el(0, this));
    }
}

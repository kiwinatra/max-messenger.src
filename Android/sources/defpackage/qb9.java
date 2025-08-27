package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* renamed from: qb9  reason: default package */
public final /* synthetic */ class qb9 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ qb9(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    public final void onFocusChange(View view, boolean z) {
        switch (this.a) {
            case 0:
                this.b.invoke(Boolean.valueOf(z));
                return;
            default:
                this.b.invoke(Boolean.valueOf(z));
                return;
        }
    }
}

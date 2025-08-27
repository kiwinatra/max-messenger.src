package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* renamed from: ib2  reason: default package */
public final /* synthetic */ class ib2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ j29 c;

    public /* synthetic */ ib2(Function1 function1, j29 j29, int i) {
        this.a = i;
        this.b = function1;
        this.c = j29;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.invoke(this.c);
                return;
            case 1:
                this.b.invoke(this.c);
                return;
            default:
                this.b.invoke(this.c);
                return;
        }
    }
}

package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* renamed from: m50  reason: default package */
public final /* synthetic */ class m50 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q50 b;
    public final /* synthetic */ l50 c;

    public /* synthetic */ m50(q50 q50, l50 l50, int i) {
        this.a = i;
        this.b = q50;
        this.c = l50;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Function1 function1 = this.b.a;
                l50 l50 = this.c;
                function1.invoke(new oi9(l50.b, l50));
                return;
            default:
                Function1 function12 = this.b.a;
                l50 l502 = this.c;
                function12.invoke(new oi9(l502.b, l502));
                return;
        }
    }
}

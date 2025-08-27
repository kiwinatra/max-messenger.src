package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* renamed from: ll3  reason: default package */
public final /* synthetic */ class ll3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ ll3(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.invoke(Boolean.FALSE);
                return;
            default:
                this.b.invoke(Boolean.TRUE);
                return;
        }
    }
}

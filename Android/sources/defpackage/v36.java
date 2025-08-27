package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* renamed from: v36  reason: default package */
public final /* synthetic */ class v36 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ g0g c;

    public /* synthetic */ v36(Function1 function1, g0g g0g, int i) {
        this.a = i;
        this.b = function1;
        this.c = g0g;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.invoke(this.c);
                return;
            default:
                this.b.invoke(this.c);
                return;
        }
    }
}

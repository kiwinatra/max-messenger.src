package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* renamed from: sg5  reason: default package */
public final /* synthetic */ class sg5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tg5 b;
    public final /* synthetic */ rg5 c;

    public /* synthetic */ sg5(tg5 tg5, rg5 rg5, int i) {
        this.a = i;
        this.b = tg5;
        this.c = rg5;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Function1 function1 = this.b.D0;
                if (function1 != null) {
                    function1.invoke(Long.valueOf(this.c.a));
                    return;
                }
                return;
            case 1:
                Function1 function12 = this.b.E0;
                if (function12 != null) {
                    function12.invoke(Long.valueOf(this.c.a));
                    return;
                }
                return;
            case 2:
                Function1 function13 = this.b.D0;
                if (function13 != null) {
                    function13.invoke(Long.valueOf(this.c.a));
                    return;
                }
                return;
            default:
                Function1 function14 = this.b.E0;
                if (function14 != null) {
                    function14.invoke(Long.valueOf(this.c.a));
                    return;
                }
                return;
        }
    }
}

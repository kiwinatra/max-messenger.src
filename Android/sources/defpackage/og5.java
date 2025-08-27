package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* renamed from: og5  reason: default package */
public final /* synthetic */ class og5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ og5(Object obj, Function1 function1, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = function1;
        this.o = obj2;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                rg5 rg5 = (rg5) this.c;
                boolean z = rg5.x;
                long j = rg5.a;
                if (z) {
                    this.b.invoke(Long.valueOf(j));
                    return;
                }
                ((Function1) this.o).invoke(Long.valueOf(j));
                return;
            default:
                k3b.d((k3b) this.c, this.b, (e3b) this.o);
                return;
        }
    }
}

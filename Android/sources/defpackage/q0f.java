package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: q0f  reason: default package */
public final /* synthetic */ class q0f implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0f b;

    public /* synthetic */ q0f(v0f v0f, int i) {
        this.a = i;
        this.b = v0f;
    }

    public final Object invoke(Object obj, Object obj2) {
        View view = (View) obj;
        o0f o0f = (o0f) obj2;
        switch (this.a) {
            case 0:
                Function2 function2 = this.b.R0;
                if (function2 != null) {
                    function2.invoke(view, o0f);
                }
                return Unit.INSTANCE;
            default:
                Function2 function22 = this.b.R0;
                if (function22 != null) {
                    function22.invoke(view, o0f);
                }
                return Unit.INSTANCE;
        }
    }
}

package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: t16  reason: default package */
public final /* synthetic */ class t16 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v16 b;

    public /* synthetic */ t16(v16 v16, int i) {
        this.a = i;
        this.b = v16;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                Function0 function0 = this.b.h;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            default:
                Function0 function02 = this.b.i;
                if (function02 != null) {
                    function02.invoke();
                }
                return Unit.INSTANCE;
        }
    }
}

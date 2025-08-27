package defpackage;

import kotlin.jvm.functions.Function1;

/* renamed from: vsf  reason: default package */
public final class vsf extends ysf {
    public boolean b;
    public final /* synthetic */ xsf c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vsf(xsf xsf, Object obj) {
        super(obj);
        this.c = xsf;
        zsf zsf = xsf.b;
    }

    public final Object a() {
        boolean z = this.b;
        xsf xsf = this.c;
        Object obj = this.a;
        if (z) {
            Function1 function1 = xsf.b.e;
            if (function1 == null) {
                return null;
            }
            function1.invoke(obj);
            return null;
        }
        this.b = true;
        Function1 function12 = xsf.b.d;
        if (function12 != null) {
            Boolean bool = (Boolean) function12.invoke(obj);
        }
        return obj;
    }
}

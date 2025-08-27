package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: l78  reason: default package */
public final /* synthetic */ class l78 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p78 b;

    public /* synthetic */ l78(p78 p78, int i) {
        this.a = i;
        this.b = p78;
    }

    public final Object invoke() {
        p78 p78 = this.b;
        switch (this.a) {
            case 0:
                ThreadLocal threadLocal = p78.i;
                String str = p78.d;
                String str2 = p78.b;
                if (str2 == null) {
                    str2 = "";
                }
                return ct.c(str, StringsKt__StringsKt.substringAfterLast$default(str2, ".", (String) null, 2, (Object) null));
            default:
                ThreadLocal threadLocal2 = p78.i;
                return ct.c(p78.d, p78.b);
        }
    }
}

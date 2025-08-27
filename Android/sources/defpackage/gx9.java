package defpackage;

import kotlin.jvm.functions.Function1;
import one.me.messages.list.loader.MessageModel;

/* renamed from: gx9  reason: default package */
public final /* synthetic */ class gx9 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ix9 b;

    public /* synthetic */ gx9(ix9 ix9, int i) {
        this.a = i;
        this.b = ix9;
    }

    public final Object invoke(Object obj) {
        MessageModel N;
        int i = this.a;
        int intValue = ((Integer) obj).intValue();
        switch (i) {
            case 0:
                ix9 ix9 = this.b;
                boolean z = false;
                if (ix9.b.j() > intValue && intValue >= 0 && (N = ix9.b.N(intValue)) != null) {
                    z = ((ww9) ix9.c.g.a.getValue()).a.contains(Long.valueOf(N.a));
                }
                return Boolean.valueOf(z);
            case 1:
                MessageModel N2 = this.b.b.N(intValue);
                boolean z2 = false;
                if (N2 != null && N2.A0 && N2.w0 == null) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            default:
                MessageModel N3 = this.b.b.N(intValue);
                boolean z3 = false;
                if (N3 != null) {
                    z3 = !ig9.a(N3.F0, 0);
                }
                return Boolean.valueOf(z3);
        }
    }
}

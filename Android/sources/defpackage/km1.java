package defpackage;

import kotlin.jvm.functions.Function1;

/* renamed from: km1  reason: default package */
public final /* synthetic */ class km1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tm1 b;
    public final /* synthetic */ CharSequence c;

    public /* synthetic */ km1(tm1 tm1, CharSequence charSequence, int i) {
        this.a = i;
        this.b = tm1;
        this.c = charSequence;
    }

    public final Object invoke(Object obj) {
        int i = this.a;
        ((Boolean) obj).getClass();
        tm1 tm1 = this.b;
        CharSequence charSequence = this.c;
        switch (i) {
            case 0:
                return tm1.T(tm1, charSequence);
            case 1:
                return tm1.L(tm1, charSequence);
            default:
                return tm1.N(tm1, charSequence);
        }
    }
}

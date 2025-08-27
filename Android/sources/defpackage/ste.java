package defpackage;

import java.util.function.UnaryOperator;

/* renamed from: ste  reason: default package */
public final /* synthetic */ class ste implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ ste(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                pte pte = (pte) obj;
                return new pte(this.b, 2);
            default:
                eue eue = (eue) obj;
                return new eue(this.b, 1);
        }
    }
}

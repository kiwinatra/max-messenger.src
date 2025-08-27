package defpackage;

import java.util.function.UnaryOperator;

/* renamed from: qte  reason: default package */
public final /* synthetic */ class qte implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ wse b;

    public /* synthetic */ qte(wse wse, int i) {
        this.a = i;
        this.b = wse;
    }

    public final Object apply(Object obj) {
        pte pte = (pte) obj;
        switch (this.a) {
            case 0:
                return new pte(pte.a, this.b.b);
            default:
                return new pte(pte.a, this.b.b);
        }
    }
}

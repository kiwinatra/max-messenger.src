package defpackage;

import java.util.function.UnaryOperator;

/* renamed from: aue  reason: default package */
public final /* synthetic */ class aue implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ xse b;

    public /* synthetic */ aue(xse xse, int i) {
        this.a = i;
        this.b = xse;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                Long l = (Long) obj;
                return Long.valueOf(this.b.b);
            case 1:
                return new eue(this.b.b, ((eue) obj).b);
            default:
                return new eue(this.b.b, ((eue) obj).b);
        }
    }
}

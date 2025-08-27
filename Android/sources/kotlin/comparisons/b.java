package kotlin.comparisons;

import java.util.Comparator;

public final /* synthetic */ class b implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Comparator b;
    public final /* synthetic */ Comparator c;

    public /* synthetic */ b(Comparator comparator, Comparator comparator2, int i) {
        this.a = i;
        this.b = comparator;
        this.c = comparator2;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ComparisonsKt__ComparisonsKt.thenDescending$lambda$2$ComparisonsKt__ComparisonsKt(this.b, this.c, obj, obj2);
            default:
                return ComparisonsKt__ComparisonsKt.then$lambda$1$ComparisonsKt__ComparisonsKt(this.b, this.c, obj, obj2);
        }
    }
}

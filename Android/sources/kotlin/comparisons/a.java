package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class a implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return ComparisonsKt__ComparisonsKt.nullsLast$lambda$4$ComparisonsKt__ComparisonsKt((Comparator) obj3, obj, obj2);
            case 1:
                return ComparisonsKt__ComparisonsKt.nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt((Comparator) obj3, obj, obj2);
            default:
                return ComparisonsKt__ComparisonsKt.compareBy$lambda$0$ComparisonsKt__ComparisonsKt((Function1[]) obj3, obj, obj2);
        }
    }
}

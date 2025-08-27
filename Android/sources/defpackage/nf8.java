package defpackage;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.time.Duration;

/* renamed from: nf8  reason: default package */
public final class nf8 implements Comparator {
    public final /* synthetic */ int a;
    public final long b;

    public /* synthetic */ nf8(long j, int i) {
        this.a = i;
        this.b = j;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                pf8 pf8 = (pf8) obj2;
                return ((pf8) obj).c == this.b ? -1 : 0;
            default:
                long j = ((yeg) obj2).c;
                long j2 = this.b;
                return ComparisonsKt.compareValues(Duration.m1351boximpl(Duration.m1388minusLRDsOJo(j2, j)), Duration.m1351boximpl(Duration.m1388minusLRDsOJo(j2, ((yeg) obj).c)));
        }
    }
}

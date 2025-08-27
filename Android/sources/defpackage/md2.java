package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.UnaryOperator;

/* renamed from: md2  reason: default package */
public final /* synthetic */ class md2 implements UnaryOperator {
    public final /* synthetic */ int a;

    public /* synthetic */ md2(int i) {
        this.a = i;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                ld2 ld2 = (ld2) obj;
                return null;
            case 1:
                ld2 ld22 = (ld2) obj;
                if (ld22 == null) {
                    return null;
                }
                return new ld2(ld22.a, ld22.b, ld22.c, ld22.d, true);
            case 2:
                Set set = (Set) obj;
                return new LinkedHashSet();
            case 3:
                Set set2 = (Set) obj;
                return new LinkedHashSet();
            case 4:
                jz9 jz9 = (jz9) obj;
                return xa8.a();
            case 5:
                Set set3 = (Set) obj;
                return new LinkedHashSet();
            case 6:
                jz9 jz92 = (jz9) obj;
                return xa8.a();
            case 7:
                String str = (String) obj;
                return String.valueOf(System.currentTimeMillis());
            default:
                pte pte = (pte) obj;
                return new pte((String) null, 3);
        }
    }
}

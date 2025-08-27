package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntriesKt;

/* renamed from: b77  reason: default package */
public enum b77 {
    b(CollectionsKt.listOf(Double.valueOf(Math.toRadians(135.0d)), Double.valueOf(Math.toRadians(180.0d)), Double.valueOf(Math.toRadians(225.0d)))),
    c(CollectionsKt.listOf(Double.valueOf(Math.toRadians(45.0d)), Double.valueOf(Math.toRadians(0.0d)), Double.valueOf(Math.toRadians(315.0d)))),
    o(CollectionsKt.emptyList());
    
    public final List a;

    static {
        b77[] b77Arr;
        w = EnumEntriesKt.enumEntries((E[]) b77Arr);
    }

    /* access modifiers changed from: public */
    b77(List list) {
        this.a = list;
    }
}

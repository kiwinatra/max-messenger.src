package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* renamed from: i16  reason: default package */
public final class i16 extends d25 {
    public static final i16 c;

    /* JADX WARNING: type inference failed for: r0v0, types: [d25, i16] */
    static {
        String[] strArr = tf6.c;
        ArrayList arrayList = new ArrayList(71);
        int i = 0;
        int i2 = 0;
        while (i < 71) {
            String str = strArr[i];
            arrayList.add(new e15(i2, str, CollectionsKt.listOf(str)));
            i++;
            i2++;
        }
        c = new d25(nad.o0, arrayList);
    }
}

package defpackage;

import java.util.Set;
import kotlin.collections.SetsKt;

/* renamed from: rj7  reason: default package */
public final class rj7 {
    public final qj7 a;
    public final int[] b;
    public final String[] c;
    public final Set d;

    public rj7(qj7 qj7, int[] iArr, String[] strArr) {
        this.a = qj7;
        this.b = iArr;
        this.c = strArr;
        this.d = (strArr.length == 0) ^ true ? SetsKt.setOf(strArr[0]) : SetsKt.emptySet();
        if (iArr.length != strArr.length) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final void a(Set set) {
        Set set2;
        int[] iArr = this.b;
        int length = iArr.length;
        if (length != 0) {
            int i = 0;
            if (length != 1) {
                Set createSetBuilder = SetsKt.createSetBuilder();
                int length2 = iArr.length;
                int i2 = 0;
                while (i < length2) {
                    int i3 = i2 + 1;
                    if (set.contains(Integer.valueOf(iArr[i]))) {
                        createSetBuilder.add(this.c[i2]);
                    }
                    i++;
                    i2 = i3;
                }
                set2 = SetsKt.build(createSetBuilder);
            } else {
                set2 = set.contains(Integer.valueOf(iArr[0])) ? this.d : SetsKt.emptySet();
            }
        } else {
            set2 = SetsKt.emptySet();
        }
        if (!set2.isEmpty()) {
            this.a.a(set2);
        }
    }
}

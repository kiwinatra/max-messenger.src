package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: r9  reason: default package */
public final class r9 {
    public final int a;
    public final int b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;

    public r9(int i, int i2, ArrayList arrayList, List list, List list2, List list3) {
        this.a = i;
        this.b = i2;
        this.c = Collections.unmodifiableList(arrayList);
        this.d = Collections.unmodifiableList(list);
        this.e = Collections.unmodifiableList(list2);
        this.f = Collections.unmodifiableList(list3);
    }
}

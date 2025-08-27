package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: l17  reason: default package */
public abstract class l17 implements so5 {
    public final String a;
    public final List b;
    public final boolean c;

    public l17(String str, boolean z, List list) {
        this.a = str;
        this.b = Collections.unmodifiableList(list);
        this.c = z;
    }
}

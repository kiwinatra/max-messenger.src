package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: m17  reason: default package */
public abstract class m17 implements to5 {
    public final String a;
    public final List b;
    public final boolean c;

    public m17(String str, boolean z, List list) {
        this.a = str;
        this.b = Collections.unmodifiableList(list);
        this.c = z;
    }
}

package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: j72  reason: default package */
public final class j72 {
    public final String a;
    public final String b;
    public final List c;
    public final long d;
    public final boolean e;

    public j72(j8 j8Var) {
        this.a = (String) j8Var.c;
        this.b = (String) j8Var.d;
        List list = (List) j8Var.e;
        this.c = list != null ? Collections.unmodifiableList(list) : Collections.emptyList();
        this.d = j8Var.a;
        this.e = j8Var.b;
    }
}

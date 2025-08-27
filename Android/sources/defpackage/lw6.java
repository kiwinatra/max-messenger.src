package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: lw6  reason: default package */
public final class lw6 {
    public final Set a;
    public final String b;

    public lw6(HashSet hashSet, String str) {
        this.a = hashSet == null ? Collections.emptySet() : hashSet;
        this.b = str;
    }
}

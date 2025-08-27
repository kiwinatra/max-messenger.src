package defpackage;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/* renamed from: qa5  reason: default package */
public final class qa5 implements Enumeration {
    public final Enumeration a;

    public qa5(ra5 ra5) {
        this.a = Collections.enumeration(ra5.a);
    }

    public final boolean hasMoreElements() {
        return this.a.hasMoreElements();
    }

    public final Object nextElement() {
        return new HashMap((Map) this.a.nextElement());
    }
}

package defpackage;

import java.lang.reflect.Method;

/* renamed from: l13  reason: default package */
public final class l13 {
    public final int a;
    public final Method b;

    public l13(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l13)) {
            return false;
        }
        l13 l13 = (l13) obj;
        return this.a == l13.a && this.b.getName().equals(l13.b.getName());
    }

    public final int hashCode() {
        return this.b.getName().hashCode() + (this.a * 31);
    }
}

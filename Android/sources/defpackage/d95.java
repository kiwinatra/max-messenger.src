package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: d95  reason: default package */
public final class d95 {
    public final Object a;
    public final Method b;
    public final int c;
    public boolean d = true;

    public d95(Object obj, Method method) {
        if (obj == null) {
            throw new NullPointerException("EventProducer target cannot be null.");
        } else if (method != null) {
            this.a = obj;
            this.b = method;
            method.setAccessible(true);
            this.c = obj.hashCode() + ((method.hashCode() + 31) * 31);
        } else {
            throw new NullPointerException("EventProducer method cannot be null.");
        }
    }

    public final Object a() {
        if (this.d) {
            try {
                return this.b.invoke(this.a, (Object[]) null);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof Error) {
                    throw ((Error) e2.getCause());
                }
                throw e2;
            }
        } else {
            throw new IllegalStateException(toString() + " has been invalidated and can no longer produce events.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d95.class != obj.getClass()) {
            return false;
        }
        d95 d95 = (d95) obj;
        return this.b.equals(d95.b) && this.a == d95.a;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return "[EventProducer " + this.b + "]";
    }
}

package defpackage;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* renamed from: r3d  reason: default package */
public final class r3d implements Lazy {
    public Function0 a;
    public Object b;

    public final Object getValue() {
        if (this.b == v9a.x) {
            this.b = this.a.invoke();
        }
        return this.b;
    }

    public final boolean isInitialized() {
        return this.b != v9a.x;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

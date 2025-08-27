package defpackage;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: q3d  reason: default package */
public final class q3d implements Lazy {
    public final Function0 a;
    public volatile Object b = u9a.x;
    public final Object c = this;

    public q3d(Function0 function0) {
        this.a = function0;
    }

    public final void a() {
        synchronized (this.c) {
            this.b = u9a.x;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final Object getValue() {
        Object obj;
        Object obj2 = this.b;
        u9a u9a = u9a.x;
        if (obj2 != u9a) {
            return obj2;
        }
        synchronized (this.c) {
            obj = this.b;
            if (obj == u9a) {
                obj = this.a.invoke();
                this.b = obj;
            }
        }
        return obj;
    }

    public final boolean isInitialized() {
        return this.b != u9a.x;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

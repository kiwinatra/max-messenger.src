package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;

/* renamed from: yag  reason: default package */
public abstract class yag {
    public final rx3 b = new rx3();

    public final void f(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        rx3 rx3 = this.b;
        if (rx3 == null) {
            return;
        }
        if (rx3.a) {
            rx3.b(autoCloseable);
            return;
        }
        synchronized (((ekd) rx3.b)) {
            autoCloseable2 = (AutoCloseable) ((LinkedHashMap) rx3.c).put(str, autoCloseable);
        }
        rx3.b(autoCloseable2);
    }

    public final void g() {
        rx3 rx3 = this.b;
        if (rx3 != null && !rx3.a) {
            rx3.a = true;
            synchronized (((ekd) rx3.b)) {
                try {
                    for (AutoCloseable b2 : ((LinkedHashMap) rx3.c).values()) {
                        rx3.b(b2);
                    }
                    for (AutoCloseable b3 : (LinkedHashSet) rx3.d) {
                        rx3.b(b3);
                    }
                    ((LinkedHashSet) rx3.d).clear();
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        i();
    }

    public final AutoCloseable h(String str) {
        AutoCloseable autoCloseable;
        rx3 rx3 = this.b;
        if (rx3 == null) {
            return null;
        }
        synchronized (((ekd) rx3.b)) {
            autoCloseable = (AutoCloseable) ((LinkedHashMap) rx3.c).get(str);
        }
        return autoCloseable;
    }

    public void i() {
    }
}

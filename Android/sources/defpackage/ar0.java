package defpackage;

import java.io.Serializable;

/* renamed from: ar0  reason: default package */
public final class ar0 implements Serializable {
    public final boolean a;
    public final boolean b;

    public ar0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final String toString() {
        return "{hasBots=" + this.a + ", suspendedBot=" + this.b + "}";
    }
}

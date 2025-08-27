package defpackage;

import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: bc7  reason: default package */
public final class bc7 implements tac {
    public static final bc7 d;
    public int a;
    public boolean b;
    public boolean c;

    /* JADX WARNING: type inference failed for: r0v0, types: [bc7, java.lang.Object] */
    static {
        ? obj = new Object();
        obj.a = IntCompanionObject.MAX_VALUE;
        obj.b = true;
        obj.c = true;
        d = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bc7)) {
            return false;
        }
        bc7 bc7 = (bc7) obj;
        return this.a == bc7.a && this.b == bc7.b && this.c == bc7.c;
    }

    public final int hashCode() {
        int i = 0;
        int i2 = (this.b ? 4194304 : 0) ^ this.a;
        if (this.c) {
            i = 8388608;
        }
        return i2 ^ i;
    }
}

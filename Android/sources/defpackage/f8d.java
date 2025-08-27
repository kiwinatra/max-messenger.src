package defpackage;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.StringCompanionObject;

/* renamed from: f8d  reason: default package */
public final class f8d {
    public static final f8d b = new f8d(false);
    public static final f8d c = new f8d(true);
    public final boolean a;

    public f8d(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f8d)) {
            return false;
        }
        f8d f8d = (f8d) obj;
        f8d.getClass();
        return this.a == f8d.a;
    }

    public final int hashCode() {
        Integer num = -1;
        Boolean valueOf = Boolean.valueOf(this.a);
        return ((num.hashCode() + 31) * 31) + valueOf.hashCode();
    }

    public final String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format((Locale) null, "%d defer:%b", Arrays.copyOf(new Object[]{-1, Boolean.valueOf(this.a)}, 2));
    }
}

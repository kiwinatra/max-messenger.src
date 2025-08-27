package defpackage;

import java.util.Arrays;

/* renamed from: oef  reason: default package */
public final class oef implements pl {
    public static final oef b = new oef((String) null);
    public final String a;

    public /* synthetic */ oef(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oef)) {
            return false;
        }
        return kne.o(this.a, ((oef) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}

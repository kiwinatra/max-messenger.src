package defpackage;

import java.util.Objects;

/* renamed from: qm3  reason: default package */
public final class qm3 {
    public final String a;

    public qm3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qm3) {
            return Objects.equals(this.a, ((qm3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return wj6.n(new StringBuilder("MenuButton{text='"), this.a, "'}");
    }
}

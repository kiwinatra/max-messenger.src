package defpackage;

/* renamed from: l16  reason: default package */
public final class l16 implements lz7 {
    public final int a;

    public l16(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l16) && this.a == ((l16) obj).a;
    }

    public final long getItemId() {
        return 9223372036854775806L;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final int i() {
        return this.a;
    }

    public final String toString() {
        return wj6.l(new StringBuilder("FolderMemberAddItem(viewType="), this.a, ")");
    }
}

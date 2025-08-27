package defpackage;

/* renamed from: yqd  reason: default package */
public final class yqd {
    public final long a;
    public final erd b;

    public yqd(long j, erd erd) {
        this.a = j;
        this.b = erd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqd)) {
            return false;
        }
        yqd yqd = (yqd) obj;
        return this.a == yqd.a && this.b == yqd.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SelectedMention(id=" + this.a + ", selectedMentionType=" + this.b + ")";
    }
}

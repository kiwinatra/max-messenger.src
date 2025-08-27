package defpackage;

import java.util.List;

/* renamed from: wo3  reason: default package */
public final class wo3 extends ij0 {
    public final int b;
    public final int c = 40;
    public final List o;

    public wo3(int i, long j, List list) {
        super(j);
        this.b = i;
        this.o = list;
    }

    public final String toString() {
        return "ContactListEvent{status=" + os3.BLOCKED + ", from=" + this.b + ", count=" + this.c + ", contactIds=" + this.o + '}';
    }
}

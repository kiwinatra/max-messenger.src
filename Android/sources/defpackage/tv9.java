package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: tv9  reason: default package */
public final class tv9 extends ij0 {
    public final long b;
    public final List c;
    public final List o;
    public final List v;

    public tv9(long j, long j2, ArrayList arrayList, List list, List list2) {
        super(j);
        this.b = j2;
        this.c = arrayList;
        this.o = list;
        this.v = list2;
    }

    public final String toString() {
        return "MsgGetEvent{serverChatId=" + this.b + ", serverMessageIds=" + this.c + ", messages=" + this.o + ", requestedMessageIds=" + this.v + '}';
    }
}

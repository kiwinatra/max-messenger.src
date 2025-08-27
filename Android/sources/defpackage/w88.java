package defpackage;

import java.util.List;

/* renamed from: w88  reason: default package */
public final class w88 extends ij0 {
    public final boolean b;
    public final boolean c;
    public final boolean o;
    public final List v;

    public w88(long j, boolean z, boolean z2, boolean z3, List list) {
        super(j);
        this.b = z;
        this.c = z2;
        this.o = z3;
        this.v = list;
    }

    public final String toString() {
        int size = this.v.size();
        return "LoginEvent(requestId=" + this.a + ", isFirstLogin=" + this.b + ", hasNewMessages=" + this.c + ", videoChatHistory=" + this.o + ", chats=" + size + ")";
    }
}

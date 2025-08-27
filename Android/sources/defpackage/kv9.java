package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: kv9  reason: default package */
public final class kv9 extends ij0 {
    public final long b;
    public final long c;
    public final long o;
    public final List v;
    public final bl4 w;

    public kv9(long j, List list, bl4 bl4) {
        this.b = j;
        this.w = bl4;
        this.c = 0;
        this.o = 0;
        this.v = list;
    }

    public final String toString() {
        return "MsgDeleteEvent{chatId=" + this.b + ", startTime=" + this.c + ", endTime=" + this.o + ", messageIds=" + this.v.size() + ", itemType=" + this.w + '}';
    }

    public kv9(long j, long j2, long j3, bl4 bl4) {
        this.b = j;
        this.c = j2;
        this.o = j3;
        this.v = new ArrayList();
        this.w = bl4;
    }
}

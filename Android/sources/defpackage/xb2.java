package defpackage;

/* renamed from: xb2  reason: default package */
public final /* synthetic */ class xb2 implements zi6 {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long o;

    public /* synthetic */ xb2(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = j4;
    }

    public final Object apply(Object obj) {
        jc2 jc2 = (jc2) obj;
        jc2.getClass();
        d7d a2 = d7d.a(4, "SELECT * FROM chat_location WHERE end_time>? AND chat_id=? AND message_time >=? AND message_time <=?");
        a2.k(1, this.o);
        a2.k(2, this.a);
        a2.k(3, this.b);
        a2.k(4, this.c);
        return new bi8(new gc2(jc2, a2, 6));
    }
}

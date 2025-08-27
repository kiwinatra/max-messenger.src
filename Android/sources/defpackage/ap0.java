package defpackage;

/* renamed from: ap0  reason: default package */
public final class ap0 implements zi6, qk3 {
    public final /* synthetic */ int a;
    public long b;
    public long c;

    public /* synthetic */ ap0(int i) {
        this.a = i;
    }

    public f72 a() {
        return new f72(this.b, this.c);
    }

    public void accept(Object obj) {
        hga.d.getClass();
        String str = hga.f;
        StringBuilder sb = new StringBuilder("getProcessedMessage: failed for chatServerId=");
        sb.append(this.b);
        sb.append(", messageId=");
        z68.b(str, wj6.m(sb, this.c, " "), (Throwable) obj);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 5:
                return new mka(2, new li5(1, this.b, this.c, (bj5) obj));
            default:
                oga oga = (oga) obj;
                oga.getClass();
                d7d a2 = d7d.a(2, "SELECT * FROM notifications_tracker_messages WHERE chat_id=? AND message_id=?");
                a2.k(1, this.b);
                a2.k(2, this.c);
                return new bi8(new ni(20, oga, a2));
        }
    }

    public void b(long j) {
        if (j == -1) {
            z68.o("Chunk.Builder", "", new IllegalStateException("end time is -1"));
        }
        this.c = j;
    }

    public String toString() {
        switch (this.a) {
            case 7:
                return this.b + "/" + this.c;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ap0(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public ap0() {
        this.a = 13;
        this.b = -9223372036854775807L;
        this.c = -9223372036854775807L;
    }

    public ap0(long j, long j2, long j3) {
        this.a = 4;
        this.b = j2;
        this.c = j3;
    }
}

package defpackage;

/* renamed from: ac2  reason: default package */
public final /* synthetic */ class ac2 implements zi6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public /* synthetic */ ac2(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                jc2 jc2 = (jc2) obj;
                jc2.getClass();
                d7d a2 = d7d.a(2, "SELECT * FROM chat_location WHERE end_time>? AND message_id=?");
                a2.k(1, this.c);
                a2.k(2, this.b);
                return new bi8(new gc2(jc2, a2, 2));
            case 1:
                jc2 jc22 = (jc2) obj;
                jc22.getClass();
                d7d a3 = d7d.a(2, "SELECT * FROM chat_location WHERE end_time>? AND chat_id=? ORDER BY message_time DESC");
                a3.k(1, this.c);
                a3.k(2, this.b);
                return new bi8(new gc2(jc22, a3, 4));
            case 2:
                return new na3(4, ((fi5) obj).a(), new ac2(3, this.b, this.c));
            case 3:
                return new qa3(1, new jm3(1, this.b, this.c, (oi5) obj));
            case 4:
                Throwable th = (Throwable) obj;
                long j = this.b;
                return (j <= 0 || System.currentTimeMillis() - this.c <= j) ? lbe.g(th) : lbe.g(new Exception("timeout reached", th));
            default:
                Throwable th2 = (Throwable) obj;
                long j2 = this.b;
                return (j2 <= 0 || System.currentTimeMillis() - this.c <= j2) ? jha.k(th2) : jha.k(new Exception("timeout reached", th2));
        }
    }
}

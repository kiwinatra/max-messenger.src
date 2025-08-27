package defpackage;

/* renamed from: oq3  reason: default package */
public final /* synthetic */ class oq3 implements zi6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long o;
    public final /* synthetic */ long v;

    public /* synthetic */ oq3(long j, String str, long j2, long j3, int i) {
        this.a = i;
        this.b = j;
        this.c = str;
        this.o = j2;
        this.v = j3;
    }

    public final Object apply(Object obj) {
        sq3 sq3 = (sq3) obj;
        switch (this.a) {
            case 0:
                sq3.getClass();
                d7d a2 = d7d.a(4, "SELECT * FROM contact_location WHERE contact_server_id=? AND device_id=? AND time>=? AND time<=? ORDER BY time DESC LIMIT 1");
                a2.k(1, this.b);
                String str = this.c;
                if (str == null) {
                    a2.X(2);
                } else {
                    a2.h(2, str);
                }
                a2.k(3, this.o);
                a2.k(4, this.v);
                return new bi8(new rq3(sq3, a2, 1));
            default:
                sq3.getClass();
                d7d a3 = d7d.a(4, "SELECT * FROM contact_location WHERE contact_server_id=? AND device_id=? AND time>=? AND time<=? ORDER BY time DESC");
                a3.k(1, this.b);
                String str2 = this.c;
                if (str2 == null) {
                    a3.X(2);
                } else {
                    a3.h(2, str2);
                }
                a3.k(3, this.o);
                a3.k(4, this.v);
                return new bi8(new rq3(sq3, a3, 2));
        }
    }
}

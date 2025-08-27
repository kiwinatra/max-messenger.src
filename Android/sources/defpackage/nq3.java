package defpackage;

/* renamed from: nq3  reason: default package */
public final /* synthetic */ class nq3 implements zi6, qk3 {
    public final /* synthetic */ long a;
    public final /* synthetic */ String b;

    public /* synthetic */ nq3(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public void accept(Object obj) {
        z68.c("o48", "validateThumbnailUri: id = %d, result = %s, uri = %s", Long.valueOf(this.a), (Boolean) obj, this.b);
    }

    public Object apply(Object obj) {
        sq3 sq3 = (sq3) obj;
        sq3.getClass();
        d7d a2 = d7d.a(2, "SELECT * FROM contact_location WHERE contact_server_id=? AND device_id=? ORDER BY time DESC LIMIT 1");
        a2.k(1, this.a);
        String str = this.b;
        if (str == null) {
            a2.X(2);
        } else {
            a2.h(2, str);
        }
        return new bi8(new rq3(sq3, a2, 0));
    }
}

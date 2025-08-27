package defpackage;

import java.util.List;

/* renamed from: yb2  reason: default package */
public final /* synthetic */ class yb2 implements zi6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long o;

    public /* synthetic */ yb2(int i, long j, long j2, long j3) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.o = j3;
    }

    public final Object apply(Object obj) {
        long j = this.o;
        long j2 = this.c;
        long j3 = this.b;
        switch (this.a) {
            case 0:
                jc2 jc2 = (jc2) obj;
                jc2.getClass();
                d7d a2 = d7d.a(3, "SELECT * FROM chat_location WHERE end_time>? AND chat_id=? AND contact_server_id=?");
                a2.k(1, j);
                a2.k(2, j3);
                a2.k(3, j2);
                return new bi8(new gc2(jc2, a2, 7));
            case 1:
                jc2 jc22 = (jc2) obj;
                jc22.getClass();
                return new qa3(2, new ic2(jc22, this.b, this.c, this.o));
            default:
                List list = (List) obj;
                z68.c("pq3", "Get by contactServerId %d long = %d to = %d: total %d", Long.valueOf(j3), Long.valueOf(j2), Long.valueOf(j), Integer.valueOf(list.size()));
                return list.isEmpty() ? uh8.a : nh8.e(list);
        }
    }
}

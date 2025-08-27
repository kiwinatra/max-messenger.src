package defpackage;

/* renamed from: hc1  reason: default package */
public final class hc1 implements zi6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ hc1(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                fc1 fc1 = (fc1) obj;
                fc1.getClass();
                d7d a2 = d7d.a(1, "SELECT * FROM call_links WHERE join_link = ?");
                String str = this.b;
                if (str == null) {
                    a2.X(1);
                } else {
                    a2.h(1, str);
                }
                return new bi8(new ec1(fc1, a2, 1));
            default:
                fc1 fc12 = (fc1) obj;
                fc12.getClass();
                return new qa3(2, new ni(3, fc12, this.b));
        }
    }
}

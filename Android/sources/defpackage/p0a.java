package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: p0a  reason: default package */
public final /* synthetic */ class p0a implements qk3, zi6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0a b;

    public /* synthetic */ p0a(r0a r0a, int i) {
        this.a = i;
        this.b = r0a;
    }

    public void accept(Object obj) {
        r0a r0a = this.b;
        switch (this.a) {
            case 0:
                Long l = (Long) obj;
                r0a.W();
                return;
            case 2:
                List list = (List) obj;
                r0a.getClass();
                z68.c("r0a", "Loaded %d", Integer.valueOf(list.size()));
                z2a z2a = (z2a) r0a.a;
                z2a.Z(false);
                z2a.a0(list);
                if (!r0a.v0) {
                    r0a.v0 = true;
                    r0a.x.K();
                    return;
                }
                return;
            default:
                Throwable th = (Throwable) obj;
                r0a.getClass();
                z68.e("r0a", "Can't load locations");
                z2a z2a2 = (z2a) r0a.a;
                z2a2.Z(false);
                z2a2.a0(Collections.emptyList());
                return;
        }
    }

    public Object apply(Object obj) {
        ec2 ec2 = (ec2) obj;
        r0a r0a = this.b;
        r0a.getClass();
        return new mc2(r0a.c.G(ec2.b), ec2);
    }
}

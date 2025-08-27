package defpackage;

import java.util.List;

/* renamed from: sh5  reason: default package */
public final /* synthetic */ class sh5 implements qk3, zi6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ai5 b;

    public /* synthetic */ sh5(ai5 ai5, int i) {
        this.a = i;
        this.b = ai5;
    }

    public void accept(Object obj) {
        ai5 ai5 = this.b;
        switch (this.a) {
            case 0:
                gi5 gi5 = (gi5) obj;
                ai5.getClass();
                long j = gi5.b;
                if (j != 0) {
                    z68.c("ai5", "loadFromMarker: new marker in response=%d", Long.valueOf(j));
                    ai5.g(gi5.b);
                    return;
                }
                return;
            case 1:
                List list = (List) obj;
                ai5.getClass();
                z68.c("ai5", "onNotifUpdated: updated ids: %s", list);
                ai5.x.d(list);
                return;
            case 2:
                List list2 = (List) obj;
                ai5.getClass();
                z68.c("ai5", "on next favorite ids from obs: %s", list2);
                ai5.x.d(list2);
                return;
            default:
                List list3 = (List) obj;
                ai5.getClass();
                z68.c("ai5", "on next favorite sticker sets: %s", list3);
                ai5.y.d(list3);
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 3:
                return ((vqe) this.b.b.getValue()).c((List) obj);
            case 5:
                return new na3(4, ((fi5) this.b.a.getValue()).a(), new x52(17, (List) obj));
            default:
                ai5 ai5 = this.b;
                ai5.getClass();
                return new qa3(1, new p00(6, ai5, (Long) obj));
        }
    }
}

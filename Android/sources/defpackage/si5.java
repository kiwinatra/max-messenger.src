package defpackage;

import java.util.List;

/* renamed from: si5  reason: default package */
public final /* synthetic */ class si5 implements qk3, zi6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi5 b;

    public /* synthetic */ si5(vi5 vi5, int i) {
        this.a = i;
        this.b = vi5;
    }

    public void accept(Object obj) {
        vi5 vi5 = this.b;
        switch (this.a) {
            case 0:
                List list = (List) obj;
                vi5.getClass();
                z68.c("vi5", "onNotifUpdated: updated ids: %s", list);
                vi5.i.d(list);
                return;
            case 1:
                List list2 = (List) obj;
                vi5.getClass();
                z68.c("vi5", "on next favorite sticker ids from obs: %s", list2);
                vi5.i.d(list2);
                return;
            case 3:
                List list3 = (List) obj;
                vi5.getClass();
                z68.c("vi5", "on next favorite sticker: %s", list3);
                vi5.j.d(list3);
                return;
            default:
                vi5.getClass();
                long j = ((pi5) obj).b;
                if (j != 0) {
                    vi5.b(j);
                    return;
                }
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                return ((moe) this.b.b.get()).e((List) obj);
            case 5:
                vi5 vi5 = this.b;
                vi5.getClass();
                return new qa3(1, new p00(7, vi5, (Long) obj));
            default:
                return new na3(4, ((rh5) this.b.a.get()).a(), new x52(11, (List) obj));
        }
    }
}

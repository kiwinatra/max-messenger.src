package defpackage;

import java.util.List;

/* renamed from: y1a  reason: default package */
public final /* synthetic */ class y1a implements tk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a2a b;
    public final /* synthetic */ List c;

    public /* synthetic */ y1a(a2a a2a, List list, int i) {
        this.a = i;
        this.b = a2a;
        this.c = list;
    }

    public final void accept(Object obj) {
        j4a j4a = (j4a) obj;
        switch (this.a) {
            case 0:
                a2a a2a = this.b;
                boolean z = !jbd.d(a2a.o.a.j);
                c0 E = j4a.x0.v.E(ose.STICKER_SETS);
                boolean z2 = E instanceof yqe;
                List list = this.c;
                if (z2) {
                    ((yqe) E).b(list, z);
                }
                if (!list.isEmpty()) {
                    a2a.X.a(jbd.e(300, new p00(15, a2a, list), (ykb) null));
                    return;
                }
                return;
            default:
                a2a a2a2 = this.b;
                a2a2.getClass();
                oqe lastVisibleStickerSet = j4a.x0.getLastVisibleStickerSet();
                if (lastVisibleStickerSet != null && lastVisibleStickerSet.a == ((oqe) a81.i(1, this.c)).a) {
                    mre mre = a2a2.o;
                    if (((bre) mre.a.a.get()).a()) {
                        mre.c();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

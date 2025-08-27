package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: joe  reason: default package */
public final /* synthetic */ class joe implements zi6, qk3, nsb {
    public final /* synthetic */ int a;
    public final /* synthetic */ moe b;

    public /* synthetic */ joe(moe moe, int i) {
        this.a = i;
        this.b = moe;
    }

    public void accept(Object obj) {
        this.b.h((List) obj);
    }

    /* JADX WARNING: type inference failed for: r7v27, types: [h20, java.lang.Object] */
    public Object apply(Object obj) {
        moe moe = this.b;
        switch (this.a) {
            case 0:
                List list = (List) obj;
                moe.getClass();
                z68.c("moe", "loadNetworkStickersSingle: ids=%s", list);
                wbe i = ((jna) ((rl) moe.g.get())).U(new yt(cjf.i(list), 2), moe.h).i(new ch2(12, du.class)).i(new mqd(8)).i(new mqd(10));
                gcf gcf = (gcf) moe.j.get();
                gcf.getClass();
                return new tbe(i.k(new ecf(gcf, 2, 0)), new joe(moe, 1), 3);
            case 2:
                List list2 = (List) obj;
                moe.getClass();
                ArrayList f = moe.f((List) new yia(new mha(jha.n(list2), new mqd(12), 1).e(vpe.class), new mqd(13), 3).B().f());
                if (!f.isEmpty()) {
                    moe.g(f).f();
                }
                return (List) new yia(new mha(jha.n(list2), new joe(moe, 3), 1), new joe(moe, 4), 3).B().f();
            case 4:
                ouc ouc = (ouc) obj;
                moe.getClass();
                cvc cvc = ouc.a;
                if (cvc == cvc.STICKER) {
                    return moe.c(((vpe) ouc).c);
                }
                if (cvc == cvc.GIF) {
                    ? obj2 = new Object();
                    x10 x10 = ((rr6) ouc).c;
                    obj2.a = x10.y;
                    obj2.c = x10.o;
                    obj2.b = x10.c;
                    obj2.d = x10.a();
                    obj2.f = x10.z;
                    obj2.p = x10;
                    obj2.j = true;
                    obj2.i = 3;
                    obj2.m = 2;
                    return obj2.b();
                }
                throw new IllegalStateException("Unknown sticker recent type");
            case 5:
                moe.getClass();
                ArrayList arrayList = new ArrayList();
                for (ouc ouc2 : (List) obj) {
                    if (ouc2 instanceof vpe) {
                        arrayList.add(Long.valueOf(((vpe) ouc2).c));
                    }
                }
                ArrayList f2 = moe.f(arrayList);
                if (!f2.isEmpty()) {
                    moe.g(f2).f();
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Long l = (Long) it.next();
                    l.getClass();
                    boe boe = (boe) moe.a.get(l);
                    if (boe != null) {
                        arrayList2.add(boe);
                    }
                }
                return arrayList2;
            default:
                return moe.e((List) obj);
        }
    }

    public boolean test(Object obj) {
        ouc ouc = (ouc) obj;
        moe moe = this.b;
        moe.getClass();
        return (ouc.a == cvc.STICKER && moe.c(((vpe) ouc).c) == null) ? false : true;
    }
}

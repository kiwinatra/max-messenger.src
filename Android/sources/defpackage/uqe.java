package defpackage;

import java.util.List;

/* renamed from: uqe  reason: default package */
public final /* synthetic */ class uqe implements nsb, zi6, qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ uqe(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public void accept(Object obj) {
        z68.c("eef", "hasTasksByTypesInDb: tasks count=%d, for types=%s", (Long) obj, this.b);
    }

    public Object apply(Object obj) {
        wqe wqe = (wqe) obj;
        wqe.getClass();
        return new qa3(2, new ni(27, wqe, this.b));
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return !((Boolean) new oha(jha.n(this.b), new koe(1, (Long) obj)).f()).booleanValue();
            default:
                return this.b.contains(Long.valueOf(((vk3) obj).s()));
        }
    }
}

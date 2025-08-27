package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: ih3  reason: default package */
public final /* synthetic */ class ih3 implements kh3 {
    public final /* synthetic */ m7f a;
    public final /* synthetic */ cx8 b;

    public /* synthetic */ ih3(m7f m7f, cx8 cx8, pob pob) {
        this.a = m7f;
        this.b = cx8;
    }

    public final zz7 run() {
        yx8 yx8 = (yx8) ((WeakReference) this.a.o).get();
        if (yx8 != null) {
            yx8.p(this.b);
        }
        return ya7.b;
    }
}

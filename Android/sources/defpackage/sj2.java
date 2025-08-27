package defpackage;

import java.util.List;

/* renamed from: sj2  reason: default package */
public final /* synthetic */ class sj2 implements qk3, zi6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tj2 b;

    public /* synthetic */ sj2(tj2 tj2, int i) {
        this.a = i;
        this.b = tj2;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.a((List) obj);
                return;
            default:
                this.b.g = (mq4) obj;
                return;
        }
    }

    public Object apply(Object obj) {
        jj2 jj2 = (jj2) obj;
        tj2 tj2 = this.b;
        tj2.getClass();
        tj2.h = jj2.o;
        return lbe.h(jj2.c);
    }
}

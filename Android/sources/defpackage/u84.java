package defpackage;

import java.util.Set;

/* renamed from: u84  reason: default package */
public final /* synthetic */ class u84 implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z84 b;

    public /* synthetic */ u84(z84 z84, int i) {
        this.a = i;
        this.b = z84;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                z84 z84 = this.b;
                z84.c(new w84(false, false, z84.g.e, true, (mj5) null));
                return;
            case 1:
                z68.c(z84.k, "cancelAll", new Object[0]);
                w84 w84 = w84.f;
                z84 z842 = this.b;
                z842.g = w84;
                ((po9) ((mo9) z842.a.getValue())).a();
                return;
            default:
                z84 z843 = this.b;
                w84 w842 = z843.g;
                z843.c(new w84(w842.a, w842.b, w842.e, w842.c, (mj5) null));
                return;
        }
    }

    public /* synthetic */ u84(z84 z84, Set set) {
        this.a = 2;
        this.b = z84;
    }
}

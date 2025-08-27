package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: wm5  reason: default package */
public final /* synthetic */ class wm5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zm5 b;

    public /* synthetic */ wm5(zm5 zm5, int i) {
        this.a = i;
        this.b = zm5;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ew3.b(this.b.getContext(), cad.w0);
            case 1:
                return ew3.b(this.b.getContext(), cad.J1);
            default:
                return zm5.s(this.b);
        }
    }
}

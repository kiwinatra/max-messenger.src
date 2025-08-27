package defpackage;

import ru.ok.messages.constructor.MessageConstructorView;

/* renamed from: q99  reason: default package */
public final /* synthetic */ class q99 implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageConstructorView b;

    public /* synthetic */ q99(MessageConstructorView messageConstructorView, int i) {
        this.a = i;
        this.b = messageConstructorView;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ((l2a) this.b.w).N(new zj0(28));
                return;
            case 1:
                ((l2a) this.b.w).N(new zj0(29));
                return;
            case 2:
                MessageConstructorView.b(this.b);
                return;
            case 3:
                s99 s99 = this.b.w;
                if (s99 != null) {
                    ((l2a) s99).Z();
                    return;
                }
                return;
            default:
                s99 s992 = this.b.w;
                if (s992 != null) {
                    ((l2a) s992).N(new k2a(0));
                    return;
                }
                return;
        }
    }
}

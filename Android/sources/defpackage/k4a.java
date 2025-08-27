package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: k4a  reason: default package */
public final /* synthetic */ class k4a implements tk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ k4a(long j, int i) {
        this.a = i;
        this.b = j;
    }

    public final void accept(Object obj) {
        c2a c2a = (c2a) obj;
        switch (this.a) {
            case 0:
                long j = this.b;
                c2a.x = j;
                if (((m48) c2a.v).k()) {
                    c2a.W();
                }
                ((m4a) c2a.a).Z.setText(j4b.t(TimeUnit.MILLISECONDS.toSeconds(j)));
                c2a.X();
                c2a.X.d(Long.valueOf(j));
                return;
            default:
                if (((m48) c2a.v).k()) {
                    c2a.W();
                }
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long j2 = this.b;
                ((m4a) c2a.a).v0.setText(j4b.t(timeUnit.toSeconds(j2)));
                c2a.X();
                c2a.X.d(Long.valueOf(j2));
                return;
        }
    }
}

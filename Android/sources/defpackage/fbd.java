package defpackage;

import androidx.room.rxjava3.EmptyResultSetException;
import java.util.concurrent.Callable;

/* renamed from: fbd  reason: default package */
public final /* synthetic */ class fbd implements ice {
    public final /* synthetic */ int a;
    public final /* synthetic */ Callable b;

    public /* synthetic */ fbd(Callable callable, int i) {
        this.a = i;
        this.b = callable;
    }

    public final void h(pbe pbe) {
        switch (this.a) {
            case 0:
                try {
                    pbe.a(this.b.call());
                    return;
                } catch (EmptyResultSetException e) {
                    pbe.d(e);
                    return;
                }
            default:
                pbe.a(this.b.call());
                return;
        }
    }
}

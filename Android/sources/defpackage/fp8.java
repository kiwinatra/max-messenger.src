package defpackage;

import android.os.IBinder;
import java.util.Objects;

/* renamed from: fp8  reason: default package */
public final /* synthetic */ class fp8 implements IBinder.DeathRecipient {
    public final /* synthetic */ np8 a;

    public /* synthetic */ fp8(np8 np8) {
        this.a = np8;
    }

    public final void binderDied() {
        qo8 qo8 = this.a.a;
        Objects.requireNonNull(qo8);
        qo8.H0(new y86(24, (Object) qo8));
    }
}

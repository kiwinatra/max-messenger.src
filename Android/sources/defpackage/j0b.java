package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j0b  reason: default package */
public final /* synthetic */ class j0b implements Handler.Callback {
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        Handler handler = l0b.a;
        k0b k0b = (k0b) message.obj;
        AtomicBoolean atomicBoolean = l0b.d;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (Intrinsics.areEqual((Object) l0b.b, (Object) k0b) || Intrinsics.areEqual((Object) l0b.c, (Object) k0b)) {
                l0b.a(k0b, g0b.a);
            }
            atomicBoolean.set(false);
        }
        return true;
    }
}

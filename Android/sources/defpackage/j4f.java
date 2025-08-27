package defpackage;

import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* renamed from: j4f  reason: default package */
public interface j4f {
    Unit a();

    Object b(float f, long j, long j2, Continuation continuation);

    Object c(Continuation continuation) {
        return Unit.INSTANCE;
    }

    Unit d() {
        return Unit.INSTANCE;
    }

    Unit e(boolean z, boolean z2);

    Object f(File file, Continuation continuation);

    String getDownloadContext();
}

package defpackage;

import android.content.ContentResolver;
import java.util.concurrent.Executor;
import kotlin.io.ConstantsKt;

/* renamed from: p38  reason: default package */
public final class p38 implements bjf {
    public final Executor a;
    public final p7d b;
    public final ContentResolver c;

    public p38(Executor executor, p7d p7d, ContentResolver contentResolver) {
        this.a = executor;
        this.b = p7d;
        this.c = contentResolver;
    }

    public final void a(zi0 zi0, yvb yvb) {
        ik0 ik0 = (ik0) yvb;
        bwb bwb = ik0.c;
        ik0.h("local", "exif");
        n38 n38 = new n38(this, zi0, bwb, yvb, ik0.a);
        ik0.a(new o38(n38, 0));
        this.a.execute(n38);
    }

    public final boolean b(v3d v3d) {
        return o54.A(ConstantsKt.MINIMUM_BLOCK_SIZE, ConstantsKt.MINIMUM_BLOCK_SIZE, v3d);
    }
}

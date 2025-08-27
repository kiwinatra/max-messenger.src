package defpackage;

import androidx.work.impl.WorkDatabase;

/* renamed from: vog  reason: default package */
public final class vog implements r96 {
    public final wdf a;
    public final q96 b;
    public final ypg c;

    static {
        h88.V("WMFgUpdater");
    }

    public vog(WorkDatabase workDatabase, q96 q96, wdf wdf) {
        this.b = q96;
        this.a = wdf;
        this.c = workDatabase.y();
    }
}

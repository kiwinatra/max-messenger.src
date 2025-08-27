package defpackage;

import java.io.File;
import kotlin.Lazy;

/* renamed from: t47  reason: default package */
public final class t47 extends jha {
    public static final /* synthetic */ int v = 0;
    public final Lazy a;
    public final String b;
    public final File c;
    public final lfd o;

    public t47(Lazy lazy, String str, File file, lfd lfd) {
        this.a = lazy;
        this.b = str;
        this.c = file;
        this.o = lfd;
    }

    public final void w(cla cla) {
        jfd b2 = this.o.b();
        cla cla2 = cla;
        s47 s47 = new s47(cla2, this.a, this.b, this.c, b2);
        cla.c(s47);
        if (!s47.w.get()) {
            ((y47) s47.a.getValue()).b(s47.b, s47.c, s47, (String) null);
        }
    }
}

package defpackage;

import java.io.File;
import kotlin.jvm.internal.Ref;

/* renamed from: zeb  reason: default package */
public final class zeb implements r97 {
    public final /* synthetic */ afb a;
    public final /* synthetic */ Ref.ObjectRef b;

    public zeb(afb afb, Ref.ObjectRef objectRef) {
        this.a = afb;
        this.b = objectRef;
    }

    public final void a() {
        Exception exc = new Exception("onDownloadFailed");
        this.a.b((wx) this.b.element, exc);
    }

    public final void c(String str) {
        File file = new File(str);
        this.a.c((wx) this.b.element, file);
    }
}

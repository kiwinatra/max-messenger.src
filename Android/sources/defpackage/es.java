package defpackage;

import android.content.Context;
import android.os.StrictMode;
import java.io.File;

/* renamed from: es  reason: default package */
public final class es extends nfe implements oyc {
    public final int a;
    public gp4 b;

    public es(Context context, int i) {
        this.a = i;
        this.b = new gp4(new File(context.getApplicationInfo().nativeLibraryDir), i);
    }

    public final nfe a(Context context) {
        this.b = new gp4(new File(context.getApplicationInfo().nativeLibraryDir), this.a | 1);
        return this;
    }

    public final String b() {
        throw null;
    }

    public final int c(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return this.b.c(str, i, threadPolicy);
    }

    public final void d(int i) {
        this.b.getClass();
    }

    public final String toString() {
        return "ApplicationSoSource[" + this.b.toString() + "]";
    }
}

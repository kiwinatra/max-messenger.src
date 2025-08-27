package defpackage;

import android.content.Context;
import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: ef6  reason: default package */
public final class ef6 implements f3f {
    public final Context a;
    public final String b;
    public final ty c;
    public final boolean o;
    public final boolean v;
    public final Lazy w = LazyKt.lazy(new ve(2, (Object) this));
    public boolean x;

    public ef6(Context context, String str, ty tyVar, boolean z, boolean z2) {
        this.a = context;
        this.b = str;
        this.c = tyVar;
        this.o = z;
        this.v = z2;
    }

    public final void close() {
        Lazy lazy = this.w;
        if (lazy.isInitialized()) {
            ((df6) lazy.getValue()).close();
        }
    }

    public final af6 getReadableDatabase() {
        return ((df6) this.w.getValue()).a(false);
    }

    public final af6 getWritableDatabase() {
        return ((df6) this.w.getValue()).a(true);
    }

    public final void setWriteAheadLoggingEnabled(boolean z) {
        Lazy lazy = this.w;
        if (lazy.isInitialized()) {
            ((df6) lazy.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.x = z;
    }
}

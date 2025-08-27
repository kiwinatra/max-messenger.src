package defpackage;

import android.content.Context;

/* renamed from: m5h  reason: default package */
public final class m5h implements kxg {
    public final u13 a;

    public m5h(u13 u13) {
        this.a = u13;
    }

    public final Object y() {
        Context context = this.a.a;
        if (context != null) {
            return context;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

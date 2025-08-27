package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: e68  reason: default package */
public abstract class e68 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final lt6 b;
    public final c68 c;
    public final Context d;

    public e68(lt6 lt6, c68 c68, Context context) {
        this.b = lt6;
        this.d = context;
        this.c = c68;
    }

    public abstract y58 a();
}

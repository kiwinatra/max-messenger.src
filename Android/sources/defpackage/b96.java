package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: b96  reason: default package */
public final class b96 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ soc o;
    public final /* synthetic */ int v;

    public /* synthetic */ b96(String str, Context context, soc soc, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = context;
        this.o = soc;
        this.v = i;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                return d96.a(this.b, this.c, this.o, this.v);
            default:
                try {
                    return d96.a(this.b, this.c, this.o, this.v);
                } catch (Throwable unused) {
                    return new c96(-3);
                }
        }
    }
}

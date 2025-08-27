package defpackage;

import android.util.LruCache;
import kotlin.jvm.functions.Function0;

/* renamed from: we9  reason: default package */
public final /* synthetic */ class we9 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ we9(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new LruCache(this.b);
            case 1:
                return new tb8(this.b);
            default:
                return new tb8(this.b);
        }
    }
}

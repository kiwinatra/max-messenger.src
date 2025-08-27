package defpackage;

import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;

/* renamed from: ty6  reason: default package */
public final class ty6 {
    public final ArrayList a = new ArrayList();
    public final Lazy b;
    public final Lazy c;

    public ty6() {
        a46 a46 = new a46(20);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = LazyKt.lazy(lazyThreadSafetyMode, a46);
        this.c = LazyKt.lazy(lazyThreadSafetyMode, new a46(21));
    }
}

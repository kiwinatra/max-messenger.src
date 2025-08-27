package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import one.me.devmenu.DevMenuScreen;

/* renamed from: cn4  reason: default package */
public final class cn4 implements bs5 {
    public final /* synthetic */ bs5 a;
    public final /* synthetic */ DevMenuScreen b;
    public final /* synthetic */ int c;

    public cn4(ome ome, DevMenuScreen devMenuScreen, int i) {
        this.a = ome;
        this.b = devMenuScreen;
        this.c = i;
    }

    public final Object e(ds5 ds5, Continuation continuation) {
        Object e = this.a.e(new a52(ds5, this.b, this.c), continuation);
        return e == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e : Unit.INSTANCE;
    }
}

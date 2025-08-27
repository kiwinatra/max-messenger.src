package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import one.me.pinbars.PinBarsWidget;
import ru.ok.messages.suggests.SuggestsViewModel;

/* renamed from: zjb  reason: default package */
public final class zjb implements bs5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bs5 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zjb(bs5 bs5, Object obj, int i) {
        this.a = i;
        this.b = bs5;
        this.c = obj;
    }

    public final Object e(ds5 ds5, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object e = this.b.e(new vb(28, ds5, (akb) this.c), continuation);
                return e == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e : Unit.INSTANCE;
            case 1:
                Object e2 = this.b.e(new vb(29, ds5, (skb) this.c), continuation);
                return e2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e2 : Unit.INSTANCE;
            case 2:
                Object e3 = this.b.e(new glb(ds5, (PinBarsWidget) this.c, 0), continuation);
                return e3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e3 : Unit.INSTANCE;
            case 3:
                Object e4 = this.b.e(new glb(ds5, (syb) this.c, 1), continuation);
                return e4 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e4 : Unit.INSTANCE;
            case 4:
                Object e5 = this.b.e(new glb(ds5, (vxc) this.c, 2), continuation);
                return e5 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e5 : Unit.INSTANCE;
            case 5:
                Object e6 = this.b.e(new glb(ds5, (z8e) this.c, 3), continuation);
                return e6 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e6 : Unit.INSTANCE;
            case 6:
                Object e7 = this.b.e(new glb(ds5, (kee) this.c, 4), continuation);
                return e7 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e7 : Unit.INSTANCE;
            case 7:
                Object e8 = this.b.e(new glb(ds5, (pje) this.c, 5), continuation);
                return e8 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e8 : Unit.INSTANCE;
            case 8:
                Object e9 = this.b.e(new glb(ds5, (due) this.c, 6), continuation);
                return e9 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e9 : Unit.INSTANCE;
            case 9:
                Object e10 = this.b.e(new glb(ds5, (gwe) this.c, 7), continuation);
                return e10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e10 : Unit.INSTANCE;
            case 10:
                Object e11 = this.b.e(new hjb(ds5, (SuggestsViewModel) this.c), continuation);
                return e11 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e11 : Unit.INSTANCE;
            case 11:
                Object e12 = this.b.e(new glb(ds5, (bxf) this.c, 8), continuation);
                return e12 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e12 : Unit.INSTANCE;
            case 12:
                Object e13 = this.b.e(new glb(ds5, (l5f) this.c, 9), continuation);
                return e13 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e13 : Unit.INSTANCE;
            default:
                Object e14 = this.b.e(new glb(ds5, (bhf) this.c, 10), continuation);
                return e14 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e14 : Unit.INSTANCE;
        }
    }
}

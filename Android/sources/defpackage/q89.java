package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* renamed from: q89  reason: default package */
public final class q89 extends ObservableProperty {
    public final /* synthetic */ int a;
    public final /* synthetic */ r89 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q89(Object obj, r89 r89, int i) {
        super(obj);
        this.a = i;
        this.b = r89;
    }

    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    int[] iArr = (int[]) obj;
                    r89 r89 = this.b;
                    r89.d((int[]) obj2, r89.getBounds());
                    return;
                }
                return;
            default:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    int[] iArr2 = (int[]) obj;
                    r89 r892 = this.b;
                    r892.e((int[]) obj2, r892.getBounds());
                    return;
                }
                return;
        }
    }
}

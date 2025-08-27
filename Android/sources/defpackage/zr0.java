package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import one.me.sdk.bottomsheet.BottomSheetWidget;

/* renamed from: zr0  reason: default package */
public final class zr0 implements dy3 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public zr0(zx3 zx3, Function0 function0) {
        this.b = zx3.getInstanceId();
        this.c = function0;
    }

    private final void c(zx3 zx3, zx3 zx32, boolean z) {
    }

    public final void a(zx3 zx3, zx3 zx32, boolean z) {
        switch (this.a) {
            case 0:
                if (zx32 != null) {
                    ((e9d) this.b).K(this);
                    ((BottomSheetWidget) this.c).i0(true);
                    return;
                }
                return;
            default:
                if (Intrinsics.areEqual((Object) zx32 != null ? zx32.getInstanceId() : null, (Object) (String) this.b) && !z) {
                    ((Function0) this.c).invoke();
                    return;
                }
                return;
        }
    }

    public final void b(zx3 zx3, zx3 zx32, boolean z) {
        switch (this.a) {
            case 0:
                return;
            default:
                if (Intrinsics.areEqual((Object) zx32 != null ? zx32.getInstanceId() : null, (Object) (String) this.b) && !z) {
                    zx32.getRouter().K(this);
                    return;
                }
                return;
        }
    }

    public zr0(e9d e9d, BottomSheetWidget bottomSheetWidget) {
        this.b = e9d;
        this.c = bottomSheetWidget;
    }
}

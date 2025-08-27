package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* renamed from: r87  reason: default package */
public final class r87 extends ObservableProperty {
    public final /* synthetic */ int a;
    public final /* synthetic */ s87 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r87(s87 s87, int i) {
        super(null);
        this.a = i;
        this.b = s87;
    }

    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                k97 k97 = (k97) obj2;
                k97 k972 = (k97) obj;
                Integer num = null;
                if (Intrinsics.areEqual((Object) k972 != null ? Integer.valueOf(k972.getWidth()) : null, (Object) k97 != null ? Integer.valueOf(k97.getWidth()) : null)) {
                    Integer valueOf = k972 != null ? Integer.valueOf(k972.getHeight()) : null;
                    if (k97 != null) {
                        num = Integer.valueOf(k97.getHeight());
                    }
                    if (Intrinsics.areEqual((Object) valueOf, (Object) num)) {
                        return;
                    }
                }
                s87 s87 = this.b;
                s87.post(new cf(29, s87));
                return;
            case 1:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    Drawable drawable = (Drawable) obj2;
                    Drawable drawable2 = (Drawable) obj;
                    s87 s872 = this.b;
                    ((sp6) s872.getHierarchy()).k(s872.getOverlayDrawable());
                    return;
                }
                return;
            default:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    p87 p87 = (p87) obj;
                    this.b.setup((p87) obj2);
                    return;
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r87(Object obj, s87 s87) {
        super(obj);
        this.a = 2;
        this.b = s87;
    }
}

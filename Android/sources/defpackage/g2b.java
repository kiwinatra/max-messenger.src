package defpackage;

import android.text.InputFilter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* renamed from: g2b  reason: default package */
public final class g2b extends ObservableProperty {
    public final /* synthetic */ int a;
    public final /* synthetic */ h2b b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2b(h2b h2b, int i) {
        super(null);
        this.a = i;
        this.b = h2b;
    }

    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    Integer num = (Integer) obj2;
                    Integer num2 = (Integer) obj;
                    js9 js9 = fu4.k;
                    h2b h2b = this.b;
                    h2b.onThemeChanged(js9.f(h2b));
                    return;
                }
                return;
            case 1:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    String str = (String) obj;
                    this.b.a.setHint((String) obj2);
                    return;
                }
                return;
            case 2:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    InputFilter[] inputFilterArr = (InputFilter[]) obj;
                    this.b.a.setFilters((InputFilter[]) obj2);
                    return;
                }
                return;
            case 3:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    js9 js92 = fu4.k;
                    h2b h2b2 = this.b;
                    h2b2.onThemeChanged(js92.f(h2b2));
                    return;
                }
                return;
            case 4:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    js9 js93 = fu4.k;
                    h2b h2b3 = this.b;
                    h2b3.onThemeChanged(js93.f(h2b3));
                    return;
                }
                return;
            default:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    f2b f2b = (f2b) obj2;
                    f2b f2b2 = (f2b) obj;
                    if (f2b != null) {
                        js9 js94 = fu4.k;
                        h2b h2b4 = this.b;
                        h2b4.d(js94.f(h2b4), f2b);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2b(Object obj, h2b h2b, int i) {
        super(obj);
        this.a = i;
        this.b = h2b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g2b(h2b h2b) {
        super("");
        this.a = 1;
        this.b = h2b;
    }
}

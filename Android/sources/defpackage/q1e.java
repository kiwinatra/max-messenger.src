package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* renamed from: q1e  reason: default package */
public final class q1e extends ObservableProperty {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ r1e b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q1e(w0e w0e, r1e r1e) {
        super(w0e);
        this.b = r1e;
    }

    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        Drawable drawable;
        switch (this.a) {
            case 0:
                i1e i1e = (i1e) obj2;
                if (!Intrinsics.areEqual((Object) (i1e) obj, (Object) i1e)) {
                    r1e r1e = this.b;
                    r1e.getClass();
                    r1e.setTitle(i1e.getTitle());
                    Integer a2 = i1e.a();
                    CharSequence charSequence = null;
                    if (a2 != null) {
                        drawable = ew3.b(r1e.getContext(), a2.intValue());
                    } else {
                        drawable = null;
                    }
                    r1e.setStartIcon(drawable);
                    r1e.setDescription(i1e.b());
                    r1e.setCounter(i1e.c());
                    ngf d = i1e.d();
                    if (d != null) {
                        charSequence = d.a(r1e.getContext());
                    }
                    r1e.setUpperText(charSequence);
                    r1e.setEndView(i1e.e());
                    r1e.setStartIconPadding(i1e.p());
                    i1e.getItemId();
                    r1e.setType(r1e.getModelItem().getType());
                    r1e.requestLayout();
                    r1e.invalidate();
                    r1e.onThemeChanged(fu4.k.e(r1e.getContext()).f());
                    return;
                }
                return;
            default:
                if (((m1e) obj) != ((m1e) obj2)) {
                    r1e r1e2 = this.b;
                    r1e2.onThemeChanged(r1e2.getCurrentTheme());
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q1e(defpackage.r1e r2) {
        /*
            r1 = this;
            r0 = 1
            r1.a = r0
            m1e r0 = defpackage.m1e.a
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q1e.<init>(r1e):void");
    }
}

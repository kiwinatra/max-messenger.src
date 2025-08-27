package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* renamed from: eqa  reason: default package */
public final class eqa extends ObservableProperty {
    public final /* synthetic */ int a;
    public final /* synthetic */ fqa b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eqa(fqa fqa, int i) {
        super(null);
        this.a = i;
        switch (i) {
            case 1:
                dqa dqa = dqa.a;
                this.b = fqa;
                super(dqa);
                return;
            case 2:
                cqa cqa = cqa.a;
                this.b = fqa;
                super(cqa);
                return;
            default:
                this.b = fqa;
                return;
        }
    }

    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                k2b k2b = (k2b) obj2;
                if (!Intrinsics.areEqual((Object) (k2b) obj, (Object) k2b)) {
                    fqa fqa = this.b;
                    if (k2b == null) {
                        k2b = fu4.k.f(fqa);
                    }
                    fqa.onThemeChanged(k2b);
                    return;
                }
                return;
            case 1:
                dqa dqa = (dqa) obj2;
                if (((dqa) obj) != dqa) {
                    int ordinal = dqa.ordinal();
                    fqa fqa2 = this.b;
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else if (fqa2.getTextView().getParent() == null) {
                            fqa2.addView(fqa2.getTextView());
                            return;
                        } else {
                            return;
                        }
                    } else if (fqa2.getTextView().getParent() != null) {
                        fqa2.removeView(fqa2.getTextView());
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                cqa cqa = (cqa) obj2;
                if (((cqa) obj) != cqa) {
                    fqa fqa3 = this.b;
                    fqa3.c(fqa3, cqa);
                    return;
                }
                return;
        }
    }
}

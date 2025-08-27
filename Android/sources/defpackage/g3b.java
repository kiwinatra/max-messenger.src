package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: g3b  reason: default package */
public final class g3b extends ObservableProperty {
    public final /* synthetic */ int a;
    public final /* synthetic */ h3b b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g3b(h3b h3b, int i) {
        super(null);
        this.a = i;
        switch (i) {
            case 1:
                z2b z2b = z2b.a;
                this.b = h3b;
                super(z2b);
                return;
            case 2:
                s2b s2b = s2b.a;
                this.b = h3b;
                super(s2b);
                return;
            case 3:
                s2b s2b2 = s2b.a;
                this.b = h3b;
                super(s2b2);
                return;
            case 4:
                Boolean bool = Boolean.FALSE;
                this.b = h3b;
                super(bool);
                return;
            default:
                this.b = h3b;
                return;
        }
    }

    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        OneMeButton oneMeButton;
        switch (this.a) {
            case 0:
                k2b k2b = (k2b) obj2;
                if (!Intrinsics.areEqual((Object) (k2b) obj, (Object) k2b)) {
                    h3b h3b = this.b;
                    if (k2b == null) {
                        k2b = fu4.k.f(h3b);
                    }
                    h3b.onThemeChanged(k2b);
                    return;
                }
                return;
            case 1:
                if (((z2b) obj) != ((z2b) obj2)) {
                    h3b h3b2 = this.b;
                    h3b2.m();
                    h3b2.l();
                    if (!h3b2.k()) {
                        h3b2.setShouldUpdateConstraints(true);
                        h3b2.requestLayout();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                x2b x2b = (x2b) obj2;
                if (!Intrinsics.areEqual((Object) (x2b) obj, (Object) x2b)) {
                    h3b h3b3 = this.b;
                    h3b.d(h3b3, x2b);
                    h3b3.l();
                    if (!h3b3.k()) {
                        h3b3.setShouldUpdateConstraints(true);
                        h3b3.requestLayout();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                v2b v2b = (v2b) obj2;
                v2b v2b2 = (v2b) obj;
                h3b h3b4 = this.b;
                if ((h3b4.getForm() == z2b.a || h3b4.getForm() == z2b.c) && !Intrinsics.areEqual((Object) v2b2, (Object) v2b)) {
                    h3b4.i(h3b4.x0);
                    Context context = h3b4.getContext();
                    k2b customTheme = h3b4.getCustomTheme();
                    OneMeButton oneMeButton2 = null;
                    if (v2b instanceof p2b) {
                        oneMeButton = new OneMeButton(context, (AttributeSet) null);
                        oneMeButton.setCustomTheme(customTheme);
                        oneMeButton.d(Integer.valueOf(cad.d0), true);
                        ct.G(oneMeButton, 300, new lmf(v2b, 0));
                    } else if (v2b instanceof q2b) {
                        oneMeButton = new OneMeButton(context, (AttributeSet) null);
                        oneMeButton.setCustomTheme(customTheme);
                        oneMeButton.d(Integer.valueOf(cad.q0), true);
                        ct.G(oneMeButton, 300, new lmf(v2b, 1));
                    } else if (v2b instanceof t2b) {
                        t2b t2b = (t2b) v2b;
                        d3b d3b = t2b.a;
                        if (d3b instanceof a3b) {
                            OneMeButton oneMeButton3 = new OneMeButton(context, (AttributeSet) null);
                            oneMeButton3.setCustomTheme(customTheme);
                            oneMeButton3.d(Integer.valueOf(((a3b) t2b.a).a), true);
                            ct.G(oneMeButton3, 300, new lmf(v2b, 2));
                            oneMeButton = oneMeButton3;
                        } else if ((d3b instanceof c3b) || (d3b instanceof b3b)) {
                            throw new NotImplementedError("Left action should not support search icon");
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (v2b instanceof s2b) {
                        oneMeButton = null;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (oneMeButton != null) {
                        oneMeButton.setId(dad.M);
                        oneMeButton2 = oneMeButton;
                    }
                    h3b4.x0 = oneMeButton2;
                    if (oneMeButton2 != null) {
                        h3b4.h(oneMeButton2);
                        b59.w(oneMeButton2, MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 52) * vo4.c().getDisplayMetrics().density));
                    }
                    h3b4.l();
                    if (!h3b4.k()) {
                        h3b4.setShouldUpdateConstraints(true);
                        h3b4.requestLayout();
                        return;
                    }
                    return;
                }
                return;
            default:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                h3b h3b5 = this.b;
                if (booleanValue2 != booleanValue) {
                    h3b5.l();
                }
                if (h3b5.getSubtitleTextViewLazy().isInitialized()) {
                    h3b5.getSubtitleTextViewLazy().getValue().a(booleanValue);
                    return;
                }
                return;
        }
    }
}

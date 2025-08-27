package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: vl1  reason: default package */
public final class vl1 extends FrameLayout {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;

    public vl1(Context context) {
        super(context, (AttributeSet) null);
        lj1 lj1 = new lj1(6);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = LazyKt.lazy(lazyThreadSafetyMode, lj1);
        this.b = LazyKt.lazy(lazyThreadSafetyMode, new ul1(context, this, 0));
        this.c = LazyKt.lazy(lazyThreadSafetyMode, new ul1(context, this, 1));
    }

    private final tl1 getNewCallTopPanel() {
        return (tl1) this.b.getValue();
    }

    private final ql1 getOldCallTopPanel() {
        return (ql1) this.c.getValue();
    }

    public final void a() {
        ymf ymf = getNewCallTopPanel().H0;
        if (ymf != null) {
            ymf.a();
        }
    }

    public final boolean b() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }

    public final void c(boolean z) {
        if (b()) {
            tl1 newCallTopPanel = getNewCallTopPanel();
            if (!Intrinsics.areEqual((Object) newCallTopPanel.F0, (Object) Boolean.valueOf(z))) {
                newCallTopPanel.F0 = Boolean.valueOf(z);
                newCallTopPanel.K0.setIconTint(z ? l2b.f.f : l2b.g.b.f);
            }
        }
    }

    public final void d(boolean z, smf smf) {
        if (b()) {
            getNewCallTopPanel().N(z, smf);
        }
    }

    public final void e(boolean z) {
        if (b()) {
            tl1 newCallTopPanel = getNewCallTopPanel();
            y7e.k(newCallTopPanel.I0, z, 0, (Function1) null, 6);
            y7e.k(newCallTopPanel.J0, z, 0, (Function1) null, 6);
        }
    }

    public final void setAddUserState(boolean z) {
        if (b()) {
            getNewCallTopPanel().setAddUserState(z);
        }
    }

    public final void setClickListener(sl1 sl1) {
        if (b()) {
            getNewCallTopPanel().setClickListener(sl1);
        } else {
            getOldCallTopPanel().setClickListener(sl1);
        }
    }

    @Deprecated(message = "Will be deleted in https://jira.vk.team/browse/ONEME-11734")
    public final void setMode(vag vag) {
        if (!b()) {
            getOldCallTopPanel().setMode(vag);
        }
    }

    public final void setMoreState(boolean z) {
        if (b()) {
            getNewCallTopPanel().setMoreButtonVisible(z);
        }
    }

    public final void setStatus(CharSequence charSequence) {
        if (b()) {
            getNewCallTopPanel().setStatus(charSequence);
        } else {
            getOldCallTopPanel().setCallTime(charSequence);
        }
    }

    public final void setTitle(CharSequence charSequence) {
        if (b()) {
            getNewCallTopPanel().setTitle(charSequence);
        } else {
            getOldCallTopPanel().setTitle(charSequence);
        }
    }
}

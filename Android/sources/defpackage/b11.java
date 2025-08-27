package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;

/* renamed from: b11  reason: default package */
public final class b11 extends FrameLayout {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;

    public b11(Context context) {
        super(context, (AttributeSet) null);
        m mVar = new m(28);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = LazyKt.lazy(lazyThreadSafetyMode, mVar);
        this.b = LazyKt.lazy(lazyThreadSafetyMode, new a11(context, this, 0));
        this.c = LazyKt.lazy(lazyThreadSafetyMode, new a11(context, this, 1));
    }

    private final z01 getNewCallBottomPanel() {
        return (z01) this.b.getValue();
    }

    private final v01 getOldCallBottomPanel() {
        return (v01) this.c.getValue();
    }

    public final void a() {
        if (c()) {
            ymf ymf = getNewCallBottomPanel().v0;
            if (ymf != null) {
                ymf.dismiss();
                return;
            }
            return;
        }
        getOldCallBottomPanel().N();
    }

    public final void b() {
        if (c()) {
            ymf ymf = getNewCallBottomPanel().v0;
            if (ymf != null) {
                ymf.a();
                return;
            }
            return;
        }
        ymf ymf2 = getOldCallBottomPanel().O0;
        if (ymf2 != null) {
            ymf2.a();
        }
    }

    public final boolean c() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }

    public final void d(ArrayList arrayList) {
        if (!c()) {
            getOldCallBottomPanel().P(arrayList);
        }
    }

    public final void e() {
        if (c()) {
            getNewCallBottomPanel().b();
        } else {
            getOldCallBottomPanel().Q();
        }
    }

    public final void f(List list) {
        if (!c()) {
            getOldCallBottomPanel().R(list);
        }
    }

    public final void setAudioInfo(u41 u41) {
        if (c()) {
            getNewCallBottomPanel().setAudioInfo(u41);
        } else {
            getOldCallBottomPanel().setAudioInfo(u41);
        }
    }

    public final void setClickListener(y01 y01) {
        if (c()) {
            getNewCallBottomPanel().setClickListener(y01);
        } else {
            getOldCallBottomPanel().setClickListener(y01);
        }
    }

    public final void setMicrophoneEnabled(aj8 aj8) {
        if (c()) {
            getNewCallBottomPanel().setMicrophoneEnabled(aj8);
        } else {
            getOldCallBottomPanel().setMicrophoneEnabled(aj8);
        }
    }

    public final void setVideoEnabled(aj8 aj8) {
        if (c()) {
            getNewCallBottomPanel().setVideoEnabled(aj8);
        } else {
            getOldCallBottomPanel().setVideoEnabled(aj8);
        }
    }

    public final void setVolumeMicrophone(float f) {
        if (c()) {
            getNewCallBottomPanel().setVolumeMicrophone(f);
        }
    }
}

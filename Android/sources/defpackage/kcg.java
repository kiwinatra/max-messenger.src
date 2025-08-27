package defpackage;

import android.view.View;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* renamed from: kcg  reason: default package */
public final class kcg implements View.OnAttachStateChangeListener {
    public pm7 a;
    public final /* synthetic */ Function3 b;
    public final /* synthetic */ View c;

    public kcg(View view, Function3 function3) {
        this.b = function3;
        this.c = view;
    }

    public final void onViewAttachedToWindow(View view) {
        pm7 pm7 = this.a;
        if (pm7 == null || !pm7.isActive()) {
            this.a = bs0.K(new ps5((etc) fu4.k.e(view.getContext()).j, new jcg(this.b, this.c, (Continuation) null), 5), sag.b(view));
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        pm7 pm7 = this.a;
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
        this.a = null;
    }
}

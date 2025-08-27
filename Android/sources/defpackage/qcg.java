package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.jvm.functions.Function0;

/* renamed from: qcg  reason: default package */
public final class qcg implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ ViewTreeObserver b;
    public final /* synthetic */ View c;

    public qcg(Function0 function0, ViewTreeObserver viewTreeObserver, ViewGroup viewGroup) {
        this.a = function0;
        this.b = viewTreeObserver;
        this.c = viewGroup;
    }

    public final void onGlobalLayout() {
        if (((Boolean) this.a.invoke()).booleanValue()) {
            rcg.a(this, this.b, (ViewGroup) this.c);
        }
    }
}

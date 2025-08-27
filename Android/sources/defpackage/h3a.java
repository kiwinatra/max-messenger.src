package defpackage;

import android.util.Pair;
import android.view.View;
import ru.ok.messages.media.mediabar.ActLocalMedias;

/* renamed from: h3a  reason: default package */
public final /* synthetic */ class h3a implements tk3 {
    public final /* synthetic */ n2 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ int c;
    public final /* synthetic */ float[] d;

    public /* synthetic */ h3a(n2 n2Var, View view, int i, float[] fArr) {
        this.a = n2Var;
        this.b = view;
        this.c = i;
        this.d = fArr;
    }

    public final void accept(Object obj) {
        View focusedChild;
        k1a k1a = (k1a) obj;
        if (k1a.U()) {
            i3a i3a = (i3a) k1a.a;
            if (i3a.c0() && (focusedChild = i3a.w0.getFocusedChild()) != null) {
                hd8.C(focusedChild.getContext(), focusedChild);
            }
            i3a i3a2 = (i3a) k1a.a;
            Pair<Integer, Integer> pair = !i3a2.c0() ? new Pair<>(0, 0) : i3a2.w0.getPreviewScrollPosition();
            n99 n99 = k1a.c.a.b;
            m5 X2 = n99.w.X2();
            if (X2 != null) {
                o5h o5h = ((qra) n99.x).y().c.u() ? new o5h(this.b, (Object) null, this.d) : null;
                z38 a2 = a48.a();
                a2.d = "SELECTED_MEDIA_ALBUM";
                a2.f = this.c;
                n2 n2Var = this.a;
                a2.e = n2Var.a();
                a2.j = ((Integer) pair.first).intValue();
                a2.k = ((Integer) pair.second).intValue();
                ActLocalMedias.g0(X2, n2Var, o5h, a2, (uk2) null);
            }
        }
    }
}

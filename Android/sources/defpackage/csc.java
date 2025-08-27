package defpackage;

import java.lang.ref.WeakReference;
import ru.ok.onechat.reactions.ReactionsViewModel;

/* renamed from: csc  reason: default package */
public final /* synthetic */ class csc implements ztd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ csc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void j() {
        q3d q3d;
        switch (this.a) {
            case 0:
                fsc.b.getClass();
                fsc.a((ym) this.b);
                return;
            default:
                ReactionsViewModel reactionsViewModel = (ReactionsViewModel) ((WeakReference) this.b).get();
                if (reactionsViewModel != null && (q3d = reactionsViewModel.w) != null) {
                    q3d.a();
                    return;
                }
                return;
        }
    }
}

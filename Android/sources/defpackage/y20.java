package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.Set;
import ru.ok.messages.media.attaches.AudioAttachView;

/* renamed from: y20  reason: default package */
public final /* synthetic */ class y20 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AudioAttachView b;

    public /* synthetic */ y20(AudioAttachView audioAttachView, int i) {
        this.a = i;
        this.b = audioAttachView;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                AudioAttachView audioAttachView = this.b;
                if (audioAttachView.w0 != null) {
                    d20 d20 = audioAttachView.y;
                    if (d20 != null && d20.d()) {
                        audioAttachView.postDelayed(new cf(3, audioAttachView), 150);
                    }
                    x20 x20 = audioAttachView.w0;
                    if (x20 != null) {
                        gg9 gg9 = (gg9) x20;
                        w28 w28 = gg9.U0.a.a.x0;
                        t3a t3a = gg9.b1;
                        if (t3a != null) {
                            w28.F(0);
                            Iterator it = ((Set) ((l2a) t3a).a).iterator();
                            if (it.hasNext()) {
                                p99 p99 = ((k0a) it.next()).v;
                                p99.getClass();
                                p99.e.getClass();
                                r62.O();
                                throw null;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                x20 x202 = this.b.w0;
                if (x202 != null) {
                    gg9 gg92 = (gg9) x202;
                    if (gg92.b1 != null) {
                        a89 a89 = gg92.U0.a;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

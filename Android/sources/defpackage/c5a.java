package defpackage;

import android.animation.AnimatorSet;
import android.view.View;
import kotlin.coroutines.Continuation;
import ru.ok.messages.suggests.SuggestsFragment;
import ru.ok.messages.suggests.SuggestsViewModel;

/* renamed from: c5a  reason: default package */
public final /* synthetic */ class c5a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h5a b;
    public final /* synthetic */ npg c;

    public /* synthetic */ c5a(h5a h5a, npg npg, int i) {
        this.a = i;
        this.b = h5a;
        this.c = npg;
    }

    public final void onClick(View view) {
        String str;
        String str2;
        switch (this.a) {
            case 0:
                h5a h5a = this.b;
                AnimatorSet animatorSet = h5a.i;
                if (animatorSet == null || !animatorSet.isRunning()) {
                    AnimatorSet animatorSet2 = h5a.j;
                    if (animatorSet2 == null || !animatorSet2.isRunning()) {
                        npg npg = this.c;
                        SuggestsFragment suggestsFragment = (SuggestsFragment) npg.b;
                        SuggestsViewModel V2 = suggestsFragment.V2();
                        CharSequence charSequence = ((zuf) npg.c).d;
                        if (charSequence == null || (str = charSequence.toString()) == null) {
                            str = "";
                        }
                        if (((o85) V2.r.getValue()).a instanceof z1f) {
                            ev0.v(b0h.C(V2), ((osa) V2.d).a(), (f14) null, new m2f(V2, str, (Continuation) null), 2);
                        }
                        h5a h5a2 = suggestsFragment.p1;
                        if (h5a2 != null) {
                            h5a2.dismiss();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                h5a h5a3 = this.b;
                AnimatorSet animatorSet3 = h5a3.i;
                if (animatorSet3 == null || !animatorSet3.isRunning()) {
                    AnimatorSet animatorSet4 = h5a3.j;
                    if (animatorSet4 == null || !animatorSet4.isRunning()) {
                        npg npg2 = this.c;
                        SuggestsFragment suggestsFragment2 = (SuggestsFragment) npg2.b;
                        SuggestsViewModel V22 = suggestsFragment2.V2();
                        CharSequence charSequence2 = ((zuf) npg2.c).d;
                        if (charSequence2 == null || (str2 = charSequence2.toString()) == null) {
                            str2 = "";
                        }
                        if (((o85) V22.r.getValue()).a instanceof z1f) {
                            ev0.v(b0h.C(V22), ((osa) V22.d).a(), (f14) null, new h2f(V22, str2, (Continuation) null), 2);
                        }
                        h5a h5a4 = suggestsFragment2.p1;
                        if (h5a4 != null) {
                            h5a4.dismiss();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

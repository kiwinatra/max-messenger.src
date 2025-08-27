package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedList;
import kotlin.jvm.functions.Function0;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* renamed from: qf5  reason: default package */
public abstract class qf5 implements wcf {
    public View a;
    public final LinkedList b = new LinkedList();

    public void L0(scf scf) {
        Sequence<wcf> filter;
        for (pf5 pf5 : this.b) {
            Object obj = pf5.a;
            ViewGroup viewGroup = null;
            wcf wcf = obj instanceof wcf ? (wcf) obj : null;
            if (wcf != null) {
                wcf.L0(scf);
            }
            if (obj instanceof RecyclerView) {
                z69 z69 = new z69(1, (ViewGroup) obj);
                while (z69.hasNext()) {
                    View view = (View) z69.next();
                    pzc U = ((RecyclerView) obj).U(view);
                    wcf wcf2 = U instanceof wcf ? (wcf) U : null;
                    if (wcf2 != null) {
                        wcf2.L0(scf);
                    }
                    ViewGroup viewGroup2 = view instanceof ViewGroup ? (ViewGroup) view : null;
                    if (!(viewGroup2 == null || (filter = SequencesKt.filter(new mag(1, viewGroup2), m61.x)) == null)) {
                        for (wcf L0 : filter) {
                            L0.L0(scf);
                        }
                    }
                }
            } else {
                if (obj instanceof ViewGroup) {
                    viewGroup = (ViewGroup) obj;
                }
                if (viewGroup != null) {
                    for (wcf L02 : SequencesKt.filter(new mag(1, viewGroup), m61.w)) {
                        L02.L0(scf);
                    }
                }
            }
        }
    }

    public final void a(View view, jv7 jv7) {
        this.a = view;
        jv7.getLifecycle().a(new qyc(4, this));
    }

    public void b() {
    }

    public final w28 c(int i) {
        return new w28(this, (Function0) new of5((Object) this, i, 0));
    }
}

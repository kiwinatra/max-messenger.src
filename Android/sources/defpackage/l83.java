package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Lazy;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;

/* renamed from: l83  reason: default package */
public final class l83 extends tyc {
    public static final /* synthetic */ KProperty[] v = {rae.s(l83.class, NewHtcHomeBadger.COUNT, "getCount()I", 0)};
    public final bl o = new bl(this);

    public l83() {
        C(true);
        Delegates delegates = Delegates.INSTANCE;
    }

    public final int j() {
        return 1;
    }

    public final long k(int i) {
        return ((long) l83.class.hashCode()) + 1;
    }

    public final void s(pzc pzc, int i) {
        int intValue = ((Number) this.o.getValue(this, v[0])).intValue();
        View view = ((k83) pzc).a;
        String string = view.getResources().getString(qad.r1);
        if (intValue != 0) {
            string = string + "(" + intValue + ")";
        }
        AppCompatTextView appCompatTextView = view instanceof AppCompatTextView ? (AppCompatTextView) view : null;
        if (appCompatTextView != null) {
            appCompatTextView.setText(string);
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [k83, pzc] */
    public final pzc u(ViewGroup viewGroup, int i) {
        scf scf;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(ujc.row_common_chats_title, viewGroup, false);
        ? pzc = new pzc(inflate);
        if (inflate.isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context = inflate.getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context);
        }
        pzc.L0(scf);
        return pzc;
    }
}

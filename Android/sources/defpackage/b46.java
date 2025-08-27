package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Reflection;
import ru.ok.messages.settings.folders.settings.presentation.FolderSettingsViewModel;

/* renamed from: b46  reason: default package */
public final class b46 extends tyc implements ql7 {
    public List X;
    public final Function1 o;
    public final Function1 v;
    public final Function3 w;
    public final Function0 x;
    public final ou4 y;
    public final boolean z;

    public b46(d46 d46, Function1 function1, ir0 ir0, s01 s01, g46 g46, boolean z2, int i) {
        Function1 of3 = (i & 1) != 0 ? new of3(20) : d46;
        Function3 z36 = (i & 4) != 0 ? new z36(0) : ir0;
        Function0 a46 = (i & 8) != 0 ? new a46(0) : s01;
        g46 = (i & 16) != 0 ? null : g46;
        z2 = (i & 32) != 0 ? false : z2;
        this.o = of3;
        this.v = function1;
        this.w = z36;
        this.x = a46;
        this.y = g46;
        this.z = z2;
        this.X = new ArrayList();
    }

    public final void M(int i, int i2) {
        if (i2 >= 0 && i2 < this.X.size()) {
            cjf.G(this.X, i, i2);
            n(i, i2);
            ou4 ou4 = this.y;
            if (ou4 != null) {
                ArrayList arrayList = new ArrayList(this.X);
                FolderSettingsViewModel i3 = ((g46) ou4).b.i3();
                i3.getClass();
                i3.m = ((x16) arrayList.get(i2)).a;
            }
        }
    }

    public final int j() {
        boolean z2 = this.z;
        int size = this.X.size();
        return z2 ? size + 1 : size;
    }

    public final int l(int i) {
        if (i >= 0 && i < this.X.size()) {
            return ((x16) this.X.get(i)).e ? 0 : 1;
        }
        if (i == this.X.size()) {
            return 2;
        }
        throw new IllegalStateException(a81.m("Unknown position in ", Reflection.getOrCreateKotlinClass(b46.class).getSimpleName()));
    }

    public final void s(pzc pzc, int i) {
        if (pzc instanceof n56) {
            ((n56) pzc).j((x16) this.X.get(i));
            return;
        }
        y8a y8a = (y8a) pzc;
        View view = y8a.a;
        y8a.E0.setText(view.getContext().getString(qad.I2));
        y8a.F0.setImageDrawable(y8a.G0);
        ct.G(view, 300, new u99(8, (Object) y8a));
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        Function1 function1 = this.v;
        if (i == 0) {
            return new y36(LayoutInflater.from(viewGroup.getContext()).inflate(ujc.row_settings_folder, viewGroup, false), function1, this.w, this.y);
        }
        if (i == 1) {
            return new nvc(LayoutInflater.from(viewGroup.getContext()).inflate(ujc.row_settings_folder, viewGroup, false), this.o, function1);
        }
        if (i == 2) {
            return new y8a(LayoutInflater.from(viewGroup.getContext()).inflate(ujc.row_settings_folders_new_folder, viewGroup, false), this.x);
        }
        throw new IllegalStateException(wj6.h(i, "Unknown viewtype in "));
    }
}

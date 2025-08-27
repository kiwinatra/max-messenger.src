package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.coroutines.CoroutineContext;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: kwb  reason: default package */
public final class kwb extends tyc {
    public final long o;
    public final jwb v;
    public final r62 w;
    public final jtb x;
    public final ArrayList y;
    public String z;

    public kwb(long j, jwb jwb, boolean z2, boolean z3, String str, r62 r62, jtb jtb) {
        ArrayList arrayList = new ArrayList();
        this.y = arrayList;
        this.o = j;
        this.v = jwb;
        this.w = r62;
        this.x = jtb;
        if (z2) {
            arrayList.add(iwb.a);
        }
        arrayList.add(iwb.b);
        this.z = str;
        arrayList.add(iwb.o);
        if (z3) {
            cud cud = ((ltb) jtb).b;
            cud.getClass();
            if (cud.m(PmsKey.f101scheduledmessagesenabled, false)) {
                arrayList.add(iwb.c);
            }
        }
        C(true);
    }

    public final void E(u82 u82, od6 od6, a32 a32, hq6 hq6) {
        kv0.j(((ia2) u82).j(), (CoroutineContext) null, 3).e(od6, new hwb(this, hq6, a32));
    }

    public final void F(String str) {
        if (this.y.contains(iwb.o)) {
            this.z = str;
            try {
                m();
            } catch (Exception unused) {
            }
        }
    }

    public final int j() {
        return this.y.size();
    }

    public final long k(int i) {
        return (long) i;
    }

    public final int l(int i) {
        return ((iwb) this.y.get(i)).ordinal();
    }

    public final void s(pzc pzc, int i) {
        scf scf;
        z62 z62;
        boolean z2 = pzc instanceof a3e;
        long j = this.o;
        if (z2) {
            a3e a3e = (a3e) pzc;
            a32 G = a3e.E0.G(j);
            if (G != null) {
                long j2 = G.b.a().a;
                SwitchCompat switchCompat = a3e.I0;
                switchCompat.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
                ltb ltb = (ltb) a3e.F0;
                boolean X = G.X(ltb.a);
                View view = a3e.a;
                TextView textView = a3e.H0;
                AppCompatImageView appCompatImageView = a3e.G0;
                if (X) {
                    appCompatImageView.setImageResource(nad.X0);
                    textView.setText(j4b.u(view.getContext(), ltb.a.m(), j2));
                    switchCompat.setChecked(false);
                    switchCompat.setEnabled(true);
                } else {
                    if (!G.N()) {
                        hq hqVar = ltb.c;
                        if (hqVar.n() != 0) {
                            if (hqVar.n() != 0) {
                                appCompatImageView.setImageResource(nad.W0);
                                textView.setText(view.getContext().getText(qad.b6));
                                switchCompat.setChecked(true);
                                switchCompat.setEnabled(false);
                            }
                        }
                    }
                    appCompatImageView.setImageResource(nad.W0);
                    textView.setText(view.getContext().getString(qad.k6));
                    switchCompat.setChecked(true);
                    switchCompat.setEnabled(true);
                }
                switchCompat.setOnCheckedChangeListener(a3e);
            }
        } else if (pzc instanceof o2e) {
            o2e o2e = (o2e) pzc;
            a32 G2 = o2e.F0.G(j);
            if (G2 != null && (z62 = G2.b.q) != null) {
                if (z62 == null) {
                    z62 = z62.g;
                }
                int i2 = z62.b;
                o2e.D0.setText(i2 > 0 ? String.valueOf(i2) : "");
            }
        } else if (pzc instanceof ya) {
            ya yaVar = (ya) pzc;
            String str = this.z;
            yaVar.F0.setImageDrawable(yaVar.G0);
            yaVar.E0.setText(str);
            View view2 = yaVar.a;
            if (view2.isInEditMode()) {
                scf = vi4.f0;
            } else {
                Context context = view2.getContext();
                Lazy lazy = scf.b0;
                scf = j4b.k0(context);
            }
            view2.setBackground(scf.e());
            ct.G(view2, 300, new x4(9, (Object) yaVar));
        }
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        scf scf;
        iwb iwb = iwb.values()[i];
        int ordinal = iwb.ordinal();
        r62 r62 = this.w;
        jwb jwb = this.v;
        if (ordinal == 0) {
            return new a3e(viewGroup, jwb, r62, this.x);
        }
        if (ordinal == 1) {
            return new o2e(viewGroup, jwb, r62);
        }
        if (ordinal == 2) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(ujc.row_profile_scheduled_messages, viewGroup, false);
            pzc pzc = new pzc(inflate);
            AppCompatTextView appCompatTextView = (AppCompatTextView) inflate;
            if (inflate.isInEditMode()) {
                scf = vi4.f0;
            } else {
                Context context = inflate.getContext();
                Lazy lazy = scf.b0;
                scf = j4b.k0(context);
            }
            appCompatTextView.setTextColor(scf.K);
            appCompatTextView.setSupportCompoundDrawablesTintList(ColorStateList.valueOf(scf.K));
            appCompatTextView.setBackground(scf.e());
            ct.G(appCompatTextView, 300, new u99(28, (Object) jwb));
            return pzc;
        } else if (ordinal == 3) {
            return new ya(viewGroup, new o99(21, this));
        } else {
            throw new IllegalStateException("Unexpected value: " + iwb);
        }
    }
}

package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: xw3  reason: default package */
public final class xw3 extends tyc {
    public final /* synthetic */ int o;
    public final Object v;
    public final Object w;
    public boolean x;
    public Object y;

    public xw3(jkb jkb, lce lce) {
        this.o = 0;
        this.v = jkb;
        this.w = lce;
        this.x = false;
        this.y = af8.values();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: ze8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: ze8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: ze8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: ze8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void E(defpackage.ze8 r3, boolean r4) {
        /*
            r2 = this;
            java.lang.Object r2 = r2.y
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0008:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = r2.next()
            r1 = r0
            ze8 r1 = (defpackage.ze8) r1
            if (r1 != r3) goto L_0x0008
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            ze8 r0 = (defpackage.ze8) r0
            if (r0 == 0) goto L_0x001f
            r0.c = r4
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xw3.E(ze8, boolean):void");
    }

    public final int j() {
        switch (this.o) {
            case 0:
                return ((af8[]) this.y).length;
            case 1:
                return ((ArrayList) this.y).size();
            case 2:
                if (!this.x) {
                    return 0;
                }
                return ((List) this.y).size() == 2 ? 3 : 1;
            default:
                if (this.x) {
                    return ((List) this.v).size();
                }
                return 0;
        }
    }

    public long k(int i) {
        switch (this.o) {
            case 1:
                return (long) ((ze8) ((ArrayList) this.y).get(i)).ordinal();
            case 3:
                return (long) i;
            default:
                return super.k(i);
        }
    }

    public final int l(int i) {
        switch (this.o) {
            case 0:
                return ww3.$EnumSwitchMapping$0[((af8[]) this.y)[i].ordinal()] == 1 ? ijc.navigation_item_layout : ijc.edit_item_layout;
            case 1:
                ze8 ze8 = (ze8) ((ArrayList) this.y).get(i);
                return (ze8 == null ? -1 : vw3.$EnumSwitchMapping$0[ze8.ordinal()]) == 1 ? kjc.hide_menu_layout : kjc.item_layout;
            case 2:
                return ((List) this.y).size() == 2 ? (i == 0 || i == 2) ? lic.profile_live_location : lic.short_divider : lic.profile_live_location;
            default:
                return ((l5c) ((List) this.v).get(i)).a;
        }
    }

    public final void s(pzc pzc, int i) {
        switch (this.o) {
            case 0:
                if (pzc.w == ijc.navigation_item_layout) {
                    uw3 uw3 = (uw3) pzc;
                    ct.G(uw3.E0, 300, new xu3(2, (Object) uw3));
                    return;
                }
                sw3 sw3 = (sw3) pzc;
                af8 af8 = ((af8[]) this.y)[i];
                View view = sw3.a;
                Drawable b = ew3.b(view.getContext(), af8.a);
                ImageView imageView = sw3.E0;
                imageView.setImageDrawable(b);
                ct.G(imageView, 300, new pb(25, sw3, af8));
                if (af8 == af8.CLEAR_HISTORY) {
                    view.setEnabled(sw3.F0.x);
                    return;
                }
                return;
            case 1:
                ze8 ze8 = (ze8) ((ArrayList) this.y).get(i);
                if (pzc instanceof rw3) {
                    rw3 rw3 = (rw3) pzc;
                    boolean z = this.x;
                    View view2 = rw3.a;
                    Drawable b2 = ew3.b(view2.getContext(), ze8.a);
                    ImageView imageView2 = rw3.E0;
                    imageView2.setImageDrawable(b2);
                    Context context = view2.getContext();
                    Lazy lazy = scf.b0;
                    imageView2.setColorFilter(j4b.k0(context).x);
                    ct.G(view2, 300, new pb(24, rw3, ze8));
                    if (!ze8.o) {
                        view2.setEnabled(true);
                        imageView2.setAlpha(0.5f);
                    } else {
                        imageView2.setAlpha(1.0f);
                    }
                    boolean z2 = ze8.c;
                    View view3 = rw3.F0;
                    if (z2) {
                        view3.setVisibility(0);
                        Context context2 = view2.getContext();
                        view3.setBackground(i8b.J(j4b.k0(context2).B, j4b.k0(context2).j));
                    } else {
                        view3.setVisibility(4);
                    }
                    if (ze8 == ze8.CLEAR_HISTORY) {
                        view2.setEnabled(z);
                        view2.setBackground((Drawable) null);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                int i2 = pzc.w;
                if (i2 == lic.profile_live_location) {
                    y3c y3c = (y3c) pzc;
                    List list = (List) this.y;
                    n18 n18 = (n18) list.get(Math.min(list.size() - 1, i));
                    y3c.G0 = n18;
                    CharSequence charSequence = n18.c;
                    TextView textView = y3c.D0;
                    textView.setText(charSequence);
                    CharSequence charSequence2 = n18.d;
                    boolean A = cvg.A(charSequence2);
                    TextView textView2 = y3c.E0;
                    if (A) {
                        textView.setSingleLine(false);
                        textView.setMaxLines(2);
                        textView2.setVisibility(8);
                    } else {
                        textView.setSingleLine(true);
                        textView.setMaxLines(1);
                        textView2.setVisibility(0);
                        textView2.setText(charSequence2);
                    }
                    y3c.M();
                    return;
                } else if (i2 == lic.short_divider) {
                    ((zq4) pzc).M(xq4.SHORT_DIVIDER);
                    return;
                } else {
                    throw new IllegalStateException("position > getItemCount()");
                }
            default:
                k5c k5c = (k5c) pzc;
                l5c l5c = (l5c) ((List) this.v).get(i);
                k5c.F0 = l5c;
                ImageView imageView3 = k5c.E0;
                imageView3.setVisibility(0);
                scf scf = k5c.G0;
                imageView3.setColorFilter(scf.K);
                TextView textView3 = k5c.D0;
                textView3.setTextColor(scf.K);
                iq.N(textView3, textView3.getContext().getResources().getDimensionPixelSize(ydc.row_profile_with_icon__space_between_icon_and_text));
                int ordinal = l5c.ordinal();
                View view4 = k5c.a;
                switch (ordinal) {
                    case 0:
                        textView3.setText(view4.getContext().getString(qad.d));
                        imageView3.setImageResource(nad.p);
                        return;
                    case 1:
                        textView3.setText(view4.getContext().getString(qad.b));
                        imageView3.setImageResource(nad.q);
                        return;
                    case 2:
                        textView3.setText(view4.getContext().getString(qad.ba));
                        imageView3.setImageResource(nad.R1);
                        return;
                    case 3:
                        textView3.setText(qad.u9);
                        imageView3.setImageResource(nad.x1);
                        return;
                    case 4:
                        textView3.setText(qad.t9);
                        imageView3.setImageResource(nad.F);
                        return;
                    case 5:
                        textView3.setText(view4.getContext().getString(qad.N));
                        imageView3.setImageResource(nad.y);
                        return;
                    case 6:
                        textView3.setText(view4.getContext().getString(qad.r8));
                        imageView3.setImageResource(nad.K0);
                        return;
                    case 7:
                        textView3.setText(view4.getContext().getString(qad.p));
                        imageView3.setImageResource(nad.P0);
                        return;
                    case 8:
                        textView3.setText(view4.getContext().getString(qad.M));
                        imageView3.setImageResource(nad.F1);
                        return;
                    case 9:
                        textView3.setText((String) this.y);
                        Resources resources = textView3.getContext().getResources();
                        iq.N(textView3, resources.getDimensionPixelSize(ydc.row_profile_with_icon__space_between_icon_and_text) + resources.getDimensionPixelSize(ydc.row_profile_icon_size) + resources.getDimensionPixelSize(ydc.row_profile_with_icon__start_padding));
                        imageView3.setVisibility(8);
                        return;
                    case 10:
                        textView3.setText(view4.getContext().getString(qad.W9));
                        imageView3.setImageResource(nad.O1);
                        return;
                    default:
                        Locale locale = Locale.ENGLISH;
                        throw new IllegalArgumentException("Unimplemented ProfileRowType " + l5c);
                }
        }
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        switch (this.o) {
            case 0:
                return i == ijc.navigation_item_layout ? new uw3(viewGroup, (lce) ((Function0) this.w)) : new sw3(this, viewGroup, (jkb) ((Function1) this.v));
            case 1:
                return i == kjc.hide_menu_layout ? new tw3(viewGroup, (c28) ((Function0) this.w)) : new rw3(viewGroup, (vq7) ((Function1) this.v));
            case 2:
                int i2 = lic.profile_live_location;
                LayoutInflater layoutInflater = (LayoutInflater) this.v;
                if (i == i2) {
                    return new y3c(this, layoutInflater.inflate(ujc.row_profile_live_location, viewGroup, false));
                }
                if (i == lic.short_divider) {
                    return new zq4(layoutInflater.inflate(ujc.row_divider, viewGroup, false));
                }
                throw new IllegalStateException("Unknown type");
            default:
                return new k5c(LayoutInflater.from(viewGroup.getContext()).inflate(ujc.row_profile, viewGroup, false), (rma) this.w);
        }
    }

    public xw3(vq7 vq7, c28 c28) {
        this.o = 1;
        this.v = vq7;
        this.w = c28;
        this.x = false;
        this.y = new ArrayList(ArraysKt.toList((T[]) ze8.values()));
    }

    public xw3(Context context, z3c z3c) {
        this.o = 2;
        this.x = true;
        this.v = LayoutInflater.from(context);
        this.w = z3c;
    }

    public xw3(List list, rma rma, String str) {
        this.o = 3;
        this.x = true;
        this.v = list;
        this.w = rma;
        this.y = str;
        C(true);
    }
}

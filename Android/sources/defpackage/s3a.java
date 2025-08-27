package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Set;
import kotlin.Lazy;
import ru.ok.messages.messages.widgets.MessageComposeEditText;
import ru.ok.messages.views.fragments.base.FrgBaseProfile;

/* renamed from: s3a  reason: default package */
public final class s3a extends q2 implements bif, pre, q60, gf8, f2a {
    public static final /* synthetic */ int T0 = 0;
    public ImageView A0;
    public ImageView B0;
    public ImageView C0;
    public TextView D0;
    public qg0 E0;
    public final ViewGroup F0;
    public or7 G0;
    public boolean H0;
    public final gaf I0;
    public final boolean J0;
    public final df8 K0;
    public soc L0;
    public ce M0;
    public RecyclerView N0;
    public final ro4 O0;
    public Drawable P0;
    public GradientDrawable Q0;
    public GradientDrawable R0;
    public LayerDrawable S0;
    public MessageComposeEditText X;
    public ImageView Y;
    public ImageView Z;
    public tff o = tff.o;
    public final s60 v;
    public ImageView v0;
    public final mu8 w;
    public ImageView w0;
    public final nd x;
    public ImageView x0;
    public final boolean y;
    public ImageView y0;
    public View z;
    public ImageView z0;

    public s3a(Context context, s60 s60, ViewGroup viewGroup, mu8 mu8, nd ndVar, boolean z2, df8 df8, gaf gaf) {
        super(context);
        this.v = s60;
        this.F0 = viewGroup;
        this.w = mu8;
        this.x = ndVar;
        this.y = false;
        this.J0 = z2;
        this.K0 = df8;
        this.I0 = gaf;
        this.O0 = ro4.b();
    }

    public final void C(k50 k50) {
        for (p1a p1a : (Set) this.a) {
            p1a.c.a.Y(k50);
        }
    }

    /* JADX WARNING: type inference failed for: r1v33, types: [java.lang.Object, android.view.ActionMode$Callback] */
    /* JADX WARNING: type inference failed for: r1v34, types: [java.lang.Object, android.view.ActionMode$Callback] */
    /* JADX WARNING: type inference failed for: r0v75, types: [ce, java.lang.Object] */
    public final void M() {
        this.z = ((View) this.c).findViewById(lic.frg_chat__input_container);
        this.x0 = (ImageView) ((View) this.c).findViewById(lic.frg_chat__iv_show_menu_formatter);
        MessageComposeEditText messageComposeEditText = (MessageComposeEditText) ((View) this.c).findViewById(lic.frg_chat__edt_message);
        this.X = messageComposeEditText;
        messageComposeEditText.setListener(new grg(29, this));
        if (!this.J0 || ((Context) this.b).getResources().getConfiguration().orientation == 2) {
            if (this.K0 == df8.CUSTOM) {
                this.X.setCustomInsertionActionModeCallback(new Object());
                this.X.setCustomSelectionActionModeCallback(new Object());
                this.X.addTextChangedListener(new u2());
            } else {
                this.X.setCustomSelectionActionModeCallback(new hf8(this.X, this));
            }
        } else {
            if (this.N0 == null) {
                RecyclerView recyclerView = (RecyclerView) ((ViewStub) this.F0.findViewById(lic.miui_menu_view_stub)).inflate();
                this.N0 = recyclerView;
                recyclerView.setHasFixedSize(true);
            }
            this.N0.setLayoutManager(new LinearLayoutManager(0, false));
            MessageComposeEditText messageComposeEditText2 = this.X;
            RecyclerView recyclerView2 = this.N0;
            u6h u6h = new u6h(25, this);
            ? obj = new Object();
            obj.b = (View) this.c;
            obj.c = messageComposeEditText2;
            obj.o = recyclerView2;
            obj.v = u6h;
            xw3 xw3 = new xw3(new vq7(7, (Object) obj), new c28(2, obj));
            xw3.C(true);
            obj.w = xw3;
            recyclerView2.setAdapter(xw3);
            obj.a = true;
            this.M0 = obj;
            ct.G(this.x0, 300, new k3a(this, 2));
        }
        this.X.setOnClickListener(new k3a(this, 3));
        this.X.setMovementMethod(m99.a);
        cvg.x(this.X).b();
        ImageView imageView = (ImageView) ((View) this.c).findViewById(lic.frg_chat__iv_send);
        this.Y = imageView;
        ct.G(imageView, 300, new k3a(this, 8));
        if (this.y) {
            this.Y.setOnLongClickListener(new j3a(this, 2));
        }
        ImageView imageView2 = (ImageView) ((View) this.c).findViewById(lic.frg_chat__iv_scheduled_send);
        this.Z = imageView2;
        ct.G(imageView2, 300, new k3a(this, 9));
        ImageView imageView3 = (ImageView) ((View) this.c).findViewById(lic.frg_chat__iv_attach);
        this.w0 = imageView3;
        ct.G(imageView3, 300, new k3a(this, 10));
        ImageView imageView4 = (ImageView) ((View) this.c).findViewById(lic.frg_chat__iv_bot_commands);
        this.v0 = imageView4;
        ct.G(imageView4, 300, new k3a(this, 0));
        ImageView imageView5 = (ImageView) ((View) this.c).findViewById(lic.frg_chat__iv_icon);
        this.y0 = imageView5;
        lja s = new oa3(5, imageView5, jd.a).s(qe.a());
        or7 or7 = new or7(new td8(29, this), new q0a(14), m58.e);
        s.a(or7);
        this.G0 = or7;
        ImageView imageView6 = (ImageView) ((View) this.c).findViewById(lic.frg_chat__iv_smiles);
        this.z0 = imageView6;
        ct.G(imageView6, 300, new k3a(this, 1));
        this.z0.setOnLongClickListener(new j3a(this, 1));
        ImageView imageView7 = (ImageView) ((View) this.c).findViewById(lic.frg_chat__iv_broadcast_notif);
        this.A0 = imageView7;
        ct.G(imageView7, 300, new k3a(this, 4));
        ImageView imageView8 = (ImageView) ((View) this.c).findViewById(lic.frg_chat__iv_timer);
        this.B0 = imageView8;
        ct.G(imageView8, 300, new k3a(this, 5));
        TextView textView = (TextView) ((View) this.c).findViewById(lic.frg_chat__tv_timer);
        this.D0 = textView;
        ct.G(textView, 300, new k3a(this, 6));
        ImageView imageView9 = (ImageView) ((View) this.c).findViewById(lic.frg_chat__iv_constructor_buttons);
        this.C0 = imageView9;
        ct.G(imageView9, 300, new k3a(this, 7));
        this.Y.setImageDrawable(c0());
        Z(this.o);
    }

    public final void Z(tff tff) {
        int i;
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        int i4 = 0;
        tff tff2 = this.o;
        boolean z4 = tff.n;
        ImageView imageView = z4 ? this.Z : this.Y;
        if (z4) {
            this.Y.setVisibility(8);
        }
        boolean z5 = tff2.a;
        boolean z6 = tff.a;
        if (z5 != z6) {
            imageView.setVisibility(z6 ? 0 : 8);
        }
        Context context = (Context) this.b;
        boolean z7 = tff.e;
        boolean z8 = tff.n;
        if (!z8 && !(tff2.k == (z3 = tff.k) && tff2.e == z7)) {
            if (z7) {
                this.Y.setImageResource(nad.v1);
                this.Y.setColorFilter(fw3.a(context, lad.l));
            } else {
                Lazy lazy = scf.b0;
                scf k0 = j4b.k0(context);
                if (z3) {
                    this.Y.setImageDrawable(iq.E(nad.G, k0.l, context));
                } else {
                    this.Y.setImageDrawable(c0());
                    this.Y.setColorFilter(k0.l);
                }
            }
        }
        boolean z9 = this.o.l;
        boolean z10 = tff.l;
        if (z9 != z10) {
            this.y0.setVisibility(z10 ? 0 : 8);
        }
        tff tff3 = this.o;
        if (z8) {
            this.A0.setVisibility(8);
        } else {
            boolean z11 = tff3.c;
            boolean z12 = tff.c;
            if (z11 != z12) {
                this.A0.setVisibility(z12 ? 0 : 8);
            }
            if (z12 && tff3.d != (z2 = tff.d)) {
                this.A0.setImageResource(z2 ? nad.W0 : nad.X0);
            }
        }
        tff tff4 = this.o;
        boolean z13 = tff4.g;
        boolean z14 = tff.g;
        if (!(z13 == z14 && tff4.e == z7)) {
            this.z0.setImageResource(z14 ? z7 ? nad.z1 : cad.b1 : nad.E0);
        }
        tff tff5 = this.o;
        boolean z15 = tff5.j;
        boolean z16 = tff.j;
        if (z15 != z16) {
            this.w0.setVisibility(z16 ? 0 : 8);
            if (z16) {
                this.w0.post(new m3a(this, 0));
            }
        }
        if (z16 && (i3 = tff5.b) != (i2 = tff.b)) {
            if (i3 < i2) {
                this.w0.post(new m3a(this, 1));
            }
            qg0 qg0 = this.E0;
            qg0.Y = i2 > 0 ? -1 : 0;
            qg0.w0 = "";
            qg0.invalidateSelf();
        }
        tff tff6 = this.o;
        boolean z17 = tff6.f;
        boolean z18 = tff.f;
        if (z17 != z18) {
            this.B0.setVisibility(z18 ? 0 : 8);
        }
        if (!z18 || (i = tff.h) == 0) {
            this.D0.setVisibility(8);
        } else {
            this.D0.setVisibility(0);
            if (tff6.h != i) {
                this.D0.setText(fhf.e(i, context));
            }
        }
        boolean z19 = this.o.i;
        boolean z20 = tff.i;
        if (z19 != z20) {
            this.v0.setVisibility(z20 ? 0 : 8);
        }
        boolean z21 = this.o.m;
        boolean z22 = tff.m;
        if (z21 != z22) {
            ImageView imageView2 = this.C0;
            if (!z22) {
                i4 = 8;
            }
            imageView2.setVisibility(i4);
        }
        this.o = tff;
    }

    public final GradientDrawable a0() {
        if (this.Q0 == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            this.Q0 = gradientDrawable;
            this.O0.getClass();
            gradientDrawable.setCornerRadius((float) vo4.b((int) 12.0f));
        }
        return this.Q0;
    }

    public final void b(k50 k50) {
        for (p1a p1a : (Set) this.a) {
            p1a.c.a.Y(k50);
        }
    }

    public final void c() {
        k2b f = fu4.k.f((View) this.c);
        a0().setColor(f.c().i);
        this.z.setBackground(a0());
        Lazy lazy = scf.b0;
        Context context = (Context) this.b;
        scf k0 = j4b.k0(context);
        ((View) this.c).setBackgroundColor(f.a().f().a.a);
        this.X.setTextColor(f.getText().e);
        this.X.setHintTextColor(j4b.l0(0.4f, f.getText().h));
        MessageComposeEditText messageComposeEditText = this.X;
        f.getText().getClass();
        messageComposeEditText.setHighlightColor(-16745729);
        MessageComposeEditText messageComposeEditText2 = this.X;
        f.getText().getClass();
        iq.W(messageComposeEditText2, -16745729);
        this.Y.setBackground(k0.d());
        GradientDrawable d0 = d0();
        f.c().a.getClass();
        d0.setColor(-16745729);
        if (this.P0 == null) {
            this.P0 = ew3.b(context, cad.W0);
        }
        Drawable drawable = this.P0;
        f.getIcon().getClass();
        iq.a0(drawable, -1);
        this.w0.setBackground(k0.d());
        Drawable b = ew3.b(context, nad.s);
        if (b != null) {
            b.setColorFilter(f.getIcon().h, PorterDuff.Mode.SRC_IN);
        }
        qg0 qg0 = new qg0(b, k0.l);
        this.E0 = qg0;
        this.w0.setImageDrawable(qg0);
        this.v0.setColorFilter(f.getIcon().h);
        this.v0.setBackground(k0.d());
        this.y0.setColorFilter(f.getIcon().h);
        this.y0.setBackground(k0.d());
        this.z0.setColorFilter(f.getIcon().h);
        this.z0.setBackground(k0.d());
        this.A0.setColorFilter(f.getIcon().h);
        this.A0.setBackground(k0.d());
        this.B0.setColorFilter(f.getIcon().h);
        this.B0.setBackground(k0.d());
        this.D0.setTextColor(k0.N);
        this.C0.setColorFilter(f.getIcon().h);
        this.x0.setBackground(k0.d());
        this.x0.setColorFilter(f.getIcon().h);
        this.Z.setColorFilter(f.getIcon().h);
        this.Z.setBackground(k0.d());
    }

    public final LayerDrawable c0() {
        if (this.S0 == null) {
            GradientDrawable d0 = d0();
            if (this.P0 == null) {
                this.P0 = ew3.b((Context) this.b, cad.W0);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{d0, this.P0});
            this.S0 = layerDrawable;
            this.O0.getClass();
            int i = (int) 4.0f;
            layerDrawable.setLayerInset(1, vo4.b(i), vo4.b(i), vo4.b(i), vo4.b(i));
        }
        return this.S0;
    }

    public final GradientDrawable d0() {
        if (this.R0 == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            this.R0 = gradientDrawable;
            this.O0.getClass();
            gradientDrawable.setCornerRadius((float) vo4.b((int) 100.0f));
        }
        return this.R0;
    }

    public final void e() {
        for (p1a p1a : (Set) this.a) {
            p1a.c.a.getClass();
        }
    }

    public final String e0() {
        Editable text = this.X.getText();
        return text == null ? "" : text.toString().trim();
    }

    public final boolean g0() {
        return ((View) this.c).getVisibility() == 0;
    }

    public final void h() {
        for (p1a p1a : (Set) this.a) {
            p1a.c.a.getClass();
        }
    }

    public final void k(if8 if8) {
        int ordinal = if8.ordinal();
        nd ndVar = this.x;
        switch (ordinal) {
            case 0:
                ndVar.e("MARKDOWN_REGULAR_CLICK");
                return;
            case 1:
                ndVar.e("MARKDOWN_BOLD_CLICK");
                return;
            case 2:
                ndVar.e("MARKDOWN_ITALIC_CLICK");
                return;
            case 3:
                ndVar.e("MARKDOWN_UNDERLINE_CLICK");
                return;
            case 4:
                ndVar.e("MARKDOWN_MONOSPACE_CLICK");
                return;
            case 5:
                ndVar.e("MARKDOWN_LINK_CLICK");
                return;
            case 6:
                ndVar.e("MARKDOWN_STRIKETHROUGH_CLICK");
                return;
            case 7:
                ndVar.e("MARKDOWN_HEADING_CLICK");
                return;
            case 8:
                ndVar.e("MARKDOWN_RED_CLICK");
                return;
            default:
                return;
        }
    }

    public final void x(int i, int i2, String str) {
        CharSequence subSequence = this.X.getText() != null ? this.X.getText().subSequence(i, i2) : null;
        if (subSequence instanceof SpannableStringBuilder) {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) subSequence;
            xa9[] xa9Arr = (xa9[]) spannableStringBuilder.getSpans(i, i2, xa9.class);
            if (xa9Arr != null && xa9Arr.length > 0) {
                xa9 xa9 = xa9Arr[0];
                this.X.getText().subSequence(spannableStringBuilder.getSpanStart(xa9), spannableStringBuilder.getSpanEnd(xa9)).toString();
            }
        }
        for (p1a p1a : (Set) this.a) {
            FrgBaseProfile frgBaseProfile = p1a.c.a.b.o;
        }
    }

    public final void y(boolean z2) {
        if (!z2) {
            this.X.setFilters(new InputFilter[0]);
            return;
        }
        fg3 fg3 = new fg3(2);
        this.X.setFilters(new InputFilter[]{fg3});
    }
}

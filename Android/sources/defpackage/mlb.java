package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;

/* renamed from: mlb  reason: default package */
public final class mlb extends ConstraintLayout implements phf {
    public final ImageView E0;
    public final TextView F0;
    public final TextView G0;
    public final lg3 H0;
    public final TextView I0;
    public final TextView J0;
    public Function0 K0 = new lgb(13);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mlb(Context context) {
        super(context);
        Context context2 = context;
        h3b d = o54.d(context2, (AttributeSet) null);
        d.setId(zhc.oneme_settings_privacy_pin_code_toolbar);
        d.setBackgroundColor(0);
        d.setForm(z2b.a);
        d.setLeftActions(new p2b(new jkb(2, (Object) this)));
        d.setLayoutParams(new fj3(-1, -2));
        addView(d);
        ImageView imageView = new ImageView(context2);
        imageView.setId(zhc.oneme_settings_privacy_setup_pin_code_lock);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        js9 js9 = fu4.k;
        shapeDrawable.setTint(js9.e(imageView.getContext()).f().c().j);
        imageView.setBackground(shapeDrawable);
        float f = (float) 16;
        int roundToInt = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        imageView.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
        imageView.setImageResource(nad.R1);
        imageView.setImageTintList(ColorStateList.valueOf(js9.e(imageView.getContext()).f().getIcon().i));
        float f2 = (float) 64;
        imageView.setLayoutParams(new fj3(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density)));
        addView(imageView);
        this.E0 = imageView;
        TextView textView = new TextView(context2);
        textView.setId(zhc.oneme_settings_privacy_setup_pin_code_title);
        ogf ogf = puf.i;
        ogf.b(textView, uy4.b);
        textView.setTextColor(js9.e(textView.getContext()).f().getText().e);
        textView.setSingleLine(true);
        textView.setLayoutParams(new fj3(-2, -2));
        addView(textView);
        this.F0 = textView;
        TextView textView2 = new TextView(context2);
        textView2.setId(zhc.oneme_settings_privacy_setup_pin_code_description);
        textView2.setVisibility(8);
        puf.l.b(textView2, uy4.b);
        textView2.setTextColor(js9.e(textView2.getContext()).f().getText().f);
        fj3 fj3 = new fj3(-2, -2);
        textView2.setGravity(1);
        textView2.setLayoutParams(fj3);
        addView(textView2);
        this.G0 = textView2;
        lg3 lg3 = new lg3(context2, (AttributeSet) null);
        lg3.setId(zhc.oneme_settings_privacy_setup_pin_code_input);
        lg3.setKeyboardOpen(new lgb(14));
        lg3.setCountCells(4);
        lg3.setLayoutParams(new fj3(-2, -2));
        lg3.setSecure(true);
        lg3.setDisableInputsForError(false);
        u3b.a(lg3, new if3(lg3, lg3, 1));
        lg3.setKeyboardOpen(new ifb(4, lg3));
        addView(lg3);
        this.H0 = lg3;
        TextView textView3 = new TextView(context2);
        textView3.setId(zhc.oneme_settings_privacy_setup_pin_code_error);
        textView3.setVisibility(8);
        textView3.setTextAlignment(4);
        puf.o.b(textView3, uy4.b);
        textView3.setSingleLine(true);
        textView3.setLayoutParams(new fj3(-2, -2));
        addView(textView3);
        this.I0 = textView3;
        TextView textView4 = new TextView(context2);
        textView4.setId(zhc.oneme_settings_privacy_setup_pin_code_forgot);
        textView4.setVisibility(8);
        textView4.setText(gmc.oneme_settings_privacy_forgot_pin_code);
        textView4.isSingleLine();
        ogf.b(textView4, uy4.b);
        textView4.setTextAlignment(4);
        textView4.setLayoutParams(new fj3(-2, -2));
        addView(textView4);
        this.J0 = textView4;
        onThemeChanged(js9.e(getContext()).f());
        pj3 h = ct.h(this);
        int id = d.getId();
        h.e(id, 3, 0, 3);
        h.e(id, 6, 0, 6);
        h.e(id, 7, 0, 7);
        int id2 = imageView.getId();
        h.e(id2, 3, d.getId(), 4);
        float f3 = (float) 24;
        tr1.u(f3, vo4.c().getDisplayMetrics().density, new ila(h, 3, id2, 4));
        h.e(id2, 6, 0, 6);
        h.e(id2, 7, 0, 7);
        int id3 = textView.getId();
        h.e(id3, 3, imageView.getId(), 4);
        tr1.u(f3, vo4.c().getDisplayMetrics().density, new ila(h, 3, id3, 4));
        h.e(id3, 6, 0, 6);
        float f4 = (float) 12;
        tr1.u(f4, vo4.c().getDisplayMetrics().density, new ila(h, 6, id3, 4));
        h.e(id3, 7, 0, 7);
        new ila(h, 7, id3, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4));
        int id4 = textView2.getId();
        h.e(id4, 3, textView.getId(), 4);
        tr1.u(f4, vo4.c().getDisplayMetrics().density, new ila(h, 3, id4, 4));
        h.e(id4, 6, 0, 6);
        tr1.u(f4, vo4.c().getDisplayMetrics().density, new ila(h, 6, id4, 4));
        h.e(id4, 7, 0, 7);
        new ila(h, 7, id4, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4));
        int id5 = lg3.getId();
        h.e(id5, 3, textView.getId(), 4);
        tr1.u(f, vo4.c().getDisplayMetrics().density, new ila(h, 3, id5, 4));
        h.e(id5, 6, 0, 6);
        tr1.u(f4, vo4.c().getDisplayMetrics().density, new ila(h, 6, id5, 4));
        h.e(id5, 7, 0, 7);
        new ila(h, 7, id5, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4));
        int id6 = textView3.getId();
        h.e(id6, 3, lg3.getId(), 4);
        tr1.u(f, vo4.c().getDisplayMetrics().density, new ila(h, 3, id6, 4));
        h.e(id6, 6, 0, 6);
        tr1.u(f4, vo4.c().getDisplayMetrics().density, new ila(h, 6, id6, 4));
        h.e(id6, 7, 0, 7);
        new ila(h, 7, id6, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4));
        int id7 = textView4.getId();
        h.e(id7, 6, 0, 6);
        tr1.u(f4, vo4.c().getDisplayMetrics().density, new ila(h, 6, id7, 4));
        h.e(id7, 7, 0, 7);
        tr1.u(f4, vo4.c().getDisplayMetrics().density, new ila(h, 7, id7, 4));
        h.e(id7, 4, 0, 4);
        new ila(h, 4, id7, 4).e(MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density));
        h.a(this);
    }

    public final Function0<Unit> getOnBackPress() {
        return this.K0;
    }

    public final void onThemeChanged(k2b k2b) {
        setBackgroundColor(k2b.c().i);
        ImageView imageView = this.E0;
        imageView.getBackground().setTint(k2b.c().j);
        imageView.setImageTintList(ColorStateList.valueOf(k2b.getIcon().i));
        this.F0.setTextColor(k2b.getText().e);
        this.G0.setTextColor(k2b.getText().f);
        this.H0.onThemeChanged(k2b);
        this.I0.setTextColor(k2b.getText().b);
        k2b.getText().getClass();
        this.J0.setTextColor(-16745729);
    }

    public final void setDescription(Integer num) {
        TextView textView = this.G0;
        if (num != null) {
            textView.setText(num.intValue());
            textView.setVisibility(0);
        } else {
            textView.setText((CharSequence) null);
            textView.setVisibility(8);
        }
        int id = textView.getVisibility() == 0 ? textView.getId() : this.F0.getId();
        pj3 h = ct.h(this);
        new ni0((Object) h, this.H0.getId(), 4).Q(id).e(MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density));
        h.a(this);
    }

    public final void setErrorText(CharSequence charSequence) {
        TextView textView = this.I0;
        textView.setText(charSequence);
        boolean z = !(charSequence == null || charSequence.length() == 0);
        float f = c44.DEFAULT_ASPECT_RATIO;
        float f2 = z ? 1.0f : 0.0f;
        if (!z) {
            f = 1.0f;
        }
        textView.setAlpha(f);
        textView.animate().setDuration(200).alpha(f2).withEndAction(new c70((Object) this, z, 12)).start();
    }

    public final void setForgotPinCodeClickListener(Function0<Unit> function0) {
        TextView textView = this.J0;
        if (function0 != null) {
            textView.setVisibility(0);
            ct.G(textView, 300, new e7(18, function0));
            return;
        }
        textView.setVisibility(8);
        textView.setOnClickListener((View.OnClickListener) null);
    }

    public final void setListener(hg3 hg3) {
        this.H0.setListener(hg3);
    }

    public final void setLocked(boolean z) {
        this.E0.setImageResource(z ? nad.k1 : nad.R1);
    }

    public final void setOnBackPress(Function0<Unit> function0) {
        this.K0 = function0;
    }

    public final void setState(ig3 ig3) {
        this.H0.setState(ig3);
    }

    public final void setTitle(int i) {
        this.F0.setText(i);
    }
}

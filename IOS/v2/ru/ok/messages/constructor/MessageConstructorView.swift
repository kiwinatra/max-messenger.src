package ru.ok.messages.constructor;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import one.me.sdk.lists.widgets.EmptyRecyclerView;
import one.me.sdk.uikit.common.views.MaxHeightScrollView;
import ru.ok.messages.bots.ButtonsView;
import ru.ok.messages.views.widgets.TamAvatarView;
import ru.ok.tamtam.stickers.panel.RelativePanelLayout;

public class MessageConstructorView extends RelativePanelLayout implements iw0 {
    public static final /* synthetic */ int U0 = 0;
    public final yva A0;
    public final View B0;
    public final Button C0;
    public final View D0;
    public final TextView E0;
    public final ViewGroup F0;
    public final TextView G0;
    public final TextView H0;
    public final ImageView I0;
    public final LinearLayout J0;
    public final LinearLayout K0;
    public final TextView L0;
    public final TextView M0;
    public final TamAvatarView N0;
    public final FrameLayout O0;
    public final TextView P0;
    public ju8 Q0;
    public ju8 R0;
    public ju8 S0;
    public final dac T0;
    public final ro4 o;
    public long v = 0;
    public s3a v0;
    public s99 w;
    public final scf w0;
    public final EmptyRecyclerView x;
    public final ButtonsView x0;
    public ek3 y;
    public final MaxHeightScrollView y0;
    public i1a z;
    public final View z0;

    public MessageConstructorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        dac dac = new dac();
        this.T0 = dac;
        y64.I(dac);
        Context context2 = getContext();
        this.o = ro4.b();
        Lazy lazy = scf.b0;
        this.w0 = j4b.k0(context2);
        this.A0 = ((qra) ym.e()).v();
        View.inflate(context2, ujc.view_constructor, this);
        setClickable(true);
        this.N0 = (TamAvatarView) findViewById(lic.toolbar_constructor__iv_avatar);
        this.L0 = (TextView) findViewById(lic.toolbar_constructor__tv_title);
        this.M0 = (TextView) findViewById(lic.toolbar_constructor__tv_subtitle);
        y64.n(findViewById(lic.toolbar_constructor__iv_close), new q99(this, 3));
        y64.n(this.N0, new q99(this, 4));
        View findViewById = findViewById(lic.toolbar_constructor);
        Context context3 = getContext();
        int i = lad.j;
        findViewById.setBackground(new ColorDrawable(fw3.a(context3, i)));
        FrameLayout frameLayout = (FrameLayout) findViewById(lic.view_constructor__fl_content);
        this.O0 = frameLayout;
        frameLayout.setBackgroundColor(fw3.a(getContext(), i));
        this.x = (EmptyRecyclerView) findViewById(lic.view_constructor__rv_constructors);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.o1(true);
        this.x.setLayoutManager(linearLayoutManager);
        kj9 kj9 = new kj9(((qra) ym.e()).d());
        kj9.d = 0;
        this.x.setItemAnimator(kj9);
        this.z0 = findViewById(lic.view_constructor__init_progress);
        this.D0 = findViewById(lic.view_constructor__layout_empty_message);
        TextView textView = (TextView) findViewById(lic.view_constructor__tv_empty_message);
        this.E0 = textView;
        textView.setText(qad.I1);
        this.D0.setBackground(i8b.O(Integer.valueOf(fw3.a(getContext(), lad.c)), 0, 0, this.o.j));
        this.E0.setTextColor(-1);
        this.x0 = (ButtonsView) findViewById(lic.view_constructor__hint_buttons);
        MaxHeightScrollView maxHeightScrollView = (MaxHeightScrollView) findViewById(lic.view_constructor__sv_hint_buttons);
        this.y0 = maxHeightScrollView;
        this.o.getClass();
        maxHeightScrollView.setMaxHeight(vo4.b((int) 146.0f));
        this.B0 = findViewById(lic.view_constructor__bottom_shadow);
        this.x0.setClickListener(this);
        Button button = (Button) findViewById(lic.view_constructor__btn_send_to_chat);
        this.C0 = button;
        y64.n(button, new q99(this, 0));
        ViewGroup viewGroup = (ViewGroup) findViewById(lic.view_constructor__layout_progress);
        this.F0 = viewGroup;
        viewGroup.setClickable(true);
        this.G0 = (TextView) findViewById(lic.view_constructor__tv_sending_progress);
        ImageView imageView = (ImageView) findViewById(lic.view_constructor__iv_sending_progress);
        this.I0 = imageView;
        y64.n(imageView, new q99(this, 1));
        this.H0 = (TextView) findViewById(lic.view_constructor__tv_loading);
        this.J0 = (LinearLayout) findViewById(lic.view_constructor__bottom_controls);
        LinearLayout linearLayout = (LinearLayout) findViewById(lic.view_constructor__ll_show_keyboard);
        this.K0 = linearLayout;
        y64.n(linearLayout, new q99(this, 2));
        this.P0 = (TextView) findViewById(lic.view_constructor__tv_small_hint);
        this.w0 = j4b.k0(getContext());
        setVisibility(0);
        s3a s3a = this.v0;
        if (s3a != null) {
            s3a.c();
        }
        iq.d(this.w0, this.C0, this.o.n);
        r20 r20 = new r20(getContext());
        r20.m.setColor(this.w0.N);
        this.I0.setImageDrawable(r20);
        this.G0.setTextColor(this.w0.N);
        this.H0.setTextColor(this.w0.N);
        this.J0.setBackgroundColor(this.w0.n);
        ((ImageView) findViewById(lic.view_constructor__iv_show_keyboard)).setColorFilter(this.w0.N);
        ((TextView) findViewById(lic.view_constructor__tv_show_keyboard)).setTextColor(this.w0.N);
        this.K0.setBackground(this.w0.e());
        this.P0.setTextColor(this.w0.N);
    }

    public static void b(MessageConstructorView messageConstructorView) {
        messageConstructorView.setInputEnabled(true);
        messageConstructorView.K0.setVisibility(8);
        messageConstructorView.y0.setVisibility(8);
        messageConstructorView.z.c.V(new zj0(20));
        messageConstructorView.P0.setVisibility(8);
    }

    private void setInputEnabled(boolean z2) {
        a2a a2a = this.z.e;
        a2a.getClass();
        f2a f2a = a2a.a;
        int i = 0;
        if (f2a != null) {
            j4a j4a = (j4a) f2a;
            if ((j4a.x0.w.getVisibility() == 0) != z2) {
                j4a.x0.setPullerVisible(z2);
                j4a.w0.invalidate();
            }
        }
        p1a p1a = this.z.c;
        p1a.getClass();
        f2a f2a2 = p1a.a;
        if (f2a2 != null) {
            iq.X((ViewGroup) ((View) ((s3a) f2a2).c), z2);
        }
        if (z2) {
            f2a f2a3 = this.z.c.a;
            if (f2a3 != null) {
                ((View) ((s3a) f2a3).c).setVisibility(0);
            }
            ((RelativeLayout.LayoutParams) this.O0.getLayoutParams()).addRule(2, lic.view_constructor__cv_input_container);
            iq.L(this.C0, this.o.u);
        } else {
            f2a f2a4 = this.z.c.a;
            if (f2a4 != null) {
                ((View) ((s3a) f2a4).c).setVisibility(4);
            }
            ((RelativeLayout.LayoutParams) this.O0.getLayoutParams()).addRule(2, lic.view_constructor__bottom_controls);
            iq.L(this.C0, this.o.k);
        }
        View view = this.B0;
        if (!z2) {
            i = 4;
        }
        view.setVisibility(i);
    }

    public final void a(xv0 xv0, dw0 dw0) {
        this.T0.d(new r99(this, xv0, dw0, 0));
    }

    public final void c(String str, boolean z2) {
        this.P0.setText(str);
        if (z2) {
            this.D0.setVisibility(0);
            if (!cvg.A(str)) {
                this.E0.setText(str);
            } else {
                this.E0.setText(qad.I1);
            }
            this.P0.setVisibility(8);
        } else if (!this.v0.g0()) {
            this.D0.setVisibility(4);
            if (!cvg.A(str)) {
                this.P0.setVisibility(0);
            } else {
                this.P0.setVisibility(8);
            }
        } else {
            this.D0.setVisibility(4);
        }
    }

    public final void d() {
        boolean z2 = false;
        setInputEnabled(false);
        this.K0.setVisibility(0);
        this.y0.setVisibility(0);
        if (this.y.j() == 0) {
            z2 = true;
        }
        c(this.P0.getText().toString(), z2);
        post(new o99(1, this));
    }

    public final void e(Bundle bundle) {
        this.v = bundle.getLong("ru.ok.tamtam.extra.CONSTRUCTED_ID", 0);
        if (bundle.getBoolean("ru.ok.tamtam.extra.INPUT_VISIBLE")) {
            setInputEnabled(true);
        }
    }

    public final void f(boolean z2, dw0 dw0) {
        mc8 mc8;
        boolean z3 = !z2;
        p1a p1a = this.z.c;
        p1a.getClass();
        f2a f2a = p1a.a;
        if (f2a != null) {
            iq.X((ViewGroup) ((View) ((s3a) f2a).c), z3);
        }
        this.x0.setEnabled(z3);
        this.K0.setEnabled(z3);
        if (!z2) {
            this.F0.setVisibility(4);
            eq7 keyboard = this.x0.getKeyboard();
            if (keyboard != null) {
                ButtonsView buttonsView = this.x0;
                ArrayList arrayList = new ArrayList();
                for (ew0 it : keyboard.a()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = it.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((xv0) it2.next()).a(false));
                    }
                    arrayList.add(arrayList2);
                }
                buttonsView.a(new mc8(arrayList));
            }
        } else if (dw0 != null) {
            eq7 keyboard2 = this.x0.getKeyboard();
            if (keyboard2 == null) {
                mc8 = null;
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (ew0 arrayList4 : keyboard2.a()) {
                    arrayList3.add(new ArrayList(arrayList4));
                }
                int i = dw0.a;
                int i2 = dw0.b;
                ((ew0) arrayList3.get(i)).set(i2, ((xv0) ((ew0) arrayList3.get(i)).get(i2)).a(true));
                mc8 = new mc8(arrayList3);
            }
            this.x0.a(mc8);
        } else {
            this.F0.setVisibility(0);
            this.F0.bringToFront();
            this.I0.setVisibility(0);
            if (this.I0.getDrawable() != null) {
                this.I0.getDrawable().setLevel((int) c44.DEFAULT_ASPECT_RATIO);
            }
            this.G0.setVisibility(8);
            this.H0.setVisibility(8);
            this.F0.setBackgroundColor(0);
        }
    }

    public final void g(String str, String str2, List list) {
        this.z0.setVisibility(4);
        this.F0.setVisibility(8);
        int i = (this.v > 0 ? 1 : (this.v == 0 ? 0 : -1));
        if (i != 0 && i == 0) {
            boolean g0 = this.v0.g0();
        }
        setInputEnabled(false);
        this.y0.setVisibility(8);
        this.K0.setVisibility(8);
        this.z.b(false);
        c(str, list.isEmpty());
        if (this.y0.getVisibility() == 0) {
            iq.q(this.P0, this.o.j);
        } else {
            iq.q(this.P0, 0);
        }
        if (!cjf.B(list)) {
            this.x.setVisibility(0);
            this.x.post(new sx8(6, this, list));
            this.C0.setVisibility(0);
        } else {
            this.x.setVisibility(4);
            this.C0.setVisibility(8);
        }
        this.v = 0;
    }

    public i1a getControllerMessageInput() {
        return this.z;
    }

    public Rect getMessagesListTransitionRect() {
        EmptyRecyclerView emptyRecyclerView = this.x;
        Rect rect = rcg.a;
        rcg.d(rect, emptyRecyclerView);
        return rect;
    }

    public View getRoot() {
        return this;
    }

    public final void h() {
        this.z0.setVisibility(0);
        this.x.setVisibility(4);
        ek3 ek3 = this.y;
        ArrayList arrayList = ek3.v;
        if (arrayList != null) {
            arrayList.clear();
        }
        List list = ek3.w;
        if (list != null) {
            list.clear();
        }
        this.F0.setVisibility(4);
        this.C0.setVisibility(4);
        this.D0.setVisibility(4);
        this.K0.setVisibility(8);
        this.y0.setVisibility(8);
        this.P0.setVisibility(8);
        setInputEnabled(false);
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        float f;
        super.onLayout(z2, i, i2, i3, i4);
        int i5 = 0;
        for (int i6 = 0; i6 < this.x.getLayoutManager().w(); i6++) {
            View v2 = this.x.getLayoutManager().v(i6);
            i5 += v2.getPaddingBottom() + v2.getPaddingTop() + v2.getMeasuredHeight();
        }
        int height = (this.x.getHeight() - this.x.getPaddingTop()) - this.x.getPaddingBottom();
        if (i5 == 0 || i5 >= height) {
            f = c44.DEFAULT_ASPECT_RATIO;
        } else {
            f = (((float) i5) / 2.0f) + (-(((float) height) / 2.0f));
        }
        this.x.setTranslationY(f);
    }

    public void setListener(s99 s99) {
        this.w = s99;
    }
}

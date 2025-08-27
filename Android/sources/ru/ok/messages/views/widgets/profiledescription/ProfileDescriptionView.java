package ru.ok.messages.views.widgets.profiledescription;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Lazy;

public class ProfileDescriptionView extends LinearLayout {
    public final TextView a;
    public final EditText b;
    public final yy c;

    /* JADX WARNING: type inference failed for: r1v2, types: [yy, java.lang.Object] */
    public ProfileDescriptionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        LayoutInflater.from(getContext()).inflate(ujc.view_profile_description, this);
        ? obj = new Object();
        obj.a = ym.v.getResources().getInteger(bjc.channel_description_show_alert);
        obj.c = this;
        obj.b = ym.v.c().b.s();
        this.c = obj;
        TextView textView = (TextView) findViewById(lic.view_profile_description__tv_max_length);
        this.a = textView;
        textView.setTextColor(k0.N);
        TextView textView2 = (TextView) findViewById(lic.view_profile_description__tv_title);
        int i = k0.l;
        textView2.setTextColor(i);
        EditText editText = (EditText) findViewById(lic.view_profile_description__et_description);
        this.b = editText;
        editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.c.b)});
        this.b.setBackgroundColor(k0.n);
        this.b.setTextColor(k0.G);
        this.b.setHintTextColor(k0.N);
        iq.W(this.b, i);
        textView2.post(new ovb(2, this, textView2));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wnc.ProfileDescriptionView);
            textView2.setText(obtainStyledAttributes.getString(wnc.ProfileDescriptionView_title));
            this.b.setHint(obtainStyledAttributes.getString(wnc.ProfileDescriptionView_hint));
            obtainStyledAttributes.recycle();
        }
    }

    public final void a() {
        yy yyVar = this.c;
        EditText etDescription = ((ProfileDescriptionView) yyVar.c).getEtDescription();
        if (((or7) yyVar.o) == null) {
            lja s = new gb3(1, new imd(etDescription, 1)).s(qe.a());
            or7 or7 = new or7(new y3a(15, (Object) yyVar), m58.g, m58.e);
            s.a(or7);
            yyVar.o = or7;
        }
    }

    public final void clearFocus() {
        super.clearFocus();
        this.b.clearFocus();
    }

    public String getCurrentDescription() {
        return this.b.getText().toString().trim();
    }

    public EditText getEtDescription() {
        return this.b;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yy yyVar = this.c;
        or7 or7 = (or7) yyVar.o;
        if (or7 != null) {
            qq4.a(or7);
            yyVar.o = null;
        }
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            a();
            return;
        }
        yy yyVar = this.c;
        or7 or7 = (or7) yyVar.o;
        if (or7 != null) {
            qq4.a(or7);
            yyVar.o = null;
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            a();
            return;
        }
        yy yyVar = this.c;
        or7 or7 = (or7) yyVar.o;
        if (or7 != null) {
            qq4.a(or7);
            yyVar.o = null;
        }
    }

    public void setFocusable(boolean z) {
        super.setFocusable(z);
        this.b.setFocusable(z);
    }

    public void setHint(int i) {
        this.b.setHint(i);
    }

    public void setProfileDescriptionInterface(vxb vxb) {
        this.c.getClass();
    }
}

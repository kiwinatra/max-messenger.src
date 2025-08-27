package defpackage;

import android.content.Context;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import ru.ok.messages.views.dialogs.FrgDlgLangChoose;

/* renamed from: t13  reason: default package */
public final class t13 extends tyc {
    public final /* synthetic */ int o = 0;
    public final List v;
    public final Object w;
    public final Object x;
    public final Object y;

    public t13(Context context, ArrayList arrayList, Locale locale, FrgDlgLangChoose frgDlgLangChoose) {
        this.w = LayoutInflater.from(context);
        this.v = arrayList;
        this.x = locale;
        this.y = frgDlgLangChoose;
    }

    public final int j() {
        switch (this.o) {
            case 0:
                return this.v.size();
            default:
                return this.v.size();
        }
    }

    public final void s(pzc pzc, int i) {
        switch (this.o) {
            case 0:
                s13 s13 = (s13) pzc;
                dx0 dx0 = (dx0) this.v.get(i);
                r13 r13 = new r13(this, i, dx0, 0);
                boolean z = dx0.d;
                AppCompatCheckBox appCompatCheckBox = s13.D0;
                appCompatCheckBox.setChecked(z);
                s13.E0.setText(dx0.a);
                s13.F0.setText(dx0.c);
                s13.a.setOnClickListener(new pb(16, s13, r13));
                appCompatCheckBox.setOnClickListener(r13);
                return;
            default:
                rr7 rr7 = (rr7) pzc;
                Locale locale = (Locale) this.v.get(i);
                boolean equals = ((Locale) this.x).getLanguage().equals(locale.getLanguage());
                y64.n(rr7.a, new p00(11, rr7, locale));
                rr7.E0.setText(ghf.e(locale.getDisplayLanguage(locale)));
                rr7.F0.setText(ghf.e(locale.getDisplayLanguage()));
                ImageView imageView = rr7.G0;
                if (equals) {
                    imageView.setVisibility(0);
                    return;
                } else {
                    imageView.setVisibility(8);
                    return;
                }
        }
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        switch (this.o) {
            case 0:
                Context context = (Context) this.w;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setLayoutParams(new bzc(-1, -2));
                scf scf = (scf) this.x;
                RippleDrawable e = scf.e();
                linearLayout.setWeightSum(1.0f);
                linearLayout.setBackground(e);
                ct.b(linearLayout);
                ro4 ro4 = (ro4) this.y;
                iq.t(linearLayout, ro4.p);
                iq.r(linearLayout, ro4.v);
                iq.q(linearLayout, ro4.k);
                iq.u(linearLayout, ro4.k);
                AppCompatCheckBox appCompatCheckBox = new AppCompatCheckBox(context, (AttributeSet) null);
                ogf ogf = puf.k;
                ogf.b(appCompatCheckBox, uy4.b);
                int i2 = scf.l;
                appCompatCheckBox.setHighlightColor(i2);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                layoutParams.gravity = 16;
                ct.b(appCompatCheckBox);
                iq.r(appCompatCheckBox, ro4.d);
                linearLayout.addView(appCompatCheckBox, layoutParams);
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
                appCompatTextView.setTextColor(scf.G);
                ogf.b(appCompatTextView, uy4.b);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                appCompatTextView.setEllipsize(truncateAt);
                appCompatTextView.setSingleLine(true);
                appCompatTextView.setLines(1);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.weight = 1.0f;
                layoutParams2.gravity = 8388627;
                ct.b(appCompatTextView);
                appCompatTextView.setTextAlignment(5);
                linearLayout.addView(appCompatTextView, layoutParams2);
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, (AttributeSet) null);
                appCompatTextView2.setTextColor(i2);
                ogf.b(appCompatTextView2, uy4.b);
                appCompatTextView2.setEllipsize(truncateAt);
                appCompatTextView2.setSingleLine(true);
                appCompatTextView2.setLines(1);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams3.gravity = 8388627;
                ct.b(appCompatCheckBox);
                appCompatTextView.setTextAlignment(5);
                linearLayout.addView(appCompatTextView2, layoutParams3);
                return new s13(linearLayout, appCompatCheckBox, appCompatTextView, appCompatTextView2);
            default:
                return new rr7(((LayoutInflater) this.w).inflate(ujc.row_language, viewGroup, false), (FrgDlgLangChoose) this.y);
        }
    }

    public t13(Context context, ArrayList arrayList) {
        this.w = context;
        this.v = arrayList;
        Lazy lazy = scf.b0;
        this.x = j4b.k0(context);
        this.y = ro4.b();
    }
}

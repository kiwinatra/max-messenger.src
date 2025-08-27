package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;

/* renamed from: prb  reason: default package */
public final class prb extends BaseAdapter {
    public final Context a;
    public final scf b;
    public final ro4 c = ro4.b();
    public final List o;
    public final dy5 v;

    public prb(Context context, ArrayList arrayList, dy5 dy5) {
        this.a = context;
        this.o = arrayList;
        this.v = dy5;
        Lazy lazy = scf.b0;
        this.b = j4b.k0(context);
    }

    public final FrameLayout a(int i, int i2) {
        Context context = this.a;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new bzc(i2, -2));
        scf scf = this.b;
        frameLayout.setBackground(scf.e());
        ct.b(frameLayout);
        ro4 ro4 = this.c;
        iq.t(frameLayout, ro4.m);
        iq.r(frameLayout, ro4.r);
        iq.q(frameLayout, ro4.k);
        iq.u(frameLayout, ro4.k);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setTextColor(scf.x);
        appCompatTextView.setTextSize(2, 16.0f);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setSingleLine(true);
        appCompatTextView.setLines(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388611;
        ct.b(appCompatTextView);
        appCompatTextView.setTextAlignment(5);
        appCompatTextView.setCompoundDrawablePadding(ro4.m);
        frameLayout.addView(appCompatTextView, layoutParams);
        cy5 cy5 = (cy5) this.o.get(i);
        frameLayout.setOnClickListener(new h24(27, (Object) this, (Object) cy5));
        cy5.getClass();
        appCompatTextView.setText("Убрать из папки");
        hsg.D((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null, appCompatTextView);
        return frameLayout;
    }

    public final int getCount() {
        return this.o.size();
    }

    public final Object getItem(int i) {
        return this.o.get(i);
    }

    public final long getItemId(int i) {
        return (long) ((cy5) this.o.get(i)).a;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return a(i, -1);
    }

    public final boolean hasStableIds() {
        return true;
    }
}

package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;

/* renamed from: u32  reason: default package */
public final class u32 extends LinearLayout implements phf {
    public final vl2 a;
    public final AppCompatTextView b;
    public t32 c;
    public final t56 o;

    public u32(Context context, ExecutorService executorService) {
        super(context, (AttributeSet) null);
        vl2 vl2 = new vl2(context);
        this.a = vl2;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setText(q8.p(nna.a, appCompatTextView.getContext()));
        puf.i.b(appCompatTextView, uy4.b);
        js9 js9 = fu4.k;
        appCompatTextView.setTextColor(js9.e(appCompatTextView.getContext()).f().getText().e);
        this.b = appCompatTextView;
        t56 t56 = new t56((Object) new s32(this), executorService, 6);
        this.o = t56;
        RecyclerView recyclerView = new RecyclerView(context, (AttributeSet) null);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        recyclerView.setAdapter(t56);
        recyclerView.setItemAnimator((yyc) null);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.n1(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.j(new fr(1));
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        vl2.setClipToOutline(true);
        vl2.setOutlineProvider(new lr0(vo4.c().getDisplayMetrics().density * 16.0f, 1));
        float f = (float) 16;
        setBackground(i8b.O(Integer.valueOf(js9.e(getContext()).f().c().f), (Integer) null, (Integer) null, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f)));
        setPaddingRelative(0, 0, 0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        addView(vl2, new LinearLayout.LayoutParams(-1, MathKt.roundToInt(((float) 220) * vo4.c().getDisplayMetrics().density)));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMarginStart(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        layoutParams.topMargin = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
        layoutParams.bottomMargin = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
        Unit unit = Unit.INSTANCE;
        addView(appCompatTextView, layoutParams);
        addView(recyclerView);
    }

    private final void setSelectedBackground(Drawable drawable) {
        this.a.setBackgroundPreview(drawable);
    }

    public final void a(ul2 ul2) {
        vl2 vl2 = this.a;
        vl2.getClass();
        vj9 vj9 = ul2.e;
        a32 a32 = ul2.a;
        a89 a89 = ul2.c;
        jf9 e = vj9.e(vj9, a32, a89, true);
        a89 a892 = ul2.b;
        jf9 e2 = vj9.e(vj9, a32, a892, true);
        vff vff = vl2.a;
        if (e2 != null) {
            vff.setTextMessageLayout(e2);
        }
        r89 r89 = vl2.c;
        vff.setBackground(r89);
        gsb gsb = a892.v;
        gsb.g();
        vff.h(gsb.k, false);
        vff vff2 = vl2.b;
        if (e != null) {
            vff2.setTextMessageLayout(e);
        }
        r89 r892 = vl2.o;
        vff2.setBackground(r892);
        vff2.setDateViewStatus(ul2.d);
        gsb gsb2 = a89.v;
        gsb2.g();
        vff2.h(gsb2.k, false);
        hq2 hq2 = ul2.f;
        int[] iArr = hq2.e().a.l;
        r89.getClass();
        KProperty[] kPropertyArr = r89.z;
        r89.v.setValue(r89, kPropertyArr[0], iArr);
        vff.setDateTextColor(hq2.e().b.f);
        vff.setTextMessageColors(hq2.a(true));
        vff.getBackground().invalidateSelf();
        vff.requestLayout();
        int[] iArr2 = hq2.i().a.l;
        r892.getClass();
        r892.w.setValue(r892, kPropertyArr[1], iArr2);
        vff2.setDateTextColor(hq2.i().b.f);
        vff2.setTextMessageColors(hq2.i());
        vff2.getBackground().invalidateSelf();
        vff2.requestLayout();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c = null;
    }

    public final void onThemeChanged(k2b k2b) {
        Drawable background = getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(k2b.c().f);
        }
        this.b.setTextColor(k2b.getText().e);
        fu4.e(fu4.k.e(getContext()), this);
    }

    public final void setBackgroundSelectedListener(t32 t32) {
        this.c = t32;
    }

    public final void setThemeItems(List<y32> list) {
        Drawable drawable;
        Object obj;
        boolean z;
        this.o.G(list);
        Iterator it = list.iterator();
        while (true) {
            drawable = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Boolean bool = ((y32) obj).a;
            if (bool != null) {
                z = bool.booleanValue();
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        y32 y32 = (y32) obj;
        if (y32 != null) {
            drawable = y32.c;
        }
        setSelectedBackground(drawable);
    }
}

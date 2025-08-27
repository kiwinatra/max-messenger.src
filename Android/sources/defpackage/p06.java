package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;

/* renamed from: p06  reason: default package */
public final class p06 extends tyc {
    public final /* synthetic */ int o = 1;
    public final Object v;
    public final Object w;

    public p06(Function1 function1) {
        this.v = function1;
        this.w = new ArrayList();
    }

    public void E(List list) {
        ArrayList arrayList = (ArrayList) this.w;
        mo4 h = h88.h(new c71(2, arrayList, list));
        arrayList.clear();
        arrayList.addAll(list);
        h.a(new y35(2, (Object) this));
    }

    public final int j() {
        switch (this.o) {
            case 0:
                return ((ArrayList) this.w).size();
            default:
                return ((List) this.v).size();
        }
    }

    public long k(int i) {
        switch (this.o) {
            case 1:
                return ((xr6) ((List) this.v).get(i)).a;
            default:
                return super.k(i);
        }
    }

    public int l(int i) {
        switch (this.o) {
            case 1:
                return lic.view_type_sticker_gif;
            default:
                return super.l(i);
        }
    }

    public final void s(pzc pzc, int i) {
        switch (this.o) {
            case 0:
                o06 o06 = (o06) pzc;
                qo5 qo5 = (qo5) ((ArrayList) this.w).get(i);
                String str = qo5.a;
                TextView textView = o06.D0;
                textView.setText(str);
                boolean z = qo5.c;
                int i2 = 0;
                scf scf = o06.E0;
                if (z) {
                    int i3 = scf.l;
                    float[] fArr = new float[8];
                    while (i2 < 8) {
                        fArr[i2] = (float) MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
                        i2++;
                    }
                    textView.setBackground(i8b.g(i3, scf.j, i3, fArr));
                    textView.setTextColor(scf.m);
                } else {
                    int i4 = scf.J;
                    float[] fArr2 = new float[8];
                    while (i2 < 8) {
                        fArr2[i2] = (float) MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
                        i2++;
                    }
                    textView.setBackground(i8b.g(i4, scf.j, i4, fArr2));
                    textView.setTextColor(scf.G);
                }
                ct.G(textView, 300, new h24(4, (Object) o06.F0, (Object) qo5));
                return;
            default:
                pr6 pr6 = (pr6) pzc;
                xr6 xr6 = (xr6) ((List) this.v).get(i);
                xr6 xr62 = pr6.D0;
                if (xr62 == null || xr62.a != xr6.a) {
                    pr6.D0 = xr6;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) pr6.a;
                    e eVar = (e) xr6.b.b;
                    knb a = ld9.p.get();
                    a.d = v87.a;
                    String str2 = eVar.c;
                    if (str2 == null || str2.isEmpty()) {
                        a.e = qa7.b(str2);
                    } else {
                        a.c(Uri.parse(str2));
                    }
                    a.j = true;
                    jnb a2 = a.a();
                    simpleDraweeView.setAspectRatio(((float) eVar.a) / ((float) eVar.b));
                    simpleDraweeView.setController(a2);
                    return;
                }
                return;
        }
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        switch (this.o) {
            case 0:
                return new o06(this, LayoutInflater.from(viewGroup.getContext()).inflate(ujc.item_folder_filter, viewGroup, false));
            default:
                SimpleDraweeView simpleDraweeView = new SimpleDraweeView(viewGroup.getContext());
                tp6 tp6 = new tp6(viewGroup.getResources());
                tp6.b = 0;
                simpleDraweeView.setHierarchy(tp6.a());
                simpleDraweeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                Context context = viewGroup.getContext();
                Lazy lazy = scf.b0;
                simpleDraweeView.setBackgroundColor(j4b.k0(context).I);
                ig5 ig5 = ((sp6) simpleDraweeView.getHierarchy()).e;
                ig5.Z = 0;
                if (ig5.Y == 1) {
                    ig5.Y = 0;
                }
                pzc pzc = new pzc(simpleDraweeView);
                wr6 wr6 = (wr6) ((qr6) this.w);
                y64.n(simpleDraweeView, new p00(9, pzc, wr6));
                simpleDraweeView.setOnLongClickListener(new yb1(8, pzc, wr6));
                return pzc;
        }
    }

    public p06(ArrayList arrayList, wr6 wr6) {
        this.v = arrayList;
        this.w = wr6;
    }
}

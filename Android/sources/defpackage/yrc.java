package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieFactory;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: yrc  reason: default package */
public final class yrc extends fzc {
    public final RecyclerView a;
    public final vqc b;
    public final Function0 c;
    public final String d = yrc.class.getName();
    public final LinkedHashSet e = new LinkedHashSet();
    public final LinkedList f = new LinkedList();
    public boolean g;

    public yrc(EndlessRecyclerView2 endlessRecyclerView2, vqc vqc, c28 c28) {
        this.a = endlessRecyclerView2;
        this.b = vqc;
        this.c = c28;
    }

    public static final Rect c(yrc yrc, View view) {
        View view2 = (View) yrc.c.invoke();
        if (view2 == null || view == null) {
            return null;
        }
        return rcg.c(view, view2);
    }

    public static final void d(yrc yrc, String str, long j, Rect rect) {
        yrc yrc2 = yrc;
        long j2 = j;
        String str2 = yrc2.d;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, str2, wj6.i(j2, "Play message "), (Throwable) null);
        }
        RLottieFactory rLottieFactory = RLottieFactory.INSTANCE;
        RLottieDrawable createByUrl$default = RLottieFactory.createByUrl$default(str, MathKt.roundToInt(((float) erc.b.getWidth()) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) erc.b.getHeight()) * vo4.c().getDisplayMetrics().density), false, false, true, false, true, false, 72, (Object) null);
        createByUrl$default.setAutoRepeat(0);
        yrc2.b.a(j2, createByUrl$default, rect);
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        this.b.setScrollOffset(-i2);
        if (this.g) {
            this.g = false;
            u3b.a(recyclerView, new tj7(22, recyclerView, this));
            return;
        }
        g(false);
    }

    public final void e(long j, hqc hqc, String str) {
        String str2 = this.d;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            a67.d(w78, str2, "Add reaction effect, reaction:" + hqc + ", " + j, (Throwable) null);
        }
        this.e.add(new vrc(j, hqc, str));
    }

    public final boolean f(int i) {
        RecyclerView recyclerView = this.a;
        LinearLayoutManager v = y7e.v(recyclerView);
        int V0 = v != null ? v.V0() : -1;
        LinearLayoutManager v2 = y7e.v(recyclerView);
        return i == -1 || V0 > i || i > (v2 != null ? v2.X0() : -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r6 = r1.longValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(boolean r11) {
        /*
            r10 = this;
            java.util.LinkedList r0 = r10.f
            java.lang.Object r1 = r0.peek()
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x0049
            long r6 = r1.longValue()
            androidx.recyclerview.widget.RecyclerView r2 = r10.a
            pzc r5 = r2.N(r6)
            if (r5 != 0) goto L_0x0017
            return
        L_0x0017:
            java.util.LinkedHashSet r2 = r10.e
            java.util.Iterator r2 = r2.iterator()
        L_0x001d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0031
            java.lang.Object r3 = r2.next()
            r4 = r3
            vrc r4 = (defpackage.vrc) r4
            long r8 = r4.a
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x001d
            goto L_0x0032
        L_0x0031:
            r3 = 0
        L_0x0032:
            r8 = r3
            vrc r8 = (defpackage.vrc) r8
            if (r8 != 0) goto L_0x003b
            r0.remove(r1)
            return
        L_0x003b:
            wrc r0 = new wrc
            androidx.recyclerview.widget.RecyclerView r1 = r10.a
            r2 = r0
            r3 = r1
            r4 = r10
            r9 = r11
            r2.<init>(r3, r4, r5, r6, r8, r9)
            defpackage.u3b.a(r1, r0)
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yrc.g(boolean):void");
    }
}

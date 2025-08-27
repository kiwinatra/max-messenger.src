package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: m35  reason: default package */
public final class m35 implements i25 {
    public final g6d a;
    public final Context b;
    public final String c = m35.class.getName();
    public final n6e d;
    public final bs5 e;
    public final Lazy f;
    public final ConcurrentHashMap g;

    public m35(g6d g6d, Context context, Lazy lazy) {
        this.a = g6d;
        this.b = context;
        n6e b2 = m5a.b(0, 1, cu0.b, 1);
        this.d = b2;
        this.e = bs0.v(new dtc(b2), 100);
        this.f = LazyKt.lazy(new j35(0, (Object) lazy, (Object) this));
        this.g = new ConcurrentHashMap(25);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: dge[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: dge[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: dge} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: dge[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: dge[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(android.view.View r6) {
        /*
            if (r6 == 0) goto L_0x009a
            int r0 = r6.getVisibility()
            if (r0 != 0) goto L_0x009a
            boolean r0 = r6 instanceof defpackage.e25
            if (r0 == 0) goto L_0x0013
            e25 r6 = (defpackage.e25) r6
            r6.f()
            goto L_0x009a
        L_0x0013:
            boolean r0 = r6 instanceof androidx.recyclerview.widget.RecyclerView
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0040
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            int r0 = r6.getChildCount()
        L_0x001f:
            if (r2 >= r0) goto L_0x009a
            android.view.View r3 = r6.getChildAt(r2)
            if (r3 != 0) goto L_0x0028
            goto L_0x003d
        L_0x0028:
            pzc r4 = r6.U(r3)
            boolean r5 = r4 instanceof defpackage.e25
            if (r5 == 0) goto L_0x0033
            e25 r4 = (defpackage.e25) r4
            goto L_0x0034
        L_0x0033:
            r4 = r1
        L_0x0034:
            if (r4 != 0) goto L_0x003a
            c(r3)
            goto L_0x003d
        L_0x003a:
            r4.f()
        L_0x003d:
            int r2 = r2 + 1
            goto L_0x001f
        L_0x0040:
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0056
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            int r0 = r6.getChildCount()
        L_0x004a:
            if (r2 >= r0) goto L_0x009a
            android.view.View r1 = r6.getChildAt(r2)
            c(r1)
            int r2 = r2 + 1
            goto L_0x004a
        L_0x0056:
            boolean r0 = r6 instanceof android.widget.EditText
            if (r0 == 0) goto L_0x0060
            android.widget.EditText r6 = (android.widget.EditText) r6
            r6.requestLayout()
            goto L_0x009a
        L_0x0060:
            boolean r0 = r6 instanceof android.widget.TextView
            if (r0 == 0) goto L_0x009a
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.CharSequence r0 = r6.getText()
            boolean r3 = r0 instanceof android.text.Spannable
            if (r3 == 0) goto L_0x0084
            int r3 = r0.length()
            boolean r4 = r0 instanceof android.text.Spanned     // Catch:{ all -> 0x0082 }
            if (r4 == 0) goto L_0x0079
            android.text.Spanned r0 = (android.text.Spanned) r0     // Catch:{ all -> 0x0082 }
            goto L_0x007a
        L_0x0079:
            r0 = r1
        L_0x007a:
            if (r0 == 0) goto L_0x0082
            java.lang.Class<dge> r4 = defpackage.dge.class
            java.lang.Object[] r1 = r0.getSpans(r2, r3, r4)     // Catch:{ all -> 0x0082 }
        L_0x0082:
            dge[] r1 = (defpackage.dge[]) r1
        L_0x0084:
            if (r1 != 0) goto L_0x0087
            goto L_0x009a
        L_0x0087:
            int r0 = r1.length
        L_0x0088:
            if (r2 >= r0) goto L_0x009a
            r3 = r1[r2]
            android.graphics.drawable.Drawable r3 = r3.a()
            boolean r3 = r3 instanceof defpackage.qhe
            if (r3 == 0) goto L_0x0097
            r6.invalidate()
        L_0x0097:
            int r2 = r2 + 1
            goto L_0x0088
        L_0x009a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m35.c(android.view.View):void");
    }

    public final bs5 a() {
        return this.e;
    }

    public final void b(Activity activity) {
        View findViewById = activity.findViewById(16908290);
        if (findViewById != null) {
            c(findViewById);
        }
    }
}

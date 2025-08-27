package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import ru.ok.messages.views.widgets.TamAvatarView;

/* renamed from: cj2  reason: default package */
public final class cj2 extends jj0 {
    public final HashSet X = new HashSet();
    public final ij2 Y;
    public final long Z;
    public final List v;
    public final yva v0;
    public final List w;
    public final rtb w0;
    public final LayoutInflater x;
    public final km3 x0;
    public final ej2 y;
    public a32 y0;
    public final int z;

    public cj2(Context context, List list, List list2, ej2 ej2, int i, ij2 ij2, a32 a32, yva yva, rtb rtb, long j, km3 km3) {
        this.v = list2;
        this.w = list;
        this.y = ej2;
        this.x = LayoutInflater.from(context);
        this.z = i;
        this.Y = ij2;
        this.y0 = a32;
        this.v0 = yva;
        this.w0 = rtb;
        this.Z = j;
        this.x0 = km3;
    }

    public final void I(long j) {
        HashSet hashSet = this.X;
        if (hashSet.contains(Long.valueOf(j))) {
            hashSet.remove(Long.valueOf(j));
        } else {
            hashSet.add(Long.valueOf(j));
        }
    }

    public final int j() {
        return this.v.size();
    }

    public final long k(int i) {
        return ((bj2) this.v.get(i)).a.a;
    }

    public final int l(int i) {
        return ujc.row_chat_member;
    }

    public final void s(pzc pzc, int i) {
        long j;
        CharSequence charSequence;
        boolean z2;
        fj2 fj2 = (fj2) pzc;
        bj2 bj2 = (bj2) this.v.get(i);
        this.X.contains(Long.valueOf(bj2.a.a));
        a32 a32 = this.y0;
        String str = (String) this.o;
        fj2.M0 = bj2;
        fj2.L0 = a32;
        fo3 fo3 = bj2.a;
        boolean contains = this.w.contains(Long.valueOf(fo3.a));
        fj2.N0 = contains;
        int i2 = this.z;
        float f = 1.0f;
        View view = fj2.a;
        int i3 = 8;
        ImageView imageView = fj2.G0;
        if (i2 == 1) {
            imageView.setVisibility(8);
            if (fj2.N0) {
                f = 0.5f;
            }
            view.setAlpha(f);
        } else {
            ej2 ej2 = fj2.H0;
            if (ej2 != null) {
                if (!contains && ej2.Q0(bj2)) {
                    i3 = 0;
                }
                imageView.setVisibility(i3);
            }
            view.setAlpha(1.0f);
        }
        mtb l = qe8.l(bj2.b);
        TamAvatarView tamAvatarView = fj2.D0;
        tamAvatarView.getClass();
        String b = fo3.b();
        String a = fo3.a();
        long j2 = fo3.a;
        tamAvatarView.g(b, a, Long.valueOf(j2), l.a, -1, -1);
        boolean isEmpty = TextUtils.isEmpty(str);
        ij2 ij2 = this.Y;
        long j3 = this.Z;
        if (!isEmpty) {
            TextView textView = fj2.F0;
            Context context = textView.getContext();
            ArrayList j4 = qe8.j(fo3.v);
            String c = hhf.c(fo3.Z);
            if (cvg.A(c)) {
                c = "";
            }
            charSequence = i8b.v(context, j4, c, str, textView);
            if (TextUtils.isEmpty(charSequence) || !charSequence.toString().equals(fo3.a())) {
                j = j2;
                CharSequence O = fj2.O(bj2);
                fj2.N(bj2, i2, ij2, a32, j3);
                textView.setText(charSequence);
                charSequence = O;
            } else {
                j = j2;
                fj2.N(bj2, i2, ij2, a32, j3);
            }
        } else {
            j = j2;
            charSequence = fj2.O(bj2);
            fj2.N(bj2, i2, ij2, a32, j3);
        }
        TextView textView2 = fj2.E0;
        textView2.setText(charSequence);
        if (ij2 == ij2.ADMIN && i2 == 2) {
            long j5 = j;
            if (a32.t(j5) && j5 != a32.b.d) {
                z2 = true;
                n79.b(textView2, fo3.X.contains(eo3.OFFICIAL), z2, fo3.c(), fo3.d());
            }
        }
        z2 = false;
        n79.b(textView2, fo3.X.contains(eo3.OFFICIAL), z2, fo3.c(), fo3.d());
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        return new fj2(this.x.inflate(ujc.row_chat_member, viewGroup, false), this.v0, this.w0, this.y, this.x0);
    }
}

package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.math.MathKt;
import one.me.messages.list.loader.MessageModel;

/* renamed from: hg9  reason: default package */
public abstract class hg9 extends kbe implements gq2 {
    public final int D0 = MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density);
    public final int E0 = MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density);
    public ig9 F0;

    public hg9(View view) {
        super(view);
        b0h.H(view, new sa((kbe) this, (Object) view, (Continuation) null, 18));
    }

    public final void M(lz7 lz7) {
        P((MessageModel) lz7, CollectionsKt.emptyList());
    }

    public abstract void P(MessageModel messageModel, List list);

    public final void Q(MessageModel messageModel, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i = marginLayoutParams.topMargin;
        int i2 = marginLayoutParams.bottomMargin;
        boolean z = marginLayoutParams instanceof u89;
        u89 u89 = z ? (u89) marginLayoutParams : null;
        boolean z2 = u89 != null ? u89.a : true;
        int i3 = messageModel.F0;
        int i4 = 2080374784 & i3;
        boolean c = ct0.c(i4);
        int i5 = this.D0;
        if (c) {
            marginLayoutParams.topMargin = i5;
            marginLayoutParams.bottomMargin = i5;
        } else {
            boolean a = ct0.a(i4);
            int i6 = this.E0;
            if (a) {
                marginLayoutParams.topMargin = i5;
                marginLayoutParams.bottomMargin = i6;
            } else if ((536870912 & i3) != 0) {
                marginLayoutParams.topMargin = i6;
                marginLayoutParams.bottomMargin = i6;
            } else if ((1073741824 & i3) != 0) {
                marginLayoutParams.topMargin = i6;
                marginLayoutParams.bottomMargin = i5;
            } else if (ig9.a(i3, 0)) {
                marginLayoutParams.topMargin = i5;
                marginLayoutParams.bottomMargin = i5;
            }
        }
        if (!ig9.a(i3, 0) && z) {
            ((u89) marginLayoutParams).a = ct0.b(i4);
        }
        if (i != marginLayoutParams.topMargin || i2 != marginLayoutParams.bottomMargin || (z && z2 != ((u89) marginLayoutParams).a)) {
            view.setLayoutParams(marginLayoutParams);
        }
    }
}

package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import one.me.messages.list.ui.recycler.MessagesLayoutManager;

/* renamed from: of5  reason: default package */
public final /* synthetic */ class of5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ of5(int i, Object obj, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((qf5) this.c).a.findViewById(this.b);
            case 1:
                b38 b38 = (b38) this.c;
                Drawable drawable = b38.a.getDrawable(this.b);
                drawable.setColorFilter(new PorterDuffColorFilter(b38.b, PorterDuff.Mode.SRC_IN));
                return drawable;
            case 2:
                return new df9(this.b, (ef9) this.c);
            case 3:
                MessagesLayoutManager messagesLayoutManager = (MessagesLayoutManager) this.c;
                int i = this.b;
                View r = messagesLayoutManager.r(i);
                if (r != null) {
                    if (messagesLayoutManager.F) {
                        Rect rect = messagesLayoutManager.H;
                        RecyclerView.W(rect, r);
                        RecyclerView recyclerView = messagesLayoutManager.G;
                        messagesLayoutManager.m1(i, (recyclerView != null ? recyclerView.getHeight() : 0) - rect.height());
                    } else {
                        messagesLayoutManager.m1(i, MathKt.roundToInt(((float) 30) * vo4.c().getDisplayMetrics().density));
                    }
                }
                return Boolean.FALSE;
            default:
                return new uj9(this.b, (Lazy) this.c);
        }
    }

    public /* synthetic */ of5(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}

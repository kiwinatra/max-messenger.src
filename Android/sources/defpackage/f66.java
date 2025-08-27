package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ExecutorService;
import kotlin.math.MathKt;

/* renamed from: f66  reason: default package */
public final class f66 extends RecyclerView {
    public final t56 T1;

    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, ezc] */
    public f66(Context context, ExecutorService executorService) {
        super(context, (AttributeSet) null);
        t56 t56 = new t56(executorService);
        this.T1 = t56;
        ? obj = new Object();
        setHasFixedSize(true);
        setLayoutManager(new LinearLayoutManager(0, false));
        l(obj);
        setAdapter(t56);
        j(new cl2(MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density), 2));
    }

    public final void setListener(d66 d66) {
        this.T1.w = d66;
    }
}

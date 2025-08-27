package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: g8d  reason: default package */
public final class g8d extends OrientationEventListener {
    public int a = -1;
    public final /* synthetic */ l15 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g8d(l15 l15, Context context) {
        super(context);
        this.b = l15;
    }

    public final void onOrientationChanged(int i) {
        ArrayList arrayList;
        if (i != -1) {
            int i2 = (i >= 315 || i < 45) ? 0 : i >= 225 ? 1 : i >= 135 ? 2 : 3;
            if (this.a != i2) {
                this.a = i2;
                synchronized (this.b.a) {
                    arrayList = new ArrayList(((HashMap) this.b.c).values());
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        h8d h8d = (h8d) it.next();
                        h8d.getClass();
                        h8d.b.execute(new l40(h8d, i2, 16));
                    }
                }
            }
        }
    }
}

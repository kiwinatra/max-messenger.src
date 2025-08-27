package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: gg4  reason: default package */
public final class gg4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ mg4 c;

    public /* synthetic */ gg4(mg4 mg4, ArrayList arrayList, int i) {
        this.a = i;
        this.c = mg4;
        this.b = arrayList;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.b;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    mg4 mg4 = this.c;
                    if (hasNext) {
                        lg4 lg4 = (lg4) it.next();
                        pzc pzc = lg4.a;
                        mg4.getClass();
                        View view = pzc.a;
                        int i = lg4.d - lg4.b;
                        int i2 = lg4.e - lg4.c;
                        if (i != 0) {
                            view.animate().translationX(c44.DEFAULT_ASPECT_RATIO);
                        }
                        if (i2 != 0) {
                            view.animate().translationY(c44.DEFAULT_ASPECT_RATIO);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        mg4.p.add(pzc);
                        animate.setDuration(mg4.m()).setListener(new ig4(mg4, pzc, i, view, i2, animate, 0)).start();
                    } else {
                        arrayList.clear();
                        mg4.m.remove(arrayList);
                        return;
                    }
                }
            default:
                ArrayList arrayList2 = this.b;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it2.hasNext();
                    mg4 mg42 = this.c;
                    if (hasNext2) {
                        pzc pzc2 = (pzc) it2.next();
                        mg42.getClass();
                        View view2 = pzc2.a;
                        ViewPropertyAnimator animate2 = view2.animate();
                        mg42.o.add(pzc2);
                        animate2.alpha(1.0f).setDuration(mg42.c).setListener(new hg4(mg42, pzc2, view2, animate2)).start();
                    } else {
                        arrayList2.clear();
                        mg42.l.remove(arrayList2);
                        return;
                    }
                }
        }
    }
}

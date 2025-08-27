package defpackage;

import android.graphics.Bitmap;
import android.util.SparseIntArray;
import androidx.work.WorkRequest;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import one.me.rlottie.RLottie;
import one.me.rlottie.a;
import one.me.rlottie.d;
import one.me.rlottie.e;
import one.me.rlottie.g;

/* renamed from: ue  reason: default package */
public final /* synthetic */ class ue implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ ue(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public final void run() {
        d dVar;
        switch (this.a) {
            case 0:
                RLottie.config.workQueue.post(new ue(1, this.b), 36);
                return;
            case 1:
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.b;
                    if (i < arrayList.size()) {
                        Bitmap bitmap = (Bitmap) ((WeakReference) arrayList.get(i)).get();
                        ((WeakReference) arrayList.get(i)).clear();
                        if (bitmap != null && !bitmap.isRecycled()) {
                            try {
                                bitmap.recycle();
                            } catch (Throwable th) {
                                RLottie.getLogger().e(th);
                            }
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            case 2:
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ((Bitmap) it.next()).recycle();
                }
                return;
            case 3:
                g gVar = g.k;
                gVar.getClass();
                int i2 = 0;
                while (true) {
                    ArrayList arrayList2 = this.b;
                    if (i2 < arrayList2.size()) {
                        Runnable runnable = (Runnable) arrayList2.get(i2);
                        if (runnable != null) {
                            ArrayList arrayList3 = gVar.c;
                            boolean isEmpty = arrayList3.isEmpty();
                            ArrayList arrayList4 = gVar.a;
                            if (!isEmpty && (gVar.g / 2 <= arrayList3.size() || (arrayList4.isEmpty() && gVar.e >= gVar.d))) {
                                dVar = (d) arrayList3.remove(0);
                            } else if (arrayList4.isEmpty()) {
                                dVar = new d("rlottie-bg-pool" + gVar.f + "-" + e.j.nextInt());
                                dVar.setPriority(10);
                                gVar.e = gVar.e + 1;
                            } else {
                                dVar = (d) arrayList4.remove(0);
                            }
                            if (!gVar.h) {
                                RLottie.config.workQueue.post(gVar.i, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
                                gVar.h = true;
                            }
                            gVar.g++;
                            arrayList3.add(dVar);
                            SparseIntArray sparseIntArray = gVar.b;
                            sparseIntArray.put(dVar.o, sparseIntArray.get(dVar.o, 0) + 1);
                            if (dVar.getPriority() != 10) {
                                dVar.setPriority(10);
                            }
                            dVar.a(new ktg(gVar, runnable, dVar, 23));
                        }
                        i2++;
                    } else {
                        arrayList2.clear();
                        a.d(new ue(4, arrayList2));
                        return;
                    }
                }
                break;
            default:
                g.l.add(this.b);
                return;
        }
    }
}

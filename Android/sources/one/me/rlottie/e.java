package one.me.rlottie;

import android.util.SparseIntArray;
import androidx.work.WorkRequest;
import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.Locale;
import java.util.NoSuchElementException;
import one.me.rlottie.RLottie;

public final class e {
    public static final SecureRandom j = new SecureRandom();
    public final LinkedList a = new LinkedList();
    public final SparseIntArray b = new SparseIntArray();
    public final LinkedList c = new LinkedList();
    public final int d = 4;
    public int e;
    public final int f = j.nextInt();
    public int g;
    public boolean h;
    public final cf i = new cf(17, this);

    public final d a() {
        d dVar = new d("rlottie-pool-" + this.f + "-" + j.nextInt());
        dVar.setPriority(10);
        return dVar;
    }

    public final void b(Runnable runnable) {
        d dVar;
        LinkedList linkedList = this.c;
        boolean isEmpty = linkedList.isEmpty();
        LinkedList linkedList2 = this.a;
        int i2 = this.d;
        if (!isEmpty && (this.g / 2 <= linkedList.size() || (linkedList2.isEmpty() && this.e >= i2))) {
            try {
                dVar = (d) linkedList.removeFirst();
            } catch (NoSuchElementException e2) {
                RLottie.getLogger().e(e2);
                dVar = null;
            }
        } else if (linkedList2.isEmpty()) {
            dVar = a();
            this.e++;
        } else {
            dVar = (d) linkedList2.removeFirst();
        }
        if (!this.h) {
            a.c(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, this.i);
            this.h = true;
        }
        if (dVar == null) {
            RLottie.Logger logger = RLottie.getLogger();
            Locale locale = Locale.US;
            int size = linkedList.size();
            int i3 = this.g;
            int size2 = linkedList2.size();
            int i4 = this.e;
            StringBuilder n = a81.n("DispatchQueuePool: queue is null – busyQueues.size=", size, ", totalTasksCount=", i3, ", queues.size=");
            g63.o(n, size2, ", createdCount=", i4, ", maxCount=");
            n.append(i2);
            logger.e(n.toString(), new IllegalStateException("queue is null"));
            dVar = a();
            this.e++;
        }
        this.g++;
        linkedList.add(dVar);
        SparseIntArray sparseIntArray = this.b;
        int i5 = dVar.o;
        sparseIntArray.put(i5, sparseIntArray.get(i5, 0) + 1);
        if (dVar.getPriority() != 10) {
            dVar.setPriority(10);
        }
        dVar.a(new ktg(this, runnable, dVar, 22));
    }
}

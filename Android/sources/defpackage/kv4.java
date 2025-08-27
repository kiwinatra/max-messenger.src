package defpackage;

import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: kv4  reason: default package */
public final class kv4 {
    public static final kv4 b = new kv4();
    public static final boolean c = true;
    public final ArrayBlockingQueue a = new ArrayBlockingQueue(20);

    public final void a(jv4 jv4) {
        if (c) {
            int i = 5;
            while (true) {
                ArrayBlockingQueue arrayBlockingQueue = this.a;
                if (!arrayBlockingQueue.offer(jv4) && i > 0) {
                    arrayBlockingQueue.poll();
                    i--;
                } else {
                    return;
                }
            }
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}

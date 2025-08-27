package defpackage;

/* renamed from: tqf  reason: default package */
public final class tqf implements Comparable {
    public final Runnable a;
    public final long b;
    public final int c;
    public volatile boolean o;

    public tqf(Runnable runnable, Long l, int i) {
        this.a = runnable;
        this.b = l.longValue();
        this.c = i;
    }

    public final int compareTo(Object obj) {
        tqf tqf = (tqf) obj;
        int compare = Long.compare(this.b, tqf.b);
        return compare == 0 ? Integer.compare(this.c, tqf.c) : compare;
    }
}

package defpackage;

import java.util.Iterator;
import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: pw5  reason: default package */
public final class pw5 extends zl0 {
    public Iterator a;
    public volatile boolean b;
    public boolean c;
    public final pye o;

    public pw5(pye pye, Iterator it) {
        this.a = it;
        this.o = pye;
    }

    public final void a() {
        Iterator it = this.a;
        pye pye = this.o;
        while (!this.b) {
            try {
                Object next = it.next();
                if (!this.b) {
                    if (next == null) {
                        pye.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    pye.d(next);
                    if (!this.b) {
                        try {
                            if (!it.hasNext()) {
                                if (!this.b) {
                                    pye.b();
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th) {
                            hd8.Z(th);
                            pye.onError(th);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th2) {
                hd8.Z(th2);
                pye.onError(th2);
                return;
            }
        }
    }

    public final void b(long j) {
        Iterator it = this.a;
        pye pye = this.o;
        do {
            long j2 = 0;
            while (true) {
                if (j2 == j) {
                    j = get();
                    if (j2 == j) {
                        j = addAndGet(-j2);
                    }
                } else if (!this.b) {
                    try {
                        Object next = it.next();
                        if (!this.b) {
                            if (next == null) {
                                pye.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            pye.d(next);
                            if (!this.b) {
                                try {
                                    if (it.hasNext()) {
                                        j2++;
                                    } else if (!this.b) {
                                        pye.b();
                                        return;
                                    } else {
                                        return;
                                    }
                                } catch (Throwable th) {
                                    hd8.Z(th);
                                    pye.onError(th);
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th2) {
                        hd8.Z(th2);
                        pye.onError(th2);
                        return;
                    }
                } else {
                    return;
                }
            }
        } while (j != 0);
    }

    public final void cancel() {
        this.b = true;
    }

    public final void clear() {
        this.a = null;
    }

    public final void g(long j) {
        if (tye.d(j) && h88.c(this, j) == 0) {
            if (j == LongCompanionObject.MAX_VALUE) {
                a();
            } else {
                b(j);
            }
        }
    }

    public final boolean isEmpty() {
        Iterator it = this.a;
        if (it == null) {
            return true;
        }
        if (!this.c || it.hasNext()) {
            return false;
        }
        this.a = null;
        return true;
    }

    public final int p(int i) {
        return 1;
    }

    public final Object poll() {
        Iterator it = this.a;
        if (it == null) {
            return null;
        }
        if (!this.c) {
            this.c = true;
        } else if (!it.hasNext()) {
            return null;
        }
        Object next = this.a.next();
        Objects.requireNonNull(next, "Iterator.next() returned a null value");
        return next;
    }
}

package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;

/* renamed from: iaa  reason: default package */
public final class iaa implements s98 {
    public final Lazy a;
    public final Lazy b;
    public final haa c;

    public iaa(Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = LazyKt.lazy(new bp1(lazy2, lazy3, 1));
        Lazy lazy4 = LazyKt.lazy(new j35((Object) this, lazy, 27));
        this.b = lazy4;
        this.c = (haa) lazy4.getValue();
    }

    public final void a() {
        ((haa) this.b.getValue()).a();
    }

    /* JADX INFO: finally extract failed */
    public final void b(long j) {
        faa faa = (faa) ((haa) this.b.getValue());
        if (faa.e()) {
            ReentrantLock reentrantLock = faa.f;
            reentrantLock.lock();
            try {
                faa.e.e(j);
                reentrantLock.unlock();
                faa.d();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final void c(jz9 jz9) {
        faa faa = (faa) ((haa) this.b.getValue());
        faa.getClass();
        if (!jz9.b() && faa.e()) {
            ReentrantLock reentrantLock = faa.f;
            reentrantLock.lock();
            try {
                long[] jArr = jz9.b;
                long[] jArr2 = jz9.a;
                int length = jArr2.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr2[i];
                        if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    faa.e.e(jArr[(i << 3) + i3]);
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                faa.d();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final void d(Collection collection) {
        faa faa = (faa) ((haa) this.b.getValue());
        faa.getClass();
        if (!collection.isEmpty() && faa.e()) {
            ReentrantLock reentrantLock = faa.f;
            reentrantLock.lock();
            try {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    faa.e.e(((Number) it.next()).longValue());
                }
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                faa.d();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }
}

package defpackage;

import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: z5b  reason: default package */
public final /* synthetic */ class z5b implements zi6, qk3, ice {
    public final /* synthetic */ d6b a;
    public final /* synthetic */ long b;

    public /* synthetic */ z5b(d6b d6b, long j) {
        this.a = d6b;
        this.b = j;
    }

    public void accept(Object obj) {
        d6b d6b = this.a;
        d6b.getClass();
        z68.f("d6b", "handleMediaTypingError", (Throwable) obj);
        long j = this.b;
        LinkedBlockingDeque linkedBlockingDeque = d6b.c(j).a;
        if (!linkedBlockingDeque.isEmpty()) {
            try {
                linkedBlockingDeque.pop();
            } catch (NoSuchElementException unused) {
            }
        }
        if (!linkedBlockingDeque.isEmpty()) {
            d6b.e(j);
        }
    }

    public Object apply(Object obj) {
        mka mka;
        Long l = (Long) obj;
        d6b d6b = this.a;
        d6b.getClass();
        long j = this.b;
        if (j == 0) {
            mka = lbe.h(0L);
        } else {
            z68.c("d6b", "sendMediaTyping %d", Long.valueOf(j));
            mka = new mka(1, new z5b(d6b, j));
        }
        return mka.o();
    }

    public void h(pbe pbe) {
        a6b a6b;
        d6b d6b = this.a;
        d6b.getClass();
        ConcurrentHashMap concurrentHashMap = d6b.b;
        long j = this.b;
        b6b b6b = (b6b) concurrentHashMap.get(Long.valueOf(j));
        if (b6b == null || (a6b = (a6b) b6b.a.peek()) == null) {
            pbe.onError(new Throwable("No media typing to send"));
            return;
        }
        d6b.d(j, a6b.a);
        pbe.a(Long.valueOf(a6b.b));
    }
}

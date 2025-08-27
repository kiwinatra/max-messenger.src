package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: v15  reason: default package */
public final class v15 extends kv0 {
    public final /* synthetic */ kv0 i;
    public final /* synthetic */ ThreadPoolExecutor j;

    public v15(kv0 kv0, ThreadPoolExecutor threadPoolExecutor) {
        this.i = kv0;
        this.j = threadPoolExecutor;
    }

    public final void U(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.j;
        try {
            this.i.U(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    public final void V(gq9 gq9) {
        ThreadPoolExecutor threadPoolExecutor = this.j;
        try {
            this.i.V(gq9);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}

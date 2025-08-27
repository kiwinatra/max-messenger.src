package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: n74  reason: default package */
public final class n74 implements r74 {
    public final /* synthetic */ y35 a;
    public final /* synthetic */ CountDownLatch b;
    public final /* synthetic */ y35 c;

    public n74(y35 y35, CountDownLatch countDownLatch, y35 y352) {
        this.a = y35;
        this.b = countDownLatch;
        this.c = y352;
    }

    public final void a(i0 i0Var) {
        CountDownLatch countDownLatch = this.b;
        if (i0Var.h()) {
            try {
                this.a.b = i0Var.e();
            } finally {
                countDownLatch.countDown();
            }
        }
    }

    public final void b(i0 i0Var) {
    }

    public final void c(i0 i0Var) {
        CountDownLatch countDownLatch = this.b;
        try {
            this.c.b = i0Var.c();
        } finally {
            countDownLatch.countDown();
        }
    }

    public final void d() {
        this.b.countDown();
    }
}

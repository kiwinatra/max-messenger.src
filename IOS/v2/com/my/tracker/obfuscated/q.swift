package com.my.tracker.obfuscated;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.IntCompanionObject;

public final class q extends r1 {
    private final a c = ((a) this.a);

    public static class a extends ByteArrayOutputStream {
        private final int a;
        private int b = IntCompanionObject.MAX_VALUE;
        private int c = -1;

        public a(int i) {
            super(i);
            this.a = i;
        }

        public synchronized void m() {
            try {
                reset();
                if (x2.a()) {
                    StringBuilder sb = new StringBuilder("SimpleByteArrayOutputStream: minSize=");
                    int i = this.b;
                    if (i == Integer.MAX_VALUE) {
                        i = 0;
                    }
                    sb.append(i);
                    sb.append(", maxSize=");
                    sb.append(this.c);
                    sb.append(", truncate=");
                    sb.append(this.a);
                    x2.a(sb.toString());
                }
                this.b = IntCompanionObject.MAX_VALUE;
                this.c = -1;
                int length = this.buf.length;
                int i2 = this.a;
                if (length > i2) {
                    this.buf = new byte[i2];
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }

        public synchronized void reset() {
            try {
                int i = this.count;
                if (i > 0) {
                    this.b = Integer.min(this.b, i);
                }
                this.c = Integer.max(this.count, this.c);
                super.reset();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public q(int i) {
        super(new a(i));
    }

    public void a() {
        this.c.reset();
    }

    public int b() {
        return this.c.size();
    }

    public byte[] c() {
        return this.c.toByteArray();
    }

    public void d() {
        this.c.m();
    }

    public void a(OutputStream outputStream) {
        this.c.writeTo(outputStream);
    }
}

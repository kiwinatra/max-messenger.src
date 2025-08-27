package com.my.tracker.obfuscated;

import com.my.tracker.obfuscated.d1;
import com.my.tracker.obfuscated.x1;

final class y1 implements x1 {
    private final d1 a;

    public static final class a implements x1.a {
        private final d1 a;
        private final d1.c b;

        public a(d1 d1Var, d1.c cVar) {
            this.a = d1Var;
            this.b = cVar;
        }

        public boolean b() {
            return this.b.b();
        }

        public long c() {
            return this.b.c();
        }

        public void close() {
            this.b.close();
        }

        public x1.b d() {
            return new b(this.a.e(this.b.a()));
        }

        public long g() {
            return this.b.g();
        }

        public byte[] l() {
            return this.b.l();
        }
    }

    public static final class b implements x1.b {
        private final d1.d a;

        public b(d1.d dVar) {
            this.a = dVar;
        }

        public boolean b() {
            return this.a.b();
        }

        public void close() {
            this.a.close();
        }

        public long e() {
            return this.a.e();
        }
    }

    public y1(d1 d1Var) {
        this.a = d1Var;
    }

    public x1.a a() {
        d1 d1Var = this.a;
        return new a(d1Var, d1Var.i());
    }
}

package com.my.tracker.obfuscated;

import com.my.tracker.obfuscated.d1;
import com.my.tracker.obfuscated.z1;

final class a2 implements z1 {
    private final d1 a;
    private final String b;

    public static final class a implements z1.a {
        private final d1 a;
        private final d1.f b;

        public a(d1 d1Var, d1.f fVar) {
            this.a = d1Var;
            this.b = fVar;
        }

        public long a() {
            return this.b.a();
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

        public z1.b d() {
            return new b(this.a.h(this.b.a()));
        }

        public String k() {
            return this.b.k();
        }
    }

    public static final class b implements z1.b {
        private final d1.g a;

        public b(d1.g gVar) {
            this.a = gVar;
        }

        public boolean b() {
            return this.a.b();
        }

        public void close() {
            this.a.close();
        }

        public boolean f() {
            return this.a.o();
        }

        public long h() {
            return this.a.n();
        }

        public long j() {
            return this.a.m();
        }
    }

    public a2(d1 d1Var, String str) {
        this.a = d1Var;
        this.b = str;
    }

    public z1.a a() {
        d1 d1Var = this.a;
        return new a(d1Var, d1Var.a(this.b));
    }
}

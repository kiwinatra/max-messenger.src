package com.my.tracker.obfuscated;

import java.util.Objects;

public final class z0 {
    public static final z0 g = new z0(-1, 0.0d, 0.0d, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 0);
    public final int a;
    public final double b;
    public final double c;
    public final float d;
    public final float e;
    public final long f;

    public z0(int i, double d2, double d3, float f2, float f3, long j) {
        this.a = i;
        this.b = d2;
        this.c = d3;
        this.d = f2;
        this.e = f3;
        this.f = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z0.class != obj.getClass()) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return this.a == z0Var.a && Double.compare(z0Var.b, this.b) == 0 && Double.compare(z0Var.c, this.c) == 0 && Float.compare(z0Var.d, this.d) == 0 && Float.compare(z0Var.e, this.e) == 0 && this.f == z0Var.f;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.a), Double.valueOf(this.b), Double.valueOf(this.c), Float.valueOf(this.d), Float.valueOf(this.e), Long.valueOf(this.f)});
    }
}

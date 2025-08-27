package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* renamed from: a58  reason: default package */
public final class a58 implements Serializable {
    public final qac X;
    public final boolean Y;
    public final int Z;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean o;
    public final boolean v;
    public final boolean v0;
    public final boolean w;
    public final boolean w0;
    public final boolean x;
    public final boolean x0;
    public final boolean y;
    public final boolean y0;
    public final boolean z;
    public final boolean z0;

    public a58(z48 z48) {
        this.a = z48.a;
        this.b = z48.b;
        this.c = z48.c;
        this.o = z48.d;
        this.v = z48.e;
        this.w = z48.f;
        this.x = z48.g;
        this.y = z48.h;
        this.z = z48.i;
        this.X = z48.j;
        this.Y = z48.k;
        this.Z = z48.l;
        this.v0 = z48.m;
        this.w0 = z48.n;
        this.x0 = z48.o;
        this.y0 = z48.p;
        this.z0 = z48.q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a58.class != obj.getClass()) {
            return false;
        }
        a58 a58 = (a58) obj;
        return this.a == a58.a && this.b == a58.b && this.c == a58.c && this.o == a58.o && this.v == a58.v && this.w == a58.w && this.x == a58.x && this.y == a58.y && this.z == a58.z && this.Y == a58.Y && this.Z == a58.Z && this.v0 == a58.v0 && this.w0 == a58.w0 && this.x0 == a58.x0 && this.y0 == a58.y0 && this.z0 == a58.z0 && this.X == a58.X;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.o), Boolean.valueOf(this.v), Boolean.valueOf(this.w), Boolean.valueOf(this.x), Boolean.valueOf(this.y), Boolean.valueOf(this.z), this.X, Boolean.valueOf(this.Y), Integer.valueOf(this.Z), Boolean.valueOf(this.v0), Boolean.valueOf(this.w0), Boolean.valueOf(this.x0), Boolean.valueOf(this.y0), Boolean.valueOf(this.z0)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocalMediaToolboxViewState{qualityButtonEnable=");
        sb.append(this.a);
        sb.append(", qualityTextVisibility=");
        sb.append(this.b);
        sb.append(", qualityProgressBarVisibility=");
        sb.append(this.c);
        sb.append(", multiSelect=");
        sb.append(this.o);
        sb.append(", videoControlsVisibility=");
        sb.append(this.v);
        sb.append(", videoSeekBarVisibility=");
        sb.append(this.w);
        sb.append(", cropVisibility=");
        sb.append(this.x);
        sb.append(", filterVisibility=");
        sb.append(this.y);
        sb.append(", editVisibility=");
        sb.append(this.z);
        sb.append(", quality=");
        sb.append(this.X);
        sb.append(", isNumericCheckButtonEnabled=");
        sb.append(this.Y);
        sb.append(", numberForNumericCheckButton=");
        sb.append(this.Z);
        sb.append(", highlightCropButton=");
        sb.append(this.v0);
        sb.append(", highlightFilterButton=");
        sb.append(this.w0);
        sb.append(", highlightEditButton=");
        sb.append(this.x0);
        sb.append(", muteVideo=");
        return wzf.l(sb, this.y0, '}');
    }
}

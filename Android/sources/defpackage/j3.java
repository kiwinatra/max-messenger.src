package defpackage;

import java.util.Arrays;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: j3  reason: default package */
public abstract class j3 {
    public k3[] a;
    public int b;
    public int c;
    public sye o;

    /* JADX WARNING: type inference failed for: r0v3, types: [n6e, sye] */
    public final ome g() {
        sye sye;
        synchronized (this) {
            sye sye2 = this.o;
            sye = sye2;
            if (sye2 == null) {
                int i = this.b;
                ? n6e = new n6e(1, IntCompanionObject.MAX_VALUE, cu0.b);
                n6e.d(Integer.valueOf(i));
                this.o = n6e;
                sye = n6e;
            }
        }
        return sye;
    }

    public final k3 h() {
        k3 k3Var;
        sye sye;
        synchronized (this) {
            try {
                k3[] k3VarArr = this.a;
                if (k3VarArr == null) {
                    k3VarArr = j();
                    this.a = k3VarArr;
                } else if (this.b >= k3VarArr.length) {
                    Object[] copyOf = Arrays.copyOf(k3VarArr, k3VarArr.length * 2);
                    this.a = (k3[]) copyOf;
                    k3VarArr = (k3[]) copyOf;
                }
                int i = this.c;
                do {
                    k3Var = k3VarArr[i];
                    if (k3Var == null) {
                        k3Var = i();
                        k3VarArr[i] = k3Var;
                    }
                    i++;
                    if (i >= k3VarArr.length) {
                        i = 0;
                    }
                } while (!k3Var.a(this));
                this.c = i;
                this.b++;
                sye = this.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (sye != null) {
            sye.y(1);
        }
        return k3Var;
    }

    public abstract k3 i();

    public abstract k3[] j();

    public final void k(k3 k3Var) {
        sye sye;
        int i;
        Continuation[] b2;
        synchronized (this) {
            try {
                int i2 = this.b - 1;
                this.b = i2;
                sye = this.o;
                if (i2 == 0) {
                    this.c = 0;
                }
                b2 = k3Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : b2) {
            if (continuation != null) {
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m23constructorimpl(Unit.INSTANCE));
            }
        }
        if (sye != null) {
            sye.y(-1);
        }
    }
}

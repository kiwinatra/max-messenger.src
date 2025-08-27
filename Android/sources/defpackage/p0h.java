package defpackage;

import com.google.android.gms.internal.play_billing.zzdn;
import com.google.android.gms.internal.play_billing.zzfl;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: p0h  reason: default package */
public abstract class p0h extends azg {
    private static final Map zzb = new ConcurrentHashMap();
    protected b3h zzc = b3h.f;
    private int zzd = -1;

    public p0h() {
        this.zza = 0;
    }

    public static p0h e(Class cls) {
        Map map = zzb;
        p0h p0h = (p0h) map.get(cls);
        if (p0h == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                p0h = (p0h) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (p0h == null) {
            p0h = (p0h) ((p0h) k3h.h(cls)).m(6);
            if (p0h != null) {
                map.put(cls, p0h);
            } else {
                throw new IllegalStateException();
            }
        }
        return p0h;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [gv1, java.lang.Object] */
    public static p0h f(p0h p0h, byte[] bArr, xzg xzg) {
        int length = bArr.length;
        p0h p0h2 = (p0h) p0h.m(4);
        try {
            l2h a = h2h.c.a(p0h2.getClass());
            ? obj = new Object();
            xzg.getClass();
            a.d(p0h2, bArr, 0, length, obj);
            a.b(p0h2);
            if (p0h2.k()) {
                return p0h2;
            }
            throw new IOException(new zzfl().getMessage());
        } catch (zzdn e) {
            throw e;
        } catch (zzfl e2) {
            throw new IOException(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzdn) {
                throw ((zzdn) e3.getCause());
            }
            throw new IOException(e3.getMessage(), e3);
        } catch (IndexOutOfBoundsException unused) {
            throw zzdn.d();
        }
    }

    public static Object g(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static void i(Class cls, p0h p0h) {
        p0h.h();
        zzb.put(cls, p0h);
    }

    public final int a(l2h l2h) {
        if (l()) {
            int g = l2h.g(this);
            if (g >= 0) {
                return g;
            }
            throw new IllegalStateException(wj6.h(g, "serialized size must be non-negative, was "));
        }
        int i = this.zzd & IntCompanionObject.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int g2 = l2h.g(this);
        if (g2 >= 0) {
            this.zzd = (this.zzd & IntCompanionObject.MIN_VALUE) | g2;
            return g2;
        }
        throw new IllegalStateException(wj6.h(g2, "serialized size must be non-negative, was "));
    }

    public final int c() {
        if (l()) {
            int g = h2h.c.a(getClass()).g(this);
            if (g >= 0) {
                return g;
            }
            throw new IllegalStateException(wj6.h(g, "serialized size must be non-negative, was "));
        }
        int i = this.zzd & IntCompanionObject.MAX_VALUE;
        if (i == Integer.MAX_VALUE) {
            i = h2h.c.a(getClass()).g(this);
            if (i >= 0) {
                this.zzd = (this.zzd & IntCompanionObject.MIN_VALUE) | i;
            } else {
                throw new IllegalStateException(wj6.h(i, "serialized size must be non-negative, was "));
            }
        }
        return i;
    }

    public final d0h d() {
        return (d0h) m(5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return h2h.c.a(getClass()).i(this, (p0h) obj);
    }

    public final void h() {
        this.zzd &= IntCompanionObject.MAX_VALUE;
    }

    public final int hashCode() {
        if (l()) {
            return h2h.c.a(getClass()).f(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int f = h2h.c.a(getClass()).f(this);
        this.zza = f;
        return f;
    }

    public final void j() {
        this.zzd = (this.zzd & IntCompanionObject.MIN_VALUE) | IntCompanionObject.MAX_VALUE;
    }

    public final boolean k() {
        byte byteValue = ((Byte) m(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean e = h2h.c.a(getClass()).e(this);
        m(2);
        return e;
    }

    public final boolean l() {
        return (this.zzd & IntCompanionObject.MIN_VALUE) != 0;
    }

    public abstract Object m(int i);

    public final String toString() {
        String obj = super.toString();
        char[] cArr = a2h.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        a2h.c(this, sb, 0);
        return sb.toString();
    }
}

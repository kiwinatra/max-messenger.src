package defpackage;

import java.io.IOException;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: z68  reason: default package */
public final class z68 {
    public static final z68 a = new Object();
    public static volatile a67 b;

    public static final void a(String str, String str2) {
        c(str, str2, new Object[0]);
    }

    public static final void b(String str, String str2, Throwable th) {
        a67 a67 = b;
        if (a67 != null) {
            w78 w78 = w78.o;
            if (str2 == null) {
                str2 = "";
            }
            a67.b(a67, w78, str, str2, (Object[]) null, th, 8);
        }
    }

    public static final void c(String str, String str2, Object... objArr) {
        a67 a67 = b;
        if (a67 != null) {
            if (objArr.length == 0) {
                a67.d(w78.o, str, str2, (Throwable) null);
            } else {
                a67.b(a67, w78.o, str, str2, objArr, (Throwable) null, 16);
            }
        }
    }

    public static final void e(String str, String str2) {
        f(str, str2, (Throwable) null);
    }

    public static final void f(String str, String str2, Throwable th) {
        a67 a67 = b;
        if (a67 != null) {
            w78 w78 = w78.x;
            if (str2 == null) {
                str2 = "";
            }
            a67.b(a67, w78, str, str2, (Object[]) null, th, 8);
        }
    }

    public static final void g(String str, String str2, Object... objArr) {
        a67 a67 = b;
        if (a67 != null) {
            a67.b(a67, w78.x, str, str2, objArr, (Throwable) null, 16);
        }
    }

    public static final void h(String str, Throwable th, String str2, Object... objArr) {
        a67 a67 = b;
        if (a67 != null) {
            a67.a(w78.x, str, str2, objArr, th);
        }
    }

    public static final void i(String str, String str2, Throwable th) {
        a67 a67 = b;
        if (a67 != null) {
            w78 w78 = w78.v;
            if (str2 == null) {
                str2 = "";
            }
            a67.b(a67, w78, str, str2, (Object[]) null, th, 8);
        }
    }

    public static final void j(String str, String str2, Object... objArr) {
        a67 a67 = b;
        if (a67 != null) {
            if (objArr.length == 0) {
                a67.d(w78.v, str, str2, (Throwable) null);
            } else {
                a67.b(a67, w78.v, str, str2, objArr, (Throwable) null, 16);
            }
        }
    }

    public static void k(w78 w78, String str, String str2) {
        Object[] objArr = new Object[0];
        int ordinal = w78.ordinal();
        if (ordinal == 0) {
            l(str, str2, Arrays.copyOf(objArr, objArr.length));
        } else if (ordinal == 1) {
            c(str, str2, Arrays.copyOf(objArr, objArr.length));
        } else if (ordinal == 2) {
            j(str, str2, Arrays.copyOf(objArr, objArr.length));
        } else if (ordinal == 3) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            n(str, (IOException) null, str2, Arrays.copyOf(copyOf, copyOf.length));
        } else if (ordinal == 4) {
            g(str, str2, Arrays.copyOf(objArr, objArr.length));
        } else if (ordinal == 5) {
            Object[] copyOf2 = Arrays.copyOf(objArr, objArr.length);
            a67 a67 = b;
            if (a67 != null) {
                a67.b(a67, w78.y, str, str2, copyOf2, (Throwable) null, 16);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final void l(String str, String str2, Object... objArr) {
        a67 a67 = b;
        if (a67 != null) {
            if (objArr.length == 0) {
                a67.d(w78.c, str, str2, (Throwable) null);
            } else {
                a67.b(a67, w78.c, str, str2, objArr, (Throwable) null, 16);
            }
        }
    }

    public static final void n(String str, IOException iOException, String str2, Object... objArr) {
        a67 a67 = b;
        if (a67 != null) {
            if (objArr.length == 0) {
                a67.b(a67, w78.w, str, str2, (Object[]) null, iOException, 8);
            } else {
                a67.a(w78.w, str, str2, objArr, iOException);
            }
        }
    }

    public static final void o(String str, String str2, Throwable th) {
        a67 a67 = b;
        if (a67 != null) {
            a67.b(a67, w78.w, str, str2, (Object[]) null, th, 8);
        }
    }

    public static void p(String str, String str2) {
        Object[] objArr = new Object[0];
        n(str, (IOException) null, str2, Arrays.copyOf(objArr, objArr.length));
    }
}

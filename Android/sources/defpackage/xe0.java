package defpackage;

import android.util.Log;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.uuid.Uuid;

/* renamed from: xe0  reason: default package */
public final class xe0 implements bd6 {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public String i;
    public int j;
    public CharSequence k;
    public int l;
    public CharSequence m;
    public ArrayList n;
    public ArrayList o;
    public boolean p;
    public ArrayList q;
    public final c r;
    public boolean s;
    public int t;

    public xe0(c cVar) {
        cVar.J();
        oc6 oc6 = cVar.w;
        if (oc6 != null) {
            oc6.w0.getClassLoader();
        }
        this.a = new ArrayList();
        this.h = true;
        this.p = false;
        this.t = -1;
        this.r = cVar;
    }

    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        this.r.d.add(this);
        return true;
    }

    public final void b(md6 md6) {
        this.a.add(md6);
        md6.d = this.b;
        md6.e = this.c;
        md6.f = this.d;
        md6.g = this.e;
    }

    public final void c(String str) {
        if (this.h) {
            this.g = true;
            this.i = str;
            return;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public final void d(int i2) {
        if (this.g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                md6 md6 = (md6) arrayList.get(i3);
                a aVar = md6.b;
                if (aVar != null) {
                    aVar.C0 += i2;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(md6.b);
                        int i4 = md6.b.C0;
                    }
                }
            }
        }
    }

    public final int e(boolean z) {
        if (!this.s) {
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
                PrintWriter printWriter = new PrintWriter(new e88());
                i("  ", printWriter, true);
                printWriter.close();
            }
            this.s = true;
            boolean z2 = this.g;
            c cVar = this.r;
            if (z2) {
                this.t = cVar.j.getAndIncrement();
            } else {
                this.t = -1;
            }
            cVar.y(this, z);
            return this.t;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void f() {
        if (!this.g) {
            this.h = false;
            this.r.B(this, false);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void g() {
        if (!this.g) {
            this.h = false;
            this.r.B(this, true);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void h(int i2, a aVar, String str, int i3) {
        String str2 = aVar.Z0;
        if (str2 != null) {
            ld6.d(aVar, str2);
        }
        Class<?> cls = aVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = aVar.J0;
            if (str3 == null || str.equals(str3)) {
                aVar.J0 = str;
            } else {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(aVar);
                sb.append(": was ");
                throw new IllegalStateException(rae.q(sb, aVar.J0, " now ", str));
            }
        }
        if (i2 != 0) {
            if (i2 != -1) {
                int i4 = aVar.H0;
                if (i4 == 0 || i4 == i2) {
                    aVar.H0 = i2;
                    aVar.I0 = i2;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + aVar + ": was " + aVar.H0 + " now " + i2);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + aVar + " with tag " + str + " to container view with no id");
            }
        }
        b(new md6(i3, aVar));
        aVar.D0 = this.r;
    }

    public final void i(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.s);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (!(this.b == 0 && this.c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (!(this.d == 0 && this.e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (!(this.j == 0 && this.k == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.k);
            }
            if (!(this.l == 0 && this.m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.m);
            }
        }
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                md6 md6 = (md6) arrayList.get(i2);
                switch (md6.a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + md6.a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(md6.b);
                if (z) {
                    if (!(md6.d == 0 && md6.e == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(md6.d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(md6.e));
                    }
                    if (md6.f != 0 || md6.g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(md6.f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(md6.g));
                    }
                }
            }
        }
    }

    public final void j(a aVar) {
        c cVar = aVar.D0;
        if (cVar == null || cVar == this.r) {
            b(new md6(3, aVar));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + aVar.toString() + " is already attached to a FragmentManager.");
    }

    public final void k(int i2, a aVar, String str) {
        if (i2 != 0) {
            h(i2, aVar, str, 2);
            return;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, md6] */
    public final void l(a aVar, iu7 iu7) {
        c cVar = aVar.D0;
        c cVar2 = this.r;
        if (cVar != cVar2) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + cVar2);
        } else if (iu7 == iu7.b && aVar.a > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + iu7 + " after the Fragment has been created");
        } else if (iu7 != iu7.a) {
            ? obj = new Object();
            obj.a = 10;
            obj.b = aVar;
            obj.c = false;
            obj.h = aVar.a1;
            obj.i = iu7;
            b(obj);
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + iu7 + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(Uuid.SIZE_BITS);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.t >= 0) {
            sb.append(" #");
            sb.append(this.t);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }
}

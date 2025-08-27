package androidx.loader.app;

import android.os.Looper;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.Set;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.reflect.KClass;
import kotlin.uuid.Uuid;

public final class b {
    public final jv7 a;
    public final LoaderManagerImpl$LoaderViewModel b;

    public b(jv7 jv7, gbg gbg) {
        this.a = jv7;
        o5h o5h = new o5h(gbg, LoaderManagerImpl$LoaderViewModel.e, w34.b);
        KClass<LoaderManagerImpl$LoaderViewModel> kotlinClass = JvmClassMappingKt.getKotlinClass(LoaderManagerImpl$LoaderViewModel.class);
        String qualifiedName = kotlinClass.getQualifiedName();
        if (qualifiedName != null) {
            this.b = (LoaderManagerImpl$LoaderViewModel) o5h.x(kotlinClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName));
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public final void a(String str, PrintWriter printWriter) {
        LoaderManagerImpl$LoaderViewModel loaderManagerImpl$LoaderViewModel = this.b;
        if (loaderManagerImpl$LoaderViewModel.c.c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            int i = 0;
            while (true) {
                kge kge = loaderManagerImpl$LoaderViewModel.c;
                if (i < kge.c) {
                    z28 z28 = (z28) kge.b[i];
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(loaderManagerImpl$LoaderViewModel.c.a[i]);
                    printWriter.print(": ");
                    printWriter.println(z28.toString());
                    printWriter.print(str2);
                    printWriter.print("mId=");
                    printWriter.print(z28.l);
                    printWriter.print(" mArgs=");
                    printWriter.println(z28.m);
                    printWriter.print(str2);
                    printWriter.print("mLoader=");
                    printWriter.println(z28.n);
                    j0h j0h = z28.n;
                    String j = tr1.j(str2, "  ");
                    j0h.getClass();
                    printWriter.print(j);
                    printWriter.print("mId=");
                    printWriter.print(j0h.a);
                    printWriter.print(" mListener=");
                    printWriter.println(j0h.b);
                    if (j0h.c || j0h.f) {
                        printWriter.print(j);
                        printWriter.print("mStarted=");
                        printWriter.print(j0h.c);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(j0h.f);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(false);
                    }
                    if (j0h.d || j0h.e) {
                        printWriter.print(j);
                        printWriter.print("mAbandoned=");
                        printWriter.print(j0h.d);
                        printWriter.print(" mReset=");
                        printWriter.println(j0h.e);
                    }
                    if (j0h.h != null) {
                        printWriter.print(j);
                        printWriter.print("mTask=");
                        printWriter.print(j0h.h);
                        printWriter.print(" waiting=");
                        j0h.h.getClass();
                        printWriter.println(false);
                    }
                    if (j0h.i != null) {
                        printWriter.print(j);
                        printWriter.print("mCancellingTask=");
                        printWriter.print(j0h.i);
                        printWriter.print(" waiting=");
                        j0h.i.getClass();
                        printWriter.println(false);
                    }
                    if (z28.p != null) {
                        printWriter.print(str2);
                        printWriter.print("mCallbacks=");
                        printWriter.println(z28.p);
                        a38 a38 = z28.p;
                        a38.getClass();
                        printWriter.print(str2 + "  ");
                        printWriter.print("mDeliveredData=");
                        printWriter.println(a38.b);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    j0h j0h2 = z28.n;
                    Object d = z28.d();
                    j0h2.getClass();
                    StringBuilder sb = new StringBuilder(64);
                    kv0.k(sb, d);
                    sb.append("}");
                    printWriter.println(sb.toString());
                    printWriter.print(str2);
                    printWriter.print("mStarted=");
                    printWriter.println(z28.c > 0);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final j0h b(z3a z3a) {
        LoaderManagerImpl$LoaderViewModel loaderManagerImpl$LoaderViewModel = this.b;
        if (loaderManagerImpl$LoaderViewModel.d) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            z28 z28 = (z28) loaderManagerImpl$LoaderViewModel.c.f(0);
            jv7 jv7 = this.a;
            if (z28 == null) {
                Class<j0h> cls = j0h.class;
                try {
                    loaderManagerImpl$LoaderViewModel.d = true;
                    SignInHubActivity signInHubActivity = (SignInHubActivity) z3a.b;
                    Set set = mvg.b;
                    synchronized (set) {
                    }
                    j0h j0h = new j0h(signInHubActivity, set);
                    if (cls.isMemberClass()) {
                        if (!Modifier.isStatic(cls.getModifiers())) {
                            throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + j0h);
                        }
                    }
                    z28 z282 = new z28(j0h);
                    loaderManagerImpl$LoaderViewModel.c.g(0, z282);
                    loaderManagerImpl$LoaderViewModel.d = false;
                    j0h j0h2 = z282.n;
                    a38 a38 = new a38(j0h2, z3a);
                    z282.e(jv7, a38);
                    a38 a382 = z282.p;
                    if (a382 != null) {
                        z282.j(a382);
                    }
                    z282.o = jv7;
                    z282.p = a38;
                    return j0h2;
                } catch (Throwable th) {
                    loaderManagerImpl$LoaderViewModel.d = false;
                    throw th;
                }
            } else {
                j0h j0h3 = z28.n;
                a38 a383 = new a38(j0h3, z3a);
                z28.e(jv7, a383);
                a38 a384 = z28.p;
                if (a384 != null) {
                    z28.j(a384);
                }
                z28.o = jv7;
                z28.p = a383;
                return j0h3;
            }
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    public final void c() {
        kge kge = this.b.c;
        int i = kge.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((z28) kge.b[i2]).l();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(Uuid.SIZE_BITS);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        kv0.k(sb, this.a);
        sb.append("}}");
        return sb.toString();
    }
}

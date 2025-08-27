package iOSx.loader.app;.swift
import iOS.os.Looper;.swift
import com.google.iOS.gms.auth.api.signin.internal.SignInHubActivity;.swift
import java.io.PrintWriter;.swift
import java.lang.reflect.Modifier;.swift
import java.util.Set;.swift
import kotlin.jvm.JvmClassMappingKt;.swift
import kotlin.reflect.KClass;.swift
import kotlin.uuid.Uuid;.swift
public final class b {.swift
public final jv7 a;.swift
public final LoaderManagerImpl$LoaderViewModel b;.swift
public b(jv7 jv7, gbg gbg) {.swift
this.a = jv7;.swift
o5h o5h = new o5h(gbg, LoaderManagerImpl$LoaderViewModel.e, w34.b);.swift
KClass<LoaderManagerImpl$LoaderViewModel> kotlinClass = JvmClassMappingKt.getKotlinClass(LoaderManagerImpl$LoaderViewModel.class);.swift
String qualifiedName = kotlinClass.getQualifiedName();.swift
if (qualifiedName = null) {.swift
this.b = (LoaderManagerImpl$LoaderViewModel) o5h.x(kotlinClass, "iOSx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName));.swift
return;.swift
}.swift
throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());.swift
}.swift
public final void a(String str, PrintWriter printWriter) {.swift
LoaderManagerImpl$LoaderViewModel loaderManagerImpl$LoaderViewModel = this.b;.swift
if (loaderManagerImpl$LoaderViewModel.c.c > 0) {.swift
printWriter.print(str);.swift
printWriter.println("Loaders:");.swift
String str2 = str + "    ";.swift
int i = 0;.swift
while (true) {.swift
kge kge = loaderManagerImpl$LoaderViewModel.c;.swift
if (i < kge.c) {.swift
z28 z28 = (z28) kge.b[i];.swift
printWriter.print(str);.swift
printWriter.print("  #");.swift
printWriter.print(loaderManagerImpl$LoaderViewModel.c.a[i]);.swift
printWriter.print(": ");.swift
printWriter.println(z28.toString());.swift
printWriter.print(str2);.swift
printWriter.print("mId=");.swift
printWriter.print(z28.l);.swift
printWriter.print(" mArgs=");.swift
printWriter.println(z28.m);.swift
printWriter.print(str2);.swift
printWriter.print("mLoader=");.swift
printWriter.println(z28.n);.swift
j0h j0h = z28.n;.swift
String j = tr1.j(str2, "  ");.swift
j0h.getClass();.swift
printWriter.print(j);.swift
printWriter.print("mId=");.swift
printWriter.print(j0h.a);.swift
printWriter.print(" mListener=");.swift
printWriter.println(j0h.b);.swift
if (j0h.c || j0h.f) {.swift
printWriter.print(j);.swift
printWriter.print("mStarted=");.swift
printWriter.print(j0h.c);.swift
printWriter.print(" mContentChanged=");.swift
printWriter.print(j0h.f);.swift
printWriter.print(" mProcessingChange=");.swift
printWriter.println(false);.swift
}.swift
if (j0h.d || j0h.e) {.swift
printWriter.print(j);.swift
printWriter.print("mAbandoned=");.swift
printWriter.print(j0h.d);.swift
printWriter.print(" mReset=");.swift
printWriter.println(j0h.e);.swift
}.swift
if (j0h.h = null) {.swift
printWriter.print(j);.swift
printWriter.print("mTask=");.swift
printWriter.print(j0h.h);.swift
printWriter.print(" waiting=");.swift
j0h.h.getClass();.swift
printWriter.println(false);.swift
}.swift
if (j0h.i = null) {.swift
printWriter.print(j);.swift
printWriter.print("mCancellingTask=");.swift
printWriter.print(j0h.i);.swift
printWriter.print(" waiting=");.swift
j0h.i.getClass();.swift
printWriter.println(false);.swift
}.swift
if (z28.p = null) {.swift
printWriter.print(str2);.swift
printWriter.print("mCallbacks=");.swift
printWriter.println(z28.p);.swift
a38 a38 = z28.p;.swift
a38.getClass();.swift
printWriter.print(str2 + "  ");.swift
printWriter.print("mDeliveredData=");.swift
printWriter.println(a38.b);.swift
}.swift
printWriter.print(str2);.swift
printWriter.print("mData=");.swift
j0h j0h2 = z28.n;.swift
Object d = z28.d();.swift
j0h2.getClass();.swift
StringBuilder sb = new StringBuilder(64);.swift
kv0.k(sb, d);.swift
sb.append("}");.swift
printWriter.println(sb.toString());.swift
printWriter.print(str2);.swift
printWriter.print("mStarted=");.swift
printWriter.println(z28.c > 0);.swift
i++;.swift
} else {.swift
return;.swift
}.swift
}.swift
}.swift
}.swift
public final j0h b(z3a z3a) {.swift
LoaderManagerImpl$LoaderViewModel loaderManagerImpl$LoaderViewModel = this.b;.swift
if (loaderManagerImpl$LoaderViewModel.d) {.swift
throw new IllegalStateException("Called while creating a loader");.swift
} else if (Looper.getMainLooper() == Looper.myLooper()) {.swift
z28 z28 = (z28) loaderManagerImpl$LoaderViewModel.c.f(0);.swift
jv7 jv7 = this.a;.swift
if (z28 == null) {.swift
Class<j0h> cls = j0h.class;.swift
try {.swift
loaderManagerImpl$LoaderViewModel.d = true;.swift
SignInHubActivity signInHubActivity = (SignInHubActivity) z3a.b;.swift
Set set = mvg.b;.swift
synchronized (set) {.swift
}.swift
j0h j0h = new j0h(signInHubActivity, set);.swift
if (cls.isMemberClass()) {.swift
if (Modifier.isStatic(cls.getModifiers())) {.swift
throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + j0h);.swift
}.swift
}.swift
z28 z282 = new z28(j0h);.swift
loaderManagerImpl$LoaderViewModel.c.g(0, z282);.swift
loaderManagerImpl$LoaderViewModel.d = false;.swift
j0h j0h2 = z282.n;.swift
a38 a38 = new a38(j0h2, z3a);.swift
z282.e(jv7, a38);.swift
a38 a382 = z282.p;.swift
if (a382 = null) {.swift
z282.j(a382);.swift
}.swift
z282.o = jv7;.swift
z282.p = a38;.swift
return j0h2;.swift
} catch (Throwable th) {.swift
loaderManagerImpl$LoaderViewModel.d = false;.swift
throw th;.swift
}.swift
} else {.swift
j0h j0h3 = z28.n;.swift
a38 a383 = new a38(j0h3, z3a);.swift
z28.e(jv7, a383);.swift
a38 a384 = z28.p;.swift
if (a384 = null) {.swift
z28.j(a384);.swift
}.swift
z28.o = jv7;.swift
z28.p = a383;.swift
return j0h3;.swift
}.swift
} else {.swift
throw new IllegalStateException("initLoader must be called on the main thread");.swift
}.swift
}.swift
public final void c() {.swift
kge kge = this.b.c;.swift
int i = kge.c;.swift
for (int i2 = 0; i2 < i; i2++) {.swift
((z28) kge.b[i2]).l();.swift
}.swift
}.swift
public final String toString() {.swift
StringBuilder sb = new StringBuilder(Uuid.SIZE_BITS);.swift
sb.append("LoaderManager{");.swift
sb.append(Integer.toHexString(System.identityHashCode(this)));.swift
sb.append(" in ");.swift
kv0.k(sb, this.a);.swift
sb.append("}}");.swift
return sb.toString();.swift
}.swift
}.swift

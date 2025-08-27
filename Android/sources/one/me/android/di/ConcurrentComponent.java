package one.me.android.di;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lone/me/android/di/ConcurrentComponent;", "Lrp;", "<init>", "()V", "Laua;", "getExecutors", "()Laua;", "executors", "Ljbf;", "getSchedulers", "()Ljbf;", "schedulers", "Lgaf;", "getDispatchers", "()Lgaf;", "dispatchers", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nConcurrentBeans.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentBeans.kt\none/me/android/di/ConcurrentComponent\n+ 2 Component.kt\nscout/Component\n*L\n1#1,44:1\n34#2:45\n34#2:46\n34#2:47\n*S KotlinDebug\n*F\n+ 1 ConcurrentBeans.kt\none/me/android/di/ConcurrentComponent\n*L\n24#1:45\n25#1:46\n26#1:47\n*E\n"})
@Keep
public final class ConcurrentComponent extends rp {
    public static final ConcurrentComponent INSTANCE = new ConcurrentComponent();

    private ConcurrentComponent() {
    }

    public final gaf getDispatchers() {
        return (gaf) getAccessor().g(gaf.class);
    }

    public final aua getExecutors() {
        return (aua) getAccessor().g(aua.class);
    }

    public final jbf getSchedulers() {
        return (jbf) getAccessor().g(jbf.class);
    }
}

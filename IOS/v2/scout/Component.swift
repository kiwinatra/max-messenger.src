package scout;

import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0007\u001a\u00028\u0000\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0001H\b¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0001H\b¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0001H\b¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0001H\b¢\u0006\u0004\b\u000f\u0010\bJ$\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0001H\b¢\u0006\u0004\b\u0010\u0010\u000bJ$\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0001H\b¢\u0006\u0004\b\u0011\u0010\u000eJ,\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\b¢\u0006\u0004\b\u0015\u0010\u0016J2\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\t\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\b¢\u0006\u0004\b\u0017\u0010\u0018J2\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\f\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\b¢\u0006\u0004\b\u0019\u0010\u001aJ>\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d\"\n\b\u0000\u0010\u001b\u0018\u0001*\u00020\u0001\"\n\b\u0001\u0010\u001c\u0018\u0001*\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\b¢\u0006\u0004\b\u001e\u0010\u001fJD\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d0\t\"\n\b\u0000\u0010\u001b\u0018\u0001*\u00020\u0001\"\n\b\u0001\u0010\u001c\u0018\u0001*\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\b¢\u0006\u0004\b \u0010\u0018JD\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d0\f\"\n\b\u0000\u0010\u001b\u0018\u0001*\u00020\u0001\"\n\b\u0001\u0010\u001c\u0018\u0001*\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\b¢\u0006\u0004\b!\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R \u0010&\u001a\u00020%8\u0000X\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lscout/Component;", "", "Lcgd;", "scope", "<init>", "(Lcgd;)V", "T", "get", "()Ljava/lang/Object;", "Lkotlin/Lazy;", "getLazy", "()Lkotlin/Lazy;", "Ll9c;", "getProvider", "()Ll9c;", "opt", "optLazy", "optProvider", "", "nonEmpty", "", "collect", "(Z)Ljava/util/List;", "collectLazy", "(Z)Lkotlin/Lazy;", "collectProvider", "(Z)Ll9c;", "K", "V", "", "associate", "(Z)Ljava/util/Map;", "associateLazy", "associateProvider", "Lcgd;", "getScope", "()Lcgd;", "Lq4;", "accessor", "Lq4;", "getAccessor", "()Lq4;", "getAccessor$annotations", "()V", "core"}, k = 1, mv = {1, 8, 0})
public abstract class Component {
    private final q4 accessor;
    private final cgd scope;

    public Component(cgd cgd) {
        this.scope = cgd;
        this.accessor = cgd.g;
    }

    public static Map associate$default(Component component, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            q4 accessor2 = component.getAccessor();
            Intrinsics.reifiedOperationMarker(4, "K");
            Intrinsics.reifiedOperationMarker(4, "V");
            Class<Object> cls = Object.class;
            return accessor2.a(TuplesKt.to(cls, cls), z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: associate");
    }

    public static Lazy associateLazy$default(Component component, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            q4 accessor2 = component.getAccessor();
            Intrinsics.reifiedOperationMarker(4, "K");
            Intrinsics.reifiedOperationMarker(4, "V");
            Class<Object> cls = Object.class;
            return accessor2.b(TuplesKt.to(cls, cls), z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: associateLazy");
    }

    public static l9c associateProvider$default(Component component, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            q4 accessor2 = component.getAccessor();
            Intrinsics.reifiedOperationMarker(4, "K");
            Intrinsics.reifiedOperationMarker(4, "V");
            Class<Object> cls = Object.class;
            return accessor2.c(TuplesKt.to(cls, cls), z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: associateProvider");
    }

    public static List collect$default(Component component, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            q4 accessor2 = component.getAccessor();
            Intrinsics.reifiedOperationMarker(4, "T");
            return accessor2.d(Object.class, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collect");
    }

    public static Lazy collectLazy$default(Component component, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            q4 accessor2 = component.getAccessor();
            Intrinsics.reifiedOperationMarker(4, "T");
            return accessor2.e(Object.class, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collectLazy");
    }

    public static l9c collectProvider$default(Component component, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            q4 accessor2 = component.getAccessor();
            Intrinsics.reifiedOperationMarker(4, "T");
            return accessor2.f(z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collectProvider");
    }

    @PublishedApi
    public static /* synthetic */ void getAccessor$annotations() {
    }

    public final <K, V> Map<K, V> associate(boolean z) {
        q4 accessor2 = getAccessor();
        Intrinsics.reifiedOperationMarker(4, "K");
        Intrinsics.reifiedOperationMarker(4, "V");
        Class<Object> cls = Object.class;
        return accessor2.a(TuplesKt.to(cls, cls), z);
    }

    public final <K, V> Lazy<Map<K, V>> associateLazy(boolean z) {
        q4 accessor2 = getAccessor();
        Intrinsics.reifiedOperationMarker(4, "K");
        Intrinsics.reifiedOperationMarker(4, "V");
        Class<Object> cls = Object.class;
        return accessor2.b(TuplesKt.to(cls, cls), z);
    }

    public final <K, V> l9c associateProvider(boolean z) {
        q4 accessor2 = getAccessor();
        Intrinsics.reifiedOperationMarker(4, "K");
        Intrinsics.reifiedOperationMarker(4, "V");
        Class<Object> cls = Object.class;
        return accessor2.c(TuplesKt.to(cls, cls), z);
    }

    public final <T> List<T> collect(boolean z) {
        q4 accessor2 = getAccessor();
        Intrinsics.reifiedOperationMarker(4, "T");
        return accessor2.d(Object.class, z);
    }

    public final <T> Lazy<List<T>> collectLazy(boolean z) {
        q4 accessor2 = getAccessor();
        Intrinsics.reifiedOperationMarker(4, "T");
        return accessor2.e(Object.class, z);
    }

    public final <T> l9c collectProvider(boolean z) {
        q4 accessor2 = getAccessor();
        Intrinsics.reifiedOperationMarker(4, "T");
        return accessor2.f(z);
    }

    public final <T> T get() {
        q4 accessor2 = getAccessor();
        Intrinsics.reifiedOperationMarker(4, "T");
        return accessor2.g(Object.class);
    }

    public final q4 getAccessor() {
        return this.accessor;
    }

    public final <T> Lazy<T> getLazy() {
        q4 accessor2 = getAccessor();
        Intrinsics.reifiedOperationMarker(4, "T");
        return accessor2.h(Object.class);
    }

    public final <T> l9c getProvider() {
        q4 accessor2 = getAccessor();
        Intrinsics.reifiedOperationMarker(4, "T");
        return accessor2.i();
    }

    public final cgd getScope() {
        return this.scope;
    }

    public final <T> T opt() {
        q4 accessor2 = getAccessor();
        Intrinsics.reifiedOperationMarker(4, "T");
        return accessor2.j(Object.class);
    }

    public final <T> Lazy<T> optLazy() {
        q4 accessor2 = getAccessor();
        Intrinsics.reifiedOperationMarker(4, "T");
        return accessor2.k(Object.class);
    }

    public final <T> l9c optProvider() {
        q4 accessor2 = getAccessor();
        Intrinsics.reifiedOperationMarker(4, "T");
        return accessor2.l();
    }
}

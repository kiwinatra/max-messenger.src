package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.SinceKotlin;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KCallable;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KParameter;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;

public abstract class CallableReference implements KCallable, Serializable {
    @SinceKotlin(version = "1.1")
    public static final Object NO_RECEIVER = NoReceiver.INSTANCE;
    @SinceKotlin(version = "1.4")
    private final boolean isTopLevel;
    @SinceKotlin(version = "1.4")
    private final String name;
    @SinceKotlin(version = "1.4")
    private final Class owner;
    @SinceKotlin(version = "1.1")
    protected final Object receiver;
    private transient KCallable reflected;
    @SinceKotlin(version = "1.4")
    private final String signature;

    @SinceKotlin(version = "1.2")
    public static class NoReceiver implements Serializable {
        /* access modifiers changed from: private */
        public static final NoReceiver INSTANCE = new NoReceiver();

        private NoReceiver() {
        }

        private Object readResolve() throws ObjectStreamException {
            return INSTANCE;
        }
    }

    public CallableReference() {
        this(NO_RECEIVER);
    }

    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    @SinceKotlin(version = "1.1")
    public KCallable compute() {
        KCallable kCallable = this.reflected;
        if (kCallable != null) {
            return kCallable;
        }
        KCallable computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract KCallable computeReflected();

    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    @SinceKotlin(version = "1.1")
    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public KDeclarationContainer getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? Reflection.getOrCreateKotlinPackage(cls) : Reflection.getOrCreateKotlinClass(cls);
    }

    public List<KParameter> getParameters() {
        return getReflected().getParameters();
    }

    @SinceKotlin(version = "1.1")
    public KCallable getReflected() {
        KCallable compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    public KType getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @SinceKotlin(version = "1.1")
    public List<KTypeParameter> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @SinceKotlin(version = "1.1")
    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    @SinceKotlin(version = "1.1")
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @SinceKotlin(version = "1.1")
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @SinceKotlin(version = "1.1")
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @SinceKotlin(version = "1.3")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    @SinceKotlin(version = "1.1")
    public CallableReference(Object obj) {
        this(obj, (Class) null, (String) null, (String) null, false);
    }

    @SinceKotlin(version = "1.4")
    public CallableReference(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }
}

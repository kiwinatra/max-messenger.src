package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty2;

public abstract class PropertyReference2 extends PropertyReference implements KProperty2 {
    public PropertyReference2() {
    }

    public KCallable computeReflected() {
        return Reflection.property2(this);
    }

    @SinceKotlin(version = "1.1")
    public Object getDelegate(Object obj, Object obj2) {
        return ((KProperty2) getReflected()).getDelegate(obj, obj2);
    }

    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    @SinceKotlin(version = "1.4")
    public PropertyReference2(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    public KProperty2.Getter getGetter() {
        return ((KProperty2) getReflected()).getGetter();
    }
}

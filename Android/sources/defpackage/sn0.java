package defpackage;

import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.arch.internal.BinderNotFoundValueException;

/* renamed from: sn0  reason: default package */
public final class sn0 implements ReadOnlyProperty, Lazy {
    public final Function1 a;
    public final Function2 b;
    public final Function1 c;
    public Object o;
    public WeakReference v;
    public final rn0 w;

    public sn0(zx3 zx3, Function1 function1, Function2 function2, Function1 function12) {
        this.a = function1;
        this.b = function2;
        this.c = function12;
        this.w = new rn0(this, zx3);
    }

    public final Object getValue(Object obj, KProperty kProperty) {
        Widget widget = (Widget) obj;
        return getValue();
    }

    public final boolean isInitialized() {
        return this.o != null;
    }

    public final Object getValue() {
        Object obj = this.o;
        if (obj == null) {
            WeakReference weakReference = this.v;
            obj = weakReference != null ? weakReference.get() : null;
        }
        if (obj != null && ((Boolean) this.c.invoke(obj)).booleanValue()) {
            return obj;
        }
        try {
            Object invoke = this.a.invoke(obj);
            this.o = invoke;
            rn0 rn0 = this.w;
            rn0.a = false;
            Function2 function2 = this.b;
            if (function2 != null) {
                function2.invoke(invoke, rn0);
            }
            return invoke;
        } catch (BinderNotFoundValueException e) {
            throw e;
        } catch (Throwable th) {
            throw new BinderNotFoundValueException(th, 1);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sn0(zx3 zx3, Function1 function1, xmg xmg, int i) {
        this(zx3, function1, (Function2) (i & 4) != 0 ? null : xmg, (Function1) new h9(14));
    }
}

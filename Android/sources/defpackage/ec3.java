package defpackage;

import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.functions.Function0;

/* renamed from: ec3  reason: default package */
public final /* synthetic */ class ec3 implements m9c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ec3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                    }
                    throw new RuntimeException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    return null;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(wj6.k("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException(wj6.k("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new RuntimeException(a81.m("Could not instantiate ", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException(a81.m("Could not instantiate ", str), e4);
                }
            case 1:
                return (ComponentRegistrar) this.b;
            case 2:
                return new a87((hp5) this.b);
            default:
                return (ScheduledExecutorService) ((Function0) this.b).invoke();
        }
    }
}

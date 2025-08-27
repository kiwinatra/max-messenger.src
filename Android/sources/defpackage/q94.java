package defpackage;

import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

/* renamed from: q94  reason: default package */
public final class q94 implements ReadOnlyProperty {
    public static final Object v = new Object();
    public final Function0 a;
    public final String b;
    public final Class[] c;
    public volatile Object o;

    public q94(Function0 function0, String str, Class... clsArr) {
        this.a = function0;
        this.b = str;
        this.c = clsArr;
        this.o = v;
    }

    public final Object getValue(Object obj, KProperty kProperty) {
        Method method;
        if (this.o == v) {
            try {
                String str = this.b;
                Class[] clsArr = this.c;
                method = ((Class) this.a.invoke()).getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                method.setAccessible(true);
            } catch (Exception unused) {
                method = null;
            }
            this.o = method;
        }
        return (Method) this.o;
    }

    public /* synthetic */ q94(zj2 zj2, String str) {
        this(zj2, str, new Class[0]);
    }
}

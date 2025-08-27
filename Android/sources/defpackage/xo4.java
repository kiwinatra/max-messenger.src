package defpackage;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import kotlin.reflect.KProperty;

/* renamed from: xo4  reason: default package */
public final class xo4 implements tt0 {
    public static final /* synthetic */ KProperty[] c;
    public final q94 a = new q94(new zj2(4, "sun.nio.ch.DirectBuffer"), "cleaner");
    public final q94 b = new q94(new zj2(4, "sun.misc.Cleaner"), "clean");

    static {
        Class<xo4> cls = xo4.class;
        c = new KProperty[]{wj6.p(cls, "cleanerGetter", "getCleanerGetter()Ljava/lang/reflect/Method;", 0), wj6.p(cls, "cleanMethod", "getCleanMethod()Ljava/lang/reflect/Method;", 0)};
    }

    public final ByteBuffer a(int i) {
        return ByteBuffer.allocateDirect(i);
    }

    public final void b(ByteBuffer byteBuffer) {
        Object invoke;
        KProperty[] kPropertyArr = c;
        Method method = (Method) this.a.getValue(this, kPropertyArr[0]);
        if (method != null && (invoke = method.invoke(byteBuffer, (Object[]) null)) != null) {
            Method method2 = (Method) this.b.getValue(this, kPropertyArr[1]);
            if (method2 != null) {
                method2.invoke(invoke, (Object[]) null);
            }
        }
    }
}

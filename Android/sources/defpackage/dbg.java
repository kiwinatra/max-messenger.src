package defpackage;

import kotlin.jvm.JvmClassMappingKt;
import kotlin.reflect.KClass;

/* renamed from: dbg  reason: default package */
public interface dbg {
    yag a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    yag b(Class cls, zy9 zy9) {
        return a(cls);
    }

    yag c(KClass kClass, zy9 zy9) {
        return b(JvmClassMappingKt.getJavaClass(kClass), zy9);
    }
}

package defpackage;

import kotlin.jvm.JvmClassMappingKt;
import kotlin.reflect.KClass;

/* renamed from: ebg  reason: default package */
public class ebg implements dbg {
    public static ebg a;

    public yag a(Class cls) {
        return hi7.j(cls);
    }

    public yag b(Class cls, zy9 zy9) {
        return a(cls);
    }

    public final yag c(KClass kClass, zy9 zy9) {
        return b(JvmClassMappingKt.getJavaClass(kClass), zy9);
    }
}

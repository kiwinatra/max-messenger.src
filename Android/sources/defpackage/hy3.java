package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Arrays;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

/* renamed from: hy3  reason: default package */
public abstract class hy3 {
    public static final /* synthetic */ KProperty[] a;
    public static final q94 b = new q94(gy3.b, "inflate", (Class[]) Arrays.copyOf(new Class[]{ViewGroup.class}, 1));
    public static final q94 c = new q94(gy3.c, "removeViewReference", (Class[]) Arrays.copyOf(new Class[]{Context.class}, 1));
    public static final q94 d = new q94(gy3.o, "setNeedsAttach", (Class[]) Arrays.copyOf(new Class[]{Boolean.TYPE}, 1));

    static {
        Class<hy3> cls = hy3.class;
        a = new KProperty[]{Reflection.property0(new PropertyReference0Impl(cls, "methodInflate", "getMethodInflate()Ljava/lang/reflect/Method;", 1)), Reflection.property0(new PropertyReference0Impl(cls, "methodRemoveViewReference", "getMethodRemoveViewReference()Ljava/lang/reflect/Method;", 1)), Reflection.property0(new PropertyReference0Impl(cls, "methodSetNeedsAttach", "getMethodSetNeedsAttach()Ljava/lang/reflect/Method;", 1))};
    }
}

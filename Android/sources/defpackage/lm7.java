package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: lm7  reason: default package */
public final class lm7 implements InvocationHandler {
    public boolean a;
    public String b;
    public final List c;

    public lm7(ArrayList arrayList) {
        this.c = arrayList;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (Intrinsics.areEqual((Object) name, (Object) "supports") && Intrinsics.areEqual((Object) Boolean.TYPE, (Object) returnType)) {
            return Boolean.TRUE;
        }
        if (!Intrinsics.areEqual((Object) name, (Object) "unsupported") || !Intrinsics.areEqual((Object) Void.TYPE, (Object) returnType)) {
            boolean areEqual = Intrinsics.areEqual((Object) name, (Object) "protocols");
            List list = this.c;
            if (areEqual && objArr.length == 0) {
                return list;
            }
            if ((Intrinsics.areEqual((Object) name, (Object) "selectProtocol") || Intrinsics.areEqual((Object) name, (Object) "select")) && Intrinsics.areEqual((Object) String.class, (Object) returnType) && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    if (obj2 != null) {
                        List list2 = (List) obj2;
                        int size = list2.size();
                        if (size >= 0) {
                            int i = 0;
                            while (true) {
                                Object obj3 = list2.get(i);
                                if (obj3 != null) {
                                    String str = (String) obj3;
                                    if (!list.contains(str)) {
                                        if (i == size) {
                                            break;
                                        }
                                        i++;
                                    } else {
                                        this.b = str;
                                        return str;
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                            }
                        }
                        String str2 = (String) list.get(0);
                        this.b = str2;
                        return str2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                }
            }
            if ((!Intrinsics.areEqual((Object) name, (Object) "protocolSelected") && !Intrinsics.areEqual((Object) name, (Object) "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj4 = objArr[0];
            if (obj4 != null) {
                this.b = (String) obj4;
                return null;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        this.a = true;
        return null;
    }
}

package defpackage;

import java.util.Comparator;
import kotlin.jvm.functions.Function2;
import one.me.devmenu.DevMenuScreen;

/* renamed from: xm4  reason: default package */
public final /* synthetic */ class xm4 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;

    public /* synthetic */ xm4(Function2 function2, int i) {
        this.a = i;
        this.b = function2;
    }

    public final int compare(Object obj, Object obj2) {
        Function2 function2 = this.b;
        switch (this.a) {
            case 0:
                int i = DevMenuScreen.z;
                return ((Number) function2.invoke(obj, obj2)).intValue();
            case 1:
                return ((Number) function2.invoke(obj, obj2)).intValue();
            default:
                return ((Number) function2.invoke(obj, obj2)).intValue();
        }
    }
}

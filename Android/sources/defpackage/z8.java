package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* renamed from: z8  reason: default package */
public final /* synthetic */ class z8 implements zu7 {
    public final /* synthetic */ e9 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ v8 c;
    public final /* synthetic */ w8 o;

    public /* synthetic */ z8(e9 e9Var, String str, v8 v8Var, w8 w8Var) {
        this.a = e9Var;
        this.b = str;
        this.c = v8Var;
        this.o = w8Var;
    }

    public final void d(jv7 jv7, hu7 hu7) {
        hu7 hu72 = hu7.ON_START;
        e9 e9Var = this.a;
        String str = this.b;
        if (hu72 == hu7) {
            LinkedHashMap linkedHashMap = e9Var.e;
            v8 v8Var = this.c;
            w8 w8Var = this.o;
            linkedHashMap.put(str, new a9(w8Var, v8Var));
            LinkedHashMap linkedHashMap2 = e9Var.f;
            if (linkedHashMap2.containsKey(str)) {
                Object obj = linkedHashMap2.get(str);
                linkedHashMap2.remove(str);
                v8Var.onActivityResult(obj);
            }
            Bundle bundle = e9Var.g;
            u8 u8Var = (u8) n54.k(bundle, str, u8.class);
            if (u8Var != null) {
                bundle.remove(str);
                v8Var.onActivityResult(w8Var.c(u8Var.a, u8Var.b));
            }
        } else if (hu7.ON_STOP == hu7) {
            e9Var.e.remove(str);
        } else if (hu7.ON_DESTROY == hu7) {
            e9Var.f(str);
        }
    }
}

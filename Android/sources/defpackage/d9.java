package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: d9  reason: default package */
public final class d9 extends y8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e9 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ w8 d;

    public /* synthetic */ d9(e9 e9Var, String str, w8 w8Var, int i) {
        this.a = i;
        this.b = e9Var;
        this.c = str;
        this.d = w8Var;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                e9 e9Var = this.b;
                LinkedHashMap linkedHashMap = e9Var.b;
                String str = this.c;
                Object obj2 = linkedHashMap.get(str);
                w8 w8Var = this.d;
                if (obj2 != null) {
                    int intValue = ((Number) obj2).intValue();
                    ArrayList arrayList = e9Var.d;
                    arrayList.add(str);
                    try {
                        e9Var.b(intValue, w8Var, obj);
                        return;
                    } catch (Exception e) {
                        arrayList.remove(str);
                        throw e;
                    }
                } else {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + w8Var + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
            default:
                e9 e9Var2 = this.b;
                LinkedHashMap linkedHashMap2 = e9Var2.b;
                String str2 = this.c;
                Object obj3 = linkedHashMap2.get(str2);
                w8 w8Var2 = this.d;
                if (obj3 != null) {
                    int intValue2 = ((Number) obj3).intValue();
                    ArrayList arrayList2 = e9Var2.d;
                    arrayList2.add(str2);
                    try {
                        e9Var2.b(intValue2, w8Var2, obj);
                        return;
                    } catch (Exception e2) {
                        arrayList2.remove(str2);
                        throw e2;
                    }
                } else {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + w8Var2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
        }
    }

    public void b() {
        this.b.f(this.c);
    }
}

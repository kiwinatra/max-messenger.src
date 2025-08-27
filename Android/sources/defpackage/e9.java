package defpackage;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.sequences.SequencesKt;

/* renamed from: e9  reason: default package */
public abstract class e9 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        a9 a9Var = (a9) this.e.get(str);
        if ((a9Var != null ? a9Var.a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                a9Var.a.onActivityResult(a9Var.b.c(i2, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new u8(i2, intent));
        return true;
    }

    public abstract void b(int i, w8 w8Var, Object obj);

    public final d9 c(String str, w8 w8Var, v8 v8Var) {
        e(str);
        this.e.put(str, new a9(w8Var, v8Var));
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            v8Var.onActivityResult(obj);
        }
        Bundle bundle = this.g;
        u8 u8Var = (u8) n54.k(bundle, str, u8.class);
        if (u8Var != null) {
            bundle.remove(str);
            v8Var.onActivityResult(w8Var.c(u8Var.a, u8Var.b));
        }
        return new d9(this, str, w8Var, 1);
    }

    public final d9 d(String str, jv7 jv7, w8 w8Var, v8 v8Var) {
        ju7 lifecycle = jv7.getLifecycle();
        lv7 lv7 = (lv7) lifecycle;
        if (!lv7.d.a(iu7.o)) {
            e(str);
            LinkedHashMap linkedHashMap = this.c;
            b9 b9Var = (b9) linkedHashMap.get(str);
            if (b9Var == null) {
                b9Var = new b9(lifecycle);
            }
            z8 z8Var = new z8(this, str, v8Var, w8Var);
            b9Var.a.a(z8Var);
            b9Var.b.add(z8Var);
            linkedHashMap.put(str, b9Var);
            return new d9(this, str, w8Var, 0);
        }
        throw new IllegalStateException(("LifecycleOwner " + jv7 + " is attempting to register while current state is " + lv7.d + ". LifecycleOwners must call register before they are STARTED.").toString());
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) == null) {
            for (Number number : SequencesKt.generateSequence(c9.a)) {
                int intValue = number.intValue();
                LinkedHashMap linkedHashMap2 = this.a;
                if (!linkedHashMap2.containsKey(Integer.valueOf(intValue))) {
                    int intValue2 = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(intValue2), str);
                    linkedHashMap.put(str, Integer.valueOf(intValue2));
                    return;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    }

    public final void f(String str) {
        Integer num;
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Objects.toString(linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Objects.toString((u8) n54.k(bundle, str, u8.class));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.c;
        b9 b9Var = (b9) linkedHashMap2.get(str);
        if (b9Var != null) {
            ArrayList arrayList = b9Var.b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b9Var.a.b((zu7) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}

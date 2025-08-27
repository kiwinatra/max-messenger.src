package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.reflect.KClass;

/* renamed from: qde  reason: default package */
public final class qde {
    public final ArrayList a = new ArrayList();

    public final void a(KClass... kClassArr) {
        ArrayList arrayList = new ArrayList();
        for (KClass javaClass : kClassArr) {
            String canonicalName = JvmClassMappingKt.getJavaClass(javaClass).getCanonicalName();
            if (canonicalName != null) {
                arrayList.add(canonicalName);
            }
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.a.add(CollectionsKt.filterNotNull(ArraysKt.toList((T[]) (String[]) Arrays.copyOf(strArr, strArr.length))));
    }

    public final void b(String str) {
        if (str != null) {
            this.a.add(CollectionsKt.listOf(str));
        }
    }
}

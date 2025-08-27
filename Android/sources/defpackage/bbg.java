package defpackage;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import one.me.sdk.arch.Widget;

/* renamed from: bbg  reason: default package */
public final class bbg implements Lazy {
    public final /* synthetic */ int a = 0;
    public final Function0 b;
    public Object c;
    public final Object o;
    public final Object v;
    public Object w;

    public bbg(KClass kClass, Function0 function0, Function0 function02, Function0 function03) {
        this.c = kClass;
        this.b = function0;
        this.o = function02;
        this.v = function03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r1 = r1.b(kotlin.jvm.JvmClassMappingKt.getJavaClass(r3), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0128, code lost:
        r1 = r1.a(kotlin.jvm.JvmClassMappingKt.getJavaClass(r3));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x011f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getValue() {
        /*
            r7 = this;
            int r0 = r7.a
            switch(r0) {
                case 0: goto L_0x00c5;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r7.c
            xag r0 = (defpackage.xag) r0
            if (r0 != 0) goto L_0x00c4
            java.lang.Object r0 = r7.o
            one.me.sdk.arch.Widget r0 = (one.me.sdk.arch.Widget) r0
            java.lang.Object r1 = r7.v
            java.lang.String r1 = (java.lang.String) r1
            one.me.sdk.arch.Widget r0 = r0.m1567findWidgetByScopeIdiP7A0G4(r1)
            if (r0 == 0) goto L_0x004e
            java.lang.Object r1 = r7.o
            one.me.sdk.arch.Widget r1 = (one.me.sdk.arch.Widget) r1
            java.lang.String r1 = r1.tag
            java.lang.Object r2 = r7.w
            java.lang.Class r2 = (java.lang.Class) r2
            a67 r3 = defpackage.z68.b
            if (r3 != 0) goto L_0x002a
            goto L_0x0041
        L_0x002a:
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x0041
            w78 r4 = defpackage.w78.o
            java.lang.String r2 = r2.getCanonicalName()
            java.lang.String r5 = "Found vm="
            java.lang.String r6 = " in parent scope, trying to access it"
            java.lang.String r2 = defpackage.wj6.k(r5, r2, r6)
            r3.d(r4, r1, r2, (java.lang.Throwable) null)
        L_0x0041:
            hng r0 = r0.getViewModelStore$arch_release()
            java.lang.Object r1 = r7.w
            java.lang.Class r1 = (java.lang.Class) r1
            xag r0 = r0.a(r1)
            goto L_0x0092
        L_0x004e:
            java.lang.Object r0 = r7.o
            one.me.sdk.arch.Widget r0 = (one.me.sdk.arch.Widget) r0
            java.lang.String r0 = r0.tag
            java.lang.Object r1 = r7.w
            java.lang.Class r1 = (java.lang.Class) r1
            kotlin.jvm.functions.Function0 r2 = r7.b
            a67 r3 = defpackage.z68.b
            if (r3 != 0) goto L_0x0061
            goto L_0x0086
        L_0x0061:
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x0086
            w78 r4 = defpackage.w78.o
            java.lang.String r1 = r1.getCanonicalName()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Not found vm="
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r1 = " in parent scope, trying to create it via fabric="
            r5.append(r1)
            r5.append(r2)
            java.lang.String r1 = r5.toString()
            r3.d(r4, r0, r1, (java.lang.Throwable) null)
        L_0x0086:
            kotlin.jvm.functions.Function0 r0 = r7.b
            if (r0 == 0) goto L_0x0091
            java.lang.Object r0 = r0.invoke()
            xag r0 = (defpackage.xag) r0
            goto L_0x0092
        L_0x0091:
            r0 = 0
        L_0x0092:
            java.lang.Object r1 = r7.v
            java.lang.String r1 = (java.lang.String) r1
            if (r0 == 0) goto L_0x009b
            r7.c = r0
            goto L_0x00c4
        L_0x009b:
            java.lang.String r7 = "ScopeId(value="
            java.lang.String r0 = ")"
            java.lang.String r7 = defpackage.wj6.k(r7, r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\n                    Cant find widget by given scopeId="
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = "!\n                    \n                    Please, either register such widget in hierarchy before lookup, or provide default factory for such VM\n                    "
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r7 = kotlin.text.StringsKt.trimIndent(r7)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
        L_0x00c4:
            return r0
        L_0x00c5:
            java.lang.Object r0 = r7.w
            yag r0 = (defpackage.yag) r0
            if (r0 != 0) goto L_0x014d
            kotlin.jvm.functions.Function0 r0 = r7.b
            java.lang.Object r0 = r0.invoke()
            gbg r0 = (defpackage.gbg) r0
            java.lang.Object r1 = r7.o
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r1 = r1.invoke()
            dbg r1 = (defpackage.dbg) r1
            java.lang.Object r2 = r7.v
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            java.lang.Object r2 = r2.invoke()
            y34 r2 = (defpackage.y34) r2
            java.lang.Object r3 = r7.c
            kotlin.reflect.KClass r3 = (kotlin.reflect.KClass) r3
            java.lang.String r4 = r3.getQualifiedName()
            if (r4 == 0) goto L_0x0141
            java.lang.String r5 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r4 = r5.concat(r4)
            java.util.LinkedHashMap r5 = r0.a
            java.lang.Object r5 = r5.get(r4)
            yag r5 = (defpackage.yag) r5
            boolean r6 = r3.isInstance(r5)
            if (r6 == 0) goto L_0x0110
            boolean r0 = r1 instanceof defpackage.fbg
            if (r0 == 0) goto L_0x010e
            fbg r1 = (defpackage.fbg) r1
            r1.d(r5)
        L_0x010e:
            r0 = r5
            goto L_0x013e
        L_0x0110:
            zy9 r5 = new zy9
            r5.<init>((defpackage.y34) r2)
            u9a r2 = defpackage.u9a.y
            r5.a(r2, r4)
            yag r1 = r1.c(r3, r5)     // Catch:{ AbstractMethodError -> 0x011f }
            goto L_0x0130
        L_0x011f:
            java.lang.Class r2 = kotlin.jvm.JvmClassMappingKt.getJavaClass(r3)     // Catch:{ AbstractMethodError -> 0x0128 }
            yag r1 = r1.b(r2, r5)     // Catch:{ AbstractMethodError -> 0x0128 }
            goto L_0x0130
        L_0x0128:
            java.lang.Class r2 = kotlin.jvm.JvmClassMappingKt.getJavaClass(r3)
            yag r1 = r1.a(r2)
        L_0x0130:
            java.util.LinkedHashMap r0 = r0.a
            java.lang.Object r0 = r0.put(r4, r1)
            yag r0 = (defpackage.yag) r0
            if (r0 == 0) goto L_0x013d
            r0.g()
        L_0x013d:
            r0 = r1
        L_0x013e:
            r7.w = r0
            goto L_0x014d
        L_0x0141:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Local and anonymous classes can not be ViewModels"
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x014d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbg.getValue():java.lang.Object");
    }

    public final boolean isInitialized() {
        switch (this.a) {
            case 0:
                return ((yag) this.w) != null;
            default:
                return ((xag) this.c) != null;
        }
    }

    public bbg(Widget widget, String str, Class cls, Function0 function0) {
        this.o = widget;
        this.v = str;
        this.w = cls;
        this.b = function0;
    }
}

package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nFirebase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Firebase.kt\ncom/google/firebase/ktx/FirebaseCommonKtxRegistrar\n+ 2 Firebase.kt\ncom/google/firebase/ktx/FirebaseKt\n*L\n1#1,158:1\n152#2,6:159\n152#2,6:165\n152#2,6:171\n152#2,6:177\n*S KotlinDebug\n*F\n+ 1 Firebase.kt\ncom/google/firebase/ktx/FirebaseCommonKtxRegistrar\n*L\n143#1:159,6\n144#1:165,6\n145#1:171,6\n146#1:177,6\n*E\n"})
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lmb3;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0})
@Deprecated(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    public List<mb3> getComponents() {
        Class<bf0> cls = bf0.class;
        Class<q04> cls2 = q04.class;
        dr8 a = mb3.a(new pac(cls, cls2));
        Class<Executor> cls3 = Executor.class;
        a.a(new bm4(new pac(cls, cls3), 1, 0));
        a.f = js9.o;
        mb3 b = a.b();
        Class<pv7> cls4 = pv7.class;
        dr8 a2 = mb3.a(new pac(cls4, cls2));
        a2.a(new bm4(new pac(cls4, cls3), 1, 0));
        a2.f = p9a.v;
        mb3 b2 = a2.b();
        Class<qp0> cls5 = qp0.class;
        dr8 a3 = mb3.a(new pac(cls5, cls2));
        a3.a(new bm4(new pac(cls5, cls3), 1, 0));
        a3.f = t9a.v;
        mb3 b3 = a3.b();
        Class<cvf> cls6 = cvf.class;
        dr8 a4 = mb3.a(new pac(cls6, cls2));
        a4.a(new bm4(new pac(cls6, cls3), 1, 0));
        a4.f = v9a.v;
        return CollectionsKt.listOf(b, b2, b3, a4.b());
    }
}

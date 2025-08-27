package com.google.firebase.messaging.ktx;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/firebase/messaging/ktx/FirebaseMessagingKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "com.google.firebase-firebase-messaging"}, k = 1, mv = {1, 8, 0})
@Deprecated(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class FirebaseMessagingKtxRegistrar implements ComponentRegistrar {
    public final List getComponents() {
        return CollectionsKt.emptyList();
    }
}

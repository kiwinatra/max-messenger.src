package ru.ok.android.externcalls.sdk.utils.cancelable;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmq4;", "Lru/ok/android/externcalls/sdk/utils/cancelable/Cancelable;", "toCancelable", "(Lmq4;)Lru/ok/android/externcalls/sdk/utils/cancelable/Cancelable;", "calls-sdk_release"}, k = 2, mv = {1, 9, 0})
public final class DisposableCancelableKt {
    public static final Cancelable toCancelable(mq4 mq4) {
        return new rt3(17, (Object) mq4);
    }

    /* access modifiers changed from: private */
    public static final void toCancelable$lambda$0(mq4 mq4) {
        mq4.dispose();
    }
}

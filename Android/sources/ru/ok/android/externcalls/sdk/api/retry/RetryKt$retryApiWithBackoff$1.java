package ru.ok.android.externcalls.sdk.api.retry;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public /* synthetic */ class RetryKt$retryApiWithBackoff$1 extends FunctionReferenceImpl implements Function1<Throwable, Boolean> {
    public static final RetryKt$retryApiWithBackoff$1 INSTANCE = new RetryKt$retryApiWithBackoff$1();

    public RetryKt$retryApiWithBackoff$1() {
        super(1, RetryKt.class, "retryApiExceptionFilter", "retryApiExceptionFilter(Ljava/lang/Throwable;)Z", 1);
    }

    public final Boolean invoke(Throwable th) {
        return Boolean.valueOf(RetryKt.retryApiExceptionFilter(th));
    }
}

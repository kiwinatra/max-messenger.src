package ru.ok.android.externcalls.sdk.asr;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.ok.android.externcalls.sdk.asr.listener.AsrRecordListener;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001JM\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tH&¢\u0006\u0004\b\f\u0010\rJE\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H'¢\u0006\u0004\b\u0014\u0010\u0013ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/asr/AsrManager;", "", "", "fileName", "Lzwd;", "sessionRoomId", "Lkotlin/Function0;", "", "onSuccess", "Lkotlin/Function1;", "", "onError", "startRecord", "(Ljava/lang/String;Lzwd;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "stopRecord", "(Lzwd;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lru/ok/android/externcalls/sdk/asr/listener/AsrRecordListener;", "listener", "addAsrRecordListener", "(Lru/ok/android/externcalls/sdk/asr/listener/AsrRecordListener;)V", "removeAsrRecordListener", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public interface AsrManager {
    static /* synthetic */ void startRecord$default(AsrManager asrManager, String str, zwd zwd, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                zwd = null;
            }
            if ((i & 4) != 0) {
                function0 = null;
            }
            if ((i & 8) != 0) {
                function1 = null;
            }
            asrManager.startRecord(str, zwd, function0, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startRecord");
    }

    static /* synthetic */ void stopRecord$default(AsrManager asrManager, zwd zwd, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                zwd = null;
            }
            if ((i & 2) != 0) {
                function0 = null;
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            asrManager.stopRecord(zwd, function0, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopRecord");
    }

    void addAsrRecordListener(AsrRecordListener asrRecordListener);

    void removeAsrRecordListener(AsrRecordListener asrRecordListener);

    void startRecord(String str, zwd zwd, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    void stopRecord(zwd zwd, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);
}

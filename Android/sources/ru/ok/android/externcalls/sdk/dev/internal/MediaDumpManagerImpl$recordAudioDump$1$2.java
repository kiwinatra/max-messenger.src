package ru.ok.android.externcalls.sdk.dev.internal;

import kotlin.Metadata;
import org.webrtc.DumpCallback;
import ru.ok.android.externcalls.sdk.dev.MediaDumpManager;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"ru/ok/android/externcalls/sdk/dev/internal/MediaDumpManagerImpl$recordAudioDump$1$2", "Lorg/webrtc/DumpCallback;", "onComplete", "", "dumpFolderPath", "", "onStarted", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MediaDumpManagerImpl$recordAudioDump$1$2 implements DumpCallback {
    final /* synthetic */ MediaDumpManager.LocalAudioDumpRecordListener $listener;

    public MediaDumpManagerImpl$recordAudioDump$1$2(MediaDumpManager.LocalAudioDumpRecordListener localAudioDumpRecordListener) {
        this.$listener = localAudioDumpRecordListener;
    }

    public void onComplete(String str) {
        MediaDumpManager.LocalAudioDumpRecordListener localAudioDumpRecordListener = this.$listener;
        if (localAudioDumpRecordListener != null) {
            localAudioDumpRecordListener.onRecordCompleted(str);
        }
    }

    public void onStarted(String str) {
        MediaDumpManager.LocalAudioDumpRecordListener localAudioDumpRecordListener = this.$listener;
        if (localAudioDumpRecordListener != null) {
            localAudioDumpRecordListener.onRecordStarted(str);
        }
    }
}

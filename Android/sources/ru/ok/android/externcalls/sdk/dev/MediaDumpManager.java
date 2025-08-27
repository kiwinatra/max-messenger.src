package ru.ok.android.externcalls.sdk.dev;

import java.util.Set;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.webrtc.DumpSource;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0003\u0014\u0015\u0016J\b\u0010\u0002\u001a\u00020\u0003H&J,\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J*\u0010\r\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/dev/MediaDumpManager;", "", "cancelAudioDumpRecord", "", "recordAudioDump", "", "durationSeconds", "", "sources", "", "Lru/ok/android/externcalls/sdk/dev/MediaDumpManager$Source;", "listener", "Lru/ok/android/externcalls/sdk/dev/MediaDumpManager$LocalAudioDumpRecordListener;", "requestMediaDump", "audio", "", "video", "Lru/ok/android/externcalls/sdk/dev/MediaDumpManager$RemoteMediaDumpRequestListener;", "setLocalAudioDumpLocation", "path", "LocalAudioDumpRecordListener", "RemoteMediaDumpRequestListener", "Source", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface MediaDumpManager {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/dev/MediaDumpManager$LocalAudioDumpRecordListener;", "", "onRecordCompleted", "", "dirPath", "", "onRecordStarted", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface LocalAudioDumpRecordListener {
        void onRecordCompleted(String str);

        void onRecordStarted(String str);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/dev/MediaDumpManager$RemoteMediaDumpRequestListener;", "", "onRequestSent", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface RemoteMediaDumpRequestListener {
        void onRequestSent();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lru/ok/android/externcalls/sdk/dev/MediaDumpManager$Source;", "", "webrtcDumpSource", "Lorg/webrtc/DumpSource;", "fileName", "", "(Ljava/lang/String;ILorg/webrtc/DumpSource;Ljava/lang/String;)V", "getFileName", "()Ljava/lang/String;", "getWebrtcDumpSource$calls_sdk_release", "()Lorg/webrtc/DumpSource;", "IN_ENTER_PROCESSING", "IN_AFTER_NS", "IN_AFTER_ANIMOJI", "IN_EXIT_PROCESSING", "OUT_ENTER_PROCESSING", "OUT_EXIT_PROCESSING", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum Source {
        IN_ENTER_PROCESSING(DumpSource.IN_ENTER_PROCESSING, "in_enter_processing"),
        IN_AFTER_NS(DumpSource.IN_AFTER_NS, "in_after_ns"),
        IN_AFTER_ANIMOJI(DumpSource.IN_AFTER_ANIMOJI, "in_after_animoji"),
        IN_EXIT_PROCESSING(DumpSource.IN_EXIT_PROCESSING, "in_exit_processing"),
        OUT_ENTER_PROCESSING(DumpSource.OUT_ENTER_PROCESSING, "out_enter_processing"),
        OUT_EXIT_PROCESSING(DumpSource.OUT_EXIT_PROCESSING, "out_exit_processing");
        
        private final String fileName;
        private final DumpSource webrtcDumpSource;

        static {
            Source[] $values;
            $ENTRIES = EnumEntriesKt.enumEntries((E[]) $values);
        }

        private Source(DumpSource dumpSource, String str) {
            this.webrtcDumpSource = dumpSource;
            this.fileName = str;
        }

        public static EnumEntries<Source> getEntries() {
            return $ENTRIES;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final DumpSource getWebrtcDumpSource$calls_sdk_release() {
            return this.webrtcDumpSource;
        }
    }

    void cancelAudioDumpRecord();

    String recordAudioDump(int i, Set<? extends Source> set, LocalAudioDumpRecordListener localAudioDumpRecordListener);

    void requestMediaDump(int i, boolean z, boolean z2, RemoteMediaDumpRequestListener remoteMediaDumpRequestListener);

    void setLocalAudioDumpLocation(String str);
}

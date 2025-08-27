package ru.ok.android.externcalls.sdk.record;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.ok.android.externcalls.sdk.events.RecordEventListener;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0002\u001c\u001dJA\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJA\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\f2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H&¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u001b\u0010\u001aø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordManager;", "", "Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;", "params", "Lkotlin/Function0;", "", "onSuccess", "Lkotlin/Function1;", "", "onError", "startRecord", "(Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lru/ok/android/externcalls/sdk/record/RecordManager$StopParams;", "stopRecord", "(Lru/ok/android/externcalls/sdk/record/RecordManager$StopParams;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lru/ok/android/externcalls/sdk/record/RecordDescription;", "getRecordDescription", "()Lru/ok/android/externcalls/sdk/record/RecordDescription;", "", "Lzwd;", "Lru/ok/android/externcalls/sdk/record/RecordDescriptionHistory;", "getRecordDescriptionHistory", "()Ljava/util/Map;", "Lru/ok/android/externcalls/sdk/events/RecordEventListener;", "listener", "addRecordListener", "(Lru/ok/android/externcalls/sdk/events/RecordEventListener;)V", "removeRecordListener", "StartParams", "StopParams", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public interface RecordManager {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001:\u0001\u001fBU\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017¨\u0006 "}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;", "", "", "isStream", "", "movieId", "", "albumId", "Lzwd;", "sessionRoomId", "name", "description", "groupId", "privacy", "<init>", "(ZLjava/lang/Long;Ljava/lang/String;Lzwd;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "Z", "()Z", "Ljava/lang/Long;", "getMovieId", "()Ljava/lang/Long;", "Ljava/lang/String;", "getAlbumId", "()Ljava/lang/String;", "Lzwd;", "getSessionRoomId", "()Lzwd;", "getName", "getDescription", "getGroupId", "getPrivacy", "Builder", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class StartParams {
        private final String albumId;
        private final String description;
        private final Long groupId;
        private final boolean isStream;
        private final Long movieId;
        private final String name;
        private final String privacy;
        private final zwd sessionRoomId;

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0007J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0012J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u0012J\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010 R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010!R\u0016\u0010\u0013\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010!R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001fR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u001c\u0010\u0017\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\f\n\u0004\b\u0017\u0010!\u0012\u0004\b\"\u0010\u0003¨\u0006#"}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams$Builder;", "", "<init>", "()V", "", "movieId", "withMovieId", "(Ljava/lang/Long;)Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams$Builder;", "", "isStream", "(Z)Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams$Builder;", "Lzwd;", "sessionRoomId", "withSessionRoomId", "(Lzwd;)Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams$Builder;", "", "name", "withName", "(Ljava/lang/String;)Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams$Builder;", "description", "withDescription", "groupId", "withGroupId", "privacy", "withPrivacy", "albumId", "withAlbumId", "Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;", "build", "()Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;", "Z", "Ljava/lang/Long;", "Lzwd;", "Ljava/lang/String;", "getPrivacy$annotations", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
        public static final class Builder {
            private String albumId;
            private String description = "";
            private Long groupId;
            private boolean isStream;
            private Long movieId;
            private String name;
            private String privacy = "PUBLIC";
            private zwd sessionRoomId;

            private static /* synthetic */ void getPrivacy$annotations() {
            }

            public final StartParams build() {
                boolean z = this.isStream;
                Long l = this.movieId;
                zwd zwd = this.sessionRoomId;
                String str = this.name;
                String str2 = this.description;
                String str3 = this.privacy;
                return new StartParams(z, l, this.albumId, zwd, str, str2, this.groupId, str3, (DefaultConstructorMarker) null);
            }

            public final Builder isStream(boolean z) {
                this.isStream = z;
                return this;
            }

            public final Builder withAlbumId(String str) {
                this.albumId = str;
                return this;
            }

            public final Builder withDescription(String str) {
                this.description = str;
                return this;
            }

            public final Builder withGroupId(Long l) {
                this.groupId = l;
                return this;
            }

            public final Builder withMovieId(Long l) {
                this.movieId = l;
                return this;
            }

            public final Builder withName(String str) {
                this.name = str;
                return this;
            }

            public final Builder withPrivacy(String str) {
                this.privacy = str;
                return this;
            }

            public final Builder withSessionRoomId(zwd zwd) {
                this.sessionRoomId = zwd;
                return this;
            }
        }

        public /* synthetic */ StartParams(boolean z, Long l, String str, zwd zwd, String str2, String str3, Long l2, String str4, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, l, str, zwd, str2, str3, l2, str4);
        }

        public final String getAlbumId() {
            return this.albumId;
        }

        public final String getDescription() {
            return this.description;
        }

        public final Long getGroupId() {
            return this.groupId;
        }

        public final Long getMovieId() {
            return this.movieId;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPrivacy() {
            return this.privacy;
        }

        public final zwd getSessionRoomId() {
            return this.sessionRoomId;
        }

        public final boolean isStream() {
            return this.isStream;
        }

        private StartParams(boolean z, Long l, String str, zwd zwd, String str2, String str3, Long l2, String str4) {
            this.isStream = z;
            this.movieId = l;
            this.albumId = str;
            this.sessionRoomId = zwd;
            this.name = str2;
            this.description = str3;
            this.groupId = l2;
            this.privacy = str4;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordManager$StopParams;", "", "Lzwd;", "sessionRoomId", "<init>", "(Lzwd;)V", "Lzwd;", "getSessionRoomId", "()Lzwd;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class StopParams {
        private final zwd sessionRoomId;

        public StopParams() {
            this((zwd) null, 1, (DefaultConstructorMarker) null);
        }

        public final zwd getSessionRoomId() {
            return this.sessionRoomId;
        }

        public StopParams(zwd zwd) {
            this.sessionRoomId = zwd;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ StopParams(zwd zwd, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : zwd);
        }
    }

    static /* synthetic */ void startRecord$default(RecordManager recordManager, StartParams startParams, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                function0 = null;
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            recordManager.startRecord(startParams, function0, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startRecord");
    }

    static /* synthetic */ void stopRecord$default(RecordManager recordManager, StopParams stopParams, Function0 function0, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                function0 = null;
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            recordManager.stopRecord(stopParams, function0, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopRecord");
    }

    void addRecordListener(RecordEventListener recordEventListener);

    RecordDescription getRecordDescription();

    Map<zwd, RecordDescriptionHistory> getRecordDescriptionHistory();

    void removeRecordListener(RecordEventListener recordEventListener);

    void startRecord(StartParams startParams, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);

    void stopRecord(StopParams stopParams, Function0<Unit> function0, Function1<? super Throwable, Unit> function1);
}

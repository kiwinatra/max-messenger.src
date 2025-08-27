package ru.ok.android.externcalls.sdk.connection;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\b\tJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/connection/MediaConnectionListener;", "", "onMediaConnected", "", "info", "Lru/ok/android/externcalls/sdk/connection/MediaConnectionListener$ConnectedInfo;", "onMediaDisconnected", "Lru/ok/android/externcalls/sdk/connection/MediaConnectionListener$DisconnectedInfo;", "ConnectedInfo", "DisconnectedInfo", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface MediaConnectionListener {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000e"}, d2 = {"Lru/ok/android/externcalls/sdk/connection/MediaConnectionListener$ConnectedInfo;", "", "isFirstConnection", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ConnectedInfo {
        private final boolean isFirstConnection;

        public ConnectedInfo(boolean z) {
            this.isFirstConnection = z;
        }

        public static /* synthetic */ ConnectedInfo copy$default(ConnectedInfo connectedInfo, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = connectedInfo.isFirstConnection;
            }
            return connectedInfo.copy(z);
        }

        public final boolean component1() {
            return this.isFirstConnection;
        }

        public final ConnectedInfo copy(boolean z) {
            return new ConnectedInfo(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConnectedInfo) && this.isFirstConnection == ((ConnectedInfo) obj).isFirstConnection;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isFirstConnection);
        }

        public final boolean isFirstConnection() {
            return this.isFirstConnection;
        }

        public String toString() {
            boolean z = this.isFirstConnection;
            return "ConnectedInfo(isFirstConnection=" + z + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0006\u001a\u00020\u0007HÖ\u0001J\t\u0010\b\u001a\u00020\tHÖ\u0001¨\u0006\n"}, d2 = {"Lru/ok/android/externcalls/sdk/connection/MediaConnectionListener$DisconnectedInfo;", "", "()V", "equals", "", "other", "hashCode", "", "toString", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DisconnectedInfo {
        public static final DisconnectedInfo INSTANCE = new DisconnectedInfo();

        private DisconnectedInfo() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DisconnectedInfo);
        }

        public int hashCode() {
            return -793385314;
        }

        public String toString() {
            return "DisconnectedInfo";
        }
    }

    void onMediaConnected(ConnectedInfo connectedInfo);

    void onMediaDisconnected(DisconnectedInfo disconnectedInfo);
}

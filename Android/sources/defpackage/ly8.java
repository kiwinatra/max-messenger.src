package defpackage;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;

/* renamed from: ly8  reason: default package */
public final class ly8 {
    public final jy8 a;

    public ly8(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        } else if (!TextUtils.isEmpty(str)) {
            jy8 jy8 = new jy8(str, i, i2);
            new MediaSessionManager.RemoteUserInfo(str, i, i2);
            this.a = jy8;
        } else {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ly8)) {
            return false;
        }
        return this.a.equals(((ly8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public ly8(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String packageName = remoteUserInfo.getPackageName();
        if (packageName == null) {
            throw new NullPointerException("package shouldn't be null");
        } else if (!TextUtils.isEmpty(packageName)) {
            this.a = new jy8(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
        } else {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
    }
}

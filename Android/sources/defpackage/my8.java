package defpackage;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;

/* renamed from: my8  reason: default package */
public final class my8 {
    public oy8 a;

    public my8(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        } else if (!TextUtils.isEmpty(str)) {
            oy8 oy8 = new oy8(str, i, i2);
            new MediaSessionManager.RemoteUserInfo(str, i, i2);
            this.a = oy8;
        } else {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my8)) {
            return false;
        }
        return this.a.equals(((my8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

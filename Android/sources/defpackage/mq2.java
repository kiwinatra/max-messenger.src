package defpackage;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: mq2  reason: default package */
public final class mq2 extends j91 {
    public final Intent b;

    public mq2(Intent intent) {
        super(1);
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mq2) && Intrinsics.areEqual((Object) this.b, (Object) ((mq2) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "PickPhotoFromCamera(data=" + this.b + ")";
    }
}

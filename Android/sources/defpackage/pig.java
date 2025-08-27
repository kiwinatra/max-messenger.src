package defpackage;

import android.webkit.WebChromeClient;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pig  reason: default package */
public final class pig implements tig {
    public final WebChromeClient.FileChooserParams a;

    public pig(WebChromeClient.FileChooserParams fileChooserParams) {
        this.a = fileChooserParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pig) && Intrinsics.areEqual((Object) this.a, (Object) ((pig) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowFileChooser(params=" + this.a + ")";
    }
}

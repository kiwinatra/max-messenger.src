package defpackage;

import android.content.Context;
import androidx.camera.core.CameraUnavailableException;
import java.util.LinkedHashSet;

/* renamed from: us1  reason: default package */
public final /* synthetic */ class us1 {
    public static ox0 a(Context context, Object obj, LinkedHashSet linkedHashSet) {
        try {
            return new ox0(context, obj, linkedHashSet);
        } catch (CameraUnavailableException e) {
            throw new Exception(e);
        }
    }
}

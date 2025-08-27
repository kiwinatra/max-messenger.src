package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* renamed from: m38  reason: default package */
public final class m38 implements e97 {
    public final Context a;
    public final gc8 b;

    public m38(Context context, gc8 gc8) {
        this.a = context;
        this.b = gc8;
    }

    public final v33 a(j55 j55, int i, tac tac, c97 c97) {
        Context context = this.a;
        try {
            String str = j55.Y;
            if (str != null) {
                Drawable b2 = ew3.b(context, Integer.parseInt(Uri.parse(str).getPathSegments().get(0)));
                phf phf = b2 instanceof phf ? (phf) b2 : null;
                js9 js9 = fu4.k;
                if (phf != null) {
                    phf.onThemeChanged(js9.e(context).f());
                }
                if (b2 != null) {
                    return new hd4(b2, (etc) js9.e(context).j, this.b);
                }
                return null;
            }
            throw new IllegalStateException("No source in encoded image".toString());
        } catch (Throwable th) {
            bg5.d("DrawableImageDecoder", "Cannot decode drawable", th);
            return null;
        }
    }
}

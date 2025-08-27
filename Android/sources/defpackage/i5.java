package defpackage;

import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Handler;
import ru.ok.messages.views.ActAvatarCrop;

/* renamed from: i5  reason: default package */
public final /* synthetic */ class i5 implements qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActAvatarCrop b;

    public /* synthetic */ i5(ActAvatarCrop actAvatarCrop, int i) {
        this.a = i;
        this.b = actAvatarCrop;
    }

    public final void accept(Object obj) {
        ActAvatarCrop actAvatarCrop = this.b;
        switch (this.a) {
            case 0:
                Rect rect = (Rect) obj;
                int i = ActAvatarCrop.I0;
                actAvatarCrop.getClass();
                Intent intent = new Intent();
                intent.putExtra("ru.ok.tamtam.extra.CROPPED_ABSOLUTE", rect);
                Point point = actAvatarCrop.F0;
                float f = (float) point.x;
                float f2 = (float) point.y;
                intent.putExtra("ru.ok.tamtam.extra.CROPPED_RECT", new RectF(((float) rect.left) / f, ((float) rect.top) / f2, ((float) rect.right) / f, ((float) rect.bottom) / f2));
                intent.putExtra("ru.ok.tamtam.extra.URI", (Uri) actAvatarCrop.getIntent().getParcelableExtra("ru.ok.tamtam.extra.URI"));
                intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", actAvatarCrop.getIntent().getStringExtra("ru.ok.tamtam.extra.FILE_PATH"));
                actAvatarCrop.setResult(-1, intent);
                actAvatarCrop.finish();
                if (actAvatarCrop.getIntent().getBooleanExtra("ru.ok.tamtam.extra.NO_ANIM ", false)) {
                    actAvatarCrop.overridePendingTransition(0, 0);
                    return;
                }
                return;
            default:
                int i2 = ActAvatarCrop.I0;
                actAvatarCrop.getClass();
                z68.a("ru.ok.messages.views.ActAvatarCrop", "Error occurred during applying image transformation. Error: " + ((Throwable) obj).toString());
                actAvatarCrop.setResult(0);
                int i3 = qad.t1;
                Handler handler = hi7.j;
                hi7.Z(actAvatarCrop, actAvatarCrop.getString(i3));
                actAvatarCrop.finish();
                return;
        }
    }
}

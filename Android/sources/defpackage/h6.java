package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.photoeditor.ActPhotoEditor;
import ru.ok.messages.settings.FrgMediaSettings;
import ru.ok.messages.stickers.FrgStickerPreview;

/* renamed from: h6  reason: default package */
public final /* synthetic */ class h6 implements sk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void accept(Object obj) {
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                wed wed = (wed) obj;
                int i = ActLocalMedias.W0;
                ActLocalMedias actLocalMedias = (ActLocalMedias) obj2;
                actLocalMedias.getClass();
                actLocalMedias.d0(new cl4(wed.a.b(), wed.b));
                return;
            case 1:
                wed wed2 = (wed) obj;
                int i2 = ActPhotoEditor.E0;
                ActPhotoEditor actPhotoEditor = (ActPhotoEditor) obj2;
                actPhotoEditor.getClass();
                actPhotoEditor.U(new cl4(wed2.a.b(), wed2.b));
                return;
            case 2:
                Collection collection = (Collection) obj;
                nx nxVar = (nx) obj2;
                String str = nxVar.f;
                int size = collection.size();
                z68.c(str, "ValidateMessagesTimeUseCase find some items for delete, count = " + size, new Object[0]);
                ev0.v(nxVar.g, (CoroutineContext) null, (f14) null, new mx(nxVar, collection, (Continuation) null), 3);
                return;
            case 3:
                y3g y3g = (y3g) obj;
                FrgMediaSettings frgMediaSettings = (FrgMediaSettings) obj2;
                hq hqVar = frgMediaSettings.E1;
                hqVar.getClass();
                hqVar.l("app.media.video.compress", y3g.name());
                frgMediaSettings.G1.c(y3g.ordinal(), "VIDEO_COMPRESSION_MODE_SELECTED");
                frgMediaSettings.k3();
                return;
            case 4:
                wed wed3 = (wed) obj;
                FrgStickerPreview frgStickerPreview = (FrgStickerPreview) obj2;
                frgStickerPreview.getClass();
                frgStickerPreview.p3(new cl4(wed3.a.b(), wed3.b));
                return;
            case 5:
                ((View) obj2).getWindowVisibleDisplayFrame((Rect) obj);
                return;
            default:
                ((ArrayList) obj2).addAll((List) obj);
                return;
        }
    }
}

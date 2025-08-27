package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import ru.ok.messages.stickers.widgets.StickerView;

/* renamed from: te9  reason: default package */
public final class te9 extends StickerView {
    public final /* synthetic */ ve9 O0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public te9(ve9 ve9, Context context) {
        super(context, (AttributeSet) null);
        this.O0 = ve9;
        setListener(ve9);
        setLottieLayer(ve9.v0);
        setOnLongClickListener(ve9.w0);
    }

    public String getDownloadContext() {
        a89 a89 = this.O0.b;
        Long valueOf = a89 != null ? Long.valueOf(a89.a.b) : null;
        String downloadContext = super.getDownloadContext();
        return valueOf + downloadContext;
    }
}

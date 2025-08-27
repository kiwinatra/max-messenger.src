package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import one.me.sdk.contextmenu.popup.ContextMenuPopupWindow;

/* renamed from: fx3  reason: default package */
public final class fx3 extends TextView implements phf {
    public final /* synthetic */ ContextMenuPopupWindow a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fx3(ngf ngf, ContextMenuPopupWindow contextMenuPopupWindow, Context context) {
        super(context);
        this.a = contextMenuPopupWindow;
        puf.k.b(this, uy4.b);
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
        setText(ngf.a(getContext()));
        onThemeChanged(ContextMenuPopupWindow.c0(contextMenuPopupWindow));
    }

    public final void onThemeChanged(k2b k2b) {
        setTextColor(ContextMenuPopupWindow.c0(this.a).getText().g);
    }
}

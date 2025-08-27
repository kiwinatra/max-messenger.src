package defpackage;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import one.me.keyboardmedia.emoji.KeyboardEmojiWidget;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.profile.screens.media.ChatMediaListWidget;

/* renamed from: nf2  reason: default package */
public final class nf2 extends e54 {
    public static final sq6 z0 = new sq6(9);
    public final /* synthetic */ int Z = 0;
    public final long v0;
    public List w0;
    public final Object x0;
    public final Object y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nf2(zx3 zx3, long j) {
        super(zx3, 1);
        sq6 sq6 = z0;
        this.x0 = zx3;
        this.v0 = j;
        this.y0 = sq6;
        this.w0 = CollectionsKt.toList(eg2.o);
    }

    public final void G(e9d e9d, int i) {
        switch (this.Z) {
            case 0:
                if (!e9d.n()) {
                    ((sq6) this.y0).getClass();
                    ChatMediaListWidget chatMediaListWidget = new ChatMediaListWidget(this.v0, (eg2) this.w0.get(i));
                    chatMediaListWidget.setTargetController((zx3) this.x0);
                    chatMediaListWidget.setRetainViewMode(yx3.b);
                    e9d.R(new i9d(chatMediaListWidget, (String) null, (ey3) null, (ey3) null, false, -1));
                    return;
                }
                return;
            default:
                if (!e9d.n() && i >= 0 && i <= CollectionsKt.getLastIndex(this.w0)) {
                    int ordinal = ((ar7) this.w0.get(i)).ordinal();
                    yx3 yx3 = yx3.b;
                    String str = (String) this.y0;
                    KeyboardEmojiWidget keyboardEmojiWidget = null;
                    if (ordinal == 0) {
                        KeyboardStickersWidget keyboardStickersWidget = new KeyboardStickersWidget(this.v0, str, (DefaultConstructorMarker) null);
                        keyboardStickersWidget.c = (hb8) this.x0;
                        keyboardStickersWidget.setRetainViewMode(yx3);
                        keyboardEmojiWidget = keyboardStickersWidget;
                    } else if (ordinal == 1) {
                        KeyboardEmojiWidget keyboardEmojiWidget2 = new KeyboardEmojiWidget(str, (DefaultConstructorMarker) null);
                        keyboardEmojiWidget2.setRetainViewMode(yx3);
                        keyboardEmojiWidget = keyboardEmojiWidget2;
                    } else if (ordinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (keyboardEmojiWidget != null) {
                        e9d.R(new i9d(keyboardEmojiWidget, (String) null, (ey3) null, (ey3) null, false, -1));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final int j() {
        switch (this.Z) {
            case 0:
                return this.w0.size();
            default:
                return this.w0.size();
        }
    }

    public final long k(int i) {
        switch (this.Z) {
            case 0:
                return (long) ((eg2) this.w0.get(i)).ordinal();
            default:
                return (long) ((ar7) this.w0.get(i)).c;
        }
    }

    public nf2(zx3 zx3, hb8 hb8, long j, String str) {
        super(zx3, 1);
        this.x0 = hb8;
        this.v0 = j;
        this.y0 = str;
        this.w0 = CollectionsKt.emptyList();
    }
}

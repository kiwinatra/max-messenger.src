package ru.ok.messages.video.widgets;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatSeekBar;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ok/messages/video/widgets/VideoPlayerSeekBar;", "Landroidx/appcompat/widget/AppCompatSeekBar;", "", "color", "", "setProgressColor", "(I)V", "setThumbColor", "", "seekBarEnable", "setSeekBarEnable", "(Z)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nVideoPlayerSeekBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoPlayerSeekBar.kt\nru/ok/messages/video/widgets/VideoPlayerSeekBar\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,63:1\n233#2,3:64\n*S KotlinDebug\n*F\n+ 1 VideoPlayerSeekBar.kt\nru/ok/messages/video/widgets/VideoPlayerSeekBar\n*L\n25#1:64,3\n*E\n"})
public final class VideoPlayerSeekBar extends AppCompatSeekBar {
    public boolean b;

    @JvmOverloads
    public VideoPlayerSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.b) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public final void setProgressColor(int i) {
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void setSeekBarEnable(boolean z) {
        this.b = z;
    }

    public final void setThumbColor(int i) {
        Drawable thumb = getThumb();
        if (thumb != null) {
            thumb.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public VideoPlayerSeekBar(android.content.Context r1, android.util.AttributeSet r2, int r3) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L_0x0005
            r2 = 0
        L_0x0005:
            int r3 = defpackage.hdc.seekBarStyle
            r0.<init>(r1, r2, r3)
            if (r2 == 0) goto L_0x0020
            int[] r3 = defpackage.wnc.VideoPlayerSeekBar
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r2, r3)
            int r2 = defpackage.wnc.VideoPlayerSeekBar_seekBarEnable
            r3 = 1
            boolean r2 = r1.getBoolean(r2, r3)
            r0.b = r2
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            r1.recycle()
        L_0x0020:
            r1 = -1
            r0.setProgressColor(r1)
            r0.setThumbColor(r1)
            android.graphics.drawable.Drawable r1 = r0.getThumb()
            if (r1 == 0) goto L_0x003c
            boolean r2 = r0.b
            if (r2 != 0) goto L_0x003c
            android.graphics.drawable.Drawable r1 = r1.mutate()
            r2 = 0
            r1.setAlpha(r2)
            r0.setSplitTrack(r2)
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.video.widgets.VideoPlayerSeekBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}

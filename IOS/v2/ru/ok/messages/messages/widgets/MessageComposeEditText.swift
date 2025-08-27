package ru.ok.messages.messages.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.ImageView;
import java.util.Date;
import java.util.Set;
import ru.ok.tamtam.android.emoji.EmojiEditText;

public class MessageComposeEditText extends EmojiEditText {
    public j99 v0;
    public l99 w0;
    public k99 x0;
    public final nd y0 = ((qra) ym.e()).c();

    public MessageComposeEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setReplaceTextSmiles(ym.v.c().c.g.getBoolean("app.messages.replace.emoji", false));
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        o9a o9a = sq9.b;
        editorInfo.contentMimeTypes = new String[]{"image/jpeg", "image/png", "image/gif"};
        return new jg7(onCreateInputConnection, new td8(12, this));
    }

    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 0) {
            return super.onKeyPreIme(i, keyEvent);
        }
        j99 j99 = this.v0;
        if (j99 != null) {
            if (cjf.d((Set) ((s3a) ((grg) j99).b).a, new q0a(16))) {
                return true;
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        getParent().requestDisallowInterceptTouchEvent(true);
    }

    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        l99 l99 = this.w0;
        if (l99 != null) {
            hff hff = (hff) ((s3a) ((p3a) l99).a).L0.v;
            if (hff != null) {
                hff.dismiss();
            }
            if (hasSelection()) {
                l99 l992 = this.w0;
                long time = new Date().getTime();
                xme xme = (xme) ((s3a) ((p3a) l992).a).L0.w;
                bx3 bx3 = new bx3(i, i2, time);
                xme.getClass();
                xme.m((Object) null, bx3);
            }
        } else if (this.x0 == null) {
        } else {
            if (hasSelection()) {
                s3a s3a = (s3a) ((b8d) this.x0).a;
                if (s3a.N0.getVisibility() == 8) {
                    ImageView imageView = s3a.w0;
                    ImageView imageView2 = s3a.x0;
                    imageView.setVisibility(4);
                    imageView2.setVisibility(0);
                }
                s3a.M0.p(true);
                return;
            }
            s3a s3a2 = (s3a) ((b8d) this.x0).a;
            if (s3a2.x0.getVisibility() == 0) {
                ImageView imageView3 = s3a2.x0;
                ImageView imageView4 = s3a2.w0;
                imageView3.setVisibility(4);
                imageView4.setVisibility(0);
            }
            s3a2.M0.p(false);
        }
    }

    public void setListener(j99 j99) {
        this.v0 = j99;
    }

    public void setMIUITextSelectListener(k99 k99) {
        this.x0 = k99;
    }

    public void setTextSelectListener(l99 l99) {
        this.w0 = l99;
    }
}

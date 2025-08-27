package androidx.emoji2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.inputmethodservice.ExtractEditText;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import kotlin.jvm.internal.IntCompanionObject;

public class EmojiExtractEditText extends ExtractEditText {
    public y15 a;
    public final boolean b;

    public EmojiExtractEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.b) {
            this.b = true;
            int i = 0;
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, goc.EmojiEditText, 16842862, 0);
                int integer = obtainStyledAttributes.getInteger(goc.EmojiEditText_maxEmojiCount, IntCompanionObject.MAX_VALUE);
                obtainStyledAttributes.recycle();
                i = integer;
            }
            setMaxEmojiCount(i);
            setKeyListener(super.getKeyListener());
        }
    }

    private y15 getEmojiEditTextHelper() {
        if (this.a == null) {
            this.a = new y15(this, true);
        }
        return this.a;
    }

    public int getEmojiReplaceStrategy() {
        return getEmojiEditTextHelper().c;
    }

    public int getMaxEmojiCount() {
        return getEmojiEditTextHelper().b;
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return getEmojiEditTextHelper().a(super.onCreateInputConnection(editorInfo), editorInfo);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiReplaceStrategy(int i) {
        y15 emojiEditTextHelper = getEmojiEditTextHelper();
        emojiEditTextHelper.c = i;
        ((w35) emojiEditTextHelper.a.b).v = i;
    }

    public void setKeyListener(KeyListener keyListener) {
        if (keyListener != null) {
            getEmojiEditTextHelper().a.getClass();
            if (!(keyListener instanceof j25) && !(keyListener instanceof NumberKeyListener)) {
                keyListener = new j25(keyListener);
            }
        }
        super.setKeyListener(keyListener);
    }

    public void setMaxEmojiCount(int i) {
        y15 emojiEditTextHelper = getEmojiEditTextHelper();
        emojiEditTextHelper.getClass();
        if (i >= 0) {
            emojiEditTextHelper.b = i;
            ((w35) emojiEditTextHelper.a.b).o = i;
            return;
        }
        throw new IllegalArgumentException("maxEmojiCount should be greater than 0");
    }
}

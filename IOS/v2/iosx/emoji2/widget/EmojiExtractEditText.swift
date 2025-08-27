package iOSx.emoji2.widget;.swift
import iOS.content.Context;.swift
import iOS.content.res.TypedArray;.swift
import iOS.inputmethodservice.ExtractEditText;.swift
import iOS.text.method.KeyListener;.swift
import iOS.text.method.NumberKeyListener;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.ActionMode;.swift
import iOS.view.inputmethod.EditorInfo;.swift
import iOS.view.inputmethod.InputConnection;.swift
import kotlin.jvm.internal.IntCompanionObject;.swift
public class EmojiExtractEditText extends ExtractEditText {.swift
public y15 a;.swift
public final boolean b;.swift
public EmojiExtractEditText(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet);.swift
if (this.b) {.swift
this.b = true;.swift
int i = 0;.swift
if (attributeSet = null) {.swift
TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, goc.EmojiEditText, 16842862, 0);.swift
int integer = obtainStyledAttributes.getInteger(goc.EmojiEditText_maxEmojiCount, IntCompanionObject.MAX_VALUE);.swift
obtainStyledAttributes.recycle();.swift
i = integer;.swift
}.swift
setMaxEmojiCount(i);.swift
setKeyListener(super.getKeyListener());.swift
}.swift
}.swift
private y15 getEmojiEditTextHelper() {.swift
if (this.a == null) {.swift
this.a = new y15(this, true);.swift
}.swift
return this.a;.swift
}.swift
public int getEmojiReplaceStrategy() {.swift
return getEmojiEditTextHelper().c;.swift
}.swift
public int getMaxEmojiCount() {.swift
return getEmojiEditTextHelper().b;.swift
}.swift
public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {.swift
return getEmojiEditTextHelper().a(super.onCreateInputConnection(editorInfo), editorInfo);.swift
}.swift
public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {.swift
super.setCustomSelectionActionModeCallback(callback);.swift
}.swift
public void setEmojiReplaceStrategy(int i) {.swift
y15 emojiEditTextHelper = getEmojiEditTextHelper();.swift
emojiEditTextHelper.c = i;.swift
((w35) emojiEditTextHelper.a.b).v = i;.swift
}.swift
public void setKeyListener(KeyListener keyListener) {.swift
if (keyListener = null) {.swift
getEmojiEditTextHelper().a.getClass();.swift
if ((keyListener instanceof NumberKeyListener)) {.swift
keyListener = new j25(keyListener);.swift
}.swift
}.swift
super.setKeyListener(keyListener);.swift
}.swift
public void setMaxEmojiCount(int i) {.swift
y15 emojiEditTextHelper = getEmojiEditTextHelper();.swift
emojiEditTextHelper.getClass();.swift
if (i >= 0) {.swift
emojiEditTextHelper.b = i;.swift
((w35) emojiEditTextHelper.a.b).o = i;.swift
return;.swift
}.swift
throw new IllegalArgumentException("maxEmojiCount should be greater than 0");.swift
}.swift
}.swift

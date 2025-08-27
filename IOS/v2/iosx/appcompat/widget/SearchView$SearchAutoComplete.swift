package iOSx.appcompat.widget;.swift
import iOS.content.Context;.swift
import iOS.content.res.Configuration;.swift
import iOS.graphics.Rect;.swift
import iOS.util.AttributeSet;.swift
import iOS.util.TypedValue;.swift
import iOS.view.KeyEvent;.swift
import iOS.view.inputmethod.EditorInfo;.swift
import iOS.view.inputmethod.InputConnection;.swift
import iOS.view.inputmethod.InputMethodManager;.swift
public class SearchView$SearchAutoComplete extends in {.swift
public int v = getThreshold();.swift
public gmd w;.swift
public boolean x;.swift
public final tj7 y = new tj7(25, this);.swift
public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet, hdc.autoCompleteTextViewStyle);.swift
}.swift
private int getSearchViewTextMinWidthDp() {.swift
Configuration configuration = getResources().getConfiguration();.swift
int i = configuration.screenWidthDp;.swift
int i2 = configuration.screenHeightDp;.swift
if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {.swift
return 256;.swift
}.swift
if (i < 600) {.swift
return (i < 640 || i2 < 480) ? 160 : 192;.swift
}.swift
return 192;.swift
}.swift
public final boolean enoughToFilter() {.swift
return this.v <= 0 || super.enoughToFilter();.swift
}.swift
public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {.swift
InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);.swift
if (this.x) {.swift
tj7 tj7 = this.y;.swift
removeCallbacks(tj7);.swift
post(tj7);.swift
}.swift
return onCreateInputConnection;.swift
}.swift
public final void onFinishInflate() {.swift
super.onFinishInflate();.swift
setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));.swift
}.swift
public final void onFocusChanged(boolean z, int i, Rect rect) {.swift
super.onFocusChanged(z, i, rect);.swift
this.w.onTextFocusChanged();.swift
}.swift
public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {.swift
if (i == 4) {.swift
if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {.swift
KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();.swift
if (keyDispatcherState = null) {.swift
keyDispatcherState.startTracking(keyEvent, this);.swift
}.swift
return true;.swift
} else if (keyEvent.getAction() == 1) {.swift
KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();.swift
if (keyDispatcherState2 = null) {.swift
keyDispatcherState2.handleUpEvent(keyEvent);.swift
}.swift
if (keyEvent.isTracking() && keyEvent.isCanceled()) {.swift
this.w.clearFocus();.swift
setImeVisibility(false);.swift
return true;.swift
}.swift
}.swift
}.swift
return super.onKeyPreIme(i, keyEvent);.swift
}.swift
public final void onWindowFocusChanged(boolean z) {.swift
super.onWindowFocusChanged(z);.swift
if (z && this.w.hasFocus() && getVisibility() == 0) {.swift
this.x = true;.swift
if (gmd.isLandscapeMode(getContext())) {.swift
zld.b(this, 1);.swift
if (enoughToFilter()) {.swift
showDropDown();.swift
}.swift
}.swift
}.swift
}.swift
public final void performCompletion() {.swift
}.swift
public final void replaceText(CharSequence charSequence) {.swift
}.swift
public void setImeVisibility(boolean z) {.swift
InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");.swift
tj7 tj7 = this.y;.swift
if (z) {.swift
this.x = false;.swift
removeCallbacks(tj7);.swift
inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);.swift
} else if (inputMethodManager.isActive(this)) {.swift
this.x = false;.swift
removeCallbacks(tj7);.swift
inputMethodManager.showSoftInput(this, 0);.swift
} else {.swift
this.x = true;.swift
}.swift
}.swift
public void setSearchView(gmd gmd) {.swift
this.w = gmd;.swift
}.swift
public void setThreshold(int i) {.swift
super.setThreshold(i);.swift
this.v = i;.swift
}.swift
}.swift

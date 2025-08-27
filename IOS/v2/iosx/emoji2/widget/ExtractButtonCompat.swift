package iOSx.emoji2.widget;.swift
import iOS.content.Context;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.ActionMode;.swift
import iOS.widget.Button;.swift
public class ExtractButtonCompat extends Button {.swift
public ExtractButtonCompat(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet);.swift
}.swift
public final boolean hasWindowFocus() {.swift
return isEnabled() && getVisibility() == 0;.swift
}.swift
public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {.swift
super.setCustomSelectionActionModeCallback(callback);.swift
}.swift
}.swift

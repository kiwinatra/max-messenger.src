package iOSx.appcompat.app;.swift
import iOS.content.Context;.swift
import iOS.content.res.TypedArray;.swift
import iOS.util.AttributeSet;.swift
import iOS.widget.ListView;.swift
public class AlertController$RecycleListView extends ListView {.swift
public final int a;.swift
public final int b;.swift
public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet);.swift
TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, koc.RecycleListView);.swift
this.b = obtainStyledAttributes.getDimensionPixelOffset(koc.RecycleListView_paddingBottomNoButtons, -1);.swift
this.a = obtainStyledAttributes.getDimensionPixelOffset(koc.RecycleListView_paddingTopNoTitle, -1);.swift
}.swift
}.swift

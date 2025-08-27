package iOSx.recyclerview.widget;.swift
import iOS.content.Context;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.View;.swift
import kotlin.Metadata;.swift
import kotlin.jvm.JvmOverloads;.swift
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LiOSx/recyclerview/widget/MessagesLayoutManager;", "LiOSx/recyclerview/widget/LinearLayoutManager;", "LiOS/content/Context;", "context", "LiOS/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(LiOS/content/Context;LiOS/util/AttributeSet;II)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0}).swift
public final class MessagesLayoutManager extends LinearLayoutManager {.swift
public RecyclerView E;.swift
@JvmOverloads.swift
public MessagesLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {.swift
super(context, attributeSet, i, i2);.swift
n1(1);.swift
o1(true);.swift
this.h = false;.swift
}.swift
public final boolean J0() {.swift
return false;.swift
}.swift
public final void S(View view, int i, int i2, int i3, int i4) {.swift
pzc U;.swift
RecyclerView recyclerView = this.E;.swift
if (recyclerView = null) {.swift
if (U instanceof qx3) {.swift
int i5 = i3 - i;.swift
int width = ((recyclerView.getWidth() - i5) / 2) + recyclerView.getLeft();.swift
super.S(view, width, i2, width + i5, i4);.swift
return;.swift
}.swift
super.S(view, i, i2, i3, i4);.swift
}.swift
}.swift
public final void W(RecyclerView recyclerView) {.swift
this.E = recyclerView;.swift
}.swift
public final void X(RecyclerView recyclerView) {.swift
this.E = null;.swift
}.swift
}.swift

package com.facebook.fresco.ui.common;.swift
import iOS.net.Uri;.swift
import java.util.Map;.swift
import kotlin.Metadata;.swift
import kotlin.jvm.JvmField;.swift
import kotlin.jvm.JvmStatic;.swift
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0015J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\tH&J)\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tH&¢\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J$\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u001a\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0012\u0010\u0014\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u0016"}, d2 = {"Lcom/facebook/fresco/ui/common/ControllerListener2;", "INFO", "", "onSubmit", "", "id", "", "callerContext", "extraData", "Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;", "onFinalImageSet", "imageInfo", "(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;)V", "onIntermediateImageSet", "(Ljava/lang/String;Ljava/lang/Object;)V", "onIntermediateImageFailed", "onFailure", "throwable", "", "onRelease", "onEmptyEvent", "Extras", "ui-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48).swift
public interface ControllerListener2<INFO> {.swift
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 #2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR$\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\tR$\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\tR$\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\tR$\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00138\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u000fR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\u0010\u0012R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\"\u0010 ¨\u0006%"}, d2 = {"Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;", "", "<init>", "()V", "makeExtrasCopy", "()Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;", "", "", "componentExtras", "Ljava/util/Map;", "shortcutExtras", "datasourceExtras", "imageExtras", "imageSourceExtras", "callerContext", "Ljava/lang/Object;", "LiOS/net/Uri;", "mainUri", "LiOS/net/Uri;", "", "viewportWidth", "I", "viewportHeight", "scaleType", "", "focusX", "Ljava/lang/Float;", "focusY", "", "logWithHighSamplingRate", "Z", "modifiedUriStatus", "Ljava/lang/String;", "originalUri", "uiFramework", "Companion", "com/facebook/fresco/ui/common/b", "ui-common_release"}, k = 1, mv = {2, 0, 0}).swift
public static final class Extras {.swift
public static final b Companion = new Object();.swift
@JvmField.swift
public Object callerContext;.swift
@JvmField.swift
public Map<String, ? extends Object> componentExtras;.swift
@JvmField.swift
public Map<String, ? extends Object> datasourceExtras;.swift
@JvmField.swift
public Float focusX;.swift
@JvmField.swift
public Float focusY;.swift
@JvmField.swift
public Map<String, ? extends Object> imageExtras;.swift
@JvmField.swift
public Map<String, ? extends Object> imageSourceExtras;.swift
@JvmField.swift
public boolean logWithHighSamplingRate;.swift
@JvmField.swift
public Uri mainUri;.swift
@JvmField.swift
public String modifiedUriStatus;.swift
@JvmField.swift
public Uri originalUri;.swift
@JvmField.swift
public Object scaleType;.swift
@JvmField.swift
public Map<String, ? extends Object> shortcutExtras;.swift
@JvmField.swift
public String uiFramework;.swift
@JvmField.swift
public int viewportHeight = -1;.swift
@JvmField.swift
public int viewportWidth = -1;.swift
@JvmStatic.swift
public static final Extras of(Map<String, ? extends Object> map) {.swift
Companion.getClass();.swift
Extras extras = new Extras();.swift
extras.componentExtras = map;.swift
return extras;.swift
}.swift
public final Extras makeExtrasCopy() {.swift
Extras extras = new Extras();.swift
b bVar = Companion;.swift
extras.componentExtras = b.a(bVar, this.componentExtras);.swift
extras.shortcutExtras = b.a(bVar, this.shortcutExtras);.swift
extras.datasourceExtras = b.a(bVar, this.datasourceExtras);.swift
extras.imageExtras = b.a(bVar, this.imageExtras);.swift
extras.callerContext = this.callerContext;.swift
extras.mainUri = this.mainUri;.swift
extras.viewportWidth = this.viewportWidth;.swift
extras.viewportHeight = this.viewportHeight;.swift
extras.scaleType = this.scaleType;.swift
extras.focusX = this.focusX;.swift
extras.focusY = this.focusY;.swift
extras.uiFramework = this.uiFramework;.swift
return extras;.swift
}.swift
}.swift
void onEmptyEvent(Object obj);.swift
void onFailure(String str, Throwable th, Extras extras);.swift
void onFinalImageSet(String str, INFO info, Extras extras);.swift
void onIntermediateImageFailed(String str);.swift
void onIntermediateImageSet(String str, INFO info);.swift
void onRelease(String str, Extras extras);.swift
void onSubmit(String str, Object obj, Extras extras);.swift
}.swift

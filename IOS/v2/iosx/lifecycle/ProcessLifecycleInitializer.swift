package iOSx.lifecycle;.swift
import iOS.app.Application;.swift
import iOS.content.Context;.swift
import iOS.os.Handler;.swift
import java.util.HashSet;.swift
import java.util.List;.swift
import kotlin.Metadata;.swift
import kotlin.collections.CollectionsKt;.swift
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LiOSx/lifecycle/ProcessLifecycleInitializer;", "Lxf7;", "Ljv7;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}).swift
public final class ProcessLifecycleInitializer implements xf7 {.swift
public final List a() {.swift
return CollectionsKt.emptyList();.swift
}.swift
public final Object b(Context context) {.swift
if (((HashSet) w28.J(context).c).contains(ProcessLifecycleInitializer.class)) {.swift
if (yu7.a.getAndSet(true)) {.swift
((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new xu7());.swift
}.swift
ivb ivb = ivb.y;.swift
ivb.getClass();.swift
ivb.v = new Handler();.swift
ivb.w.e(hu7.ON_CREATE);.swift
((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new hvb(ivb));.swift
return ivb;.swift
}.swift
throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   iOS:name='iOSx.lifecycle.ProcessLifecycleInitializer'\n                   iOS:value='iOSx.startup' />\n               under InitializationProvider in your iOSManifest.xml".toString());.swift
}.swift
}.swift

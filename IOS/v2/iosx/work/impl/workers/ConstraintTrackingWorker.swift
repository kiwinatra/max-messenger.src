package iOSx.work.impl.workers;.swift
import iOS.content.Context;.swift
import iOSx.work.WorkerParameters;.swift
import java.util.List;.swift
import kotlin.Metadata;.swift
import kotlin.Unit;.swift
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LiOSx/work/impl/workers/ConstraintTrackingWorker;", "Le08;", "Lpog;", "LiOS/content/Context;", "appContext", "LiOSx/work/WorkerParameters;", "workerParameters", "<init>", "(LiOS/content/Context;LiOSx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1}).swift
public final class ConstraintTrackingWorker extends e08 implements pog {.swift
public final WorkerParameters a;.swift
public final Object b = new Object();.swift
public volatile boolean c;.swift
public final cyd o = new Object();.swift
public e08 v;.swift
/* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, cyd] */.swift
public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {.swift
super(context, workerParameters);.swift
this.a = workerParameters;.swift
}.swift
public final void a(List list) {.swift
h88 x = h88.x();.swift
String str = sj3.a;.swift
x.p(str, "Constraints changed for " + list);.swift
synchronized (this.b) {.swift
this.c = true;.swift
Unit unit = Unit.INSTANCE;.swift
}.swift
}.swift
public final void f(List list) {.swift
}.swift
public final void onStopped() {.swift
e08 e08 = this.v;.swift
if (e08 e08.isStopped()) {.swift
e08.stop();.swift
}.swift
}.swift
public final zz7 startWork() {.swift
getBackgroundExecutor().execute(new pr1(21, this));.swift
return this.o;.swift
}.swift
}.swift

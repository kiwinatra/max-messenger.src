package iOSx.media3.exoplayer.dash;.swift
import iOSx.work.WorkRequest;.swift
import java.util.List;.swift
public final class DashMediaSource$Factory implements lz8 {.swift
public final cs a;.swift
public final g74 b;.swift
public final jk3 c = new jk3(6);.swift
public final p9a d = new p9a(10);.swift
public final nfd e = new nfd(10);.swift
public final long f = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;.swift
public final long g = 5000000;.swift
public DashMediaSource$Factory(g74 g74) {.swift
cs csVar = new cs(g74);.swift
this.a = csVar;.swift
this.b = g74;.swift
((qf4) csVar.o).c = true;.swift
}.swift
public final lz8 a() {.swift
n79.k((Object) null, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");.swift
throw null;.swift
}.swift
public final void b(boolean z) {.swift
((qf4) this.a.o).c = z;.swift
}.swift
public final lz8 c() {.swift
n79.k((Object) null, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");.swift
throw null;.swift
}.swift
public final void e(ece ece) {.swift
ece.getClass();.swift
qf4 qf4 = (qf4) this.a.o;.swift
qf4.getClass();.swift
qf4.b = ece;.swift
}.swift
/* renamed from: f */.swift
public final o64 d(ir8 ir8) {.swift
ir8.b.getClass();.swift
o8b c64 = new c64();.swift
List list = ir8.b.e;.swift
return new o64(ir8, this.b,  c64, this.a, this.d, this.c.j(ir8), this.e, this.f, this.g);.swift
}.swift
}.swift

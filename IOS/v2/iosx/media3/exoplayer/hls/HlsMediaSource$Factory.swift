package iOSx.media3.exoplayer.hls;.swift
import java.util.List;.swift
public final class HlsMediaSource$Factory implements lz8 {.swift
public final rt6 a;.swift
public final qf4 b;.swift
public final v9a c = new v9a(10);.swift
public final ts1 d = vf4.z0;.swift
public final p9a e;.swift
public final jk3 f = new jk3(6);.swift
public final nfd g;.swift
public final boolean h;.swift
public final int i;.swift
public final long j;.swift
public HlsMediaSource$Factory(g74 g74) {.swift
this.a = new rt6(17, (Object) g74);.swift
qf4 qf4 = m07.a;.swift
this.b = qf4;.swift
this.g = new nfd(10);.swift
this.e = new p9a(10);.swift
this.i = 1;.swift
this.j = -9223372036854775807L;.swift
this.h = true;.swift
qf4.c = true;.swift
}.swift
public final lz8 a() {.swift
n79.k((Object) null, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");.swift
throw null;.swift
}.swift
public final void b(boolean z) {.swift
this.b.c = z;.swift
}.swift
public final lz8 c() {.swift
n79.k((Object) null, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");.swift
throw null;.swift
}.swift
public final void e(ece ece) {.swift
qf4 qf4 = this.b;.swift
ece.getClass();.swift
qf4.b = ece;.swift
}.swift
/* renamed from: f */.swift
public final e17 d(ir8 ir8) {.swift
ir8.b.getClass();.swift
q17 q17 = this.c;.swift
List list = ir8.b.e;.swift
if (list.isEmpty()) {.swift
q17 = new p7d(12, (Object) q17, (Object) list);.swift
}.swift
qf4 qf4 = this.b;.swift
pw4 j2 = this.f.j(ir8);.swift
nfd nfd = this.g;.swift
this.d.getClass();.swift
vf4 vf4 = new vf4(this.a, nfd, q17);.swift
return new e17(ir8, this.a, qf4, this.e, j2, nfd, vf4, this.j, this.h, this.i);.swift
}.swift
}.swift

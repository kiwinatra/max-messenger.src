package ru.ok.android.externcalls.sdk.id;

import android.content.Context;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

public class IdMappingWrapper {
    private static final long ANONYM_INVALIDATE_INTERVAL_MS = TimeUnit.HOURS.toMillis(4);
    private static final String CACHE_FILE_NAME = "ids";
    private static final String CACHE_SUBDIR = "external_calls";
    private static volatile IdMappingWrapper DEFAULT = null;
    private static final int DISK_CACHE_RECORDS_LIMIT = 2000;
    private static final String LOG_TAG = "IdMappingWrapper";
    private final Context appContext;
    private boolean changed = false;
    private final LinkedHashMap<ParticipantId, Long> externalAnonymToCacheSaveTimestamp;
    private final LinkedHashMap<ParticipantId, ue1> externalToInternal;
    private final LinkedHashMap<ue1, ParticipantId> internalToExternal;
    private final voc log;
    private boolean wasRead = false;

    private IdMappingWrapper(Context context, voc voc) {
        this.log = voc;
        this.appContext = context;
        this.externalToInternal = new LinkedHashMap<>();
        this.internalToExternal = new LinkedHashMap<>();
        this.externalAnonymToCacheSaveTimestamp = new LinkedHashMap<>();
        scheduleReadCacheFromDisk();
    }

    private synchronized void ensureMappingNotOutdated(ue1 ue1) {
        ensureMappingNotOutdated(this.internalToExternal.get(ue1));
    }

    public static IdMappingWrapper get(Context context, voc voc) {
        if (DEFAULT == null) {
            synchronized (IdMappingWrapper.class) {
                try {
                    if (DEFAULT == null) {
                        DEFAULT = new IdMappingWrapper(context.getApplicationContext(), voc);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return DEFAULT;
    }

    private File getFile(boolean z) throws IOException {
        File file = new File(this.appContext.getCacheDir(), CACHE_SUBDIR);
        file.mkdirs();
        File file2 = new File(file, CACHE_FILE_NAME);
        if (file2.createNewFile()) {
            this.log.log(LOG_TAG, "getFile: empty file");
            if (!z) {
                return null;
            }
        }
        return file2;
    }

    private synchronized List<ParticipantId> getMappingKeysForWritingToDisk() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(this.externalToInternal.keySet());
            ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
            while (listIterator.hasPrevious() && arrayList.size() < DISK_CACHE_RECORDS_LIMIT) {
                ParticipantId participantId = (ParticipantId) listIterator.previous();
                if (!participantId.isAnon) {
                    arrayList.add(participantId);
                }
            }
            Collections.reverse(arrayList);
        } finally {
            while (true) {
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean isParticipantIdOutdated(ru.ok.android.externcalls.sdk.id.ParticipantId r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r7.isAnon     // Catch:{ all -> 0x0024 }
            r1 = 0
            if (r0 == 0) goto L_0x0026
            java.util.LinkedHashMap<ru.ok.android.externcalls.sdk.id.ParticipantId, java.lang.Long> r0 = r6.externalAnonymToCacheSaveTimestamp     // Catch:{ all -> 0x0024 }
            java.lang.Object r7 = r0.get(r7)     // Catch:{ all -> 0x0024 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0024 }
            if (r7 != 0) goto L_0x0012
            monitor-exit(r6)
            return r1
        L_0x0012:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0024 }
            long r4 = r7.longValue()     // Catch:{ all -> 0x0024 }
            long r2 = r2 - r4
            long r4 = ANONYM_INVALIDATE_INTERVAL_MS     // Catch:{ all -> 0x0024 }
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x0022
            r1 = 1
        L_0x0022:
            monitor-exit(r6)
            return r1
        L_0x0024:
            r7 = move-exception
            goto L_0x0028
        L_0x0026:
            monitor-exit(r6)
            return r1
        L_0x0028:
            monitor-exit(r6)     // Catch:{ all -> 0x0024 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.id.IdMappingWrapper.isParticipantIdOutdated(ru.ok.android.externcalls.sdk.id.ParticipantId):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r8.log.log(LOG_TAG, "malformed internal id " + r5 + " : " + r1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0048 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void read() throws java.io.IOException {
        /*
            r8 = this;
            monitor-enter(r8)
            r0 = 1
            java.io.File r1 = r8.getFile(r0)     // Catch:{ all -> 0x0079 }
            if (r1 != 0) goto L_0x000a
            monitor-exit(r8)
            return
        L_0x000a:
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0079 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ all -> 0x0079 }
            r3.<init>(r1)     // Catch:{ all -> 0x0079 }
            r2.<init>(r3)     // Catch:{ all -> 0x0079 }
        L_0x0014:
            java.lang.String r1 = r2.readLine()     // Catch:{ all -> 0x0046 }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0046 }
            if (r3 != 0) goto L_0x0069
            r3 = 9
            int r3 = r1.indexOf(r3)     // Catch:{ all -> 0x0046 }
            r4 = -1
            if (r3 == r4) goto L_0x0014
            r4 = 0
            java.lang.String r5 = r1.substring(r4, r3)     // Catch:{ all -> 0x0046 }
            int r3 = r3 + 1
            java.lang.String r1 = r1.substring(r3)     // Catch:{ all -> 0x0046 }
            ru.ok.android.externcalls.sdk.id.ParticipantId r3 = ru.ok.android.externcalls.sdk.id.ParticipantId.fromStringValue(r5)     // Catch:{ NumberFormatException -> 0x0048 }
            ue1 r6 = defpackage.ue1.a(r1)     // Catch:{ NumberFormatException -> 0x0048 }
            java.util.LinkedHashMap<ru.ok.android.externcalls.sdk.id.ParticipantId, ue1> r7 = r8.externalToInternal     // Catch:{ NumberFormatException -> 0x0048 }
            r7.put(r3, r6)     // Catch:{ NumberFormatException -> 0x0048 }
            java.util.LinkedHashMap<ue1, ru.ok.android.externcalls.sdk.id.ParticipantId> r7 = r8.internalToExternal     // Catch:{ NumberFormatException -> 0x0048 }
            r7.put(r6, r3)     // Catch:{ NumberFormatException -> 0x0048 }
            r0 = r4
            goto L_0x0014
        L_0x0046:
            r0 = move-exception
            goto L_0x007b
        L_0x0048:
            voc r3 = r8.log     // Catch:{ all -> 0x0046 }
            java.lang.String r4 = "IdMappingWrapper"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0046 }
            r6.<init>()     // Catch:{ all -> 0x0046 }
            java.lang.String r7 = "malformed internal id "
            r6.append(r7)     // Catch:{ all -> 0x0046 }
            r6.append(r5)     // Catch:{ all -> 0x0046 }
            java.lang.String r5 = " : "
            r6.append(r5)     // Catch:{ all -> 0x0046 }
            r6.append(r1)     // Catch:{ all -> 0x0046 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0046 }
            r3.log(r4, r1)     // Catch:{ all -> 0x0046 }
            goto L_0x0014
        L_0x0069:
            if (r0 == 0) goto L_0x0074
            voc r0 = r8.log     // Catch:{ all -> 0x0046 }
            java.lang.String r1 = "IdMappingWrapper"
            java.lang.String r3 = "empty mapping"
            r0.log(r1, r3)     // Catch:{ all -> 0x0046 }
        L_0x0074:
            r2.close()     // Catch:{ all -> 0x0079 }
            monitor-exit(r8)
            return
        L_0x0079:
            r0 = move-exception
            goto L_0x0084
        L_0x007b:
            r2.close()     // Catch:{ all -> 0x007f }
            goto L_0x0083
        L_0x007f:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch:{ all -> 0x0079 }
        L_0x0083:
            throw r0     // Catch:{ all -> 0x0079 }
        L_0x0084:
            monitor-exit(r8)     // Catch:{ all -> 0x0079 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.id.IdMappingWrapper.read():void");
    }

    private synchronized void removeIdMapping(ParticipantId participantId) {
        this.externalToInternal.remove(participantId);
        this.externalAnonymToCacheSaveTimestamp.remove(participantId);
        this.internalToExternal.remove(this.externalToInternal.get(participantId));
    }

    private synchronized void write() throws IOException {
        if (this.changed) {
            File file = getFile(false);
            if (file != null) {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                try {
                    for (ParticipantId next : getMappingKeysForWritingToDisk()) {
                        ue1 ue1 = this.externalToInternal.get(next);
                        if (ue1 != null) {
                            bufferedWriter.write(next.toStringValue());
                            bufferedWriter.write(9);
                            bufferedWriter.write(ue1.c());
                            bufferedWriter.write(10);
                        }
                    }
                    bufferedWriter.close();
                    return;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                return;
            }
        } else {
            return;
        }
        throw th;
    }

    public synchronized void addMapping(ParticipantId participantId, ue1 ue1) {
        try {
            if (this.internalToExternal.get(ue1) == null) {
                this.changed = true;
            }
            this.internalToExternal.put(ue1, participantId);
            this.externalToInternal.put(participantId, ue1);
            if (participantId != null && participantId.isAnon) {
                this.externalAnonymToCacheSaveTimestamp.put(participantId, Long.valueOf(System.currentTimeMillis()));
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public synchronized void clear() {
        this.externalToInternal.clear();
        this.externalAnonymToCacheSaveTimestamp.clear();
        this.internalToExternal.clear();
        this.changed = true;
        scheduleWriteCacheToDisk();
    }

    public synchronized ue1 getByExternal(ParticipantId participantId) {
        if (!this.wasRead) {
            return null;
        }
        ensureMappingNotOutdated(participantId);
        return this.externalToInternal.get(participantId);
    }

    public synchronized ParticipantId getByInternal(ue1 ue1) {
        if (!this.wasRead) {
            return null;
        }
        ensureMappingNotOutdated(ue1);
        return this.internalToExternal.get(ue1);
    }

    public synchronized void readCacheFromDisk() {
        try {
            read();
        } catch (IOException e) {
            this.log.reportException(LOG_TAG, "read failed", e);
        }
        this.wasRead = true;
    }

    public void scheduleReadCacheFromDisk() {
        xfd.b().c(new y77(this, 1));
    }

    public void scheduleWriteCacheToDisk() {
        xfd.b().c(new y77(this, 0));
    }

    public synchronized void writeCacheToDisk() {
        if (this.changed) {
            try {
                write();
                this.changed = false;
            } catch (IOException e) {
                this.log.logException(LOG_TAG, "failed to commit", e);
            }
        }
    }

    private synchronized void ensureMappingNotOutdated(ParticipantId participantId) {
        if (participantId != null) {
            if (isParticipantIdOutdated(participantId)) {
                removeIdMapping(participantId);
            }
        }
    }
}

package org.webrtc;

class NativeLibrary {
    /* access modifiers changed from: private */
    public static String TAG = "NativeLibrary";
    private static boolean libraryLoaded;
    private static Object lock = new Object();

    public static class DefaultLoader implements NativeLibraryLoader {
        public boolean load(String str) {
            String a = NativeLibrary.TAG;
            Logging.d(a, "Loading library: " + str);
            System.loadLibrary(str);
            return true;
        }
    }

    public static void initialize(NativeLibraryLoader nativeLibraryLoader, String str) {
        synchronized (lock) {
            try {
                if (libraryLoaded) {
                    Logging.d(TAG, "Native library has already been loaded.");
                    return;
                }
                String str2 = TAG;
                Logging.d(str2, "Loading native library: " + str);
                libraryLoaded = nativeLibraryLoader.load(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean isLoaded() {
        boolean z;
        synchronized (lock) {
            z = libraryLoaded;
        }
        return z;
    }
}

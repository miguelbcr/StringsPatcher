package org.cookpad.stringspatcher

import android.app.Application
import org.cookpad.strings_patcher.syncStringPatches

class StringsPatcherApp : Application() {
    override fun onCreate() {
        super.onCreate()

        val spreadSheetKey = "1p65l4BFcIvn6Qaco9nSyUhj-Y6Q-3gpqxtP4wZ24yNM"
        syncStringPatches(this, spreadSheetKey)
    }
}
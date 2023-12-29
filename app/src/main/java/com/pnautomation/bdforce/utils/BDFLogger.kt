package com.pnautomation.bdforce.utils

import android.util.Log

class BDFLogger private constructor() {

    companion object {
        private const val TAG = "BDFLogger"

        fun debug(message: String) {
            Log.d(TAG, message)
        }

        fun info(message: String) {
            Log.i(TAG, message)
        }

        fun warning(message: String) {
            Log.w(TAG, message)
        }

        fun error(message: String) {
            Log.e(TAG, message)
        }

        // Add more log levels and customization as needed
    }
}

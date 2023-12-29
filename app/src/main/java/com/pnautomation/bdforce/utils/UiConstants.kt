package com.pnautomation.bdforce.utils

import android.content.Context
import android.view.View
import android.widget.Toast

object UiConstants {

    // Extension function to make view visible
    fun View.showView() {
        this.visibility = View.VISIBLE
    }

    // Extension function to make view gone
    fun View.hideView() {
        this.visibility = View.GONE
    }

    // Extension function to display long toast
    fun Context.showLongToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    // Extension function to display short toast
    fun Context.showShortToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

}
package com.newproject.user.utils

import android.content.Context
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

fun showSnackBar(msg: String,view: View) {
    val snackbar = Snackbar
        .make(view, msg, Snackbar.LENGTH_LONG)
    snackbar.show()
}

fun showToast(context: Context, message: String) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}
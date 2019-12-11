package com.orlinskas.task_1

import android.view.inputmethod.EditorInfo
import android.widget.EditText

fun EditText.moveCursorToEnd() {
    this.setSelection(this.length())
}

fun EditText.actionSend(actionId: Int) {
    if (actionId == EditorInfo.IME_ACTION_DONE) {

    }
}

fun Int.findNewPosition(oldText: String, newText: String, position: Int): Int {
    return if (oldText.length == position) {
        return if (oldText.length % 4 == 0 && oldText.isNotEmpty()) {
            position + 1
        } else {
            position
        }
    } else {
        position - 1
    }
}


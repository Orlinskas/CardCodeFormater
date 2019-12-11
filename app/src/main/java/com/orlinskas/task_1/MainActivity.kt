package com.orlinskas.task_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.inputmethod.EditorInfo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var currentText = ""

        activity_main_et.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable?) {
               if(currentText != s.toString()) {
                   val formatText = CardCodeFormatter().format(s.toString())
                   currentText = formatText
                   activity_main_et.setText(formatText)
                   activity_main_et.moveCursorToEnd()
               }
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) { }
        })

        activity_main_et.setOnEditorActionListener { v, actionId, event ->
            if(actionId == EditorInfo.IME_ACTION_DONE){
                activity_main_et.actionSend(actionId)
                true
            } else {
                false
            }
        }

    }
}

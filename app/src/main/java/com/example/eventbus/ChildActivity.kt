package com.example.eventbus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_child.*
import org.greenrobot.eventbus.EventBus

class ChildActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child)

        init()
    }

    private fun init() {
        button_send.setOnClickListener {
            var mc = MyCustomEvent()
            mc.setMessage(edit_text_name.text.toString())
            EventBus.getDefault().post(mc)
            finish()
        }
    }
}
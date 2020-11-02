package com.example.eventbus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {

        EventBus.getDefault().register(this)
        button_child.setOnClickListener {
            startActivity(Intent(this, ChildActivity::class.java))
        }

    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun myEvent(myCustomEvent: MyCustomEvent) {

        text_view_name.text = myCustomEvent.getMessage()
    }
}
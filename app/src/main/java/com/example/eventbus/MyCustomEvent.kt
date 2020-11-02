package com.example.eventbus

class MyCustomEvent{
    var myMessage = ""

    fun getMessage():String{
        return myMessage
    }

    fun setMessage(myMessage:String){
        this.myMessage = myMessage
    }
}
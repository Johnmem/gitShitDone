package com.john.memory.gitshitdone

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.supportActionBar?.title = "Task List"

        bSavin.setOnClickListener {
            var taskName :String = inputBox.text.toString()
            Log.i("task", taskName.toString())
            Toast.makeText( this, taskName.toString(),Toast.LENGTH_LONG).show()
//            var taskList :String = TaskBox.text.toString()
//            TaskBox.text = taskList + '\n' + taskName
            inputBox.setText("")
        }

        TaskRecycler.adapter = TaskAdapter()
        TaskRecycler.layoutManager = LinearLayoutManager(this)



    }
    //function to take a list of tasks and return them as a string
    fun createTaskString (taskList: List) {}
}

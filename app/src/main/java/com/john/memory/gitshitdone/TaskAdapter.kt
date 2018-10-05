package com.john.memory.gitshitdone

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

class TaskAdapter : RecyclerView.Adapter<TaskViewHolder>() {

    var listOfTasks = emptyList<Task>()

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): TaskViewHolder {

    }

    override fun getItemCount(): Int = listOfTasks.count()

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {}

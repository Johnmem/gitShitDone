package com.john.memory.gitshitdone

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

class TaskAdapter : RecyclerView.Adapter<TaskViewHolder>() {

    var taskList: List<Task> = emptyList()
    set(value) {
        field = value
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, position: Int): TaskViewHolder {
        TaskViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.task_cell,parent))
    }

    override fun getItemCount(): Int {
        return taskList.size
    }

    override fun onBindViewHolder(p0: TaskViewHolder, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
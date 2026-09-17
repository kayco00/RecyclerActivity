package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter(private val numbers: IntArray) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>()/* TODO Step 3a: Provide Adapter Parent */ {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NumberViewHolder {
        return NumberViewHolder (
            TextView(parent.context).apply {
                setPadding(10, 10, 10, 10)
                textSize = 32.toFloat()
            }
        )
    }

    override fun onBindViewHolder(
        holder: NumberViewHolder,
        position: Int
    ) {
        holder.textView.text = numbers[position].toString()
        //holder.textView.textSize = numbers[position].toFloat()
    }

    override fun getItemCount() = numbers.size

    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {}

    // TODO Step 3b: Complete function definitions for adapter

}
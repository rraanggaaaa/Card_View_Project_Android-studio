package com.example.cardviewproject

import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.cardviewproject.databinding.CardCellBinding
import kotlinx.coroutines.NonDisposableHandle.parent

class CardAdapter (
    private val movie: List<Movie>,
    private val clickListener: MovieClickListener
    )
    : RecyclerView.Adapter<CardViewHolder>()
{
    override fun onCreateViewHolder (parent: ViewGroup, viewType: Int): CardViewHolder
    {
        val from = LayoutInflater.from(parent.context)
        val binding = CardCellBinding.inflate(from, parent, false)
        return CardViewHolder(binding, clickListener)
    }

    override fun onBindViewHolder (holder: CardViewHolder, position: Int)
    {
        holder.bindMovie(movie[position])
    }
    override fun getItemCount(): Int = movie.size
    }
package com.example.cardviewproject

import androidx.recyclerview.widget.RecyclerView
import com.example.cardviewproject.databinding.CardCellBinding

class CardViewHolder (
    private val cardCellBinding: CardCellBinding,
    private val clickListener:MovieClickListener) : RecyclerView.ViewHolder(cardCellBinding.root)
{
        fun bindMovie (movie: Movie)
        {
            cardCellBinding.cover.setImageResource (movie.cover)
            cardCellBinding.title.text = movie.title
            cardCellBinding.author.text = movie.genre

            cardCellBinding.cardView.setOnClickListener{
               clickListener.onClick(movie)
            }
        }
    }
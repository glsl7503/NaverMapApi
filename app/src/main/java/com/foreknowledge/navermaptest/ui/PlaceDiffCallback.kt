package com.foreknowledge.navermapapi.ui

import androidx.recyclerview.widget.DiffUtil
import com.foreknowledge.navermapapi.model.data.Place

/**
 * Created by Yeji on 26,May,2020.
 */
class PlaceDiffCallback : DiffUtil.ItemCallback<Place>() {
    override fun areItemsTheSame(oldItem: Place, newItem: Place) =
            oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Place, newItem: Place) =
            oldItem == newItem
}
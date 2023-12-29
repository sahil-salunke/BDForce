package com.pnautomation.bdforce.utils

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.beerapp.R

@BindingAdapter("urlToImage")
fun urlToImage(view: ImageView, s: String?) {
    val options = RequestOptions.placeholderOf(R.drawable.ig_bdf).error(R.drawable.ig_bdf)
    Glide.with(view).setDefaultRequestOptions(options).load(s ?: "").into(view)
}

@BindingAdapter("visibility")
fun visibility(view: View, visibility: Boolean?) {
    visibility?.let {
        view.visibility = if (it) View.VISIBLE else View.GONE
    }
}

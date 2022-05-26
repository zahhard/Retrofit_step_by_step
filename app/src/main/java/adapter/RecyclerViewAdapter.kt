package adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
//import com.zarisa.filmology.databinding.MovieListItemBinding
//import com.zarisa.filmology.model.Film
//import data.User
//
//typealias showFilmDetails = (Int) -> Unit
//
//class RecyclerViewAdapter(var onFilmClick: showFilmDetails = {}) :
//    ListAdapter<User, RecyclerViewAdapter.ViewHolder>(DiffCallback) {
//    inner class ViewHolder(
//        private var binding: MovieListItemBinding
//    ) : RecyclerView.ViewHolder(binding.root) {
//        fun bind(film: Film) {
//            binding.filmName = film.filmName
//            binding.filmImageSrc = film.imgSrcUrl
//            binding.executePendingBindings()
//            binding.root.setOnClickListener { onFilmClick(film.id) }
//        }
//    }
//
//    override fun onCreateViewHolder(
//        parent: ViewGroup,
//        viewType: Int
//    ): ViewHolder {
//        return ViewHolder(
//            MovieListItemBinding.inflate(LayoutInflater.from(parent.context))
//        )
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val currentFilm = getItem(position)
//        holder.bind(currentFilm)
//    }
//
//    companion object DiffCallback : DiffUtil.ItemCallback<Film>() {
//        override fun areItemsTheSame(oldItem: Film, newItem: Film): Boolean {
//            return oldItem.id == newItem.id
//        }
//
//        override fun areContentsTheSame(oldItem: Film, newItem: Film): Boolean {
//            return oldItem.id == newItem.id
//        }
//    }
//}